select
  EXTER_INTERF_CD,
  NM,
  URL,
  METHOD,
  DEFAULTPARAM,
  PARAM,
  MEMO,
  SORT_NO,
  SPELL_NO,
  WUBI_NO,
  UPD_CNT,
  CRT_TIME,
  CRT_USER_ID,
  CRT_DEPT_CD,
  LAST_UPD_TIME,
  LAST_UPD_DEPT_CD,
  LAST_UPD_USER_ID,
  DEL_F
from
  XAP_EXTER_INTERF
where
 del_f = 0
