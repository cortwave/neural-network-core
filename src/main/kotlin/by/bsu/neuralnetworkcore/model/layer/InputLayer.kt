package by.bsu.neuralnetworkcore.model.layer

import by.bsu.neuralnetworkcore.model.neuron.InputNeuron

/**
 * @author Dmitry Pranchuk
 * @since 3/26/16.
 */
class InputLayer(neurons: MutableList<InputNeuron>) : AbstractLayer<InputNeuron>(neurons)