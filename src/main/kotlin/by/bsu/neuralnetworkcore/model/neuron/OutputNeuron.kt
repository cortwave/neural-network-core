package by.bsu.neuralnetworkcore.model.neuron

import by.bsu.neuralnetworkcore.model.link.Link
import java.util.ArrayList

/**
 * @author Dmitry Pranchuk
 * @since 3/7/16.
 */
class OutputNeuron(override var weight: Double) : InputableNeuron {
    private var inputLinks = ArrayList<Link>()

    override fun inputLinks(): List<Link> = inputLinks

    override fun addInputLink(link: Link) {
        inputLinks.add(link)
    }
}