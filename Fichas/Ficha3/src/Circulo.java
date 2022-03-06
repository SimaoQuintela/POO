import java.lang.Math;

public class Circulo {
    private double x;
    private double y;
    private double raio;

    /**
     * Construtor por omissão
     */
    public Circulo(){
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }

    /**
     * Construtor com valores passados como parâmetro
     * @param x coordenada x
     * @param y coordenada y
     * @param raio valor do raio
     */
    public Circulo(double x, double y, double raio){
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    /**
     * Consrtutor de cópia de um Círculo
     * @param umCirculo Circulo passado como parâmetro
     */
    public Circulo(Circulo umCirculo){
        this.x = umCirculo.getX();
        this.y = umCirculo.getY();
        this.raio = umCirculo.getRaio();
    }

    // 1. a)
    /**
     * Método que devolve o valor da coordenada x
     * @return valor da coordenada x
     */
    public double getX(){
        return this.x;
    }

    // 1. b)
    /**
     * Método que devolve o valor da coordenada y
     * @return valor da coordenada y
     */
    public double getY(){
        return this.y;
    }

    // 1. c)
    /**
     * Método que devolve o valor do raio
     * @return valor do raio
     */
    public double getRaio(){
        return this.raio;
    }

    // 1. d)
    /**
     * Coloca em x o valor passado como parâmetro
     * @param x valor a colocar em x
     */
    public void setX(double x){
        this.x = x;
    }

    // 1. d)
    /**
     * Coloca em y o valor passado como parâmetro
     * @param y valor a colocar em y
     */
    public void setY(double y){
        this.y = y;
    }

    // 1. d)
    /**
     * Coloca no raio o valor passado como parâmetro
     * @param raio valor a colocar no raio
     */
    public void setRaio(double raio){
        this.raio = raio;
    }

    /**
     * Método que verifica se os dois Círculos são iguais
     * @param circulo Círculo passado como parâmetro
     * @return True se os círculos forem iguais | False se os Círculos forem diferentes
     */
    public Boolean equals(Circulo circulo){
        return( this.x == circulo.getX() &&
                this.y == circulo.getY() &&
                this.raio == circulo.getRaio()
        );
    }

    /**
     * Método que cria um clone do círculo
     * @param circulo Círculo passado como parâmetro
     * @return Clone do círculo passado como parâmetro
     */
    public Circulo clone(Circulo circulo){
        return new Circulo(this);
    }

    // 1. e)
    public void alteraCentro(double x, double y){
        this.x = x;
        this.y = y;
    }

    // 1. f)
    public double calculaArea(){
        return ( (Math.PI) * (Math.pow(this.raio,2) ));
    }

    // 1. g)
    public double calculaPerimetro(){
        return (2*Math.PI*this.raio);
    }




}
