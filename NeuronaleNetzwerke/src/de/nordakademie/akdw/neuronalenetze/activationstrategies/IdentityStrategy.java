package de.nordakademie.akdw.neuronalenetze.activationstrategies;


public class IdentityStrategy implements ActivationStrategy {

	@Override
	public double activate(double input) {
		return input;
	}

}
