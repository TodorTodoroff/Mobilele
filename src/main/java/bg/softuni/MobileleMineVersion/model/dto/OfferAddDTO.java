package bg.softuni.MobileleMineVersion.model.dto;

import bg.softuni.MobileleMineVersion.model.entities.BrandEntity;
import bg.softuni.MobileleMineVersion.model.entities.ModelEntity;
import bg.softuni.MobileleMineVersion.model.entities.enums.EngineEnum;
import bg.softuni.MobileleMineVersion.model.entities.enums.TransmissionEnum;

import javax.validation.constraints.*;
import java.math.BigDecimal;

public class OfferAddDTO {


    @NotNull
    private EngineEnum engine;

    @NotEmpty
    private String imageUrl;

    @NotNull
    private TransmissionEnum transmission;

    @Min(1900)
    @Max(2099)
    private int year;


    @NotNull
    @PositiveOrZero
    private BigDecimal price;

    @NotNull
    private BrandEntity brand;

    @NotNull
    private ModelEntity model;

    @Min(0)
    @Max(900000)
    private int mileage;

    @NotEmpty
    private String description;



    public BrandEntity getBrand() {
        return brand;
    }

    public void setBrand(BrandEntity brand) {
        this.brand = brand;
    }

    public ModelEntity getModel() {
        return model;
    }

    public void setModel(ModelEntity model) {
        this.model = model;
    }

    public EngineEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineEnum engine) {
        this.engine = engine;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public void setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
