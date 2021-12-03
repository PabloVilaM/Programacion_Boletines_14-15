package boletin15;


public class Multimedia {
    private String titulo;
    private String autor;
    private String formato;
    private String duracion;
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String formato(){
        return formato;
    }
    
    public String duracion(){
        return duracion;
    }

    @Override
    public String toString() {
        return "Multimedia{" + "titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion + '}';
    }
    
    public Multimedia(String titu, String auto, String forma, String durac){
        titulo = titu;
        autor= auto;
        formato = forma;
        duracion = durac;
    }
    
    public Multimedia(){
        
    }
    
   
}
