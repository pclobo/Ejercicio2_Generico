public class Operaciones {
    //Calcular el elemento mínimo de un Array
    public static <T extends Comparable<T>> T MinimoArray(T[] array) throws ArrayIndexOutOfBoundsException {
        if (array.length <= 0) {
            throw new ArrayIndexOutOfBoundsException("El array esta vacio!");
        }

        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == null) continue;

            if (array[i].compareTo(min) <= 0) {
                min = array[i];
            }
        }
        return min;
    }
    //Calcular el elemento máximo de un Array
    public static <T extends Comparable<T>> T MaxArray(T[] array) throws ArrayIndexOutOfBoundsException {
        if (array.length <= 0) {
            throw new ArrayIndexOutOfBoundsException("El array esta vacio!");
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == null) continue;

            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
    //Buscar un Objeto en un array, devolviendo la posición de la
    //primera aparición de Objeto en el array o -1 si no existe
    public static <T> int FindInArray(T[] array, T object ) throws ArrayIndexOutOfBoundsException, NullPointerException {
        if (array.length <= 0) {
            throw new ArrayIndexOutOfBoundsException("El array esta vacio!");
        }
        if (object==null){
            throw new NullPointerException("El Objeto es Nulo");
        }
        int index= -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) continue;

            if (array[i].equals(object)) {
                index = i;
                break;
            }
        }
        return index;
    }



    public static <T> void Eliminar(T objeto, T[] array) throws ArrayIndexOutOfBoundsException, NullPointerException {
        if (objeto == null) {
            throw new NullPointerException("El objeto a buscar es nulo!");
        }
        if (array.length <= 0) {
            throw new ArrayIndexOutOfBoundsException("El array no esta inicializado!");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) continue;

            if (objeto.equals(array[i])) {
                array[i] = null;
                break;
            }
        }
    }



}
