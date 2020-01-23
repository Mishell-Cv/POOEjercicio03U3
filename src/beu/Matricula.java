/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beu;

import java.util.Calendar;
import Castillo.Persona;
import Castillo.Unidad;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author labctr
 */
public class Matricula {

    private final String numero;
    private Calendar fecha;
    private Estado estado;
    private Persona estudiante;
    private Curso curso;
    private final List<Calificacion> calificaciones = new ArrayList<>();
    //Información
    private float promedio;

    public Matricula() {
        fecha = Calendar.getInstance();
        estado = Estado.Registrado;
        UUID numeroAleatorio = UUID.randomUUID();
        this.numero = numeroAleatorio.toString();
    }

    public String getNumero() {
        return numero;
    }


    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Persona getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Persona estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public float getPromedio() {
        return promedio;
    }

    public void calcularPromedio() {
        float suma = 0;
        for (Calificacion c : calificaciones) {
            suma += c.valor; //Se puede acceder al atributo por que es una Clase Interna
        }
        if (this.calificaciones.isEmpty()) {
            return;
        }
        int divisor = this.calificaciones.size();
        float resultado = (float) suma / divisor;
        promedio = Math.round(resultado);

        if (divisor == 3) {
            if (promedio > 14) {
                this.estado = Estado.Aprobado;
            } else {
                this.estado = Estado.Reprobado;
            }
        }
    }

    //Este método registra una calificación y retorna un núemro
    //1 si es la nota de la unidad 1
    //2 Si es la nota de la unidad 2
    //3 Si es la nota de la unidad 3
    // 0 si ya tiene todas las notas
    public int addCalificacion(float v) {
        Calificacion cal = new Calificacion();
        int cuentaNotas = this.calificaciones.size();
        switch (cuentaNotas) {
            case 0:
                cal.setUnidad(Unidad.I);
                break;
            case 1:
                cal.setUnidad(Unidad.II);
                break;
            case 2:
                cal.setUnidad(Unidad.III);
                break;
            default:
                return 0; //En caso de tener todas las notas retorna 0
        }
        cal.setValor(v);
        cal.setFecha(Calendar.getInstance());
        this.calificaciones.add(cal);
        this.calcularPromedio();
        //Retorna el tamaño de la lista
        return this.calificaciones.size();
    }

    @Override
    public String toString() {
        return estudiante.toString() + " #" + numero;
    }
    
    public String toSave(){
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        return gson.toJson(this);
    }

    public String imprimirDetalle() {
        String str = "\t" + this.estudiante + "\t";
        for (Calificacion c : calificaciones) {
            str += "\t" + c.getValor();
        }
        str += "\t\t" + this.promedio + "\n";
        return str;
    }

    public String VerListado() {
        String str = "\t" + this.estudiante + "\t";
        for (Calificacion c : calificaciones) {
            str += "\t" + c.getValor();
        }
        str += "\t\t" + this.promedio;
        str += "\t"+ this.estado + "\n";
        return str;
    }
    

    class Calificacion {

        private Calendar fecha;
        private float valor;
        private Unidad unidad;

        public Calificacion() {
        }

        public Calendar getFecha() {
            return fecha;
        }

        public void setFecha(Calendar fecha) {
            this.fecha = fecha;
        }

        public float getValor() {
            return valor;
        }

        public void setValor(float valor) {
            this.valor = valor;
        }

        public Unidad getUnidad() {
            return unidad;
        }

        public void setUnidad(Unidad unidad) {
            this.unidad = unidad;
        }

        @Override
        public String toString() {
            return "" + valor;
        }

    }

}
