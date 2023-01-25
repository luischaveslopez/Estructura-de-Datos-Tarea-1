package luischaves_tarea1;

import java.util.Scanner;

public class Ingeniero extends Persona implements Atencion {

    private String telefono;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void AsignaSalario() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el codigo");
        s.codigo = sc.nextInt();
        System.out.println(" ");
        System.out.println("Ingrese el monto");
        s.monto = sc.nextInt();
        System.out.println(" ");
        
        System.out.println("La informacion es: Codigo "+s.codigo+ ", Monto: "+s.monto);
    }

}
