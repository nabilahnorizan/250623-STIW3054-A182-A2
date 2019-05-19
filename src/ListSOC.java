import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListSOC extends ReadPdf implements Runnable
{
	String read;

    public ListSOC(String read)
    {
        this.read = read;
    }
	
	@Override
	public void run()
	{
		String total = "";
		
		Pattern p = Pattern.compile ("ST[IQ][MSANDJKW]\\d.*\\w");
		Matcher m = p.matcher(read);
	     
	     while (m.find()) 
	     {
        	total += "\n" + m.group().trim();
	     }
	     
	     
	     System.out.println("");
	     System.out.println("");
	     System.out.println("LIST OF SOC : ");
	     System.out.println(total);
	     
	}
}
	