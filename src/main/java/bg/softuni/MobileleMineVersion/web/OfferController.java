package bg.softuni.MobileleMineVersion.web;

import bg.softuni.MobileleMineVersion.model.dto.AddOfferDTO;
import bg.softuni.MobileleMineVersion.model.entities.OfferEntity;
import bg.softuni.MobileleMineVersion.services.BrandService;
import bg.softuni.MobileleMineVersion.services.OfferService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class OfferController {

    private final OfferService offerService;
    private final BrandService brandService;

    public OfferController(OfferService offerService, BrandService brandService) {
        this.offerService = offerService;
        this.brandService = brandService;
    }


    @GetMapping("/offers/all")
    public String allOffers(
            Model model,
            @PageableDefault(
                    sort = "price",
                    direction = Sort.Direction.ASC,
                    page = 0,
                    size = 5) Pageable pageable) {


        model.addAttribute("offers", this.offerService.getAllOffers(pageable));

        return "offers";
    }


    @GetMapping("/offers/details")
    public String offerDetails() {
        return "details";
    }


    @GetMapping("/offers/add")
    public String addOffer(Model model) {

        if (!model.containsAttribute("offerAddModel")) {
            model.addAttribute("offerAddModel", new AddOfferDTO());
        }

        model.addAttribute("brands", brandService.getAllBrands());

        return "offer-add";
    }


    @PostMapping("/offers/add")
    public String addOffer(@Valid AddOfferDTO offerAddModel,
                           BindingResult bindingResult,
                           RedirectAttributes redirectAttributes,
                           @AuthenticationPrincipal UserDetails userDetails) {

        if (bindingResult.hasErrors()) {

            redirectAttributes.addFlashAttribute("offerAddModel", offerAddModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.offerAddModel", bindingResult);

            return "redirect:/offers/add";
        }

        offerService.addOffer(offerAddModel, userDetails);

        return "redirect:/offers/all";
    }


    @GetMapping("/offers/{id}/details")
    public String getOfferDetail(@PathVariable("id") Long id) {

        return "details";
    }


}
