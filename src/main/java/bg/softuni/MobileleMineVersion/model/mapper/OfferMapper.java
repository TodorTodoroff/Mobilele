package bg.softuni.MobileleMineVersion.model.mapper;

import bg.softuni.MobileleMineVersion.model.dto.AddOfferDTO;
import bg.softuni.MobileleMineVersion.model.entities.OfferEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OfferMapper {

    OfferEntity addOfferDtoToOfferEntity(AddOfferDTO addOfferDTO);
}
