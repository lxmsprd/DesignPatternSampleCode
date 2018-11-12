package patterns.structure;

import java.util.ArrayList;
import java.util.List;

public class StructurePatternDemo {

    public static void main(String[] args) {
        // Adapter

        // Adapter pattern works as a bridge between two incompatible interfaces.
        // This pattern involves a single class which is responsible to join
        // functionalities of independent or incompatible interfaces. A real
        // life example could be a case of card reader which acts as an adapter
        // between memory card and a laptop. You plugin the memory card into card
        // reader and card reader into the laptop so that memory card can be read via laptop.

        // Sample in Android
        // android.widget.ListAdapter
        // com.android.internal.globalactions.ActionsAdapter
        // android.widget.ArrayAdapter
        // com.android.server.display.WifiDisplayAdapter
        // com.android.server.wm.RecentsAnimationController.TaskAnimationAdapter
        runAdapterPatternDemo();

        // Bridge

        // Bridge is used when we need to decouple an abstraction from its implementation
        // so that the two can vary independently
        // This pattern involves an interface which acts as a bridge which makes the
        // functionality of concrete classes independent from interface implementer classes.
        // Both types of classes can be altered structurally without affecting each other.

        // Sample in Android
        // com.android.server.AppWidgetBackupBridge
        // com.android.server.tv.UinputBridge
        // com.android.uiautomator.core.UiAutomatorBridge
        // com.android.storagemanager.deletionhelper.AppStateBaseBridge
        runBridgePatternDemo();

        // Filter pattern or Criteria pattern

        // enables developers to filter a set of objects using different criteria and chaining
        // them in a decoupled way through logical operations.
        // this pattern combines multiple criteria to obtain single criteria.
        runFilterPatternDemo();

        // Composite

        // Composite pattern is used where we need to treat a group of objects in similar way as
        // a single object. Composite pattern composes objects in term of a tree structure to
        // represent part as well as whole hierarchy.
        runCompositePatternDemo();

        // Decorator

        // Decorator pattern allows a user to add new functionality to an existing object without
        // altering its structure
        // This pattern creates a decorator class which wraps the original class and provides
        // additional functionality keeping class methods signature intact.
        runDecoratorPatternDemo();

        // Facade

        // Facade pattern hides the complexities of the system and provides an interface to the
        // client using which the client can access the system
        // This pattern involves a single class which provides simplified methods required by
        // client and delegates calls to methods of existing system classes.
        runFacadePatternDemo();

        // Flyweight

        // Flyweight pattern is primarily used to reduce the number of objects
        // created and to decrease memory footprint and increase performance.
        // Flyweight pattern tries to reuse already existing similar kind objects
        // by storing them and creates new object when no matching object is found.
        runFlyweightPatternDemo();

        // Proxy
        // In proxy pattern, a class represents functionality of another class.
        // In proxy pattern, we create object having original object to interface its
        // functionality to outer world.
        runProxyPatternDemo();
    }

    private static void runAdapterPatternDemo() {
        System.out.println("----Adapter----");
        // The MediaAdapter works as bridge between two incompatible interface
        // Audio Player only can play Mp3 file, user the MediaAdapter can
        // connect the AdvancedMediaPlayer feature to AudioPlayer, So that
        // AudioPlayer can play Mp3, Mp4 and Vlc type file now.
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Halo.mp3");
        audioPlayer.play("vlc", "happiness.vlc");
        audioPlayer.play("mp4", "Zoo.mp4");
        audioPlayer.play("avi", "Blue.avi");
    }

    private static void runBridgePatternDemo() {
        System.out.println("----Bridge----");
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

    private static void runFilterPatternDemo() {
        System.out.println("----Filter----");
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("XiaoHong", "female", "Single"));
        persons.add(new Person("XiaoYuan", "female", "Married"));
        persons.add(new Person("XiaoYan", "male", "Single"));
        persons.add(new Person("Micheal", "male", "married"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(male, single);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Male: ");
        System.out.println(male.meetCriteria(persons));

        System.out.println("Female: ");
        System.out.println(female.meetCriteria(persons));

        System.out.println("Single: ");
        System.out.println(single.meetCriteria(persons));

        System.out.println("SingleMale: ");
        System.out.println(singleMale.meetCriteria(persons));

        System.out.println("SingleOrFemale: ");
        System.out.println(singleOrFemale.meetCriteria(persons));

    }

    private static void runCompositePatternDemo() {
        System.out.println("----Composite----");
        Employee CEO = new Employee("John", "CEO", 50000);

        Employee headSales = new Employee("Michael", "Head Sales", 30000);
        Employee headMarketing = new Employee("XiaoLee", "Head Marketing", 40000);

        Employee clerk1 = new Employee("Anna", "Marketing", 10000);
        Employee clerk2 = new Employee("Susan", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Shanben", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Bentian", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        // print all employees of the organization
        System.out.println(CEO);

        for (Employee headEmployee: CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee: headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }

    private static void runDecoratorPatternDemo() {
        System.out.println("----Decorator----");
        Shape circle = new Circle(0, 0, 10, new GreenCircle());
        Shape redBorderCircle = new RedShapeDecorator(new Circle(10, 10, 20, new GreenCircle()));

        Shape rectangle = new Rectangle(0, 0, 10, 5, new RedRectangle());
        Shape redBorderRectangle = new RedShapeDecorator(new Rectangle(10, 10, 10, 5,
                new RedRectangle()));

        System.out.println("Green Circle with normal border:");
        circle.draw();

        System.out.println("Green Circle with RED border:");
        redBorderCircle.draw();

        System.out.println("Red Rectangle with normal border:");
        rectangle.draw();
        System.out.println("Red Rectangle with RED border:");
        redBorderRectangle.draw();
    }

    private static void runFacadePatternDemo() {
        System.out.println("----Facade----");
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

    private static void runFlyweightPatternDemo() {
        System.out.println("----Flyweight----");
        final String colors[] = {"Red", "Creen", "Yellow", "Blue", "White"};
        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle)ShapeFactory.getCircle(
                    colors[(int)(Math.random()*colors.length)]);
            circle.setX((int)(Math.random()*100));
            circle.setY((int)(Math.random()*100));
            circle.setRadius((int)(Math.random()*100));
            System.out.println(circle);
        }
    }

    private static void runProxyPatternDemo() {
        System.out.println("----Proxy----");
        Image image = new ProxyImage("haha.jpg");

        // will load from disk
        image.display();
        System.out.println("display again, this time will not load from disk:");

        // will not load from disk
        image.display();
    }
}
