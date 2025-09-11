package dulibrary;

import java.sql.Date;

public class DuLibrary {
	
	private String id;
	private String name;
	private Boolean loan;
	private Date borrowdate;
	private Date duedate;
	
	public DuLibrary () {}

	public DuLibrary(String id, String name, Boolean loan, Date borrowdate, Date duedate) {
		super();
		this.id = id;
		this.name = name;
		this.loan = loan;
		this.borrowdate = borrowdate;
		this.duedate = duedate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getLoan() {
		return loan;
	}

	public void setLoan(Boolean loan) {
		this.loan = loan;
	}

	public Date getBorrowdate() {
		return borrowdate;
	}

	public void setBorrowdate(Date borrowdate) {
		this.borrowdate = borrowdate;
	}

	public Date getDuedate() {
		return duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	@Override
	public String toString() {
		return "DuLibrary [id=" + id + ", name=" + name + ", loan=" + loan + ", borrowdate=" + borrowdate + ", duedate="
				+ duedate + "]";
	}
}
