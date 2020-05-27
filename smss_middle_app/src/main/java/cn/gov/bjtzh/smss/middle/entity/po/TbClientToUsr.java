package cn.gov.bjtzh.smss.middle.entity.po;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "TB_CLIENT_TO_USR")
public class TbClientToUsr implements Serializable {
    @Id
    @Column(name = "USR_SEQ")
    private Double usrSeq;

    @Id
    @Column(name = "USR_ID")
    private String usrId;

    @Column(name = "USR_NAME")
    private String usrName;

    @Column(name = "TOKEN")
    private String token;

    @Column(name = "USR_LOGIN_STS")
    private String usrLoginSts;

    @Column(name = "AGENT_CODE")
    private String agentCode;

    @Column(name = "USR_RMK")
    private String usrRmk;

    @Column(name = "CRT_DT")
    private String crtDt;

    @Column(name = "CRT_USR")
    private String crtUsr;

    @Column(name = "LAST_CHG_DT")
    private String lastChgDt;

    @Column(name = "LAST_CHG_USR")
    private String lastChgUsr;

    private static final long serialVersionUID = 1L;

    /**
     * @return USR_SEQ
     */
    public Double getUsrSeq() {
        return usrSeq;
    }

    /**
     * @param usrSeq
     */
    public void setUsrSeq(Double usrSeq) {
        this.usrSeq = usrSeq;
    }

    /**
     * @return USR_ID
     */
    public String getUsrId() {
        return usrId;
    }

    /**
     * @param usrId
     */
    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    /**
     * @return USR_NAME
     */
    public String getUsrName() {
        return usrName;
    }

    /**
     * @param usrName
     */
    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    /**
     * @return TOKEN
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return USR_LOGIN_STS
     */
    public String getUsrLoginSts() {
        return usrLoginSts;
    }

    /**
     * @param usrLoginSts
     */
    public void setUsrLoginSts(String usrLoginSts) {
        this.usrLoginSts = usrLoginSts;
    }

    /**
     * @return AGENT_CODE
     */
    public String getAgentCode() {
        return agentCode;
    }

    /**
     * @param agentCode
     */
    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    /**
     * @return USR_RMK
     */
    public String getUsrRmk() {
        return usrRmk;
    }

    /**
     * @param usrRmk
     */
    public void setUsrRmk(String usrRmk) {
        this.usrRmk = usrRmk;
    }

    /**
     * @return CRT_DT
     */
    public String getCrtDt() {
        return crtDt;
    }

    /**
     * @param crtDt
     */
    public void setCrtDt(String crtDt) {
        this.crtDt = crtDt;
    }

    /**
     * @return CRT_USR
     */
    public String getCrtUsr() {
        return crtUsr;
    }

    /**
     * @param crtUsr
     */
    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    /**
     * @return LAST_CHG_DT
     */
    public String getLastChgDt() {
        return lastChgDt;
    }

    /**
     * @param lastChgDt
     */
    public void setLastChgDt(String lastChgDt) {
        this.lastChgDt = lastChgDt;
    }

    /**
     * @return LAST_CHG_USR
     */
    public String getLastChgUsr() {
        return lastChgUsr;
    }

    /**
     * @param lastChgUsr
     */
    public void setLastChgUsr(String lastChgUsr) {
        this.lastChgUsr = lastChgUsr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", usrSeq=").append(usrSeq);
        sb.append(", usrId=").append(usrId);
        sb.append(", usrName=").append(usrName);
        sb.append(", token=").append(token);
        sb.append(", usrLoginSts=").append(usrLoginSts);
        sb.append(", agentCode=").append(agentCode);
        sb.append(", usrRmk=").append(usrRmk);
        sb.append(", crtDt=").append(crtDt);
        sb.append(", crtUsr=").append(crtUsr);
        sb.append(", lastChgDt=").append(lastChgDt);
        sb.append(", lastChgUsr=").append(lastChgUsr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}