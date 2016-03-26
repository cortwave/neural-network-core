package by.bsu.neuralnetworkcore.model.neuron

import by.bsu.neuralnetworkcore.model.link.Link
import java.util.ArrayList

/**
 * @author Dmitry Pranchuk
 * @since 3/7/16.
 */
class InputNeuron : OutableNeuron {

    private var outputLinks = ArrayList<Link>()

    override fun outputLinks(): List<Link> = outputLinks

    override fun addOutputLink(link: Link) {
        outputLinks.add(link)
    }
}