package be.LarsVinz.MealMap

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
<<<<<<< HEAD
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
=======
import android.widget.TextView
>>>>>>> ea6be0ea979ebe5da512e12e74909e9b66ea304b
import androidx.recyclerview.widget.RecyclerView

class RecipePreviewAdapter (val items: MutableList<Recipe>): RecyclerView.Adapter<RecipePreviewAdapter.testViewHolder>(){
    inner class testViewHolder(currentItemView: View) : RecyclerView.ViewHolder(currentItemView)

<<<<<<< HEAD


=======
>>>>>>> ea6be0ea979ebe5da512e12e74909e9b66ea304b
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): testViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recipe, parent, false)
        return testViewHolder(view)
    }

    override fun onBindViewHolder(holder: testViewHolder, position: Int) {
        val currentItem = items[position]
        holder.itemView.apply {
            findViewById<TextView>(R.id.txtRecipe).text = currentItem.recipeName
<<<<<<< HEAD
            findViewById<TextView>(R.id.txtRecipe).setOnClickListener{
                System.out.println("Als dit print werkt de knop")

                //TODO Tijdelijk:
                val recipeList = mutableListOf<Recipe>()
                val steps = listOf<RecipeStep>( RecipeStep("Test", 0), RecipeStep("Test2", 0) )
                recipeList.add(Recipe("test",steps))
                val recipe = Recipe("Test titel", steps)
                val bundle = bundleOf("recipe" to recipe)

                findNavController().navigate(R.id.action_recipeListFragment_to_recipeDetailFragment, bundle)
            }
=======
>>>>>>> ea6be0ea979ebe5da512e12e74909e9b66ea304b
        }
    }

    override fun getItemCount(): Int = items.size
}