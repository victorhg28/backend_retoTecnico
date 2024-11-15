package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="buses")
public class BusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column
    //private String marca;

    @Column
    private Long id_marca;

    @Column
    private String caracteristicas;

    @Column
    private String placa;

    @Column
    private Integer num_bus;

    @Column
    private String estado;

    @Column
    private LocalDate fecha_creacion;



    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_marca() {
        return this.id_marca;
    }

    public void setId_marca(Long id_marca) {
        this.id_marca = id_marca;
    }

    public String getCaracteristicas() {
        return this.caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getNum_bus() {
        return this.num_bus;
    }

    public void setNum_bus(Integer num_bus) {
        this.num_bus = num_bus;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFecha_creacion() {
        return this.fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    


}
