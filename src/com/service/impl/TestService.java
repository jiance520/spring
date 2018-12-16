package com.service.impl;

import com.entity.Mapper;

/**
 * @version 时间：2018年6月29日 上午11:20:39
 *
 */
public class TestService {
	private Mapper mapper;

	public TestService() {
		super();
	}

	public TestService(Mapper mapper) {
		super();
		this.mapper = mapper;
	}

	public Mapper getMapper() {
		return mapper;
	}

	public void setMapper(Mapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public String toString() {
		return "TestService [mapper=" + mapper + "]";
	}
	
}
