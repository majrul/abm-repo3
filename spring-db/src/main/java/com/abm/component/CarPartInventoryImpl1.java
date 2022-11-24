package com.abm.component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("carPartInv1")
public class CarPartInventoryImpl1 implements CarPartInventory {

	public void addNewPart(CarPart carPart) {
		Connection conn = null;
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			long ms1 = System.currentTimeMillis();
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/training", "derby", "derby");
			long ms2 = System.currentTimeMillis();
			System.out.println("approx time to connect " + (ms2 - ms1) + " ms");
			String sql = "insert into tbl_carpart(part_name, car_model, price, quantity)"
					+ " values(?, ?, ?, ?)";
			ms1 = System.currentTimeMillis();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, carPart.getPartName());
			stmt.setString(2, carPart.getCarModel());
			stmt.setDouble(3, carPart.getPrice());
			stmt.setInt(4, carPart.getQuantity());
			stmt.executeUpdate();
			ms2 = System.currentTimeMillis();
			System.out.println("approx time to execute query " + (ms2 - ms1) + " ms");			
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace(); //bad, rather we should throw exception
		}
		finally {
			try { conn.close(); } catch(Exception e) { }
		}
	}

	public List<CarPart> getAvailableParts() {
		Connection conn = null;
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/training", "derby", "derby");
			String sql = "select * from tbl_carpart";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			List<CarPart> list = new ArrayList<>();
			while(rs.next()) {
				CarPart cp = new CarPart();
				cp.setPartNo(rs.getInt("part_no"));
				cp.setPartName(rs.getString("part_name"));
				cp.setCarModel(rs.getString("car_model"));
				cp.setPrice(rs.getDouble("price"));
				cp.setQuantity(rs.getInt("quantity"));
				list.add(cp);
			}
			return list;
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace(); //bad, rather we should throw exception
			return null; //very very bad
		}
		finally {
			try { conn.close(); } catch(Exception e) { }
		}
		
	}

}

















