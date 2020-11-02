
package clase10;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;
    
    public Contacto(String nombre, String apellido, String telefono, String mail){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        //si email esta vacío, se le agrega un -
        if(mail.isEmpty()){
            this.mail = "-";
        }else this.mail = mail;
    }
    public Contacto(String nombre, String apellido, String telefono){
        this.nombre = nombre; 
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = "-";
    }
    //APERTURA GETTER
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }
    //CIERRE GETTER
    
    //APERTURA SETTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    //CIERRE SETTER

}
