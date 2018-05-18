select sd.service_definition_sn serviceDefinitionSn,
       sd.service_name serviceName,
       sd.service_type serviceType,
       sd.service_url serviceUrl,
       sd.service_group serviceGroup,
       (select dsg.service_group_name from dict_service_group dsg where dsg.group_sn = sd.service_group and dsg.delete_flag = 0) serviceGroupName,
       sd.description description,
       sd.op_mode opMode,
       sd.data_encode dataEncode,
       sd.result_composit resultComposit,
       sd.data_source_sn dataSourceSn
  from service_definition sd
 where sd.delete_flag = 0
 order by sd.service_group