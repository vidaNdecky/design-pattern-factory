public class TextFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new DocText();
    }
}
