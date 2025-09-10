package dbDept;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

@Component
public class DeptDao {

	private JdbcTemplate jdbcTemplate;
	
	public DeptDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<Dept> selectAll() {
		return jdbcTemplate.query("select * from dept",
				(rs, rowNum) -> {
					Dept dept = new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
					return dept;
				});
	}
	
	public Dept selectDeptno(int deptno) {
		List<Dept> results = jdbcTemplate.query("select * from dept where deptno =?",
				(rs, rowNum) -> {
					Dept dept = new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
					return dept;
				}, deptno);
		return results.isEmpty() ? null : results.get(0);
	}
	
	public void insert(Dept dept) {
		jdbcTemplate.update("insert into dept (deptno, dname, loc) values (?, ?, ?)",
				dept.getDeptno(), dept.getDname(), dept.getLoc());
	}
	
	public void update(Dept dept) {
		jdbcTemplate.update("update dept set dname = ?, loc = ? where deptno = ?",
				dept.getDname(), dept.getLoc(), dept.getDeptno()); 
	}
	
	public void delete(int deptno) {
		jdbcTemplate.update("delete from dept where deptno = ?", deptno);
	}

}
