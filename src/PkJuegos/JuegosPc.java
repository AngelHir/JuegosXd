package PkJuegos;

import java.util.Date;

public class JuegosPc extends Juegos{

    String editor;

    String tipo_teclado;

    JuegosPc(String titulo, String clasificacion, String genero, String version, String desarrollardor, String plataforma, String tipo_conexion,
             String idioma, Date anio, double precio, double calificacion, String editor, String tipo_teclado) {

        super(titulo, clasificacion, genero, version, desarrollardor, plataforma, tipo_conexion, idioma, anio, precio, calificacion);
        this.editor=editor;
        this.tipo_teclado=tipo_teclado;
    }

    public String getEditor() {
        return editor;
    }

    public String getTipo_teclado() {
        return tipo_teclado;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void setTipo_teclado(String tipo_teclado) {
        this.tipo_teclado = tipo_teclado;
    }
}
