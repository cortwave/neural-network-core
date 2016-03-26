package by.bsu.neuralnetworkcore.model.layer

import by.bsu.neuralnetworkcore.model.neuron.HiddenNeuron
import java.util.ArrayList

/**
 * @author Dmitry Pranchuk
 * @since 3/26/16.
 */
class HiddenLayer(neurons: MutableList<HiddenNeuron>) : AbstractLayer<HiddenNeuron>(neurons)