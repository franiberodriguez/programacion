//Crea una clase Contador que inicie un valor (introducido) y tenga métodos para:
//incrementra, disminuir y obtenerValor

public class Contador {
    private int valor;

    public Contador(int valorInicial) {
        this.valor = valorInicial;
    }

    public void incrementar() {
        this.valor++;
    }

    public void decrementar() {
        this.valor--;
    }

    public int obtenerValor() {
        return this.valor;
    }
}

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador(0);
        System.out.println("Valor inicial: " + contador.obtenerValor());
        
        contador.incrementar();
        System.out.println("Después de incrementar: " + contador.obtenerValor());
        
        contador.decrementar();
        System.out.println("Después de decrementar: " + contador.obtenerValor());
    }
}