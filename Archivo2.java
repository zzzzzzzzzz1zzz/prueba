public class Archivo2 {
    public int paginas;
    public String titulo;
    public String subTitulo;
    public Archivo2(int paginas, String titulo, String subtitulo){
        this.paginas = paginas;
        this.titulo = titulo;
        this.subTitulo = subtitulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void mensaje(){
        System.out.println("Hola");
    }
    public void cambioRamaB(){
        System.out.println("Rama B");
    }
}
