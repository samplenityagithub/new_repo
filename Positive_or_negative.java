import java.util.Scanner;
public class Positive_or_negative {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s= new Scanner (System.in);
     int a;
     System.out.println("enter the number");
     a=s.nextInt();
     String num= a>0?"positive":"negative";
     System.out.println(num);
     
	}

}
