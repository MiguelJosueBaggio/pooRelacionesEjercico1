import java.util.ArrayList;

public class Alumno {

   private String nombreCompleto;
   private Long legajo;
     ArrayList<Nota> notas = new ArrayList<Nota>();

    public Alumno(String nombreCompleto, Long legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
    }



    public String nombreCompleto() {
        return nombreCompleto;
    }

    public Alumno setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
        return this;
    }

    public Long legajo() {
        return legajo;
    }

    public Alumno setLegajo(Long legajo) {
        this.legajo = legajo;
        return this;
    }

    public void agregarNota(Nota n){     /// funcion para agregar notas
    this.notas.add(n);}

    public void mostrarNotas () {
        for (Nota n:notas){
            System.out.println(n.getNotaExamen());
        }


    }

}
