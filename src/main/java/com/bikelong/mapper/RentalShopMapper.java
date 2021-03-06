package com.bikelong.mapper;

import java.util.HashMap;
import java.util.List;

import com.bikelong.vo.Bike;
import com.bikelong.vo.RentalShop;

public interface RentalShopMapper {

	List<RentalShop> selectRentalShop();

	List<RentalShop> searchRentalShop(HashMap<String, Object> params);

	List<RentalShop> selectMobileRentalShop();

	List<Bike> selectMobileBike(int rentalShopNo);

	List<RentalShop> selectMobileSearch(String mSearch);

	void updateBike(HashMap<String, Object> params);

	void updateRentalShop(HashMap<String, Object> params);

}
