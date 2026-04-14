public class Helloapp {
    public static void main(String[] args) {
        String names = (args.length == 0) ? "World" : String.join(", ", args);
        System.out.println("Hello, " + names + "!");
    }
}