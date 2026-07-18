//WAP TO CALCULATE SIMPLE INTEREST AND.
//ALL THE VALUES WILL BE GIVEN BY USER.
public class Si {
	public static void main (String[] args) {
		 java.util.Scanner sc=new java.util.Scanner(System.in);
	        System.out.println("Enter the principal amount: ");
	        int p=sc.nextInt();
	        System.out.println("Enter the Rate: ");
	        int r=sc.nextInt();
	        System.out.println("Enter the time duration: ");
	        int t=sc.nextInt();
	        int Si=(p*r*t)/100;
	        System.out.println("Si : "+Si);
 }
}