import javax.swing.JOptionPane;
public class CalculadoraSimples {

	public static void main(String[] args) {
		String	inputNumero1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String  inputNumero2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		
		double numero1 = Double.parseDouble(inputNumero1);
		double numero2 = Double.parseDouble(inputNumero2);
		
		
		String[] operacoes = {"Soma", "Subtração", "Multiplicacao", "Divisao"};
		int escolha = JOptionPane.showOptionDialog(null, "Escolha uma operação:", "Calculadora",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, operacoes, operacoes[0]);
		
		double resultado = 0;
		
		switch (escolha) {
		
		case  0:
			resultado =  numero1 + numero2;
			break;
		
		case  1:
			resultado = numero1 - numero2;
			break;
		
		case 2:
			resultado = numero1 * numero2;
			break;
			
		case 3:
			if(numero2 !=0) {
					resultado = numero1 / numero2;
					
		} else {
			JOptionPane.showMessageDialog (null, "Não é possível dividir por zero.");
			return;
		}
		
			break;
	
		}
		
	
		JOptionPane.showMessageDialog(null, "Resultado da Operação: " + resultado);
	}

}
