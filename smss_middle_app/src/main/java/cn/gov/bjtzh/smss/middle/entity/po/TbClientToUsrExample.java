package cn.gov.bjtzh.smss.middle.entity.po;

import java.util.ArrayList;
import java.util.List;

public class TbClientToUsrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbClientToUsrExample() {
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

        public Criteria andUsrSeqIsNull() {
            addCriterion("USR_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andUsrSeqIsNotNull() {
            addCriterion("USR_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andUsrSeqEqualTo(Double value) {
            addCriterion("USR_SEQ =", value, "usrSeq");
            return (Criteria) this;
        }

        public Criteria andUsrSeqNotEqualTo(Double value) {
            addCriterion("USR_SEQ <>", value, "usrSeq");
            return (Criteria) this;
        }

        public Criteria andUsrSeqGreaterThan(Double value) {
            addCriterion("USR_SEQ >", value, "usrSeq");
            return (Criteria) this;
        }

        public Criteria andUsrSeqGreaterThanOrEqualTo(Double value) {
            addCriterion("USR_SEQ >=", value, "usrSeq");
            return (Criteria) this;
        }

        public Criteria andUsrSeqLessThan(Double value) {
            addCriterion("USR_SEQ <", value, "usrSeq");
            return (Criteria) this;
        }

        public Criteria andUsrSeqLessThanOrEqualTo(Double value) {
            addCriterion("USR_SEQ <=", value, "usrSeq");
            return (Criteria) this;
        }

        public Criteria andUsrSeqIn(List<Double> values) {
            addCriterion("USR_SEQ in", values, "usrSeq");
            return (Criteria) this;
        }

        public Criteria andUsrSeqNotIn(List<Double> values) {
            addCriterion("USR_SEQ not in", values, "usrSeq");
            return (Criteria) this;
        }

        public Criteria andUsrSeqBetween(Double value1, Double value2) {
            addCriterion("USR_SEQ between", value1, value2, "usrSeq");
            return (Criteria) this;
        }

        public Criteria andUsrSeqNotBetween(Double value1, Double value2) {
            addCriterion("USR_SEQ not between", value1, value2, "usrSeq");
            return (Criteria) this;
        }

        public Criteria andUsrIdIsNull() {
            addCriterion("USR_ID is null");
            return (Criteria) this;
        }

        public Criteria andUsrIdIsNotNull() {
            addCriterion("USR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUsrIdEqualTo(String value) {
            addCriterion("USR_ID =", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotEqualTo(String value) {
            addCriterion("USR_ID <>", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdGreaterThan(String value) {
            addCriterion("USR_ID >", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdGreaterThanOrEqualTo(String value) {
            addCriterion("USR_ID >=", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLessThan(String value) {
            addCriterion("USR_ID <", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLessThanOrEqualTo(String value) {
            addCriterion("USR_ID <=", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLike(String value) {
            addCriterion("USR_ID like", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotLike(String value) {
            addCriterion("USR_ID not like", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdIn(List<String> values) {
            addCriterion("USR_ID in", values, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotIn(List<String> values) {
            addCriterion("USR_ID not in", values, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdBetween(String value1, String value2) {
            addCriterion("USR_ID between", value1, value2, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotBetween(String value1, String value2) {
            addCriterion("USR_ID not between", value1, value2, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNull() {
            addCriterion("USR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNotNull() {
            addCriterion("USR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsrNameEqualTo(String value) {
            addCriterion("USR_NAME =", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotEqualTo(String value) {
            addCriterion("USR_NAME <>", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThan(String value) {
            addCriterion("USR_NAME >", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThanOrEqualTo(String value) {
            addCriterion("USR_NAME >=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThan(String value) {
            addCriterion("USR_NAME <", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThanOrEqualTo(String value) {
            addCriterion("USR_NAME <=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLike(String value) {
            addCriterion("USR_NAME like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotLike(String value) {
            addCriterion("USR_NAME not like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameIn(List<String> values) {
            addCriterion("USR_NAME in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotIn(List<String> values) {
            addCriterion("USR_NAME not in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameBetween(String value1, String value2) {
            addCriterion("USR_NAME between", value1, value2, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotBetween(String value1, String value2) {
            addCriterion("USR_NAME not between", value1, value2, "usrName");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("TOKEN =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("TOKEN <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("TOKEN >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("TOKEN <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("TOKEN <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("TOKEN like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("TOKEN not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("TOKEN in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("TOKEN not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("TOKEN between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("TOKEN not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andUsrLoginStsIsNull() {
            addCriterion("USR_LOGIN_STS is null");
            return (Criteria) this;
        }

        public Criteria andUsrLoginStsIsNotNull() {
            addCriterion("USR_LOGIN_STS is not null");
            return (Criteria) this;
        }

        public Criteria andUsrLoginStsEqualTo(String value) {
            addCriterion("USR_LOGIN_STS =", value, "usrLoginSts");
            return (Criteria) this;
        }

        public Criteria andUsrLoginStsNotEqualTo(String value) {
            addCriterion("USR_LOGIN_STS <>", value, "usrLoginSts");
            return (Criteria) this;
        }

        public Criteria andUsrLoginStsGreaterThan(String value) {
            addCriterion("USR_LOGIN_STS >", value, "usrLoginSts");
            return (Criteria) this;
        }

        public Criteria andUsrLoginStsGreaterThanOrEqualTo(String value) {
            addCriterion("USR_LOGIN_STS >=", value, "usrLoginSts");
            return (Criteria) this;
        }

        public Criteria andUsrLoginStsLessThan(String value) {
            addCriterion("USR_LOGIN_STS <", value, "usrLoginSts");
            return (Criteria) this;
        }

        public Criteria andUsrLoginStsLessThanOrEqualTo(String value) {
            addCriterion("USR_LOGIN_STS <=", value, "usrLoginSts");
            return (Criteria) this;
        }

        public Criteria andUsrLoginStsLike(String value) {
            addCriterion("USR_LOGIN_STS like", value, "usrLoginSts");
            return (Criteria) this;
        }

        public Criteria andUsrLoginStsNotLike(String value) {
            addCriterion("USR_LOGIN_STS not like", value, "usrLoginSts");
            return (Criteria) this;
        }

        public Criteria andUsrLoginStsIn(List<String> values) {
            addCriterion("USR_LOGIN_STS in", values, "usrLoginSts");
            return (Criteria) this;
        }

        public Criteria andUsrLoginStsNotIn(List<String> values) {
            addCriterion("USR_LOGIN_STS not in", values, "usrLoginSts");
            return (Criteria) this;
        }

        public Criteria andUsrLoginStsBetween(String value1, String value2) {
            addCriterion("USR_LOGIN_STS between", value1, value2, "usrLoginSts");
            return (Criteria) this;
        }

        public Criteria andUsrLoginStsNotBetween(String value1, String value2) {
            addCriterion("USR_LOGIN_STS not between", value1, value2, "usrLoginSts");
            return (Criteria) this;
        }

        public Criteria andAgentCodeIsNull() {
            addCriterion("AGENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAgentCodeIsNotNull() {
            addCriterion("AGENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAgentCodeEqualTo(String value) {
            addCriterion("AGENT_CODE =", value, "agentCode");
            return (Criteria) this;
        }

        public Criteria andAgentCodeNotEqualTo(String value) {
            addCriterion("AGENT_CODE <>", value, "agentCode");
            return (Criteria) this;
        }

        public Criteria andAgentCodeGreaterThan(String value) {
            addCriterion("AGENT_CODE >", value, "agentCode");
            return (Criteria) this;
        }

        public Criteria andAgentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT_CODE >=", value, "agentCode");
            return (Criteria) this;
        }

        public Criteria andAgentCodeLessThan(String value) {
            addCriterion("AGENT_CODE <", value, "agentCode");
            return (Criteria) this;
        }

        public Criteria andAgentCodeLessThanOrEqualTo(String value) {
            addCriterion("AGENT_CODE <=", value, "agentCode");
            return (Criteria) this;
        }

        public Criteria andAgentCodeLike(String value) {
            addCriterion("AGENT_CODE like", value, "agentCode");
            return (Criteria) this;
        }

        public Criteria andAgentCodeNotLike(String value) {
            addCriterion("AGENT_CODE not like", value, "agentCode");
            return (Criteria) this;
        }

        public Criteria andAgentCodeIn(List<String> values) {
            addCriterion("AGENT_CODE in", values, "agentCode");
            return (Criteria) this;
        }

        public Criteria andAgentCodeNotIn(List<String> values) {
            addCriterion("AGENT_CODE not in", values, "agentCode");
            return (Criteria) this;
        }

        public Criteria andAgentCodeBetween(String value1, String value2) {
            addCriterion("AGENT_CODE between", value1, value2, "agentCode");
            return (Criteria) this;
        }

        public Criteria andAgentCodeNotBetween(String value1, String value2) {
            addCriterion("AGENT_CODE not between", value1, value2, "agentCode");
            return (Criteria) this;
        }

        public Criteria andUsrRmkIsNull() {
            addCriterion("USR_RMK is null");
            return (Criteria) this;
        }

        public Criteria andUsrRmkIsNotNull() {
            addCriterion("USR_RMK is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRmkEqualTo(String value) {
            addCriterion("USR_RMK =", value, "usrRmk");
            return (Criteria) this;
        }

        public Criteria andUsrRmkNotEqualTo(String value) {
            addCriterion("USR_RMK <>", value, "usrRmk");
            return (Criteria) this;
        }

        public Criteria andUsrRmkGreaterThan(String value) {
            addCriterion("USR_RMK >", value, "usrRmk");
            return (Criteria) this;
        }

        public Criteria andUsrRmkGreaterThanOrEqualTo(String value) {
            addCriterion("USR_RMK >=", value, "usrRmk");
            return (Criteria) this;
        }

        public Criteria andUsrRmkLessThan(String value) {
            addCriterion("USR_RMK <", value, "usrRmk");
            return (Criteria) this;
        }

        public Criteria andUsrRmkLessThanOrEqualTo(String value) {
            addCriterion("USR_RMK <=", value, "usrRmk");
            return (Criteria) this;
        }

        public Criteria andUsrRmkLike(String value) {
            addCriterion("USR_RMK like", value, "usrRmk");
            return (Criteria) this;
        }

        public Criteria andUsrRmkNotLike(String value) {
            addCriterion("USR_RMK not like", value, "usrRmk");
            return (Criteria) this;
        }

        public Criteria andUsrRmkIn(List<String> values) {
            addCriterion("USR_RMK in", values, "usrRmk");
            return (Criteria) this;
        }

        public Criteria andUsrRmkNotIn(List<String> values) {
            addCriterion("USR_RMK not in", values, "usrRmk");
            return (Criteria) this;
        }

        public Criteria andUsrRmkBetween(String value1, String value2) {
            addCriterion("USR_RMK between", value1, value2, "usrRmk");
            return (Criteria) this;
        }

        public Criteria andUsrRmkNotBetween(String value1, String value2) {
            addCriterion("USR_RMK not between", value1, value2, "usrRmk");
            return (Criteria) this;
        }

        public Criteria andCrtDtIsNull() {
            addCriterion("CRT_DT is null");
            return (Criteria) this;
        }

        public Criteria andCrtDtIsNotNull() {
            addCriterion("CRT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andCrtDtEqualTo(String value) {
            addCriterion("CRT_DT =", value, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtNotEqualTo(String value) {
            addCriterion("CRT_DT <>", value, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtGreaterThan(String value) {
            addCriterion("CRT_DT >", value, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_DT >=", value, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtLessThan(String value) {
            addCriterion("CRT_DT <", value, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtLessThanOrEqualTo(String value) {
            addCriterion("CRT_DT <=", value, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtLike(String value) {
            addCriterion("CRT_DT like", value, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtNotLike(String value) {
            addCriterion("CRT_DT not like", value, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtIn(List<String> values) {
            addCriterion("CRT_DT in", values, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtNotIn(List<String> values) {
            addCriterion("CRT_DT not in", values, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtBetween(String value1, String value2) {
            addCriterion("CRT_DT between", value1, value2, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtNotBetween(String value1, String value2) {
            addCriterion("CRT_DT not between", value1, value2, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIsNull() {
            addCriterion("CRT_USR is null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIsNotNull() {
            addCriterion("CRT_USR is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrEqualTo(String value) {
            addCriterion("CRT_USR =", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotEqualTo(String value) {
            addCriterion("CRT_USR <>", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrGreaterThan(String value) {
            addCriterion("CRT_USR >", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USR >=", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrLessThan(String value) {
            addCriterion("CRT_USR <", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrLessThanOrEqualTo(String value) {
            addCriterion("CRT_USR <=", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrLike(String value) {
            addCriterion("CRT_USR like", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotLike(String value) {
            addCriterion("CRT_USR not like", value, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIn(List<String> values) {
            addCriterion("CRT_USR in", values, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotIn(List<String> values) {
            addCriterion("CRT_USR not in", values, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrBetween(String value1, String value2) {
            addCriterion("CRT_USR between", value1, value2, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andCrtUsrNotBetween(String value1, String value2) {
            addCriterion("CRT_USR not between", value1, value2, "crtUsr");
            return (Criteria) this;
        }

        public Criteria andLastChgDtIsNull() {
            addCriterion("LAST_CHG_DT is null");
            return (Criteria) this;
        }

        public Criteria andLastChgDtIsNotNull() {
            addCriterion("LAST_CHG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andLastChgDtEqualTo(String value) {
            addCriterion("LAST_CHG_DT =", value, "lastChgDt");
            return (Criteria) this;
        }

        public Criteria andLastChgDtNotEqualTo(String value) {
            addCriterion("LAST_CHG_DT <>", value, "lastChgDt");
            return (Criteria) this;
        }

        public Criteria andLastChgDtGreaterThan(String value) {
            addCriterion("LAST_CHG_DT >", value, "lastChgDt");
            return (Criteria) this;
        }

        public Criteria andLastChgDtGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_CHG_DT >=", value, "lastChgDt");
            return (Criteria) this;
        }

        public Criteria andLastChgDtLessThan(String value) {
            addCriterion("LAST_CHG_DT <", value, "lastChgDt");
            return (Criteria) this;
        }

        public Criteria andLastChgDtLessThanOrEqualTo(String value) {
            addCriterion("LAST_CHG_DT <=", value, "lastChgDt");
            return (Criteria) this;
        }

        public Criteria andLastChgDtLike(String value) {
            addCriterion("LAST_CHG_DT like", value, "lastChgDt");
            return (Criteria) this;
        }

        public Criteria andLastChgDtNotLike(String value) {
            addCriterion("LAST_CHG_DT not like", value, "lastChgDt");
            return (Criteria) this;
        }

        public Criteria andLastChgDtIn(List<String> values) {
            addCriterion("LAST_CHG_DT in", values, "lastChgDt");
            return (Criteria) this;
        }

        public Criteria andLastChgDtNotIn(List<String> values) {
            addCriterion("LAST_CHG_DT not in", values, "lastChgDt");
            return (Criteria) this;
        }

        public Criteria andLastChgDtBetween(String value1, String value2) {
            addCriterion("LAST_CHG_DT between", value1, value2, "lastChgDt");
            return (Criteria) this;
        }

        public Criteria andLastChgDtNotBetween(String value1, String value2) {
            addCriterion("LAST_CHG_DT not between", value1, value2, "lastChgDt");
            return (Criteria) this;
        }

        public Criteria andLastChgUsrIsNull() {
            addCriterion("LAST_CHG_USR is null");
            return (Criteria) this;
        }

        public Criteria andLastChgUsrIsNotNull() {
            addCriterion("LAST_CHG_USR is not null");
            return (Criteria) this;
        }

        public Criteria andLastChgUsrEqualTo(String value) {
            addCriterion("LAST_CHG_USR =", value, "lastChgUsr");
            return (Criteria) this;
        }

        public Criteria andLastChgUsrNotEqualTo(String value) {
            addCriterion("LAST_CHG_USR <>", value, "lastChgUsr");
            return (Criteria) this;
        }

        public Criteria andLastChgUsrGreaterThan(String value) {
            addCriterion("LAST_CHG_USR >", value, "lastChgUsr");
            return (Criteria) this;
        }

        public Criteria andLastChgUsrGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_CHG_USR >=", value, "lastChgUsr");
            return (Criteria) this;
        }

        public Criteria andLastChgUsrLessThan(String value) {
            addCriterion("LAST_CHG_USR <", value, "lastChgUsr");
            return (Criteria) this;
        }

        public Criteria andLastChgUsrLessThanOrEqualTo(String value) {
            addCriterion("LAST_CHG_USR <=", value, "lastChgUsr");
            return (Criteria) this;
        }

        public Criteria andLastChgUsrLike(String value) {
            addCriterion("LAST_CHG_USR like", value, "lastChgUsr");
            return (Criteria) this;
        }

        public Criteria andLastChgUsrNotLike(String value) {
            addCriterion("LAST_CHG_USR not like", value, "lastChgUsr");
            return (Criteria) this;
        }

        public Criteria andLastChgUsrIn(List<String> values) {
            addCriterion("LAST_CHG_USR in", values, "lastChgUsr");
            return (Criteria) this;
        }

        public Criteria andLastChgUsrNotIn(List<String> values) {
            addCriterion("LAST_CHG_USR not in", values, "lastChgUsr");
            return (Criteria) this;
        }

        public Criteria andLastChgUsrBetween(String value1, String value2) {
            addCriterion("LAST_CHG_USR between", value1, value2, "lastChgUsr");
            return (Criteria) this;
        }

        public Criteria andLastChgUsrNotBetween(String value1, String value2) {
            addCriterion("LAST_CHG_USR not between", value1, value2, "lastChgUsr");
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