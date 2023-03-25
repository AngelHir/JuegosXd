package PkJuegos;

import java.util.Scanner;

public class Juegos {

    static String titulo;

    static String clasificacion;

    String genero;

    int anio;

    double precio;

    String version;

    String desarrollardor;

    String plataforma;

    String tipo_conexion;

    double calificacion;

    String idioma;


    Juegos(String titulo, String clasificacion, String genero, String version, String desarrollardor, String plataforma, String tipo_conexion, String idioma,
           int anio, double precio, double calificacion){

        this.titulo =titulo;
        this.clasificacion=clasificacion;
        this.genero=genero;
        this.version=version;
        this.desarrollardor=desarrollardor;
        this.plataforma=plataforma;
        this.tipo_conexion=tipo_conexion;
        this.idioma=idioma;
        this.anio=anio;
        this.precio=precio;
        this.calificacion=calificacion;

    }



    public  String getTitulo() {
        return titulo;
    }

    public  String getClasificacion() {
        return clasificacion;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getVersion() {
        return version;
    }

    public String getDesarrollardor() {
        return desarrollardor;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getTipo_conexion() {
        return tipo_conexion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void setDesarrollardor(String desarrollardor) {
        this.desarrollardor = desarrollardor;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTipo_conexion(String tipo_conexion) {
        this.tipo_conexion = tipo_conexion;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


    public static JuegoMovil agregarDatos(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los siguientes datos juego movil:");

        System.out.print("Titulo : ");
        String titulo = sc.nextLine();

        System.out.print("Clasificacion: ");
        String clasificacion = sc.nextLine();

        System.out.print("Genero: ");
        String genero = sc.nextLine();

        System.out.print("Version: ");
        String version = sc.nextLine();

        System.out.print("Desarrollador: ");
        String desarrollador = sc.nextLine();

        System.out.print("Plataforma: ");
        String plataforma = sc.nextLine();

        System.out.print("Tipo de conexion: ");
        String tipo_conexion = sc.nextLine();

        System.out.print("Idioma: ");
        String idioma = sc.nextLine();

        System.out.print("Calificación: ");
        double calificacion = sc.nextDouble();
        sc.nextLine();

        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        sc.nextLine();

        System.out.print("Pantalla tactil: ");
        String pantalla_tactil = sc.nextLine();

        System.out.print("Portabilidad: ");
        String portabilidad = sc.nextLine();


        System.out.print("Año: ");
        int anio = sc.nextInt();
        sc.nextLine();

        JuegoMovil juegoMovil= new JuegoMovil(titulo,clasificacion,genero,version,desarrollador,plataforma,tipo_conexion,idioma,
                anio,precio,calificacion,pantalla_tactil,portabilidad);

        return juegoMovil;
    }



}
