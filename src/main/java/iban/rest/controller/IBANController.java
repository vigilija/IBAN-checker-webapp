package iban.rest.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import iban.rest.modal.IBANModal;


@Path("/api")
public class IBANController {
	
	@GET
	@Path("/iban-check/{enteredIBAN}")
	@Produces(value={MediaType.APPLICATION_JSON,MediaType.APPLICATION_JSON})
	public IBANModal getIBANInfo(@PathParam("enteredIBAN") String enteredIBAN){
		
		IBANModal ibanModal = new IBANModal();
		CheckIBAN checkIBAN = new CheckIBAN ();
		ibanModal.setIban(enteredIBAN);
		ibanModal.setValid(checkIBAN.ibanTest(enteredIBAN));
		return  ibanModal;
	}
	
}
