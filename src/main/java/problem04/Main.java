package problem04;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static String[][] gugudan = new String[2][9];
	static int point;
	static int time;
	static int count=1;
	public static void main(String[] args) throws IOException {
		int gugu = new Random().nextInt(9)+1;
		for(int j= 0; j<9;j++) {
			for(int i=0; i<2; i++) {
				gugudan[i][j] = String.valueOf((new Random().nextInt(9)+1))+"X"+String.valueOf((new Random().nextInt(9)+1));
			}
			for(int i=0; i<2;i++) {
				System.out.print(gugudan[i][j]);
				if(i==0) System.out.print(", ");
			}
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		long startTime = System.currentTimeMillis();
		while(!nullCheck()) {
			int x = new Random().nextInt(2);
			int y = new Random().nextInt(9);
			if( gugudan[x][y] ==null) {
				continue;
			}else {
				String question =gugudan[x][y];
				gugudan[x][y]=null;
				System.out.println(count+". "+question);
				count++;
				int userInput = sc.nextInt();
				int answer = Character.getNumericValue(question.charAt(0))*Character.getNumericValue(question.charAt(2));
				if(userInput == answer) {
					point++;
				}
			}
			
		}
		long endTime = System.currentTimeMillis();
		System.out.println(point);
		System.out.println(endTime - startTime);
		PrintWriter pw = new PrintWriter("c:/out.txt");
		
		pw.println(point / time);
		
	}
	public static boolean nullCheck() {
		boolean result =false;
		for(int i = 0; i<9; i++) {
			for(int j=0; j<2; j++) {
				if(gugudan[j][i] ==null) {
					result=true;
				}else {
					return result = false;
				}
			}
		}
		return result;
	}
}