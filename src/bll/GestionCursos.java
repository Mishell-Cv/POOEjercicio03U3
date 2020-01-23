/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import Castillo.BasePersistencia;
import beu.Curso;
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
public class GestionCursos extends BasePersistencia<Curso>{

    private List<Curso> cursos = new ArrayList<>();

    public GestionCursos() {

    }

    public List<Curso> getCursos() throws IOException {
    
        String contenido = this.leer("cursos", "cursos.json");
        
        //Nos ayuda a darle estructura al texto que esta en un archivo
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        
        Type listType = new TypeToken<ArrayList<Curso>>(){}.getType();
        cursos = gson.fromJson(contenido, listType);
        
        return cursos;
    }
    
    

}
