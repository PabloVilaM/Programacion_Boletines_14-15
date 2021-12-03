package boletin14;


public class Libro extends Publicación {
    private boolean prestados;
    
    public Libro(){
        
    }   

    public Libro(String cod, String tit, int ano, boolean pres) {
        super(cod, tit, ano);
        this.prestados = pres;
    }

    @Override
    public String toString() {
        return "Libro{" + "prestados=" + prestados + '}';
    }
    
    public int devolverAño(){
        return super.getAño();
    }
    
    public String devolverCode(){
        return super.getCodigo();
    }
}
