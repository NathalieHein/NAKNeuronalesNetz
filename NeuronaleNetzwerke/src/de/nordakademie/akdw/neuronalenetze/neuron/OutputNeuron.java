package de.nordakademie.akdw.neuronalenetze.neuron;

public class OutputNeuron extends Neuron {
	private String caption;
	private double activationValue;
	
	public OutputNeuron(String caption){
		this.caption = caption;
	}
	
	public String getCaption() {
		return caption;
	}
	
	@Override
	protected void activate(double activationValue) {
		this.activationValue = activationValue;
	}
	
	public double getActivationValue() {
		return activationValue;
	}
	
	
}
