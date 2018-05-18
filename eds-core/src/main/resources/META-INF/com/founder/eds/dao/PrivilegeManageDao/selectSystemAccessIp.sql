select sai.access_ip_sn accessIpSn, sai.access_ip accessIp, sai.update_count updateCount
  from system_access_ip sai
 where sai.delete_flag = 0
 order by sai.access_ip_sn