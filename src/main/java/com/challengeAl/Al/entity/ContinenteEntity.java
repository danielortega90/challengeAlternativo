package com.challengeAl.Al.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name="continete")
public class ContinenteEntity<CiudadPasiEntity> {
 
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_continente")
	    private Long idContinente;
	    @Column
	    @NotNull
	    private String img;
	    @Column
	    @NotNull
	    private String denominacion;
	    @Column(name = "ciudades_icon_geo")
	    @NotNull
	    private String ciudadesIconGeo;
	    @OneToMany(mappedBy = "ContinenteEntity")
	    private List<CiudadPasiEntity>ciudadPais;
}
