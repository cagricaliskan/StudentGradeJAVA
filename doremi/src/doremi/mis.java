package doremi;

import java.util.Scanner;
import java.util.stream.*;

public class mis {

	public static void main(String[] args) {
		
		int students;
		
		int	countA=0, countB=0, countC=0, countD=0, countE = 0;
			
		
			Scanner scan = new Scanner(System.in);
			
			//get number of student from user 
			System.out.println("Enter the number of students");
			students = scan.nextInt();
			System.out.println("There are: " + students + " students taking this course");
			
			//create an array with the length of students
			int[] array_1 = new int[students];
			
			
			//get grade of each student
			System.out.println("Enter each students grade ");
			for(int i=0; i<students; i++) {
			array_1[i] = scan.nextInt();
			}
			
			//display grades of students
			System.out.println("Grades: ");
			for(int i=0; i<students; i++) {
				System.out.println(array_1[i]);
			}
			
			//average grade, to find sum in the array, i will use stream
			int avg;
			int sum = IntStream.of(array_1).sum();
			avg = sum/students;
			System.out.println("Average grade is: " + avg);
			
			char[] array_2 = new char[students];
				
	
			
			//determining which student gets which grade
			for(int i=0; i<students; i++) {
				if(array_1[i]<60) {
					array_2[i]= 'E';
					countE++;
				}
				
				if(array_1[i]>=60 && array_1[i]<70) {
					array_2[i] = 'D';
					countD++;
				}
				if(array_1[i]>=70 && array_1[i]<80) {
					array_2[i] = 'C';
					countC++;
				}
				
				if(array_1[i] >=80 && array_1[i]<90) {
					array_2[i] = 'B';
					countB++;
				}
				
				if(array_1[i]>=90) {
					array_2[i] = 'A';	
					countA++;
				}
			}
			
			
			//displaying how many students got which grade
			if(countA > 0) {
				System.out.println("Number of students with grade A: " + countA  );
			} else {
				System.out.println("No students with grade A");
			}
			if (countB > 0) {
				System.out.println("Number of students with grade B: " + countB);	
			}else {
				System.out.println("No students with grade B");
			}
			if(countC > 0) {
				System.out.println("Number of students with grade C: " + countC);
			}else {
				System.out.println("No students with grade C");
			}
			if(countD > 0) {
				System.out.println("Number of students with grade D: " + countD);	
			}else {
				System.out.println("No students with grade D");
			}
			if(countE >0) {
				System.out.println("Number of students with grade E: " + countE);	
			}else {
				System.out.println("No students with grade E");
			}
			
    }
}
                
			
			
	
                        
