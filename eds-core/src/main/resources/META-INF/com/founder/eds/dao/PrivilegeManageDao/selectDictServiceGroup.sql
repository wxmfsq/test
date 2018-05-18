select dsg.group_sn groupSn,
       dsg.service_group_name serviceGroupName,
       dsg.memo memo
  from dict_service_group dsg
 where dsg.delete_flag = 0