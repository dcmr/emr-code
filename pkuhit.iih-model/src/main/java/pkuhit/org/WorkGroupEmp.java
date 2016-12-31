package pkuhit.org;

import xap.model.BaseRelationModel;








public static final   String  CODE = "ORGB05.AT01";
// 人员ID
public static final   String  EMPLOYEE_ID = "ORGB05.AT02";
// 工作组编码
public static final   String  WORK_GROUP_CODE = "ORGB05.AT03";
// 业务角色编码
public static final   String  BIZ_ROLE_CODE = "ORGB05.AT04";


@Column(name="WG_EMP_CD") 
private  String code;

@Column(name="EMP_ID") 
private  String employeeId;

@Column(name="WG_CD") 
private  String workGroupCode;

@Column(name="BIZ_ROLE_CD") 
private  String bizRoleCode;

// 业务审签等级编码
private String signLvlCd;

// 人员名称
private  String employeeName;
// 工作组名称
private  String workGroupName;
// 业务角色名称
private  String bizRoleName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.employeeId;
 }

 {
  this.employeeId = employeeId;
 }

 {
     return this.workGroupCode;
 }

 {
  this.workGroupCode = workGroupCode;
 }

 {
     return this.bizRoleCode;
 }

 {
  this.bizRoleCode = bizRoleCode;
 }

 {
     return this.employeeName;
 }

 {
  this.employeeName = employeeName;
 }

 {
     return this.workGroupName;
 }

 {
  this.workGroupName = workGroupName;
 }

 {
     return this.bizRoleName;
 }

 {
  this.bizRoleName = bizRoleName;
 }

/**
 * @return the signLvlCd
 */
public String getSignLvlCd() {
	return signLvlCd;
}

/**
 * @param signLvlCd the signLvlCd to set
 */
public void setSignLvlCd(String signLvlCd) {
	this.signLvlCd = signLvlCd;
}
}