package repaso;

public class Operaciones {

    private double valor;

    public Operaciones() {

        this.valor = 0;
    }

    public double sumar(double valor) {

        return this.valor += valor;

    }

    public double restar(double valor) {

        return this.valor -= valor;

    }

    public double multiplicar(double valor) {

        return this.valor *= valor;

    }

    public double dividir(double valor) {

        if (valor == 0) {

            System.out.println("No es posible dividir entre cero");
            return this.valor;
        } else {

            return this.valor /= valor;

        }

    }

}
