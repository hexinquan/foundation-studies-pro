package com.example.demo.dao.vo;


import com.example.demo.dao.vo.base.BaseVo;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;

/**
 * TODO 在此加入类描述
 *
 * @author morse<Auto       generate>
 * @version 2018-06-12 14:51:20
 * @copyright morse
 */

public class CustomerVo extends BaseVo implements Serializable {

    private static final long serialVersionUID = 1L;

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
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String updateTime;


    /**
     * 最后登录时间
     */
    private String lastLoginTime;


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
     * 详细地址
     */
    private String address;


    public Integer getQqNo() {
        return qqNo;
    }

    public void setQqNo(Integer qqNo) {
        this.qqNo = qqNo;
    }

    public CustomerVo() {
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
     * 创建时间
     */
    public void setCreateTime(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.createTime = value;
    }


    /**
     * 创建时间
     */

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * 修改时间
     */
    public void setUpdateTime(String value) {
        if (StringUtils.isNotBlank(value)) {
            value = value.trim();
        }
        this.updateTime = value;
    }


    /**
     * 修改时间
     */

    public String getUpdateTime() {
        return this.updateTime;
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

    /**
     * 生日
     */

    public String getBirthday() {
        return this.birthday;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerVo{");
        sb.append("customerId=").append(customerId);
        sb.append(", customerName='").append(customerName).append('\'');
        sb.append(", customerNo='").append(customerNo).append('\'');
        sb.append(", customerMobile='").append(customerMobile).append('\'');
        sb.append(", openid='").append(openid).append('\'');
        sb.append(", customerPwd='").append(customerPwd).append('\'');
        sb.append(", nickname='").append(nickname).append('\'');
        sb.append(", headPortraits='").append(headPortraits).append('\'');
        sb.append(", customerRes=").append(customerRes);
        sb.append(", customerType=").append(customerType);
        sb.append(", email='").append(email).append('\'');
        sb.append(", identityCard='").append(identityCard).append('\'');
        sb.append(", createTime='").append(createTime).append('\'');
        sb.append(", updateTime='").append(updateTime).append('\'');
        sb.append(", lastLoginTime='").append(lastLoginTime).append('\'');
        sb.append(", jpushId='").append(jpushId).append('\'');
        sb.append(", alipayUserId='").append(alipayUserId).append('\'');
        sb.append(", birthday='").append(birthday).append('\'');
        sb.append(", qqNo=").append(qqNo);
        sb.append(", province='").append(province).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", district='").append(district).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getCustomerId())
                .toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CustomerVo == false) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        CustomerVo other = (CustomerVo) obj;
        return new EqualsBuilder()
                .append(getCustomerId(), other.getCustomerId())
                .isEquals();
    }
}

	




