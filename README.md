# neural-network-core
Core library for creating multilayer neural networks

`NeuralNetworkService.constructNetwork(input: Int, hidden: List<Int>, output: Int)` method generates neural network with next
params:
```
input - count of neurons in input layer
hidden - collection of count of neurons in hidden layers, where hidden.size() - count of hidden layers
output - count of neurons in output layer
```
###Examples
Code
```kotlin
val network = NeuralNetworkService.constructNetwork(2, listOf(3), 2)
```
Schema of result network


![alt text](http://neuroph.sourceforge.net/tutorials/images/MLP.jpg "Schema")

Code
```kotlin
val network = NeuralNetworkService.constructNetwork(6, listOf(4, 3), 1)
```
Schema of result network

![alt text](http://neuralnetworksanddeeplearning.com/images/tikz11.png)
