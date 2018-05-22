import java.util.Date;

public class Empleado implements Comparable<Empleado>{

    private int legajo;
    private String nombre;
    private Date fechaIngreso;
    public enum CriterioOrden {
        NOMBRE,
        LEGAJO,
        FECHAINGRESO
    }

    public static CriterioOrden criterioOrden;

    public Empleado(int legajo, String nombre, Date fechaIngreso){
     super();
     this.legajo= legajo;
     this.nombre=nombre;
     this.fechaIngreso=fechaIngreso;
     }

     public String toString() {
        return "\t- Legajo: "+this.legajo+"\n\tNombre: "+this.nombre+"\n\tFecha de Ingreso: "+
            this.fechaIngreso;
     }
    @Override
    public int compareTo(Empleado o) {
        int comparacion = 0;

        switch (criterioOrden) {
            case NOMBRE:
                comparacion = nombre.compareTo(o.nombre);
                break;

            case LEGAJO:
                if (legajo != o.legajo) {
                    comparacion = (legajo > o.legajo) ? 1 : -1;
                }
                break;

            case FECHAINGRESO:
                comparacion = fechaIngreso.compareTo(o.fechaIngreso);
                break;
        }
        return comparacion;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
