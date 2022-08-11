import java.util.ArrayList;

public class QuizRunner {

    public static void main(String[] args){
        int score = 0;



        ArrayList<String> myOption = new ArrayList<>();
        myOption.add("A -Elephants live at the North Pole");
        myOption.add("B -Java is a video game");
        myOption.add("C -Cheetahs are faster than tigers");

        ArrayList<String> boxOption = new ArrayList<>();
        boxOption.add("1 -Humans can breathe in outer space");
        boxOption.add("2 -Elephants can fly");
        boxOption.add("3 -Coding is fun");

        Quiz testQuiz = new Quiz(new SelectionQuiz("Please select the best answer from the choices provided A B or C: ", myOption , "C" ),new Checkbox("Please select the best answer from the choices provided 1 2 or 3:",boxOption, 3),new TrueOrFalse("Are cheetahs faster than tigers?", true));

        if (testQuiz.getSelectionQuiz().quizrunner() == true){
            score = score+1;
        }

        if(testQuiz.getCheckbox().quizrunner() == true){
            score = score+1;
        }

        if (testQuiz.getTOrFalse().quizrunner() == true){
            score = score+1;
        }
        System.out.println("You answered: " + score + " out of 3");
    }




    //Quiz testQuiz = new Quiz((QuestionOne), (Question2), (Question3));


   // new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    //Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    //Job testJob.toString();


}
