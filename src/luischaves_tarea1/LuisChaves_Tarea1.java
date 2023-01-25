package luischaves_tarea1;

import java.util.Scanner;

public class LuisChaves_Tarea1 {

    public static void main(String[] args) {
        Dependiente d = new Dependiente();
        Ingeniero i = new Ingeniero();

        int opcion;
        //int cedula = 0;
        //String Ubicacion, telefono, descripcionPuesto;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite un numero");
            System.out.println("1- Crear Dependiente");
            System.out.println("2- Crear Ingenierio");
            System.out.println("3- Recibe Salario por Ingeniero");
            System.out.println("4- Recibe Salario por Dependiente");
            System.out.println("5- Salir");
            opcion = sc.nextInt();
            System.out.println(" ");

            switch (opcion) {
                case 1:
                    System.out.println("Digite la cedula");
                    System.out.println(" ");
                    try {
                        System.out.println("Digite la ubicacion");
                        System.out.println("Digite el descripcion del puesto");
                    } catch (Exception e) {
                        System.out.println("error");
                    }
                    break;
                case 2:
                    System.out.println("Digite la cedula");
                    cedula = sc.nextInt();
                    System.out.println("Digite la ubicacion");
                    Ubicacion = sc.nextLine();
                    System.out.println("Digite el telefono");
                    telefono = sc.nextLine();
                    break;
                case 3:
                    d.AsignaSalario();
                    break;
                case 4:
                    i.AsignaSalario();
                    break;
                case 5:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Ingrese un digito entre 1 y 5");
                    break;
            }
        } while (opcion != 5);
    }
}
