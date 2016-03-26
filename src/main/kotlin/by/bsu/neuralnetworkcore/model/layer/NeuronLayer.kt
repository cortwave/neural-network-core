package by.bsu.neuralnetworkcore.model.layer

import by.bsu.neuralnetworkcore.model.neuron.Neuron

/**
 * @author Dmitry Pranchuk
 * @since 3/26/16.
 */
interface NeuronLayer<T: Neuron> {

    fun neurons(): List<T>

    fun add(neuron: T)

}