package es.indra.oc.treinamentogc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("calculadora")
public class Calculadora {
	double resultado;
	
	@GET
	@Path("soma")
	@Produces(MediaType.APPLICATION_JSON)
	public Result soma(@QueryParam("entrada1") double input1, @QueryParam("entrada2") double input2){
		Result result = new Result("Soma");
		result.setInput1(input1);
		result.setInput2(input2);
		resultado = result.somar(input1, input2);
		result.setOutput(resultado);
		return result;
	}
	
	@GET
	@Path("subtracao")
	@Produces(MediaType.APPLICATION_JSON)
	public Result subtracao(@QueryParam("entrada1") double input1, @QueryParam("entrada2") double input2){
		Result result = new Result("Subtracao");
		result.setInput1(input1);
		result.setInput2(input2);
		resultado = result.subtrair(input1, input2);
		result.setOutput(resultado);
		return result;
	}
	
	@GET
	@Path("multiplicacao")
	@Produces(MediaType.APPLICATION_JSON)
	public Result multiplicacao(@QueryParam("entrada1") double input1, @QueryParam("entrada2") double input2){
		Result result = new Result("Multiplicacao");
		result.setInput1(input1);
		result.setInput2(input2);
		resultado = result.multiplicar(input1, input2);
		result.setOutput(resultado);
		return result;
	}
	
	@GET
	@Path("divisao")
	@Produces(MediaType.APPLICATION_JSON)
	public Result divisao(@QueryParam("entrada1") double input1, @QueryParam("entrada2") double input2){
		Result result = new Result("Divisao");
		result.setInput1(input1);
		result.setInput2(input2);
		resultado = result.dividir(input1, input2);
		result.setOutput(resultado);
		return result;
	}
}
