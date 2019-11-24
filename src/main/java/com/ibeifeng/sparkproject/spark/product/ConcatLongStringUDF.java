package com.ibeifeng.sparkproject.spark.product;

import org.apache.spark.sql.api.java.UDF3;

/**
 * 将两个字段拼接起来（使用指定的分隔符）
 * @author Administrator
 *
 */
public class ConcatLongStringUDF implements UDF3<Long, String, String, String> {

	private static final long serialVersionUID = 1L;
	
	@Override
	public String call(Long v1, String v2, String split) throws Exception {
		return String.valueOf(v1) + split + v2;
	}

}
