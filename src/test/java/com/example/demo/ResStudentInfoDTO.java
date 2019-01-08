package com.example.demo;

/**
 * @author liwenbin
 * @Date 2018/6/11
 */
public class ResStudentInfoDTO {
    /** 学员 id */
    private Integer stuId;
    /** 学员姓名 */
    private String name;
    /** 学员昵称 */
    private String nickname;
    /** 学员手机号 */
    private String mobile;
    /** 证件类型 */
    private String certType;
    /** 证件号码 */
    private String certNo;
    /** 生日 */
    private String birthday;
    /** 性别 */
    private String sex;
    /** 学历 */
    private String education;
    /** 专业 */
    private String major;
    /** QQ号 */
    private String qqCode;
    /** 微信号 */
    private String weChat;
    /** 邮箱 */
    private String email;
    /** 是否绑定微信 */
    private String hasWechat;
    /** 是否下载 APP */
    private String hasApp;
    /** 省份编号 */
    private String  provinceId;
    /** 城市编号 */
    private String  cityId;
    /** 省份 */
    private String province;
    /** 城市 */
    private String city;
    /** 子订单编号 */
    private Integer ordDetailId;
    /** 操作人 */
    private String  operatorId;

    /** 收货人姓名 */
    private String consigneeName;
    /** 收货人电话 */
    private String consigneePhone;
    /** 收货地址省份ID */
    private String consigneeProvinceId;
    /** 收货地址省份 */
    private String consigneeProvince;
    /** 收货地址城市ID */
    private String consigneeCityId;
    /** 收货地址城市 */
    private String consigneeCity;
    /** 收货人详细地址 */
    private String detailedAddress;
    /** 是否有编辑权限 */
    private String editRIght;
    /**
     * ：添加老师微信id，该字段显示学员已添加的老师的微信 id 及对应的 263，有多个则显示多个
     */
    private String addTeaWechatIds;

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
    }

    public String getConsigneeProvinceId() {
        return consigneeProvinceId;
    }

    public void setConsigneeProvinceId(String consigneeProvinceId) {
        this.consigneeProvinceId = consigneeProvinceId;
    }

    public String getConsigneeProvince() {
        return consigneeProvince;
    }

    public void setConsigneeProvince(String consigneeProvince) {
        this.consigneeProvince = consigneeProvince;
    }

    public String getConsigneeCityId() {
        return consigneeCityId;
    }

    public void setConsigneeCityId(String consigneeCityId) {
        this.consigneeCityId = consigneeCityId;
    }

    public String getConsigneeCity() {
        return consigneeCity;
    }

    public void setConsigneeCity(String consigneeCity) {
        this.consigneeCity = consigneeCity;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getEditRIght() {
        return editRIght;
    }

    public void setEditRIght(String editRIght) {
        this.editRIght = editRIght;
    }

    public String getGetPhoneRight() {
        return getPhoneRight;
    }

    public void setGetPhoneRight(String getPhoneRight) {
        this.getPhoneRight = getPhoneRight;
    }

    /** 是否有查看电话权限 */
    private String getPhoneRight;

    public ResStudentInfoDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHasWechat() {
        return hasWechat;
    }

    public void setHasWechat(String hasWechat) {
        this.hasWechat = hasWechat;
    }

    public String getHasApp() {
        return hasApp;
    }

    public void setHasApp(String hasApp) {
        this.hasApp = hasApp;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public Integer getOrdDetailId() {
        return ordDetailId;
    }

    public void setOrdDetailId(Integer ordDetailId) {
        this.ordDetailId = ordDetailId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getQqCode() {
        return qqCode;
    }

    public void setQqCode(String qqCode) {
        this.qqCode = qqCode;
    }

    public String getAddTeaWechatIds() {
        return addTeaWechatIds;
    }

    public void setAddTeaWechatIds(String addTeaWechatIds) {
        this.addTeaWechatIds = addTeaWechatIds;
    }

    @Override
    public String toString() {
        return "ResStudentInfoDTO{" +
                "stuId=" + stuId +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", certType='" + certType + '\'' +
                ", certNo='" + certNo + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", education='" + education + '\'' +
                ", major='" + major + '\'' +
                ", qqCode='" + qqCode + '\'' +
                ", weChat='" + weChat + '\'' +
                ", email='" + email + '\'' +
                ", hasWechat='" + hasWechat + '\'' +
                ", hasApp='" + hasApp + '\'' +
                ", provinceId='" + provinceId + '\'' +
                ", cityId='" + cityId + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", ordDetailId=" + ordDetailId +
                ", operatorId='" + operatorId + '\'' +
                ", consigneeName='" + consigneeName + '\'' +
                ", consigneePhone='" + consigneePhone + '\'' +
                ", consigneeProvinceId='" + consigneeProvinceId + '\'' +
                ", consigneeProvince='" + consigneeProvince + '\'' +
                ", consigneeCityId='" + consigneeCityId + '\'' +
                ", consigneeCity='" + consigneeCity + '\'' +
                ", detailedAddress='" + detailedAddress + '\'' +
                ", editRIght='" + editRIght + '\'' +
                ", addTeaWechatIds='" + addTeaWechatIds + '\'' +
                ", getPhoneRight='" + getPhoneRight + '\'' +
                '}';
    }
}
