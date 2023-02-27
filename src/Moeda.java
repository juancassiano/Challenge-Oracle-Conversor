import javax.swing.JOptionPane;

public class Moeda {
	public static final double REAL_DOLAR = 0.19;
	public static final double REAL_EURO = 0.18;
	public static final double REAL_LIBRA_ESTERLINA = 0.16;
	public static final double REAL_PESO_ARGENTINO = 38.22;
	public static final double REAL_PESO_CHILENO = 156.7;
	
	public static final double DOLAR_REAL = 5.14;
	public static final double EURO_REAL = 5.51;
	public static final double LIBRA_ESTERLINA_REAL = 6.21;
	public static final double PESO_ARGENTINO_REAL = 0.03;
	public static final double PESO_CHILENO_REAL = 0.03;
	
	
	public double converterRealEmDolar(double valorInserido) {
		return valorInserido * REAL_DOLAR;
	}
	public double converterRealEmEuro(double valorInserido) {
		return valorInserido * REAL_EURO;
	}
	public double converterRealEmLibraEsterlina(double valorInserido) {
		return valorInserido * REAL_LIBRA_ESTERLINA;
	}
	public double converterRealEmPesoArgentino(double valorInserido) {
		return valorInserido * REAL_PESO_ARGENTINO;
	}
	public double converterRealEmPesoChileno(double valorInserido) {
		return valorInserido * REAL_PESO_CHILENO;
	}
	
	public double converterDolarEmReal(double valorInserido) {
		return valorInserido * DOLAR_REAL;
	}
	public double converterEuroEmReal(double valorInserido) {
		return valorInserido * EURO_REAL;
	}
	public double converterLibraEsterlinaEmReal(double valorInserido) {
		return valorInserido * LIBRA_ESTERLINA_REAL;
	}
	public double converterPesoArgentinoEmReal(double valorInserido) {
		return valorInserido * PESO_ARGENTINO_REAL;
	}
	public double converterPesoChilenoEmReal(double valorInserido) {
		return valorInserido * PESO_CHILENO_REAL;
	}
	
	public void converterMoeda(String escolha, double valor) {
		double resultado = 0;
		switch(escolha) {
		case "Dolar para Real":
			resultado = converterDolarEmReal(valor);
			break;
			
		case "Euro para Real":
			resultado = converterEuroEmReal(valor);
			break;
			
		case "Libra Esterlina para Real":
			resultado = converterLibraEsterlinaEmReal(valor);
			break;
			
		case "Peso Argentino para Real":
			resultado = converterPesoArgentinoEmReal(valor);
			break;
			
		case "Peso Chileno para Real":
			resultado = converterPesoChilenoEmReal(valor);
			break;
			
		case "Real para Dolar":
			resultado = converterRealEmDolar(valor);
			break;
			
		case "Real para Euro":
			resultado = converterRealEmEuro(valor);
			break;
			
		case "Real para Libra Esterlina":
			resultado = converterRealEmLibraEsterlina(valor);
			break;
			
		case "Real para Peso Argentino":
			resultado = converterRealEmPesoArgentino(valor);
			break;
			
		case "Real para Peso Chileno":
			resultado = converterRealEmPesoChileno(valor);
			break;
			
		default:
			break;
	}
		JOptionPane.showMessageDialog(null, resultado);
		
	}
	
}
	