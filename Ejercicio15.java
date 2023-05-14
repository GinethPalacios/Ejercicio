package EjerciciosJAVA;
import java.util.Scanner;
public class Ejercicio15
 {
    public static void main(String[] args)
    {
        String[] Usuario  = {"Aleja"} ;
        String [] Contraseña = {"3001"};
        int Cliente;
        String ValidacionUsu;
        String  ValidacionCon;
    

        Scanner lectura = new Scanner (System.in);

        for(Cliente=0;Cliente<Usuario.length;Cliente++); 
        {
            System.out.println("Ingrese su Usuario");
            ValidacionUsu = lectura.next();

        }
        if(ValidacionUsu==Usuario[0])
        {
            System.out.println("El usuario que ingreso es verdadero");

        }
        else
        {
            System.out.println("El usuario que ingreso es incorrecto");
        }
        for(Cliente=0;Cliente<Contraseña.length;Cliente++);
        {
            System.out.println("Ingrese su contraseña");
            ValidacionCon = lectura.next();
        }
        if(ValidacionCon==Contraseña[0])
        {
            System.out.println("La contraseña es correcta");
        }
        else
        {
            System.out.println("La contraseña que ingreso es incorrecta");
        }

    }
}
