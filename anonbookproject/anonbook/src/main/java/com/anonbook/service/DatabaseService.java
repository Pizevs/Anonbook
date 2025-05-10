
package com.anonbook.service;

import com.anonbook.model.Comment;
import com.anonbook.model.Post;

import javax.sql.DataSource;
import java.util.List;

public class DatabaseService {
    private static DatabaseService instance;
    private DataSource dataSource;

    private DatabaseService() {
        // Init datasource, Flyway migration etc.
    }

    public static synchronized DatabaseService getInstance() {
        if (instance == null) instance = new DatabaseService();
        return instance;
    }

    public List<Post> getAllPosts() { return List.of(); }
    public Post getPostById(int id) { return null; }
    public void addPost(Post post) {}
    public List<Comment> getCommentsByPostId(int postId) { return List.of(); }
    public void addComment(Comment comment) {}
}
