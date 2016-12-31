package pkuhit.xap.ac;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseRelationModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "XAPM17.AT01";
// 角色功能操作编码
public static final   String  ROLE_ACTION_CODE = "XAPM17.AT02";
// 访问规则编码
public static final   String  DATA_ACCESS_RULE_CODE = "XAPM17.AT03";


@Column(name="ROLE_ACRU_CD") 
private  String code;

@Column(name="ROLE_ACT_CD") 
private  String roleActionCode;

@Column(name="DATA_ACRU_CD") 
private  String dataAccessRuleCode;
// 角色功能操作名称
private  String roleActionName;
// 访问规则名称
private  String dataAccessRuleName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.roleActionCode;
 }

 {
  this.roleActionCode = roleActionCode;
 }

 {
     return this.dataAccessRuleCode;
 }

 {
  this.dataAccessRuleCode = dataAccessRuleCode;
 }

 {
     return this.roleActionName;
 }

 {
  this.roleActionName = roleActionName;
 }

 {
     return this.dataAccessRuleName;
 }

 {
  this.dataAccessRuleName = dataAccessRuleName;
 }

