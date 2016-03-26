package by.bsu.neuralnetworkcore.service

import by.bsu.neuralnetworkcore.model.layer.NeuronLayer
import by.bsu.neuralnetworkcore.model.neuron.InputableNeuron
import by.bsu.neuralnetworkcore.model.neuron.OutableNeuron
import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue

/**
 * @author Dmitry Pranchuk
 * @since 3/27/16.
 */
class NeuralNeworkServiceTest {

    @Test
    fun createNetwork() {
        val inputsCount = 20
        val hiddenCounts = listOf(5, 10)
        val outputCount = 8
        val network = NeuralNetworkService.constructNetwork(inputsCount, hiddenCounts, outputCount)

        //should has correct size
        assertEquals(network.inputLayer.neurons().size, inputsCount)
        assertEquals(network.hiddenLayers.size, hiddenCounts.size)
        network.hiddenLayers.forEachIndexed { i, hiddenLayer ->
            assertEquals(hiddenLayer.neurons().size, hiddenCounts[i])
        }
        assertEquals(network.outputLayer.neurons().size, outputCount)

        //all layers should be bind
        checkLayersAreBinded(network.inputLayer, network.hiddenLayers.first())
        checkLayersAreBinded(network.hiddenLayers.last(), network.outputLayer)
        network.hiddenLayers.reduce { hiddenLayer1, hiddenLayer2 ->
            checkLayersAreBinded(hiddenLayer1, hiddenLayer2)
            hiddenLayer2
        }
    }

    private fun checkLayersAreBinded(from: NeuronLayer<out OutableNeuron>, to: NeuronLayer<out InputableNeuron>) {
        from.neurons().forEach { fromNeuron ->
            assertEquals(fromNeuron.outputLinks().size, to.neurons().size)
            to.neurons().forEach { toNeuron ->
                assertTrue(fromNeuron.outputLinks().map { it.to }.contains(toNeuron))
            }
        }
    }

}