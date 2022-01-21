package chnages;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Table {
	public static void main(String[] args) {
		
		try {
		String file_name="Table.pdf";
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(file_name));
		document.open();
		document.add(new Paragraph("welcome to my table"));
	

		float columnWidth[]= {2f, 2f, 2f};
		PdfPTable table = new PdfPTable(columnWidth);
	    
	    PdfPCell cell = new PdfPCell(new Phrase("1"));
	    cell.setRowspan(2);
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    
	    cell = new PdfPCell(new Paragraph("2"));
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    
	    
	    
	    cell = new PdfPCell(new Paragraph("3"));
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    
	    cell = new PdfPCell(new Paragraph("4"));
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    
	   
	    
	    cell = new PdfPCell(new Paragraph("5"));
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);	   
	    table.addCell(cell);
	    
	    
	    cell = new PdfPCell(new Paragraph("6"));	   
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    cell.setRowspan(20);
	    
	    cell = new PdfPCell(new Paragraph("7"));	   
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    
	    cell = new PdfPCell(new Paragraph("8"));	   
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    
	    document.add(table);
		document.close();
	
		}catch(Exception e) {
			System.err.println(e);
		}
	}

}