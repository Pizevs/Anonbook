
package com.anonbook.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/post")
public class PostServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // return all posts or single post by ID
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // save new post with image
    }
}
