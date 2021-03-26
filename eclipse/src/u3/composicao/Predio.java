package qui.u3.composicao;

public class Predio extends Casa{

    private int numAndares;

    public Predio(Parede parede1, Parede parede2, Parede parede3, Parede parede4, int numAndares) {
        super(parede1, parede2, parede3, parede4);

        this.numAndares = numAndares;
    }

    public int getNumAndares() {
        return numAndares;
    }

    public void setNumAndares(int numAndares) {
        this.numAndares = numAndares;
    }

    @Override
    public String toString() {
        return "Predio [parede1=" + getParede1() + 
                ", parede2=" + getParede2() + 
                ", parede3=" + getParede3() + 
                ", parede4=" + getParede4()
                + ", numAndares=" + numAndares + "]";
    }

    
    
}
