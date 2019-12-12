import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;

public class Information {

    public String getInfo(Class clazz) {
        String AllInfo = null;
        getFields(clazz);
        getMethods(clazz);
        getInterfaces(clazz);
        getParent(clazz);
        return AllInfo;
    }

    private void getFields(Class clazz) {
        String Fields = null;
        Field[] field = clazz.getDeclaredFields();
        int cout = field.length;
        System.out.println("\nFields: \n" + "==========================" + "\t " + cout);
        for (int i = 0; i < field.length; i++) {
            System.out.println(field[i]);
        }
    }

    private void getInterfaces(Class clazz) {
        String Fields = null;
        Class[] field = clazz.getInterfaces();
        int cout = field.length;
        System.out.println("\nInterfaces: \n" + "==========================" + "\t " + cout);
        for (int i = 0; i < field.length; i++) {
            System.out.println(field[i]);
        }
    }

    private void getMethods(Class clazz) {
        String Methods = null;
        Method[] methods = clazz.getDeclaredMethods();
        int cout = methods.length;
        System.out.println("\nMethods: \n" + "==========================" + "\t" + cout);
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }
    }

    private void getParent(Class clazz) {
        if (clazz.getSuperclass() != null) {
            System.out.println("\nSuperclasses: \n" + "========================== \n" + clazz.getSuperclass().getName());
            System.out.println("\n" + getInfo(clazz.getSuperclass()));
        }
    }
}
