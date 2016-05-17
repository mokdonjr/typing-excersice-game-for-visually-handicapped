import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;

public class TypingGame extends JFrame implements ActionListener {
	private MenuPane menu;
	private JToolBar tool;
	Reader rd = new Reader();

	public TypingGame() {

		this.setTitle("Ÿ���� ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		setLocation(100,100);
		menu = new MenuPane();
		
		
		this.setJMenuBar(menu);
		
		JSplitPane sPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		getContentPane().add(sPane, BorderLayout.CENTER);
	
		sPane.setLeftComponent(new MPanel());
		sPane.setRightComponent(new SPanel());
		sPane.setDividerLocation(400);
		sPane.setEnabled(false);
		//Container con= getContentPane();//�����̳�..!
		//con.setBackground(Color.WHITE);
		//con.setLayout(new FlowLayout());
		
		
		//con.add(tool, BorderLayout.NORTH);
		sPane.setEnabled(false);
		makeToolBar();
		//getContentPane().add(new InputPanel(),BorderLayout.SOUTH);
		setVisible(true);
		
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				int result=JOptionPane.showConfirmDialog(TypingGame.this,"������ �����Ͻðڽ��ϱ�","Exit Massage",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);

				if(result==JOptionPane.YES_OPTION){
					rd.save();
					rd.fileWrite();
					System.exit(0);
				}
				else if(result==JOptionPane.NO_OPTION){
					System.exit(0);
				}
				else if(result==JOptionPane.DEFAULT_OPTION){

				}
			}
		});
	}

	private void makeToolBar() {
		System.out.println("ToolBar ����");
		JToolBar tBar = new JToolBar();
		tBar.add(new JButton("�ٽý���"));
		tBar.addSeparator(new Dimension(50,20));
		tBar.add(new JButton("?????"));
		tBar.addSeparator(new Dimension(50,20));
		tBar.add(new JButton("������"));
		tBar.addSeparator(new Dimension(50,20));
		getContentPane().add(tBar, BorderLayout.NORTH);
		
	}

	public void event(){
		menu.getExitM().addActionListener(this);
		menu.getOpenM().addActionListener(this);
		menu.getSaveM().addActionListener(this);
		menu.getNewM().addActionListener(this);
		menu.getRankM().addActionListener(this);
		menu.getMakerM().addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {//actionListener�� actionPerformed �� �������̵�� �籸���ߴ�.
		if(e.getSource()==menu.getExitM()){//�޼��� �ڽ� �� yes �� ���� but No�� �� ��� break;
			//int result=0;
			JOptionPane.showMessageDialog(null, "���泻���� �����Ͻðڽ��ϱ�?");

			//QUESTION_MESSAGE(,"������ �����Ͻðڽ��ϱ�?");
			//System.exit(0);//���� �ݱ�
			/*
			 * if yes�� saveȣ��� ����
			 * if no ��  System.exit(0);
			 * 
			 */

		}
		else if(e.getSource()==menu.getOpenM()){

			rd.open();//open();//���� ���̾�α�
			//���� �б�
		}
		else if(e.getSource()==menu.getSaveM()){

		}
		else if(e.getSource()==menu.getNewM()){//�ٽ� ����

			/*this.setVisible(true);
			System.out.println("�ٽ� ����");*/
		}


	}
}