select t.data_group_name_en  dataGroupName,r.result_sn  resultSn,r.service_definition_sn serviceDefinitionSn,
r.data_group_name_en  dataGroupNameEn,r.data_group_name_cn  dataGroupNameCn,
r.min_times  minTimes,r.max_times maxTimes,r.parent_sn paraentSn,r.sql_text sqlText,r.data_group_no dataGroupNo
from result_param r , result_param t   
where r.parent_sn=t.result_sn(+)
and r.delete_flag='0'
and t.delete_flag(+) ='0'
and r.service_definition_sn=/*key*/''
order by dataGroupNo asc