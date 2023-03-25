package PkJuegos;


public class JuegoMovil extends Juegos{

    String pantalla_tactil;

    String portabilidad;

    JuegoMovil(String titulo, String clasificacion, String genero, String version, String desarrollardor, String plataforma, String tipo_conexion,
               String idioma, int anio, double precio, double calificacion,String pantalla_tactil, String portabilidad) {

        super(titulo, clasificacion, genero, version, desarrollardor, plataforma, tipo_conexion, idioma, anio, precio, calificacion);
        this.pantalla_tactil=pantalla_tactil;
        this.portabilidad=portabilidad;
    }


    public String getPantalla_tactil() {
        return pantalla_tactil;
    }

    public String getPortabilidad() {
        return portabilidad;
    }

    public void setPantalla_tactil(String pantalla_tactil) {
        this.pantalla_tactil = pantalla_tactil;
    }

    public void setPortabilidad(String portabilidad) {
        this.portabilidad = portabilidad;
    }


   /* public static void mostrarDatos(){
        System.out.println("Titulo: "+ getTitulo()+
                "\nClasificacion: "+ getClasificacion()+
                "\nGenero: "+ getGenero()+
                "\nVersion: "+getVersion()+
                "\nDesarrollador: "+getDesarrollardor()+
                "\nPlataforma: "+getPlataforma()+
                "\nTipo de conexion: "+getTipo_conexion()+
                "\nIdioma: "+getIdioma()+
                "\nAño: "+getAnio()+
                "\nPrecio: "+getPrecio()+
                "\nCalificacion: "+getCalificacion()+
                "\nPantalla tactil: "+pantalla_tactil+
                "\nPortabilidad: " );
    }*/
}
