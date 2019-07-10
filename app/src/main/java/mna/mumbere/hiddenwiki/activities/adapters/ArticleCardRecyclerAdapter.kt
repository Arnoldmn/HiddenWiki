package mna.mumbere.hiddenwiki.activities.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import mna.mumbere.hiddenwiki.R
import mna.mumbere.hiddenwiki.activities.holders.CardHolder
import mna.mumbere.hiddenwiki.activities.holders.ListItemHolder

class ArticleCardRecyclerAdapter : RecyclerView.Adapter<ListItemHolder>() {

    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(p0: ListItemHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ListItemHolder {
        var cardItem = LayoutInflater.from(p0.context).inflate(R.layout.article_item_card, p0, false)
        return ListItemHolder(cardItem)
    }
}