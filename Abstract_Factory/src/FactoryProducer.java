import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class FactoryProducer {
    public static ClothesFactory setFactory(String factoryName) {
        try {
            Class<?> factoryClass = Class.forName(factoryName);
            Constructor<?> constructor = factoryClass.getConstructor();
            return (ClothesFactory) constructor.newInstance();
        } catch (

                ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException e

        ) {
            e.printStackTrace();
        }

        return null;
    }

}
