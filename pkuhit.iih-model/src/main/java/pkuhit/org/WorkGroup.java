package pkuhit.org;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseMasterModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "ORGB03.AT01";
// 工作组类型编码
public static final   String  TYPE_CODE = "ORGB03.AT02";


@Column(name="WG_CD") 
private  String code;

@Column(name="WG_TP_CD") 
private  String typeCode;
// 工作组类型名称
@DictionaryTag(code = "typeCode")
private  String typeName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.typeCode;
 }

 {
  this.typeCode = typeCode;
 }

 {
     return this.typeName;
 }

 {
  this.typeName = typeName;
 }

