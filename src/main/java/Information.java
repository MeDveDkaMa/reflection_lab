import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;

public class Information {

    public String getInfo(Class clazz){
        String AllInfo = null;
        getFields(clazz);
        getMethods(clazz);
        return AllInfo;
//    getParents(clazz)
    }

    private void getFields(Class clazz){
        String Fields = null;
        Field[] field = clazz.getDeclaredFields();
        int cout = field.length;
        System.out.println("Fields: \n" + "==========================" + "\t " + cout);
        for (int i = 0; i <field.length ; i++) {
            System.out.println(field[i]);
        }
    }

    private void getMethods(Class clazz){
        String Methods = null;
        Method[] methods = clazz.getDeclaredMethods();
        int cout = methods.length;
        System.out.println("\nMethods: \n" + "==========================" + "\t" + cout);
        for (int i = 0; i <methods.length ; i++) {
            System.out.println(methods[i]);
        }
    }

    private void getParent(Class clazz){
        String Methods = null;
        Method[] methods = clazz.getDeclaredMethods();
        int cout = methods.length;
        System.out.println("\nMethods: \n" + "==========================" + cout);
        for (int i = 0; i <methods.length ; i++) {
            System.out.println(methods[i]);
        }
    }



}
