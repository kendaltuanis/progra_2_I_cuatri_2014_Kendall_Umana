package Bodega;

import Articulo.Articulo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bodega {

    Scanner teclado = new Scanner(System.in);

    private String nombre;

    private List<Articulo> articulos;

    public Bodega(String nombre) {
        this.nombre = nombre;
        this.articulos = new ArrayList<>();
    }

    public void nuevoArticulo(Articulo articulo) {

        this.articulos.add(articulo);
    }

    public Articulo buscarArticulo(int codigo) {

        for (Articulo articulo : this.articulos) {

            if (articulo.getCodigo() == codigo) {

                return articulo;
            }
        }

        return null;
    }

    public Articulo MostrarArticulos() {

        int cont = 0;

        for (Articulo articulo : this.articulos) {

            if (cont == 0) {
                System.out.println("Codigo:           " + "Nombre del Artículo:              " + "Marca:          " + "Precio:          " + "Cantidad     " + "\n");
                cont++;
            }
            System.out.println(" " + articulo.getCodigo() + "                 " + articulo.getDescripcion() + "                            " + articulo.getMarca() + "          " + articulo.getPrecio() + "              " + articulo.getCantidad());
        }
        return null;
    }

    public Articulo AgregarCantidad(int codigo) {

        for (Articulo articulo : this.articulos) {

            if (articulo.getCodigo() == codigo) {
                System.out.println("Ingresa la cantidad a agregar");
                int cantidad = teclado.nextInt();
                articulo.setCantidad(articulo.getCantidad() + cantidad);
                System.out.println("Artículo agregado");

            }
        }

        return null;
    }

    public Articulo VenderArticulo(int codigo) {

        for (Articulo articulo : this.articulos) {

            if (articulo.getCodigo() == codigo) {

                System.out.println("Codigo:           " + "Nombre del Artículo:              " + "Marca:          " + "Precio:          " + "Cantidad     " + "\n");
                System.out.println(" " + articulo.getCodigo() + "                 " + articulo.getDescripcion() + "                            " + articulo.getMarca() + "          " + articulo.getPrecio() + "              " + articulo.getCantidad());
                System.out.println("¿Vender artículo?");

                char op = teclado.next().charAt(0);

                if (op == 's' || op == 'S') {
                    System.out.println("Ingresa la cantidad");
                    int cantidad = teclado.nextInt();

                    if (cantidad > articulo.getCantidad()) {

                        System.out.println("Cantidad insuficiente para vender");

                    } else {

                        articulo.setCantidad(articulo.getCantidad() - teclado.nextInt());
                        System.out.println("Se ha realizado la venta satisfactoriamente");

                    }

                }
            }

        }

        return null;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

}
