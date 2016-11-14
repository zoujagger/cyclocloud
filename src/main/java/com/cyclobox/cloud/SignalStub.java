/**
 * 
 */
package com.cyclobox.cloud;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * @author zouj
 *
 */
@Path("/signal")
public class SignalStub {


	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public SignalService getSignal(){
		SignalService s = new SignalService(0,1,1);		
		return s;
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response postSignal(SignalService ss){
		
		/*ObjectMapper mapper = new ObjectMapper(); // create once, reuse
		ss = mapper.readValue(new URL("http://some.com/api/entry.json"), 
	    		SignalService.class);*/

		
		System.out.println(ss.getFrequence()+" "+ss.getRms());
		return Response.status(201).entity(ss).build();
		
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSignalId(@PathParam("id") int val){
		//gTest = new GetMagic();		
		//gTest.testTraitement(val);
		return "valeur traite : "+val;
	}
}
