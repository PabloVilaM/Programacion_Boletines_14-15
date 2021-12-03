package boletin15;


public class Pelicula extends Multimedia{
    private String actorprin;
    private String actrizprin;

    public Pelicula(String actorprin, String actrizprin, String titu, String auto, String forma, String durac) {
        super(titu, auto, forma, durac);
        this.actorprin = actorprin;
        this.actrizprin = actrizprin;
    }
    
    
    public Pelicula(){
        
    }

    @Override
    public String toString() {
       String rela = super.toString() + "Pelicula{" + "actorprin=" + actorprin + ", actrizprin=" + actrizprin + '}';
        return rela;
    }
    
    
    
    public String getActor(){
        return actorprin;
        
    }
    
    public String getActriz(){
        return actrizprin;
    }
    
    
    
    
}
