
package com.anonbook.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/comment")
public class CommentServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // return comments by postId
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // save new comment
    }
}
