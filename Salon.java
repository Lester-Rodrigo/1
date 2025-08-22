public class Salon {
    private String tamaño;
    private int NumeroSalon;
    private int CapacidadSalon;
    private int CostoSalon;
    private Evento EventoaReservar;
    int EventoVIP;

    public Salon (String tamaño, int NumeroSalon, int CapacidadSalon, int CostoSalon, Evento EventoaReservar){
    this.tamaño = tamaño;
    this.NumeroSalon = NumeroSalon;
    this.CapacidadSalon = CapacidadSalon;
    this.CostoSalon = CostoSalon;
    this.EventoaReservar = EventoaReservar;
    }

    public String getTamaño(){
        return tamaño;
    }

    public void setTamaño(String tamaño){
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

    public int Eventospermitidos () {
        if (tamaño == "Grande") {
            if (EventoaReservar.getTipoEvento() == 1) {
                EventoVIP = 1;
            }
            else{
                EventoVIP = 0;
            }
        }
        return EventoVIP;
    }
}
