import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class totalSOC extends ReadPdf implements Runnable
{
	String read;

    public totalSOC(String read)
    {
        this.read = read;
    }
	
	@Override
	public void run()
	{
		int total = 0;
		
		Pattern p = Pattern.compile ("ST[IQ][MSANDJKW]\\d");
		Matcher m = p.matcher(read);
	     
	     while (m.find()) 
	     {
        	total++;
	     }
	     
	     
	     System.out.println("TOTAL NUMBER OF COURSE : " +total);
	     
	}
}
	