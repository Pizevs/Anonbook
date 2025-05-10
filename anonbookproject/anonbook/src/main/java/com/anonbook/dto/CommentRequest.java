
package com.anonbook.dto;

public class CommentRequest {
    private int postId;
    private String text;

    public int getPostId() { return postId; }
    public void setPostId(int postId) { this.postId = postId; }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
}
