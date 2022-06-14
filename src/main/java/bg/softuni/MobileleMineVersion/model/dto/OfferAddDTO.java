package bg.softuni.MobileleMineVersion.model.dto;

import bg.softuni.MobileleMineVersion.model.entities.ModelEntity;
import bg.softuni.MobileleMineVersion.model.entities.enums.EngineEnum;
import bg.softuni.MobileleMineVersion.model.entities.enums.TransmissionEnum;

import java.math.BigDecimal;

public class OfferAddDTO {

    private String engine;

    private String imageUrl;

    private int mileage;

    private BigDecimal price;

    private String description;

    private String transmission;

    private int year;

    private String model;


    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
