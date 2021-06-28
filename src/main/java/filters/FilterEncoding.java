package filters;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(filterName = "FilterEncoding", urlPatterns = {"/"})
public class FilterEncoding implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        String contentType = "text/html; charset=UTF-8";
        String charsetEncoding = "utf-8";
        // ustawiam kodowanie znaków dla żądania
        request.setCharacterEncoding(charsetEncoding);
        // ustawiam typ zwracanej wartości
        response.setContentType(contentType);
        // ustawiam kodowanie dla odpowiedzi
        response.setCharacterEncoding(charsetEncoding);
        System.out.println("Poprawnie zakodowano polskie znaki");
        chain.doFilter(request, response);
    }
}
