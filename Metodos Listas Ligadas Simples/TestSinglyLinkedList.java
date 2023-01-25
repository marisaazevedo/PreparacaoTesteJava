public class TestSinglyLinkedList {
    public static void main(String[] args) {

        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();

        list1.addLast(2);
        list1.addLast(4);
        list1.addLast(6);
        list1.addLast(8);
        list1.addLast(10);

        System.out.println("list1 = " + list1);
        System.out.println("list1.cut(1, 1) = " + list1.cut(2, 3));

        // --------------------------------------------------------

        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();

        list2.addLast(2);
        list2.addLast(4);
        list2.addLast(6);
        list2.addLast(8);
        list2.addLast(10);

        System.out.println("list2 = " + list2);
        System.out.println("list2.cut(1, 1) = " + list2.cut(0, 2));

        // --------------------------------------------------------

        SinglyLinkedList<Character> list = new SinglyLinkedList<>();

        list.addLast('a');
        list.addLast('b');
        list.addLast('c');
        list.addLast('d');
        list.addLast('e');


        System.out.println("list = " + list);
        list.shift(2);
        System.out.println("list.shift(2) = " + list);

        // --------------------------------------------------------

        SinglyLinkedList<String> list3 = new SinglyLinkedList<>();

        list3.addLast("estruturas");
        list3.addLast("de");
        list3.addLast("dados");
        list3.addLast("e");
        list3.addLast("muito");
        list3.addLast("fixe");

        System.out.println("list3 = " + list3);
        System.out.println("list3.cut(1, 1) = " + list3.cut(0, 5));

        // ----------------------------------------------------------

        SinglyLinkedList<Integer> list4 = new SinglyLinkedList<>();

        list4.addLast(0);
        list4.addLast(1);
        list4.addLast(2);
        list4.addLast(3);
        list4.addLast(4);
        list4.addLast(5);
        list4.addLast(6);
        list4.addLast(7);
        list4.addLast(8);

        System.out.println("list4 = " + list4);
        System.out.println("list4.cut(1, 1) = " + list4.cut(1, 7));

    }
}
