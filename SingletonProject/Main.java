public class Main {
    public static void main(String[] args) {
        PrinterManager stu1 = PrinterManager.getInstance();
        stu1.printDocument("Nitya", "Assignment1.pdf");

        PrinterManager stu2 = PrinterManager.getInstance();
        stu2.printDocument("Manu", "ProjectReport.docx");

        if (stu1 == stu2) {
            System.out.println("Both are using the same PrinterManager instance.");
        } else {
            System.out.println("They are using different instances.");
        }
    }
}
