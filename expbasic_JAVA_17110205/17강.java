package javaBeginner;

import java.util.Scanner;

class CharGame{
	String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

public class Task17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CharGame charGame = new CharGame();
		
		System.out.println("-------------------------------");
		System.out.println("특정 글자로 시작하는 단어 말하기 게임");
		System.out.println("-------------------------------");
		
		System.out.print("\n게임 참가 인원수>> ");
		int player_num = s.nextInt();
		
		CharGame[] player = new CharGame[player_num];
		for(int i = 0; i < player.length; i++) {
			System.out.print("참가자 이름 입력>>");
			String name = s.next();
			player[i] = new CharGame();
			player[i].setName(name);
		}
		
		boolean flag = true;
		while(flag) {
			for(int i = 0; i < player.length; i++) {
				System.out.print(player[i].getName() + ">> \t");
				String word = s.next();
				char firstChar = word.charAt(0);
				if(firstChar != '순') {
					System.out.println(player[i].getName() + "이(가) 패배했습니다.");
					flag = false;
					break;
				}
			}
		}
		
		
	}
}
