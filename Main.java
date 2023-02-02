public class Main {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila();

        for (int i =0; i<10; i++){
            pila.push(i);
            System.out.println("insertado " + i);
        }

        for (int i =0;i< 10;i++){
            System.out.println("extraído " + pila.pop());
        }
    }
}