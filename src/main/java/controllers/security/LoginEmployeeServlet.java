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

        String emailEmployee = request.getParameter("email");
        String passwordEmployee = request.getParameter("password");

        EmployeeDao employeeDao = new EmployeeDao();
        List<Employee> employeeList = employeeDao.findByEmailAndPassword();

        for(Employee employee : employeeList){
            if(employee.getEmail().equals(emailEmployee) && employee.getPassword().equals("haslo")){
                response.sendRedirect("/access/register.jsp");
            }
            else if(employee.getEmail().equals(emailEmployee) && employee.getPassword().equals(passwordEmployee)){
                response.sendRedirect("/employee/employeePage.jsp");
            }
            else if(!employee.getEmail().equals(emailEmployee) || !employee.getPassword().equals(passwordEmployee)){
                RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/access/loginEmployee.jsp");
                response.getWriter().println("<font color=red align: center>Błędny login lub hasło<font>");
                requestDispatcher.include(request, response);
            }


        }



    }
}
