package problem04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static String[][] gugudan = new String[2][9];
	static int point;
	static int time;
	static int count=1;
	public static void main(String[] args) throws IOException {
		
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
				System.out.println(count+". "+question+" ?");
				count++;
				int userInput = sc.nextInt();
				int answer = Character.getNumericValue(question.charAt(0))*Character.getNumericValue(question.charAt(2));
				if(userInput == answer) {
					point++;
				}
			}
			
		}
		sc.close();
		long endTime = System.currentTimeMillis();
//		System.out.println(point);
//		System.out.println(endTime - startTime);
		time = (int) (endTime - startTime);
		File file = new File("test.txt");
		FileWriter fw = new FileWriter(file,true);
		fw.write("성공 횟수"+point+ " / 수행시간 "+ time+"\r\n");
		fw.flush();
		fw.close();
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