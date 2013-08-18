package de.nordakademie.akdw.neuronalenetze.neuron;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.nordakademie.akdw.neuronalenetze.activationstrategies.ActivationStrategy;
import de.nordakademie.akdw.neuronalenetze.activationstrategies.IdentityStrategy;


public class Neuron {
	protected ActivationStrategy activationStrategy = new IdentityStrategy();
	
	private Map<Neuron, Double> inputMap = new HashMap<>();
	private List<Edge> edges = new LinkedList<>();
	
	public void setInput(double input, Neuron predecessor){
		double activationInput = 0;
		
		inputMap.put(predecessor, input);
		for(double value : inputMap.values()){
			activationInput += value;
		}
		 
		
		double activationValue = activationStrategy.activate(activationInput);
		activate(activationValue);
	}
	
	public Set<Neuron> getInputs(){
		return inputMap.keySet();
	}
	
	public List<Edge> getEdges() {
		return edges;
	}
	
	public Edge getEdgeTo(Neuron neuron){
		for(Edge edge : edges){
			if(edge.getReceiver() == neuron){
				return edge;
			}
		}
		
		return null;
	}
	
	protected void activate(double activationValue){
		for(Edge edge : edges){
			edge.fire(activationValue);
		}
	}
	
	public void connect(Neuron successor){
		edges.add(new Edge(this, successor));
	}
	
	public void reset(){
		inputMap = new HashMap<>();
	}
	
	public void randomize(){
		for(Edge edge : edges){
			edge.randomize();
		}
	}
	
	
	
	public void setActivationStrategy(ActivationStrategy activationStrategy) {
		this.activationStrategy = activationStrategy;
	}
}
