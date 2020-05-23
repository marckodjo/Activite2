import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
* Tests unitaire pour la classe Calcul.
**/
public class CalculTest {
/**
 * constructeur.
**/
@Test
public void testConstructeur() {
new Calcul();
}
/**
 * Test la méthode somme.
**/
@Test
public void testSomme() {
final int a = 2;
final int b = 3;
final int c = 5;
Assertions.assertEquals(c, Calcul.somme(a, b));
}
/**
 * Test la méthode division.
**/
@Test
public void testDivision() {
final int a = 8;
final int b = 2;
final int c = 4;
Assertions.assertEquals(c, Calcul.division(a, b));
}
/**
 * Test la méthode division.
**/
@Test
public void testDivision1(){
Assertions.assertEquals(0, Calcul.maFonction(4, 0));
}
/**
 * Test la méthode maFonction.
**/
@Test
public void testMaFonction() {
final int a = 4;
final int b = 4;
final int c = 4;
Assertions.assertEquals(c, Calcul.maFonction(a, b));
}
/**
 * Test la méthode maFonction.
**/
@Test
public void testMaFonction1() {
final int a = 64;
final int b = 16;
final int c = 4;
Assertions.assertEquals(c, Calcul.maFonction(a, b));
}
}
