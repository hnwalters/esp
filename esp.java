//Hayden N. Walters
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class esp
{
	static int gradesMin(int [] grades) // determines the lowest score
	{
		return grades[0];
		
		
		
	}
	
	static int gradesMax(int [] grades) // determines the highest score
	{
		
		return grades[grades.length-1];
		
		
	}
	
	static double gradesMean(int [] grades) // determines the mean of the scores
	{
		double sum = 0;
		for(int i = 0; i<grades.length; i++)
		{
		sum = (sum + grades[i]);
		}
		
		 sum = sum/grades.length;
		
		
		return sum;
	}
	
	static double gradesMedian(int [] grades) // determines the median of the scores
	{
		double median;
		if (grades.length % 2 == 0)
		    median = ((double)grades[grades.length/2] + (double)grades[grades.length/2 - 1])/2;
		else
		    median = (double) grades[grades.length/2]; 
		
		
		return median;
	}

	static int [] gradesDistribution(int [] grades) //sorts grades by score
	{
	
		int [] distro = {0,0,0,0,0};
		for(int i = 0; i<grades.length; i++) 
		{
			if(grades[i]<60) {distro[4]++;}
			if(grades[i]<70 && grades[i]>=60) {distro[3]++;}
			if(grades[i]<80 && grades[i]>=70) {distro[2]++;}
			if(grades[i]<90 && grades[i]>=80) {distro[1]++;}
			if(grades[i]<100 && grades[i]>=90) {distro[0]++;}
		}
		return distro;		
		
	}
	
	/* you will need to fill in the arguments for this function.
	 * the arguments should be the various statistics you computed
	 * and should print them out in a neatly-formatted manner.
	 */
	static void printGradesInfo(int [] grades) //reads grades and then assigns corresponding letter value; then prints out the info
	{
		int [] distro = gradesDistribution(grades); 
		System.out.println("F" + distro[4]);
		System.out.println("D" + distro[3]);
		System.out.println("C" + distro[2]);
		System.out.println("B" + distro[1]);
		System.out.println("A" + distro[0]);
		System.out.println("The lowest score is " + gradesMin(grades));
		System.out.println("The highest score is " + gradesMax(grades));
		System.out.println("The mean of the grades is " + gradesMean(grades));
		System.out.println("The Median of the grades is " + gradesMedian(grades));
		
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
	 printGradesInfo(a);
	
	
	//System.out.println();
	}
		
}