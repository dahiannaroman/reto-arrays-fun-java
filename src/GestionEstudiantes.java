public class GestionEstudiantes {
    public static void main(String[] args) {
        // definimos los datos de los estudiantes
        String[] estudiantes = {"Ana", "Carlos", "Sofía", "David", "Elena"};
        String[] materias = {"Matemáticas", "Física", "Química", "Literatura", "Historia"};
        double[][] notas = {
                {8.5, 7.0, 9.0, 8.0, 7.5}, // notas de ana
                {7.0, 6.5, 8.0, 9.0, 8.5}, // notas de carlos
                {9.5, 9.0, 9.5, 8.5, 9.0}, // notas de sofia
                {6.0, 7.0, 7.5, 8.0, 7.0}, // notas de david
                {8.0, 8.5, 7.5, 9.0, 8.5} // notas de elena
        };

        // mostramos la información de los estudiantes
        mostrarInformacionEstudiantes(estudiantes, materias, notas);

        // calculamos y mostramos los promedios de cada estudiante
        calcularPromedios(estudiantes, notas);

        // encontramos y mostramos al estudiante con el promedio más alto
        encontrarMejorEstudiante(estudiantes, notas);

        // encontramos y mostramos la materia con el promedio más alto
        encontrarMejorMateria(materias, notas);
    }

    public static void mostrarInformacionEstudiantes(String[] estudiantes, String[] materias, double[][] notas) {
        System.out.println("Información de los estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i] + ": ");
            for (int j = 0; j < materias.length; j++) {
                System.out.print(materias[j] + ": " + notas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void calcularPromedios(String[] estudiantes, double[][] notas) {
        System.out.println("\nPromedios de los estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++){
                suma += notas[i][j];
            }
            double promedio = suma / notas[i].length;
            System.out.println(estudiantes[i] + ": " + promedio);
        }
    }

    public static void encontrarMejorEstudiante(String[] estudiantes, double[][] notas) {
        int indiceMejorEstudiante = 0;
        double mejorPromedio = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / notas[i].length;
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                indiceMejorEstudiante = i;
            }
        }
        System.out.println("\nEl estudiante con el mejor promedio es: " + estudiantes[indiceMejorEstudiante] + " con un promedio de " + mejorPromedio);
    }

    public static void encontrarMejorMateria(String[] materias, double[][] notas) {
        int indiceMejorMateria = 0;
        double mejorPromedio = 0;
        for (int j = 0; j < materias.length; j++){
            double suma = 0;
            for (int i = 0; i < notas.length; i++) {
                suma += notas[i][j];
            }
            double promedio = suma / notas.length;
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                indiceMejorMateria = j;
            }
        }
        System.out.println("\nLa materia con el mejor promedio es: " + materias[indiceMejorMateria] + " con un promedio de " + mejorPromedio);
    }
}
