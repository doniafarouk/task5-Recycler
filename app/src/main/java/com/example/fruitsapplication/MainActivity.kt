package com.example.fruitsapplication

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){

    private lateinit var recyclerView: RecyclerView

    private lateinit var layoutManager: GridLayoutManager
    private lateinit var mySharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)

        mySharedPreferences = getSharedPreferences("MY_PREF", Context.MODE_PRIVATE)

        val spanCount = mySharedPreferences.getInt("Span_count", 1)

        layoutManager = GridLayoutManager(this,spanCount)
        recyclerView.layoutManager = layoutManager

        val listOfFruit = getListFruit()
        val fruitsAdaptor = FruitAdapter(listOfFruit)
        recyclerView.adapter = fruitsAdaptor
    }

    private fun getListFruit(): List<Fruit>{
        val fruits = mutableListOf<Fruit>()

        fruits.add(Fruit("Apple", R.drawable.apple3, "APPLE (Malus domestica): \n - Fruit of the domesticated tree Malus domestica (family Rosaceae). \n - One of the most widely cultivated tree fruits.\n - The apple is a pome (fleshy) fruit, in which the ripened ovary and surrounding tissue both become fleshy and edible"))
        fruits.add(Fruit("Banana", R.drawable.banana2, "BANANA: \n - The fruit is variable in size, color, and firmness \n - But is usually elongated and curved, with soft flesh rich in starch covered with a rind, which may be green, yellow, red, purple, or brown when ripe.\n The fruits grow upward in clusters near the top of the plant."))
        fruits.add(Fruit("Orange", R.drawable.orange, "ORANGE: \n - The orange is a usually round or oval citrus; its rind and flesh are generally orange, except the varieties of red pulp.\n- The edible part of the orange is the flesh, consumed in fresh or in juice.\n - The orange is also used to make stewed fruit, jams, for consumption as dehydrated fruit."))
        fruits.add(Fruit("Grapes", R.drawable.grapes, "GRAPES:\n- Grapes are fleshy, rounded fruits that grow in clusters made up of many fruits of greenish, yellowish or purple skin.\n - The pulp is juicy and sweet, and it contain several seeds or pips."))
        fruits.add(Fruit("Pear", R.drawable.pear, "PEAR:\n- Pear fruits are generally sweeter and of softer texture than apples and are distinguished by the presence of hard cells in the flesh, the so-called grit, or stone cells.\n - In general, pear fruits are elongate, being narrow at the stem end and broader at the opposite end."))
        fruits.add(Fruit("Mango", R.drawable.mango, "MANGO:\n- The fruit varies greatly in size and character. \n- Its form is oval, round, heart-shaped, kidney-shaped, or long and slender. \n- The smallest mangoes are no larger than plums, while others may weigh 1.8 to 2.3 kg (4 to 5 pounds). \n- Some varieties are vividly coloured with shades of red and yellow, while others are dull green."))
        fruits.add(Fruit("Kiwi", R.drawable.kiwi, "KIWI:\n- A fruit of ovoid shape, of variable size and covered with a brown fuzzy thin skin.\n- It measures between 4 and 7.5cm long and 3.5 to 5cm wide and the weight oscillates between 30 and150g depending on the variety, the climatic conditions and the planting system."))
        fruits.add(Fruit("plum", R.drawable.plum, "PLUM:\n-Plums are small, dark reddish purple, and sweet.\n- Plums have an edible, smooth skin, juicy flesh, and a hard pit in the middle.\n- When plums are dried, they're called prunes.\n- The typical color of a ripe plum — a rich, purple-red shade — is also called plum."))
        fruits.add(Fruit("apricot", R.drawable.apricot, "APRICOT:\n - The fruits are drupes with a large flat pit, or stone, within which is the seed.\n - Similar in shape to a peach, the fruit is nearly smooth, round to oblong in some varieties, and somewhat flattened but with little to no hairiness when ripe.\n- Its flesh is typically a rich yellow to yellowish orange."))
        fruits.add(Fruit("Cantaloupe", R.drawable.cantaloupe, "CANTALOUPE:\n- The cantaloupe is a juicy, orange summer fruit that's related to the watermelon and honeydew melon.\n- It also belongs to the same plant family as cucumbers, pumpkins, squashes, and gourds.\n- The semi-sweet cantaloupes most familiar to people in the U.S. are a type of muskmelon called Cucumis melo reticulatus."))
        fruits.add(Fruit("Watermelon", R.drawable.watermelon, "WATERMELON:\n- The sweet, juicy flesh is usually deep red to pink, with many black seeds, although seedless varieties exist.\n- The fruit can be eaten raw or pickled, and the rind is edible after cooking.\n- It may also be consumed as a juice or an ingredient in mixed beverages."))
        fruits.add(Fruit("Strawberry", R.drawable.strawberry, "STRAWBERRY:\n- Strawberries are soft, sweet, bright red berries. They're also delicious.\n- Strawberries have tiny edible seeds, which grow all over their surface.\n- When ripe, strawberries smell wonderful and taste even better."))


        return fruits

    }

}