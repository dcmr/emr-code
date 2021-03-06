Ext.define("iih.mr.model.DefectNoticeForm",{
	extend: 'Ext.data.Model',
	fields:[
		{name:"identNumber",type:"string"},
		{name:"patientNm",type:"string"},
		{name:"patientAge",type:"string"},
		{name:"noticeTime",type:"string"},
		{name:"qualityControl",type:"string"},
		{name:"businessAct",type:"string"},
		{name:"qualityControlDeptCd",type:"string"},
		{name:"receiveDeptCd",type:"string"},
		{name:"rectificatDeduction",type:"string"},
		{name:"rectificatTime",type:"string"},
		{name:"rectificatRequire",type:"string"}
	]
});