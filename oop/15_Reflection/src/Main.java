import annotations.Author;
import annotations.Subject;
import com.sun.source.tree.ModifiersTree;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Optional;

@Subject(categories = {"Some", "Other"})
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {

//        Class<Reflection> aClass = Reflection.class;

        Class<?> aClass = Class.forName("ref.Reflection");

//        System.out.println(reflectionClass.getName());
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getSuperclass());
        Class<?>[] interfaces = aClass.getInterfaces();

        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }

//        Object o = aClass.newInstance();
        Object o = aClass.getDeclaredConstructor().newInstance();

        System.out.println(o);

        Constructor<?>[] publicConstructors = aClass.getConstructors();
        Constructor<?>[] allConstructors = aClass.getDeclaredConstructors();

        for (Constructor<?> publicConstructor : publicConstructors) {
            System.out.println(publicConstructor);
        }

        System.out.println("ALL");

        for (Constructor<?> allConstructor : allConstructors) {
            System.out.println(allConstructor);
        }

//        aClass.getConstructor(String.class, String.class, String.class); // Exception not public

        Constructor<?> privateConstructor = aClass.getDeclaredConstructor(String.class, String.class, String.class);
        privateConstructor.setAccessible(true);
        Object privateObj = privateConstructor.newInstance("Some", "Private", "Info");

        System.out.println(privateObj);


        Constructor<?> publicConstructor = aClass.getConstructor(String.class);
        Object refObject = publicConstructor.newInstance("Public");
        System.out.println(refObject);
        Class<?>[] parameterTypes = publicConstructor.getParameterTypes();
        Parameter[] parameters = publicConstructor.getParameters();


        // Fields
        Optional<Field> optionalField = Arrays.stream(aClass.getDeclaredFields())
                .filter(f -> f.getName().equals("some"))
                .findFirst();

        System.out.println(optionalField);

        Field privateField = aClass.getDeclaredField("zip");
        privateField.setAccessible(true);
        Object zipValue = privateField.get(refObject);
        System.out.println(zipValue);

        privateField.setInt(refObject, 567);
        System.out.println(privateField.get(refObject));
// FIXME
//        Field finalNickName = aClass.getDeclaredField("nickName");
//        finalNickName.setAccessible(true);
//        finalNickName.set(refObject, "Updated");
//        System.out.println(finalNickName.get(refObject));

        Method setEmail = aClass.getMethod("setEmail", String.class);
        Method getEmail = aClass.getMethod("getEmail");
        Method setZip = aClass.getDeclaredMethod("setZip", int.class);

        setEmail.invoke(refObject, "Invoked");
        System.out.println(getEmail.invoke(refObject));

        setZip.setAccessible(true);
        setZip.invoke(refObject, 123);
        System.out.println(refObject);

        Method staticGetString = aClass.getMethod("getString");
        System.out.println(staticGetString.invoke(refObject));
        System.out.println(staticGetString.invoke(null));

        Field finalNickName = aClass.getDeclaredField("nickName");
        int privateStaticFinalModifiers = finalNickName.getModifiers();
        int publicStaticModifiers = staticGetString.getModifiers();
        int privateModifiers = setZip.getModifiers();

        System.out.println(Modifier.isPrivate(privateStaticFinalModifiers));
        System.out.println(Modifier.isPrivate(publicStaticModifiers));


        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        Author annotation = aClass.getAnnotation(Author.class);
        Subject subjectAnnotation = aClass.getAnnotation(Subject.class);
        for (String category : subjectAnnotation.categories()) {
            System.out.println(category);
        }


        System.out.println();
    }

    @Custom("asd")
    @SecondAnnotation(amount = 5)
//    @Subject(categories = {})
    public static void method(@Custom("asd") String param) {

    }
}