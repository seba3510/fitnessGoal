package practica;
import java.util.*;
public class fitnessGoal {


	public  fitnessGoal(int goal) {

	

		int totalDays = 0 ;
		int days = 0 ;
		int mins = 0 ;
		int last_min = 0 ;

		System.out.println("Train until you increase for "+goal+" days!");

		Scanner input = new Scanner(System.in);

		while(days < goal){

			System.out.print("Minutes? ");
			mins = input.nextInt();

			if(last_min < mins){

				System.out.println("Great Job!");
				last_min = mins;
				mins = 0;
				days++;
				totalDays++;

			}else{

				System.out.println("Start Over!!");
				last_min = mins;
				mins = 0;
				days = 0;
				totalDays++;
				continue;

			}// if

			
		}// while loop
		
		System.out.println("Reahed your goal in "+totalDays+" days!");


	}// fitnessGoal
	
	public static void main(String [] args) {
		
		fitnessGoal obj = new fitnessGoal(3);
		
	}// main




}// class