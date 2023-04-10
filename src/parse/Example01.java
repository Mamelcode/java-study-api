package parse;

import java.util.List;

import com.google.gson.Gson;

// JSON 문자열을 가지고 자바 객체화 하는 파싱을 연습

public class Example01 {
	public static void main(String[] args) {
		Gson gson = new Gson();
		
		String raw = "[true, false, true, false, true]";
		
		List<Boolean> li = gson.fromJson(raw, List.class);
		for(Boolean b : li) {
			System.out.println(b);
		}
		
		System.out.println("===========================");
		
		
		String raws = "[\"봄\", \"여름\", \"가을\", \"겨울\"]";
		
		String[] strss = gson.fromJson(raws, String[].class);
		List<String> strs = gson.fromJson(raws, List.class);
		for(String s : strss) {
			System.out.println(s);
		}
		
		
	}
}
