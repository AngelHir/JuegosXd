package PkJuegos;

import java.util.Date;

public class JuegosConsola extends Juegos{

    String tipo_consola;

    String tipo_mando;

    JuegosConsola(String titulo, String clasificacion, String genero, String version, String desarrollardor, String plataforma, String tipo_conexion,
                  String idioma, int anio, double precio, double calificacion, String tipo_consola, String tipo_mando) {

        super(titulo, clasificacion, genero, version, desarrollardor, plataforma, tipo_conexion, idioma, anio, precio, calificacion);
        this.tipo_consola=tipo_consola;
        this.tipo_mando=tipo_mando;
    }


    public String getTipo_consola() {
        return tipo_consola;
    }

    public String getTipo_mando() {
        return tipo_mando;
    }

    public void setTipo_consola(String tipo_consola) {
        this.tipo_consola = tipo_consola;
    }

    public void setTipo_mando(String tipo_mando) {
        this.tipo_mando = tipo_mando;
    }
}
