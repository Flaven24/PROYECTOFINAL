package trabajo_final.clases;

/**
 *
 * @author Flaven
 */
public class Usuario {

    private String cnombre;
    private String capellido;
    private String cusuario;
    private String ccontrasena;

    public Usuario(String cnombre, String capellido, String cusuario, String ccontrasena) {
        this.cnombre = cnombre;
        this.capellido = capellido;
        this.cusuario = cusuario;
        this.ccontrasena = ccontrasena;
    }

    public String getCnombre() {
        return cnombre;
    }

    public void setCnombre(String cnombre) {
        this.cnombre = cnombre;
    }

    public String getCapellido() {
        return capellido;
    }

    public void setCapellido(String capellido) {
        this.capellido = capellido;
    }

    public String getCusuario() {
        return cusuario;
    }

    public void setCusuario(String cusuario) {
        this.cusuario = cusuario;
    }

    public String getCcontrasena() {
        return ccontrasena;
    }

    public void setCcontrasena(String ccontrasena) {
        this.ccontrasena = ccontrasena;
    }

    public String toCSV() {
        return cnombre + ";" + capellido + ";" + cusuario + ";" + ccontrasena;
    }

}
