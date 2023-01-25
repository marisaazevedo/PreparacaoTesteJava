public class DNode<T> {
    private T value;        // Valor guardado no nó
    private DNode<T> prev;  // Referência para o nó anterior da lista
    private DNode<T> next;  // Referência para o próximo nó da lista

    // Construtor
    DNode(T v, DNode<T> p, DNode<T> n) {
        value = v;
        prev = p;
        next = n;
    }

    // Getters e Setters
    public T getValue() {
        return value;
    }
    public DNode<T> getPrev() {
        return prev;
    }
    public DNode<T> getNext() {
        return next;
    }
    public void setValue(T v) {
        value = v;
    }
    public void setPrev(DNode<T> p) {
        prev = p;
    }
    public void setNext(DNode<T> n) {
        next = n;
    }
}
