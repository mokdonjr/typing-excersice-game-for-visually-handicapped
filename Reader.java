import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Reader extends JFrame {
	private File file;
	
	public Reader() { System.out.println("Reader 생성자 생성"); }
	
	
	public void save() {
		JFileChooser chooser = new JFileChooser();
		int result  = chooser.showSaveDialog(this);
		if(result==JFileChooser.APPROVE_OPTION){
			file = chooser.getSelectedFile();
		}
		JOptionPane.showMessageDialog(this, file+"");
	}
	
	
	
	public void fileWrite() {


		try {
			PrintWriter pw = new PrintWriter(new FileWriter(file));
			String data = file.getName();
			pw.write(data);
			pw.println(data);
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	void open() {

		JFileChooser chooser = new JFileChooser();
		int result  = chooser.showOpenDialog(this);
		if(result==JFileChooser.APPROVE_OPTION){
			file = chooser.getSelectedFile();
		}
		JOptionPane.showMessageDialog(this, file+"");
	}
	
	/*void fileRead() {
		if(file==null) return; //함수를 나가라 라는 소리
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while((line=br.readLine())!=null){
				area.append(line+"\n");

			}

			br.close();
		} catch (IOException io) {
			io.printStackTrace();
		}

	}*/
	
}
