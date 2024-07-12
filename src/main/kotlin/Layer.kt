package org.example

import org.jetbrains.kotlinx.multik.api.*
import org.jetbrains.kotlinx.multik.ndarray.data.*
import org.jetbrains.kotlinx.multik.ndarray.operations.*

abstract class Layer {
    val prev: Layer? = null
    var next: Layer? = null

    // this needs to be a tensor or vector
    val input_data: Array<Double> = arrayOf()

    val output_data: Array<Double> = arrayOf()

    fun connect(layer: Layer) {
        next = layer
    }

    fun forward() {
        throw NotImplementedError()
    }

    fun get_forward_input(): Array<Double> {
        return prev?.output_data ?: input_data
    }
}