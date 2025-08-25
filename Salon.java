public class Salon {
    private int tamaño;
    private int NumeroSalon;
    private int CapacidadSalon;
    private int CostoSalon;
    private Evento EventoaReservar;
    private int EventoVIP;
    private int PagoHecho;
    private int SuficienteEspacio;
    private int SalonOcupado;

    public Salon (int tamaño, int NumeroSalon, int CapacidadSalon, int CostoSalon, Evento EventoaReservar){
    this.tamaño = tamaño;
    this.NumeroSalon = NumeroSalon;
    this.CapacidadSalon = CapacidadSalon;
    this.CostoSalon = CostoSalon;
    this.EventoaReservar = EventoaReservar;
    }

    public int getTamaño(){
        return tamaño;
    }

    public void setTamaño(int tamaño){
        this.tamaño =  tamaño;
    }

    public int getNumeroSalon(){
        return NumeroSalon;
    }

    public void setNumeroSalon(int NumeroSalon){
        this.NumeroSalon = NumeroSalon;
    }

    public int getCapacidadSalon(){
        return CapacidadSalon;
    }

    public void setCapacidadSalon(int CapacidadSalon){
        this.CapacidadSalon = CapacidadSalon;
    }

    public int getCostoSalon(){
        return CostoSalon;
    }

    public void setCostoSalon(int CostoSalon){
        this.CostoSalon = CostoSalon;
    }

    public Evento getEventoaReservar () {
        return EventoaReservar;
    }

    public void setEventoaReservar(Evento EventoaReservar){
        this.EventoaReservar = EventoaReservar;
    }

    public int EventosVIPpermitidos (Salon salon1, Evento evento1) {
        if (salon1.getTamaño() == 1) {
            if (evento1.getTipoEvento() == 1) {
                EventoVIP = 1;
            }
            else{
                EventoVIP = 0;
            }
        }
        return EventoVIP;
    }

    public int DepositoHecho (Salon salon1, Evento evento1){
        if (salon1.getCostoSalon() == evento1.getPresupuesto() || salon1.getCostoSalon() < evento1.getPresupuesto() ){
            PagoHecho = 1;
        }
        else {
            PagoHecho = 0;
        }
        return PagoHecho;
    }

    public int EspacioAdecuado (Salon salon1, Evento evento1) {
        if (salon1.getCapacidadSalon() < evento1.getInvitados()) {
            SuficienteEspacio = 0;
        }
        else {
            SuficienteEspacio = 1;
        }
        return SuficienteEspacio;
    }

    public int SalonReservado (Salon salon1, Evento evento1) {
        if (salon1.getEventoaReservar() != null) {
            SalonOcupado = 0;
        }
        else {
            SalonOcupado = 1;
        }
        return SalonOcupado;
    }
}
