package strategy;

public class HtmlDoc extends DigitalDoc{

    public HtmlDoc(){
        openDocBehaviour = new OpenHtml();
        saveDocBehaviour = new SaveHtml();
    }
    
    public String performOpenDoc(){
        return openDocBehaviour.openDoc();
    }
    
    public void performSaveDoc(String content){
        saveDocBehaviour.saveDoc(content);
    }
}
