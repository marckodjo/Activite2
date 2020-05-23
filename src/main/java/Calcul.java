/**
*Une classe.
**/
public class Calcul {
	
  protected Calcul() {
	}
/**
* Calcul la somme de deux nombres.
* @param a int
* @param b int
* @return a + b
**/
public static int somme(final int a, final int b) {
return a + b;
}
/**
* Calcul maFonction de deux nombres.
* @param a int
* @param b int
* @return a / b
**/
public static int maFonction(final int a, final int b) {
final int t = 10;
if (b >= t) {
return a / b;
}
return b;	
}
/**
* @param a int
* @param b int
* @return a / b si b != 0
//*throw IllegalArgumentException si b == 0
*/
public static int division(final int a, final int b) {
if (b == 0) {
throw new IllegalArgumentException("b ne doit pas etre 0");
}
return a / b;
}
}
