paublic class TestSinglyLinkedList {
    public static void main(String[] args) {

        // Reverse
        System.out.println("Reverse");

        SinglyLinkedList<Integer> lista1 = new SinglyLinkedList<>();

        lista1.addLast(2);
        lista1.addLast(4);
        lista1.addLast(6);
        lista1.addLast(8);

        System.out.println("lista1 = " + lista1);
        System.out.println("lista1.reverse() = " + lista1.reverse());

        // -------------------------------------------------------------

        SinglyLinkedList<Character> lista2 = new SinglyLinkedList<>();

        lista2.addLast('a');
        lista2.addLast('b');
        lista2.addLast('c');

        System.out.println("lista2 = " + lista2);
        System.out.println("lista2.reverse() = " + lista2.reverse());

        // -------------------------------------------------------------

        SinglyLinkedList<String> lista3 = new SinglyLinkedList<>();

        lista3.addLast("edados");

        System.out.println("lista3 = " + lista3);
        System.out.println("lista3.reverse() = " + lista3.reverse());

        // -------------------------------------------------------------

        SinglyLinkedList<Character> lista4 = new SinglyLinkedList<>();

        lista4.addLast('a');
        lista4.addLast('b');
        lista4.addLast('c');

        System.out.println("lista4 = " + lista4);
        System.out.println("lista4.reverse() = " + lista4.reverse());

        // -------------------------------------------------------------

        SinglyLinkedList<Character> lista5 = new SinglyLinkedList<>();

        System.out.println("lista5 = " + lista5);
        System.out.println("lista5.reverse() = " + lista5.reverse());

        // -------------------------------------------------------------
        // Occurences
        System.out.println("\n" + "Ocorrências");

        SinglyLinkedList<Integer> lista6 = new SinglyLinkedList<>();

        lista6.addLast(2);
        lista6.addLast(5);
        lista6.addLast(1);
        lista6.addLast(1);
        lista6.addLast(2);
        lista6.addLast(1);

        System.out.println("lista6 = " + lista6);
        System.out.println("lista6.occurrences(1) = " + lista6.occurrences(1));

        // -------------------------------------------------------------

        SinglyLinkedList<Integer> lista7 = new SinglyLinkedList<>();

        lista7.addLast(2);
        lista7.addLast(5);
        lista7.addLast(1);
        lista7.addLast(1);
        lista7.addLast(2);
        lista7.addLast(1);

        System.out.println("lista7 = " + lista7);
        System.out.println("lista7.occurrences(2) = " + lista7.occurrences(2));

        // -------------------------------------------------------------

        SinglyLinkedList<Integer> lista8 = new SinglyLinkedList<>();

        lista8.addLast(2);
        lista8.addLast(5);
        lista8.addLast(1);
        lista8.addLast(1);
        lista8.addLast(2);
        lista8.addLast(1);

        System.out.println("lista8 = " + lista8);
        System.out.println("lista8.occurrences(3) = " + lista8.occurrences(3));

        // -------------------------------------------------------------

        SinglyLinkedList<Character> lista9 = new SinglyLinkedList<>();

        lista9.addLast('a');
        lista9.addLast('a');
        lista9.addLast('a');
        lista9.addLast('a');

        System.out.println("lista9 = " + lista9);
        System.out.println("lista9.occurrences('a') = " + lista9.occurrences('a'));

        // -------------------------------------------------------------

        SinglyLinkedList<String> lista10 = new SinglyLinkedList<>();

        lista10.addLast("estruturas");
        lista10.addLast("de");
        lista10.addLast("dados");

        System.out.println("lista10 = " + lista10);
        System.out.println("lista10.occurrences(dados) = " + lista10.occurrences("dados"));

        // -------------------------------------------------------------

        SinglyLinkedList<Character> lista11 = new SinglyLinkedList<>();

        lista11.addLast('a');
        lista11.addLast('n');
        lista11.addLast('a');
        lista11.addLast('n');
        lista11.addLast('a');
        lista11.addLast('s');

        System.out.println("lista11 = " + lista11);
        System.out.println("lista11.occurrences('a') = " + lista11.occurrences('a'));

        // -------------------------------------------------------------
        // Remove
        System.out.println("\n" + "Remove");

        SinglyLinkedList<Character> lista12 = new SinglyLinkedList<>();

        lista12.addLast('a');
        lista12.addLast('b');
        lista12.addLast('d');
        lista12.addLast('a');
        lista12.addLast('c');

        System.out.println("lista12 = " + lista12);
        System.out.println("lista12.remove({'c','a'}) = " + lista12.remove({'c','a'}));

        SinglyLinkedList<Character> lista13 = new SinglyLinkedList<>();

        lista13.addLast('a');
        lista13.addLast('b');
        lista13.addLast('d');
        lista13.addLast('a');
        lista13.addLast('c');

        System.out.println("lista13 = " + lista13);
        System.out.println("lista13.remove({'a'}) = " + lista13.remove({'a'}));

        SinglyLinkedList<Character> lista14 = new SinglyLinkedList<>();

        lista14.addLast('a');
        lista14.addLast('b');
        lista14.addLast('d');
        lista14.addLast('a');
        lista14.addLast('c');

        System.out.println("lista14 = " + lista14);
        System.out.println("lista14.remove({'a','b','c','d','e'}) = " + lista14.remove({'a','b','c','d','e'}));

        SinglyLinkedList<Integer> lista15 = new SinglyLinkedList<>();

        lista15.addLast(42);
        lista15.addLast(22);
        lista15.addLast(42);
        lista15.addLast(42);
        lista15.addLast(22);
        lista15.addLast(42);

        System.out.println("lista15 = " + lista15);
        System.out.println("lista15.remove({42,1}) = " + lista15.remove({42,1}));

        SinglyLinkedList<String> lista16 = new SinglyLinkedList<>();

        lista16.addLast("ola");
        lista16.addLast("ola");
        lista16.addLast("mundo");
        lista16.addLast("ola");

        System.out.println("lista16 = " + lista16);
        System.out.println("lista16.remove(ola) = " + lista16.remove({"ola"}));

        SinglyLinkedList<Integer> lista17 = new SinglyLinkedList<>();

        lista17.addLast(1);
        lista17.addLast(2);
        lista17.addLast(3);
        lista17.addLast(3);
        lista17.addLast(2);
        lista17.addLast(1);

        System.out.println("lista17 = " + lista17);
        System.out.println("lista17.remove(3) = " + lista17.remove(3));
    }
}
