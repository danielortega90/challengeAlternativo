package com.challengeAl.Al.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

import lombok.Data;


@Entity
@Data
@Table(name ="icono_geografico")

public class IconoGeograficoEntity {
	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	    private Long id_icono;
	    @Column
	    @NotNull
	    private String imgen;
	    @Column
	    @NotNull
	    private String denominacion;
	    @Column(name = "`fecha_de_creacion`")
	    @NotNull
	    @DateTimeFormat
	    private LocalDateTime  fechaCreacion;
	    @Column
	    @NotNull
	    private Float altura;
	    @Column
	    @NotNull
	    private String historia;
	    @Column(name = "`ciudad_encontrada`")
	    @NotNull
	    private String ciudadEncontrada;
	    @ManyToOne()
	    @JoinColumn(name = "pais_id")
	    private CiudadPaisEntity pais;
}
