import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("kaç eleman içersin?: ");
		int eleman = scanner.nextInt();
		int firstNum = 0, secondNum = 1;
		System.out.print(firstNum + " " + secondNum + " ");
		for (int i = 2; i < eleman; i++) {
            int nextNum = firstNum + secondNum;
            System.out.print(nextNum + " ");
            firstNum = secondNum;
            secondNum = nextNum;
        }
	}

}
