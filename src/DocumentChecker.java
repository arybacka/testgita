package src;

public class DocumentChecker {
    public static void main(String[] args) {
       // ExcelDocument document = new ExcelDocument();
        Document excelDocument = new ExcelDocument(); // ten sam sposob zapisywania metody co wyzej, ale oparta na dziedziczeniu
        Document PdfDocument = new PdfDocument();

        excelDocument.getDescription();
        PdfDocument.getDescription();
    }
}
