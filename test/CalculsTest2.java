import static org.junit.jupiter.api.Assertions.*;


import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author Yo
 *
 */
@RunWith(Parameterized.class)
class CalculsTest2 {

	@Test
	void test() 
	{
		//fail("Not yet implemented");
	}

	// Fournisseur de données
    static Stream<Arguments> chargerJeuDeTest() throws Throwable 
    {
        return Stream.of(
            Arguments.of(2,2,4), // appellera : testMultiplier(2,2,4)
            Arguments.of(6,6,36),
            Arguments.of(3,2,6)
        );
    }
    
    
    
    
    static Stream<Arguments> chargerJeuDeTestAdd() throws Throwable 
    {
        return Stream.of(
            Arguments.of(2,2,4), // appellera : testAdditionner(2,2,4)
            Arguments.of(6,6,12),
            Arguments.of(3,2,5)
        );
    }
    
    
    
    static Stream<Arguments> chargerJeuDeTestDiff() throws Throwable 
    {
        return Stream.of(
            Arguments.of(2,2,0), // appellera : testSoustraire(2,2,0)
            Arguments.of(8,6,2),
            Arguments.of(3,2,1)
        );
    }
    
    
    
    static Stream<Arguments> chargerJeuDeTestDiv() throws Throwable 
    {
        return Stream.of(
            Arguments.of(4,2,2), // appellera : testDivision(4,2,2)
            Arguments.of(8,2,4),
            Arguments.of(6,2,3)
        );
    }
    
    
    
    
    @ParameterizedTest(name="Multiplication numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("chargerJeuDeTest")
	void testMultiplier(int firstNumber, int secondNumber, int expectedResult) 
	{
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.multiplier(), "test en échec pour " + firstNumber + " * " + secondNumber + " != " + expectedResult); 

	        String n = null;
	        assertNull(n);
	}
    
	
	@ParameterizedTest(name="Addition numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("chargerJeuDeTestAdd")
	void testAdditionner(int firstNumber, int secondNumber, int expectedResult) 
	{
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.additionner(), "test réussi pour " + firstNumber + " + " + secondNumber + " = " + expectedResult); 

	}
	
	@ParameterizedTest(name="Soustraction numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("chargerJeuDeTestDiff")
	void testSoustraire(int firstNumber, int secondNumber, int expectedResult) 
	{
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.soustraire(), "test réussi pour " + firstNumber + " - " + secondNumber + " = " + expectedResult); 

	}
	
	@ParameterizedTest(name="Division numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("chargerJeuDeTestDiv")
	void testDiviser(int firstNumber, int secondNumber, int expectedResult) 
	{
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.diviser(), "test réussi pour " + firstNumber + " / " + secondNumber + " = " + expectedResult); 

	}

	

}
