package com.example.tetris.helpers

fun array2dOfByte (sizeOuter: Int, sizeInner: Int): Array<ByteArray> {
    val array = Array(sizeOuter) { ByteArray(sizeInner) }
    return array
}