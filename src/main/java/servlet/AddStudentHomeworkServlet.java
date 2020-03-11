package servlet;

import jdbc.StudentHomeworkJdbc;
import model.StudentHomework;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;

public class AddStudentHomeworkServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentHomework studentHomework = new StudentHomework();
        studentHomework.setId(Long.getLong(req.getParameter("id")));
        studentHomework.setStudentId(Long.getLong(req.getParameter("student_id")));
        studentHomework.setHomeworkId(Long.getLong(req.getParameter("homework_id")));
        studentHomework.setHomeworkTitle(req.getParameter("homework_title"));
        studentHomework.setHomeworkContent(req.getParameter("homework_content"));
        studentHomework.setCreateTime(Timestamp.valueOf(req.getParameter("create_time")));
        studentHomework.setUpdateTime(Timestamp.valueOf(req.getParameter("update_time")));

        StudentHomeworkJdbc.addStudentHomework(studentHomework);

        resp.sendRedirect("list");
    }
}
