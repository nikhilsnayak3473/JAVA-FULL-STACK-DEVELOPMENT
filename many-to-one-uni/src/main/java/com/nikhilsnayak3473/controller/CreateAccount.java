package com.nikhilsnayak3473.controller;

import com.nikhilsnayak3473.dao.BankAccountDao;
import com.nikhilsnayak3473.dto.BankAccount;

public class CreateAccount {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		account.setBankName("HDFC");
		account.setBranch("blr");

		BankAccountDao bankAccountDao = new BankAccountDao();

		account = bankAccountDao.createAccount(1, account);

		if (account != null) {
			System.out.println("Account created");
		} else {
			System.out.println("Account not created");
		}

	}

}
