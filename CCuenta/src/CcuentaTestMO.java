
import static org.junit.Assert.*;
import org.junit.Test;

public class CcuentaTestMO {
	Ccuenta miCuenta=new Ccuenta("Mindaugas", "Ozeraitis", 3200,1);
	@Test
	/* 1.- Al crear una nueva cuenta, el objeto no es nulo.
	 * Para crear una cuenta, hay que usar, por ejemplo
	 * Ccuenta miCuenta=new Ccuenta("Ana","López",3200,1);
	*/
	public void testCcuentaMO() {
		assertNotNull(miCuenta);
	}

	@Test
	/*
	 * 2.- Tras crear una cuenta con un saldo de 3200,
	 * al obtener el saldo, este sigue siendo 3200.
	 */
	public void testGetSaldoMO() {
		double SaldoActual=miCuenta.getSaldo();
		assertEquals(3200,SaldoActual,0);
	}

	@Test
	/*
	 * 3.- Una prueba para ingresar una cantidad
	 * y que al obtener el saldo, éste sea correcto.
	 */
	public void testIngresarMO() throws Exception {
		miCuenta.ingresar(+300);
		double SaldoActual=miCuenta.getSaldo();
		assertEquals(3500,SaldoActual,0);
	}
	
	@Test
	/*
	 * 4.- Una prueba de ingresar una cantidad negativa.
	 *
	 */
	(expected=Exception.class)
	public void testIngresarNegativoMO() throws Exception {
		miCuenta.ingresar(-300);
	}
	
	@Test
	/*
	 * 5.- Una prueba de retirar una cantidad y
	 * que al obtener el saldo, éste es correcto.
	 */
	public void testRetirarMO() throws Exception {
		miCuenta.retirar(300);
		double SaldoActual=miCuenta.getSaldo();
		assertEquals(2900,SaldoActual,0);
	}

	@Test
	/*
	 * 6.- Una prueba de retirar más del saldo de la cuenta.
	 */
	(expected=Exception.class)
	public void testSacarMasMO() throws Exception {
		miCuenta.retirar(3300);
	}

}
