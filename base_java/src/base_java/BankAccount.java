package base_java;

/*
 * 께좌
 */
public class BankAccount{
	private String name = "";
	private String bankName = "";
	private String account = "";
	private int baseSalary = 0;
	public int salary = 0;
	private String desc = "";
	
	//생성자
                	public BankAccount(String name, String bankName, String account, int salary) {
		this.name = name;
		this.bankName = bankName;
		this.account = account;
		this.salary = 300000;		//임의값
	}
	
	//GETTER
	public String getName(){
		return name;
	}
	public String getBankName(){
		return this.bankName;
	}
	public String getAccount(){
		return account;
	}
	public int getBaseSalary(){
		return baseSalary;
	}
	public int getSalary(){
		return salary;
	}
	public String getDesc(){
		return desc;
	}


	//setter
	public void setName(String name){
		this.name = name;
	}
	public String setBankName(String bankName){
		this.bankName = bankName;
		return this.bankName;
	}
	public void setAccount(String account){
		this.account= account;
	}
	public void setDesc(String desc){
		this.desc = desc;
	}
	public void setBaseSalary(int baseSalary){
		this.baseSalary = baseSalary;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
	
	//월급여
	//Override- 자료형이 다르거나 파라미터 개수가 달라야 한다
	public void monthSalary(int month) {
		int total = this.baseSalary + month;	// 총급여
		this.salary = total;
	}

	public void monthSalary(int month, String level) {
		//만약, level이 인사팀 이상인 경우
		//아래를 수정할 수 있음
		//인사팀 이하(개인인경우) 콘솔에 error 메세지를 띄우시오
		int total = this.baseSalary + month;	// 총급여
		this.salary = total;
	}
	
	//이달의 급여 정보
	public void salaryInfo(){
		System.out.println(this.salary);
	}
	
	//로그인 시 이름과 pio의 이름이 같거나 인사팀 이상일 경우 급여 출력
	public void salaryInfo(String name, int level, PersonInfo pio){
		if(name.equals(pio.name) || level > 3){
			System.out.println("---- LOGIN ----");
			System.out.println("월급: " + this.salary);
		}else {
			System.out.println(pio.name);
			System.out.println("ERROR");
		}
	}
	
	//계좌 설계 정보
	public void accountInfo() {
		//System.out.println("name" + name + ", account:" + account );
	}
	
}
