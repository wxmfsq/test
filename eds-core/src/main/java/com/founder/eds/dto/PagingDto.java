package com.founder.eds.dto;

public class PagingDto {

	public Integer currentPage;
	public Integer totalSize;
	public Integer totalPage;
	public Integer jumpToPage;

	// datatables服务器端分页，排序相关
	public Integer displayStart;
	public Integer displayLength;
	public String sEcho;
	public Integer index;
	public String sortFieldName;
	public String sort;

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getJumpToPage() {
		return jumpToPage;
	}

	public void setJumpToPage(Integer jumpToPage) {
		this.jumpToPage = jumpToPage;
	}

	public Integer getDisplayStart() {
		return displayStart;
	}

	public void setDisplayStart(Integer displayStart) {
		this.displayStart = displayStart;
	}

	public Integer getDisplayLength() {
		return displayLength;
	}

	public void setDisplayLength(Integer displayLength) {
		this.displayLength = displayLength;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getSortFieldName() {
		return sortFieldName;
	}

	public void setSortFieldName(String sortFieldName) {
		this.sortFieldName = sortFieldName;
	}

	public String getsEcho() {
		return sEcho;
	}

	public void setsEcho(String sEcho) {
		this.sEcho = sEcho;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

}
