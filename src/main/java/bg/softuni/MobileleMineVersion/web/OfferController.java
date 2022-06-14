package bg.softuni.MobileleMineVersion.web;

import bg.softuni.MobileleMineVersion.services.OfferService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OfferController {

    private OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }


    @GetMapping("/offers/all")
    public String allOffers() {
        return "offers";
    }

    @GetMapping("/offers/add")
    public String addOffer() {
        return "offer-add";
    }


}
