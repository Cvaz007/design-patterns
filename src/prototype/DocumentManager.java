import java.util.HashMap;
import java.util.Map;

public class DocumentManager {

    private Map<String, DocumentPrototype> documents = new HashMap<>();

    public void addDocument(String name, DocumentPrototype document){
        documents.put(name,document);
    }

    public DocumentPrototype ObtainCopyDocument(String name){
        DocumentPrototype originalDocument=documents.get(name);
        if (originalDocument != null){
            return originalDocument.clone();
        }
        return null;
    }
}
