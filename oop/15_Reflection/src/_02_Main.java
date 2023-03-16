import ref.Reflection;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class _02_Main {

    public static void main(String[] args) {
        Class<Reflection> reflectionClass = Reflection.class;
        Method[] allMethods = reflectionClass.getDeclaredMethods();

        Arrays.stream(allMethods)
                .filter(_02_Main::isGetterMethod)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.printf("%s will return class %s\n",
                        m.getName(), m.getReturnType().getName()));

        Arrays.stream(allMethods)
                .filter(_02_Main::isSetterMethod)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.printf("%s and will set field of class %s\n",
                        m.getName(), m.getParameterTypes()[0].getName()));
    }

    // Starts with "set*"
    // void return type
    // single argument
    public static boolean isSetterMethod(Method method) {
        if (!method.getName().startsWith("set")) { return false; }
        if (!method.getReturnType().equals(void.class)) { return false; }
        if (method.getParameterCount() != 1) { return false; }

        return true;
    }

    // Starts with "get*"
    // !void return type
    // no arguments
    public static boolean isGetterMethod(Method m) {
        if (!m.getName().startsWith("get")) { return false; }
        if (m.getReturnType().equals(void.class)) { return false; }
        if (m.getParameterCount() > 0) { return false; }

        return true;
    }
}
