public class Main {

    public static void main(String[] args) {

        CarpetaNube carpeta1 = CarpetaNube.crear(1, "Tareas", 100);
        System.out.println("Crear carpeta 1 -> usado: " + carpeta1.getEspacioUsado());

        boolean resultado = carpeta1.guardar(60);
        System.out.println("Guardar 60 -> " + resultado
                + "; usado: " + carpeta1.getEspacioUsado());

        resultado = carpeta1.guardar(50);
        System.out.println("Guardar 50 -> " + resultado
                + "; usado: " + carpeta1.getEspacioUsado());

        resultado = carpeta1.guardar(40);
        System.out.println("Guardar 40 -> " + resultado
                + "; usado: " + carpeta1.getEspacioUsado());

        resultado = carpeta1.eliminar(30);
        System.out.println("Eliminar 30 -> " + resultado
                + "; usado: " + carpeta1.getEspacioUsado());

        resultado = carpeta1.eliminar(100);
        System.out.println("Eliminar 100 -> " + resultado
                + "; usado: " + carpeta1.getEspacioUsado());

        resultado = carpeta1.guardar(-5);
        System.out.println("Guardar -5 -> " + resultado
                + "; usado: " + carpeta1.getEspacioUsado());

        // aquí siguen las pruebas de nombre y de creación
        carpeta1.setNombre("");
        System.out.println("Cambiar nombre a vacío -> nombre: " + carpeta1.getNombre());

        carpeta1.setNombre("Proyectos");
        System.out.println("Cambiar nombre a Proyectos -> nombre: " + carpeta1.getNombre());

        CarpetaNube carpeta2 = CarpetaNube.crear(2, "Fotos", 200);
        System.out.println("Total creadas: " + CarpetaNube.getCarpetasCreadas());

        CarpetaNube invalida = CarpetaNube.crear(0, "Basura", 50);
        if (invalida == null) {
            System.out.println("Carpeta con id 0 -> null");
        }
        System.out.println("Total creadas: " + CarpetaNube.getCarpetasCreadas());
    }
}