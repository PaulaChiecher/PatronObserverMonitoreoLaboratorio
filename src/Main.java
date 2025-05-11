public class Main {
    public static void main(String[] args) {
        Laboratorio laboratorio1 = new Laboratorio();
        Cientifico cientifico1 = new Cientifico("Ing. Chiecher");
        laboratorio1.suscribir(cientifico1);
        //Simular cambios de resultados
        laboratorio1.setResultadoExperimento("El Resultado de la prueba Chemie fué exitosa");
    }
}
