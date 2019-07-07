package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO 在此加入类描述
 * @author yqjp<Auto generate>
 * @version  2018-07-12 11:40:46
 * @com.morse.userCenter.customer.domain.Customer
 */
public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
        this.oredCriteria = new ArrayList<>();
    }

    public String getOrderByClause() {
        return this.orderByClause;
    }

    public void setOrderByClause(final String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return this.distinct;
    }

    public void setDistinct(final boolean distinct) {
        this.distinct = distinct;
    }

    public List<Criteria> getOredCriteria() {
        return this.oredCriteria;
    }

    public void or(final Criteria criteria) {
        this.oredCriteria.add(criteria);
    }

    public Criteria or() {
        final Criteria criteria = createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        final Criteria criteria = createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        return new Criteria();
    }

    public void clear() {
        this.oredCriteria.clear();
        this.orderByClause = null;
        this.distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            this.criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return this.criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return this.criteria;
        }

        public List<Criterion> getCriteria() {
            return this.criteria;
        }

        protected void addCriterion(final String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            this.criteria.add(new Criterion(condition));
        }

        protected void addCriterion(final String condition, final Object value, final String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            this.criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(final String condition, final Object value1, final Object value2,
                                    final String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            this.criteria.add(new Criterion(condition, value1, value2));
        }


    	public Criteria andCustomerIdIsNull() {
            addCriterion("customerId is null");
            return (Criteria)this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customerId is not null");
            return (Criteria)this;
        }

        public Criteria andCustomerIdEqualTo(final Long value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria)this;
        }

        public Criteria andCustomerIdNotEqualTo(final Long value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria)this;
        }

        public Criteria andCustomerIdGreaterThan(final Long value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria)this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(final Long value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria)this;
        }

        public Criteria andCustomerIdLessThan(final Long value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria)this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(final Long value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria)this;
        }

        public Criteria andCustomerIdIn(final List<Long> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria)this;
        }

        public Criteria andCustomerIdNotIn(final List<Long> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria)this;
        }

        public Criteria andCustomerIdBetween(final Long value1, final Long value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria)this;
        }

        public Criteria andCustomerIdNotBetween(final Long value1, final Long value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria)this;
        }
        

    	public Criteria andCustomerNameIsNull() {
            addCriterion("customerName is null");
            return (Criteria)this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customerName is not null");
            return (Criteria)this;
        }

        public Criteria andCustomerNameEqualTo(final String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria)this;
        }

        public Criteria andCustomerNameNotEqualTo(final String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria)this;
        }

        public Criteria andCustomerNameGreaterThan(final String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria)this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(final String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria)this;
        }

        public Criteria andCustomerNameLessThan(final String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria)this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(final String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria)this;
        }

        public Criteria andCustomerNameIn(final List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria)this;
        }

        public Criteria andCustomerNameNotIn(final List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria)this;
        }

        public Criteria andCustomerNameBetween(final String value1, final String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria)this;
        }

        public Criteria andCustomerNameNotBetween(final String value1, final String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria)this;
        }
        

    	public Criteria andCustomerNoIsNull() {
            addCriterion("customerNo is null");
            return (Criteria)this;
        }

        public Criteria andCustomerNoIsNotNull() {
            addCriterion("customerNo is not null");
            return (Criteria)this;
        }

        public Criteria andCustomerNoEqualTo(final String value) {
            addCriterion("customer_no =", value, "customerNo");
            return (Criteria)this;
        }

        public Criteria andCustomerNoNotEqualTo(final String value) {
            addCriterion("customer_no <>", value, "customerNo");
            return (Criteria)this;
        }

        public Criteria andCustomerNoGreaterThan(final String value) {
            addCriterion("customer_no >", value, "customerNo");
            return (Criteria)this;
        }

        public Criteria andCustomerNoGreaterThanOrEqualTo(final String value) {
            addCriterion("customer_no >=", value, "customerNo");
            return (Criteria)this;
        }

        public Criteria andCustomerNoLessThan(final String value) {
            addCriterion("customer_no <", value, "customerNo");
            return (Criteria)this;
        }

        public Criteria andCustomerNoLessThanOrEqualTo(final String value) {
            addCriterion("customer_no <=", value, "customerNo");
            return (Criteria)this;
        }

        public Criteria andCustomerNoIn(final List<String> values) {
            addCriterion("customer_no in", values, "customerNo");
            return (Criteria)this;
        }

        public Criteria andCustomerNoNotIn(final List<String> values) {
            addCriterion("customer_no not in", values, "customerNo");
            return (Criteria)this;
        }

        public Criteria andCustomerNoBetween(final String value1, final String value2) {
            addCriterion("customer_no between", value1, value2, "customerNo");
            return (Criteria)this;
        }

        public Criteria andCustomerNoNotBetween(final String value1, final String value2) {
            addCriterion("customer_no not between", value1, value2, "customerNo");
            return (Criteria)this;
        }
        

    	public Criteria andCustomerMobileIsNull() {
            addCriterion("customerMobile is null");
            return (Criteria)this;
        }

        public Criteria andCustomerMobileIsNotNull() {
            addCriterion("customerMobile is not null");
            return (Criteria)this;
        }

        public Criteria andCustomerMobileEqualTo(final String value) {
            addCriterion("customer_mobile =", value, "customerMobile");
            return (Criteria)this;
        }

        public Criteria andCustomerMobileNotEqualTo(final String value) {
            addCriterion("customer_mobile <>", value, "customerMobile");
            return (Criteria)this;
        }

        public Criteria andCustomerMobileGreaterThan(final String value) {
            addCriterion("customer_mobile >", value, "customerMobile");
            return (Criteria)this;
        }

        public Criteria andCustomerMobileGreaterThanOrEqualTo(final String value) {
            addCriterion("customer_mobile >=", value, "customerMobile");
            return (Criteria)this;
        }

        public Criteria andCustomerMobileLessThan(final String value) {
            addCriterion("customer_mobile <", value, "customerMobile");
            return (Criteria)this;
        }

        public Criteria andCustomerMobileLessThanOrEqualTo(final String value) {
            addCriterion("customer_mobile <=", value, "customerMobile");
            return (Criteria)this;
        }

        public Criteria andCustomerMobileIn(final List<String> values) {
            addCriterion("customer_mobile in", values, "customerMobile");
            return (Criteria)this;
        }

        public Criteria andCustomerMobileNotIn(final List<String> values) {
            addCriterion("customer_mobile not in", values, "customerMobile");
            return (Criteria)this;
        }

        public Criteria andCustomerMobileBetween(final String value1, final String value2) {
            addCriterion("customer_mobile between", value1, value2, "customerMobile");
            return (Criteria)this;
        }

        public Criteria andCustomerMobileNotBetween(final String value1, final String value2) {
            addCriterion("customer_mobile not between", value1, value2, "customerMobile");
            return (Criteria)this;
        }
        

    	public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria)this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria)this;
        }

        public Criteria andOpenidEqualTo(final String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria)this;
        }

        public Criteria andOpenidNotEqualTo(final String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria)this;
        }

        public Criteria andOpenidGreaterThan(final String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria)this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(final String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria)this;
        }

        public Criteria andOpenidLessThan(final String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria)this;
        }

        public Criteria andOpenidLessThanOrEqualTo(final String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria)this;
        }

        public Criteria andOpenidIn(final List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria)this;
        }

        public Criteria andOpenidNotIn(final List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria)this;
        }

        public Criteria andOpenidBetween(final String value1, final String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria)this;
        }

        public Criteria andOpenidNotBetween(final String value1, final String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria)this;
        }
        

    	public Criteria andCustomerPwdIsNull() {
            addCriterion("customerPwd is null");
            return (Criteria)this;
        }

        public Criteria andCustomerPwdIsNotNull() {
            addCriterion("customerPwd is not null");
            return (Criteria)this;
        }

        public Criteria andCustomerPwdEqualTo(final String value) {
            addCriterion("customer_pwd =", value, "customerPwd");
            return (Criteria)this;
        }

        public Criteria andCustomerPwdNotEqualTo(final String value) {
            addCriterion("customer_pwd <>", value, "customerPwd");
            return (Criteria)this;
        }

        public Criteria andCustomerPwdGreaterThan(final String value) {
            addCriterion("customer_pwd >", value, "customerPwd");
            return (Criteria)this;
        }

        public Criteria andCustomerPwdGreaterThanOrEqualTo(final String value) {
            addCriterion("customer_pwd >=", value, "customerPwd");
            return (Criteria)this;
        }

        public Criteria andCustomerPwdLessThan(final String value) {
            addCriterion("customer_pwd <", value, "customerPwd");
            return (Criteria)this;
        }

        public Criteria andCustomerPwdLessThanOrEqualTo(final String value) {
            addCriterion("customer_pwd <=", value, "customerPwd");
            return (Criteria)this;
        }

        public Criteria andCustomerPwdIn(final List<String> values) {
            addCriterion("customer_pwd in", values, "customerPwd");
            return (Criteria)this;
        }

        public Criteria andCustomerPwdNotIn(final List<String> values) {
            addCriterion("customer_pwd not in", values, "customerPwd");
            return (Criteria)this;
        }

        public Criteria andCustomerPwdBetween(final String value1, final String value2) {
            addCriterion("customer_pwd between", value1, value2, "customerPwd");
            return (Criteria)this;
        }

        public Criteria andCustomerPwdNotBetween(final String value1, final String value2) {
            addCriterion("customer_pwd not between", value1, value2, "customerPwd");
            return (Criteria)this;
        }
        

    	public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria)this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria)this;
        }

        public Criteria andNicknameEqualTo(final String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria)this;
        }

        public Criteria andNicknameNotEqualTo(final String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria)this;
        }

        public Criteria andNicknameGreaterThan(final String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria)this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(final String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria)this;
        }

        public Criteria andNicknameLessThan(final String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria)this;
        }

        public Criteria andNicknameLessThanOrEqualTo(final String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria)this;
        }

        public Criteria andNicknameIn(final List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria)this;
        }

        public Criteria andNicknameNotIn(final List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria)this;
        }

        public Criteria andNicknameBetween(final String value1, final String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria)this;
        }

        public Criteria andNicknameNotBetween(final String value1, final String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria)this;
        }
        

    	public Criteria andHeadPortraitsIsNull() {
            addCriterion("headPortraits is null");
            return (Criteria)this;
        }

        public Criteria andHeadPortraitsIsNotNull() {
            addCriterion("headPortraits is not null");
            return (Criteria)this;
        }

        public Criteria andHeadPortraitsEqualTo(final String value) {
            addCriterion("head_portraits =", value, "headPortraits");
            return (Criteria)this;
        }

        public Criteria andHeadPortraitsNotEqualTo(final String value) {
            addCriterion("head_portraits <>", value, "headPortraits");
            return (Criteria)this;
        }

        public Criteria andHeadPortraitsGreaterThan(final String value) {
            addCriterion("head_portraits >", value, "headPortraits");
            return (Criteria)this;
        }

        public Criteria andHeadPortraitsGreaterThanOrEqualTo(final String value) {
            addCriterion("head_portraits >=", value, "headPortraits");
            return (Criteria)this;
        }

        public Criteria andHeadPortraitsLessThan(final String value) {
            addCriterion("head_portraits <", value, "headPortraits");
            return (Criteria)this;
        }

        public Criteria andHeadPortraitsLessThanOrEqualTo(final String value) {
            addCriterion("head_portraits <=", value, "headPortraits");
            return (Criteria)this;
        }

        public Criteria andHeadPortraitsIn(final List<String> values) {
            addCriterion("head_portraits in", values, "headPortraits");
            return (Criteria)this;
        }

        public Criteria andHeadPortraitsNotIn(final List<String> values) {
            addCriterion("head_portraits not in", values, "headPortraits");
            return (Criteria)this;
        }

        public Criteria andHeadPortraitsBetween(final String value1, final String value2) {
            addCriterion("head_portraits between", value1, value2, "headPortraits");
            return (Criteria)this;
        }

        public Criteria andHeadPortraitsNotBetween(final String value1, final String value2) {
            addCriterion("head_portraits not between", value1, value2, "headPortraits");
            return (Criteria)this;
        }
        

    	public Criteria andCustomerResIsNull() {
            addCriterion("customerRes is null");
            return (Criteria)this;
        }

        public Criteria andCustomerResIsNotNull() {
            addCriterion("customerRes is not null");
            return (Criteria)this;
        }

        public Criteria andCustomerResEqualTo(final Integer value) {
            addCriterion("customer_res =", value, "customerRes");
            return (Criteria)this;
        }

        public Criteria andCustomerResNotEqualTo(final Integer value) {
            addCriterion("customer_res <>", value, "customerRes");
            return (Criteria)this;
        }

        public Criteria andCustomerResGreaterThan(final Integer value) {
            addCriterion("customer_res >", value, "customerRes");
            return (Criteria)this;
        }

        public Criteria andCustomerResGreaterThanOrEqualTo(final Integer value) {
            addCriterion("customer_res >=", value, "customerRes");
            return (Criteria)this;
        }

        public Criteria andCustomerResLessThan(final Integer value) {
            addCriterion("customer_res <", value, "customerRes");
            return (Criteria)this;
        }

        public Criteria andCustomerResLessThanOrEqualTo(final Integer value) {
            addCriterion("customer_res <=", value, "customerRes");
            return (Criteria)this;
        }

        public Criteria andCustomerResIn(final List<Integer> values) {
            addCriterion("customer_res in", values, "customerRes");
            return (Criteria)this;
        }

        public Criteria andCustomerResNotIn(final List<Integer> values) {
            addCriterion("customer_res not in", values, "customerRes");
            return (Criteria)this;
        }

        public Criteria andCustomerResBetween(final Integer value1, final Integer value2) {
            addCriterion("customer_res between", value1, value2, "customerRes");
            return (Criteria)this;
        }

        public Criteria andCustomerResNotBetween(final Integer value1, final Integer value2) {
            addCriterion("customer_res not between", value1, value2, "customerRes");
            return (Criteria)this;
        }
        

    	public Criteria andCustomerTypeIsNull() {
            addCriterion("customerType is null");
            return (Criteria)this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("customerType is not null");
            return (Criteria)this;
        }

        public Criteria andCustomerTypeEqualTo(final Integer value) {
            addCriterion("customer_type =", value, "customerType");
            return (Criteria)this;
        }

        public Criteria andCustomerTypeNotEqualTo(final Integer value) {
            addCriterion("customer_type <>", value, "customerType");
            return (Criteria)this;
        }

        public Criteria andCustomerTypeGreaterThan(final Integer value) {
            addCriterion("customer_type >", value, "customerType");
            return (Criteria)this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(final Integer value) {
            addCriterion("customer_type >=", value, "customerType");
            return (Criteria)this;
        }

        public Criteria andCustomerTypeLessThan(final Integer value) {
            addCriterion("customer_type <", value, "customerType");
            return (Criteria)this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(final Integer value) {
            addCriterion("customer_type <=", value, "customerType");
            return (Criteria)this;
        }

        public Criteria andCustomerTypeIn(final List<Integer> values) {
            addCriterion("customer_type in", values, "customerType");
            return (Criteria)this;
        }

        public Criteria andCustomerTypeNotIn(final List<Integer> values) {
            addCriterion("customer_type not in", values, "customerType");
            return (Criteria)this;
        }

        public Criteria andCustomerTypeBetween(final Integer value1, final Integer value2) {
            addCriterion("customer_type between", value1, value2, "customerType");
            return (Criteria)this;
        }

        public Criteria andCustomerTypeNotBetween(final Integer value1, final Integer value2) {
            addCriterion("customer_type not between", value1, value2, "customerType");
            return (Criteria)this;
        }
        

    	public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria)this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria)this;
        }

        public Criteria andEmailEqualTo(final String value) {
            addCriterion("email =", value, "email");
            return (Criteria)this;
        }

        public Criteria andEmailNotEqualTo(final String value) {
            addCriterion("email <>", value, "email");
            return (Criteria)this;
        }

        public Criteria andEmailGreaterThan(final String value) {
            addCriterion("email >", value, "email");
            return (Criteria)this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(final String value) {
            addCriterion("email >=", value, "email");
            return (Criteria)this;
        }

        public Criteria andEmailLessThan(final String value) {
            addCriterion("email <", value, "email");
            return (Criteria)this;
        }

        public Criteria andEmailLessThanOrEqualTo(final String value) {
            addCriterion("email <=", value, "email");
            return (Criteria)this;
        }

        public Criteria andEmailIn(final List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria)this;
        }

        public Criteria andEmailNotIn(final List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria)this;
        }

        public Criteria andEmailBetween(final String value1, final String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria)this;
        }

        public Criteria andEmailNotBetween(final String value1, final String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria)this;
        }
        

    	public Criteria andIdentityCardIsNull() {
            addCriterion("identityCard is null");
            return (Criteria)this;
        }

        public Criteria andIdentityCardIsNotNull() {
            addCriterion("identityCard is not null");
            return (Criteria)this;
        }

        public Criteria andIdentityCardEqualTo(final String value) {
            addCriterion("identity_card =", value, "identityCard");
            return (Criteria)this;
        }

        public Criteria andIdentityCardNotEqualTo(final String value) {
            addCriterion("identity_card <>", value, "identityCard");
            return (Criteria)this;
        }

        public Criteria andIdentityCardGreaterThan(final String value) {
            addCriterion("identity_card >", value, "identityCard");
            return (Criteria)this;
        }

        public Criteria andIdentityCardGreaterThanOrEqualTo(final String value) {
            addCriterion("identity_card >=", value, "identityCard");
            return (Criteria)this;
        }

        public Criteria andIdentityCardLessThan(final String value) {
            addCriterion("identity_card <", value, "identityCard");
            return (Criteria)this;
        }

        public Criteria andIdentityCardLessThanOrEqualTo(final String value) {
            addCriterion("identity_card <=", value, "identityCard");
            return (Criteria)this;
        }

        public Criteria andIdentityCardIn(final List<String> values) {
            addCriterion("identity_card in", values, "identityCard");
            return (Criteria)this;
        }

        public Criteria andIdentityCardNotIn(final List<String> values) {
            addCriterion("identity_card not in", values, "identityCard");
            return (Criteria)this;
        }

        public Criteria andIdentityCardBetween(final String value1, final String value2) {
            addCriterion("identity_card between", value1, value2, "identityCard");
            return (Criteria)this;
        }

        public Criteria andIdentityCardNotBetween(final String value1, final String value2) {
            addCriterion("identity_card not between", value1, value2, "identityCard");
            return (Criteria)this;
        }
        

    	public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria)this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria)this;
        }

        public Criteria andCreateTimeEqualTo(final String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeNotEqualTo(final String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeGreaterThan(final String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(final String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeLessThan(final String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(final String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeIn(final List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeNotIn(final List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeBetween(final String value1, final String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeNotBetween(final String value1, final String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria)this;
        }
        

    	public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeEqualTo(final String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeNotEqualTo(final String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeGreaterThan(final String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(final String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeLessThan(final String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(final String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeIn(final List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeNotIn(final List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeBetween(final String value1, final String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeNotBetween(final String value1, final String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria)this;
        }
        

    	public Criteria andUseStatusIsNull() {
            addCriterion("useStatus is null");
            return (Criteria)this;
        }

        public Criteria andUseStatusIsNotNull() {
            addCriterion("useStatus is not null");
            return (Criteria)this;
        }

        public Criteria andUseStatusEqualTo(final Integer value) {
            addCriterion("use_status =", value, "useStatus");
            return (Criteria)this;
        }

        public Criteria andUseStatusNotEqualTo(final Integer value) {
            addCriterion("use_status <>", value, "useStatus");
            return (Criteria)this;
        }

        public Criteria andUseStatusGreaterThan(final Integer value) {
            addCriterion("use_status >", value, "useStatus");
            return (Criteria)this;
        }

        public Criteria andUseStatusGreaterThanOrEqualTo(final Integer value) {
            addCriterion("use_status >=", value, "useStatus");
            return (Criteria)this;
        }

        public Criteria andUseStatusLessThan(final Integer value) {
            addCriterion("use_status <", value, "useStatus");
            return (Criteria)this;
        }

        public Criteria andUseStatusLessThanOrEqualTo(final Integer value) {
            addCriterion("use_status <=", value, "useStatus");
            return (Criteria)this;
        }

        public Criteria andUseStatusIn(final List<Integer> values) {
            addCriterion("use_status in", values, "useStatus");
            return (Criteria)this;
        }

        public Criteria andUseStatusNotIn(final List<Integer> values) {
            addCriterion("use_status not in", values, "useStatus");
            return (Criteria)this;
        }

        public Criteria andUseStatusBetween(final Integer value1, final Integer value2) {
            addCriterion("use_status between", value1, value2, "useStatus");
            return (Criteria)this;
        }

        public Criteria andUseStatusNotBetween(final Integer value1, final Integer value2) {
            addCriterion("use_status not between", value1, value2, "useStatus");
            return (Criteria)this;
        }
        

    	public Criteria andDeleteStatusIsNull() {
            addCriterion("deleteStatus is null");
            return (Criteria)this;
        }

        public Criteria andDeleteStatusIsNotNull() {
            addCriterion("deleteStatus is not null");
            return (Criteria)this;
        }

        public Criteria andDeleteStatusEqualTo(final Integer value) {
            addCriterion("delete_status =", value, "deleteStatus");
            return (Criteria)this;
        }

        public Criteria andDeleteStatusNotEqualTo(final Integer value) {
            addCriterion("delete_status <>", value, "deleteStatus");
            return (Criteria)this;
        }

        public Criteria andDeleteStatusGreaterThan(final Integer value) {
            addCriterion("delete_status >", value, "deleteStatus");
            return (Criteria)this;
        }

        public Criteria andDeleteStatusGreaterThanOrEqualTo(final Integer value) {
            addCriterion("delete_status >=", value, "deleteStatus");
            return (Criteria)this;
        }

        public Criteria andDeleteStatusLessThan(final Integer value) {
            addCriterion("delete_status <", value, "deleteStatus");
            return (Criteria)this;
        }

        public Criteria andDeleteStatusLessThanOrEqualTo(final Integer value) {
            addCriterion("delete_status <=", value, "deleteStatus");
            return (Criteria)this;
        }

        public Criteria andDeleteStatusIn(final List<Integer> values) {
            addCriterion("delete_status in", values, "deleteStatus");
            return (Criteria)this;
        }

        public Criteria andDeleteStatusNotIn(final List<Integer> values) {
            addCriterion("delete_status not in", values, "deleteStatus");
            return (Criteria)this;
        }

        public Criteria andDeleteStatusBetween(final Integer value1, final Integer value2) {
            addCriterion("delete_status between", value1, value2, "deleteStatus");
            return (Criteria)this;
        }

        public Criteria andDeleteStatusNotBetween(final Integer value1, final Integer value2) {
            addCriterion("delete_status not between", value1, value2, "deleteStatus");
            return (Criteria)this;
        }
        

    	public Criteria andLastLoginTimeIsNull() {
            addCriterion("lastLoginTime is null");
            return (Criteria)this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("lastLoginTime is not null");
            return (Criteria)this;
        }

        public Criteria andLastLoginTimeEqualTo(final String value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria)this;
        }

        public Criteria andLastLoginTimeNotEqualTo(final String value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria)this;
        }

        public Criteria andLastLoginTimeGreaterThan(final String value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria)this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(final String value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria)this;
        }

        public Criteria andLastLoginTimeLessThan(final String value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria)this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(final String value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria)this;
        }

        public Criteria andLastLoginTimeIn(final List<String> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria)this;
        }

        public Criteria andLastLoginTimeNotIn(final List<String> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria)this;
        }

        public Criteria andLastLoginTimeBetween(final String value1, final String value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria)this;
        }

        public Criteria andLastLoginTimeNotBetween(final String value1, final String value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria)this;
        }
        

    	public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria)this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria)this;
        }

        public Criteria andVersionEqualTo(final Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria)this;
        }

        public Criteria andVersionNotEqualTo(final Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria)this;
        }

        public Criteria andVersionGreaterThan(final Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria)this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(final Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria)this;
        }

        public Criteria andVersionLessThan(final Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria)this;
        }

        public Criteria andVersionLessThanOrEqualTo(final Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria)this;
        }

        public Criteria andVersionIn(final List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria)this;
        }

        public Criteria andVersionNotIn(final List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria)this;
        }

        public Criteria andVersionBetween(final Integer value1, final Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria)this;
        }

        public Criteria andVersionNotBetween(final Integer value1, final Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria)this;
        }
        

    	public Criteria andOrgCodeIsNull() {
            addCriterion("orgCode is null");
            return (Criteria)this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("orgCode is not null");
            return (Criteria)this;
        }

        public Criteria andOrgCodeEqualTo(final String value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria)this;
        }

        public Criteria andOrgCodeNotEqualTo(final String value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria)this;
        }

        public Criteria andOrgCodeGreaterThan(final String value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria)this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(final String value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria)this;
        }

        public Criteria andOrgCodeLessThan(final String value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria)this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(final String value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria)this;
        }

        public Criteria andOrgCodeIn(final List<String> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria)this;
        }

        public Criteria andOrgCodeNotIn(final List<String> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria)this;
        }

        public Criteria andOrgCodeBetween(final String value1, final String value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria)this;
        }

        public Criteria andOrgCodeNotBetween(final String value1, final String value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria)this;
        }
        

    	public Criteria andDataSortIsNull() {
            addCriterion("dataSort is null");
            return (Criteria)this;
        }

        public Criteria andDataSortIsNotNull() {
            addCriterion("dataSort is not null");
            return (Criteria)this;
        }

        public Criteria andDataSortEqualTo(final Long value) {
            addCriterion("data_sort =", value, "dataSort");
            return (Criteria)this;
        }

        public Criteria andDataSortNotEqualTo(final Long value) {
            addCriterion("data_sort <>", value, "dataSort");
            return (Criteria)this;
        }

        public Criteria andDataSortGreaterThan(final Long value) {
            addCriterion("data_sort >", value, "dataSort");
            return (Criteria)this;
        }

        public Criteria andDataSortGreaterThanOrEqualTo(final Long value) {
            addCriterion("data_sort >=", value, "dataSort");
            return (Criteria)this;
        }

        public Criteria andDataSortLessThan(final Long value) {
            addCriterion("data_sort <", value, "dataSort");
            return (Criteria)this;
        }

        public Criteria andDataSortLessThanOrEqualTo(final Long value) {
            addCriterion("data_sort <=", value, "dataSort");
            return (Criteria)this;
        }

        public Criteria andDataSortIn(final List<Long> values) {
            addCriterion("data_sort in", values, "dataSort");
            return (Criteria)this;
        }

        public Criteria andDataSortNotIn(final List<Long> values) {
            addCriterion("data_sort not in", values, "dataSort");
            return (Criteria)this;
        }

        public Criteria andDataSortBetween(final Long value1, final Long value2) {
            addCriterion("data_sort between", value1, value2, "dataSort");
            return (Criteria)this;
        }

        public Criteria andDataSortNotBetween(final Long value1, final Long value2) {
            addCriterion("data_sort not between", value1, value2, "dataSort");
            return (Criteria)this;
        }
        

    	public Criteria andJpushIdIsNull() {
            addCriterion("jpushId is null");
            return (Criteria)this;
        }

        public Criteria andJpushIdIsNotNull() {
            addCriterion("jpushId is not null");
            return (Criteria)this;
        }

        public Criteria andJpushIdEqualTo(final String value) {
            addCriterion("jpush_id =", value, "jpushId");
            return (Criteria)this;
        }

        public Criteria andJpushIdNotEqualTo(final String value) {
            addCriterion("jpush_id <>", value, "jpushId");
            return (Criteria)this;
        }

        public Criteria andJpushIdGreaterThan(final String value) {
            addCriterion("jpush_id >", value, "jpushId");
            return (Criteria)this;
        }

        public Criteria andJpushIdGreaterThanOrEqualTo(final String value) {
            addCriterion("jpush_id >=", value, "jpushId");
            return (Criteria)this;
        }

        public Criteria andJpushIdLessThan(final String value) {
            addCriterion("jpush_id <", value, "jpushId");
            return (Criteria)this;
        }

        public Criteria andJpushIdLessThanOrEqualTo(final String value) {
            addCriterion("jpush_id <=", value, "jpushId");
            return (Criteria)this;
        }

        public Criteria andJpushIdIn(final List<String> values) {
            addCriterion("jpush_id in", values, "jpushId");
            return (Criteria)this;
        }

        public Criteria andJpushIdNotIn(final List<String> values) {
            addCriterion("jpush_id not in", values, "jpushId");
            return (Criteria)this;
        }

        public Criteria andJpushIdBetween(final String value1, final String value2) {
            addCriterion("jpush_id between", value1, value2, "jpushId");
            return (Criteria)this;
        }

        public Criteria andJpushIdNotBetween(final String value1, final String value2) {
            addCriterion("jpush_id not between", value1, value2, "jpushId");
            return (Criteria)this;
        }
        

    	public Criteria andAlipayUserIdIsNull() {
            addCriterion("alipayUserId is null");
            return (Criteria)this;
        }

        public Criteria andAlipayUserIdIsNotNull() {
            addCriterion("alipayUserId is not null");
            return (Criteria)this;
        }

        public Criteria andAlipayUserIdEqualTo(final String value) {
            addCriterion("alipay_user_id =", value, "alipayUserId");
            return (Criteria)this;
        }

        public Criteria andAlipayUserIdNotEqualTo(final String value) {
            addCriterion("alipay_user_id <>", value, "alipayUserId");
            return (Criteria)this;
        }

        public Criteria andAlipayUserIdGreaterThan(final String value) {
            addCriterion("alipay_user_id >", value, "alipayUserId");
            return (Criteria)this;
        }

        public Criteria andAlipayUserIdGreaterThanOrEqualTo(final String value) {
            addCriterion("alipay_user_id >=", value, "alipayUserId");
            return (Criteria)this;
        }

        public Criteria andAlipayUserIdLessThan(final String value) {
            addCriterion("alipay_user_id <", value, "alipayUserId");
            return (Criteria)this;
        }

        public Criteria andAlipayUserIdLessThanOrEqualTo(final String value) {
            addCriterion("alipay_user_id <=", value, "alipayUserId");
            return (Criteria)this;
        }

        public Criteria andAlipayUserIdIn(final List<String> values) {
            addCriterion("alipay_user_id in", values, "alipayUserId");
            return (Criteria)this;
        }

        public Criteria andAlipayUserIdNotIn(final List<String> values) {
            addCriterion("alipay_user_id not in", values, "alipayUserId");
            return (Criteria)this;
        }

        public Criteria andAlipayUserIdBetween(final String value1, final String value2) {
            addCriterion("alipay_user_id between", value1, value2, "alipayUserId");
            return (Criteria)this;
        }

        public Criteria andAlipayUserIdNotBetween(final String value1, final String value2) {
            addCriterion("alipay_user_id not between", value1, value2, "alipayUserId");
            return (Criteria)this;
        }
        

    	public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria)this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria)this;
        }

        public Criteria andBirthdayEqualTo(final String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria)this;
        }

        public Criteria andBirthdayNotEqualTo(final String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria)this;
        }

        public Criteria andBirthdayGreaterThan(final String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria)this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(final String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria)this;
        }

        public Criteria andBirthdayLessThan(final String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria)this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(final String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria)this;
        }

        public Criteria andBirthdayIn(final List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria)this;
        }

        public Criteria andBirthdayNotIn(final List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria)this;
        }

        public Criteria andBirthdayBetween(final String value1, final String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria)this;
        }

        public Criteria andBirthdayNotBetween(final String value1, final String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria)this;
        }
        

    	public Criteria andQqNoIsNull() {
            addCriterion("qqNo is null");
            return (Criteria)this;
        }

        public Criteria andQqNoIsNotNull() {
            addCriterion("qqNo is not null");
            return (Criteria)this;
        }

        public Criteria andQqNoEqualTo(final Integer value) {
            addCriterion("qq_no =", value, "qqNo");
            return (Criteria)this;
        }

        public Criteria andQqNoNotEqualTo(final Integer value) {
            addCriterion("qq_no <>", value, "qqNo");
            return (Criteria)this;
        }

        public Criteria andQqNoGreaterThan(final Integer value) {
            addCriterion("qq_no >", value, "qqNo");
            return (Criteria)this;
        }

        public Criteria andQqNoGreaterThanOrEqualTo(final Integer value) {
            addCriterion("qq_no >=", value, "qqNo");
            return (Criteria)this;
        }

        public Criteria andQqNoLessThan(final Integer value) {
            addCriterion("qq_no <", value, "qqNo");
            return (Criteria)this;
        }

        public Criteria andQqNoLessThanOrEqualTo(final Integer value) {
            addCriterion("qq_no <=", value, "qqNo");
            return (Criteria)this;
        }

        public Criteria andQqNoIn(final List<Integer> values) {
            addCriterion("qq_no in", values, "qqNo");
            return (Criteria)this;
        }

        public Criteria andQqNoNotIn(final List<Integer> values) {
            addCriterion("qq_no not in", values, "qqNo");
            return (Criteria)this;
        }

        public Criteria andQqNoBetween(final Integer value1, final Integer value2) {
            addCriterion("qq_no between", value1, value2, "qqNo");
            return (Criteria)this;
        }

        public Criteria andQqNoNotBetween(final Integer value1, final Integer value2) {
            addCriterion("qq_no not between", value1, value2, "qqNo");
            return (Criteria)this;
        }
        

    	public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria)this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria)this;
        }

        public Criteria andProvinceEqualTo(final String value) {
            addCriterion("province =", value, "province");
            return (Criteria)this;
        }

        public Criteria andProvinceNotEqualTo(final String value) {
            addCriterion("province <>", value, "province");
            return (Criteria)this;
        }

        public Criteria andProvinceGreaterThan(final String value) {
            addCriterion("province >", value, "province");
            return (Criteria)this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(final String value) {
            addCriterion("province >=", value, "province");
            return (Criteria)this;
        }

        public Criteria andProvinceLessThan(final String value) {
            addCriterion("province <", value, "province");
            return (Criteria)this;
        }

        public Criteria andProvinceLessThanOrEqualTo(final String value) {
            addCriterion("province <=", value, "province");
            return (Criteria)this;
        }

        public Criteria andProvinceIn(final List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria)this;
        }

        public Criteria andProvinceNotIn(final List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria)this;
        }

        public Criteria andProvinceBetween(final String value1, final String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria)this;
        }

        public Criteria andProvinceNotBetween(final String value1, final String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria)this;
        }
        

    	public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria)this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria)this;
        }

        public Criteria andCityEqualTo(final String value) {
            addCriterion("city =", value, "city");
            return (Criteria)this;
        }

        public Criteria andCityNotEqualTo(final String value) {
            addCriterion("city <>", value, "city");
            return (Criteria)this;
        }

        public Criteria andCityGreaterThan(final String value) {
            addCriterion("city >", value, "city");
            return (Criteria)this;
        }

        public Criteria andCityGreaterThanOrEqualTo(final String value) {
            addCriterion("city >=", value, "city");
            return (Criteria)this;
        }

        public Criteria andCityLessThan(final String value) {
            addCriterion("city <", value, "city");
            return (Criteria)this;
        }

        public Criteria andCityLessThanOrEqualTo(final String value) {
            addCriterion("city <=", value, "city");
            return (Criteria)this;
        }

        public Criteria andCityIn(final List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria)this;
        }

        public Criteria andCityNotIn(final List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria)this;
        }

        public Criteria andCityBetween(final String value1, final String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria)this;
        }

        public Criteria andCityNotBetween(final String value1, final String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria)this;
        }
        

    	public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria)this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria)this;
        }

        public Criteria andDistrictEqualTo(final String value) {
            addCriterion("district =", value, "district");
            return (Criteria)this;
        }

        public Criteria andDistrictNotEqualTo(final String value) {
            addCriterion("district <>", value, "district");
            return (Criteria)this;
        }

        public Criteria andDistrictGreaterThan(final String value) {
            addCriterion("district >", value, "district");
            return (Criteria)this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(final String value) {
            addCriterion("district >=", value, "district");
            return (Criteria)this;
        }

        public Criteria andDistrictLessThan(final String value) {
            addCriterion("district <", value, "district");
            return (Criteria)this;
        }

        public Criteria andDistrictLessThanOrEqualTo(final String value) {
            addCriterion("district <=", value, "district");
            return (Criteria)this;
        }

        public Criteria andDistrictIn(final List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria)this;
        }

        public Criteria andDistrictNotIn(final List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria)this;
        }

        public Criteria andDistrictBetween(final String value1, final String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria)this;
        }

        public Criteria andDistrictNotBetween(final String value1, final String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria)this;
        }
        

    	public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria)this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria)this;
        }

        public Criteria andAddressEqualTo(final String value) {
            addCriterion("address =", value, "address");
            return (Criteria)this;
        }

        public Criteria andAddressNotEqualTo(final String value) {
            addCriterion("address <>", value, "address");
            return (Criteria)this;
        }

        public Criteria andAddressGreaterThan(final String value) {
            addCriterion("address >", value, "address");
            return (Criteria)this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(final String value) {
            addCriterion("address >=", value, "address");
            return (Criteria)this;
        }

        public Criteria andAddressLessThan(final String value) {
            addCriterion("address <", value, "address");
            return (Criteria)this;
        }

        public Criteria andAddressLessThanOrEqualTo(final String value) {
            addCriterion("address <=", value, "address");
            return (Criteria)this;
        }

        public Criteria andAddressIn(final List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria)this;
        }

        public Criteria andAddressNotIn(final List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria)this;
        }

        public Criteria andAddressBetween(final String value1, final String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria)this;
        }

        public Criteria andAddressNotBetween(final String value1, final String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria)this;
        }
        
        
        

      
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andFieldLike(final String fieldName, final String keyword) {
            addCriterion(fieldName + " like ", "%"+keyword+"%", fieldName);
            return this;
        }
        public Criteria andFieldEqual(final String fieldName, final String keyword) {
            addCriterion(fieldName + " = ", keyword, fieldName);
            return this;
        }
    }

    public static class Criterion {
        private final String condition;
        private final String typeHandler;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;

        protected Criterion(final String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(final String condition, final Object value, final String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(final String condition, final Object value) {
            this(condition, value, null);
        }

        protected Criterion(final String condition, final Object value, final Object secondValue,
                            final String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(final String condition, final Object value, final Object secondValue) {
            this(condition, value, secondValue, null);
        }

        public String getCondition() {
            return this.condition;
        }

        public Object getValue() {
            return this.value;
        }

        public Object getSecondValue() {
            return this.secondValue;
        }

        public boolean isNoValue() {
            return this.noValue;
        }

        public boolean isSingleValue() {
            return this.singleValue;
        }

        public boolean isBetweenValue() {
            return this.betweenValue;
        }

        public boolean isListValue() {
            return this.listValue;
        }

        public String getTypeHandler() {
            return this.typeHandler;
        }
    }
}