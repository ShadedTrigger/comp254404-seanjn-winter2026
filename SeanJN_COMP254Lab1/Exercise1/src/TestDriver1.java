public class TestDriver1 {
    public static void main(String[] args) {
        DoublyLinkedList<String> listL = new DoublyLinkedList<>();
        DoublyLinkedList<String> listM = new DoublyLinkedList<>();

        listL.addFirst("Red");
        listL.addLast("Blue");
        listL.addLast("Green");

        listM.addFirst("Purple");
        listM.addLast("Orange");
        listM.addLast("Pink");

        System.out.println("Original Lists");
        System.out.println("List L: " + listL);
        System.out.println("List M: " + listM);

//        System.out.println("Concatenate");
//        DoublyLinkedList<String> newList = listL.concatenate1(listM);
//        System.out.println("New List: " + newList);

        System.out.println("Concatenate");
        listL = listL.concatenate(listM);
        System.out.println("New List: " + listL);
    }
}
