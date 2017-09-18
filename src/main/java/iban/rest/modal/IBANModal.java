package iban.rest.modal;

//import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class IBANModal {

	private String iban;
	private boolean valid;
	
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	
	}	

	public boolean getValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	
	}
}
