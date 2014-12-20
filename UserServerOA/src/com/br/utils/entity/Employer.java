package com.br.utils.entity;

import java.io.Serializable;

/**
 * 雇主实体对象类
 * @author asus
 *
 */
public class Employer implements Serializable{
	private int employerId;//雇主编号
	private int comId;//公司编号
	private String fName;//姓名
	private String wSex;//性别0女1男
	private int age;//年龄
	private String enation;//民族
	private String empNative;//籍贯
	private String schoolAge;//学历
	private String cardNum;//身份证号
	private String workerUnit;//工作单位
	private String profession;//职业
	private String bargainNum;//合同号
	private String bargainDate;//合同期限
	private String phone;//电话号
	private String mobilePhone;//手机号
	private String empAddress;//住宅
	private String empRegistered;//户口所在地
	private String serveAddress;//服务处地址
	private String familyAddress;//家庭资料之居住地址
	private String familyNum;//家庭资料之家庭人数
	private String empRequestBaseid;//雇佣要求
	private String familyContent;//家庭资料之服务内容
	private String familyArea;//家庭资料之房屋面积
	private String familyEat;//家庭资料之饮食习惯
	private String familyDesc;//家庭资料之其他
	private int handlers;//经办人
	private String handlersDate;//登记时间
	private double maxSalary;//接受的最高工资
	private double minSalary;//接受的最低工资
	private String birthday;//出生日期
	
	public int getEmployerId() {
		return employerId;
	}
	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}
	public int getComId() {
		return comId;
	}
	public void setComId(int comId) {
		this.comId = comId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getwSex() {
		return wSex;
	}
	public void setwSex(String wSex) {
		this.wSex = wSex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEnation() {
		return enation;
	}
	public void setEnation(String enation) {
		this.enation = enation;
	}
	public String getEmpNative() {
		return empNative;
	}
	public void setEmpNative(String empNative) {
		this.empNative = empNative;
	}
	public String getSchoolAge() {
		return schoolAge;
	}
	public void setSchoolAge(String schoolAge) {
		this.schoolAge = schoolAge;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getWorkerUnit() {
		return workerUnit;
	}
	public void setWorkerUnit(String workerUnit) {
		this.workerUnit = workerUnit;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getBargainNum() {
		return bargainNum;
	}
	public void setBargainNum(String bargainNum) {
		this.bargainNum = bargainNum;
	}
	public String getBargainDate() {
		return bargainDate;
	}
	public void setBargainDate(String bargainDate) {
		this.bargainDate = bargainDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpRegistered() {
		return empRegistered;
	}
	public void setEmpRegistered(String empRegistered) {
		this.empRegistered = empRegistered;
	}
	public String getServeAddress() {
		return serveAddress;
	}
	public void setServeAddress(String serveAddress) {
		this.serveAddress = serveAddress;
	}
	public String getFamilyAddress() {
		return familyAddress;
	}
	public void setFamilyAddress(String familyAddress) {
		this.familyAddress = familyAddress;
	}
	public String getFamilyNum() {
		return familyNum;
	}
	public void setFamilyNum(String familyNum) {
		this.familyNum = familyNum;
	}
	public String getEmpRequestBaseid() {
		return empRequestBaseid;
	}
	public void setEmpRequestBaseid(String empRequestBaseid) {
		this.empRequestBaseid = empRequestBaseid;
	}
	public String getFamilyContent() {
		return familyContent;
	}
	public void setFamilyContent(String familyContent) {
		this.familyContent = familyContent;
	}
	public String getFamilyArea() {
		return familyArea;
	}
	public void setFamilyArea(String familyArea) {
		this.familyArea = familyArea;
	}
	public String getFamilyEat() {
		return familyEat;
	}
	public void setFamilyEat(String familyEat) {
		this.familyEat = familyEat;
	}
	public String getFamilyDesc() {
		return familyDesc;
	}
	public void setFamilyDesc(String familyDesc) {
		this.familyDesc = familyDesc;
	}
	public int getHandlers() {
		return handlers;
	}
	public void setHandlers(int handlers) {
		this.handlers = handlers;
	}
	public String getHandlersDate() {
		return handlersDate;
	}
	public void setHandlersDate(String handlersDate) {
		this.handlersDate = handlersDate;
	}
	public double getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}
	public double getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public Employer(int employerId, int comId, String fName, String wSex,
			int age, String enation, String empNative, String schoolAge,
			String cardNum, String workerUnit, String profession,
			String bargainNum, String bargainDate, String phone,
			String mobilePhone, String empAddress, String empRegistered,
			String serveAddress, String familyAddress, String familyNum,
			String empRequestBaseid, String familyContent, String familyArea,
			String familyEat, String familyDesc, int handlers,
			String handlersDate, double maxSalary, double minSalary,
			String birthday) {
		this.employerId = employerId;
		this.comId = comId;
		this.fName = fName;
		this.wSex = wSex;
		this.age = age;
		this.enation = enation;
		this.empNative = empNative;
		this.schoolAge = schoolAge;
		this.cardNum = cardNum;
		this.workerUnit = workerUnit;
		this.profession = profession;
		this.bargainNum = bargainNum;
		this.bargainDate = bargainDate;
		this.phone = phone;
		this.mobilePhone = mobilePhone;
		this.empAddress = empAddress;
		this.empRegistered = empRegistered;
		this.serveAddress = serveAddress;
		this.familyAddress = familyAddress;
		this.familyNum = familyNum;
		this.empRequestBaseid = empRequestBaseid;
		this.familyContent = familyContent;
		this.familyArea = familyArea;
		this.familyEat = familyEat;
		this.familyDesc = familyDesc;
		this.handlers = handlers;
		this.handlersDate = handlersDate;
		this.maxSalary = maxSalary;
		this.minSalary = minSalary;
		this.birthday = birthday;
	}
	
	public Employer() {
	}
	
	
	
}
