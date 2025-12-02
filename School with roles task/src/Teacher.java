import java.util.ArrayList;

public class Teacher extends Person {
    public Teacher(String name, ArrayList CanTech) {
        super(name);
    }
    ArrayList<String> canTech = new ArrayList<>();

    ArrayList<String> currentCourse = new ArrayList<>();


    public Boolean addCourse(String person) {
        if (canTech.contains(currentCourse)) {
            System.out.println("You are not qualified to teach this course");
            return false;
        }
        System.out.println("Welcome to the course");
        currentCourse.add(person);
        return true;
    }
}
