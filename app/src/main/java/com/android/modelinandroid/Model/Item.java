package com.android.modelinandroid.Model;

/**
 * Created by AayushSharma on 10/05/17.
 */

public class Item {
    private String name;
    private String nameofpainter;
    private int thumbnail;

    public Item(String name, String nameofpainter, int thumbnail) {
        this.name = name;
        this.nameofpainter = nameofpainter;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameofpainter() {
        return nameofpainter;
    }

    public void setNameofpainter(String nameofpainter) {
        this.nameofpainter = nameofpainter;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
