public class TestSinglyLinkedList {
    public static void main(String[] args) {

        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();

        list1.addLast(2);
        list1.addLast(4);
        list1.addLast(8);
        list1.addLast(6);
        list1.addLast(10);
        list1.addLast(12);
        int ex1[] = new int[0];
        System.out.println("list1 = " + list1);
        System.out.println("list1.remove([]) = " + list1.remove(ex1));

        // --------------------------------------------------------

        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();

        list2.addLast(2);
        list2.addLast(4);
        list2.addLast(8);
        list2.addLast(6);
        list2.addLast(10);
        list2.addLast(12);
        int ex2[] = new int[6];
        for(int i = 0; i < 6; i++){
            ex2[i] = i;
        }
        System.out.println("list2 = " + list2);
        System.out.println("list2.remove([0,1,2,3,4,5]) = " + list2.remove(ex2));

        // --------------------------------------------------------

        SinglyLinkedList<Integer> list3 = new SinglyLinkedList<>();

        list3.addLast(2);
        list3.addLast(4);
        list3.addLast(8);
        list3.addLast(6);
        list3.addLast(10);
        list3.addLast(12);
        int ex3[] = new int[3];
        for(int i = 0; i < 3; i++){
            ex3[i] = i * 2;
        }
        System.out.println("list3 = " + list3);
        System.out.println("list3.remove([0,2,4]) = " + list3.remove(ex3));

        // --------------------------------------------------------

        SinglyLinkedList<Integer> list4 = new SinglyLinkedList<>();

        list4.addLast(2);
        list4.addLast(4);
        list4.addLast(8);
        list4.addLast(6);
        list4.addLast(10);
        list4.addLast(12);
        int ex4[] = new int[4];
        ex4[0] = 1;
        ex4[1] = 3;
        ex4[2] = 4;
        ex4[3] = 5;
        System.out.println("list4 = " + list4);
        System.out.println("list4.remove([0,2,4]) = " + list4.remove(ex4));

        // --------------------------------------------------------

        SinglyLinkedList<Character> list5 = new SinglyLinkedList<>();

        list5.addLast('a');
        list5.addLast('b');
        list5.addLast('c');
        list5.addLast('d');
        int ex5[] = new int[2];
        ex5[0] = 1;
        ex5[1] = 2;
        System.out.println("list5 = " + list5);
        System.out.println("list5.remove([1,2]) = " + list5.remove(ex5));

        // --------------------------------------------------------

        SinglyLinkedList<String> list6 = new SinglyLinkedList<>();

        list6.addLast("quarenta");
        list6.addLast("e");
        list6.addLast("dois");
        int ex6[] = new int[3];
        ex6[0] = 0;
        ex6[1] = 2;
        System.out.println("list6 = " + list6);
        System.out.println("list6.remove([0,2]) = " + list6.remove(ex6));
    }
}
