package com.ibeifeng.sparkproject.dao;

import java.util.List;

import com.ibeifeng.sparkproject.domain.AdProvinceTop3;

/**
 * 各省份top3热门广告DAO接口
 * @author Administrator
 *
 */
public interface IAdProvinceTop3DAO {

	void updateBatch(List<AdProvinceTop3> adProvinceTop3s);
	
}
