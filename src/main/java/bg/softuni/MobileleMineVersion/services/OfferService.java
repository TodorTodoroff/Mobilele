package bg.softuni.MobileleMineVersion.services;


import bg.softuni.MobileleMineVersion.model.dto.BrandDTO;
import bg.softuni.MobileleMineVersion.model.dto.OfferAddDTO;
import bg.softuni.MobileleMineVersion.model.entities.OfferEntity;
import bg.softuni.MobileleMineVersion.repositories.OfferRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferService {

    private OfferRepository offerRepository;


    public OfferService(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }


    public List<BrandDTO> getAllBrands(){
        this.brand
    }

    public void addOffer(OfferAddDTO offerAddModel) {


    }
}
