package sedecti.Identificacao_maquina;
import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JFileChooser;

public class GenerateEtiqueta {
	
	static boolean valorVazio(String valor) {
		if (valor == null)
		return false;
		
		if (valor.trim().isEmpty()) {
			return true;
		}
		
		return false;
	}
	
	
		
	public static void main(String args[]) throws IOException { 
		
		Etiqueta etiqueta;
		GeneratePDF generatePdf;
		String secretaria, tombo, configuracao, setor, responsavel, observacao;
		String pathToSave = "";
		
		secretaria = JOptionPane.showInputDialog("Secretaria: ");
		
		if (secretaria == null) {
			JOptionPane.showMessageDialog(null, "Operação cancelada", "Cancelado", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		while (GenerateEtiqueta.valorVazio(secretaria))
		secretaria = JOptionPane.showInputDialog("Secretaria: ");
		
		tombo = JOptionPane.showInputDialog("Tombo ou Número de Série do equipamento: ");
			
		while (GenerateEtiqueta.valorVazio(tombo))
		tombo = JOptionPane.showInputDialog("Tombo ou Número de Série do equipamento: ");	
		
		if (tombo == null) {
			JOptionPane.showMessageDialog(null, "Operação cancelada", "Cancelado", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		configuracao = JOptionPane.showInputDialog("Configuração: ");
		
		if (configuracao == null) {
			JOptionPane.showMessageDialog(null, "Operação cancelada", "Cancelado", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		setor = JOptionPane.showInputDialog("Setor: ");
		
		if (setor == null) {
			JOptionPane.showMessageDialog(null, "Operação cancelada", "Cancelado", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		while (GenerateEtiqueta.valorVazio(setor))
		setor = JOptionPane.showInputDialog("Setor: ");	
		
		responsavel = JOptionPane.showInputDialog("Responsável pela baixa: ");
		
		if (responsavel == null) {
			JOptionPane.showMessageDialog(null, "Operação cancelada", "Cancelado", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		observacao = JOptionPane.showInputDialog("Alguma observação: ");
		
		if (observacao == null) {
			JOptionPane.showMessageDialog(null, "Operação cancelada", "Cancelado", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		etiqueta = new Etiqueta(secretaria, tombo, configuracao, setor, responsavel, observacao);
		
		JFileChooser chooser = new JFileChooser();
		
		chooser.setDialogTitle("Salvar");
		chooser.setCurrentDirectory(new File("."));
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
		int result = chooser.showSaveDialog(null);
			
		if (result == JFileChooser.APPROVE_OPTION) {
			 pathToSave = chooser.getSelectedFile().getAbsolutePath();
			 generatePdf = new GeneratePDF(etiqueta, pathToSave);
			 
			 //JOptionPane.showMessageDialog(null, "Criado com sucesso. \n" + GeneratePDF.generateNomeArquivo(etiqueta), "Salvo", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Operação cancelada", "Cancelado", JOptionPane.ERROR_MESSAGE);
		}
				
	}				
}
