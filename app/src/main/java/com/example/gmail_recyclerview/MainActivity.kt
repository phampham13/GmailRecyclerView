package com.example.gmail

import Email
import EmailAdapter
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.gmailrecyclerview.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emails = ArrayList<Email>()
        emails.add(Email(R.drawable.ic_email1, "Bob Doe", "Bestselling?", "10:00 AM", "Are you looking to Learn Web Designing"))
        // Thêm nhiều email khác vào danh sách emails
        emails.add(Email(R.drawable.ic_emailt, "Taylor Switch", "New music", "19:00 PM", "Let's listen to my new album on Spotify and Apple Music"))
        emails.add(Email(R.drawable.ic_emailn, "Nguyen Pham", "Help make campaign Monitor better", "9:21 AM", "Let us know your thoughts! No Images was display"))
        emails.add(Email(R.drawable.ic_emailh, "Harry Style", "The New Icon creator is here!", "8:20 AM", "Announcing the all-new Creator, build a content"))
        emails.add(Email(R.drawable.ic_email1, "Baby Shark", "Support", "1:00 AM", "How old are you"))
        emails.add(Email(R.drawable.ic_emailn, "Nicola Nhaidepsop", "English Document", "6:21 PM", "Dear my student"))

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val emailAdapter = EmailAdapter(this, emails)
        recyclerView.adapter = emailAdapter
    }
}
