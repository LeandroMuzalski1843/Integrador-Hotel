package com.leandrom.hotel.models;

import javafx.beans.property.*;

public class Habitación {
    private final IntegerProperty habitacionId;
    private final IntegerProperty capacidad;
    private final StringProperty tipo;
    private final StringProperty tipoCama;
    private final StringProperty caracteristicas;
    private final FloatProperty precio;
    private final StringProperty estado;


    public Habitación(int habitacionId,int capacidad, String tipo, String tipoCama, String caracteristicas, float precio, String estado) {
        this.habitacionId = new SimpleIntegerProperty(habitacionId);
        this.capacidad = new SimpleIntegerProperty(capacidad);
        this.tipo = new SimpleStringProperty(tipo);
        this.tipoCama = new SimpleStringProperty(tipoCama);
        this.caracteristicas = new SimpleStringProperty(caracteristicas);
        this.precio = new SimpleFloatProperty(precio);
        this.estado = new SimpleStringProperty(estado);
    }

    public int getHabitacionId() {
        return habitacionId.get();
    }

    public IntegerProperty habitacionIdProperty() {
        return habitacionId;
    }

    public int getCapacidad() {
        return capacidad.get();
    }

    public IntegerProperty capacidadProperty() {
        return capacidad;
    }

    public String getTipo() {
        return tipo.get();
    }

    public StringProperty tipoProperty() {
        return tipo;
    }

    public String getTipoCama() {
        return tipoCama.get();
    }

    public StringProperty tipoCamaProperty() {
        return tipoCama;
    }

    public String getCaracteristicas() {
        return caracteristicas.get();
    }

    public StringProperty caracteristicasProperty() {
        return caracteristicas;
    }

    public float getPrecio() {
        return precio.get();
    }

    public FloatProperty precioProperty() {
        return precio;
    }

    public String getEstado() {
        return estado.get();
    }

    public StringProperty estadoProperty() {
        return estado;
    }
}
