package es.home.almacen.bean;

// Generated 11-mar-2011 12:03:37 by Hibernate Tools 3.3.0.GA

import java.util.HashSet;
import java.util.Set;

/**
 * Componente generated by hbm2java
 */
public class Componente implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int idcomponente;
    private String nombre;
    private Set<Participante> participantes = new HashSet<Participante>(0);

    public Componente() {
    }

    public Componente(String nombre) {
	this.nombre = nombre;
    }

    public Componente(String nombre, Set<Participante> participantes) {
	this.nombre = nombre;
	this.participantes = participantes;
    }

    public int getIdcomponente() {
	return this.idcomponente;
    }

    public String getNombre() {
	return this.nombre;
    }

    public Set<Participante> getParticipantes() {
	return this.participantes;
    }

    public void setIdcomponente(int idcomponente) {
	this.idcomponente = idcomponente;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public void setParticipantes(Set<Participante> participantes) {
	this.participantes = participantes;
    }

}
