
package co.com.hss.peliculas.presentacion;

import co.com.hss.peliculas.servicio.*;
import java.util.Scanner;


public class CatalogoPeliculasPresentacion {
    
    public static void main(String[] args) {
        
        var opcion = -1;
        var scanner = new Scanner(System.in);
        
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        while(opcion !=0){
            System.out.println("""
                               Elige una opcion: 
                               1. Iniciar Catalogo Peliculas
                               2. Agregar Peliculas
                               3. Listar Peliculas
                               4. Buscar Pelicula
                               0. Salir""");
            
            opcion =  Integer.parseInt(scanner.nextLine());
            
            switch(opcion){
                case 1 -> catalogo.iniciarCatalogoPeliculas();
                    
                case 2 -> {
                    System.out.println("Ingrese el nombre de la pelicula");
                    var nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                }
                    
                case 3 -> catalogo.listarPeliculas();
                    
                case 4 -> {
                    System.out.println("Introduce una pelicula a Buscar");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                }
                    
                case 0 -> System.out.println("Hasta luego!");
                    
                default -> System.out.println("Opcion no Reconocida.");
                      
            
           }                   
            
        }
        
    }
    
}
