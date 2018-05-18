SELECT a.cs_code csCode,
       a.cs_name csName,
       b.cv_id cvId,
       b.cv_code cvCode,
       b.cv_value cvValue,
       b.py_code pyCode,
       b.seq_no seqNo
  FROM code_system a, code_value b       
 WHERE a.cs_id = b.cs_id and a.delete_flag = 0 and b.delete_flag = 0
