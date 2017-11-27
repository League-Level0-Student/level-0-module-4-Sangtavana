import javax.swing.JOptionPane;

public class shazam {
public static void main(String[] args) {
	String ask= JOptionPane.showInputDialog(null,"Enter a word.");
	String times=JOptionPane.showInputDialog(null,"Enter a number.");
	int number= Integer.parseInt(times);
	for(int i=0;i<number;i++){
		System.out.println(ask);
	}
}
}
