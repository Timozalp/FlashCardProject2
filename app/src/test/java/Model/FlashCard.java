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


}
