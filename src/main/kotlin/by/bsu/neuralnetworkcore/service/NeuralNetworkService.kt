package by.bsu.neuralnetworkcore.service

import by.bsu.neuralnetworkcore.model.NeuralNetwork
import by.bsu.neuralnetworkcore.model.layer.HiddenLayer
import by.bsu.neuralnetworkcore.model.layer.InputLayer
import by.bsu.neuralnetworkcore.model.layer.NeuronLayer
import by.bsu.neuralnetworkcore.model.layer.OutputLayer
import by.bsu.neuralnetworkcore.model.link.Link
import by.bsu.neuralnetworkcore.model.neuron.HiddenNeuron
import by.bsu.neuralnetworkcore.model.neuron.InputNeuron
import by.bsu.neuralnetworkcore.model.neuron.InputableNeuron
import by.bsu.neuralnetworkcore.model.neuron.OutableNeuron
import by.bsu.neuralnetworkcore.model.neuron.OutputNeuron

/**
 * @author Dmitry Pranchuk
 * @since 3/26/16.
 */
object NeuralNetworkService {

    fun constructNetwork(inputCount: Int, hiddenCount: List<Int>, outputCount: Int): NeuralNetwork {
        val inputLayer = inputLayer(inputCount)
        val hiddenLayers = hiddenCount.map { hiddenLayer(it) }
        val outputLayer = outputLayer(outputCount)
        val network = NeuralNetwork(inputLayer, hiddenLayers, outputLayer)
        bindNetwork(network)
        return network
    }

    private fun bindNetwork(network: NeuralNetwork) {
        network.hiddenLayers.reduce { hiddenLayer, nextHiddenLayer ->
            bindLayers(hiddenLayer, nextHiddenLayer)
            nextHiddenLayer
        }
        bindLayers(network.inputLayer, network.hiddenLayers.first())
        bindLayers(network.hiddenLayers.last(), network.outputLayer)
    }

    private fun bindLayers(from: NeuronLayer<out OutableNeuron>, to: NeuronLayer<out InputableNeuron>) {
        from.neurons().forEach { fromNeuron ->
            to.neurons().forEach { toNeuron ->
                val link = Link(fromNeuron, toNeuron, littleVal())
                fromNeuron.addOutputLink(link)
                toNeuron.addInputLink(link)
            }
        }
    }

    private fun inputLayer(inputCount: Int): InputLayer {
        val inputNeurons = Array(inputCount, { InputNeuron()}).toMutableList()
        return InputLayer(inputNeurons);
    }

    private fun hiddenLayer(hiddenCount: Int): HiddenLayer {
        val hiddenNeurons = Array(hiddenCount, {HiddenNeuron(littleVal())}).toMutableList()
        return HiddenLayer(hiddenNeurons)
    }

    private fun outputLayer(outputCount: Int): OutputLayer {
        val outputNeurons = Array(outputCount, {OutputNeuron(littleVal())}).toMutableList()
        return OutputLayer(outputNeurons)
    }

    private fun littleVal(): Double = Math.random() / 100

}