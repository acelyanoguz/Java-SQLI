/*import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

@ManagedBean
@RequestScoped
public class DbConnection {
	  private String username;
	    private String password;

	    public String login() {
	        try {
	            // Veritaban� ba�lant�s� kuruluyor.
	            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=utf8", "root", "123456");

	            // G�venli SQL sorgusu olu�turuluyor.
	            String query = "SELECT * FROM 'users' WHERE 'user_name'= "  +"'"+ username +"' AND 'user_password'='"+password+"'";

	            // SQL ifadesi haz�rlan�yor.
	            PreparedStatement preparedStatement = connection.prepareStatement(query);
	            preparedStatement.setString(1, username);
	            preparedStatement.setString(2, password);

	            // SQL sorgusu y�r�t�l�yor.
	            ResultSet resultSet = preparedStatement.executeQuery();

	            if (resultSet.next()) {
	                // Ba�ar�l� giri� i�lemi.
	                return "welcome.xhtml";
	            } else {
	                // Ba�ar�s�z giri� i�lemi.
	                return "error.xhtml";
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return "error.xhtml";
	        }
	    }

	    // Getter ve Setter metotlar�
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
	
	

} */
