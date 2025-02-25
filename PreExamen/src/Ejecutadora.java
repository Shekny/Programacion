public class Ejecutadora {
    public static void main(String[] args) {
        SistemaGestionEstudiantes sistema = new SistemaGestionEstudiantes();
        sistema.crearArchivoCSV("estudiantes.csv");
        sistema.cargarDatosDesdeArchivo("estudiantes.csv");
        sistema.mostrarEstudiantes();
        sistema.mostrarCiudadesUnicas();
        sistema.mostrarEstudiantesPorCiudad();
        sistema.atenderEstudiantes();
    }
}
