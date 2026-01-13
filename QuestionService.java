import java.util.Scanner;

public class QuestionService {

    Questions[] question = new Questions[5];
    String[] answers = new String[5];

    public QuestionService(){
        question[0] = new Questions(1,"what","opt1","opt2","opt3","opt4","opt1");
        question[1] = new Questions(2,"why","opt1","opt2","opt3","opt4","opt2");
        question[2] = new Questions(3,"who","opt1","opt2","opt3","opt4","opt3");
        question[3] = new Questions(4,"whome","opt1","opt2","opt3","opt4","opt4");
        question[4] = new Questions(5,"which","opt1","opt2","opt3","opt4","opt1");
    }

    public void displayQuestion(){
        int i = 0;
        for(Questions q : question){
            System.out.println("Question no: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());    
            System.out.println("4. " + q.getOpt4());
            Scanner answer = new Scanner(System.in);
            answers[i] = answer.nextLine();
            i++;
        }
    }

            public void printScore(){
            
            int score = 0;
            for(int j=0; j<question.length; j++){
                Questions que = question[j];
                String actualAnswer = que.getAnswer();
                String userAnswer = answers[j];

                if(actualAnswer.equals(userAnswer)){
                    score++;
                }
            }
            System.out.println("Your score is: " + score);
        }
}
