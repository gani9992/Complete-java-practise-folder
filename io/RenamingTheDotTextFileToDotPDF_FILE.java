import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileOutputStream;

 class RenameDotTextFileToDotPDF_File {
    public static void main(String[] args) {
        String inputFile = "example.txt";
        String outputFile = "example.pdf";

        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(outputFile));
            document.open();

            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = br.readLine()) != null) {
                document.add(new Paragraph(line));
            }
            br.close();

            document.close();
            System.out.println("PDF created successfully using iText!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
