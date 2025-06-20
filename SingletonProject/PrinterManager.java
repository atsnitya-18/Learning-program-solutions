
public class PrinterManager {
    private static PrinterManager instance;

    private PrinterManager() {
        System.out.println("Printer Manager is ready!");
    }

    public static PrinterManager getInstance() {
        if (instance == null) {
            instance = new PrinterManager();
        }
        return instance;
    }

    public void printDocument(String studentName, String docName) {
        System.out.println(studentName + " is printing: " + docName);
    }
}
