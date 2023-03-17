import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int num1 = b%10;
		int num2 = (b%100)/10;
		int num3 = b / 100;
		
		int result1 = num1 * a;
		int result2 = num2 * a;
		int result3 = num3 * a;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
        System.out.println(a*b);
	}
}