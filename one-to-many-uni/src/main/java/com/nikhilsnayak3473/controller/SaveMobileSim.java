package com.nikhilsnayak3473.controller;

import java.util.ArrayList;
import java.util.List;

import com.nikhilsnayak3473.dao.MobileDao;
import com.nikhilsnayak3473.dto.Mobile;
import com.nikhilsnayak3473.dto.Sim;

public class SaveMobileSim {
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.setName("i Phone 14 pro");
		mobile.setBrand("Apple");
		mobile.setPrice(110000);
		Sim sim1 = new Sim();
		sim1.setProvider("Airtel");
		sim1.setGeneration("4G");

		Sim sim2 = new Sim();
		sim2.setProvider("Jio");
		sim2.setGeneration("5G");

		List<Sim> sims = new ArrayList<Sim>();

		sims.add(sim1);
		sims.add(sim2);

		mobile.setSims(sims);

		MobileDao dao = new MobileDao();

		mobile = dao.saveMobileSim(mobile);

		if (mobile != null) {
			System.out.println("Mobile saved sucessfully");

		} else {
			System.out.println("Error occured mobile not saved");
		}

	}

}
