package bg.softuni.MobileleMineVersion.services;


import bg.softuni.MobileleMineVersion.model.dto.BrandDTO;
import bg.softuni.MobileleMineVersion.model.dto.ModelDTO;
import bg.softuni.MobileleMineVersion.model.entities.BrandEntity;
import bg.softuni.MobileleMineVersion.model.entities.ModelEntity;
import bg.softuni.MobileleMineVersion.repositories.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BrandService {

    private BrandRepository brandRepository;


    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public List<BrandDTO> getAllBrands() {

        return this.brandRepository
                .findAll()
                .stream()
                .map(this::map)
                .collect(Collectors.toList());
    }


    public BrandDTO map(BrandEntity brandEntity) {

        List<ModelDTO> modelDTOS = brandEntity
                .getModels()
                .stream()
                .map(this::mapModels)
                .collect(Collectors.toList());

        BrandDTO brandDTO = new BrandDTO();
        brandDTO.setName(brandEntity.getName());
        brandDTO.setModels(modelDTOS);

        return brandDTO;

    }

    private ModelDTO mapModels(ModelEntity modelEntity) {

        ModelDTO modelDTO = new ModelDTO();

        modelDTO.setId(modelEntity.getId());
        modelDTO.setName(modelEntity.getName());

        return modelDTO;
    }


}
