select * from dict_service_group  where delete_flag='0'
/*%if  null !=dictServiceGroupDto.serviceGroupName && ! dictServiceGroupDto.serviceGroupName.isEmpty() */
and service_group_name like  '%' || /*dictServiceGroupDto.serviceGroupName*/'' || '%'
/*%end*/
/*%if  null !=dictServiceGroupDto.memo && ! dictServiceGroupDto.memo.isEmpty() */
and memo like  '%' || /*dictServiceGroupDto.memo*/'' || '%'
/*%end*/
/*%if  null !=dictServiceGroupDto.groupSn */ 
and group_sn=/*dictServiceGroupDto.groupSn*/''
/*%end*/