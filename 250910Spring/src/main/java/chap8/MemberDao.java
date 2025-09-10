package chap8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

@Component
public class MemberDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public MemberDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public int count(String email) {
		return jdbcTemplate.queryForObject("select count(*) from member where email =?", Integer.class, email);
	}
	
	public List<Member> selectAll() {
		return jdbcTemplate.query("select * from member",
				(rs, rowNum) -> { // 람다식
					Member mem = new Member(rs.getLong("id"), rs.getString("email"),
							rs.getString("password"), rs.getString("name"),
							rs.getTimestamp("regdate").toLocalDateTime());	
					return mem;
				});
	}
	
	public Member selectByEmail(String email) {
		List<Member> results = jdbcTemplate.query("select * from member where email = ?",
				(rs, rowNum) -> { // 람다식
					Member mem = new Member(rs.getLong("id"), rs.getString("email"),
							rs.getString("password"), rs.getString("name"),
							rs.getTimestamp("regdate").toLocalDateTime());	
					return mem;
				}
//				new RowMapper<Member>() {
//
//					@Override
//					public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
//						Member mem = new Member(rs.getLong("id"), rs.getString("email"),
//								rs.getString("password"), rs.getString("name"),
//								rs.getTimestamp("regdate").toLocalDateTime());	
//						return mem;
//					}
//		}
		, email);
		return results.isEmpty() ? null : results.get(0);
	}
	
	public Member selectByEmail2(String email) {
		return jdbcTemplate.queryForObject("select * from member where email =? ",
				new BeanPropertyRowMapper<>(Member.class),
				email);
	}

	public void insert(Member member) {
		jdbcTemplate.update(
				"insert into member (email, name, password, regdate) values (?, ?, ?, now())",
				member.getEmail(), member.getName(), member.getPassword()
			);
	}
	
	public void insert2(Member member) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update((con) -> { // 람다식
			PreparedStatement pstmt = con.prepareStatement(
					"insert into member (email, name, password, regdate) values (?, ?, ?, ?)", new String[] {"id"});
			pstmt.setString(1, member.getEmail());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getPassword());
			pstmt.setTimestamp(4, Timestamp.valueOf(member.getRegDate()));
			return pstmt;	
		} , keyHolder);
		
//		jdbcTemplate.update(new PreparedStatementCreator() {
//			
//			@Override
//			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
//				PreparedStatement pstmt = con.prepareStatement(
//						"insert into member (email, name, password, regdate) values (?, ?, ?, ?)", new String[] {"id"});
//				pstmt.setString(1, member.getEmail());
//				pstmt.setString(2, member.getName());
//				pstmt.setString(3, member.getPassword());
//				pstmt.setTimestamp(4, Timestamp.valueOf(member.getRegDate()));
//				return pstmt;
//			}
//
//		}, keyHolder);
		Number keyValue = keyHolder.getKey();
		member.setId(keyValue.longValue());
	}
}
