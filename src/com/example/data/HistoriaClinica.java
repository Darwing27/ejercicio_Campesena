package com.example.data;

public class HistoriaClinica {

    private String animal;
    private String codigo_animal;
    private String Procedimiento;
    private String Usuario;
    private String Id_Usuario;
    private String Observaciones;
    private String Fecha;
    private String Consecutivo;

    public HistoriaClinica() {
    }

    public HistoriaClinica(String animal, String Procedimiento, String Usuario, String Observaciones, String Fecha, String Consecutivo) {
        this.animal = animal;
        this.Procedimiento = Procedimiento;
        this.Usuario = Usuario;
        this.Observaciones = Observaciones;
        this.Fecha = Fecha;
        this.Consecutivo = Consecutivo;

    }

    public HistoriaClinica(String animal, String codigo_animal, String Procedimiento, String Usuario, String Id_Usuario, String Observaciones, String Fecha, String Consecutivo) {
        this.animal = animal;
        this.codigo_animal = codigo_animal;
        this.Procedimiento = Procedimiento;
        this.Usuario = Usuario;
        this.Id_Usuario = Id_Usuario;
        this.Observaciones = Observaciones;
        this.Fecha = Fecha;
        this.Consecutivo = Consecutivo;
    }

    public String getCodigo_animal() {
        return codigo_animal;
    }

    public void setCodigo_animal(String codigo_animal) {
        this.codigo_animal = codigo_animal;
    }

    public String getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(String Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }
    

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getConsecutivo() {
        return Consecutivo;
    }

    public void setConsecutivo(String Consecutivo) {
        this.Consecutivo = Consecutivo;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getProcedimiento() {
        return Procedimiento;
    }

    public void setProcedimiento(String Procedimiento) {
        this.Procedimiento = Procedimiento;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    @Override
    public String toString() {
        return "HistoriaClinica{" + "animal=" + animal + ", codigo_animal=" + codigo_animal + ", Procedimiento=" + Procedimiento + ", Usuario=" + Usuario + ", Id_Usuario=" + Id_Usuario + ", Observaciones=" + Observaciones + ", Fecha=" + Fecha + ", Consecutivo=" + Consecutivo + '}';
    }

    

}
