package pkuhit.xap.me;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseMasterModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "MEB06.AT01";
// 功能模板编码
public static final   String  TEMPLATE_CODE = "MEB06.AT02";
// 父功能编码
public static final   String  PARENT_CODE = "MEB06.AT03";
// 领域编码
public static final   String  DOMAIN_CODE = "MEB06.AT04";
// 根功能编码
public static final   String  ROOT_CODE = "MEB06.AT05";
// 版本号
public static final   String  VERSION_NO = "MEB06.AT06";
// 功能类型编码
public static final   String  TYPE_CODE = "MEB06.AT07";
// 名称
public static final   String  NAME = "MEB06.AT08";
// 描述
public static final   String  DESCRIPTION = "MEB06.AT09";
// 英文简称
public static final   String  SHORT_ENGLISH_NAME_ = "MEB06.AT10";
// 英文名称
public static final   String  ENGLISH_NAME = "MEB06.AT11";
// 菜单标志
public static final   String  MENU_FLAG = "MEB06.AT12";
// 菜单名称
public static final   String  MENU_NAME = "MEB06.AT13";


@Column(name="FU_CD") 
private  String code;

@Column(name="FUTPL_CD") 
private  String templateCode;

@Column(name="PAR_FU_CD") 
private  String parentCode;

@Column(name="DO_CD") 
private  String domainCode;

@Column(name="RT_FU_CD") 
private  String rootCode;

@Column(name="VER_NO") 
private  String versionNo;

@Column(name="FU_TP_CD") 
private  String typeCode;

@Column(name="NM") 
private  String name;

@Column(name="DES") 
private  String description;

@Column(name="SHT_NM_EN") 
private  String shortEnglishName;

@Column(name="NM_EN") 
private  String englishName;

@Column(name="MENU_F") 
private  Integer menuFlag;

@Column(name="MENU_NM") 
private  String menuName;
// 领域名称
private  String domainName;
// 功能类型名称
@DictionaryTag(code = "typeCode")
private  String typeName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.templateCode;
 }

 {
  this.templateCode = templateCode;
 }

 {
     return this.parentCode;
 }

 {
  this.parentCode = parentCode;
 }

 {
     return this.domainCode;
 }

 {
  this.domainCode = domainCode;
 }

 {
     return this.rootCode;
 }

 {
  this.rootCode = rootCode;
 }

 {
     return this.versionNo;
 }

 {
  this.versionNo = versionNo;
 }

 {
     return this.typeCode;
 }

 {
  this.typeCode = typeCode;
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
     return this.menuFlag;
 }

 {
  this.menuFlag = menuFlag;
 }

 {
     return this.menuName;
 }

 {
  this.menuName = menuName;
 }

 {
     return this.domainName;
 }

 {
  this.domainName = domainName;
 }

 {
     return this.typeName;
 }

 {
  this.typeName = typeName;
 }

