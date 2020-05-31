package com.example.pokemonsecond

import android.os.Bundle
import com.google.android.material.navigation.NavigationView
import androidx.core.view.GravityCompat
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import com.example.pokemonsecond.model.Pokemon
import com.example.pokemonsecond.model.Type
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.poke_finder.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_bar_main)
        setSupportActionBar(toolbar)

//        val dm = HashMap<Int, Pokemon>()
//        dm.set(1, Pokemon("Pichu", "Kanto", 500, arrayOf(Type.FIGHTING), arrayOf(Type.FIRE)))
//        dm.set(2, Pokemon("Ditto", "Jonto", 800, arrayOf(Type.WATER), arrayOf(Type.NORMAL)))
//        dm.set(3, Pokemon("Eevee", "Hoen", 1200, arrayOf(Type.FIRE), arrayOf(Type.FIRE)))
//        val adapter = ArrayAdapter<Pokemon>(
//            this,
//            android.R.layout.simple_spinner_item,
//            dm.values.toList()
//        )
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        pokeFinderSpinner.adapter =adapter

//        val toggle = ActionBarDrawerToggle(
//            this,
//            drawer_layout,
//            toolbar,
//            R.string.navigation_drawer_open,
//            R.string.navigation_drawer_close
//        )
//        print(toggle.toString())
//        drawer_layout.addDrawerListener(toggle)
//        toggle.syncState()

//        nav_view.setNavigationItemSelectedListener(this)
    }

    public fun forGymBattleButton(view: View) {
        println("gym battle button has been clicked");
        setContentView(R.layout.opponent_selector)
    }

    public fun forRaidButton(view: View) {
        println("raid battle button has been clicked");
    }
    public fun forDuelButton(view: View) {
        println("duel battle button has been clicked");
    }

    public fun bestDefendersButton(view: View) {
        println("defender button has been clicked");
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_camera -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
