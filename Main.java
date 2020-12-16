import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws Exception {
        Class c = Work.class;
        Object testObj = c.newInstance();
        Method[] methods = c.getDeclaredMethods();
        ArrayList<Method> al = new ArrayList<>();
        Method beforeMethod = null;
        Method afterMethod = null;

      for (int i = 1; i <= 4; i++) {
           for (int j = 0; j < methods.length; j++) {
               if (methods[j].getAnnotation(Test.class) != null) {
                  if (methods[j].getAnnotation(Test.class).priority() == j) {
                       al.add(methods[j]);
                    }
              }
        }
        }

        if (beforeMethod != null) beforeMethod.invoke(testObj, null);
        for (Method o : al) o.invoke(testObj, null);
        if (afterMethod != null) afterMethod.invoke(testObj, null);
    }
}
