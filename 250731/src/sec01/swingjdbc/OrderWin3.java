package sec01.swingjdbc	;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class OrderWin3 extends JFrame {
	String id = "root";
	String pw = "1234";
	String url = "jdbc:mysql://localhost:3305/swingcrud";
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = "select * from dustudent";
	
	JLabel lb1 = new JLabel("학번");
	JLabel lb2 = new JLabel("이름");
	JLabel lb3 = new JLabel("학과");
	JLabel lb4 = new JLabel("전화번호");
	JLabel lb5 = new JLabel("상태");
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	JTextField tf3 = new JTextField();
	JTextField tf4 = new JTextField();
	JTextField tf5 = new JTextField();
	JButton btn1 = new JButton("저장");
	JButton btn2 = new JButton("읽기");
	JButton btn3 = new JButton("갱신");
	JButton btn4 = new JButton("삭제");
	JTextArea ta = new JTextArea();

	public OrderWin3() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩!");
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("접속 성공!");
			stmt = con.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Container con = this.getContentPane();
		con.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		con.add(lb1);
		lb1.setBounds(30, 10, 80, 40);
		con.add(lb2);
		lb2.setBounds(120, 10, 80, 40);
		con.add(lb3);
		lb3.setBounds(210, 10, 80, 40);
		con.add(lb4);
		lb4.setBounds(300, 10, 110, 40);
		con.add(lb5);
		lb5.setBounds(420, 10, 80, 40);
		
		con.add(tf1);
		tf1.setBounds(30, 50, 80, 40);
		con.add(tf2);
		tf2.setBounds(120, 50, 80, 40);
		con.add(tf3);
		tf3.setBounds(210, 50, 80, 40);
		con.add(tf4);
		tf4.setBounds(300, 50, 110, 40);
		con.add(tf5);
		tf5.setBounds(420, 50, 80, 40);
		
		con.add(btn1);
		btn1.setBounds(30, 100, 80, 40);
		con.add(btn2);
		btn2.setBounds(120, 100, 80, 40);
		con.add(btn3);
		btn3.setBounds(210, 100, 80, 40);
		con.add(btn4);
		btn4.setBounds(300, 100, 80, 40);
		
		ta.setEditable(false); // 편집을 못 하게 만듬
		JScrollPane sp = new JScrollPane(ta);
		sp.setBounds(30, 150, 500, 100);
		con.add(sp);
		
		this.setSize(600, 300);
		this.setLocation(800, 400);
		this.setTitle("동서울대학교 학생관리");
		showOrders();
		this.setVisible(true);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String student_id = tf1.getText();
				String name = tf2.getText();
				String major = tf3.getText();
				String phone = tf4.getText();
				String state = tf5.getText();
				
				sql = String.format("insert into dustudent(student_id, name, major, phone, state) values('%s', '%s' ,'%s', '%s', '%s')",student_id, name, major, phone, state);
				try {
					stmt.executeUpdate(sql);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				showOrders();
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				showOrders();
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String student_id = tf1.getText();
				String name = tf2.getText();
				String major = tf3.getText();
				String phone = tf4.getText();
				String state = tf5.getText();
				
				sql = String.format("Update dustudent set name = '%s', major = '%s', phone = '%s', state = '%s' where student_id = '%s';", name, major, phone, state, student_id);
				try {
					stmt.executeUpdate(sql);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				showOrders();
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String student_id = tf1.getText();
			
				sql = String.format("delete from dustudent where student_Id = '%s';", student_id);
				try {
					stmt.executeUpdate(sql);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				showOrders();
			}
		});
	}

	public void showOrders() {
		sql = "select * from dustudent";
		try {
			rs = stmt.executeQuery(sql);
			String str = "";
			while (rs.next()) {
				String student_id = rs.getString("student_id");
				String name = rs.getString("name");
				String major = rs.getString("major");
				String phone = rs.getString("phone");
				String state = rs.getString("state");
				str += String.format("%s\t%s\t%s\t%s\t\t%s\n",student_id, name, major, phone, state);
			}
			ta.setText(str);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new OrderWin3();
	}
}









