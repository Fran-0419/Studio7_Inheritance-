import java.util.ArrayList;
import java.util.Scanner;

public class SelectionQuiz extends Question {
    private ArrayList<String> options = new ArrayList<>();
    private String correctAnswer;
    private boolean result;
    public SelectionQuiz(String aQuestion, ArrayList<String> aOptions, String aCorrectAnswer ) {
        super(aQuestion);
        this.options = aOptions;
        this.correctAnswer = aCorrectAnswer;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> aOptions) {
        this.options = aOptions;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String aCorrectAnswer) {
        this.correctAnswer = aCorrectAnswer;
    }

    @Override
    public boolean quizrunner (){
        Scanner input = new Scanner(System.in);
        System.out.println(getTheQuestion());
        for (String theChoices: options  ) {
            System.out.println(theChoices);
        }
        String usersChoice = input.nextLine();

        if ( usersChoice.toUpperCase() == correctAnswer ){
            setResult(true);
        }else {
            System.out.println("Wrong answer");
            setResult(false);
        }


        return result;
    }

}
