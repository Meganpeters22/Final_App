package com.example.final_app.model;

public class TopPlacesData {
    String placeName;
    String countryName;
    String price;
    Integer imageurl;

    public Integer getImageurl() {
        return imageurl;
    }

    public void setImageurl(Integer imageurl) {
        this.imageurl = imageurl;
    }

    public TopPlacesData(String placeName, String countryName, String price, Integer imageurl) {
        this.placeName = placeName;
        this.countryName = countryName;
        this.price = price;
        this.imageurl = imageurl;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
