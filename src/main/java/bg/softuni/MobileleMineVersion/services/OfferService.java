package bg.softuni.MobileleMineVersion.services;


import bg.softuni.MobileleMineVersion.model.dto.OfferAddDTO;
import bg.softuni.MobileleMineVersion.model.entities.OfferEntity;
import bg.softuni.MobileleMineVersion.repositories.OfferRepository;
import org.springframework.stereotype.Service;

@Service
public class OfferService {

    private OfferRepository offerRepository;


    public OfferService(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }


    public void addOffer(OfferAddDTO offerAddModel) {


    }
}
