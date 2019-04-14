package org.sddtu.engifest2017.DataProviders;

/**
 * Created by mohitkumar on 08/01/17.
 */

public class EventData {

    String name;
    int image;

    public EventData(String name,int image) {
        this.setImage(image);
        this.setName(name);
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }
}
