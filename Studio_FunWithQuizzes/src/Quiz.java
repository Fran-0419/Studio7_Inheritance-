public class Quiz {



    public SelectionQuiz selectionQuiz;

    public Checkbox checkbox;

    public  TrueOrFalse tOrFalse;

    public Quiz(SelectionQuiz aSelectionQuiz, Checkbox aCheckbox, TrueOrFalse aTOrFalse) {
        this.selectionQuiz = aSelectionQuiz;
        this.checkbox = aCheckbox;
        this.tOrFalse = aTOrFalse;
    }


    public SelectionQuiz getSelectionQuiz() {
        return selectionQuiz;
    }

    public Checkbox getCheckbox() {
        return checkbox;
    }

    public TrueOrFalse getTOrFalse() {
        return tOrFalse;
    }

    public void setQuestionOne(SelectionQuiz aSelectionQuiz) {
        this.selectionQuiz = aSelectionQuiz;
    }

    public void setQuestionTwo(Checkbox aCheckbox) {
        this.checkbox = aCheckbox;
    }

    public void settOrFalse(TrueOrFalse aTOrFalse) {
        this.tOrFalse = aTOrFalse;
    }
}
