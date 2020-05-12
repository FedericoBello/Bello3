/**
* @author Bello
*<p>ver 2<p>
* classe BelloFigura 23
* eredita metodi classe <b>Quadrato</b>
*
*
*/
public class AreaRettangolo {
 private float base;
 private float altezza;
 public AreaRettangolo(float base,float altezza){
		this.base=base;
		this.altezza=altezza;

		}
 /**
 *
 * @return valore perimetro
 */

 //calcola il perimetro del rettangolo
 public float perimetro() {
	return 2 * (base + altezza);
 }
 /**
 *
 * @return valore area
 */

//calcola l'area del quadrato
 public float area() {
	return   base * altezza;
 }
 /**
 *
 * @return stampa
 */
	@Override
public String toString() {
	return "base=" + base + ", altezza=" + altezza;
}
	public float getBase() {
	return base;
}
public void setBase(float base) {
	this.base = base;
}
public float getAltezza() {
	return altezza;
}
public void setAltezza(float altezza) {
	this.altezza = altezza;
}
/**
*main
* CLASSE main
* 
* 
*/
	public static void main(String[] args) {
		AreaRettangolo a=new AreaRettangolo(5, 4);
         System.out.println(a.area());
         System.out.println(a.perimetro());
         System.out.println(a);

}
}