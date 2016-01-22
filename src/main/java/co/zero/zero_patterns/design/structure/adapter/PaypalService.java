//=======================================================================
// FILE PaypalService.java
// CREATION DATE: Jan 22, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.zero_patterns.design.structure.adapter;
//=======================================================================
//  REQUIRED LIBRARIES
//=======================================================================

//=======================================================================
//  CLASS PaypalService.java
//=======================================================================
/**
 * Interface provided by Paypal (Payment gateway) to consume it's services
 * @author Hernán Tenjo
 * @version 
*/
public interface PaypalService {
	public String getCustCardNo();
	public String getCardOwnerName();
	public String getCardExpMonthDate();
	public Integer getCVVNo();
	public Double getTotalAmount();
	
	public void setCustCardNo(String custCardNo);
	public void setCardOwnerName(String cardOwnerName);
	public void setCardExpMonthDate(String cardExpMonthDate);
	public void setCVVNo(Integer cVVNo);
	public void setTotalAmount(Double totalAmount);
}

