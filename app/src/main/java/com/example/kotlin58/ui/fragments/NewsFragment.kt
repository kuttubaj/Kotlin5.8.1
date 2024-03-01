package com.example.kotlin58.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlin58.R
import retrofit2.Call

class NewsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val topHeadlinesCall: Call<TopHeadlinesResponse> = service.getTopHeadlines("us", "YOUR_API_KEY")
//        val everythingCall: Call<EverythingResponse> = service.getEverything("bitcoin", "YOUR_API_KEY")
    }
}