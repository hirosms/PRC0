package source;

public class Socio extends Persona{

	int ID;
	Fecha fecha_in;

    public Socio(int id, Fecha ing, NIF nif, Nombre nombre, Fecha fecha_nac) {
        super(nif, nombre, fecha_nac);
        this.ID = id;
        this.fecha_in = ing;
    }       

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Fecha getFecha_in() {
        return fecha_in;
    }

    public void setFecha_in(Fecha fecha_in) {
        this.fecha_in = fecha_in;
    }
    
void print()
{
    //public Socio(int ID, Fecha fecha_in, NIF nif, Nombre nombre, Fecha fecha_nac) {
        System.out.println("ID: "+this.getID());
        System.out.print("Fecha Ingreso:");this.fecha_in.print();
        System.out.print("NIF: ");this.nif.print();
        System.out.print("Nombre: ");this.nombre.print();
        System.out.print("Fecha Nacimiento:");this.fecha_nac.print();
}    
}

