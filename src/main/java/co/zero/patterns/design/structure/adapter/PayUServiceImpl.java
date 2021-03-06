//=======================================================================
// FILE PayUServiceImpl.java
// CREATION DATE: Jan 22, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.patterns.design.structure.adapter;
//=======================================================================
//  REQUIRED LIBRARIES
//=======================================================================

//=======================================================================
//  CLASS PayUServiceImpl.java
//=======================================================================
/**
 * Class description
 * @author Hernán Tenjo
 * @version 
*/
public class PayUServiceImpl implements PayUService{
	private String creditCardNo;
	private String customerName;
	private String cardExpMonth;
	private String cardExpYear;
	private Short cardCVVNo;
	private Double amount;
	
	/* (non-Javadoc)
	 * @see PayUService#getCreditCardNo()
	 */
	@Override
	public String getCreditCardNo() {
		return creditCardNo;
	}
	
	/* (non-Javadoc)
	 * @see PayUService#getCustomerName()
	 */
	@Override
	public String getCustomerName() {
		return customerName;
	}
	
	/* (non-Javadoc)
	 * @see PayUService#getCardExpMonth()
	 */
	@Override
	public String getCardExpMonth() {
		return cardExpMonth;
	}
	
	/* (non-Javadoc)
	 * @see PayUService#getCardExpYear()
	 */
	@Override
	public String getCardExpYear() {
		return cardExpYear;
	}
	
	/* (non-Javadoc)
	 * @see PayUService#getCardCVVNo()
	 */
	@Override
	public Short getCardCVVNo() {
		return cardCVVNo;
	}
	
	/* (non-Javadoc)
	 * @see PayUService#getAmount()
	 */
	@Override
	public Double getAmount() {
		return amount;
	}
	
	/* (non-Javadoc)
	 * @see PayUService#setCreditCardNo(java.lang.String)
	 */
	@Override
	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	
	/* (non-Javadoc)
	 * @see PayUService#setCustomerName(java.lang.String)
	 */
	@Override
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	/* (non-Javadoc)
	 * @see PayUService#setCardExpMonth(java.lang.String)
	 */
	@Override
	public void setCardExpMonth(String cardExpMonth) {
		this.cardExpMonth = cardExpMonth;
	}
	
	/* (non-Javadoc)
	 * @see PayUService#setCardExpYear(java.lang.String)
	 */
	@Override
	public void setCardExpYear(String cardExpYear) {
		this.cardExpYear = cardExpYear;
	}
	
	/* (non-Javadoc)
	 * @see PayUService#setCardCVVNo(java.lang.Short)
	 */
	@Override
	public void setCardCVVNo(Short cardCVVNo) {
		this.cardCVVNo = cardCVVNo;
	}
	
	/* (non-Javadoc)
	 * @see PayUService#setAmount(java.lang.Double)
	 */
	@Override
	public void setAmount(Double amount) {
		this.amount = amount;
	}
}

