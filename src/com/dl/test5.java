package com.dl;



/**
 * @version 时间：2018年6月11日 上午9:43:50
 *
 */
public class test5 {
public static void main(String[] args) {
	Boss boss = new Boss();
	Radio rd = new Radio(boss);
	Emp e2 = new Emp();
	e2.listen(rd);
	}
}
