import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.IOException;

public class ReadPdf {
	

    public static void main(String[] args) throws IOException {

        try (PDDocument document = PDDocument.load(new File("C:\\Users\\USER\\Downloads\\Documents\\A182_Draft _Stud.pdf"))) {

            document.getClass();

            if (!document.isEncrypted()) {
			
                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);

                PDFTextStripper tStripper = new PDFTextStripper();

                String pdfFileInText = tStripper.getText(document);
                
                try
				{
					totalCourse tc = new totalCourse(pdfFileInText);
					Thread t1 = new Thread(tc);
					t1.start();
					Thread.sleep(2000);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
                
                try
				{
					calculateDays cd = new calculateDays();
					Thread t2 = new Thread(cd);
					t2.start();
					Thread.sleep(2000);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
                
                try
				{
                	totalSOC ts = new totalSOC(pdfFileInText);
					Thread t3 = new Thread(ts);
					t3.start();
					Thread.sleep(2000);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
                
                try
				{
                	ListSOC ls = new ListSOC(pdfFileInText);
					Thread t4 = new Thread(ls);
					t4.start();
					Thread.sleep(2000);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
                
                try
				{
                	displaySTIW ds = new displaySTIW(pdfFileInText);
					Thread t5 = new Thread(ds);
					t5.start();
					Thread.sleep(2000);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}


            }

        }

    }
}