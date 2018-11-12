package patterns.creation;

public class CreationPatternDemo {

    public static void main(String[] args) {
        // Factory & AbstractFactory

        // Factory pattern, we create object without exposing the creation logic
        // to the client and refer to newly created object using a common interface.
        // Abstract Factory patterns work around a super-factory which creates other
        // factories. This factory is also called as factory of factories.
        // In Abstract Factory pattern an interface is responsible for creating a
        // factory of related objects without explicitly specifying their classes.
        // Each generated factory can give the objects as per the Factory pattern.

        // Sample in Android
        // android.graphics.BitmapFactory
        // com.android.internal.os.ClassLoaderFactory
        // com.android.internal.net.NetworkStatsFactory
        // android.webkit.WebViewFactory
        // android.view.LayoutInflater
        runFactoryPatternDemo();

        // Singleton

        // This pattern involves a single class which is responsible to create an
        // object while making sure that only single object gets created. This class
        // provides a way to access its only object which can be accessed directly
        // without need to instantiate the object of the class.

        // Sample in Android
        // com.android.server.Watchdog
        // com.android.server.pm.UserManagerService
        // android.hardware.input.InputManager
        // com.android.server.SystemConfig
        // com.android.server.fingerprint.FingerprintUtils
        runSingletonPatternDemo();

        // Builder

        // Builder pattern builds a complex object using simple objects and using
        // a step by step approach.
        // A Builder class builds the final object step by step. This builder is
        // independent of other objects.

        // Sample in Android
        // android.app.Notification.Builder
        // android.app.AlertDialog.Builder
        // android.app.job.Builder
        // android.security.keystore.KeyProtection.Builder
        // com.android.server.hdmi.HdmiCecMessageBuilder
        runBuilderPatternDemo();

        // Prototype

        // Prototype pattern refers to creating duplicate object while keeping
        // performance in mind.
        // This pattern involves implementing a prototype interface which tells
        // to create a clone of the current object. This pattern is used when
        // creation of object directly is costly. For example, an object is to
        // be created after a costly database operation. We can cache the object,
        // returns its clone on next request and update the database as and when
        // needed thus reducing database calls.

        // Sample in Android
        // android.database.sqlite.SQLiteConnectionPool
        // android.database.sqlite.SQLiteConnection.PreparedStatementCache
        // android.app.ContextImpl#sSharedPrefsCache
        // android.app．ApplicationPackageManager#sIconCache
        // android.content.res.ResourcesImpl#mDrawableCache
        runPrototypePatternDemo();
    }

    private static void runFactoryPatternDemo() {
        System.out.println("----Factory & Abstract Factory----");
        // AbstractFactoty
        AbstractFactory shapeFactory = FactoryProducer.
                getFactory(AbstractFactory.SHAPE_FACTORY);
        // Factory
        Shape circle = shapeFactory.getShape(Shape.TYPE_CIRCLE);
        circle.draw();
        Shape square = shapeFactory.getShape(Shape.TYPE_SQUARE);
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory(AbstractFactory.COLOR_FACTORY);
        Color red = colorFactory.getColor(Color.RED);
        red.fill();
        Color blue = colorFactory.getColor(Color.BLUE);
        blue.fill();
    }

    private static void runSingletonPatternDemo() {
        System.out.println("----Singleton----");
        // The instance of SingleObject will always be the same one.
        SingleObject singleObject1 = SingleObject.getInstance();
        singleObject1.showMessage(singleObject1.toString());

        SingleObject singleObject2 = SingleObject.getInstance();
        singleObject2.showMessage(singleObject2.toString());
    }

    private static void runBuilderPatternDemo() {
        System.out.println("----Builder----");
        // Use Builder Pattern to create the complex Object, the
        // complex object may have too many components, we can
        // use Builder to collect the all components and create
        // the instance finally
        MealBuilder mb = new MealBuilder();
        Meal vegMeal = mb.preparecVegMeal();
        vegMeal.showItems();

        Meal nonVegMeal = mb.prepareNonVegMeal();
        nonVegMeal.showItems();
    }

    private static void runPrototypePatternDemo() {
        System.out.println("----Prototype----");
        ShapeCache.loadCache();

        Shape cloneShape1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape :" + cloneShape1.getType());

        Shape cloneShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape :" + cloneShape2.getType());

        Shape cloneShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape :" + cloneShape3.getType());
    }
}
