package mna.mumbere.hiddenwiki.activities.holders

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.article_item_card.view.*
import mna.mumbere.hiddenwiki.R

class ListItemHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    private val articleImageView:ImageView = itemView.findViewById(R.id.article_image)
    private val titleTextView: TextView = itemView.findViewById(R.id.article_text)
}