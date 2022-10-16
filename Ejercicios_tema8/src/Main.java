public class Main {
    public static void main(String[] args) {
        Persona persona1=new Persona();
        persona1.setEdad(45);
        persona1.setNombre("Miguel");
        persona1.setTelefono("654668732");
        System.out.println(persona1.getNombre()+" tiene "+persona1.getEdad()+" años y su número de teléfono es "+persona1.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
}