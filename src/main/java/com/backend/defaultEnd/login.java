package main.java.com.backend.defaultEnd;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet(name = "login", urlPatterns = { "/login.do" })
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public login() {
		// TODO Auto-generated constructor stub
		super();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String style = request.getParameter("style");
		
		Dao dao = new Dao();
		Connection connection = null;
		try {
			int i=0;
			Class.forName(dao.getJdString());
			connection = DriverManager.getConnection(dao.getUrl(), dao.getUsname(), dao.getPassword());
			String sql = "select userName,password from [User]";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				String user = resultSet.getString("userName");
				String passw = resultSet.getString("password");
				//pno = resultSet.getString("numno");
				if (username.equals(user.trim()) && password.equals(passw.trim())) {
					i=1;
					if (style.equals("buy")) {
						request.getSession().setAttribute("sname", username);

						response.sendRedirect("buy/buyMain.jsp");
					} else if (style.equals("sale")) {
						request.getSession().setAttribute("sname", username);
						response.sendRedirect("sale/saleMain.jsp");
					}

					else {
						request.getSession().setAttribute("sname", username);
						response.sendRedirect("admin/manageMain.jsp");
					}
				}
			}
			if (i == 0) {
				response.sendRedirect("error.jsp");
			}
			statement.close();
			resultSet.close();
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	/*	
		if (username.equals("buy") && password.equals("buy")) {
			if (style.equals("buy")) {
				request.getSession().setAttribute("sname", username);
				response.sendRedirect("buy/buyMain.jsp");
			} else if (style.equals("sale")) {
				request.getSession().setAttribute("sname", username);
				response.sendRedirect("sale/saleMain.jsp");
			}

			else {
				request.getSession().setAttribute("sname", username);
				response.sendRedirect("manage/manageMain.jsp");
			}
		}*/
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}
