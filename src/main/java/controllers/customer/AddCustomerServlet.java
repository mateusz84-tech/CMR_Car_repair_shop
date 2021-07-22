package controllers.customer;

import dao.CustomerDao;
import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddCustomerServlet", value = "/addCustomer")
public class AddCustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");

        CustomerDao customerDao = new CustomerDao();
        Customer customer = new Customer(name,lastName);
        customerDao.create(customer);

    }
}
