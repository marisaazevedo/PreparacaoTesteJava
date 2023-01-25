public class SinglyLinkedList<T> {
    private Node<T> first; // Primeiro no da lista
    private int size; // Tamanho da lista

    // Construtor (cria lista vazia)
    SinglyLinkedList() {
        first = null;
        size = 0;
    }

    // Retorna o tamanho da lista
    public int size() {
        return size;
    }

    // Devolve true se a lista estiver vazia ou falso caso contrario
    public boolean isEmpty() {
        return (size == 0);
    }

    // Adiciona v ao inicio da lista
    public void addFirst(T v) {
        Node<T> newNode = new Node<T>(v, first);
        first = newNode;
        size++;
    }

    // Adiciona v ao final da lista
    public void addLast(T v) {
        Node<T> newNode = new Node<T>(v, null);
        if (isEmpty()) {
            first = newNode;
        } else {
            Node<T> cur = first;
            while (cur.getNext() != null)
                cur = cur.getNext();
            cur.setNext(newNode);
        }
        size++;
    }

    // Retorna o primeiro valor da lista (ou null se a lista for vazia)
    public T getFirst() {
        if (isEmpty())
            return null;
        return first.getValue();
    }

    // Retorna o ultimo valor da lista (ou null se a lista for vazia)
    public T getLast() {
        if (isEmpty())
            return null;
        Node<T> cur = first;
        while (cur.getNext() != null)
            cur = cur.getNext();
        return cur.getValue();
    }

    // Devolve um elemento numa dada posição
    public T get(int pos) {
        Node<T> variavel = first;
        if (isEmpty() || size <= pos || pos < 0)
            return null;
        while (pos > 0) {
            variavel = variavel.getNext();
            pos--;
        }
        return variavel.getValue();
    }

    // Remove o primeiro elemento da lista (se for vazia nao faz nada)
    public void removeFirst() {
        if (isEmpty())
            return;
        {
            first = first.getNext();
        }
        size--;
    }

    // Remove o ultimo elemento da lista (se for vazia nao faz nada)
    public void removeLast() {
        if (isEmpty())
            return;
        if (size == 1) {
            first = null;
        } else {
            // Ciclo com for e uso de de size para mostrar alternativa ao while
            Node<T> cur = first;
            for (int i = 0; i < size - 2; i++)
                cur = cur.getNext();
            cur.setNext(cur.getNext().getNext());
        }
        size--;
    }

    // Remove um elemento numa dada posição e devolve-o
    public T remove(int pos) {
        Node<T> variavel = first;

        if (isEmpty() || size <= pos || pos < 0) {
            return null;
        }

        if (pos == 0) {
            T valor_imprimir = first.getValue();
            removeFirst();
            return valor_imprimir;
        }

        else {
            for (int i = 0; i < pos - 1; i++) {
                variavel = variavel.getNext();
            }
            T valor_imprimir = variavel.getNext().getValue();
            variavel.setNext(variavel.getNext().getNext());
            size--;
            return valor_imprimir;
        }
    }

    // Converte a lista para uma String
    public String toString() {
        String str = "{";
        Node<T> cur = first;
        while (cur != null) {
            str += cur.getValue();
            cur = cur.getNext();
            if (cur != null)
                str += ",";
        }
        str += "}";
        return str;
    }

    // Cópia de uma lista (cria e devolve uma nova lista -> a copiada)
    public SinglyLinkedList<T> copy() {
        SinglyLinkedList<T> list = new SinglyLinkedList<T>();
        Node<T> current = this.first;
        while (current != null) {
            list.addLast(current.getValue());
            current = current.getNext();
        }
        return list;
    }

    // Duplica cada elemneto da lista
    public void duplicate() {
        Node<T> current = first;

        while(current != null) {
            Node<T> next = current.getNext();
            Node<T> node = new Node<T>(current.getValue(), next);
            current.setNext(node);
            current = next;
        }
        size *= 2;
    }

    // Conta e devolveo número de ocorrências de um valor
    public int count(T value) {
        int count = 0;
        Node<T> current = first;

        while(current != null) {
            if(value.equals(current.getValue())) {
                count += 1;
            }
            current = current.getNext();
        }
        return count;
    }

    // Remove da lista todas as ocorrências de um valor
    public void removeAll(T value) {
        int position = 0;
        Node<T> current = first;

        while(current != null) {
            if(value.equals(current.getValue())) {
                remove(position);
                position--;
            }
            position++;
            current = current.getNext();
        }
    }

    public SinglyLinkedList<T> cut(int a, int b) {
        SinglyLinkedList<T> list = new SinglyLinkedList<T>();
        Node<T> cur = first;
        for(int i = 0; i < a; i++) {
            cur = cur.getNext();
        }
        for(int i = a; i <= b; i++) {
            list.addLast(cur.getValue());
            cur = cur.getNext();
        }
        return list;
    }

    public void shift(int k) {
        for(int i = 0; i < k; i++) {
            addFirst(getLast());
            removeLast();
        }
    }
}
