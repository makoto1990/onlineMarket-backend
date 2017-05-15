package main.java.com.backend.buyerEnd.service;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.com.backend.buyerEnd.dao.UserDao;
import main.java.com.backend.buyerEnd.model.User;

public class AlterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AlterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("UTF-8");
		boolean relogin = false;
		boolean resure = false;
		User user = (User)request.getSession().getAttribute("user");
		String username = request.getParameter("username");//�û��ǳ�
		String password = request.getParameter("password");//����
		String password2 = request.getParameter("password2");//ȷ������
		String realname = request.getParameter("realname");//��ʵ����
		String idnumber = request.getParameter("idnumber");//���֤��
		String phone = request.getParameter("phone");//��ϵ�绰
		String postcode = request.getParameter("postcode");//�ʱ�
		String province = request.getParameter("province");//ʡ
		String city = request.getParameter("city");//��
		String district = request.getParameter("district");//��/��
		String street = request.getParameter("street");//�ֵ�
		String address = request.getParameter("address");//��ַ
		
		if(!username.equals("")){ user.setuserName(username); relogin=true; }//�޸��ǳƣ������µ�¼
		if(!password.equals(password2)){
			//System.out.println("�������벻һ��");
			resure = true;
		}
		else if(!password.equals("")){ user.setpassword(password); relogin=true; }//�޸����룬�����µ�¼
		if(!realname.equals(""))user.setrealName(realname);
		if(!idnumber.equals(""))user.setIDnumber(idnumber);
		if(!phone.equals(""))user.setPhone(phone);
		if(!postcode.equals(""))user.setPostcode(postcode);
		if(!province.equals(""))user.setProvince(province);
		if(!city.equals(""))user.setCity(city);
		if(!district.equals(""))user.setDistrict(district);
		if(!street.equals(""))user.setStreet(street);
		if(!address.equals(""))user.setAddress(address);
		
		
		UserDao dao = new UserDao();

		dao.alterUser(user);
		request.getSession().setAttribute("sname", user.getuserName());
		if(resure)response.sendRedirect(request.getContextPath()+"/buy/userInforAlter.jsp");
		else if(!relogin)response.sendRedirect(request.getContextPath()+"/buy/buyerUserInfor.jsp");
		else response.sendRedirect(request.getContextPath()+"/index.jsp");
	}

}
