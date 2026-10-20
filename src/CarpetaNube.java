public class CarpetaNube {
    private final int id;
    private String nombre;
    private final int capacidadMaxima;
    private int espacioUsado;
    private static int carpetasCreadas = 0;

    private CarpetaNube(int id, String nombre, int capacidadMaxima){
        this.id=id;
        this.nombre=nombre;
        this.capacidadMaxima=capacidadMaxima;
        this.espacioUsado=0;
        carpetasCreadas++;



    }
    public static CarpetaNube crear(int id, String nombre, int capacidadMaxima) {

        if (id <= 0) {
            return null;      // el id debe ser positivo
        }

        // aquí va la revisión del nombre
        if(nombre == null || nombre.isEmpty()){
            return null;
        }

        // aquí va la revisión de la capacidad
        if(capacidadMaxima<=0){
            return null;
        }

        return new CarpetaNube(id, nombre, capacidadMaxima);   // todo bien: se crea
    }

    public int getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getEspacioUsado() {
        return espacioUsado;
    }

    public static int getCarpetasCreadas() {
        return carpetasCreadas;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.isEmpty()){
        this.nombre = nombre;}
    }
    public boolean guardar(int mb) {
        if (mb > 0 && espacioUsado + mb <= capacidadMaxima) {
            espacioUsado = espacioUsado + mb;
            return true;
        }
        return false;
    }
    public boolean eliminar(int mb) {
        if (mb>0 && mb<=espacioUsado) {
            espacioUsado = espacioUsado - mb;
            return true;
        }
        return false;
    }
}
