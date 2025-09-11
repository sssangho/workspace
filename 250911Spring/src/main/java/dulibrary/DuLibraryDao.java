package dulibrary;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DuLibraryDao {
	private JdbcTemplate jdbcTemplate;
	
	public DuLibraryDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void insert (DuLibrary duLibrary) {
		jdbcTemplate.update("insert into dulibrary (id, name, loan, borrowdate, duedate) values (?, ?, ?, ?, ?)",
				duLibrary.getId(), duLibrary.getName(), duLibrary.getLoan(), duLibrary.getBorrowdate(), duLibrary.getDuedate());
	}
	
	public void loanupdate (DuLibrary duLibrary) {
		jdbcTemplate.update("update dulibrary set loan = ? , borrowdate = ?, duedate = DATE_ADD(borrowdate, INTERVAL 14 DAY) where id = ?",
				duLibrary.getLoan(), duLibrary.getBorrowdate(), duLibrary.getId());
	}
	
	public void delete(String id) {
		jdbcTemplate.update("delete from dulibrary where id = ?", id);
	}
	
	public List<DuLibrary> selectAll()	{
		return jdbcTemplate.query("select * from dulibrary",
				(rs, rowNum) -> {
					DuLibrary duLibrary = new DuLibrary(rs.getString("id"), rs.getString("name"), rs.getBoolean("loan"), rs.getDate("borrowdate"), rs.getDate("duedate"));
					return duLibrary;
				});
	}
	
	public DuLibrary selectId(String id) {
		List<DuLibrary> results = jdbcTemplate.query("select * from dulibrary where id =?",
				(rs, rowNum) -> {
					DuLibrary duLibrary = new DuLibrary(rs.getString("id"), rs.getString("name"), rs.getBoolean("loan"), rs.getDate("borrowdate"), rs.getDate("duedate"));
					return duLibrary;
				}, id);
		return results.isEmpty() ? null : results.get(0);
	}

}
