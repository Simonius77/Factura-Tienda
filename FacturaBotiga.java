//*Els programa demanarà la següent informació:
//*-	Nom del producte.
//*-	Preu.
//*-	Quantitat d’unitats venudes.
//*-	Descompte aplicable (%).
//*L’IVA estarà declarat com a constant i serà d’un 21%
//*
//*El programa respondrà amb la següent informació:
//*-	Nom del producte.
//*-	Preu total sense IVA.
//*-	Descompte total.
//*-	Preu total amb descompte.
//*-	IVA del preu total amb descompte.
//*-	Preu total amb IVA.
import java.util.Scanner;//* libreria para la entrada de datos por teclado.
public class FacturaBotiga {
	private static final double IVA = 0.21; //* declara la constante del valor del IVA aplicable.
	public static void main (String[] args) {
		Scanner lector = new Scanner(System.in);//* se inicia la libreria.	
		//*double dEscuento= IVA;
		System.out.println("Por favor introduce el nombre del producto");//* hace la entrada del nombre por tecaldo.
		String pRoducto = lector.nextLine();
		System.out.println("Por favor introduce el precio del producto");
		double pRecio = lector.nextDouble();//* entra el dato del usuario en formato double.
		lector.nextLine();//*descarta el reto del imput si hay.
		System.out.println("Por favor introduce la cantidad de unidades vendidas");
		double cAntidad = lector.nextDouble();
		lector.nextLine();
		System.out.println("Por favor introduce el % de descuento aplicable");
		double dEscuento = lector.nextDouble();
		lector.nextLine();	
		double pRecioTotalsinIva = cAntidad*pRecio;
		double dEscuentoTotal = (pRecioTotalsinIva*dEscuento)/100;
		double pRecioDescuento = (pRecioTotalsinIva-dEscuentoTotal);
		double iVaTotal = pRecioDescuento*IVA;
		double pReciodEscuentoTotalconIva = (pRecioDescuento-iVaTotal);
		System.out.println(" El producto es " + pRoducto);
		System.out.println(" El precio sin IVA es " + pRecioTotalsinIva);
		System.out.println(" El descuento total es " + dEscuentoTotal);
		System.out.println(" El precio total con descuento es " + pRecioDescuento);
		System.out.println(" El IVA total es de " + iVaTotal +"E");
		System.out.println(" El precio total con el " + IVA + "% de IVA es de " + pReciodEscuentoTotalconIva + "E");
				
		
		
		
		
		
		 
		
	}	
}