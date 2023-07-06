package com.example.data;

public class Usuarios {

    private String documento;
    private String tipoDocumento;
    private String nombres;
    private String apellidos;
    private String contraseña;
    private String telefono;
    private String rol;

    public Usuarios(String documento, String tipoDocumento, String nombres, String apellidos, String contraseña, String telefono, String rol) {
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.rol = rol;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "documento=" + documento + ", tipoDocumento=" + tipoDocumento + ", nombres=" + nombres + ", apellidos=" + apellidos + ", contrase\u00f1a=" + contraseña + ", telefono=" + telefono + ", rol=" + rol + '}';
    }

    public Usuarios() {
    }

}
