//import com.example.gmail.R

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gmail.R

class EmailAdapter(private val context: Context, private val emails: List<Email>) :
    RecyclerView.Adapter<EmailAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val email = emails[position]
        holder.icon.setImageResource(email.icon)
        holder.sender.text = email.sender
        holder.subject.text = email.subject
        holder.time.text = email.time
        holder.content.text = email.content
    }

    override fun getItemCount(): Int {
        return emails.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val icon: ImageView = itemView.findViewById(R.id.icon)
        val sender: TextView = itemView.findViewById(R.id.sender)
        val subject: TextView = itemView.findViewById(R.id.subject)
        val time: TextView = itemView.findViewById(R.id.time)
        val content: TextView = itemView.findViewById(R.id.content)
    }
}
