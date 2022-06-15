package bg.softuni.MobileleMineVersion.web;

import bg.softuni.MobileleMineVersion.model.dto.AddOfferDTO;
import bg.softuni.MobileleMineVersion.services.BrandService;
import bg.softuni.MobileleMineVersion.services.OfferService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String allOffers() {
        return "offers";
    }

    @GetMapping("/offers/add")
    public String addOffer(Model model) {

        if (!model.containsAttribute("offerAddModel")){
            model.addAttribute("offerAddModel", new AddOfferDTO());
        }

        model.addAttribute("brands", brandService.getAllBrands());

        return "offer-add";
    }


    @PostMapping("/offers/add")
    public String addOffer(@Valid AddOfferDTO offerAddModel,
                           BindingResult bindingResult,
                           RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {

            redirectAttributes.addFlashAttribute("offerAddModel", offerAddModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.offerAddModel", bindingResult);

            return "redirect:/offers/add";
        }

        offerService.addOffer(offerAddModel);

        return "redirect:/offers/all";
    }


}
