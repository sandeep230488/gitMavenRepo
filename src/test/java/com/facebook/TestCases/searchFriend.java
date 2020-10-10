package com.facebook.TestCases;

import org.testng.annotations.Test;

import com.facebook.pages.FriendsPage;

import junit.framework.Assert;

public class searchFriend extends BaseTest {
	
	

	@Test
	public void TC1()
	{
		System.out.println("in tet case");
		FriendsPage friendsPage=new FriendsPage(driver, details);
		friendsPage.createGroup(stData("Name"));
	
	}
}
