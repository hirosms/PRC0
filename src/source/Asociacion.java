/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sergio
 */

public class Asociacion {
    
    ArrayList <Socio> aso = new ArrayList <Socio> ();
    int ID = 0;
     
    void crear_socio(Fecha fecha_ini, NIF nif, Nombre nombre, Fecha fecha_nac)
    {
        Socio a = new Socio (ID,fecha_ini,nif,nombre,fecha_nac);
        aso.add(a);
        ID ++;
    }
        
    int buscar_socio(int n)//, boolean m)
    {
        int ret = -1;
        /*if (m == true) //busqueda por id
        {
            for (Socio s : aso)
            {
                if (s.ID == n)
                {
                 ret = aso.indexOf(s);
                 
                }
            }
        }
        else
        {*/
            for(int i = 0;i < aso.size();i++)
            {
                if (aso.get(i).getNif().getDni() == n)
                {
                 ret = i;
                }
            }
        //}
        
        return ret;
    }

    void borrar_socio(int n)//,boolean m)
    {
        aso.remove(buscar_socio(n));
    }
    
    void print()
    {
        for(int i = 0;i < aso.size();i++)
        {
            System.out.println("//////////////////");
            System.out.println("Socio "+i);
            System.out.println("//////////////////");
            aso.get(i).print();
        }
    }
    
}
