//=======================================================================
// FILE TestPattern.java
// CREATION DATE: Jan 22, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.zero_patterns.design.structure.adapter;

/**
 * This class expose how to use the pattern in a concrete example
 * @author Hernán Tenjo
 * @version 1.0
 */
public class TestPattern {
	/**
	 * Main mathod that execute the example
	 * @param args
	 */
	public static void main(String[] args) {
		PayUService payUService = buildPayUService();
		PaypalService paypalService = new PayUToPaypalAdapter(payUService);
		printPaypalInfo(paypalService);
		printPayUInfo(payUService);
	}
	
	/**
	 * Builds an instance of {@link PayUService}
	 * @return {@link PayUService} instance to test 
	 */
	private static PayUService buildPayUService(){
		PayUService service = new PayUServiceImpl();
		service.setAmount(100.0);
		service.setCardCVVNo((short)112);
		service.setCardExpMonth("01");
		service.setCardExpYear("2015");
		service.setCreditCardNo("XXX-YYYY-ZZZ-WWW");
		service.setCustomerName("John Dow");
		return service;
	}
	
	/**
	 * Print the information from a {@link PaypalService} interface
	 * @param paypalService
	 */
	private static void printPaypalInfo(PaypalService paypalService) {
		System.out.println("============ PayPal INFO ==========");
		System.out.println(paypalService.getCardOwnerName());
		System.out.println(paypalService.getCustCardNo());
		System.out.println(paypalService.getCardExpMonthDate());
		System.out.println(paypalService.getCVVNo());
		System.out.println(paypalService.getTotalAmount());
	}
	
	/**
	 * Print the information from a {@link PayUService} interface
	 * @param payUService
	 */
	private static void printPayUInfo(PayUService payUService){
		System.out.println("============ PayU INFO ==========");
		System.out.println(payUService.getCustomerName());
		System.out.println(payUService.getCreditCardNo());
		System.out.println(payUService.getCardExpYear());
		System.out.println(payUService.getCardExpMonth());
		System.out.println(payUService.getCardCVVNo());
		System.out.println(payUService.getAmount());
	}
}
