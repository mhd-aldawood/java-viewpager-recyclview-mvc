package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Config {

    @SerializedName("prduct_base_url")
    @Expose
    private String prductBaseUrl;
    @SerializedName("banner_base_url")
    @Expose
    private String bannerBaseUrl;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("vat")
    @Expose
    private Float vat;
    @SerializedName("minimum_order")
    @Expose
    private Integer minimumOrder;

    public String getPrductBaseUrl() {
        return prductBaseUrl;
    }

    public void setPrductBaseUrl(String prductBaseUrl) {
        this.prductBaseUrl = prductBaseUrl;
    }

    public String getBannerBaseUrl() {
        return bannerBaseUrl;
    }

    public void setBannerBaseUrl(String bannerBaseUrl) {
        this.bannerBaseUrl = bannerBaseUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getVat() {
        return vat;
    }

    public void setVat(Float vat) {
        this.vat = vat;
    }

    public Integer getMinimumOrder() {
        return minimumOrder;
    }

    public void setMinimumOrder(Integer minimumOrder) {
        this.minimumOrder = minimumOrder;
    }

}
