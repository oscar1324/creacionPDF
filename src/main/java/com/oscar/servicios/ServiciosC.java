/**
 * 
 */
package com.oscar.servicios;
import com.oscar.Datos.*;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.ListSymbolAlignment;

/**
 * @author 201905
 *
 */
public class ServiciosC {

	public void creacionPDF(HttpServletResponse response) throws IOException {

		response.setContentType("application/pdf"); // para renderizarlo
		ServletOutputStream flujoDatosSalida = response.getOutputStream();// obtener OutputStream para escribir datos
																			// binarios en el response
		PdfWriter writer = new PdfWriter(flujoDatosSalida);// generamos un objeto PdfWriter, donde le indicamos donde
															// queremos generar el pdf, en la memoria
		PdfDocument pdfDocument = new PdfDocument(writer);
		Document doc = new Document(pdfDocument);

		// crear objeto de datos y poner metodo para instanciarlo, acabarlo en cada
		Datos datos = new Datos();
		List<Persona> nuevo  = datos.recuperarPersonas();
		
		for(Persona p : nuevo) {
			
		}
		
			
		// meter metodos y crear bucle
			
		// utilizar metodo get, para recuperar datos, bucle forn  por persona nueva pagina
		
		
		doc.add(new Paragraph("El sr/sra: " ));
		doc.add(new Paragraph(new Date().toString()));
		
		doc.close();// siempre cerrar
	}
}
