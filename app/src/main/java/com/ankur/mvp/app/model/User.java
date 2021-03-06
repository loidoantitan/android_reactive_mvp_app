package com.ankur.mvp.app.model;

import com.google.gson.annotations.SerializedName;

/**
 * @author Ankur Jain (ankurjainips@gmail.com)
 */
public class User {
    @SerializedName("user_id")
    private long id;

    @SerializedName("display_name")
    private String name;

    @SerializedName("link")
    private String link;

    @SerializedName("profile_image")
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
