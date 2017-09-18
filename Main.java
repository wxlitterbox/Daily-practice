package fraction;
import java.util.Scanner;;


class Fraction {
	private int molecular;
	private int denominator;
	
	public Fraction(int molecular, int denominator){
		if(this.denominator!=0){
		this.molecular = molecular;
		this.denominator = denominator;
		}
	}
	public Fraction plus(Fraction r){
		int mp = this.molecular;
		int dp = this.denominator;
		int npdenominator = dp*r.denominator;
		int npmolecular = mp*r.denominator+dp*r.molecular;
		return new Fraction(npmolecular,npdenominator);
	}
	public Fraction multiply(Fraction r){
		return new Fraction(this.molecular*r.molecular,this.denominator*r.denominator);
	}
	private int divisor2(int n,int m){ 
        if(m%n==0){
           return n;
       }else{
           return divisor2(m%n,n);
       }
    }
	private double todouble(double s,double t){
		s=this.molecular;
		t=this.denominator;
		return (double)s/t;
		
	}
	public void print(){
		int min = divisor2(this.molecular,this.denominator);
		if(todouble(this.molecular,this.denominator)==1.0)
			System.out.println(1);
		else
		System.out.printf("%d/%d\n", this.molecular/min,this.denominator/min);	
	}
}
	
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		System.out.print();
		in.close();
	}

}
