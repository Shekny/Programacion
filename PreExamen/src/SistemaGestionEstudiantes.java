import java.io.*;
import java.util.*;

class SistemaGestionEstudiantes {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private Set<String> ciudadesUnicas = new HashSet<>();
    private Map<String, ArrayList<Estudiante>> estudiantesPorCiudad = new HashMap<>();
    private Queue<Estudiante> colaAtencion = new LinkedList<>();

    public void crearArchivoCSV(String nombreArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            bw.write("Juan,25,Madrid,8.5");
            bw.newLine();
            bw.write("Ana,30,Barcelona,9.0");
            bw.newLine();
            bw.write("Luis,22,Valencia,7.8");
            bw.newLine();
            System.out.println("Archivo CSV creado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al crear el archivo CSV: " + e.getMessage());
        }
    }

    public void cargarDatosDesdeArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                String ciudad = datos[2];
                double calificacion = Double.parseDouble(datos[3]);

                Estudiante estudiante = new Estudiante(nombre, edad, ciudad, calificacion);
                estudiantes.add(estudiante);
                ciudadesUnicas.add(ciudad);
                if (!estudiantesPorCiudad.containsKey(ciudad)) {
                    estudiantesPorCiudad.put(ciudad, new ArrayList<>());
                }
                estudiantesPorCiudad.get(ciudad).add(estudiante);
                colaAtencion.offer(estudiante);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void mostrarEstudiantes() {
        System.out.println("Lista de estudiantes:");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }

    public void mostrarCiudadesUnicas() {
        System.out.println("Ciudades únicas:");
        for (String ciudad : ciudadesUnicas) {
            System.out.println(ciudad);
        }
    }

    public void mostrarEstudiantesPorCiudad() {
        System.out.println("Estudiantes agrupados por ciudad:");
        for (Map.Entry<String, ArrayList<Estudiante>> entrada : estudiantesPorCiudad.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }

    public void atenderEstudiantes() {
        System.out.println("Atendiendo estudiantes:");
        while (!colaAtencion.isEmpty()) {
            System.out.println("Atendiendo a: " + colaAtencion.poll());
        }

    }

}