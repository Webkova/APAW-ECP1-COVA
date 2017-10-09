package strategy;

public class PDFDoc extends DigitalDoc {
    
    public PDFDoc(){
        openDocBehaviour = new OpenPDF();
        saveDocBehaviour = new SavePDF();
       
    }
    
    public String performOpenDoc(){
        return openDocBehaviour.openDoc();
    }
    
    public void performSaveDoc(String content){
        saveDocBehaviour.saveDoc(content);
    }
}
