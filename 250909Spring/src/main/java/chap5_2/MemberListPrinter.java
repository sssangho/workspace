package chap5_2;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MemberListPrinter {
	
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	@Qualifier("memberSummaryPrinter")
	private MemberPrinter printer;

	public MemberListPrinter() {
	}
	
	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}

	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m -> printer.print(m));
	}


	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	

	public void setMemberPrinter(MemberSummaryPrinter printer) {
		this.printer = printer;
	}
}
