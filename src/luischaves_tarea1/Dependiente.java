package luischaves_tarea1;

import java.util.Scanner;

public class Dependiente extends Persona implements Atencion {

    private String descripcionPuesto;

    public String getDescripcionPuesto() {
        return descripcionPuesto;
    }

    public void setDescripcionPuesto(String descripcionPuesto) {
        this.descripcionPuesto = descripcionPuesto;
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
        System.out.println("Ingrese la cantidad");
        s.cantidad = sc.nextInt();
        if (s.cantidad < 2) {
            System.out.println("Salario correcto");
        } else {
            System.out.println("LLEVA MAS DE UN SALARIO");
        }
        System.out.println(" ");
        
        System.out.println("La informacion es: Codigo "+s.codigo+ ", Monto: "+s.monto+", Cantidad: "+s.cantidad);
    }
}
