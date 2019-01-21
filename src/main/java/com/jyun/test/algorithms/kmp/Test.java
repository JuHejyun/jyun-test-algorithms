package com.jyun.test.algorithms.kmp;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {

		String[] oldimg = "time_local http_J_forwarded_for proxy_add_x_forwarded_for host status request bytes_sent request_time arg_g_tk cookie_visitkey upstream_addr upstream_status upstream_response_time http_referer http_user_agent sent_http_location".split(" ");
		String[] newimg = "remote_addr - remote_user time_local fwf http_x_forwarded_for tip http_true_client_ip upstream_addr upstream_response_time request_time http_host request status body_bytes_sent http_referer http_accept_language http_user_agent".split(" ");

		for (String o : newimg) {
			/*
			 * 筛选出两个数组中相同的值，>= 0 表示相同，< 0 表示不同 。
			 * 有相同值是返回元素的下标值。
			 * 此处采用的是 "二分搜索法来搜索指定数组"。
			 * */
			if(Arrays.binarySearch(oldimg, o) < 0){
				System.out.println(o);
			}
		}

	}

}
