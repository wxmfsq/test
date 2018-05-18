select d.service_definition_sn  serviceDefinitionSn,s.service_group_name serviceGroupName,
       d.service_group  serviceGroup,
       d.service_name  serviceName,
       count(distinct d.service_group) over()  serviceGroups,
       count(d.service_name) over(partition by d.service_group)  serviceNames
from service_definition d,dict_service_group s
where d.delete_flag = '0' 
and s.group_sn(+)=d.service_group
order by d.service_group ,d.service_definition_sn asc