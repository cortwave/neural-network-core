package by.bsu.neuralnetworkcore.model.neuron

import by.bsu.neuralnetworkcore.model.link.Link

/**
 * @author Dmitry Pranchuk
 * @since 3/7/16.
 */
interface OutableNeuron : Neuron {

    fun outputLinks(): List<Link>

    fun addOutputLink(link: Link)

}