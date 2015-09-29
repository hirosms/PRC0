package source;

public class Fecha {

	int d; // day
	int m; // month
	int a; // year
	
	public Fecha(int dia, int mes, int anyo) {
		d = dia;
		m = mes;
		a = anyo;
	}
        
        public Fecha(Fecha f) {
		this.d = f.d;
		this.m = f.m;
		this.a = f.a;
	}
        
        public Fecha (String s)
        {
            this.d = Integer.parseInt(s.substring(0,2));
            this.m = Integer.parseInt(s.substring(3,5));
            this.a = Integer.parseInt(s.substring(6,10));
        }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
	
    
    void print ()
    {
        System.out.println(d+"/"+m+"/"+a);
    }

            public String to_s ()
    {
        return d+"/"+m+"/"+a;
    }
}
