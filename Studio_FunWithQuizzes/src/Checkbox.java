import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question {
    private ArrayList<String> options = new ArrayList<>();
    private boolean outCome;
    private int correctAnswer;
    public Checkbox(String aQuestion, ArrayList aOptions, int aCorrectAnswer) {
        super(aQuestion);
        this.options = aOptions;
        this.correctAnswer = aCorrectAnswer;
    }

    public ArrayList<String> getOptions() {
        return options;
    }


    public boolean getOutCome() {
        return outCome;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setOutCome(boolean outCome) {
        this.outCome = outCome;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean quizrunner() {

        Scanner input = new Scanner(System.in);
        System.out.println(getTheQuestion());
        for (String theChoices: options  ) {
            System.out.println(theChoices);
        }
        int usersChoice = input.nextInt();

        if ( usersChoice == correctAnswer ){
            setOutCome(true);
        }else {
            System.out.println("Wrong answer");
            setOutCome(false);
        }
        return outCome;
    }
}
