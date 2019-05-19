import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class totalCourse extends ReadPdf implements Runnable 
{
	
	String read;

	public totalCourse(String read) 
	{
		this.read = read;
	}
	
	public void run() 
	{
         int total  = 0;
         
         Pattern course = Pattern.compile("\\w\\d{4}");
	     Matcher ttl = course.matcher(read);
	     
	     while (ttl.find()) 
	     {
         	total++;
	     }
	     
	     System.out.println("");
	     System.out.println("TOTAL NUMBER OF COURSE : " +total);
	     
	}
}