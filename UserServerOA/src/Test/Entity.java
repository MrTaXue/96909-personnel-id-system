package Test;

public class Entity {
	public String uid;
	public String upwd;
	public int age;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Entity(String uid, String upwd, int age) {
		this.uid = uid;
		this.upwd = upwd;
		this.age = age;
	}
	
	public Entity(){
		
	}
}
