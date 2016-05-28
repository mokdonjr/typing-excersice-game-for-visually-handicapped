
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.WindowConstants;

//JFrame클래스
public class TypingGame extends JFrame implements ActionListener {
	private MenuPane menu;
	private JToolBar tool;
	
	Reader rd = new Reader();
	TypingData data = new TypingData();
	
	public TypingGame() {
		//1.기본설정
		this.setTitle("타이핑 게임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200,760);
		setLocation(100,100);
		//2.MenuBar
		menu = new MenuPane();
		this.setJMenuBar(menu);
		//3. ToolBar ( 5월25일. ToolBar 내에 JSlider 추가 )
		makeToolBar();
		//4. MPanel과 SPanel로 쪼갬
		JSplitPane sPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		Container container = getContentPane();
		container.add(sPane, BorderLayout.CENTER);
		sPane.setRightComponent(new SPanel());
		sPane.setLeftComponent(new MPanel());
		sPane.setDividerLocation(800);
		sPane.setEnabled(false);
		
		setVisible(true);

		//5. 리스너
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
	            int result=JOptionPane.showConfirmDialog(TypingGame.this,"파일을 저장하시겠습니까","Exit Massage",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
	            //int i=0;
	            if(result==JOptionPane.YES_OPTION){
	               System.out.println("YES_OPTION 동작");
	               rd.save();
	               rd.fileWrite();
	               
	               //i++;
	            }
	            else if(result==JOptionPane.NO_OPTION){
	               System.out.println("No_OPTION 동작");
	               System.exit(0);
	            }
	            else if(result==JOptionPane.CANCEL_OPTION) {
	               System.out.println("CANCEL_OPTION 동작");
	               setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
	            }
	            else if(result==JOptionPane.DEFAULT_OPTION){//x버튼을 눌렀을떄..
	               System.out.println("DEFAULT_OPTION 동작");
	               setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
	            }   
	            //if(i==1) System.exit(0);
			}
	            

			});
	}

	private void makeToolBar() {
		System.out.println("ToolBar 실행");
		JToolBar tBar = new JToolBar();
		tBar.add(new JButton("다시시작"));
		tBar.addSeparator(new Dimension(50,20));
		tBar.add(new JButton("타이핑습성분석"));
		tBar.addSeparator(new Dimension(50,20));
		tBar.add(new JButton("끝내기"));
		tBar.addSeparator(new Dimension(50,20));
		/*
		 * 5월 25일 승찬
		 * 
		 * ToolBar에 JSlider추가
		 * 목적 : 볼륨조절
		 * ToolBar메소드에 위치한 이유 : 딱히 둘대가 없는데 ToolBar 우측 비어있는 공간에 있으면 좋을 것 같다.
		 */
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMajorTickSpacing(10);
		slider.setSize(200,20);
		tBar.add(slider);
		
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

