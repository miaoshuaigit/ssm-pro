package com.westear.ssm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DemoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DemoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andTeamNameEnIsNull() {
            addCriterion("TEAM_NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andTeamNameEnIsNotNull() {
            addCriterion("TEAM_NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNameEnEqualTo(String value) {
            addCriterion("TEAM_NAME_EN =", value, "teamNameEn");
            return (Criteria) this;
        }

        public Criteria andTeamNameEnNotEqualTo(String value) {
            addCriterion("TEAM_NAME_EN <>", value, "teamNameEn");
            return (Criteria) this;
        }

        public Criteria andTeamNameEnGreaterThan(String value) {
            addCriterion("TEAM_NAME_EN >", value, "teamNameEn");
            return (Criteria) this;
        }

        public Criteria andTeamNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_NAME_EN >=", value, "teamNameEn");
            return (Criteria) this;
        }

        public Criteria andTeamNameEnLessThan(String value) {
            addCriterion("TEAM_NAME_EN <", value, "teamNameEn");
            return (Criteria) this;
        }

        public Criteria andTeamNameEnLessThanOrEqualTo(String value) {
            addCriterion("TEAM_NAME_EN <=", value, "teamNameEn");
            return (Criteria) this;
        }

        public Criteria andTeamNameEnLike(String value) {
            addCriterion("TEAM_NAME_EN like", value, "teamNameEn");
            return (Criteria) this;
        }

        public Criteria andTeamNameEnNotLike(String value) {
            addCriterion("TEAM_NAME_EN not like", value, "teamNameEn");
            return (Criteria) this;
        }

        public Criteria andTeamNameEnIn(List<String> values) {
            addCriterion("TEAM_NAME_EN in", values, "teamNameEn");
            return (Criteria) this;
        }

        public Criteria andTeamNameEnNotIn(List<String> values) {
            addCriterion("TEAM_NAME_EN not in", values, "teamNameEn");
            return (Criteria) this;
        }

        public Criteria andTeamNameEnBetween(String value1, String value2) {
            addCriterion("TEAM_NAME_EN between", value1, value2, "teamNameEn");
            return (Criteria) this;
        }

        public Criteria andTeamNameEnNotBetween(String value1, String value2) {
            addCriterion("TEAM_NAME_EN not between", value1, value2, "teamNameEn");
            return (Criteria) this;
        }

        public Criteria andTeamNameZhIsNull() {
            addCriterion("TEAM_NAME_ZH is null");
            return (Criteria) this;
        }

        public Criteria andTeamNameZhIsNotNull() {
            addCriterion("TEAM_NAME_ZH is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNameZhEqualTo(String value) {
            addCriterion("TEAM_NAME_ZH =", value, "teamNameZh");
            return (Criteria) this;
        }

        public Criteria andTeamNameZhNotEqualTo(String value) {
            addCriterion("TEAM_NAME_ZH <>", value, "teamNameZh");
            return (Criteria) this;
        }

        public Criteria andTeamNameZhGreaterThan(String value) {
            addCriterion("TEAM_NAME_ZH >", value, "teamNameZh");
            return (Criteria) this;
        }

        public Criteria andTeamNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_NAME_ZH >=", value, "teamNameZh");
            return (Criteria) this;
        }

        public Criteria andTeamNameZhLessThan(String value) {
            addCriterion("TEAM_NAME_ZH <", value, "teamNameZh");
            return (Criteria) this;
        }

        public Criteria andTeamNameZhLessThanOrEqualTo(String value) {
            addCriterion("TEAM_NAME_ZH <=", value, "teamNameZh");
            return (Criteria) this;
        }

        public Criteria andTeamNameZhLike(String value) {
            addCriterion("TEAM_NAME_ZH like", value, "teamNameZh");
            return (Criteria) this;
        }

        public Criteria andTeamNameZhNotLike(String value) {
            addCriterion("TEAM_NAME_ZH not like", value, "teamNameZh");
            return (Criteria) this;
        }

        public Criteria andTeamNameZhIn(List<String> values) {
            addCriterion("TEAM_NAME_ZH in", values, "teamNameZh");
            return (Criteria) this;
        }

        public Criteria andTeamNameZhNotIn(List<String> values) {
            addCriterion("TEAM_NAME_ZH not in", values, "teamNameZh");
            return (Criteria) this;
        }

        public Criteria andTeamNameZhBetween(String value1, String value2) {
            addCriterion("TEAM_NAME_ZH between", value1, value2, "teamNameZh");
            return (Criteria) this;
        }

        public Criteria andTeamNameZhNotBetween(String value1, String value2) {
            addCriterion("TEAM_NAME_ZH not between", value1, value2, "teamNameZh");
            return (Criteria) this;
        }

        public Criteria andTeamRankIsNull() {
            addCriterion("TEAM_RANK is null");
            return (Criteria) this;
        }

        public Criteria andTeamRankIsNotNull() {
            addCriterion("TEAM_RANK is not null");
            return (Criteria) this;
        }

        public Criteria andTeamRankEqualTo(Short value) {
            addCriterion("TEAM_RANK =", value, "teamRank");
            return (Criteria) this;
        }

        public Criteria andTeamRankNotEqualTo(Short value) {
            addCriterion("TEAM_RANK <>", value, "teamRank");
            return (Criteria) this;
        }

        public Criteria andTeamRankGreaterThan(Short value) {
            addCriterion("TEAM_RANK >", value, "teamRank");
            return (Criteria) this;
        }

        public Criteria andTeamRankGreaterThanOrEqualTo(Short value) {
            addCriterion("TEAM_RANK >=", value, "teamRank");
            return (Criteria) this;
        }

        public Criteria andTeamRankLessThan(Short value) {
            addCriterion("TEAM_RANK <", value, "teamRank");
            return (Criteria) this;
        }

        public Criteria andTeamRankLessThanOrEqualTo(Short value) {
            addCriterion("TEAM_RANK <=", value, "teamRank");
            return (Criteria) this;
        }

        public Criteria andTeamRankIn(List<Short> values) {
            addCriterion("TEAM_RANK in", values, "teamRank");
            return (Criteria) this;
        }

        public Criteria andTeamRankNotIn(List<Short> values) {
            addCriterion("TEAM_RANK not in", values, "teamRank");
            return (Criteria) this;
        }

        public Criteria andTeamRankBetween(Short value1, Short value2) {
            addCriterion("TEAM_RANK between", value1, value2, "teamRank");
            return (Criteria) this;
        }

        public Criteria andTeamRankNotBetween(Short value1, Short value2) {
            addCriterion("TEAM_RANK not between", value1, value2, "teamRank");
            return (Criteria) this;
        }

        public Criteria andTeamCreatetimeIsNull() {
            addCriterion("TEAM_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andTeamCreatetimeIsNotNull() {
            addCriterion("TEAM_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("TEAM_CREATETIME =", value, "teamCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("TEAM_CREATETIME <>", value, "teamCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("TEAM_CREATETIME >", value, "teamCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TEAM_CREATETIME >=", value, "teamCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("TEAM_CREATETIME <", value, "teamCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TEAM_CREATETIME <=", value, "teamCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("TEAM_CREATETIME in", values, "teamCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("TEAM_CREATETIME not in", values, "teamCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TEAM_CREATETIME between", value1, value2, "teamCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeamCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TEAM_CREATETIME not between", value1, value2, "teamCreatetime");
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