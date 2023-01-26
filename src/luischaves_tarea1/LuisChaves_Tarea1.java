package luischaves_tarea1;

import java.util.Scanner;

public class LuisChaves_Tarea1 {

    public static void main(String[] args) {
        Dependiente d = new Dependiente();
        Ingeniero i = new Ingeniero();

        int opcion;
        try {
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
                        String cedula = sc.next();
                        d.setCedula(Integer.parseInt(cedula));
                        System.out.println(" ");

                        System.out.println("Digite la ubicacion");
                        String ubicacion = sc.next();
                        d.setUbicacion(ubicacion);
                        System.out.println(" ");

                        System.out.println("Digite la descripcion del puesto");
                        String descripcion = sc.next();
                        d.setDescripcionPuesto(descripcion);
                        System.out.println(" ");
                        break;
                    case 2:
                        System.out.println("Digite la cedula");
                        String cedulaIng = sc.next();
                        i.setCedula(Integer.parseInt(cedulaIng));
                        System.out.println(" ");

                        System.out.println("Digite la ubicacion");
                        String ubicacionIng = sc.next();
                        i.setUbicacion(ubicacionIng);
                        System.out.println(" ");

                        System.out.println("Digite el telefono");
                        String telefono = sc.next();
                        i.setTelefono(telefono);
                        System.out.println(" ");
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
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
