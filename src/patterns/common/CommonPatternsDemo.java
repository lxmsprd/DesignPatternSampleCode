package patterns.common;

public class CommonPatternsDemo {
    public static void main(String[] args) {
        // MVC

        // MVC Pattern stands for Model-View-Controller Pattern. This pattern is used to separate
        // application's concerns.
        // Model - Model represents an object or JAVA POJO carrying data. It can also have logic
        //         to update controller if its data changes.
        // View - View represents the visualization of the data that model contains.
        //         Controller - Controller acts on both model and view. It controls the
        //         data flow into
        // model object and updates the view whenever data changes. It keeps view and model separate.
        runMVCPatternDemo();
    }

    private static Student retrieveStudentFromDB() {
        Student student = new Student("01", "Anns");
        return student;
    }

    private static void runMVCPatternDemo() {
        System.out.println("------MVC------");
        StudentView sv = new StudentView();

        StudentController sc = new StudentController(retrieveStudentFromDB(), sv);
        sc.updateView();

        sc.setStudentName("XiaoLee");
        sc.updateView();
    }
}
