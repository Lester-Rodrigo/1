public class Evento {
    private String Organizador;
    private String nombreEvento;
    private int TipoEvento;
    private String fecha;
    private String Horario;
    private int DuracionEvento;

    public Evento (String Organizador, String nombreEvento, int TipoEvento, String fecha, String Horario, int DuracionEvento) {
        this.Organizador = Organizador;
        this.nombreEvento = nombreEvento;
        this.TipoEvento = TipoEvento;
        this.fecha = fecha;
        this.Horario = Horario;
        this.DuracionEvento = DuracionEvento;
    }

    public String getOrganizador() {
        return Organizador;
    }

    public void setOrganizador(String Organizador){
        this.Organizador = Organizador;
    }

    public String getnombreEvento() {
        return nombreEvento;
    }

    public void setnombreEvento(String nombreEvento){
         this.nombreEvento = nombreEvento;
    }

    public int getTipoEvento() {
        return TipoEvento;
    }

    public void setTipoEvento(int TipoEvento){
            this.TipoEvento = TipoEvento;
    }

    public String getfecha() {
        return fecha;
    }

    public void setfecha(String fecha){
        this.fecha = fecha;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario){
        this.Horario = Horario;
    }

    public int getDuracionEvento() {
        return DuracionEvento;
    }

    public void setDuracionEvento(int DuracionEvento){
        this.DuracionEvento = DuracionEvento;
    }
}