import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main  {
    public static void main(String[] args) {


        Alumno a1 = new Alumno("Juan Perez", 104569741L);
        Alumno a2 = new Alumno("Pedro Sanchez", 10548647L);
        Alumno a3 = new Alumno("Miguel Baggio", 105486L);

        ArrayList<Alumno> listaDeAlumnos = new ArrayList<>();
        listaDeAlumnos.add(a1);
        listaDeAlumnos.add(a2);
        listaDeAlumnos.add(a3);

        for (int i = 0; i < listaDeAlumnos.size(); i++) {
            System.out.println(listaDeAlumnos.get(i));

        }


        Nota n1 = new Nota("matematicas",8.5);
        Nota n2 = new Nota("programacion",10.0);

        a1.agregarNota(n1);
        a1.mostrarNotas();


    }



}