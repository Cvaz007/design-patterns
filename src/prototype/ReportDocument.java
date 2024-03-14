public class ReportDocument extends DocumentPrototype {

    public ReportDocument(String content) {
        super(content);
    }

    public ReportDocument clone(){
        return new ReportDocument(this.getContent());
    }
}
