package ForTest1;

public class ForTest3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		System.out.print("수자를 입력하시오:");
		int num = scanner.nextInt();
		System.out.print(num+"의 약수 는:");
		for(int i = 1;i<=num;i++) {
			if(num % i == 0) {
				System.out.print(" "+i+" ");
			}
		}
		System.out.println("입니다.");
	}
}