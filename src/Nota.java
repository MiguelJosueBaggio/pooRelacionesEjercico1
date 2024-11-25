public class Nota {
    String catedra;
    Double notaExamen;

    public Nota(String catedra, Double notaExamen) {
        this.catedra = catedra;
        this.notaExamen = notaExamen;
    }

    public String catedra() {
        return catedra;
    }

    public Nota setCatedra(String catedra) {
        this.catedra = catedra;
        return this;
    }

    public Double getNotaExamen() {
        return notaExamen;
    } /// este es el vinculo que tendra con la listas de notas por alumno

    public Nota setNotaExamen(Double notaExamen) {
        this.notaExamen = notaExamen;
        return this;
    }
}
