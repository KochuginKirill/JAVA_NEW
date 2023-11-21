package OOP_DZ6;

public abstract class SuportedReportsTypes {

    protected String getFileType(){
        return "file";
    }
    public SuportedReportsTypes(){

    }
    public void CreateFile(Document document){
        System.out.println("Файл <" + this.getFileType() + "> Создан");
        System.out.println("id <" + document.getID() + "> Добавлен");
        System.out.println("number <" + document.getNumber() + "> Добавлен");
        System.out.println("text <" + document.getText() + "> Добавлен");
    }
}
    class PdfCreate extends SuportedReportsTypes{
    @Override
    protected String getFileType(){
        return "PDF";
    }
        public PdfCreate() {
            super();
        }
    }

class XmlCreate extends SuportedReportsTypes{
    @Override
    protected String getFileType(){
        return "XML";
    }
    public XmlCreate() {
        super();
    }
}

class JsonCreate extends SuportedReportsTypes{
    @Override
    protected String getFileType(){
        return "JSON";
    }
    public JsonCreate() {
        super();
    }
}
