package es.home.almacen.dto;

// Generated 11-mar-2011 12:03:37 by Hibernate Tools 3.3.0.GA

import java.util.HashSet;
import java.util.Set;

/**
 * Grupo generated by hbm2java
 */
public class GrupoDTO implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Integer idgrupo;
    private String nombre;
    private Set<DiscoDTO> discos = new HashSet<DiscoDTO>(0);

    public GrupoDTO() {
    }

    public GrupoDTO(String nombre) {
	this.nombre = nombre;
    }

    public GrupoDTO(String nombre, Set<DiscoDTO> discos) {
	this.nombre = nombre;
	this.discos = discos;
    }

    public Set<DiscoDTO> getDiscos() {
	return this.discos;
    }

    public Integer getIdgrupo() {
	return this.idgrupo;
    }

    public String getNombre() {
	return this.nombre;
    }

    public void setDiscos(Set<DiscoDTO> discos) {
	this.discos = discos;
    }

    public void setIdgrupo(Integer idgrupo) {
	this.idgrupo = idgrupo;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

}