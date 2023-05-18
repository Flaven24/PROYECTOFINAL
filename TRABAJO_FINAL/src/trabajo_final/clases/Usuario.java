package trabajo_final.clases;

/**
 *
 * @author Acer
 */
public class Usuario {
    private int idcodigo ;
    private String clogin;
    private String ccontrasena;
    private Persona idpersona;

    public Usuario(int idcodigo, String clogin, String ccontrasena, Persona idpersona) {
        this.idcodigo = idcodigo;
        this.clogin = clogin;
        this.ccontrasena = ccontrasena;
        this.idpersona = idpersona;
    }   
    
    public int getIdcodigo() {
        return idcodigo;
    }

    public void setIdcodigo(int idcodigo) {
        this.idcodigo = idcodigo;
    }

    public String getClogin() {
        return clogin;
    }

    public void setClogin(String clogin) {
        this.clogin = clogin;
    }

    public String getCcontrasena() {
        return ccontrasena;
    }

    public void setCcontrasena(String ccontrasena) {
        this.ccontrasena = ccontrasena;
    }

    public Persona getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Persona idpersona) {
        this.idpersona = idpersona;
    }
         
}
