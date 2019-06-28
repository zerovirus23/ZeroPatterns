//=======================================================================
// FILE HtmlElement.java
// CREATION DATE: Jan 27, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.patterns.design.structure.composite;


/**
 * This class represent the leaf of the composite pattern
 * @author Hernán Tenjo
 * @version 1.0
*/
public class HtmlElement extends HtmlTag {
	private String name;
	private String start;
	private String end;
	private String body;
	
	/**
	 * 
	 * @param name
	 */
	public HtmlElement(String name) {
		this.name = name;
		this.start = "<" + name + ">";
		this.end = "</" + name + ">";
		this.body = "<h1>Some content</h1>";
	}
	
	/*
	 * (non-Javadoc)
	 * @see HtmlTag#getTagName()
	 */
	@Override
	public String getTagName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * @see HtmlTag#setStartTag(java.lang.String)
	 */
	@Override
	public void setStartTag(String startTag) {
		this.start = startTag;
	}

	/*
	 * (non-Javadoc)
	 * @see HtmlTag#setEndTag(java.lang.String)
	 */
	@Override
	public void setEndTag(String endTag) {
		this.end = endTag;
	}

	/*
	 * (non-Javadoc)
	 * @see HtmlTag#generateHtml()
	 */
	@Override
	public void generateHtml() {
		System.out.println(start + body + end);
	}	
}