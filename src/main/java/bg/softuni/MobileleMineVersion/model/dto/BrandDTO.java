package bg.softuni.MobileleMineVersion.model.dto;

import java.util.ArrayList;
import java.util.List;

public class BrandDTO {

    private String name;

    private List<ModelDTO> models;


    public List<ModelDTO> getModels() {
        return models;
    }

    public void setModels(List<ModelDTO> models) {
        this.models = models;
    }

    public BrandDTO addModel(ModelDTO modelDTO) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        this.models.add(modelDTO);

        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
