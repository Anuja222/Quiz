public class QuestionService {

    Questions[] question = new Questions[5];

    public QuestionService(){
        question[0] = new Questions();
    }

    public void displayQuestion(){
        System.out.println("Display questions here");
    }
}
