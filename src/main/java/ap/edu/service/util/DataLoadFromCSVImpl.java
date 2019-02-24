package ap.edu.service.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ap.edu.entity.util.CSVLoader;

@Service
public class DataLoadFromCSVImpl implements LoadDataCsv {
	@Autowired
	DataSource datasource;

	@Override
	public String uploadToDb(String filepath, String table) {
		
		
		try {
			Connection connection = datasource.getConnection();
			CSVLoader loader = new CSVLoader(connection);
			loader.loadCSV(filepath, table, true);

			System.out.println("+++++ Intial data loaded Successfully +++++");

		} catch (SQLException e) {
			System.out.println("###### DataSource connect could not establish ########");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "SUCCESS";
	}

}
