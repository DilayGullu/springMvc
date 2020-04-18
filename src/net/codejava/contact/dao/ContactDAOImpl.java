package net.codejava.contact.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import net.codejava.contact.model.Contact;

public class ContactDAOImpl implements contactDAO {

	private JdbcTemplate jdbcTemplate;
	
	public ContactDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);		
	}
	
	@Override
	public int save(Contact c) {
		Date td = new Date();
		String b = new String("");
		SimpleDateFormat format = new SimpleDateFormat("YYYY/MM/dd");
		b = format.format(td);
		//out.println(b);       
		
		
		String sql = "INSERT INTO form (name, surname, tc, address, phone, email, date, iscommers, ischoice, county, amount, notes) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		return jdbcTemplate.update(sql, c.getName(), c.getSurname(), c.getTc(),c.getAddress(), c.getPhone(), c.getEmail(), c.getDate(), c.getIscommers(), c.getIschoice(), c.getCounty(), c.getAmount(), c.getNotes());
		
	}

	@Override
	public int update(Contact c) {
		String sql = "UPDATE form SET  name=?, surname=?, tc=?, address=?, phone=?, email=?, date=?, iscommers=?, ischoice=?, county=?, amount=?, notes=? WHERE id=?";
		return jdbcTemplate.update(sql, c.getName(), c.getSurname(),c.getTc(),c.getAddress(), c.getPhone(), c.getEmail(), c.getDate(), c.getIscommers(), c.getIschoice(), c.getCounty(), c.getAmount(), c.getNotes(), c.getId());

	}

	@Override
	public Contact get(Integer id) {
		String sql = "SELECT * FROM form WHERE id=" +id;
		ResultSetExtractor<Contact> extractor = new ResultSetExtractor<Contact>() {
			
			@Override
			public Contact extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					String name = rs.getString("name");
					String surname = rs.getString("surname");
					String tc = rs.getString("tc");
					String address = rs.getString("address");
					String phone = rs.getString("phone");
					String email = rs.getString("email");
					Date date = rs.getDate("date");
					String iscommers = rs.getString("iscommers");
					String ischoice = rs.getString("ischoice");
					String county= rs.getString("county");
					Float amount =rs.getFloat("amount");
					String notes = rs.getString("notes");
					
					
					return new Contact(id, name, surname, tc, address, phone, email, date, iscommers, ischoice, county, amount, notes);

					
				}
				return null;
			}
		};
		return jdbcTemplate.query(sql, extractor);
	}

	@Override
	public int delete(Integer id) {
		String sql = "DELETE FROM  form WHERE id="  + id;
		return jdbcTemplate.update(sql);
	}

	@Override
	public List<Contact> list() {
		String sql = "SELECT * FROM  form";
		
		RowMapper<Contact> rowMapper = new RowMapper<Contact>() {

			@Override
			public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
				Integer id= rs.getInt("id");
				String name = rs.getString("name");
				String surname = rs.getString("surname");
				String tc = rs.getString("tc");
				String address = rs.getString("address");
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				Date date = rs.getDate("date");
				String iscommers = rs.getString("iscommers");
				String ischoice = rs.getString("ischoice");
				String county= rs.getString("county");
				Float amount =rs.getFloat("amount");
				String notes = rs.getString("notes");
				
				
				return new Contact(id, name, surname,tc, address, phone, email, date, iscommers, ischoice, county, amount, notes);

			}
			
		};
		return jdbcTemplate.query(sql,rowMapper);
	}

}
