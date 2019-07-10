package mna.mumbere.hiddenwiki.activities.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import mna.mumbere.hiddenwiki.R
import mna.mumbere.hiddenwiki.activities.holders.CardHolder

class ArticleListItemRecyclerAdapter : RecyclerView.Adapter<CardHolder>() {

    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(p0: CardHolder, p1: Int) {
        return
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CardHolder {
        var cardItem = LayoutInflater.from(p0.context).inflate(R.layout.article_list_item, p0, false)
        return CardHolder(cardItem)
    }
}