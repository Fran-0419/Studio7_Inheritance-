public abstract class Question {
    private String theQuestion;

    public Question(String aQuestion){
        this.theQuestion = aQuestion;
    }

    public String getTheQuestion() {
        return theQuestion;
    }

    public void setTheQuestion(String theQuestion) {
        this.theQuestion = theQuestion;
    }

    public void asking(){
        System.out.println(this.theQuestion);
    }

    public abstract boolean quizrunner();

}
