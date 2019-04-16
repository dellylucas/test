package com.dfl9.apptst.Model;

import java.util.List;

public interface EstudianteDAO {

    void inserta (Estudiante est) throws Exception;
    void elijmi (Estudiante est) throws Exception;
    void modif (Estudiante est) throws Exception;
    List<Estudiante> consult () throws Exception;
}
