package com.bitwise.login;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class ValidationFilter
 */
@WebFilter("/ValidationFilter")
public class ValidationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ValidationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		
		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("tejasvi", "tej");
		hm.put("teju", "teja");
		hm.put("surabhi", "suru");

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if(username=="" || password=="")
		{
			request.getRequestDispatcher("NullFields.jsp").forward(request, response);
		}
		else
		{
			if (hm.containsKey(username) && password.equals(hm.get(username)))
			{
				
				HttpSession session = req.getSession(true);
				req.getSession().setAttribute("user", username);
				
								
				// request.getSession().setAttribute("user", user);
				request.getRequestDispatcher("AvailableItems.jsp").forward(request,response);
				
	
			} else 
			{
		
				request.getRequestDispatcher("InvalidLoginCredentials.jsp").forward(request,response);
			
			}
		
		
		chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
