import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

@ManagedBean(name = "secureLoginBean")
@RequestScoped

public class SecureLoginBean {
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
			String query = "SELECT * FROM users WHERE user_name=? AND user_password=?";
			PreparedStatement preparedStatement = (PreparedStatement) myConnection.prepareStatement(query);
	        preparedStatement.setString(1, username);
	        preparedStatement.setString(2, password);
            ResultSet myResultSet = preparedStatement.executeQuery();
			if(myResultSet.next()) {
				System.out.println("Giriþ Baþarýlý"  + " " + "Hosgeldiniz"+" " + username);
			}else {
				System.out.println("Giriþ Baþarýsýz");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("basarisiz");
		}
	}
}
