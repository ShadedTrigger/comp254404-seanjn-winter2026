public class ex3 {
    public static void main(String[] args) {
        LinkedQueue<String> queue1 = new LinkedQueue<>();
        LinkedQueue<String> queue2 = new LinkedQueue<>();

        queue1.enqueue("Blue");
        queue1.enqueue("Green");
        queue1.enqueue("Red");

        queue2.enqueue("Purple");
        queue2.enqueue("Orange");
        queue2.enqueue("Yellow");

        System.out.println("Before concatenate");
        System.out.println("Queue 1: " + queue1);
        System.out.println("Queue 2: " + queue2);
        queue1.concatenate(queue2);
        System.out.println("After concatenate");
        System.out.println("Queue 1: " + queue1);
        System.out.println("Queue 2: " + queue2);
    }
}
