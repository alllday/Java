package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBTest2_확인문제 {

	public static void main(String[] args) {
		// 1) MongoDB 프로그램에 연결하자.
		MongoClient client = new MongoClient("localhost",27017);
		System.out.println("1. MongoDB 연결 성공!");
		
		// 2) shop2로 연결!
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 DB 연결 성공!");
		
		// 3) member.collection 에 연결!
		MongoCollection<Document> collection = database.getCollection("memo");
		System.out.println("3. member Collection 연결 성공!");
		
		// 1-1) insertOne
//		Scanner sc = new Scanner(System.in);
//		System.out.print("age입력>>");
//		String age = sc.next();
//		System.out.print("name입력>>");
//		String name = sc.next();
//		System.out.print("office입력>>");
//		String office = sc.next();
//		System.out.print("phone입력>>");
//		String phone = sc.next();
//		sc.close();
//		
//		Document doc = new Document();
//		doc.append("age", age);
//		doc.append("name", name);
//		doc.append("office", office);
//		doc.append("phone", phone);
//		
//		collection.insertOne(doc);
//		System.out.println("4. memeber 컬렉션에 insertOne 성공.");
		
		// 1-2) insertMany
//		Document doc2 = new Document();
//		doc2.append("age", "501");
//		doc2.append("name", "song2");
//		doc2.append("office", "busan");
//		doc2.append("phone", "011");
//		Document doc3 = new Document();
//		doc3.append("age", "502");
//		doc3.append("name", "song3");
//		doc3.append("office", "seoul");
//		doc3.append("phone", "011");
//		Document doc4 = new Document();
//		doc4.append("age", "503");
//		doc4.append("name", "song4");
//		doc4.append("office", "busan");
//		doc4.append("phone", "011");
//		
//		List<Document> list = new ArrayList<Document>();
//		list.add(doc2);
//		list.add(doc3);
//		list.add(doc4);
//		
//		collection.insertMany(list);
//		System.out.println("4. memeber 컬렉션에 insertOne 성공.");
		
		// 2) delete
//		Document filter = new Document();
//		filter.append("age", "500");
//		
//		collection.deleteOne(filter);
		// collection.deleteMany(filter);
		
		// 3-1) updateOne (한 가지 조건)
//		Document filter = new Document();
//		filter.append("age", "501");
//		
//		Bson set = Updates.set("phone", "010");
//		// Document filter2 = new Document();
//		// filter.append("phone", "010");
//		
//		collection.updateOne(filter, set);
//		// 이건 왜 안되지???
//		// collection.updateOne(filter, filter2);
//		System.out.println("4. member 컬렉션에 update 성공.");
		
		// 3-2) updateOne (여러 조건)
		Document filter = new Document();
		filter.append("age", "501");
		
		Bson set = Updates.set("name", "son");
		Bson set2 = Updates.set("office", "newyork");
		
		List<Bson> list = new ArrayList<Bson>();
		list.add(set);
		list.add(set2);
		
		Bson sets = Updates.combine(list);
		
		collection.updateOne(filter, sets);
		System.out.println("4. member 컬렉션에 update 성공.");
	}
}