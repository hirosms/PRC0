package source;

public class Persona {

	NIF nif;
	Nombre nombre;
	Fecha fecha_nac;

    public Persona(NIF n, Nombre no, Fecha nac) {
        nif =  n;
        nombre = no;
        fecha_nac = nac;
    }

    public NIF getNif() {
        return nif;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public Fecha getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Fecha fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
        	
}
