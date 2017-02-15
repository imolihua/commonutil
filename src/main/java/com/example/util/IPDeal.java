/**
 * IP处理类
 */
package com.example.util;

/**
 * @author advance
 *
 */
import java.sql.*;

public class IPDeal {
	/**
	 * 把ip地址格式化为：000.000.000.000
	 * @param ip
	 * @return 返回规格ip
	 */
	public static String strfullip(String ip){
		StringBuffer buff = new StringBuffer();
		buff.append("");
		String strzero = "000";
		int ilen = 0;
		if(ip != null){
			String[] arrip = ip.split("\\.");
			if(arrip.length == 4){
				for(int i = 0; i < 4; i++){
					if (i==0){
						ilen = arrip[i].length();
						if(ilen < 3){
							buff.append(strzero.substring(0,3-ilen)).append(arrip[i]);
						}else{
							buff.append(arrip[i]);
						}
					}else{
						ilen = arrip[i].length();
						if(ilen < 3){
							buff.append(".").append(strzero.substring(0,3-ilen)).append(arrip[i]);
						}else{
							buff.append(".").append(arrip[i]);
						}
					}
				}
			}
		}
		return buff.toString();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String strip = "202.108.33.32";
		System.out.println(IPDeal.strfullip(strip));
	}

}
