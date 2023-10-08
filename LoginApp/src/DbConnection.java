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
	            // Veritabaný baðlantýsý kuruluyor.
	            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=utf8", "root", "123456");

	            // Güvenli SQL sorgusu oluþturuluyor.
	            String query = "SELECT * FROM 'users' WHERE 'user_name'= "  +"'"+ username +"' AND 'user_password'='"+password+"'";

	            // SQL ifadesi hazýrlanýyor.
	            PreparedStatement preparedStatement = connection.prepareStatement(query);
	            preparedStatement.setString(1, username);
	            preparedStatement.setString(2, password);

	            // SQL sorgusu yürütülüyor.
	            ResultSet resultSet = preparedStatement.executeQuery();

	            if (resultSet.next()) {
	                // Baþarýlý giriþ iþlemi.
	                return "welcome.xhtml";
	            } else {
	                // Baþarýsýz giriþ iþlemi.
	                return "error.xhtml";
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return "error.xhtml";
	        }
	    }

	    // Getter ve Setter metotlarý
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
