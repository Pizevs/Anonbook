
package com.anonbook.model;

import java.time.LocalDateTime;
import java.util.List;

public class Post {
    private int id;
    private String text;
    private String image;
    private LocalDateTime createdAt;
    private List<Comment> comments;

    // Getters and setters
}
