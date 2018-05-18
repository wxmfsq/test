select sai.access_ip_sn accessIpSn, sai.access_ip accessIp, sai.update_count updateCount
  from system_access_ip sai
 where /*%if operFlag == 0*/sai.delete_flag = 0/*%end*/
 	   /*%if operFlag == 1*/sai.delete_flag = 1/*%end*/
   and ( /*%if accessIpSns != null && !accessIpSns.isEmpty()*/
 			sai.access_ip_sn in /*accessIpSns*/('123','234')
		  /*%end*/
 		  /*%if accessIpSns != null && !accessIpSns.isEmpty() && accessIps != null && !accessIps.isEmpty()*/
 			or
		  /*%end*/
 		  /*%if accessIps != null && !accessIps.isEmpty()*/
 			sai.access_ip in /*accessIps*/('123','234')
		  /*%end*/
 		  /*%if accessIp != null && accessIp.length() != 0*/
 			sai.access_ip like '%' || /*accessIp*/'' || '%'
		  /*%end*/
    	)
 order by sai.access_ip_sn
   