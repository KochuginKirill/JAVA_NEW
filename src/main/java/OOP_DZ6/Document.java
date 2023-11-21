package OOP_DZ6;

public class Document {
    private long id;
    private String number, text;

    public Document(long id, String number, String text) {
        this.id = id;
        this.number = number;
        this.text = text;
    }
    public long getID(){
        return this.id;
    }
    public String getNumber(){
        return this.number;
    }
    public String getText(){
        return this.text;
    }
}
