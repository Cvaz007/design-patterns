abstract class DocumentPrototype implements Cloneable{

    private String content;

    public DocumentPrototype(String content){
        this.content=content;
    }

    public abstract DocumentPrototype clone();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
