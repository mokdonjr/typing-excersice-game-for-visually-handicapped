
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuPane extends JMenuBar {
	private JMenu fileM, etcM;//����, ��Ÿ���
	private JMenuItem newM, openM, saveOriginM,saveM, exitM, rankM, levelM, keyboardShorCutM , wordeditM,makerM;
	//���� - ���θ����, �ҷ�����, �ٸ��̸����� �����ϱ�, ������, ����
	//��Ÿ- ��ŷ, ������, ���̵�
	
	public MenuPane() {//������
		System.out.println("�޴����� ������ ����");
		
		
	
		
		fileM = new JMenu("����");
		etcM = new JMenu("��Ÿ");
		//�Ŵ�
		
		newM = new JMenuItem("�ٽ� �����ϱ�");
		openM = new JMenuItem("����");
		saveOriginM= new JMenuItem("����");
		saveM = new JMenuItem("�ٸ� �̸����� ����");
		exitM = new JMenuItem("������");
		rankM = new JMenuItem("��ŷ����");
		levelM= new JMenuItem("���̵� ����");
		keyboardShorCutM = new JMenuItem("����Ű");
		wordeditM = new JMenuItem("�ܾ��� ����");
		makerM = new JMenuItem("���� �����");
		
		//���� !!!�߰� �ϱ�
		fileM.add(newM);
		fileM.add(openM);
		fileM.add(saveOriginM);
		fileM.add(saveM);
		fileM.add(exitM);
		
		
		//��Ÿ��!!! ��� �߰��ϱ�
		etcM.add(rankM);
		etcM.add(levelM);
		etcM.add(keyboardShorCutM);
		etcM.add(wordeditM);
		etcM.add(makerM);
		
	
		//����
		this.add(fileM);
		this.add(etcM);
		
		
	}
	
	//JMenu!!
	public JMenu getFileM() {
		return fileM;
	}
	public JMenu getEtcM() {
		return etcM;
	}
	
	//JMenuItem!!
	public JMenuItem getNewM() {
		return newM;
	}
	public JMenuItem getOpenM() {
		return openM;
	}
	public JMenuItem getSaveOriginM() {
		return saveOriginM;
	}
	public JMenuItem getSaveM() {
		return saveM;
	}
	public JMenuItem getExitM() {
		return exitM;
	}
	public JMenuItem getRankM() {
		return rankM;
	}
	public JMenuItem getLevelM() {
		return levelM;
	}
	public JMenuItem getKeyboardShorCut() {
		return keyboardShorCutM;
	}
	public JMenuItem getWordEditM() {
		return wordeditM;
	}
	public JMenuItem getMakerM() {
		return makerM;
	}

}
