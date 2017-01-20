package rational.pkgclass;

/**
 *
 * @author student
 */
public class RationalClass {
    private int num;
    private int denom;
    
    
    public RationalClass(){
        num = 1;
        denom = 2;
        
    }
       
    public RationalClass(int num, int denom){
        this.num = num;
        this.denom = denom;        
    }
    
    public RationalClass(int num){
        this.num = num;
    }
    
    public int getNum(){
        return num;
    }
    
    public int getDenom(){
        return denom;
    }
    
    public void setNum(){
        this.num = num;
    }
    
    public void setDenom(){
        this.denom = denom;
    }
    
    public RationalClass add(RationalClass r){
        return new RationalClass();
    }
    
    public RationalClass subtract(RationalClass r){
        return new RationalClass();
    }
    
    public RationalClass multiply(RationalClass r){
        return new RationalClass();
    }
    
    public RationalClass divide(RationalClass r){
        return new RationalClass();
    }
    
    }
