package arreglos;

public class OrdenamientoBurbuja {
    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];

            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }

    public static void ordenamientoBurbuja(Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;

        for (int i = 0; i < total - 1; i++){

            for (int j = 0; j < total - 1 - i; j++) {
                if (((Comparable) arreglo[j+1]).compareTo(arreglo[j]) > 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
                contador++;
            }

        }
        System.out.println("contador = " + contador);
    }
    public static void main(String[] args) {
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};

        int total = productos.length;

        ordenamientoBurbuja(productos);

        System.out.println("--------- Usando For ---------");
        // Iterando arreglo
        for (int i = 0; i <= total - 1; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }



    }
}
