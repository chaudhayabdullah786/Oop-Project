abstract class Person {

	/***********************fields***************************************************/
	private String name;
	private int age;
	private String type;
	private String gender;
	private String address;
	private int contactNumber;
	
	/***********************default-constructor***************************************************/

	public Person() {
		this.name = null;
		this.age = 0;
		this.type = null;
		this.gender = null;
		this.address = null;
		this.contactNumber = 0;
	}/*default-constructor*/
		
	/***********************6-args-constructor***************************************************/
	public Person(String name, int age, String type, String gender, String address, int contactNumber) {
		this.name = name;
		this.age = age;
		this.type = type;
		this.gender = gender;
		this.address = address;
		this.contactNumber = contactNumber;
	}/*6-args-constructor*/

	/***********************setters***************************************************/
	public void setName(String name) {
		this.name = name;
	}/*setName*/

	public void setAge(int age) {
		this.age = age;
	}/*setAge*/

	public void setType(String type) {
		this.type = type;
	}/*setType*/

	public void setGender(String gender) {
		this.gender = gender;
	}/*setGender*/

	public void setAddress(String address) {
		this.address = address;
	}/*setAddress*/

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}/*setContactNumber*/

	/***********************getters***************************************************/

	public String getName() {
		return name;
	}/*getName*/

	public int getAge() {
		return age;
	}/*getAge*/

	public String getType() {
		return type;
	}/*getType*/

	public String getGender() {
		return gender;
	}/*getGender*/

	public String getAddress() {
		return address;
	}/*getAddress*/

	public int getContactNumber() {
		return contactNumber;
	}/*getContactNumber*/

	/***********************Methods***************************************************/

	
	public String getDetails() {
		return "Person :" +
				"\nName :" + name + 
				"\nAge :" + age +
				"\nType :" + type + 
				"\nGender :" + gender +
				"\nContactNumber :" + contactNumber;
	}
}/*class*/