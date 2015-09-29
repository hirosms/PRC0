package source;

public class NIF {
    
    int dni;
    String letra;

    public NIF(NIF nif) {
        this.dni = nif.dni;
        this.letra = nif.letra;
    }

    public NIF(int d, String l) {
        this.dni = d;
        this.letra = l;
    }

    public NIF (String s)
    {
        this.dni = Integer.parseInt(s.substring(0,8));
        this.letra = s.substring(8);

    }
    
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    public void print ()
    {      
        System.out.println(dni+letra);
    }
}
