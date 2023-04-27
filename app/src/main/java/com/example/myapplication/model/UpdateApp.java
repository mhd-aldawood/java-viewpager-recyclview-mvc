package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class UpdateApp {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("version_ios")
    @Expose
    private String versionIos;
    @SerializedName("auto_update")
    @Expose
    private String autoUpdate;
    @SerializedName("arabic_meesage")
    @Expose
    private String arabicMeesage;
    @SerializedName("eng_message")
    @Expose
    private String engMessage;
    @SerializedName("created_on")
    @Expose
    private String createdOn;
    @SerializedName("created_by")
    @Expose
    private String createdBy;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("version_android")
    @Expose
    private String versionAndroid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVersionIos() {
        return versionIos;
    }

    public void setVersionIos(String versionIos) {
        this.versionIos = versionIos;
    }

    public String getAutoUpdate() {
        return autoUpdate;
    }

    public void setAutoUpdate(String autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    public String getArabicMeesage() {
        return arabicMeesage;
    }

    public void setArabicMeesage(String arabicMeesage) {
        this.arabicMeesage = arabicMeesage;
    }

    public String getEngMessage() {
        return engMessage;
    }

    public void setEngMessage(String engMessage) {
        this.engMessage = engMessage;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

}
