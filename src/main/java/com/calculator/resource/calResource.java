package com.calculator.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import com.calculator.service.calService;

@Path("/cal")
public class calResource {
	
	// create object of service 
	calService obj = new calService();
	
	// to add two number
	@GET
	@Path("/ADD")
	@Produces(MediaType.TEXT_PLAIN)
	public Double ADD(@QueryParam("first") double a , @QueryParam("second") double b) {
		return obj.addNumber(a, b);
	}
	
	// to sub two number
	@GET
	@Path("/SUB")
	@Produces(MediaType.TEXT_PLAIN)
	public String SUB(@QueryParam("first") double a , @QueryParam("second") double b) {
		double ans = obj.subNumber(a, b);
		return String.format("%.2f", ans);
	}
		
	// to sub two number
	@GET
	@Path("/MUL")
	@Produces(MediaType.TEXT_PLAIN)
	public Double MUL(@QueryParam("first") double a , @QueryParam("second") double b) {
		return obj.mulNumber(a, b);
	}
	
	// to find sqrt
	@GET
	@Path("/SQRT")
	@Produces(MediaType.TEXT_PLAIN)
	public String SQRT(@QueryParam("first") double a ) {
		double ans = obj.sqrt(a);
		return String.format("%.2f", ans);
	}
	
	// to find the division
	@GET
	@Path("/DIV")
	@Produces(MediaType.TEXT_PLAIN)
	public String DIV(@QueryParam("first") double a,@QueryParam("second") double b) {
		try{
			if(b == 0.0)
				throw new ArithmeticException("zero");
			double ans = obj.divNumber(a, b);
			
			return String.format("%.2f",ans);
		}catch(ArithmeticException e) {
			return "Error! = Divide by ZERO";
		}
	}
		
}
