public class Controlador {
    //Atributos para crea un Salón
    public Salon[] SalonesDisponibles = new Salon[10];
    private int SalonesEnlistados = 0;
    //Atributos para crear un Evento
    public Evento[] EventosCreados = new Evento[10];
    private int EventosNuevos = 0;
    public Evento [] ListadeEspera = new Evento[100];
    private int EventosEnEspera = 0;
    //Atributos para comprobar si se asigna un evento a un salon o no
    private int Regla1;
    private int Regla2;
    private int Regla3;
    private int Regla4;
    private String ComprobarReservacion;

    public Controlador (){
    }

    //Objeto para crear un salón
    public String CrearUnSalon(int tamaño, int numero, int capacidad, int costo){
        Salon salonNuevo = new Salon(tamaño, numero, capacidad, costo, null);
        SalonesDisponibles [SalonesEnlistados] = salonNuevo;
        SalonesEnlistados += 1;
        return "Salón creado con éxito";
    }

    public String CrearUnEvento (String organizador, String nombredelevento, int tipodeevento, String fechadelevento, String horariodelevento, double duraciondelevento, int presupuestodelevento, int invitados){
       if (EventosNuevos < 11) {
        Evento evento1 = new Evento(organizador, nombredelevento, presupuestodelevento, fechadelevento, horariodelevento, tipodeevento, presupuestodelevento, invitados);
        EventosCreados [EventosNuevos] = evento1;
        EventosNuevos += 1;
       }
       else{
        Evento evento1 = new Evento(organizador, nombredelevento, presupuestodelevento, fechadelevento, horariodelevento, tipodeevento, presupuestodelevento, invitados);
        ListadeEspera [EventosEnEspera] = evento1;
        EventosEnEspera += 1;
       }
        return "Evento creado con éxito";
    }

    public String ReservarUnSalon (Salon salon1, Evento evento1, int NumerodeSalon, int numerodeEvento) {
        if (salon1.getTamaño() == 1) {
            Regla1 = salon1.EventosVIPpermitidos(salon1, evento1);
            Regla2 = salon1.DepositoHecho(salon1, evento1);
            Regla3 = salon1.EspacioAdecuado(salon1, evento1);
            Regla4 = salon1.SalonReservado(salon1, evento1);
            if (Regla1 == 1 && Regla2 == 1 && Regla3 == 1 && Regla4 == 1) {
                SalonesDisponibles [NumerodeSalon].setEventoaReservar(EventosCreados [numerodeEvento]);
                ComprobarReservacion = "Su reservación esta lista";
            }
            else{
                ComprobarReservacion = "No hemos podido hacer su reservación";
            }
        }
        else{
            Regla2 = salon1.DepositoHecho(salon1, evento1);
            Regla3 = salon1.EspacioAdecuado(salon1, evento1);
            Regla4 = salon1.SalonReservado(salon1, evento1);
            if (Regla2 == 1 && Regla3 == 1 && Regla4 == 1) {
                SalonesDisponibles [NumerodeSalon].setEventoaReservar(EventosCreados [numerodeEvento]);
                ComprobarReservacion = "Su reservación esta lista";
            }
            else{
                ComprobarReservacion = "No hemos podido hacer su reservación";
            }
        }
        return ComprobarReservacion;
    }
}
