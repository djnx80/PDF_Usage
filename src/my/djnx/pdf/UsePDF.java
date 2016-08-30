package my.djnx.pdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class UsePDF
{
		public static void main(String[] args) throws FileNotFoundException, DocumentException
		{
				Document document = new Document();
				// wyłączaostrzeżenie o nieużywanej zmiennej
				@SuppressWarnings("unused")
				// stwórz nowy plik
				PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
				document.open();
				
				// nowy obiekt do komunikacji z plikiem
				Paragraph paragraph = new Paragraph();
				// najpierw dodajemy dane do obiektu paragraph
				paragraph.add("Witaj swiecie!");
				
				// a na końcu obiekt paragraph dodajemy do dokumentu
				document.add(paragraph);
				// i zamykamy
				document.close();
		}
}
