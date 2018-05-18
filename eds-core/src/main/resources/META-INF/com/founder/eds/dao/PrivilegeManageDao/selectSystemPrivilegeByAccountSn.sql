select sp.privilege_sn privilegeSn,
       sp.account_sn accountSn,
       sp.privilege_type privilegeType,
       sp.privilege_definition privilegeDefinition
  from system_privilege sp
 where sp.account_sn = /*accountSn*/''
   and sp.delete_flag = 0
