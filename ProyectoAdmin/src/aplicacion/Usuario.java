package aplicacion;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author basesdatos
 */
public class Usuario {

    private String idUsuario;
    private String clave;
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;
    private TipoUsuario tipo;
    private TipoPuesto puesto;
    private Integer antiguedad;
    private TipoCategoria categoria;
    private String fecha_union;

    public Usuario(String idUsuario, String clave, String nombre, String telefono, String direccion, String email, TipoUsuario tipo, TipoPuesto puesto, Integer antiguedad, TipoCategoria categoria, String fecha_union) {
        this.idUsuario = idUsuario;
        this.clave = clave;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.tipo = tipo;
        this.puesto = puesto;
        this.antiguedad = antiguedad;
        this.categoria = categoria;
        this.fecha_union = fecha_union;

    }

    public String getIdUsuario() {

        return this.idUsuario;
    }

    public String getClave() {

        return this.clave;
    }

    public String getNombre() {

        return this.nombre;
    }

    public String getDireccion() {

        return this.direccion;
    }

    public String getEmail() {

        return this.email;
    }

    public TipoUsuario getTipoUsuario() {

        return this.tipo;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    public TipoPuesto getPuesto() {
        return puesto;
    }

    public void setPuesto(TipoPuesto puesto) {
        this.puesto = puesto;
    }

    public TipoCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(TipoCategoria categoria) {
        this.categoria = categoria;
    }

    public String getFecha_union() {
        return fecha_union;
    }

    public void setFecha_union(String fecha_union) {
        this.fecha_union = fecha_union;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

}
