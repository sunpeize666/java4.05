package ForTest1;

import java.util.Scanner;

public class doWhileTest2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner stdIn = new Scanner(System.in);
        do {
			
			System.out.print("월을 입력하시오(종료)");
			Scanner stdIn1 = new Scanner(System.in);
			System.out.print("월를 입력:");
			int month = stdIn1.nextInt();
			
			switch(month)
			{
			case 3 : case 4 : case 5 :
				System.out.print("봄입니다.");	
			case 6 : case 7 : case 8 :
				System.out.print("여름입니다.");
			case 9 : case 10 : case 11 :
				System.out.print("가올입니다.");
			case 12 : case 1 : case 2 :
				System.out.print("겨올입니다.");
			default :
				System.out.print("해당 월은 없슴니다.");
				break;
				}
        }while(month= != 0);
	}
}