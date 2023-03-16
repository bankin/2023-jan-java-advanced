import annotations.Author;

import java.lang.reflect.Method;

public class Tracker {

    @Author(name = "Pesho")
    public static void main(String[] args) {
        printMethodsByAuthor(Tracker.class);
    }


    @Author(name = "Gosho")
    public static void printMethodsByAuthor(Class<?> clazz) {
        Method[] allMethods = clazz.getDeclaredMethods();

        for (Method method : allMethods) {
            Author author = method.getAnnotation(Author.class);
            if (author != null) {
                System.out.printf("%s: %s()\n", author.name(), method.getName());
            }
        }
    }
}
