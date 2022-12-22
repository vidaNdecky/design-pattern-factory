public class Application {
    public static void main(String[] args) {
        DocumentFactory factory = new PdfFactory();
        Document document = factory.createDocument();
        document.open();
    }
}
