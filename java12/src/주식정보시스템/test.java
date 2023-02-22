package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class test {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
	
		Document doc = null; //로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			Elements codeList = doc.select(".code"); // menu태그 밑에 a태그 밑에 span태그
			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			String code = tag.text();
			System.out.println(code);
			
			Elements todayList = doc.select("span.blind");
			System.out.println(todayList.size());
			System.out.println(todayList);
		} catch (IOException e) {
			e.printStackTrace();
		} //html코드를 다 가지고 와서 doc변수에 넣어놨음.
		//System.out.println(doc);
	}
}