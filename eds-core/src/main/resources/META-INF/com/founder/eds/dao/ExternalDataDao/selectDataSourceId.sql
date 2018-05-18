select data_source_sn dataSourceSn,connection_name connectionName,
database_type databaseType,connection_url  connectionUrl,"user",
password  passWord from data_source  
where delete_flag='0'
and data_source_sn=/*dataSourceSn*/''