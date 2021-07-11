package controllers.security;

import dao.EmployeeDao;
import model.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LoginEmployeeServlet", value = "/loginEmployee")
public class LoginEmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        EmployeeDao employeeDao = new EmployeeDao();
        List<Employee> employeeList = employeeDao.findAll();

        for(Employee employee : employeeList){
            // jeśli w tabeli employee nie zostało ustawione jeszcze hasło(pracownik nie ustawiła hasła)
            // to zostanie przekierowany na stronę rejestracji gdzie za pomocą metody edit z EmployeeDao
            // ustawi dla siebie hasło, wtedy zostanie przeierowany do strony logowania
            if(employee.getEmail().equals(email) && employee.getPassword() == null){
                response.sendRedirect("/access/register.jps");
            }
            if(employee.getEmail().equals(email) && employee.getPassword().equals(password)){
                response.sendRedirect("/employee/employeePage.jsp");
            }
        }
    }
}
