select service_definition_sn,data_source_sn,service_name,service_type,service_url,service_group 
from dict_service_group d, service_definition s 
where d.delete_flag='0'
and d.group_sn=s.service_group
and s.delete_flag='0'
/*%if list != null && !list.isEmpty() */
and (
/*%for integer : list */
d.group_sn=/*integer*/''||''
/*%if integer_has_next */
/*# "or" */
/*%end*/
/*%end*/
)
/*%end*/