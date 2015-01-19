package practica1;

import Articulo.Articulo;
import Bodega.Bodega;
import java.util.List;
import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {

        Bodega oBodega = crearDatosPrueba();
       
        Scanner teclado = new Scanner(System.in);


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
                    
                    oBodega.MostrarArticulos();

                    break;
                case 2:

                    System.out.println("1.Comprar artículo ya existente");
                    System.out.println("2.Comprar nuevo artículo");
                    char temp = teclado.next().charAt(0);

                    if (temp == '1') {

                        System.out.println("Ingresa el código del artículo");
                        oBodega.AgregarCantidad(teclado.nextInt());

                    }
                    if (temp == '2') {

                        System.out.println("Ingresa un código");
                        int codigo = teclado.nextInt();
                        System.out.println("Ingresa un nombre o descripción");
                        String descripcion = teclado.next();
                        System.out.println("Ingresa la marca");
                        String marca = teclado.next();
                        System.out.println("Ingresa el precio");
                        double precio = teclado.nextDouble();
                        System.out.println("Ingresa la cantidad");
                        int cantidad = teclado.nextInt();

                        Articulo nuevo = new Articulo(codigo, cantidad, marca, precio, descripcion);
                        oBodega.nuevoArticulo(nuevo);

                    }

                    break;

                case 3:
                    
                    System.out.println("Ingresa el código del artículo");
                    int codigo=teclado.nextInt();
                    oBodega.VenderArticulo(codigo);
                    

             

                    break;

                case 4:
                    System.exit(0);
                    
                default:
                    System.out.println("Número equivocado, ingresa otro número de opción");

            }
            System.out.println("\n");
            System.out.println("¿Desea continuar con otra opción?");
            continuar = teclado.next().charAt(0);
            System.out.println("\n");
        } while ((continuar == 's') || (continuar == 'S'));

  

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

        Articulo Frijoles = new Articulo(005, 2, "Patito", 2000, "Zepol");
        oBodega.nuevoArticulo(Frijoles);

        return oBodega;

    }

}
