import java.util.Scanner;
public class Compare {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
		int a;
		System.out.println("enter first number");
		int b;
		System.out.println("enter second number");
		a=s.nextInt();
		b=s.nextInt();
		String result=a>b?"greater":"smaller";
		
		System.out.println(result);

	}

}
