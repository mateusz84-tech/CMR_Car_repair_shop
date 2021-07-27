package controllers.car;

import dao.CarDao;
import model.Car;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDate;

@WebServlet(name = "AddCarServlet", value = "/addCar")
public class AddCarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        int id_customer = Integer.parseInt(request.getParameter("id_customer"));
        String model = request.getParameter("model");
        String mark = request.getParameter("mark");
        int year_of_production = Integer.parseInt(request.getParameter("year_of_production"));
        String registration_number = request.getParameter("registration_number");
        int technical_inspection_year = Integer.parseInt(request.getParameter("year"));
        int technical_inspection_month = Integer.parseInt(request.getParameter("month"));
        int technical_inspection_day = Integer.parseInt(request.getParameter("day"));

        Car car = new Car(id_customer,model,mark,year_of_production,
                registration_number,technical_inspection_year, technical_inspection_month,technical_inspection_day);

        CarDao carDao = new CarDao();
        carDao.create(car);

        response.sendRedirect("/order/addOrder.jsp");

    }
}
