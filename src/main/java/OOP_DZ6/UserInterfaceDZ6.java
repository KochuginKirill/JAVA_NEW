package OOP_DZ6;

public class UserInterfaceDZ6 {
    public static void main(String[] args) {
        Document newPdfReport = new Document(1,"Номер","Текст");
        new ReportService(newPdfReport, "PDF");
        System.out.println();
        new ReportService(newPdfReport, "XML");
        System.out.println();
        new ReportService(newPdfReport, "JSON");
        System.out.println();
    }
}
