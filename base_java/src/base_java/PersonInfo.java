package base_java;

public class PersonInfo {
	public String name ="";
	public String bankName ="";
	public int age = 0;
	public String gender = "";
	public String address = "";
	public String desc = "";
	private String p_num = "";
	
	public PersonInfo(String name, int age, String bankName, String gender, String address, String desc) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.address=address;
		this.desc=desc;
		//System.out.println(name + "/" + age + "/" + gender + "/" + address + "/" + desc);
	}
	
	public PersonInfo(String name,  int age) {
		this.name=name;
		this.age=age;
		//System.out.println(name + "/" + age);
	}
	
	public PersonInfo(String name,  int age, String p_num) {
		this.name=name;
		this.age=age;
		this.p_num=p_num;
		//System.out.println(name + "/" + age);
	}
	
	public PersonInfo(String bankName, String gender, String address, String desc) {
		this.gender=gender;
		this.address=address;
		this.desc=desc;
		//System.out.println(gender + "/" + address + "/" + desc);
	}

	//getter -> private전달
	public String getP_num(){
		return this.p_num;
	}
	//getter -> private전달
	public String getName(){
		return this.name;
	}
	//getter -> private전달
	public String getBankName(){
		return this.bankName;
	}
	//getter -> private전달
	public int getAge(){
		return this.age;
	}
	//getter -> private전달
	public String getGender(){
		return this.gender;
	}
	//getter -> private전달
	public String getAddress(){
		return this.address;
	}
	//getter -> private전달
	public String getDesc(){
		return this.desc;
	}
	
	
	//setter
	public void setP_num(String p_num) {
		this.p_num = p_num;
	}
	public void setName(String name){
		this.name = name;
	}
	public String setBankName(String bankName) {
		this.bankName = bankName;
		return this.bankName;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setDesc(String desc){
		this.desc = desc;
	}
	
	
	public void personInfo() {
		System.out.println("--개인정보--------------");
		System.out.println("| name: " + getName());
		System.out.println("| age: " + getAge() );
		System.out.println("--------------------");
	}
	
	
}
