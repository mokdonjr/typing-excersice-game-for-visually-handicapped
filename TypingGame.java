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

		this.setTitle("타이핑 게임");
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
		//Container con= getContentPane();//컨테이너..!
		//con.setBackground(Color.WHITE);
		//con.setLayout(new FlowLayout());
		
		
		//con.add(tool, BorderLayout.NORTH);
		sPane.setEnabled(false);
		makeToolBar();
		//getContentPane().add(new InputPanel(),BorderLayout.SOUTH);
		setVisible(true);
		
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				int result=JOptionPane.showConfirmDialog(TypingGame.this,"파일을 저장하시겠습니까","Exit Massage",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);

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
		System.out.println("ToolBar 실행");
		JToolBar tBar = new JToolBar();
		tBar.add(new JButton("다시시작"));
		tBar.addSeparator(new Dimension(50,20));
		tBar.add(new JButton("?????"));
		tBar.addSeparator(new Dimension(50,20));
		tBar.add(new JButton("끝내기"));
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
	public void actionPerformed(ActionEvent e) {//actionListener의 actionPerformed 를 오버라이드로 재구현했다.
		if(e.getSource()==menu.getExitM()){//메세지 박스 후 yes 면 종료 but No일 시 계속 break;
			//int result=0;
			JOptionPane.showMessageDialog(null, "변경내용을 저장하시겠습니까?");

			//QUESTION_MESSAGE(,"게음을 저장하시겠습니까?");
			//System.exit(0);//파일 닫기
			/*
			 * if yes면 save호출로 저장
			 * if no 면  System.exit(0);
			 * 
			 */

		}
		else if(e.getSource()==menu.getOpenM()){

			rd.open();//open();//열기 다이얼로그
			//파일 읽기
		}
		else if(e.getSource()==menu.getSaveM()){

		}
		else if(e.getSource()==menu.getNewM()){//다시 시작

			/*this.setVisible(true);
			System.out.println("다시 시작");*/
		}


	}
}