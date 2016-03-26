package by.bsu.neuralnetworkcore.model.neuron

import by.bsu.neuralnetworkcore.model.link.Link

/**
 * @author Dmitry Pranchuk
 * @since 3/7/16.
 */
interface InputableNeuron : Neuron {

    fun inputLinks(): List<Link>

    fun addInputLink(link: Link)

    var weight: Double

}