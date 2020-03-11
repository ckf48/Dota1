package servlet;

import jdbc.StudentHomeworkJdbc;
import model.StudentHomework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/studentHomework")
public class SelectStudentHomeworkServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<StudentHomework> list = StudentHomeworkJdbc.selectAllStudentHomework();
        req.setAttribute("list",list);
        req.getRequestDispatcher("teacher.jsp").forward(req,resp);
    }
}
