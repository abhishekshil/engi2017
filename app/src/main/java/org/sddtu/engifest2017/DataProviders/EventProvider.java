package org.sddtu.engifest2017.DataProviders;

/**
 * Created by mohitkumar on 16/01/17.
 */

public class EventProvider {

    String event,time,venue,date;

    public EventProvider(String event,String time,String venue,String date) {
        this.event = event;
        this.time = time;
        this.venue = venue;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String getEvent() {
        return event;
    }

    public String getTime() {
        return time;
    }

    public String getVenue() {
        return venue;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
