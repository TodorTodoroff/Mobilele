package bg.softuni.MobileleMineVersion.model.mapper;

import bg.softuni.MobileleMineVersion.model.dto.AddOfferDTO;
import bg.softuni.MobileleMineVersion.model.dto.OfferDetailDTO;
import bg.softuni.MobileleMineVersion.model.entities.OfferEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OfferMapper {
    OfferEntity addOfferDtoToOfferEntity(AddOfferDTO addOfferDTO);

    @Mapping(source = "model.name", target = "model")
    @Mapping(source = "model.brand.name", target = "brand")
    OfferDetailDTO offerEntityToCardListingOfferDto(OfferEntity offerEntity);
}
