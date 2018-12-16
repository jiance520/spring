package com.entity;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @version 时间：2018年6月28日 下午8:59:28
 *
 */
public class TestEntity {
	private String str;//特殊字符
	private String testr;//特殊字符
	private Users user;//javaBean类型
	private List<String> list;
	private String[] array;
	private Map<String,String> map;
	private Set<String> set;
	private Properties props;//Properties配置文件类型
	private String emptyvalue;//注入空值""
	private String nullvalue;//注入null值。
	public void showvalue(){
		System.out.println("特殊str:"+str);
		System.out.println("特殊testr:"+testr);
		System.out.println("内部Bean user:"+user);
		System.out.println("list:"+list);
		System.out.println("string[0]:"+array[0]);
		System.out.println("map:"+map);
		System.out.println("set:"+set);
		System.out.println("props:"+props);
		System.out.println("空值emptyvalue:"+emptyvalue);
		System.out.println("nullvalue:"+nullvalue);
	}
	public TestEntity() {
		super();
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getTestr() {
		return testr;
	}
	public void setTestr(String testr) {
		this.testr = testr;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public String[] getArray() {
		return array;
	}
	public void setArray(String[] array) {
		this.array = array;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public String getEmptyvalue() {
		return emptyvalue;
	}
	public void setEmptyvalue(String emptyvalue) {
		this.emptyvalue = emptyvalue;
	}
	public String getNullvalue() {
		return nullvalue;
	}
	public void setNullvalue(String nullvalue) {
		this.nullvalue = nullvalue;
	}

}
