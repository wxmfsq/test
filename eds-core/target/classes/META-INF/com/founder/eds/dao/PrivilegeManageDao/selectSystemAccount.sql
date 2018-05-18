select sa.account_sn accountSn, sa.user_id userId, 
	   sa.user_name userName, sa.job_category jobCategory
  from system_account sa
 where sa.delete_flag = 0
   and sa.job_category = '0'