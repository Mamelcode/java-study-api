package parse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

import com.google.gson.Gson;

import data.Status;
import data.User;

public class Example03 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = 
				new BufferedReader(new FileReader(new File(".\\raws\\player.json")));
		String read = "";
		while(true) {
			String line = br.readLine();
			if(line == null)
				break;
			read += line.trim();
		}
		br.close();
		System.out.println(read);
		
		Gson gson = new Gson();
		
		System.out.println("==========================");
		User user = gson.fromJson(read, User.class );
		
		for(int idx=0; idx<user.getFriendly().length; idx++) {
			System.out.println("친구이름 ==> "+ user.getFriendly()[idx].getCity());
			System.out.println("친구PTS ==> "+ user.getFriendly()[idx].getPts());
		}
		
		
		System.out.println("==========================");
		
		System.out.println("ID ==> "+ user.getPlayer());
		System.out.println("직업 ==> "+ user.getJob());
		System.out.println("스킬 ==> "+ Arrays.toString(user.getSkill()));
		System.out.println("HP ==> "+ user.getStatus().getHp());
		System.out.println("MP ==> "+ user.getStatus().getMp());
		//System.out.println("친구 ==> "+ Arrays.toString(user.getFriendly()));
		System.out.println("==========================");
	}
}
