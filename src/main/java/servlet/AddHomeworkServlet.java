package servlet;

import jdbc.HomeworkJdbc;
import model.Homework;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;

public class AddHomeworkServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Homework homework = new Homework();
        homework.setId(Long.getLong(req.getParameter("id")));
        homework.setTitle(req.getParameter("title"));
        homework.setContent(req.getParameter("content"));
        homework.setCreateTime(Timestamp.valueOf(req.getParameter("create_time")));
        homework.setUpdateTime(Timestamp.valueOf(req.getParameter("update_time")));
        HomeworkJdbc.addHomework(homework);
        resp.sendRedirect("list");
    }
}
