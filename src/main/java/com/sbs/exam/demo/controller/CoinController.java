package com.sbs.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoinController {
	@RequestMapping("/")
	public String coinMain() {
		return "usr/coin/coinmain";
	}
	@RequestMapping("/usr/coin/coinmain")
	public String coinMainRoot() {
		return "usr/coin/coinmain";
	}
	@RequestMapping("/usr/coin/binance.do")
	public String binance() {
		return "usr/coin/binance";
	}
	@RequestMapping("/usr/coin/bitmex.do")
	public String bitmex() {
		return "usr/coin/bitmex";
	}
	@RequestMapping("/usr/coin/bybit.do")
	public String bybit() {
		return "usr/coin/bybit";
	}
	@RequestMapping("usr/coin/moonxbt.do")
	public String moonxbt() {
		return "usr/coin/moonxbt";
	}

}
