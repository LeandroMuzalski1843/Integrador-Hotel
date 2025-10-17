package com.leandrom.hotel.models;

import javafx.beans.property.*;

public class Clientes {
    private final IntegerProperty clienteId;
    private final StringProperty nombre;
    private final StringProperty correo;
    private final StringProperty telefono;
    //todavia no definido, mejorar más adelante
    private final BooleanProperty frecuente;


    public Clientes(int clienteId, String nombre, String correo, String telefono, boolean frecuente) {
        this.clienteId = new SimpleIntegerProperty(clienteId);
        this.nombre = new SimpleStringProperty(nombre);
        this.correo = new SimpleStringProperty(correo);
        this.telefono = new SimpleStringProperty(telefono);
        this.frecuente = new SimpleBooleanProperty(frecuente);
    }

    public int getClienteId() {
        return clienteId.get();
    }

    public IntegerProperty clienteIdProperty() {
        return clienteId;
    }

    public String getNombre() {
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public String getCorreo() {
        return correo.get();
    }

    public StringProperty correoProperty() {
        return correo;
    }

    public String getTelefono() {
        return telefono.get();
    }

    public StringProperty telefonoProperty() {
        return telefono;
    }

    public boolean isFrecuente() {
        return frecuente.get();
    }

    public BooleanProperty frecuenteProperty() {
        return frecuente;
    }
}
