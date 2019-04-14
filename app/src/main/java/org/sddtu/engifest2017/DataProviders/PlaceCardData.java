package org.sddtu.engifest2017.DataProviders;

/**
 * Created by mohitkumar on 07/01/17.
 */

public class PlaceCardData {

    String place,info;
    int src;

    public PlaceCardData(String place,String info,int src)
    {
        this.setPlace(place);
        this.setInfo(info);
        this.setSrc(src);
    }

    public String getPlace() {
        return place;
    }

    public int getSrc() {
        return src;
    }

    public String getInfo() {
        return info;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setSrc(int src) {
        this.src = src;
    }
}
