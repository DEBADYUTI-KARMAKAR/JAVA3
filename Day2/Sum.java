import java.util.Scanner;
public class Sum{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Two Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Sum is:"+c);
	}

}