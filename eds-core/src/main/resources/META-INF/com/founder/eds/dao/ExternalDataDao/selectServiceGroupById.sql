select * from dict_service_group     
where delete_flag='0'
/*%if list != null && !list.isEmpty() */
and (
/*%for integer : list */
group_sn=/*integer*/''||''
/*%if integer_has_next */
/*# "or" */
/*%end*/
/*%end*/
)
/*%end*/