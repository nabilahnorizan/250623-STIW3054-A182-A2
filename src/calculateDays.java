
import java.util.Calendar;
import java.util.GregorianCalendar;

public class calculateDays extends ReadPdf implements Runnable
{
	
    @Override
    public void run()
    {	
    	
    	Calendar d1 = new GregorianCalendar(2019, Calendar.MAY, 25);
        Calendar d2 = new GregorianCalendar(2019, Calendar.JUNE, 19);
   
        System.out.println("TOTAL NUMBER OF DAYS   : " + (d2.getTimeInMillis() - d1.getTimeInMillis()) / (1000*60*60*24));
	
    }
}