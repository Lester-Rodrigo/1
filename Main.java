import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Par los salones
        int SalonesCreados = 0;
        int accion;
        Scanner input = new Scanner(System.in);
        int Tamañosalon;
        int NumerodelSalon;
        int CapacidaddelSalon;
        int CostodelSalon;
        //Para el evento
        String OrganizadordelEvento;
        String nombredelEvento;
        int TipodeEvento;
        String fechadelEvento;
        String HorariodelEvento;
        double DuraciondelEvento;
        int PresupuestodelEvento;
        int InvitadosdelEvento;
        //Para asignar eventos
        Salon salonreservado;
        Evento eventoasignado;
        //Contorlador
        Controlador control = new Controlador();
        
    do{
        do {
        System.out.println("1. Nuevo salon: ");
        System.out.println("2. Nueva solicitud de reserva: ");
        System.out.println("3. Asignar un salon para el evento: ");
        System.out.println("4. Salir: ");
        System.out.println("Ingrese alguna opción (Del 1 al 4): ");
        accion = input.nextInt();

        } while (accion < 1 || accion > 4);
        switch (accion) {
            case 1:
                SalonesCreados += 1;
                if (SalonesCreados < 11) {
                Scanner datos = new Scanner(System.in);
                System.out.println("Ingrese el tamaño del salón (1 Si es grande, 2 Si es mediano o 3 Si es pequeño): ");
                Tamañosalon = datos.nextInt();
                System.out.println("Ingrese el número del salón (del 0 al 9): ");
                NumerodelSalon=(datos.nextInt());
                System.out.println("Ingrese la capacidad del salón: ");
                CapacidaddelSalon = (datos.nextInt());
                System.out.println("Ingrese el costo del salón: ");
                CostodelSalon = (datos.nextInt());
                System.out.println(control.CrearUnSalon(Tamañosalon, NumerodelSalon, CapacidaddelSalon, CostodelSalon));
                System.out.println("-------------------------------------------------------------");
                break;
                }
                else{
                    System.out.println("No es posible crear más salones, ya se han creado todos los posibles.");
                    System.out.println("-------------------------------------------------------------");  
                }
                break;
        
            case 2:
            if (SalonesCreados < 4) {
                System.out.println("Por favor cree almenos 4 salones antes de ingresar sus eventos");
                System.out.println("-------------------------------------------------------------");  
            }
            else{
                Scanner datos = new Scanner(System.in);
                System.out.println("Ingrese el nombre del organizador: ");
                OrganizadordelEvento = datos.nextLine();
                System.out.println("Ingrese el nombre del evento: ");
                nombredelEvento=(datos.nextLine());
                System.out.println("Ingrese la fecha en la que se realizará el evento (ejemplo: 10/02/2025): ");
                fechadelEvento = (datos.nextLine());
                System.out.println("Ingrese el horario en el que se realizará el evento (ejemplo: De 12:00 a 15:00): ");
                HorariodelEvento = (datos.nextLine());
                System.out.println("Ingrese el tipo de evento (1 Si es Vip o 2 Si es regular): ");
                TipodeEvento = (datos.nextInt());
                System.out.println("Ingrese la duranción que tendrá el evento en horas: ");
                DuraciondelEvento = (datos.nextDouble());
                System.out.println("Ingrese el presupuesto que cuenta para el evento: ");
                PresupuestodelEvento = (datos.nextInt());
                System.out.println("Ingrese el número de invitados que asistiran al evento: ");
                InvitadosdelEvento = (datos.nextInt());
               System.out.println(control.CrearUnEvento(OrganizadordelEvento, nombredelEvento, TipodeEvento, fechadelEvento, HorariodelEvento, DuraciondelEvento, PresupuestodelEvento, InvitadosdelEvento));
               System.out.println("-------------------------------------------------------------");  
            }
                break;
            
            case 3:
                Scanner datos = new Scanner(System.in);
                int orden = 0;
                for (Evento evento : control.EventosCreados){
                if (evento != null) {
                    System.out.println(orden + "" + evento.getOrganizador()+ " " + evento.getnombreEvento());
                    orden +=1;
                    System.out.println("-------------------------------------------------------------");
                }
            }
            System.out.println("Ingrese su evento: ");
                int posicionEvento = (datos.nextInt());
                eventoasignado = control.EventosCreados[posicionEvento];
                System.out.println("-------------------------------------------------------------");

                for (Salon salon : control.SalonesDisponibles){
                if (salon != null) {
                    System.out.println( salon.getNumeroSalon()+ " " + salon.getCapacidadSalon());
                    System.out.println("-------------------------------------------------------------"); 
                }
            }
                System.out.println("Ingrese el salón que desea: ");
                int posicionSalon = (datos.nextInt());
                salonreservado = control.SalonesDisponibles[posicionSalon];
                System.out.println(salonreservado.getTamaño()+ " " + salonreservado.getCostoSalon() + " " + salonreservado.getCapacidadSalon() + " " + salonreservado.getNumeroSalon() + " " + salonreservado.getEventoaReservar());
                System.out.println(control.ReservarUnSalon(salonreservado, eventoasignado, posicionSalon, posicionEvento));
                System.out.println("-------------------------------------------------------------");
                break;

            case 4:
                 System.exit(0);
                break;
        }
    } while (accion != 4);
        
    }
}
