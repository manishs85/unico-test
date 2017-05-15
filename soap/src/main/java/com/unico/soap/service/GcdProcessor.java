package com.unico.soap.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.unico.common.Gcd;
import com.unico.common.Request;
import com.unico.persistence.GcdUtil;
import com.unico.persistence.RequestUtil;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class GcdProcessor {

	@WebMethod(operationName = "gcd")
	public int gcd() {
		Request request = RequestUtil.getOldestUnprocessedRequest();

		int gcdValue = gcd(request.getNum1(), request.getNum2());
		GcdUtil.save(new Gcd(gcdValue));
		RequestUtil.delete(request);
		return gcdValue;
	}

	@WebMethod(operationName = "gcdList")
	public Integer[] gcdList() {
		List<Integer> gcdList = new ArrayList<Integer>();

		for (Gcd gcd : GcdUtil.getAll()) {
			gcdList.add(gcd.getGcd());
		}
		return gcdList.toArray(new Integer[0]);
	}

	@WebMethod(operationName = "gcdSum")
	public int gcdSum() {
		int sum = 0;
		for (Gcd gcd : GcdUtil.getAll())
			sum += gcd.getGcd();
		return sum;
	}

	private int gcd(int x, int y) {
		return (y == 0) ? x : gcd(y, x % y);
	}
}
