//Hayden N. Walters
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class esp 
{
	
	static int gradesMin(int [] grades)
	{
		
	}
	
	static int gradesMax(int [] grades)
	{
		
	}
	
	static double gradesMean(int [] grades)
	{
		
	}
	
	static double gradesMedian(int [] grades)
	{
		
	}

	static int [] gradesDistribution(int [] grades)
	{
		
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
		
	}	
	
	public static void main(String[] args) throws IOException
	{

		
		Scanner fin = new Scanner(new FileReader("esp.txt"));
		
		do //read in each line of the text file and print it
		{
			System.out.println(fin.nextLine());
		}
		while(fin.hasNextLine());
		
		fin.close();
	}

}