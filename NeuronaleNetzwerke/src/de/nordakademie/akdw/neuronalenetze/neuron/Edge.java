package de.nordakademie.akdw.neuronalenetze.neuron;


public class Edge {
	private Neuron sender;
	private Neuron receiver;
	private double weight;
	
	
	public Edge(Neuron sender, Neuron receiver){
		this.sender = sender;
		this.receiver = receiver;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void fire(double input){
		receiver.setInput(computeWeight(input), sender);
	}
	
	private double computeWeight(double input){
		return weight * input;
	}
	
	public Neuron getReceiver() {
		return receiver;
	}
	
	public void randomize(){
		if(Math.random()<0.5){
			weight = Math.random();
		}else{
			weight = -Math.random();
		}
	}
}
