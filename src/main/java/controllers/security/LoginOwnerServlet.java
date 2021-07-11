package controllers.security;

import dao.UserDao;
import model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "LoginOwnerServlet", value = "/loginOwner")
public class LoginOwnerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");


        UserDao userDao = new UserDao();
        List<User> ownerList = userDao.readUsers();

            for(User owner : ownerList){
                if(owner.getEmail().equals(email) && owner.getPassword().equals(password)){

                    HttpSession session = request.getSession();
                    session.setAttribute("president", ownerList);
                    // sesja do wygaśnięcia
                    session.setMaxInactiveInterval(10*60);
                    Cookie ownerName = new Cookie("owner", owner.getFirstName());
                    ownerName.setMaxAge(10*60);
                    response.addCookie(ownerName);
                    response.sendRedirect("/owner/ownerPage.jsp");
                }else {
                    RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/access/loginOwner.jsp");
                    response.getWriter().println("<font color=red align: center>Błędny login lub hasło<font>");
                    requestDispatcher.include(request, response);
                }
            }

    }
}
