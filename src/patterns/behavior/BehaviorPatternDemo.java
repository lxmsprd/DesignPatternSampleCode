package patterns.behavior;

public class BehaviorPatternDemo {

    public static void main(String[] args) {
        // Chain of Responsibility

        // the chain of responsibility pattern creates a chain of receiver
        // objects for a request. This pattern decouples sender and receiver
        // of a request based on type of request.
        // In this pattern, normally each receiver contains reference to another
        // receiver. If one object cannot handle the request then it passes the
        // same to the next receiver and so on.
        runChainPatternDemo();

        // Command

        // Command pattern is a data driven design pattern
        // A request is wrapped under an object as command and passed to invoker
        // object. Invoker object looks for the appropriate object which can handle
        // this command and passes the command to the corresponding object which executes
        // the command.
        runCommandPatternDemo();

        // Interpreter

        // Interpreter pattern provides a way to evaluate language grammar or expression.
        // This pattern involves implementing an expression interface which tells to
        // interpret a particular context. This pattern is used in SQL parsing, symbol
        // processing engine etc.
        runInterpreterPatternDemo();

        // Iterator

        // This pattern is used to get a way to access the elements of a collection object
        // in sequential manner without any need to know its underlying representation.
        runIteratorPatternDemo();

        // Mediator

        // Mediator pattern is used to reduce communication complexity between multiple
        // objects or classes. This pattern provides a mediator class which normally handles
        // all the communications between different classes and supports easy maintenance of
        // the code by loose coupling.
        runMediatorPatternDemo();

        // Memento

        // Memento pattern is used to restore state of an object to a previous state.
        runMementoPatternDemo();

        // Observer

        // Observer pattern is used when there is one-to-many relationship between objects
        // such as if one object is modified, its depenedent objects are to be notified
        // automatically.
        runObserverPatternDemo();

        // State

        // In State pattern a class behavior changes based on its state.
        // In State pattern, we create objects which represent various states and a context
        // object whose behavior varies as its state object changes.
        runStatePatternDemo();

        // Null Object

        // In Null Object pattern, a null object replaces check of NULL object instance.
        // Instead of putting if check for a null value, Null Object reflects a do nothing
        // relationship. Such Null object can also be used to provide default behaviour
        // in case data is not available.
        // In Null Object pattern, we create an abstract class specifying various operations
        // to be done, concrete classes extending this class and a null object class providing
        // do nothing implemention of this class and will be used seemlessly where we need to
        // check null value.
        runNullObjectPatternDemo();

        // Strategy

        // In Strategy pattern, a class behavior or its algorithm can be changed at run time.
        // In Strategy pattern, we create objects which represent various strategies and a
        // context object whose behavior varies as per its strategy object. The strategy
        // object changes the executing algorithm of the context object
        runStrategyPatternDemo();

        // Template

        // In Template pattern, an abstract class exposes defined way(s)/template(s) to execute
        // its methods. Its subclasses can override the method implementation as per need but the
        // invocation is to be in the same way as defined by an abstract class.
        runTemplatePatternDemo();

        // Visitor

        // In Visitor patter, we use a visitor class which changes the executing algorithm of an
        // element class. By the way, execution algorithm of element can vary as and when visitor
        // varies. As per Pattern, element object has to accept the visitor object so that visitor
        // object handles the operation on the element object.
        runVisitorPatternDemo();
    }

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        // build the chain of loggers
        consoleLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return consoleLogger;
    }

    private static void runChainPatternDemo() {
        System.out.println("----Chain of Responsibility----");
        AbstractLogger chainOfLoggers = getChainOfLoggers();

        chainOfLoggers.logMessage(AbstractLogger.INFO, "INFO Message");
        chainOfLoggers.logMessage(AbstractLogger.DEBUG, "DEBUG Message");
        chainOfLoggers.logMessage(AbstractLogger.ERROR, "ERROR Message");
    }

    private static void runCommandPatternDemo() {
        System.out.println("----Command----");
        Stock baseStock = new Stock();

        Order buyStock = new BuyStock(baseStock);
        Order sellStock = new SellStock(baseStock);

        Border border = new Border();
        border.takeOrder(buyStock);
        border.takeOrder(sellStock);

        border.placeOrder();
    }

    private static void runInterpreterPatternDemo() {
        System.out.println("----Interpreter----");
        Expression isMale = getMaleExpression();
        Expression isMarried = getMarriedWomanExpression();

        String question = "John is male ? ";
        System.out.println(question + (isMale.interpret(question) ? "Yes" : "No"));
        question = "Julia is a unMarried women ? ";
        System.out.println(question + (isMarried.interpret(question) ? "Yes" : "No"));
    }

    // Rule: John and Michael are male
    private static Expression getMaleExpression() {
        Expression john = new TerminalExpression("John");
        Expression michael = new TerminalExpression("Michael");
        return new OrExpression(john, michael);
    }

    // Rule: Julia is a married woman
    private static Expression getMarriedWomanExpression() {
        Expression julia = new TerminalExpression("Julia");
        Expression married = new TerminalExpression("married");
        return new AndExpression(julia, married);
    }

    private static void runIteratorPatternDemo() {
        System.out.println("----Iterator----");
        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }
    }

    private static void runMediatorPatternDemo() {
        System.out.println("----Mediator----");
        User john = new User("John");
        User anna = new User("Anns");

        john.sendMeaage("hello, I am John");
        anna.sendMeaage("Hi, I am Anna");
    }

    private static void runMementoPatternDemo() {
        System.out.println("----Memento----");
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("STATE #1");
        originator.setState("STATE #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("STATE #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("STATE #4");
        careTaker.add(originator.saveStateToMemento());
        System.out.println("Current State: " + originator.getState());

        originator.setStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.setStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }

    private static void runObserverPatternDemo() {
        System.out.println("----Observer----");
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("First set Subject state to 97");
        subject.setState(97);
        System.out.println("Second set Subject state to 15");
        subject.setState(15);
    }

    private static void runStatePatternDemo() {
        System.out.println("----State----");
        Context context = new Context();

        State startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        State stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }

    private static void runNullObjectPatternDemo() {
        System.out.println("----Null Object----");
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Michael");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Anna");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Jhon");

        System.out.println("Customers:");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }

    private static void runStrategyPatternDemo() {
        System.out.println("----Strategy----");
        StrategyContext context = new StrategyContext(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new StrategyContext(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new StrategyContext(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }

    private static void runTemplatePatternDemo() {
        System.out.println("----Template----");
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

    private static void runVisitorPatternDemo() {
        System.out.println("----Visitor----");
        ComputerPart computerPart =  new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
