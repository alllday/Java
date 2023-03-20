package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check.do")
public class Check extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("Check서블릿 객체가 하나 만들어진다.!");
	}
	
	@Override
	public void destroy() {
		System.out.println("Check서블릿 소멸됨.");
	}
	
	// get요청, 클라이언트로 부터 전달되는 데이터는 주소와 함께 도착
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("text/html;charset=utf-8");
		//PrintWriter out = response.getWriter();
		
		String today = request.getParameter("today");
		String result = "";
		
		if (today.equals("맑음")) {
			result = "나가자";
			//out.print("나가자");
		} else if (today.equals("흐림")) {
			result = "코딩";
			//out.print("코딩");
		} else if (today.equals("비옴")) {
			result = "쇼핑";
			//out.print("쇼핑");
		} else {
			result = "그냥 있자";
			//out.print("그냥 있자");
		}
		
		response.setContentType("text/html;charset=utf-8"); // 위치 중요! : PrintWriter 객체 만들기 전에~
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=utf-8");
//		
//		PrintWriter out = response.getWriter();
//
//		String pass = request.getParameter("pass");
//		if (pass.equals("나는왕이다")) {
//			out.print("들어오세요");
//		} else {
//			out.print("들어올 수 없습니다.");
//		}
		request.setCharacterEncoding("UTF-8"); // post방식은 요청받을 때 이런 처리를 해줘야 함!
		String pass = request.getParameter("pass");
		String result = "들어올 수 없습니다.<img src='img/no.jpg'>";
		if (pass.equals("나는왕이다")) {
			result = "들어오세요.<img src='img/yes.jpg'>";
		}
		// 돌려줄 때도 이런 처리 해줘야함!
		response.setContentType("text/html;charset=utf-8"); // 위치 중요! : PrintWriter 객체 만들기 전에~
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
	}

}




