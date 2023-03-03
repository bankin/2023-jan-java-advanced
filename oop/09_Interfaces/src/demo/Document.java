package demo;

class Document implements Printable {
    @Override
    public void print() {
        System.out.println("printing document...");
    }

    public void status() {
        System.out.println("status...");
    }
}
