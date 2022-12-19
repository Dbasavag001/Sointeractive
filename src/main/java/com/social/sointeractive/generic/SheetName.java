package com.social.sointeractive.generic;

public enum SheetName {
	HOMEMODULE("HomeModule");


	private String sheetName;

	private SheetName (String sheetName) {
		this.sheetName=sheetName;

	}
	public String convertToString() {
		return sheetName.toString();
	}
}
