package edu.kh.emp.model.vo;

public class Employee {
	private int empId; // 사원 번호 
	private String empName; // 이름
	private String empNO; // 주민 등록번호
	private String email;
	private String phone;
	private String departmentTitle; //부서명
	private String jobName; //직급명
	private int salary;;
	
	
	private String deptCode; // 부서코드 
	private String jobCOde; // 직급코드 
	private String salLevel; // 급여등급
	private double bounus; // 보너스
	private int managerId; // 사수 번호
	
	
	public Employee() {
		
	}




	public Employee(int empId, String empName, String empNO, String email, String phone, String departmentTitle,
			String jobName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empNO = empNO;
		this.email = email;
		this.phone = phone;
		this.departmentTitle = departmentTitle;
		this.jobName = jobName;
		this.salary = salary;
	}




	public int getEmId() {
		return empId;
	}


	public void setEmId(int emId) {
		this.empId = emId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpNO() {
		return empNO;
	}


	public void setEmpNO(String empNO) {
		this.empNO = empNO;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getDepartmentTitle() {
		return departmentTitle;
	}


	public void setDepartmentTitle(String departmentTitle) {
		this.departmentTitle = departmentTitle;
	}


	public String getJobName() {
		return jobName;
	}


	public void setJobName(String jobName) {
		this.jobName = jobName;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getDeptCode() {
		return deptCode;
	}


	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}


	public String getJobCOde() {
		return jobCOde;
	}


	public void setJobCOde(String jobCOde) {
		this.jobCOde = jobCOde;
	}


	public String getSalLevel() {
		return salLevel;
	}


	public void setSalLevel(String salLevel) {
		this.salLevel = salLevel;
	}


	public double getBounus() {
		return bounus;
	}


	public void setBounus(double bounus) {
		this.bounus = bounus;
	}


	public int getManagerId() {
		return managerId;
	}


	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empNO=" + empNO + ", email=" + email + ", phone="
				+ phone + ", departmentTitle=" + departmentTitle + ", jobName=" + jobName + ", salary=" + salary
				+ ", deptCode=" + deptCode + ", jobCOde=" + jobCOde + ", salLevel=" + salLevel + ", bounus=" + bounus
				+ ", managerId=" + managerId + "]";
	}

}
