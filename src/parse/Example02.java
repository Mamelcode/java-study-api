package parse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import data.Weapon;

public class Example02 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = 
				new BufferedReader(new FileReader(new File(".\\raws\\samples.json")));
		String read = "";
		while(true) {
			String line = br.readLine();
			if(line == null)
				break;
			read += line.trim();
		}
		br.close();
		System.out.println(read);
		
		System.out.println("=======================");
		
		Gson gson = new Gson();
		
		List<Map> li = gson.fromJson(read, List.class);
		for(int i=0; i<li.size(); i++) {
			Map one = li.get(i);
			System.out.println(one.get("price"));
		}
		System.out.println("=======================");
		
		double price = 0;
		List<Weapon> list = gson.fromJson(read, new TypeToken<List<Weapon>>(){}.getType());
		for(Weapon a : list) {
			price += a.getPrice();
		}
		double avg = price / list.size();
		
		System.out.println(avg);
		System.out.println("=======================");
		
	}
}

