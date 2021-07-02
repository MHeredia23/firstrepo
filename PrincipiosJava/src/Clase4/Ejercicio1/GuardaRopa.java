package Clase4.Ejercicio1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class GuardaRopa {

    private Map<Integer, List<Prenda>> prendas;
    private Integer index;

    public GuardaRopa() {
        this.prendas = new HashMap<>();
        this.index = 1;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda) throws Exception {
        if(!listaDePrenda.isEmpty()){
            prendas.put(index,listaDePrenda);
            return index++;
        }
       throw new Exception("No puede guardar prendas vacias");
    }

    public void mostrarPrendas(){
        prendas.forEach((k,v)-> {
            System.out.println("Guardarropa: "+k);
            v.forEach((p)-> System.out.println(p.toString()));
        });
    }

    public List<Prenda> devolverPrendas(Integer numero) throws Exception {
        List<Prenda> devolver = prendas.get(numero);
        if(Objects.nonNull(devolver) && !devolver.isEmpty()){
            prendas.remove(numero);
            return devolver;
        }
        throw new Exception("No existe dicho item");
    }

}
