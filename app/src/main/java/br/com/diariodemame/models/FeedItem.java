package br.com.diariodemame.models;

/**
 * Created by yagoazedias on 27/05/17.
 */

public class FeedItem {
    private int id;
    private String time, image, task;

    public FeedItem() {

    }

    public FeedItem(int id, String image, String time, String task) {
        super();
        this.id = id;
        this.time = time;
        this.image = image;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return time;
    }

    public void setName(String time) {
        this.time = time;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getJob() {
        return task;
    }

    public void setJob(String task) {
        this.task = task;
    }
}
