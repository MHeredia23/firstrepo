package Clase3TM;

public class SortUtil<T> {
//Este metodo recibe cualquier cosa que herede de IPrecedable y recibe un array de cualquier cosa que herede de IPrecedable
    /*
    public static <T extends IPrecedable> void ordenar(T arr[]){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr.length-1; j++){
                    if(arr[j].precedeA(arr[j+1])<0){
                        T aux = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = aux;
                }
            }
        }
    }
     */

    public static <T> void ordenar(IPrecedable<T> arr[]){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr.length-1; j++){
                if(arr[j].precedeA((T)arr[j+1])<0){
                    IPrecedable<T> aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }

}
