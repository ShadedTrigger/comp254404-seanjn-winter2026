import java.util.Stack;

public class ex2 {
    public static <E> void transfer(Stack<E> s, Stack<E> t) {
        while (!s.isEmpty()) {
            t.push(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        Stack<String> t = new Stack<>();

        s.push("Blue");
        s.push("Green");
        s.push("Red");

        t.push("Purple");
        t.push("Orange");
        t.push("Yellow");
        System.out.println("Before Transfer");
        System.out.println("Contents of Stack s: " + s);
        System.out.println("Contents of Stack t: " + t);
        transfer(s, t);
        System.out.println("After Transfer");
        System.out.println("Contents of Stack s: " + s);
        System.out.println("Contents of Stack t: " + t);
    }
}
