package dao;

import java.util.List;

import modelo.Alumno;
import modelo.Grupo;

public interface AlumnoDao {

	int insertarAlumno(Alumno al) throws Exception;

	int insertarGrupo(Grupo gp) throws Exception;

	List<Alumno> mostrarAlumnos() throws Exception;

	void guardarTxtAlumnos() throws Exception;

	void leerTxtAlumnos() throws Exception;

	int cambiarNombre(String nombre, int id) throws Exception;

	void borrarPorPK(int id) throws Exception;

	void borrarPorApellido(String apellido) throws Exception;

	void borrarAlumnosPorCurso(String curso) throws Exception;

	void guardarJSONGrupos() throws Exception;

	void leerJSONGrupos() throws Exception;
}