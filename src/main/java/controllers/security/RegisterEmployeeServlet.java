package controllers.security;

import dao.EmployeeDao;
import model.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "RegisterEmployeeServlet", value = "/registerEmployee")
public class RegisterEmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        EmployeeDao setNewPassword = new EmployeeDao();
        List<Employee> employeeList = new ArrayList<>();

        
    }
}
