package com.example.demo.dao.entity;

import com.example.demo.dao.entity.base.BaseEntity;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * TODO 在此加入类描述
 * @author morse<Auto       generate>
 * @version 2018-06-12 14:51:20
 * @copyright morse
 * @com.morse.userCenter.customer.entity.Customer
 */
public class Customer extends BaseEntity {

    private static final long serialVersionUID = 1L;
	/*
	public static final String TABLE_ALIAS = "Customer";
	public static final String ALIAS_CUSTOMER_ID = "客户ID";
	public static final String ALIAS_CUSTOMER_NAME = "名称";
	public static final String ALIAS_CUSTOMER_NO = "账号";
	public static final String ALIAS_CUSTOMER_MOBILE = "手机号";
	public static final String ALIAS_OPENID = "微信号";
	public static final String ALIAS_CUSTOMER_PWD = "密码";
	public static final String ALIAS_NICKNAME = "昵称";
	public static final String ALIAS_HEAD_PORTRAITS = "头像";
	public static final String ALIAS_CUSTOMER_RES = "客户来源";
	public static final String ALIAS_CUSTOMER_TYPE = "客户类型";
	public static final String ALIAS_EMAIL = "邮箱";
	public static final String ALIAS_IDENTITY_CARD = "身份证号";
	public static final String ALIAS_CREATE_TIME = "创建时间";
	public static final String ALIAS_UPDATE_TIME = "修改时间";
	public static final String ALIAS_USE_STATUS = "使用状态";
	public static final String ALIAS_DELETE_STATUS = "删除状态";
	public static final String ALIAS_LAST_LOGIN_TIME = "最后登录时间";
	public static final String ALIAS_VERSION = "版本";
	public static final String ALIAS_ORG_CODE = "组织代码";
	public static final String ALIAS_DATA_SORT = "排序号";
	public static final String ALIAS_JPUSH_ID = "推送ID";
	public static final String ALIAS_ALIPAY_USER_ID = "支付宝号";
	public static final String ALIAS_BIRTHDAY = "生日";
    */

    public static final String MY_FIELD_CUSTOMER_ID = "customerId";
    public static final String MY_FIELD_CUSTOMER_NAME = "customerName";
    public static final String MY_FIELD_NICKNAME = "nickname";
    public static final String MY_FIELD_OPENID = "openid";//微信号
    public static final String MY_FIELD_ALIPAY_USER_ID = "alipayUserId";//支付宝号
    public static final String MY_FIELD_QQNO = "qqNo";//QQ号
    public static final String MY_FIELD_CUSTOMER_MOBILE = "customerMobile";//手机号
    public static final String MY_FIELD_CUSTOMER_RES = "customerRes";
    public static final String MY_FIELD_CUSTOMER_TYPE = "customerType";
    public static final String MY_FIELD_IDENTITY_CARD = "identityCard";
    public static final String MY_FIELD_CUSTOMER_NO = "customerNo";

    public static final String MY_FIELD_CREATE_TIME = "createTime";
    public static final String MY_FIELD_UPDATE_TIME = "updateTime";
    public static final String MY_FIELD_LAST_LOGIN_TIME = "lastLoginTime";

    //columns START
    /**
     * 客户ID
     */
    private Long customerId;
    /**
     * 名称
     */
    private String customerName;
    /**
     * 账号
     */
    private String customerNo;
    /**
     * 手机号
     */
    private String customerMobile;
    /**
     * 微信号
     */
    private String openid;
    /**
     * 密码
     */
    private String customerPwd;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 头像
     */
    private String headPortraits;
    /**
     * 客户来源
     */
    private Integer customerRes;
    /**
     * 客户类型
     */
    private Integer customerType;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 身份证号
     */
    private String identityCard;

    /**
     * 使用状态
     */
    private Integer useStatus;
    /**
     * 删除状态
     */
    private Integer deleteStatus;
    /**
     * 最后登录时间
     */
    private String lastLoginTime;
    /**
     * 版本
     */
    private Integer version;
    /**
     * 组织代码
     */
    private String orgCode;
    /**
     * 排序号
     */
    private Long dataSort;
    /**
     * 推送ID
     */
    private String jpushId;
    /**
     * 支付宝号
     */
    private String alipayUserId;
    /**
     * 生日
     */
    private String birthday;
    //columns END 数据库字段结束
    /**
     * QQ号
     */
    private Integer qqNo;
    /**
     * 省
     */
    private String province;
    /**
     * 市
     */
    private String city;
    /**
     * 区
     */
    private String district;
    /**
     * 区
     */
    private String address;

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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getQqNo() {
        return qqNo;
    }

    public void setQqNo(Integer qqNo) {
        this.qqNo = qqNo;
    }


    public Customer() {
    }

    /**
     * 客户ID
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    /**
     * 客户ID
     */

    public Long getCustomerId() {
        return this.customerId;
    }

    /**
     * 名称
     */
    public void setCustomerName(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.customerName = value;
    }

    /**
     * 名称
     */

    public String getCustomerName() {
        return this.customerName;
    }

    /**
     * 账号
     */
    public void setCustomerNo(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.customerNo = value;
    }


    /**
     * 账号
     */


    public String getCustomerNo() {
        return this.customerNo;
    }

    /**
     * 手机号
     */
    public void setCustomerMobile(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.customerMobile = value;
    }


    /**
     * 手机号
     */


    public String getCustomerMobile() {
        return this.customerMobile;
    }

    /**
     * 微信号
     */
    public void setOpenid(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.openid = value;
    }

    /**
     * 微信号
     */
    public String getOpenid() {
        return this.openid;
    }

    /**
     * 密码
     */
    public void setCustomerPwd(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.customerPwd = value;
    }

    /**
     * 密码
     */
    public String getCustomerPwd() {
        return this.customerPwd;
    }

    /**
     * 昵称
     */
    public void setNickname(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.nickname = value;
    }


    /**
     * 昵称
     */


    public String getNickname() {
        return this.nickname;
    }

    /**
     * 头像
     */
    public void setHeadPortraits(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.headPortraits = value;
    }


    /**
     * 头像
     */


    public String getHeadPortraits() {
        return this.headPortraits;
    }

    /**
     * 客户来源
     */
    public void setCustomerRes(Integer value) {
        this.customerRes = value;
    }


    /**
     * 客户来源
     */


    public Integer getCustomerRes() {
        return this.customerRes;
    }

    /**
     * 客户类型
     */
    public void setCustomerType(Integer value) {
        this.customerType = value;
    }


    /**
     * 客户类型
     */


    public Integer getCustomerType() {
        return this.customerType;
    }

    /**
     * 邮箱
     */
    public void setEmail(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.email = value;
    }


    /**
     * 邮箱
     */


    public String getEmail() {
        return this.email;
    }

    /**
     * 身份证号
     */
    public void setIdentityCard(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.identityCard = value;
    }


    /**
     * 身份证号
     */


    public String getIdentityCard() {
        return this.identityCard;
    }

    /**
     * 使用状态
     */
    public void setUseStatus(Integer value) {
        this.useStatus = value;
    }

    /**
     * 使用状态
     */

    public Integer getUseStatus() {
        return this.useStatus;
    }

    /**
     * 删除状态
     */
    public void setDeleteStatus(Integer value) {
        this.deleteStatus = value;
    }


    /**
     * 删除状态
     */


    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * 最后登录时间
     */
    public void setLastLoginTime(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.lastLoginTime = value;
    }


    /**
     * 最后登录时间
     */


    public String getLastLoginTime() {
        return this.lastLoginTime;
    }

    /**
     * 版本
     */
    public void setVersion(Integer value) {
        this.version = value;
    }


    /**
     * 版本
     */


    public Integer getVersion() {
        return this.version;
    }

    /**
     * 组织代码
     */
    public void setOrgCode(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.orgCode = value;
    }


    /**
     * 组织代码
     */


    public String getOrgCode() {
        return this.orgCode;
    }

    /**
     * 排序号
     */
    public void setDataSort(Long value) {
        this.dataSort = value;
    }


    /**
     * 排序号
     */
    public Long getDataSort() {
        return this.dataSort;
    }

    /**
     * 推送ID
     */
    public void setJpushId(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.jpushId = value;
    }


    /**
     * 推送ID
     */


    public String getJpushId() {
        return this.jpushId;
    }

    /**
     * 支付宝号
     */
    public void setAlipayUserId(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.alipayUserId = value;
    }


    /**
     * 支付宝号
     */


    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    /**
     * 生日
     */
    public void setBirthday(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.birthday = value;
    }


    /**
     * 生日
     */


    public String getBirthday() {
        return this.birthday;
    }


    @Override
    public String toString() {
        return new StringBuilder()
                .append("客户ID[").append(getCustomerId()).append("],")
                .append("名称[").append(getCustomerName()).append("],")
                .append("账号[").append(getCustomerNo()).append("],")
                .append("手机号[").append(getCustomerMobile()).append("],")
                .append("微信号[").append(getOpenid()).append("],")
                .append("密码[").append(getCustomerPwd()).append("],")
                .append("昵称[").append(getNickname()).append("],")
                .append("头像[").append(getHeadPortraits()).append("],")
                .append("客户来源[").append(getCustomerRes()).append("],")
                .append("客户类型[").append(getCustomerType()).append("],")
                .append("邮箱[").append(getEmail()).append("],")
                .append("身份证号[").append(getIdentityCard()).append("],")
                .append("创建时间[").append(getCreateTime()).append("],")
                .append("修改时间[").append(getUpdateTime()).append("],")
                .append("使用状态[").append(getUseStatus()).append("],")
                .append("删除状态[").append(getDeleteStatus()).append("],")
                .append("最后登录时间[").append(getLastLoginTime()).append("],")
                .append("版本[").append(getVersion()).append("],")
                .append("组织代码[").append(getOrgCode()).append("],")
                .append("排序号[").append(getDataSort()).append("],")
                .append("推送ID[").append(getJpushId()).append("],")
                .append("支付宝号[").append(getAlipayUserId()).append("],")
                .append("生日[").append(getBirthday()).append("],")
                .append("QQ号[").append(getQqNo()).append("],")
                .append("省[").append(getProvince()).append("],")
                .append("市[").append(getCity()).append("],")
                .append("区[").append(getDistrict()).append("],")
                .append("详细地址[").append(getAddress()).append("],")
                .toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getCustomerId())
                .toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Customer == false) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        Customer other = (Customer) obj;
        return new EqualsBuilder()
                .append(getCustomerId(), other.getCustomerId())
                .isEquals();
    }
}

	
