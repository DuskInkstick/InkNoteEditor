package com.dusk73.noteeditor.custom_view.models

data class TouchInfo (
    val partIndex: Int,
    val measureIndex: Int,
    val line: Int,
    val measureDrawInfo: MeasureDrawInfo,
    val nearestElement: ElementDrawInfo,
    val isElementTouched: Boolean,
)