package source;

public class Nombre {
	
	String nombre;
	String apellido;

    public Nombre(String n, String a) {
        nombre = n;
        apellido = a;
    }
    
    public Nombre (Nombre n)
    {
        this.nombre = n.nombre;
        this.apellido = n.apellido;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void print ()
    {
        System.out.println(nombre+" "+apellido);
    }
}
