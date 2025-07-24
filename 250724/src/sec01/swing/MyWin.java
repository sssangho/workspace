package sec01.swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class MyFrame extends JFrame implements ActionListener {
	JButton jb1;
	JButton jb2;
	JButton jb3;
	JButton jb4;
	JButton jb5;
	JTextField jt1;
	JTextField jt2;
	JTextField jt3;
	JLabel lab1;
	JLabel lab2;
	JLabel lab3;
	JLabel lab4;
	int balance = 0;
	String ID;
	String Pw;
	boolean login = false;
	
	public MyFrame() { // 생성자
		Container cp = this.getContentPane();
		cp.setLayout(null);
		
		jb1 = new JButton("입금"); // 버튼 생성
		jb1.setBounds(10, 20, 70, 30 );
		cp.add(jb1);
		
		jb2 = new JButton("출금"); // 버튼 생성
		jb2.setBounds(100, 20, 70, 30 );
		cp.add(jb2);
		
		lab1 = new JLabel("금액");
		lab1.setBounds(200, 20, 70, 30 );
		cp.add(lab1);
		
		jt1 = new JTextField(); 
		jt1.setBounds(250, 20, 70, 30 );
		cp.add(jt1);
		
		lab2 = new JLabel("잔액 :" + balance + "원");
		lab2.setBounds(10, 50, 1000, 30);
		cp.add(lab2);
		
		lab3 = new JLabel("아이디 : "); // 버튼 생성
		lab3.setBounds(10, 90, 100, 30 );
		cp.add(lab3);
		
		jt2 = new JTextField();
		jt2.setBounds(80, 90, 70, 30 );
		cp.add(jt2);
		
		lab4 = new JLabel("비밀번호 : ");
		lab4.setBounds(10, 130, 100, 30 );
		cp.add(lab4);
		
		jt3 = new JTextField(); 
		jt3.setBounds(80, 130, 70, 30 );
		cp.add(jt3);
	
		
		jb4 = new JButton("로그인"); // 버튼 생성
		jb4.setBounds(10, 200, 70, 30 );
		cp.add(jb4);
		
		jb5 = new JButton("회원가입"); // 버튼 생성
		jb5.setBounds(100, 200, 100, 30 );
		cp.add(jb5);
		
		this.setSize(500, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(800, 200);
		this.setTitle("자바 스윙 1.0");
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
//		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jb5) {
			ID = jt2.getText();
			Pw = jt3.getText();
			JOptionPane.showMessageDialog(this, "회원가입이 되었습니다!");
		} else if(e.getSource() == jb4) {
			if(ID.equals(jt2.getText()) && Pw.equals(jt3.getText())) {
				JOptionPane.showMessageDialog(this, ID +"님 반갑습니다!");
				login = true;
			}
		}
		
		if(!login) {
			JOptionPane.showMessageDialog(this, "로그인 하세요!");
			return;
		}
		
		if(e.getSource() == jb1) {
//			System.out.println(jt1.getText());
			balance += Integer.parseInt(jt1.getText());
			lab2.setText("잔액 :" + balance + "원");
			jt1.setText("");
		} else if(e.getSource() == jb2) {
//			System.out.println("확인2");
			balance -= Integer.parseInt(jt1.getText());
			lab2.setText("잔액 :" + balance + "원");
			jt1.setText("");
		} else if(e.getSource() == jb3) {
//			JOptionPane.showInputDialog("이름 입력")
//			JOptionPane.showMessageDialog(this, "연습");
			int ret =  JOptionPane.showConfirmDialog(this, "확인");
			System.out.println(ret);
		}
	}
	
}


public class MyWin {

	public static void main(String[] args) {
		new MyFrame();

	}

}
