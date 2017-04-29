package com.backend.defaultEnd;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet(name = "register", urlPatterns = {"/default/register.do"})
public class register extends HttpServlet {
    private static final long serialVersionUID = 1L;
    static int n = 1;
    static String oldDay = "20170420";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        // response.getWriter().append("Served at:
        // ").append(request.getContextPath());
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Connection connection = null;

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String dateNowStr = sdf.format(d);
        if (!dateNowStr.equals(oldDay)) {
            n = 1;
            oldDay = dateNowStr;
        }

        // dateNowStr.replaceAll("-", "");
        //System.out.println("��ʽ��������ڣ�" + dateNowStr);
        // Statement statement = null;

        Dao dao = new Dao();
        try {
            Class.forName(dao.getJdString());
            connection = DriverManager.getConnection(dao.getUrl(), dao.getUsname(), dao.getPassword());

            String userid = dateNowStr + n++;
            String sql = "INSERT INTO [User](userID,userName,password) VALUES (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userid);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);

            preparedStatement.executeQuery();
            // if(result.next()){}

            connection.close();
            preparedStatement.close();

        } catch (Exception e) {
            // TODO: handle exception
            // if (e.toString().contains("�����û�з��ؽ����")) {
            // request.getSession().setAttribute("message", "ע��ɹ����¼");
            response.sendRedirect("success.jsp");
        }
        //

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
