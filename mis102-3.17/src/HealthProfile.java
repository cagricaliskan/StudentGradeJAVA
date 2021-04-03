import java.text.DecimalFormat;
import java.util.Scanner;

public class HealthProfile {

	private String name, gender;
    private int year, month,day;
    private double height, weight; 
	private static DecimalFormat df1= new DecimalFormat("#.#");
	
	public HealthProfile(String name, String gender, double height, double weight, int year, int month, int day){

        setName(name);
        setGender(gender);
        setHeight(height);
        setWeight(weight);
        setYear(year);
        setMonth(month);
        setDay(day);
	}
	
	public void setName(String name) {
		this.name = name;
		}
	public String getName() {
		return name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	
	
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public int getAge() {
		return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - year;
	}
	public int getMaxHeartRate(){
        // max heartrate in bpm = 220 - age in years.
        return 220 - getAge();
    }
    public String getTargetHeartRate(){
        return String.format("%.0f - %.0f",
                getMaxHeartRate() * 0.5, getMaxHeartRate() * 0.85);
    }
	
	
	public void setMonth(int month) {
		this.month = month;
	}
	public int getMonth() {
		return this.month;
	}
	
	
	public void setDay(int day) {
		this.day = day;
	}
	public int getDay() {
		return this.day;
	}

	
	public String bmiCal() {
		
		
		String bmivalue = null;
		String result = null;
	
		
		double bmi = ((weight * 700 )/(height * height));
		
		if(bmi > 40) {
			bmivalue = "a";
		}else if(bmi <= 40 && bmi >=35 ) {
			bmivalue = "b";
		}else if(bmi <=34.9 && bmi >=30 ) {
			bmivalue = "c";
		}else if(bmi <=29.9 && bmi >=25) {
			bmivalue = "d";
		}else if(bmi <=24.9 && bmi >=18.5) {
			bmivalue = "e";
		}else if(bmi <=18.4 && bmi >=17) {
			bmivalue = "f";
		}else if(bmi <=16.9 && bmi >=16) {
			bmivalue = "g";
		}else if(bmi <=15.9) {
			bmivalue = "h";
		}
		
		switch (bmivalue) {
		case "a":
			result = "Your BMI category is obese class 3"  + ", Your BMI value is " + df1.format(bmi);
			break;
		case "b":
			result = "Your BMI category is obese class 2"  + ", Your BMI value is " + df1.format(bmi);
			break;
		case "c":
			result = "Your BMI category is obese class 1"  + ", Your BMI value is " + df1.format(bmi);
			break;
		case "d":
			result = "Your BMI category is overweight"  + ", Your BMI value is " + df1.format(bmi);
			break;
		case "e":
			result = "Your BMI category is normal"  + ", Your BMI value is " + df1.format(bmi);
			break;
		case "f":
			result = "Your BMI category is mild thinness"  + ", Your BMI value is " + df1.format(bmi);
			break;
		case "g":
			result = "Your BMI category is moderate thinness"  + ", Your BMI value is " + df1.format(bmi);
			break;
		case "h":
			result = "Your BMI category is severe thinness"  + ", Your BMI value is " + df1.format(bmi);
			break;
		} 
		
		return result;
		
		
	}
	
	public void userProfile() {
		System.out.println("Name: " + name);
		System.out.println( "Date of birth : " + day + "/" + month + "/" + year +", Age: " + getAge());
		System.out.println("Gender: " + gender);
		System.out.println(  "Weight: " + weight + "\nHeight: " + height);
		System.out.println(bmiCal());
		System.out.printf("Max:\t%d\nTarget:\t%s\n", getMaxHeartRate(), getTargetHeartRate());
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		
		System.out.print("Enter your gender: ");
		String gender = scan.nextLine();
		
		System.out.print("Enter your birth year: ");
		int year = scan.nextInt();
		
		System.out.print("Enter your birth month: ");
		int month = scan.nextInt();
		
		System.out.print("Enter your birth day: ");
		int day = scan.nextInt();
		
		System.out.print("Enter your height in inches: ");
		double height = scan.nextDouble();
		
		System.out.print("Enter your weight in pounds: ");
		double weight = scan.nextDouble();
		
		HealthProfile user = new HealthProfile(name, gender, height, weight, year, month, day );
		
		user.userProfile();
	}
}

