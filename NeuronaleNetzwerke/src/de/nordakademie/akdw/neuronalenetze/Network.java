package de.nordakademie.akdw.neuronalenetze;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.nordakademie.akdw.neuronalenetze.neuron.InputNeuron;
import de.nordakademie.akdw.neuronalenetze.neuron.Neuron;
import de.nordakademie.akdw.neuronalenetze.neuron.OutputNeuron;

public class Network {
	
	private Set<Neuron> neurons = new HashSet();
	private Set<InputNeuron> inputNeurons = new HashSet();
	private Set<OutputNeuron> outputNeurons = new HashSet();
	
	public void setInput(double ... inputs){
		if(inputs.length!= inputNeurons.size()){
			throw new IllegalArgumentException("Eingabevektor muss der Menge an Inputneuronen entsprechen");
		}
		
		int i = 0;
		for(InputNeuron neuron : inputNeurons){
			neuron.input(inputs[i]);
			i++;
		}
		
		for(OutputNeuron neuron : outputNeurons){
			System.out.println(neuron.getCaption() + ": " + neuron.getActivationValue());
		}
		
	}
	
	public void reset(){
		for(Neuron neuron : neurons){
			neuron.reset();
		}
	}
	
	public void randomize(){
		for(Neuron neuron : neurons){
			neuron.randomize();
		}
	}
	
	
	
	public void add(Neuron neuron){
		neurons.add(neuron);
	}
	
	public void add(InputNeuron neuron){
		inputNeurons.add(neuron);
		add((Neuron)neuron);
	}
	
	public void add(OutputNeuron neuron){
		outputNeurons.add( neuron);
		add((Neuron)neuron);
	}
}
