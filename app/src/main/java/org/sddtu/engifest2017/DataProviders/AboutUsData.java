package org.sddtu.engifest2017.DataProviders;

import org.sddtu.engifest2017.AboutUs;

/**
 * Created by mohitkumar on 08/01/17.
 */

public class AboutUsData {

    private String name,designation,mobile;
    private int imgsrc;

    public AboutUsData(String name,String designation,String mobile,int imgsrc) {
        this.setName(name);
        this.setDesignation(designation);
        this.setMobile(mobile);
        this.setImgsrc(imgsrc);
    }

    public int getImgsrc() {
        return imgsrc;
    }
    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getMobile() {
        return mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setImgsrc(int imgsrc) {
        this.imgsrc = imgsrc;
    }
}
