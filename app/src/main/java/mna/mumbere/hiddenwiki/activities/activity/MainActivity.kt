package mna.mumbere.hiddenwiki.activities.activity

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import mna.mumbere.hiddenwiki.R
import mna.mumbere.hiddenwiki.activities.fragments.ExploreFragment
import mna.mumbere.hiddenwiki.activities.fragments.Favoriteragment
import mna.mumbere.hiddenwiki.activities.fragments.HistoryFragment

class MainActivity : AppCompatActivity() {

    private val exploreFragment: ExploreFragment
    private val historyFragment: HistoryFragment
    private val favoriteragment: Favoriteragment

    init {
        exploreFragment = ExploreFragment()
        historyFragment = HistoryFragment()
        favoriteragment = Favoriteragment()
    }

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        val transaction = supportFragmentManager.beginTransaction()
        transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
        when (item.itemId) {
            R.id.navigation_explore -> transaction.replace(R.id.fragment_container, exploreFragment)
            R.id.navigation_favorite -> transaction.replace(R.id.fragment_container, favoriteragment)
            R.id.navigation_history -> transaction.replace(R.id.fragment_container, historyFragment)
        }
        transaction.commit()
        true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        nav_view.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container, exploreFragment)
        transaction.commit()


    }
}
