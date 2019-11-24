package com.ibeifeng.sparkproject.spark.product;

import org.apache.spark.sql.api.java.UDF2;

import com.alibaba.fastjson.JSONObject;

/**
 * get_json_object()
 * 
 * 技术点：自定义UDF函数
 * 
 * @author Administrator
 *
 */
public class GetJsonObjectUDF implements UDF2<String, String, String> {

	private static final long serialVersionUID = 1L;

	@Override
	public String call(String json, String field) throws Exception {
		try {
			JSONObject jsonObject = JSONObject.parseObject(json);
			return jsonObject.getString(field);
		} catch (Exception e) {
			e.printStackTrace();  
		}
		return null;
	}

}
