package dato;

import java.io.*;
import modelo.*;


public class GestorDatos {

    //leer un archivo TXT y traspasarlo a una lista de objetos
    //metodo para leer archivos libro
    public static void leerArchivosLibro(Biblioteca biblioteca, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            //Lee cada linea del archivo hasta que la linea sea nula
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");
                //creacion de libro, libro tiene nombreLibro, autor, editorial, ISBN
                biblioteca.getListaLibros().add(new Libro(data[0], data[1], data[2], data[3]));
            }
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
    }

    //metodo para leer archivos bibliotecario
    public static void leerArchivosBibliotecario(Biblioteca biblioteca, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            //Lee cada linea del archivo hasta que la linea sea nula
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");
                //creacion de bibliotecario, bibliotecario tiene nombreBibliotecario, rut, numeroTelefonico
                biblioteca.getListaBibliotecarios().add(new Bibliotecario(data[0], data[1], data[2], data[3]));
            }
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
    }

    //metodo para leer archivos usuario
    public static void leerArchivosUsuario(Biblioteca biblioteca, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            //Lee cada linea del archivo hasta que la linea sea nula
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");
                //creacion de usuario, usuario tiene nombreUsuario, rut, numeroTelefonico
                biblioteca.getListaUsuarios().add(new Usuario(data[0], data[1], data[2]));
            }
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
    }

    //metodo para leer archivos prestamo
    public static void leerArchivosPrestamo(Biblioteca biblioteca, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            //Lee cada linea del archivo hasta que la linea sea nula
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");
                //creacion de prestamo, prestamo tiene bibliotecario, usuario, libro, fechaInicio, fechaTermino
                biblioteca.getListaPrestamos().add(new Prestamo(new Bibliotecario(data[0], data[1], data[2], data[3]), new Usuario(data[4], data[5], data[6]), new Libro(data[7], data[8], data[9], data[10]), data[11], data[12]));
            }
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
    }

    //metodo para registrar datos en un archivo
    public static boolean registrarDato(Object objeto, String direccionArchivo) {
        boolean lineaVacia=false;
        try {
            File file = new File(direccionArchivo);
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia=true;
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);

            if(!lineaVacia){
                bw.newLine();
            }
            bw.write(objeto.toString());
            bw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar dato, favor contactar con administrador");
            return false;
        }
    }
}