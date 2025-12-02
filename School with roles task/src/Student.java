import java.util.ArrayList;

class Student extends Person {
    private final ArrayList<String> passedCourses = new ArrayList<>();
    private final ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name) {
        super(name);
    }
//Tjekker om student allerede er optaget, ikke er optaget, eller har bestået faget
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            // Hvis de har bestået faget
            System.out.println("You have already passed: " + course);
            return false;
        } else if (currentCourses.contains(course)) {
            // Hvis de allerede er tilmeldt faget
            System.out.println("You are already a student: " + course);
            return false;
        }
        // Når de bliver optaget
        currentCourses.add(course);
        System.out.println("Welcome to: " + course);
        return true;
    }
}