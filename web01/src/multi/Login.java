package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	// HttpServlet에 있던 service()메서드는
	// get요청이면 doGet()호출(실행)하게 만들어져있음.

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 서버가 한글처리하도록 설정해서 브라우저로 보내야함.
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String find = request.getParameter("find");
		out.print("get요청을 받음>> " + find);
	}

	// HttpServlet에 있던 service()메서드는
	// post요청이면 doPost()호출(실행)하게 만들어져있음.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// request전에 선언해줘야 함 + get방식은 필요x 
		// server.xml파일에서 <Connector URIEncoding="UTF-8" ~ > 를 추가해줘서
		// get방식은 아래 코드를 추가 하지 않아도 되고, post방식은 따로 처리 해줘야함
		// => get방식은 주소와 함께 header로 넘어오기 때문에 / post방식은 body에 넘어오기 때문에
		request.setCharacterEncoding("UTF-8"); 
		
		// 서버가 한글처리하도록 설정해서 브라우저로 보내야함.
		response.setContentType("text/html;charset=utf-8"); // response전에 선언해줘야 함
		
		PrintWriter out = response.getWriter();
//		Cup cup = 동생.컵가지고와();
//		cup.물을마시다();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		out.print("post요청을 받음>> " + id + ", " + pw);
	}

}