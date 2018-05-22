import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Empleado [] arrayEmpleado= new Empleado[3];
        Empleado a = new Empleado(15120,"Juan", new Date(2012,05,23));
        Empleado b = new Empleado(15118,"Alberto", new Date(2010,05,23));
        Empleado c = new Empleado(15119,"Berteaa", new Date(2011,05,23));
        arrayEmpleado[0]=a;
        arrayEmpleado[1]=b;
        arrayEmpleado[2]=c;
        Empleado.criterioOrden=Empleado.criterioOrden.NOMBRE;
        System.out.println("==========Calcular el elemento Minimo y Maximo de un Array==========");
        Empleado min = Operaciones.MinimoArray(arrayEmpleado);
        System.out.println("El elemento minimo es: \n" + min.toString());
        Empleado max = Operaciones.MaxArray(arrayEmpleado);
        System.out.println("El elemento maximo es: \n" + max.toString());
        System.out.println("\n==========Buscar un Objeto==========");
        System.out.println("La posicion de "+a.getNombre()+" es: " + Operaciones.FindInArray(arrayEmpleado, a));
        System.out.println("\n==========Eliminar==========");
        System.out.println("Array Actual: ");
        printArray(arrayEmpleado);
        System.out.println("Se elimina a "+a.getNombre());
        Operaciones.Eliminar(a, arrayEmpleado);
        System.out.println("Array Nuevo:");
        printArray(arrayEmpleado);
    }

    public static void printArray(Object[] array) {
        for (Object o : array) {
            String str = "\t- null";
            if (o != null)
                str = o.toString();
            System.out.println(str);
        }
    }
}
