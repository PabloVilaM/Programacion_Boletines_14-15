package boletin15;


public class Disco extends Multimedia {
    private String xenero;

    public Disco(String xenero, String titu, String auto, String forma, String durac) {
        super(titu, auto, forma, durac);
        this.xenero = xenero;
    }
    
    public Disco(){
        
    }

    public String getXenero(){
        return xenero;
    }

    @Override
    public String toString() {
        String rela = super.toString() + "Disco{" + "xenero=" + xenero + '}';
        return rela;
    }
    
    
}
