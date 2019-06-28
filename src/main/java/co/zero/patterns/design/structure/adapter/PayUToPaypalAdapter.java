//=======================================================================
// FILE PayUToPaypalAdapter.java
// CREATION DATE: Jan 22, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.patterns.design.structure.adapter;

/**
 * This class adapts the interface already implemented for PayU
 * to the required new service Paypal
 * @author Hernán Tenjo
 * @version 
*/
public class PayUToPaypalAdapter implements PaypalService {
	private static final String DATE_SEPARATOR = "/";
	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonthDate;
	private Integer cVVNo;
	private Double totalAmount;
	//This is the interface to adapt
	private PayUService payuService;
	
	/**
	 * Adapter constructor
	 * @param payuService Interface that should be adapted
	 */
	public PayUToPaypalAdapter(PayUService payuService) {
		this.payuService = payuService;
		adaptProperties();
	}
	
	/* (non-Javadoc)
	 * @see PaypalService#getCustCardNo()
	 */
	@Override
	public String getCustCardNo() {
		return custCardNo;
	}

	/* (non-Javadoc)
	 * @see PaypalService#getCardOwnerName()
	 */
	@Override
	public String getCardOwnerName() {
		return cardOwnerName;
	}

	/* (non-Javadoc)
	 * @see PaypalService#getCardExpMonthDate()
	 */
	@Override
	public String getCardExpMonthDate() {
		return cardExpMonthDate;
	}

	/* (non-Javadoc)
	 * @see PaypalService#getCVVNo()
	 */
	@Override
	public Integer getCVVNo() {
		return cVVNo;
	}

	/* (non-Javadoc)
	 * @see PaypalService#getTotalAmount()
	 */
	@Override
	public Double getTotalAmount() {
		return totalAmount;
	}

	/* (non-Javadoc)
	 * @see PaypalService#setCustCardNo(java.lang.String)
	 */
	@Override
	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;
	}

	/* (non-Javadoc)
	 * @see PaypalService#setCardOwnerName(java.lang.String)
	 */
	@Override
	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}

	/* (non-Javadoc)
	 * @see PaypalService#setCardExpMonthDate(java.lang.String)
	 */
	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.cardExpMonthDate = cardExpMonthDate;
	}

	/* (non-Javadoc)
	 * @see PaypalService#setCVVNo(java.lang.Integer)
	 */
	@Override
	public void setCVVNo(Integer cVVNo) {
		this.cVVNo = cVVNo;
	}

	/* (non-Javadoc)
	 * @see PaypalService#setTotalAmount(java.lang.Double)
	 */
	@Override
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	/**
	 * This method assign the required values by Paypal interface from PayU interface
	 */
	private void adaptProperties(){
		setCardOwnerName(payuService.getCustomerName());
		setCustCardNo(payuService.getCreditCardNo());
		setCardExpMonthDate(payuService.getCardExpMonth() + DATE_SEPARATOR + payuService.getCardExpYear());
		setCVVNo(payuService.getCardCVVNo().intValue());
		setTotalAmount(payuService.getAmount());
	}
}

