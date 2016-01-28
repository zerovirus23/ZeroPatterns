//=======================================================================
// FILE HtmlTag.java
// CREATION DATE: Jan 27, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.zero_patterns.design.structure.composite;

import java.util.List;

/**
 * This class represent the component part of a composite pattern
 * @author Hernán Tenjo
 * @version 1.0
*/
public abstract class HtmlTag {
	/**
	 * 
	 * @return
	 */
	public abstract String getTagName();
	
	/**
	 * 
	 * @param startTag
	 */
	public abstract void setStartTag(String startTag);
	
	/**
	 * 
	 * @param endTag
	 */
	public abstract void setEndTag(String endTag);
	
	/**
	 * 
	 */
	public void setTagBody(){
		throw new UnsupportedOperationException("Not implemented in the component");
	}
	
	/**
	 * 
	 */
	public void addChildTag(HtmlTag childTag){
		throw new UnsupportedOperationException("Not implemented in the component");
	}
	
	/**
	 * 
	 * @param childTag
	 */
	public void remoteChildTag(HtmlTag childTag){
		throw new UnsupportedOperationException("Not implemented in the component");
	}
	
	/**
	 * 
	 * @return
	 */
	public List<HtmlTag> getChildren(){
		throw new UnsupportedOperationException("Not implemented in the component");
	}
	
	/**
	 * 
	 */
	public abstract void generateHtml();
}

