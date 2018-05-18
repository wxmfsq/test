select
  user_id userId,
  user_name userName,
  passwd password,
  job_category  jobCategory
from
  system_account
where
  and user_id = /* userId */''
  and delete_flag = '0'