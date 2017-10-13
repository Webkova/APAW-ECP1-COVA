package strategy;

public class DigitalDoc {
    OpenDocBehaviour openDocBehaviour;
    SaveDocBehaviour saveDocBehaviour;

    public String performOpenHtml(){
        return openDocBehaviour.openDoc();
    }
    
    public String performOpenEpub(){
        return openDocBehaviour.openDoc();
    }
    
    public void performSaveEpub(String content){
        saveDocBehaviour.saveDoc(content);
    }
    
    public void performSaveHtml(String content){
        saveDocBehaviour.saveDoc(content);
    }
}
