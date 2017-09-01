//Hayden N. Walters
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class az
{
	static int gradesMin(int [] grades)
	{
		
	}
	
	static int gradesMax(int [] grades)
	{
		
	}
	
	static double gradesMean(int [] grades)
	{
		
		//System.out.println("The mean of the grades is " + );
	}
	
	static double gradesMedian(int [] grades)
	{
		
	}

	static int [] gradesDistribution(int [] grades)
	{
	
		int [] distro = {0,0,0,0,0};
		for(int i = 0; i<grades.length; i++) 
		{
			if(grades[i]<60) {distro[4]++;}
			if(grades[i]<70 && grades[i]>=60) {distro[3]++;}
			if(grades[i]<80 && grades[i]>=70) {distro[2]++;}
			if(grades[i]<90 && grades[i]>=80) {distro[1]++;}
			if(grades[i]<90 && grades[i]>=100) {distro[0]++;}
		}
		return distro;		
	
		
		
		
		
		
		
		
	}
	
	//extra credit---remove this function if you don't do the EC
	static double gradesStandardDev(int [] grades)
	{
		
	}
	
	/* you will need to fill in the arguments for this function.
	 * the arguments should be the various statistics you computed
	 * and should print them out in a neatly-formatted manner.
	 */
	static void printGradesInfo()
	{
		System.out.println
	}	
	
	public static void main(String[] args) throws IOException
	{
		
System.out.println("Enter the name of the file in which the grades are recorded.");
		Scanner cin = new Scanner(System.in);
		String filename = cin.nextLine();
		cin.close();
		
		
		Scanner fin = new Scanner(new FileReader(filename));
		int n = fin.nextInt();
		int [] a = new int[n];
		for(int i = 0; i<n; i++)
		{
			a[i]=fin.nextInt();	
		}
		   
		//for(int i =0; i<n; i++)
		//{
		//	System.out.println(a[i]);
		//}
		
		fin.close();
	
		Arrays.sort(a);
	 gradesDistribution(a);
	
	
	
	}
		
}