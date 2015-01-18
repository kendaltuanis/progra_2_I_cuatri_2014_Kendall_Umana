package practica1;

import Articulo.Articulo;
import Bodega.Bodega;
import java.util.List;
import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {

        Bodega oBodega = crearDatosPrueba();
        Articulo jabon = oBodega.buscarArticulo(001);
        Scanner teclado = new Scanner(System.in);

        if (jabon == null) {
            System.out.println("Artículo inexistente");
            return;
        }

        int opcion = 0;
        char continuar = ' ';

        do {
            System.out.println("Digite una opción");
            System.out.println("1.Ver artículos ");
            System.out.println("2.Comprar artículos ");
            System.out.println("3.Vender artículos ");
            System.out.println("4.Salir ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    int cont = 0;
                    
                    for (Articulo articulo : oBodega.getArticulos()) {
                        
                        if (cont == 0) {
                            System.out.println("Codigo:           " + "Nombre del Artículo:              " + "Marca:          " + "Precio:          " + "Cantidad     "+"\n");
                            cont++;
                        } 
                            System.out.println(" "+articulo.getCodigo()+"                 " + articulo.getDescripcion() +"                            "  + articulo.getMarca()+"          " + articulo.getPrecio()+"              " + articulo.getCantidad());               
                    }

                    break;
                case 2:
                    
         

                    break;

                case 3:

                    break;

            }
            System.out.println("\n");
            System.out.println("¿Desea continuar con otro ejercicio?");
            continuar = teclado.next().charAt(0);
        } while ((continuar == 's') || (continuar == 'S'));

        System.out.println("Artículo encontrado");

        jabon.Venta(3);

    }

    public static Bodega crearDatosPrueba() {

        Bodega oBodega = new Bodega("Bodega #1");

        Articulo jabon = new Articulo(001, 2, "Luxure", 500, "Jabón");
        oBodega.nuevoArticulo(jabon);

        Articulo Cepillo = new Articulo(002, 1, "Patito", 1500, "Cofal");
        oBodega.nuevoArticulo(Cepillo);

        Articulo Pasta = new Articulo(003, 5, "Colgat", 1500, "Pasta");
        oBodega.nuevoArticulo(Pasta);

        Articulo Arroz = new Articulo(004, 3, "Elefan", 2500, "Arroz");
        oBodega.nuevoArticulo(Arroz);

        Articulo Frijoles = new Articulo(005, 0, "Patito", 2000, "Zepol");
        oBodega.nuevoArticulo(Frijoles);

        return oBodega;

    }

}
