import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int accion;
        Scanner input = new Scanner(System.in);
    do{
        do {
        System.out.println("1. Nuevo salon:");
        System.out.println("2. Nueva solicitud de reserva:");
        System.out.println("3. Asignar un salon para el evento:");
        System.out.println("4. Salir:");
        System.out.println("Ingrese alguna opción (Del 1 al 4): ");
        accion = input.nextInt();

        } while (accion < 1 || accion > 4);
        switch (accion) {
            case 1:
                
                break;
        
            case 2:
                
                break;
            
            case 3:
                
                break;

            case 4:
                
                break;
        }
    } while (accion != 4);
        
    }
}
