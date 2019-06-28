//=======================================================================
// FILE PayUService.java
// CREATION DATE: Jan 22, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.patterns.design.structure.adapter;
//=======================================================================
//  REQUIRED LIBRARIES
//=======================================================================

//=======================================================================
//  CLASS PayuService.java
//=======================================================================
/**
 * Interface provided by PayU (Payment gateway) to consume it's services	
 * @author Hernán Tenjo
 * @version 
*/
public interface PayUService {
	public String getCreditCardNo();
	public String getCustomerName();
	public String getCardExpMonth();
	public String getCardExpYear();
	public Short getCardCVVNo();
	public Double getAmount();
	
	public void setCreditCardNo(String creditCardNo);
	public void setCustomerName(String customerName);
	public void setCardExpMonth(String cardExpMonth);
	public void setCardExpYear(String cardExpYear);
	public void setCardCVVNo(Short cardCVVNo);
	public void setAmount(Double amount);
}

