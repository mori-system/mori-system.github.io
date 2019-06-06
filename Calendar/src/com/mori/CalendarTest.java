package com.mori;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalendarTest {
	/*
	*	author : choi seok cheol
	*/

	@Test
	public void testIsLeapYear() {
		
		/* =================================================
		 * 閏年計算テスト
		   =================================================*/
		// 閏年の場合はtrue
		assertEquals(Calendar.IsLeapYear(1600), true);
		assertEquals(Calendar.IsLeapYear(2000), true);
		assertEquals(Calendar.IsLeapYear(2400), true);
		assertEquals(Calendar.IsLeapYear(1988), true);
		assertEquals(Calendar.IsLeapYear(1996), true);
		assertEquals(Calendar.IsLeapYear(2020), true);
		

		// 閏年ではなくて、平年の場合はfalse
		assertEquals(Calendar.IsLeapYear(2017), false);
		assertEquals(Calendar.IsLeapYear(2018), false);
		assertEquals(Calendar.IsLeapYear(2019), false);
		assertEquals(Calendar.IsLeapYear(1700), false);
		assertEquals(Calendar.IsLeapYear(2100), false);
		assertEquals(Calendar.IsLeapYear(2200), false);
		
		
		/* =================================================
		 * 日数計算テスト
		   =================================================*/
		// 年度と月を入力するとその年月「日」に対する日数が出る
		// ↓ 例 1600年度 12月は 31日まであるという意味
		assertEquals(31, Calendar.GetDaysInMonth(1600, 12));
		
		assertEquals(29, Calendar.GetDaysInMonth(1996, 2));
		assertEquals(30, Calendar.GetDaysInMonth(1999, 4));
		assertEquals(30, Calendar.GetDaysInMonth(1999, 6));
		assertEquals(30, Calendar.GetDaysInMonth(1999, 9));
		assertEquals(30, Calendar.GetDaysInMonth(1999, 11));
		assertEquals(28, Calendar.GetDaysInMonth(2019, 2));
		assertEquals(31, Calendar.GetDaysInMonth(1996, 8));
		
		assertEquals(-1, Calendar.GetDaysInMonth(10000, 9));
		assertEquals(-1, Calendar.GetDaysInMonth(1996, 0));
		assertEquals(-1, Calendar.GetDaysInMonth(1996, 13));
		assertEquals(-1, Calendar.GetDaysInMonth(Integer.parseInt("10000"), 13));
		
	}

}
