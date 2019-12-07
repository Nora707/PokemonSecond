package com.example.pokemonsecond.model

enum class Type() {
    NORMAL{override fun weakness()= arrayOf(Type.FIGHTING) },
    FIRE{override fun weakness()= arrayOf(Type.WATER)},
    WATER{override fun weakness()= arrayOf(Type.FIRE)},
//    ELECTRIC([], []),
//    GRASS([], []),
//    ICE([], []),
    FIGHTING{override fun weakness()= arrayOf(Type.WATER)};
//    POISON([], []),
//    GROUND([], []),
//    FLYING([], []),
//    PSYCHIC([], []),
//    BUG([], []),
//    ROCK([], []),
//    GHOST([], []),
//    DRAGON([], []),
//    DARK([], []),
//    STEEL([], []),
//    FAIRY([], []);

    abstract fun weakness(): Array<Type>;
//         return Type.DRAGON;
//        val fileContent = javaClass.getResource("/html/file.html").readText()
//         (Bundle bundle)
//         {
//             base.OnCreate (bundle);
//
//             // Create a new TextView and set it as our view
//             TextView tv = new TextView (this);
//
//             // Read the contents of our asset
//             string content;
//             AssetManager assets = this.Assets;
//             using (StreamReader sr = new StreamReader (assets.Open ("read_asset.txt")))
//             {
//                 content = sr.ReadToEnd ();
//             }
//
//             // Set TextView.Text to our asset content
//             tv.Text = content;
//             SetContentView (tv);
//         }

}