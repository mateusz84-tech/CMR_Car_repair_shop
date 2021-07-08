package controllers.employee;

import dao.EmployeeDao;
import model.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddEmployeeServlet", value = "/addEmployee")
public class AddEmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        int number = Integer.parseInt(request.getParameter("phone_number"));
        String email = request.getParameter("email");
        String notes = request.getParameter("notes");
        double rate = Double.parseDouble(request.getParameter("hourly_rate"));

        Employee employee = new Employee();
        employee.setFirst_name(name);
        employee.setLast_name(surname);
        employee.setNumber_phone(number);
        employee.setEmail(email);
        employee.setNotes(notes);
        employee.setHourly_rate(rate);

        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.create(employee);

        response.sendRedirect("/owner/ownerPage.jsp");

    }
}
