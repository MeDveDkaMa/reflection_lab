import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    private static final String CLASSFORTEST = "java.lang.String";

    public static void main(String[] args) {
        Information info = new Information();
        try {
            Class clazz = Class.forName(CLASSFORTEST);
            System.out.println(info.getInfo(clazz));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
