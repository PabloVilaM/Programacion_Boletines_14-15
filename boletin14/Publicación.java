package boletin14;


public class Publicación {
    private String codigo;
    private String titulo;
    private int año;
    
    public Publicación(){
        
    }
    
    public Publicación(String cod, String tit, int ano){
        codigo = cod;
        titulo = tit;
        año = ano;
    }
    
    
    public int getAño(){
        return año;
    }

    public String getCodigo() {
        return codigo;
    }


    @Override
    public String toString() {
        return "Publicaci\u00f3n{" + "codigo=" + codigo + ", titulo=" + titulo + ", a\u00f1o=" + año + '}';
    }
    
    
}
