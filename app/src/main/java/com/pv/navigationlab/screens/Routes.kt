package com.pv.navigationlab.screens

// Will be migrated to enums or sealed classes

object Routes {
    object Home {
        const val BLACK = "black"
        const val RED = "red"
        const val CHOICES = "choices"
        const val MAKER = "maker"
        const val CUSTOM = "custom"

        fun contains(route: String?): Boolean = route?.let { route ->
            listOf(BLACK, RED, CHOICES, Choices.HOME, MAKER, CUSTOM).any { route == it }
        } ?: false
    }

    object Choices {
        const val HOME = "choicesHome"
        const val CYAN = "cyan"
        const val YELLOW = "yellow"
        const val WHITE = "white"
    }

    object Drawer {
        const val MAGENTA = "magenta"
        const val GREEN = "green"
    }
}
