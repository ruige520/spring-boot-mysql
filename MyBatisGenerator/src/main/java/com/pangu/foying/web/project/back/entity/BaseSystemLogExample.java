package com.pangu.foying.web.project.back.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BaseSystemLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseSystemLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccessModeIsNull() {
            addCriterion("AccessMode is null");
            return (Criteria) this;
        }

        public Criteria andAccessModeIsNotNull() {
            addCriterion("AccessMode is not null");
            return (Criteria) this;
        }

        public Criteria andAccessModeEqualTo(String value) {
            addCriterion("AccessMode =", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeNotEqualTo(String value) {
            addCriterion("AccessMode <>", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeGreaterThan(String value) {
            addCriterion("AccessMode >", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeGreaterThanOrEqualTo(String value) {
            addCriterion("AccessMode >=", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeLessThan(String value) {
            addCriterion("AccessMode <", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeLessThanOrEqualTo(String value) {
            addCriterion("AccessMode <=", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeLike(String value) {
            addCriterion("AccessMode like", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeNotLike(String value) {
            addCriterion("AccessMode not like", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeIn(List<String> values) {
            addCriterion("AccessMode in", values, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeNotIn(List<String> values) {
            addCriterion("AccessMode not in", values, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeBetween(String value1, String value2) {
            addCriterion("AccessMode between", value1, value2, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeNotBetween(String value1, String value2) {
            addCriterion("AccessMode not between", value1, value2, "accessMode");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleIsNull() {
            addCriterion("BusinessModule is null");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleIsNotNull() {
            addCriterion("BusinessModule is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleEqualTo(String value) {
            addCriterion("BusinessModule =", value, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleNotEqualTo(String value) {
            addCriterion("BusinessModule <>", value, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleGreaterThan(String value) {
            addCriterion("BusinessModule >", value, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessModule >=", value, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleLessThan(String value) {
            addCriterion("BusinessModule <", value, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleLessThanOrEqualTo(String value) {
            addCriterion("BusinessModule <=", value, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleLike(String value) {
            addCriterion("BusinessModule like", value, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleNotLike(String value) {
            addCriterion("BusinessModule not like", value, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleIn(List<String> values) {
            addCriterion("BusinessModule in", values, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleNotIn(List<String> values) {
            addCriterion("BusinessModule not in", values, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleBetween(String value1, String value2) {
            addCriterion("BusinessModule between", value1, value2, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleNotBetween(String value1, String value2) {
            addCriterion("BusinessModule not between", value1, value2, "businessModule");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNull() {
            addCriterion("ActionType is null");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNotNull() {
            addCriterion("ActionType is not null");
            return (Criteria) this;
        }

        public Criteria andActionTypeEqualTo(String value) {
            addCriterion("ActionType =", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotEqualTo(String value) {
            addCriterion("ActionType <>", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThan(String value) {
            addCriterion("ActionType >", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ActionType >=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThan(String value) {
            addCriterion("ActionType <", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThanOrEqualTo(String value) {
            addCriterion("ActionType <=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLike(String value) {
            addCriterion("ActionType like", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotLike(String value) {
            addCriterion("ActionType not like", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeIn(List<String> values) {
            addCriterion("ActionType in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotIn(List<String> values) {
            addCriterion("ActionType not in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeBetween(String value1, String value2) {
            addCriterion("ActionType between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotBetween(String value1, String value2) {
            addCriterion("ActionType not between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andHostIpIsNull() {
            addCriterion("HostIp is null");
            return (Criteria) this;
        }

        public Criteria andHostIpIsNotNull() {
            addCriterion("HostIp is not null");
            return (Criteria) this;
        }

        public Criteria andHostIpEqualTo(String value) {
            addCriterion("HostIp =", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotEqualTo(String value) {
            addCriterion("HostIp <>", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpGreaterThan(String value) {
            addCriterion("HostIp >", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpGreaterThanOrEqualTo(String value) {
            addCriterion("HostIp >=", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLessThan(String value) {
            addCriterion("HostIp <", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLessThanOrEqualTo(String value) {
            addCriterion("HostIp <=", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLike(String value) {
            addCriterion("HostIp like", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotLike(String value) {
            addCriterion("HostIp not like", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpIn(List<String> values) {
            addCriterion("HostIp in", values, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotIn(List<String> values) {
            addCriterion("HostIp not in", values, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpBetween(String value1, String value2) {
            addCriterion("HostIp between", value1, value2, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotBetween(String value1, String value2) {
            addCriterion("HostIp not between", value1, value2, "hostIp");
            return (Criteria) this;
        }

        public Criteria andOperUrlIsNull() {
            addCriterion("OperUrl is null");
            return (Criteria) this;
        }

        public Criteria andOperUrlIsNotNull() {
            addCriterion("OperUrl is not null");
            return (Criteria) this;
        }

        public Criteria andOperUrlEqualTo(String value) {
            addCriterion("OperUrl =", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlNotEqualTo(String value) {
            addCriterion("OperUrl <>", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlGreaterThan(String value) {
            addCriterion("OperUrl >", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlGreaterThanOrEqualTo(String value) {
            addCriterion("OperUrl >=", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlLessThan(String value) {
            addCriterion("OperUrl <", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlLessThanOrEqualTo(String value) {
            addCriterion("OperUrl <=", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlLike(String value) {
            addCriterion("OperUrl like", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlNotLike(String value) {
            addCriterion("OperUrl not like", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlIn(List<String> values) {
            addCriterion("OperUrl in", values, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlNotIn(List<String> values) {
            addCriterion("OperUrl not in", values, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlBetween(String value1, String value2) {
            addCriterion("OperUrl between", value1, value2, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlNotBetween(String value1, String value2) {
            addCriterion("OperUrl not between", value1, value2, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperParamsIsNull() {
            addCriterion("OperParams is null");
            return (Criteria) this;
        }

        public Criteria andOperParamsIsNotNull() {
            addCriterion("OperParams is not null");
            return (Criteria) this;
        }

        public Criteria andOperParamsEqualTo(String value) {
            addCriterion("OperParams =", value, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsNotEqualTo(String value) {
            addCriterion("OperParams <>", value, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsGreaterThan(String value) {
            addCriterion("OperParams >", value, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsGreaterThanOrEqualTo(String value) {
            addCriterion("OperParams >=", value, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsLessThan(String value) {
            addCriterion("OperParams <", value, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsLessThanOrEqualTo(String value) {
            addCriterion("OperParams <=", value, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsLike(String value) {
            addCriterion("OperParams like", value, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsNotLike(String value) {
            addCriterion("OperParams not like", value, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsIn(List<String> values) {
            addCriterion("OperParams in", values, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsNotIn(List<String> values) {
            addCriterion("OperParams not in", values, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsBetween(String value1, String value2) {
            addCriterion("OperParams between", value1, value2, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsNotBetween(String value1, String value2) {
            addCriterion("OperParams not between", value1, value2, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperResultIsNull() {
            addCriterion("OperResult is null");
            return (Criteria) this;
        }

        public Criteria andOperResultIsNotNull() {
            addCriterion("OperResult is not null");
            return (Criteria) this;
        }

        public Criteria andOperResultEqualTo(String value) {
            addCriterion("OperResult =", value, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultNotEqualTo(String value) {
            addCriterion("OperResult <>", value, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultGreaterThan(String value) {
            addCriterion("OperResult >", value, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultGreaterThanOrEqualTo(String value) {
            addCriterion("OperResult >=", value, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultLessThan(String value) {
            addCriterion("OperResult <", value, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultLessThanOrEqualTo(String value) {
            addCriterion("OperResult <=", value, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultLike(String value) {
            addCriterion("OperResult like", value, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultNotLike(String value) {
            addCriterion("OperResult not like", value, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultIn(List<String> values) {
            addCriterion("OperResult in", values, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultNotIn(List<String> values) {
            addCriterion("OperResult not in", values, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultBetween(String value1, String value2) {
            addCriterion("OperResult between", value1, value2, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultNotBetween(String value1, String value2) {
            addCriterion("OperResult not between", value1, value2, "operResult");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("Status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("Status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("AddTime is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("AddTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Timestamp value) {
            addCriterion("AddTime =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Timestamp value) {
            addCriterion("AddTime <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Timestamp value) {
            addCriterion("AddTime >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("AddTime >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Timestamp value) {
            addCriterion("AddTime <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("AddTime <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Timestamp> values) {
            addCriterion("AddTime in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Timestamp> values) {
            addCriterion("AddTime not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("AddTime between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("AddTime not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIsNull() {
            addCriterion("AddUserID is null");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIsNotNull() {
            addCriterion("AddUserID is not null");
            return (Criteria) this;
        }

        public Criteria andAddUserIdEqualTo(String value) {
            addCriterion("AddUserID =", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotEqualTo(String value) {
            addCriterion("AddUserID <>", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdGreaterThan(String value) {
            addCriterion("AddUserID >", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("AddUserID >=", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLessThan(String value) {
            addCriterion("AddUserID <", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLessThanOrEqualTo(String value) {
            addCriterion("AddUserID <=", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLike(String value) {
            addCriterion("AddUserID like", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotLike(String value) {
            addCriterion("AddUserID not like", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIn(List<String> values) {
            addCriterion("AddUserID in", values, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotIn(List<String> values) {
            addCriterion("AddUserID not in", values, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdBetween(String value1, String value2) {
            addCriterion("AddUserID between", value1, value2, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotBetween(String value1, String value2) {
            addCriterion("AddUserID not between", value1, value2, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserNameIsNull() {
            addCriterion("AddUserName is null");
            return (Criteria) this;
        }

        public Criteria andAddUserNameIsNotNull() {
            addCriterion("AddUserName is not null");
            return (Criteria) this;
        }

        public Criteria andAddUserNameEqualTo(String value) {
            addCriterion("AddUserName =", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameNotEqualTo(String value) {
            addCriterion("AddUserName <>", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameGreaterThan(String value) {
            addCriterion("AddUserName >", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("AddUserName >=", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameLessThan(String value) {
            addCriterion("AddUserName <", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameLessThanOrEqualTo(String value) {
            addCriterion("AddUserName <=", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameLike(String value) {
            addCriterion("AddUserName like", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameNotLike(String value) {
            addCriterion("AddUserName not like", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameIn(List<String> values) {
            addCriterion("AddUserName in", values, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameNotIn(List<String> values) {
            addCriterion("AddUserName not in", values, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameBetween(String value1, String value2) {
            addCriterion("AddUserName between", value1, value2, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameNotBetween(String value1, String value2) {
            addCriterion("AddUserName not between", value1, value2, "addUserName");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("ModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("ModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Timestamp value) {
            addCriterion("ModifyTime =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Timestamp value) {
            addCriterion("ModifyTime <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Timestamp value) {
            addCriterion("ModifyTime >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("ModifyTime >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Timestamp value) {
            addCriterion("ModifyTime <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("ModifyTime <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Timestamp> values) {
            addCriterion("ModifyTime in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Timestamp> values) {
            addCriterion("ModifyTime not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ModifyTime between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ModifyTime not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIsNull() {
            addCriterion("ModifyUserID is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIsNotNull() {
            addCriterion("ModifyUserID is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdEqualTo(String value) {
            addCriterion("ModifyUserID =", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotEqualTo(String value) {
            addCriterion("ModifyUserID <>", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdGreaterThan(String value) {
            addCriterion("ModifyUserID >", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("ModifyUserID >=", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLessThan(String value) {
            addCriterion("ModifyUserID <", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLessThanOrEqualTo(String value) {
            addCriterion("ModifyUserID <=", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLike(String value) {
            addCriterion("ModifyUserID like", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotLike(String value) {
            addCriterion("ModifyUserID not like", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIn(List<String> values) {
            addCriterion("ModifyUserID in", values, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotIn(List<String> values) {
            addCriterion("ModifyUserID not in", values, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdBetween(String value1, String value2) {
            addCriterion("ModifyUserID between", value1, value2, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotBetween(String value1, String value2) {
            addCriterion("ModifyUserID not between", value1, value2, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyNameIsNull() {
            addCriterion("ModifyName is null");
            return (Criteria) this;
        }

        public Criteria andModifyNameIsNotNull() {
            addCriterion("ModifyName is not null");
            return (Criteria) this;
        }

        public Criteria andModifyNameEqualTo(String value) {
            addCriterion("ModifyName =", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotEqualTo(String value) {
            addCriterion("ModifyName <>", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameGreaterThan(String value) {
            addCriterion("ModifyName >", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameGreaterThanOrEqualTo(String value) {
            addCriterion("ModifyName >=", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameLessThan(String value) {
            addCriterion("ModifyName <", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameLessThanOrEqualTo(String value) {
            addCriterion("ModifyName <=", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameLike(String value) {
            addCriterion("ModifyName like", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotLike(String value) {
            addCriterion("ModifyName not like", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameIn(List<String> values) {
            addCriterion("ModifyName in", values, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotIn(List<String> values) {
            addCriterion("ModifyName not in", values, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameBetween(String value1, String value2) {
            addCriterion("ModifyName between", value1, value2, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotBetween(String value1, String value2) {
            addCriterion("ModifyName not between", value1, value2, "modifyName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameIsNull() {
            addCriterion("DeleteName is null");
            return (Criteria) this;
        }

        public Criteria andDeleteNameIsNotNull() {
            addCriterion("DeleteName is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteNameEqualTo(String value) {
            addCriterion("DeleteName =", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameNotEqualTo(String value) {
            addCriterion("DeleteName <>", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameGreaterThan(String value) {
            addCriterion("DeleteName >", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameGreaterThanOrEqualTo(String value) {
            addCriterion("DeleteName >=", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameLessThan(String value) {
            addCriterion("DeleteName <", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameLessThanOrEqualTo(String value) {
            addCriterion("DeleteName <=", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameLike(String value) {
            addCriterion("DeleteName like", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameNotLike(String value) {
            addCriterion("DeleteName not like", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameIn(List<String> values) {
            addCriterion("DeleteName in", values, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameNotIn(List<String> values) {
            addCriterion("DeleteName not in", values, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameBetween(String value1, String value2) {
            addCriterion("DeleteName between", value1, value2, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameNotBetween(String value1, String value2) {
            addCriterion("DeleteName not between", value1, value2, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("DeleteTime is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("DeleteTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Timestamp value) {
            addCriterion("DeleteTime =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Timestamp value) {
            addCriterion("DeleteTime <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Timestamp value) {
            addCriterion("DeleteTime >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("DeleteTime >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Timestamp value) {
            addCriterion("DeleteTime <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("DeleteTime <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Timestamp> values) {
            addCriterion("DeleteTime in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Timestamp> values) {
            addCriterion("DeleteTime not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("DeleteTime between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("DeleteTime not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIsNull() {
            addCriterion("DeleteMark is null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIsNotNull() {
            addCriterion("DeleteMark is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkEqualTo(Boolean value) {
            addCriterion("DeleteMark =", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotEqualTo(Boolean value) {
            addCriterion("DeleteMark <>", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkGreaterThan(Boolean value) {
            addCriterion("DeleteMark >", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DeleteMark >=", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLessThan(Boolean value) {
            addCriterion("DeleteMark <", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLessThanOrEqualTo(Boolean value) {
            addCriterion("DeleteMark <=", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIn(List<Boolean> values) {
            addCriterion("DeleteMark in", values, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotIn(List<Boolean> values) {
            addCriterion("DeleteMark not in", values, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBetween(Boolean value1, Boolean value2) {
            addCriterion("DeleteMark between", value1, value2, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DeleteMark not between", value1, value2, "deleteMark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
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

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}