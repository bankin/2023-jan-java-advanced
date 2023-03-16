import ref.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class _03_Main {

    public static void main(String[] args) {
        Class<Reflection> reflectionClass = Reflection.class;
        Field[] allFields = reflectionClass.getDeclaredFields();
        Method[] allMethods = reflectionClass.getDeclaredMethods();

        Arrays.stream(allFields)
            .filter(f -> !Modifier.isPrivate(f.getModifiers()))
            .sorted(Comparator.comparing(Field::getName))
            .forEach(f -> System.out.printf("%s must be private!\n", f.getName()));

        Arrays.stream(allMethods)
            .filter(_02_Main::isGetterMethod)
            .filter(m -> !Modifier.isPublic(m.getModifiers()))
            .sorted(Comparator.comparing(Method::getName))
            .forEach(m -> System.out.printf("%s have to be public!\n", m.getName()));

        Arrays.stream(allMethods)
                .filter(_02_Main::isSetterMethod)
                .filter(m -> !Modifier.isPrivate(m.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.printf("%s have to be private!\n", m.getName()));

    }


}
