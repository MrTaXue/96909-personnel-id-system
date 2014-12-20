package com.br.utils.entity;

import java.io.Serializable;

/**
 * 员工实体对象类
 * @author asus
 *
 */
public class Worker implements Serializable{
	private int workerId;//员工id
	private int comId;//公司编号
	private String fName;//姓名
	private String wSex;//员工性别
	private String cardNum;//身份证号
	private String birthday;//出生年月
	private int age;//年龄
	private int stature;//身高
	private String mobilePhone;//手机
	private String phone;//电话
	private String workType;//工种
	private String practitionerDate;//从业时间
	private String workBug;//缺陷
	private String photo;//相片
	private String registerAddress;//户籍地址
	private String address;//现住址
	private String bankcard;//银行卡号
	private String insuranceNum;//保险单号
	private String languageBaseid;//语言
	private String state;//状态
	private String wedLock;//婚姻状况
	private String typeBaseid;//证照状况
	private String bodyBaseid;//体检状况
	private String bodyDate;//体检时间
	private String craftsmanShipBaseid;//个人技能
	private String udesc;//自我介绍
	private String timeRequest;//时间要求
	private String wageRequest;//工资要求
	private String housing;//住宿
	private String eat;//餐饮
	private String enRegisterTime;//录入时间
	
	
	public int getWorkerId() {
		return workerId;
	}
	public void setWorkerId(int workerId) {
		this.workerId = workerId;
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
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStature() {
		return stature;
	}
	public void setStature(int stature) {
		this.stature = stature;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWorkType() {
		return workType;
	}
	public void setWorkType(String workType) {
		this.workType = workType;
	}
	public String getPractitionerDate() {
		return practitionerDate;
	}
	public void setPractitionerDate(String practitionerDate) {
		this.practitionerDate = practitionerDate;
	}
	public String getWorkBug() {
		return workBug;
	}
	public void setWorkBug(String workBug) {
		this.workBug = workBug;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getRegisterAddress() {
		return registerAddress;
	}
	public void setRegisterAddress(String registerAddress) {
		this.registerAddress = registerAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBankcard() {
		return bankcard;
	}
	public void setBankcard(String bankcard) {
		this.bankcard = bankcard;
	}
	public String getInsuranceNum() {
		return insuranceNum;
	}
	public void setInsuranceNum(String insuranceNum) {
		this.insuranceNum = insuranceNum;
	}
	public String getLanguageBaseid() {
		return languageBaseid;
	}
	public void setLanguageBaseid(String languageBaseid) {
		this.languageBaseid = languageBaseid;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getWedLock() {
		return wedLock;
	}
	public void setWedLock(String wedLock) {
		this.wedLock = wedLock;
	}
	public String getTypeBaseid() {
		return typeBaseid;
	}
	public void setTypeBaseid(String typeBaseid) {
		this.typeBaseid = typeBaseid;
	}
	public String getBodyBaseid() {
		return bodyBaseid;
	}
	public void setBodyBaseid(String bodyBaseid) {
		this.bodyBaseid = bodyBaseid;
	}
	public String getBodyDate() {
		return bodyDate;
	}
	public void setBodyDate(String bodyDate) {
		this.bodyDate = bodyDate;
	}
	public String getCraftsmanShipBaseid() {
		return craftsmanShipBaseid;
	}
	public void setCraftsmanShipBaseid(String craftsmanShipBaseid) {
		this.craftsmanShipBaseid = craftsmanShipBaseid;
	}
	public String getUdesc() {
		return udesc;
	}
	public void setUdesc(String udesc) {
		this.udesc = udesc;
	}
	public String getTimeRequest() {
		return timeRequest;
	}
	public void setTimeRequest(String timeRequest) {
		this.timeRequest = timeRequest;
	}
	public String getWageRequest() {
		return wageRequest;
	}
	public void setWageRequest(String wageRequest) {
		this.wageRequest = wageRequest;
	}
	public String getHousing() {
		return housing;
	}
	public void setHousing(String housing) {
		this.housing = housing;
	}
	public String getEat() {
		return eat;
	}
	public void setEat(String eat) {
		this.eat = eat;
	}
	public String getEnRegisterTime() {
		return enRegisterTime;
	}
	public void setEnRegisterTime(String enRegisterTime) {
		this.enRegisterTime = enRegisterTime;
	}
	
	public Worker(int workerId, int comId, String fName, String wSex,
			String cardNum, String birthday, int age, int stature,
			String mobilePhone, String phone, String workType,
			String practitionerDate, String workBug, String photo,
			String registerAddress, String address, String bankcard,
			String insuranceNum, String languageBaseid, String state,
			String wedLock, String typeBaseid, String bodyBaseid,
			String bodyDate, String craftsmanShipBaseid, String udesc,
			String timeRequest, String wageRequest, String housing, String eat,
			String enRegisterTime) {
		this.workerId = workerId;
		this.comId = comId;
		this.fName = fName;
		this.wSex = wSex;
		this.cardNum = cardNum;
		this.birthday = birthday;
		this.age = age;
		this.stature = stature;
		this.mobilePhone = mobilePhone;
		this.phone = phone;
		this.workType = workType;
		this.practitionerDate = practitionerDate;
		this.workBug = workBug;
		this.photo = photo;
		this.registerAddress = registerAddress;
		this.address = address;
		this.bankcard = bankcard;
		this.insuranceNum = insuranceNum;
		this.languageBaseid = languageBaseid;
		this.state = state;
		this.wedLock = wedLock;
		this.typeBaseid = typeBaseid;
		this.bodyBaseid = bodyBaseid;
		this.bodyDate = bodyDate;
		this.craftsmanShipBaseid = craftsmanShipBaseid;
		this.udesc = udesc;
		this.timeRequest = timeRequest;
		this.wageRequest = wageRequest;
		this.housing = housing;
		this.eat = eat;
		this.enRegisterTime = enRegisterTime;
	}
	
	public Worker() {
	}
	
	
}
