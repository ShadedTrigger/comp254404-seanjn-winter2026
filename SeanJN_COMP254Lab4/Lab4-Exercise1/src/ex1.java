public class ex1<E> extends LinkedPositionalList<E> {
    public int indexOf(Position<E> p) {
        int index = 0;
        Position<E> walk = first();

        while (walk != null) {
            if (walk == p) {
                return index;
            }
            walk = after(walk);
            index++;
        }

        return -1;
    }

    public static void main(String[] args) {
        ex1<String> list = new ex1<String>();

        Position<String> Red = list.addLast("Red");
        Position<String> Blue = list.addLast("Blue");
        Position<String> Green = list.addLast("Green");

        System.out.println(list.indexOf(Red));
        System.out.println(list.indexOf(Blue));
        System.out.println(list.indexOf(Green));
    }
}

