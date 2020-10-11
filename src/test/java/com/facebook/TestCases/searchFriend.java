package com.facebook.TestCases;

import org.testng.annotations.Test;

import com.facebook.pages.FriendsPage;



public class searchFriend extends BaseTest {
	
	

	@Test
	public void TC1()
	{
		System.out.println("in tet case");
		FriendsPage friendsPage=new FriendsPage(driver, details);
		friendsPage.createGroup(stData("Name"));		
		System.out.println("end tet case");
		System.out.println("end tet case2");
	}
}
