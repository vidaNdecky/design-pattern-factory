public class DocPdf extends Document {
    @Override
    public void open(){
        System.out.println("Ouverture du pdf");
    }
    @Override
    public void close(){
        System.out.println("Fermeture du pdf");
    }
    @Override
    public void save(){
        System.out.println("Sauvegarde du pdf");
    }
}
