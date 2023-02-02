import java.util.LinkedList;

public class Pila<T> extends LinkedList<T> {

    public void push (T elemento){
        this.addLast(elemento);
    }

    public T pop(){
        return this.pollLast();
    }
}
