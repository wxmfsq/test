update system_access_ip sai
   set sai.access_ip = /*systemAccessIp.accessIp*/'12',
       sai.update_time = /*systemAccessIp.updateTime*/'',
       sai.update_count = /*systemAccessIp.updateCount*/12 + 1
 where sai.access_ip_sn = /*systemAccessIp.accessIpSn*/'123'
   and sai.update_count = /*systemAccessIp.updateCount*/12