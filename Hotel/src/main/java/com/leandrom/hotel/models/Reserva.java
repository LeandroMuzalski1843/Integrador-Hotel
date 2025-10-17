package com.leandrom.hotel.models;

import javafx.beans.property.*;
import java.time.LocalDate;


public class Reserva {
    private final IntegerProperty reservaId;
    private final IntegerProperty clienteId;
    private final IntegerProperty habitacionId;
    private final ObjectProperty<LocalDate> fechaEntrada;
    private final ObjectProperty<LocalDate> fechaSalida;
    private final FloatProperty abonoInicial;
    private final StringProperty estado;

    public Reserva(int reservaId,int clienteId, int habitacionId,LocalDate fechaEntrada, LocalDate fechaSalida,String estado, float abonoInicial) {
        this.reservaId = new SimpleIntegerProperty(reservaId);
        this.clienteId = new SimpleIntegerProperty(clienteId);
        this.habitacionId = new SimpleIntegerProperty(habitacionId);
        this.fechaEntrada = new SimpleObjectProperty<>(fechaEntrada);
        this.fechaSalida = new SimpleObjectProperty<>(fechaSalida);
        this.estado = new SimpleStringProperty(estado);
        this.abonoInicial = new SimpleFloatProperty(abonoInicial);

    }

    public int getReservaId() {
        return reservaId.get();
    }

    public IntegerProperty reservaIdProperty() {
        return reservaId;
    }

    public int getClienteId() {
        return clienteId.get();
    }

    public IntegerProperty clienteIdProperty() {
        return clienteId;
    }

    public int getHabitacionId() {
        return habitacionId.get();
    }

    public IntegerProperty habitacionIdProperty() {
        return habitacionId;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada.get();
    }

    public ObjectProperty<LocalDate> fechaEntradaProperty() {
        return fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida.get();
    }

    public ObjectProperty<LocalDate> fechaSalidaProperty() {
        return fechaSalida;
    }

    public float getAbonoInicial() {
        return abonoInicial.get();
    }

    public FloatProperty abonoInicialProperty() {
        return abonoInicial;
    }

    public String getEstado() {
        return estado.get();
    }

    public StringProperty estadoProperty() {
        return estado;
    }
}
