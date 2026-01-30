public class TestDriver3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        CircularlyLinkedList<String> colours = new CircularlyLinkedList<>();
        colours.addFirst("Red");
        colours.addLast("Blue");
        colours.addLast("Green");
        System.out.println("Original List: " + colours);

        CircularlyLinkedList<String> newColours = colours.clone();
        System.out.println("Cloned List: " + newColours);
    }
}
