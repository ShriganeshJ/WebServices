package com.idfc.bo;

import java.time.LocalDate;

public class PolicyBo {

	private String policyNumber;
	private String endormsnetNumber;
	private String dcnNumber;
	private LocalDate date;
	private double premiumAmount;

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getEndormsnetNumber() {
		return endormsnetNumber;
	}

	public void setEndormsnetNumber(String endormsnetNumber) {
		this.endormsnetNumber = endormsnetNumber;
	}

	public String getDcnNumber() {
		return dcnNumber;
	}

	public void setDcnNumber(String dcnNumber) {
		this.dcnNumber = dcnNumber;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

}
