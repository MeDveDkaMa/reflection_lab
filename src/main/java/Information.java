import java.lang.reflect.Field;

public class Information {

    public String getInfo(Class clazz){
        String AllInfo = "312";
        AllInfo = getFields(clazz);
        return AllInfo;
//    getParents(clazz)
    }

    private String getFields(Class clazz){
        String Fields = null;
        Field[] field = clazz.getDeclaredFields();
        Fields = field.toString();
        return Fields;
    }

    private String getParents(Class clazz){
        String Methods;
        Methods = "dsada";
        return Methods;
    }


}
