package de.nordakademie.akdw.neuronalenetze.test;

import de.nordakademie.akdw.neuronalenetze.Network;
import de.nordakademie.akdw.neuronalenetze.neuron.InputNeuron;
import de.nordakademie.akdw.neuronalenetze.neuron.OutputNeuron;

public class TestClass {
	public static void main(String[] args) {
		InputNeuron input1 = new InputNeuron();
		InputNeuron input2 = new InputNeuron();
		
		OutputNeuron output1 = new OutputNeuron("output");
		
		input1.connect(output1);
		input2.connect(output1);
		
		Network network = new Network();
		network.add(input1);
		network.add(input2);
		network.add(output1);
		
		network.randomize();
		network.setInput(1,1);
	}
}
