package pkuhit.xap.me;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseRelationModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "MEB04.AT01";
// 数据对象编码
public static final   String  OBJECT_CODE = "MEB04.AT02";
// 名称
public static final   String  NAME = "MEB04.AT03";
// 描述
public static final   String  DESCRIPTION = "MEB04.AT04";
// 英文简称
public static final   String  SHORT_ENGLISH_NAME_ = "MEB04.AT05";
// 英文名称
public static final   String  ENGLISH_NAME = "MEB04.AT06";
// 规则
public static final   String  RULE = "MEB04.AT07";


@Column(name="DATA_ACRU_CD") 
private  String code;

@Column(name="OBJ_CD") 
private  String objectCode;

@Column(name="NM") 
private  String name;

@Column(name="DES") 
private  String description;

@Column(name="SHT_NM_EN") 
private  String shortEnglishName;

@Column(name="NM_EN") 
private  String englishName;

@Column(name="RULE") 
private  String rule;
// 数据对象名称
private  String objectName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.objectCode;
 }

 {
  this.objectCode = objectCode;
 }

 {
     return this.name;
 }

 {
  this.name = name;
 }

 {
     return this.description;
 }

 {
  this.description = description;
 }

 {
     return this.shortEnglishName;
 }

 {
  this.shortEnglishName = shortEnglishName;
 }

 {
     return this.englishName;
 }

 {
  this.englishName = englishName;
 }

 {
     return this.rule;
 }

 {
  this.rule = rule;
 }

 {
     return this.objectName;
 }

 {
  this.objectName = objectName;
 }

