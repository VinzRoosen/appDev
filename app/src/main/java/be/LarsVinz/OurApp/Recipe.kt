package be.LarsVinz.OurApp

@kotlinx.serialization.Serializable
data class Recipe(val recipeName : String, val steps : List<RecipeStep>) : java.io.Serializable
