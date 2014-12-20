package com.br.utils.commons;

import java.util.List;

public class Page {
	//总页数
	private int totalPageCount=1;
	//页面大小，即每页显示记录数
	private int pageSize=0;
	//记录总数
	private int totalCount=0;
	//当前页号
	private int currPageNo=1;
	
	
	private List<Object> pageList; 
	
	public List<Object> getPageList() {
		return pageList;
	}
	public void setPageList(List<Object> pageList) {
		this.pageList = pageList;
	}
	public int getCurrPageNo() {
		if(totalPageCount==0)
			return 0;
		return currPageNo;
	}
	public void setCurrPageNo(int currPageNo) {
		if(this.currPageNo>0)
			this.currPageNo = currPageNo;
	}
	public int getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(int totalPageCount) {
			this.totalPageCount = totalPageCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		if(pageSize>0)
			this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		if(totalCount>0){
			this.totalCount = totalCount;
			//计算总页数
			totalPageCount=this.totalCount%pageSize==0?(this.totalCount/pageSize):
				this.totalCount/pageSize+1;
		}
	}
}
