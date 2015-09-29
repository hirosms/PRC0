/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author Sergio
 */
public class Inicio {
    public static void main(String[] args) {
    /*
    FECHA
        Fecha a = new Fecha("01/01/2000");
        Fecha b = new Fecha(2,2,2000);
        Fecha c = new Fecha(b);
        
        a.print();
        b.print();
        c.print();
    */
    
    /*
    NIF
        NIF a = new NIF (54110144,"E");
        NIF b = new NIF (a);
        NIF c = new NIF ("54110145T");

        a.print();
        b.print();
        c.print();
    */
    /*
    NOMBRE
        Nombre a = new Nombre("AA","BB");
        Nombre b = new Nombre(a);
        
        a.print();
        b.print();
    */
    /*
    Asociacion a = new Asociacion();
    
    NIF n1 = new NIF (54110144,"E");
    NIF n2 = new NIF (54110145,"E");
    NIF n3 = new NIF (54110146,"E");
    NIF n4 = new NIF (54110147,"E");
    Fecha f1 = new Fecha("01/01/2000");
    Fecha f2 = new Fecha(2,2,2000);
    Nombre no1 = new Nombre("AA","BB");
    Nombre no2 = new Nombre("CC","DD");
    
    //public Socio(int ID, Fecha fecha_in, NIF nif, Nombre nombre, Fecha fecha_nac) {
    //Socio s1 = new Socio(0,f2,n1,no1,f1);
    
    //void crear_socio(Fecha fecha_ini, NIF nif, Nombre nombre, Fecha fecha_nac)
    a.crear_socio(f2,n1,no1,f1);
    a.crear_socio(f1,n2,no2,f2);
    a.crear_socio(f1,n3,no2,f2);
    a.crear_socio(f1,n4,no2,f2);
    a.print();
    
    a.borrar_socio(54110145);
    
     for(int i = 0;i<= 5;i++)
        {
            System.out.println();
        }
    a.print();
    
    */
    
        
    /*
    
    Asociacion a = new Asociacion ();
    
    Fecha fecha = new Fecha ("02/09/2015");
    
    Socio p;
    Fecha f;
    NIF d;
    Nombre n;
    
    for (int i = 0; i < 10; i++)
    {
        f = new Fecha("02/09/2015");
        d = new NIF (i*1000,"A");
        n = new Nombre ("AA","BB");
        a.crear_socio(fecha,d, n,f);
    }
    a.print();
    
    */
    }
}
