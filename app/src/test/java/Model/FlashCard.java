package Model;


public class FlashCard {

    private int id //= 0;
    private String rectoContent;
    private String versoContent;
    private Boolean isRectoNext;
    //TODO enum freq

    public FlashCard(int id, String rectoContent, String versoContent, Boolean isRectoNext) {
        this.id = id;
        this.rectoContent = rectoContent;
        this.versoContent = versoContent;
        this.isRectoNext = isRectoNext;
        //TODO enum freq
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRectoContent() {
        return rectoContent;
    }

    public void setRectoContent(String rectoContent) {
        this.rectoContent = rectoContent;
    }

    public String getVersoContent() {
        return versoContent;
    }

    public void setVersoContent(String versoContent) {
        this.versoContent = versoContent;
    }

    public Boolean getRectoNext() {
        return isRectoNext;
    }

    public void setRectoNext(Boolean rectoNext) {
        isRectoNext = rectoNext;
    }



}
