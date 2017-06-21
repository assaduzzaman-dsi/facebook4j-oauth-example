package facebook4j.examples.signin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.Post;
import facebook4j.ResponseList;
import facebook4j.User;
import facebook4j.auth.AccessToken;

public class PostServlet extends HttpServlet {
    private static final long serialVersionUID = 4179545353414298791L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String message = request.getParameter("message");
        Facebook facebook = (Facebook) request.getSession().getAttribute("facebook");
        
//        facebook.setOAuthAccessToken(new AccessToken("EAACEdEose0cBAFvNxLMKZCPqcoBImM7HWOpUFPGia6WPCcDQANVkVROn0ruBwSY2iQHdimelj1MXnliQiorWmzrpOJlZA1qYJ6cS6ovaotoL7h7LrMuHQjyTKyFZBMnvuMwuWjj41R7mF7Gs1K0ZAWuDxKJT1dtKlEoljnWTWZC1O2y1rD4afZCJep05XZA0KQZD"));
        
        Object users;
        //14040792966_10154552824267967
        try {
        	users = facebook.get("Wunderman");//getStatuses();//getFeed("Coca-Cola");
//        	users =  facebook.getPageInsights("405866319796065");
        } catch (FacebookException e) {
            throw new ServletException(e);
        }
        response.sendRedirect(request.getContextPath()+ "/");
    }
    
}
