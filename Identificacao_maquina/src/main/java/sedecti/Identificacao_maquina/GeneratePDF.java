package sedecti.Identificacao_maquina;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePDF {
	public static String generateNomeArquivo(Etiqueta etiqueta) {
		String arquivo = etiqueta.getSecretaria() + "_" + etiqueta.getTombo();

		return arquivo;
	}
	
	public GeneratePDF(Etiqueta etiqueta, String path) {
		
		try {
			
			String nameFile = etiqueta.getSetor() + "_" + etiqueta.getTombo() + ".pdf";
			String outputFileName = "";
			
			if (path == null) {
				outputFileName = ".\\" + nameFile;
			} else {
				outputFileName = path + "\\" + nameFile;
			}
			
			Document document = new Document();
			
			FileOutputStream outputStream = new FileOutputStream(outputFileName);
			outputStream.flush();
			
			PdfWriter.getInstance(document, outputStream);
			
			document.open();
			document.newPage();
			
			PdfPTable pdfTable = new PdfPTable(2);
			
			PdfPCell cell1 = new PdfPCell(new Paragraph("BAIXA DE EQUIPAMENTO - " + etiqueta.getSecretaria().toUpperCase()));
			
			cell1.setColspan(2);
			
			PdfPCell cell2 = new PdfPCell(new Paragraph("Equipamento: "));
			PdfPCell cell3 = new PdfPCell(new Paragraph("Tombo: " + etiqueta.getTombo()));
			PdfPCell cell4 = new PdfPCell(new Paragraph("Configuração "));
			PdfPCell cell5 = new PdfPCell(new Paragraph(etiqueta.getConfiguracao()));
			PdfPCell cell6 = new PdfPCell(new Paragraph("Setor: "));
			PdfPCell cell7 = new PdfPCell(new Paragraph(etiqueta.getSetor().toUpperCase()));
			PdfPCell cell8 = new PdfPCell(new Paragraph("Data "));
			PdfPCell cell9 = new PdfPCell(new Paragraph(etiqueta.getDataFormatoBrasil()));
			PdfPCell cell10 = new PdfPCell(new Paragraph("Responsável "));
			PdfPCell cell11 = new PdfPCell(new Paragraph(etiqueta.getResponsavel()));
			
			PdfPCell cell12 = new PdfPCell(new Paragraph("Observação \n\n\n\n" + etiqueta.getObservacao()));
			cell12.setColspan(2);
			cell12.setRowspan(4);
			
			PdfPCell cell13 = new PdfPCell(new Paragraph("Técnico Responsável pela Baixa \n\n\n" + "_______________________________________\n\n\n"));
			cell13.setColspan(2);
			cell13.setRowspan(4);
			
			pdfTable.addCell(cell1);
			pdfTable.addCell(cell2);
			pdfTable.addCell(cell3);
			pdfTable.addCell(cell4);
			pdfTable.addCell(cell5);
			pdfTable.addCell(cell6);
			pdfTable.addCell(cell7);
			pdfTable.addCell(cell8);
			pdfTable.addCell(cell9);
			pdfTable.addCell(cell10);
			pdfTable.addCell(cell11);
			pdfTable.addCell(cell12);
			pdfTable.addCell(cell13);
			
			
			document.add(pdfTable);
			
			document.close();
			outputStream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
