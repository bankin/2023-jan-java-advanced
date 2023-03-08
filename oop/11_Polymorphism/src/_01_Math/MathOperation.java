package _01_Math;

public class MathOperation {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return add(a, b) + c;
    }

    public int add(int a, int b, int c, int d) {
        return add(a, b, c) + d;
    }


    public int add(double a, int b) {
        return 0;
    }

    public int add(int a, double b) {
        return 0;
    }

//    public String getDocument(String title, String header, String body, String footer) {
//        return title + he....;
//    }
//
//    public String getDocument(String title, String body) {
//        return getDocument(title, null, body, null);
//    }

}
