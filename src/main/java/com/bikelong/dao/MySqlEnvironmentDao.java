package com.bikelong.dao;

import java.util.HashMap;
import java.util.List;

import com.bikelong.mapper.EnvironmentMapper;
import com.bikelong.vo.Environment;

public class MySqlEnvironmentDao implements EnvironmentDao {
	
	private EnvironmentMapper environmentMapper;
	public void setEnvironmentMapper(EnvironmentMapper environmentMapper) {
		this.environmentMapper = environmentMapper;
	}
	@Override
	public List<Environment> selectEnvironmentListByRentalShopNo(int rentalshopNo, String start, String end) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("rentalshopNo", rentalshopNo);
		params.put("start", start);
		params.put("end", end);
		return environmentMapper.selectEnvironmentListByRentalShopNo(params);
	}
	@Override
	public void insertEnvironmentData(Environment environment) {
		environmentMapper.insertEnvironmentData(environment);
	}
	@Override
	public Environment selectEnvironmentByRentalShopNo(int rentalshopNo, String start, String end) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("rentalshopNo", rentalshopNo);
		params.put("start", start);
		params.put("end", end);
		return environmentMapper.selectEnvironmentByRentalShopNo(params);
	}

}
