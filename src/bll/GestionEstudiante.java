/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import Castillo.BasePersistencia;
import beu.Estudiante;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labctr
 */
public class GestionEstudiante extends BasePersistencia<Estudiante> {
    
    private List<Estudiante> estudiantes = new ArrayList<>();
    private final String directorio = "estudiantes";

    public GestionEstudiante() {
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    public List<Estudiante> leerEstudiantes() throws IOException {
    
        String contenido = this.leer(directorio, "estudiantes.json");
        
        //Nos ayuda a darle estructura al texto que esta en un archivo
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        
        Type listType = new TypeToken<ArrayList<Estudiante>>(){}.getType();
        estudiantes = gson.fromJson(contenido, listType);
        
        return estudiantes;
    }
    
    public void archivar() throws IOException{
        
        this.escribir(directorio, "estudiantes", estudiantes);
    }
    
}