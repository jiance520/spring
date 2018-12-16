package com.service.impl;

import com.service.IBox;
import com.service.IPaper;
import com.service.IPrint;

/**
 * @version 时间：2018年6月9日 上午10:13:47
 *
 */
public class Print implements IPrint{
	private IPaper paper;
	private IBox box;
	public Print() {
		super();
	}
	public Print(IPaper paper, IBox box) {
		super();
		this.paper = paper;
		this.box = box;
	}
	public IPaper getPaper() {
		return paper;
	}
	public void setPaper(IPaper paper) {
		this.paper = paper;
	}
	public IBox getBox() {
		return box;
	}
	public void setBox(IBox box) {
		this.box = box;
	}
	@Override
	public String toString() {
		return "Print [paper=" + paper + ", box=" + box + "]";
	}
	public void print(){
		box.color();
		paper.size();
		System.out.println("------------开始打印");
	}
}
