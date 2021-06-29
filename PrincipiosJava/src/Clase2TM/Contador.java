package Clase2TM;

public class Contador {

    private int index;

    public Contador(){}
    public Contador(int index) {this.index = index;}
    public Contador(Contador contador){this(contador.index);}

    public int getIndex() {return index;}

    public void setIndex(int index) {this.index = index;}

    public void incrementar(){
        this.index++;
    }

    public void decrementar(){
        this.index--;
    }

}
