package Clase2TM;

public class Prueba {

    public static void main(String[] args) {

        CuentaCorriente cuentaCorriente = new CuentaCorriente(1,"2222",300);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente(2,"2222",100);

        System.out.println("cuentaCorriente = " + cuentaCorriente);
        System.out.println("cuentaCorriente2 = " + cuentaCorriente2);

        System.out.println("Realizando tranferencia ...");
        cuentaCorriente.transferencia(cuentaCorriente2, 100);

        System.out.println("Transferencia exitosa: Nuevos saldos");
        System.out.println("cuentaCorriente = " + cuentaCorriente);
        System.out.println("cuentaCorriente2 = " + cuentaCorriente2);

        String prueba = "    al campo fue pedro     ";
        System.out.println(prueba);
        String dos = StringUtil.ltrim(prueba);
        System.out.println("dos = " + dos);

        String tres = StringUtil.rtrim(prueba);
        System.out.println("tres = " + tres);

        String trum = StringUtil.trim(prueba);
        System.out.println("trum = " + trum);


        String ejectuar = "John|Paul|George|Ringo";
        System.out.println(StringUtil.indexOfN(ejectuar,'|',2));

        Contador c = new Contador(60);
        System.out.println(c.getIndex());
        Contador c2 = new Contador(c);
        System.out.println("c2 = " + c2.getIndex());
        c2.incrementar();
        System.out.println(c.getIndex());
        System.out.println(c2.getIndex());


    }

}
