package com.jason.dao;

import java.util.Date;

public class Emp {
    private Integer EMPNO;
    private String ENAME;
    private String JOB;
    private Integer MGR;
    private Date HIREDATE;
    private double SAL;
    private double COMM;
    private Integer DEPTNO;

    public Integer getEMPNO() {
        return EMPNO;
    }

    public void setEMPNO(Integer EMPNO) {
        this.EMPNO = EMPNO;
    }

    public String getENAME() {
        return ENAME;
    }

    public void setENAME(String ENAME) {
        this.ENAME = ENAME;
    }

    public String getJOB() {
        return JOB;
    }

    public void setJOB(String JOB) {
        this.JOB = JOB;
    }

    public Integer getMGR() {
        return MGR;
    }

    public void setMGR(Integer MGR) {
        this.MGR = MGR;
    }

    public Date getHIREDATE() {
        return HIREDATE;

    }

    public void setHIREDATE(Date HIREDATE) {
        this.HIREDATE = HIREDATE;
    }

    public double getSAL() {
        return SAL;
    }

    public void setSAL(double SAL) {
        this.SAL = SAL;
    }

    public double getCOMM() {
        return COMM;
    }

    public void setCOMM(double COMM) {
        this.COMM = COMM;
    }

    public Integer getDEPTNO() {
        return DEPTNO;
    }

    public void setDEPTNO(Integer DEPTNO) {
        this.DEPTNO = DEPTNO;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "EMPNO=" + EMPNO +
                ", ENAME='" + ENAME + '\'' +
                ", JOB='" + JOB + '\'' +
                ", MGR=" + MGR +
                ", HIREDATE=" + HIREDATE +
                ", SAL=" + SAL +
                ", COMM=" + COMM +
                ", DEPTNO=" + DEPTNO +
                '}';
    }
}
