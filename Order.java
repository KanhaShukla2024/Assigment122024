package com.example.model;

import java.util.List;

public class Order {
	
	private String recordId;
	private String taskId;
	private int partsPrice;
	private int labourPrice;
	private int amount;
	private String status;
	private List<String> reviewSummary;
	private String createdBy;
	private String updatedBy;
	
	public Order(String recordId, String taskId, int partsPrice, int labourPrice, int amount, String status,
			List<String> reviewSummary, String createdBy, String updatedBy) {
		super();
		this.recordId = recordId;
		this.taskId = taskId;
		this.partsPrice = partsPrice;
		this.labourPrice = labourPrice;
		this.amount = amount;
		this.status = status;
		this.reviewSummary = reviewSummary;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public int getPartsPrice() {
		return partsPrice;
	}

	public void setPartsPrice(int partsPrice) {
		this.partsPrice = partsPrice;
	}

	public int getLabourPrice() {
		return labourPrice;
	}

	public void setLabourPrice(int labourPrice) {
		this.labourPrice = labourPrice;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getReviewSummary() {
		return reviewSummary;
	}

	public void setReviewSummary(List<String> reviewSummary) {
		this.reviewSummary = reviewSummary;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "Order [recordId=" + recordId + ", taskId=" + taskId + ", partsPrice=" + partsPrice + ", labourPrice="
				+ labourPrice + ", amount=" + amount + ", status=" + status + ", reviewSummary=" + reviewSummary
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}
}
