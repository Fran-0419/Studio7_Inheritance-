import java.util.Locale;
import java.util.Scanner;

public class TrueOrFalse extends Question{
    private boolean answer;
    private boolean usersAnswer;

    public TrueOrFalse(String aQuestion, boolean aAnswer) {
        super(aQuestion);
        answer = aAnswer;
    }

    public boolean getAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        answer = answer;
    }

    public boolean getUsersAnswer() {
        return usersAnswer;
    }

    public void setUsersAnswer(boolean usersAnswer) {
        this.usersAnswer = usersAnswer;
    }



    @Override
    public boolean quizrunner(){
        Scanner input = new Scanner(System.in);
        System.out.println(getTheQuestion());
        System.out.println("Please enter true or false");
        String usersChoice = input.nextLine();
        //input.close();
        System.out.println(usersChoice);
        if (usersChoice.toLowerCase()  == "true"){

            setUsersAnswer(true);

        } else if (usersChoice.toLowerCase() == "false") {
            setUsersAnswer(false);

        }/*else{
            trueOrF();
        }*/

        return this.answer == this.usersAnswer;
    }

}
