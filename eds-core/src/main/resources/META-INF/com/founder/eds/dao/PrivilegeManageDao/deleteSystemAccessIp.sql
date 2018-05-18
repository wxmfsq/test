update system_access_ip sai
   set sai.delete_flag = '1',
       sai.delete_time = /*systemAccessIp.deleteTime*/'',
       sai.update_count = /*systemAccessIp.updateCount*/12 + 1
 where sai.access_ip_sn = /*systemAccessIp.accessIpSn*/123
   and sai.update_count = /*systemAccessIp.updateCount*/12