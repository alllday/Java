package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버웹툰크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://comic.naver.com/index");
	
		Document doc = null; //로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			Elements list = doc.select(".menu a span"); // menu클래스 안에 a태그 안에 span태그
			System.out.println(list.size());
			System.out.println(list);
			for (int j = 0; j < list.size(); j++) {
				Element tag1 = list.get(j);
				String text1 = tag1.text();
				System.out.println(text1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} //html코드를 다 가지고 와서 doc변수에 넣어놨음.
		//System.out.println(doc);
	}
}