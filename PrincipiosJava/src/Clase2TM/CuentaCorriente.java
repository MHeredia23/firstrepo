package Clase2TM;

public class CuentaCorriente {

    private int id;
    private String cbu;
    private double saldo;

    public CuentaCorriente() { }

    public CuentaCorriente(int id, String cbu, double saldo) {
        this.id = id;
        this.cbu = cbu;
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente){
        this(cuentaCorriente.id, cuentaCorriente.cbu, cuentaCorriente.saldo);
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getCbu() {return cbu;}

    public void setCbu(String cbu) {this.cbu = cbu;}

    public double getSaldo() {return saldo;}

    public void setSaldo(double saldo) {this.saldo = saldo;}

    public void ingreso(double saldo){
        this.saldo = this.saldo+saldo;
    }

    public void egreso(double saldo){
        this.saldo = this.saldo-saldo;
    }

    public void transferencia(CuentaCorriente cuentaDestino, double saldo){
        //Descuento al orign sumo al destino
        this.egreso(saldo);
        cuentaDestino.ingreso(saldo);
    }

    public void reintegro(CuentaCorriente cuentaDestino, double saldo){
        //Sumo al orign descuento al destino
        this.ingreso(saldo);
        cuentaDestino.egreso(saldo);
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "id=" + id +
                ", cbu='" + cbu + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
