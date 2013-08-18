package de.nordakademie.akdw.neuronalenetze.neuron;

public class InputNeuron extends Neuron {
	public void input(double input){
		activationStrategy.activate(input);
		activate(input);
	}
}
