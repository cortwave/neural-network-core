package by.bsu.neuralnetworkcore.model

import by.bsu.neuralnetworkcore.model.layer.HiddenLayer
import by.bsu.neuralnetworkcore.model.layer.InputLayer
import by.bsu.neuralnetworkcore.model.layer.OutputLayer

/**
 * @author Dmitry Pranchuk
 * @since 3/26/16.
 */
class NeuralNetwork(val inputLayer: InputLayer, val hiddenLayers: List<HiddenLayer>, val outputLayer: OutputLayer)