package com.nikhilsnayak3473.controller;

import com.nikhilsnayak3473.dao.MobileDao;

public class DeleteMobileSimBymId {
	public static void main(String[] args) {
		MobileDao dao = new MobileDao();

		boolean deleted = dao.deleteMobileSimBymId(4);

		if (deleted) {
			System.out.println("Mobile deleted successfully");
		} else {
			System.out.println("Could not find the mobile with specified id");
		}
	}

}
