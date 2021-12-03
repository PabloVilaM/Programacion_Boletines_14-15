package boletin14;



public class Revista extends Publicación {
    private int numero;

    public Revista() {
        
    }

    public Revista(int numero, String cod, String tit, int ano) {
        super(cod, tit, ano);
        this.numero = numero;
    }

    @Override
    public String toString() {
       return super.toString()+"Revista{" + "numero=" + numero + '}';
    }
    
    public int devolverAño(){
        return super.getAño();
    }
    
    public String devolverCode(){
        return super.getCodigo();
    }
    
}
