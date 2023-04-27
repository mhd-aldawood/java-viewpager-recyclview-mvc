package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("config")
    @Expose
    private Config config;
    @SerializedName("products")
    @Expose
    private List<Product> products;
    @SerializedName("banners")
    @Expose
    private List<Banner> banners;
    @SerializedName("update_app")
    @Expose
    private UpdateApp updateApp;
    @SerializedName("payment_gateway")
    @Expose
    private PaymentGateway paymentGateway;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Banner> getBanners() {
        return banners;
    }

    public void setBanners(List<Banner> banners) {
        this.banners = banners;
    }

    public UpdateApp getUpdateApp() {
        return updateApp;
    }

    public void setUpdateApp(UpdateApp updateApp) {
        this.updateApp = updateApp;
    }

    public PaymentGateway getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

}