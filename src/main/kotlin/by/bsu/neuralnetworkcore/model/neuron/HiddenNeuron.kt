package by.bsu.neuralnetworkcore.model.neuron

import by.bsu.neuralnetworkcore.model.link.Link
import java.util.ArrayList

/**
 * @author Dmitry Pranchuk
 * @since 3/7/16.
 */
class HiddenNeuron(override var weight: Double) : InputableNeuron, OutableNeuron {

    private var inputLinks = ArrayList<Link>()

    private var outputLinks = ArrayList<Link>()

    override fun inputLinks(): List<Link> = inputLinks

    override fun addInputLink(link: Link) {
        inputLinks.add(link)
    }

    override fun outputLinks(): List<Link> = outputLinks

    override fun addOutputLink(link: Link) {
        outputLinks.add(link)
    }
}