package poo;

public class ExemploJava {

    static int valor = 0;
    int value = 0;

    public ExemploJava() {
        valor++;
        value++;
    }

    public static void main() {
        new ExemploJava();
        new ExemploJava();
        new ExemploJava();
        new ExemploJava();
        new ExemploJava();

        ExemploJava ex = new ExemploJava();
        System.out.println(ex.value);
        System.out.println(ExemploJava.valor);
    }
}