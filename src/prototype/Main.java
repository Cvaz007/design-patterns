package prototype;

public class Main {
    public static void main(String[] args) {
        ArticleDocument article1 = new ArticleDocument("edwinson cabeza de picha");
        ReportDocument report1 = new ReportDocument("edwinson malparido");

        DocumentManager documentManager = new DocumentManager();
        documentManager.addDocument("Articulo 1", article1);
        documentManager.addDocument("reporte 1", report1);

        DocumentPrototype copyArticle = documentManager.ObtainCopyDocument("Articulo 1");
        if (copyArticle != null){
            System.out.println("copia de articulo: " + copyArticle.getContent());
        }

        DocumentPrototype copyReport = documentManager.ObtainCopyDocument("reporte 1");
        if (copyReport != null){
            System.out.println("copia de reporte: " + copyReport.getContent());
        }

    }
}