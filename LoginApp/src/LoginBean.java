import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@ManagedBean(name = "loginBean")
@RequestScoped
public class LoginBean {
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
public void login() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection myConnection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=utf8", "root", "123456");
			Statement myStatement =(Statement) myConnection.createStatement();
			
			//G�vensiz sql sorgusu
			ResultSet myResultSet = myStatement.executeQuery("SELECT * FROM users WHERE user_name='" + username + "' AND user_password='" + password + "'");
			if(myResultSet.next()) {
				System.out.println("Giri� Ba�ar�l�"  + " " + "Hosgeldiniz"+" " + myResultSet.getString("user_name"));
			}else {
				System.out.println("Giri� Ba�ar�s�z");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("basarisiz");
		}
	}
}
