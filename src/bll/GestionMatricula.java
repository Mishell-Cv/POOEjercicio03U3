/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import Castillo.BaseBllCrud;
import Castillo.BasePersistencia;
import Castillo.Util;
import beu.Curso;
import beu.Estudiante;
import beu.Matricula;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labctr
 */
public class GestionMatricula extends BasePersistencia<Matricula>
        implements BaseBllCrud<Matricula> {

    private Matricula matricula;
    private final String directorio = "Matriculas";

    public GestionMatricula() {
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public String imprimir() {
        DecimalFormat dc = new DecimalFormat("#.##");
        float promedio = matricula.getPromedio();
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante: ").append(matricula.getEstudiante()).append("\n");
        sb.append("Curso: ").append(matricula.getCurso().getTitulo()).append("\n");
        sb.append("Promedio: ").append(dc.format(promedio)).append("\n");
        sb.append(matricula.imprimirDetalle());
        return sb.toString();
    }

    public String calificar(float valor) {
        String mensaje = "";
        int num = this.matricula.addCalificacion(valor);
        switch (num) {
            case 0:
                mensaje += "\nYa se han registrado todas las notas del estudiante\n";
                break;
            case 1:
                mensaje += "\nNota de la Primera Unidad Regsitrada Correctamente\n";
                break;
            case 2:
                mensaje += "\nNota de la Segunda Unidad Regsitrada Correctamente\n";
                break;
            case 3:
                mensaje += "\nNota de la Tercera Unidad Regsitrada Correctamente\n";
                break;
            default:
                mensaje += "\nExiste un error al momento de registrar la calificación\n";
        }
        return mensaje;
    }

    public void promediar() {
        this.matricula.calcularPromedio();
    }

    public void archivar() throws IOException {
        /*String resultado = "";
        String nombreArchivo = "matricula_" + matricula.getNumero() + ".json";
        try {
            try (FileWriter archivo = new FileWriter(nombreArchivo)) {
                archivo.write(matricula.toSave());
            }
            resultado += "Matricula " + matricula.getNumero() + " archivada correctamente\n";
        } catch (IOException e) {
            resultado = "¡Error: ! " + e.toString();
        }
        return resultado;*/

        this.escribir(directorio, this.matricula.getNumero(), matricula);
    }

    public void configurar(Curso curso, Estudiante est) {
        this.matricula.setCurso(curso);
        matricula.setEstudiante(est);
    }

    public List<Matricula> reportar(String titulo) throws IOException {
        List<Matricula> resultado = new ArrayList<>();
        List<String> contenido = this.leerDirectorio(directorio, titulo);
        for (String texto : contenido) {

            GsonBuilder gb = new GsonBuilder();
            gb.setPrettyPrinting();
            Gson gson = gb.create();
            try {
                Matricula m = gson.fromJson(texto, Matricula.class);
                resultado.add(m);
            } catch (JsonSyntaxException ex) {
                Util.imprimir("El archivo no se pudo convertir en Matrícula"+ex.toString()+"\n");
            }

        }
        return resultado;
    }

    @Override
    public void crear() {
        matricula = new Matricula();
    }

    @Override
    public void consultar(String id) throws IOException {
        String archivo = id + ".json";
        String contenido = this.leer(directorio, archivo);
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        matricula = gson.fromJson(contenido, Matricula.class);
    }

    @Override
    public void actualizar() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
