package com.leandrom.hotel.models;

import javafx.beans.property.*;

public class Usuario {
    private final IntegerProperty usuarioId;
    private final StringProperty nombreUsuario;
    private final StringProperty contrasenia;
    private final StringProperty rol;


    public Usuario(int usuarioId, String nombreUsuario, String contrasenia, String rol) {
        this.usuarioId = new SimpleIntegerProperty(usuarioId);
        this.nombreUsuario = new SimpleStringProperty(nombreUsuario);
        this.contrasenia = new SimpleStringProperty(contrasenia);
        this.rol = new SimpleStringProperty(rol);
    }

    public int getUsuarioId() {
        return usuarioId.get();
    }

    public IntegerProperty usuarioIdProperty() {
        return usuarioId;
    }

    public String getNombreUsuario() {
        return nombreUsuario.get();
    }

    public StringProperty nombreUsuarioProperty() {
        return nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia.get();
    }

    public StringProperty contraseniaProperty() {
        return contrasenia;
    }

    public String getRol() {
        return rol.get();
    }

    public StringProperty rolProperty() {
        return rol;
    }
}
