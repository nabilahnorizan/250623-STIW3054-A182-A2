import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class displaySTIW extends ReadPdf implements Runnable
{
	String read;

    public displaySTIW(String read)
    {
        this.read = read;
    }
	
	@Override
	public void run()
	{
		String total = "";
		
		Pattern p = Pattern.compile ("STIW3054.*\\w");
		Matcher m = p.matcher(read);
	     
	     while (m.find()) 
	     {
        	total += "\n" + m.group();
	     }
	     
	     
	     System.out.println("");
	     System.out.println("");
	     System.out.println("STIW3054 DETAILS : ");
	     System.out.println(total);
	     
	}
}
	