public class DocText extends Document {
    @Override
    public void open(){
        System.out.println("Ouverture du text");
    }
    @Override
    public void close(){
        System.out.println("Fermeture du text");
    }
    @Override
    public void save(){
        System.out.println("Sauvegarde du text");
    }
}
