package prototype;

public class ArticleDocument extends DocumentPrototype {
    public ArticleDocument(String content) {
        super(content);
    }

    public ArticleDocument clone(){
        return new ArticleDocument(this.getContent());
    }
}
