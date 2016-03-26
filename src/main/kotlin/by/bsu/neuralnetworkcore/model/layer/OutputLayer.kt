package by.bsu.neuralnetworkcore.model.layer

import by.bsu.neuralnetworkcore.model.neuron.OutputNeuron

/**
 * @author Dmitry Pranchuk
 * @since 3/26/16.
 */
class OutputLayer(neurons: MutableList<OutputNeuron>) : AbstractLayer<OutputNeuron>(neurons)