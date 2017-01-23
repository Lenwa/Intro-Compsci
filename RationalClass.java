package rational.pkgclass;
package rationalclass;


public class RationalClass {
    private int num;
    private int denom;
    
    
    public RationalClass(){
        this(1,2);
    }
       
    public RationalClass(int num, int denom){
        this.num = num;
        if(denom==0){
            throw new IllegalArgumentException();
        }
        this.denom = denom;
    }
    
    public RationalClass(int num){
        this(num,1);
        denom = 1;
    }
    
    public int getNum(){
        return num;
    }
    
    public int getDenom(){
        return denom;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    public void setDenom(int denom){
        if(denom==0){
            throw new IllegalArgumentException();
        }
        this.denom = denom;
    }
    
    public RationalClass add(RationalClass r){
        int num = this.num * r.denom + r.num * this.denom;
        int denom = this.denom * r.denom;
        return new RationalClass(num, denom);
    }
    
    public RationalClass subtract(RationalClass r){
        
       return new RationalClass(this.num * r.denom - r.num * this.denom,
       this.denom * r.denom);
    }
    
    public RationalClass multiply(RationalClass r){
        return new RationalClass(this.num * r.num, this.denom * r.denom);
    }
    
    public RationalClass divide(RationalClass r){
        return new RationalClass(this.num * r.denom, this.denom * r.num);
    }
    
    private void Simplify(){
        
    }
    
    @Override
    public String toString(){
        return (this.num + "/" + this.denom);
    }
}
