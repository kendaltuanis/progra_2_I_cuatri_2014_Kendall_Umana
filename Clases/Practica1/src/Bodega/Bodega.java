package Bodega;

import Articulo.Articulo;
import java.util.ArrayList;
import java.util.List;

public class Bodega {

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
    
    public List<Articulo> getArticulos() {
        return articulos;
    }


}
