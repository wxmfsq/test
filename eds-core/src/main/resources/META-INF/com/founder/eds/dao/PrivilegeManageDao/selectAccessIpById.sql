select sai.access_ip accessIp
  from system_access_ip sai
 where sai.delete_flag = 0
   and (
 		  /*%if accessIps != null && !accessIps.isEmpty()*/
 			sai.access_ip in /*accessIps*/('123','234')
		  /*%end*/
    	)
 order by sai.access_ip_sn