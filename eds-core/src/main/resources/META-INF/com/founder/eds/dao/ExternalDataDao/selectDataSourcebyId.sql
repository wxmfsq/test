select * from data_source     
where delete_flag='0'
/*%if list != null && !list.isEmpty() */
and (
/*%for integer : list */
data_source_sn=/*integer*/''||''
/*%if integer_has_next */
/*# "or" */
/*%end*/
/*%end*/
)
/*%end*/