import java.time.LocalDateTime;

public class Lampada {
    private static final int ON = 10;
    private static final int ECO = 5;
    private static final int OFF = 0;
    private int estado;
    private int consumo;
    private LocalDateTime lastReset;

    public Lampada(){
        this.setEstado(Lampada.OFF);
        this.consumo = this.getEstado();
        this.lastReset = LocalDateTime.now();
    }

    public Lampada(int estado, int consumo){
        this.setEstado(estado);
        this.setConsumo(consumo);
        this.lastReset = LocalDateTime.now();
    }

    public Lampada(Lampada l){
        this(l.getEstado(), l.getConsumo());
    }

    public boolean equals(Object l){
        if(this == l)
            return true;

        if((null == l) || (this.getClass() != l.getClass()))
            return false;

        Lampada l2 = (Lampada)l;

        return(
                this.consumo == l2.getConsumo() &&
                this.estado == l2.getEstado()   &&
                this.lastReset.equals(l2.getLastReset())
            );

    }

    public Lampada clone(){
        return new Lampada(this);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Estado: ").append(this.getEstado());
        sb.append("Consumo: ").append(this.getConsumo());
        sb.append("Último reset: ").append(this.getLastReset());

        return sb.toString();
    }




    public int getEstado(){
        return this.estado;
    }

    public int getConsumo() {
        return this.consumo;
    }

    public LocalDateTime getLastReset(){
        return this.lastReset;
    }

    public void setEstado(int estado){
        this.estado = estado;
    }

    public void setConsumo(int consumo){
        this.consumo = consumo;
    }

    public void setLastReset(LocalDateTime lastReset) {
        this.lastReset = lastReset;
    }
}