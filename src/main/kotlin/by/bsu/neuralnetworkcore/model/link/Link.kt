package by.bsu.neuralnetworkcore.model.link

import by.bsu.neuralnetworkcore.model.neuron.InputableNeuron
import by.bsu.neuralnetworkcore.model.neuron.OutableNeuron

/**
 * @author Dmitry Pranchuk
 * @since 3/7/16.
 */
class Link(val from: OutableNeuron, val to: InputableNeuron, var weight: Double)

