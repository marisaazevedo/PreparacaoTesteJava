public interface MyQueue<T> {
   public void enqueue(T v); // Coloca um valor no final da fila
   public T dequeue();       // Retira e retorna o valor no inicio da fila
   public T first();         // Retorna valor no inicio da fila
   public int size();        // Retorna quantidade de elementos na fila
   public boolean isEmpty(); // Indica se a fila esta vazia
}
