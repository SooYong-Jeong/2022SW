package javaBeginner;

import java.util.Scanner;

public class Consert {
	String[] Sseat;
	String[] Aseat;
	String[] Bseat;
	Scanner sc = new Scanner(System.in);
	
	public Consert() {
		Sseat = new String[10];
		Aseat = new String[10];
		Bseat = new String[10];
		String init = "---";
		for(int i = 0; i < 10; i++) {
			Sseat[i] = init;
			Aseat[i] = init;
			Bseat[i] = init;
		}
	}
	
	public void printSeat(String[] seat) {
		for(int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		}
	}
	
	public void book(int seatNum) {
		if(seatNum == 1) {
			printSeat(Sseat);
			System.out.print("\n이름>> ");
			String name = sc.next();
			System.out.print("번호>> ");
			int num = sc.nextInt();
			int realnum = num-1;
			
			if(Sseat[realnum].equals("---")) {
				Sseat[realnum] = name;
			}else
				System.out.println("이미 있는 자리입니다.");
		}else if(seatNum == 2) {
			printSeat(Aseat);
			System.out.print("\n이름>> ");
			String name = sc.next();
			System.out.print("번호>> ");
			int num = sc.nextInt();
			int realnum = num-1;
			
			if(Sseat[realnum].equals("---")) {
				Sseat[realnum] = name;
			}else
				System.out.println("이미 있는 자리입니다.");
		}else if(seatNum == 3) {
			printSeat(Bseat);
			System.out.print("\n이름>> ");
			String name = sc.next();
			System.out.print("번호>> ");
			int num = sc.nextInt();
			int realnum = num-1;
			
			if(Sseat[realnum].equals("---")) {
				Sseat[realnum] = name;
			}else
				System.out.println("이미 있는 자리입니다.");
		}
	}
	
	public void showAll() {
		System.out.print("S>> ");
		printSeat(Sseat);
		System.out.print("\nA>> ");
		printSeat(Aseat);
		System.out.print("\nB>> ");
		printSeat(Bseat);
		System.out.println("\n<< 조회가 완료되었습니다. >> ");
	}
	
	public void cancel(int seatNum) {
		switch(seatNum) {
		case 1:
			System.out.print("S>>  ");
			printSeat(Sseat);
			System.out.println();
			System.out.print("이름>>  ");
			String name = sc.next();
			
			for(int i = 0; i < 10; i++) {
				if(Sseat[i].equals(name)) {
					Sseat[i] = "---";
					break;
				}
			}
			break;
		case 2:
			System.out.print("A>>  ");
			printSeat(Sseat);
			System.out.println();
			System.out.print("이름>>  ");
			String name1 = sc.next();
			
			for(int i = 0; i < 10; i++) {
				if(Sseat[i].equals(name1)) {
					Sseat[i] = "---";
					break;
				}
			}
			break;
		case 3:
			System.out.print("B>>  ");
			printSeat(Sseat);
			System.out.println();
			System.out.print("이름>>  ");
			String name2 = sc.next();
			
			for(int i = 0; i < 10; i++) {
				if(Sseat[i].equals(name2)) {
					Sseat[i] = "---";
					break;
				}
			}
			break;
		}
	}
}
