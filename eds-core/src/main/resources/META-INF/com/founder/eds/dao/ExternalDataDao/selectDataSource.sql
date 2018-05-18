select d.data_source_sn dataSourceSn,d.connection_name connectionName,d.database_type databaseType,d.connection_url  connectionUrl,"user" ,
d.password  passWord  from  data_source d where d.delete_flag='0' 
/*%if  null !=cond.connectionName && ! cond.connectionName.isEmpty() */
and d.connection_name like  '%' || /*cond.connectionName*/'' || '%'
/*%end*/
/*%if  null !=cond.databaseType && ! cond.databaseType.isEmpty() */
and d.database_type like  '%' || /*cond.databaseType*/'' || '%'
/*%end*/
/*%if  null !=cond.connectionUrl && ! cond.connectionUrl.isEmpty() */
and d.connection_url like  '%' || /*cond.connectionUrl*/'' || '%'
/*%end*/
/*%if  null !=cond.user && ! cond.user.isEmpty() */
and "user" like  '%' || /*cond.user*/'' || '%'
/*%end*/
/*%if  null !=cond.passWord && ! cond.passWord.isEmpty() */
and d.password like  '%' || /*cond.passWord*/'' || '%'
/*%end*/
order by d.connection_name asc