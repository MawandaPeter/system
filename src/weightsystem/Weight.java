package weightsystem;
import java.util.Scanner;
public class Weight {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int weight;
		System.out.println("Please Enter Weight in Kg:");
		weight=input.nextInt();
		for(int i=50; weight>=i; --i) {
			if (i<=0) {
				break;
			}
			System.out.println(i);
			System.out.println(" Acceptable weights:");
			
			
		}
			
		
	}

}
