
package com.anonbook.dto;

public class PostRequest {
    private String text;
    private String image;

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
}
