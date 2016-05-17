import java.awt.*;

import javax.swing.*;

public class GameFrame extends JFrame{
	MainPanel mPanel = new MainPanel();
	
	GameFrame(){
		//super("Ÿ��Ʋ"); �Ǵ� setTitle�̿�//JFrame�ǻ����ڸ� ȣ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������ â�� ������ �� ���α׷��� ���� �װڴ�.
		this.setSize(800, 800);
		setTitle("Ÿ��Ʋ");
		makeMenu();
		
		JSplitPane sPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		getContentPane().add(sPane, BorderLayout.CENTER);
		sPane.setLeftComponent(new MainPanel());
		sPane.setRightComponent(new ScorePanel());
		sPane.setDividerLocation(400);//pixel���� �Է½��� ������Ų��. ��ü 500pixel��
		sPane.setEnabled(false);
		makeToolBar();
	
		setVisible(true);
		
		
	}
	
	void makeMenu(){
		JMenuBar mBar = new JMenuBar();
		JMenu fileMenu = new JMenu("����");
		mBar.add(fileMenu);
		fileMenu.add(new JMenuItem("�б�"));
		fileMenu.add(new JMenuItem("����"));
		fileMenu.addSeparator();
		fileMenu.add(new JMenuItem("����"));
		this.setJMenuBar(mBar);
	}
	
	void makeToolBar(){
		JToolBar tBar = new JToolBar();
		//JToolBar�� ��Ģ�� �ִ�.
		//�ݵ�� BoardLayout �Ŵ����� ����
		tBar.add(new JButton("read"));
		tBar.add(new JButton("write"));
		tBar.addSeparator(new Dimension(50,20));
		tBar.add(new JButton("exit"));
		getContentPane().add(tBar, BorderLayout.NORTH);
	}
}
