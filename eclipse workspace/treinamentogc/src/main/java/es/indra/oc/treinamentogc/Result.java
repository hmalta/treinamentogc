package es.indra.oc.treinamentogc;

public class Result {
	double input1;
	double input2;
	double output;
	double resultado;
	String action;
	
	public double somar(double input1, double input2){
		resultado  = input1+input2;
		return resultado;
	}
	
	public double subtrair(double input1, double input2){
		resultado  = input1-input2;
		return resultado;
	}
	
	public double multiplicar(double input1, double input2){
		resultado  = input1*input2;
		return resultado;
	}
	
	public double dividir(double input1, double input2){
		resultado  = input1/input2;
		return resultado;
	}
	
	public Result(){
		
	}
	
	public Result(String action){
		this.action = action;
	}

	public double getInput1() {
		return input1;
	}

	public void setInput1(double input1) {
		this.input1 = input1;
	}

	public double getInput2() {
		return input2;
	}

	public void setInput2(double input2) {
		this.input2 = input2;
	}

	public double getOutput() {
		return output;
	}

	public void setOutput(double output) {
		this.output = output;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	
}
