package by.bsu.neuralnetworkcore.model.layer

import by.bsu.neuralnetworkcore.model.neuron.Neuron

/**
 * @author Dmitry Pranchuk
 * @since 3/26/16.
 */
abstract class AbstractLayer<T : Neuron>(private val neurons: MutableList<T>) : NeuronLayer<T> {

    override fun neurons() = neurons

    override fun add(neuron: T) {
        neurons.add(neuron)
    }
}