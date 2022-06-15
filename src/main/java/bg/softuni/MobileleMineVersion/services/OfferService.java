package bg.softuni.MobileleMineVersion.services;


import bg.softuni.MobileleMineVersion.model.dto.BrandDTO;
import bg.softuni.MobileleMineVersion.model.dto.OfferAddDTO;
import bg.softuni.MobileleMineVersion.repositories.OfferRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferService {

    private OfferRepository offerRepository;
    private BrandService brandService;


    public OfferService(OfferRepository offerRepository, BrandService brandService) {
        this.offerRepository = offerRepository;
        this.brandService = brandService;
    }


    public List<BrandDTO> getAllBrands() {
        return this.brandService.getAllBrands();
    }

    public void addOffer(OfferAddDTO offerAddModel) {


    }
}
