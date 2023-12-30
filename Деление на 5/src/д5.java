import java.util.Scanner;
public class д5 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Провери, дали числото/а се дели/ят на 5 и разбери колко е, ако се дели");
		System.out.println("Въведи числото а: ");
		long a= input.nextLong();
		if (a%5==0) {
			System.out.println("Числото " + a + " се дели на 5 и е: ");
		System.out.println(a/5);;}
		else 
			System.out.println("Числото "+ a+ " не се дели на 5!");
		input.close();
		

	}

}
