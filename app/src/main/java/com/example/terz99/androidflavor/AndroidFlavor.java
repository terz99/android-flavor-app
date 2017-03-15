package com.example.terz99.androidflavor;

/**
 * Created by terz99 on 3/15/17.
 */

public class AndroidFlavor {

    private String versionName;
    private String versionNumber;
    private int imageResourceId;

    public AndroidFlavor(String versionName, String versionNumber, int imageResourceId) {
        this.versionName = versionName;
        this.versionNumber = versionNumber;
        this.imageResourceId = imageResourceId;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
