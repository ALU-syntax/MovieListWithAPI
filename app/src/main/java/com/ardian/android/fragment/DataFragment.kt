package com.ardian.android.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ardian.android.MovieAdapter
import com.ardian.android.R
import com.ardian.android.RClient
import com.ardian.android.databinding.FragmentDataBinding
import com.ardian.android.modeldata.MovieData
import com.ardian.android.modeldata.SearchData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class DataFragment : Fragment() {
    private var _binding: FragmentDataBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val list = ArrayList<MovieData>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDataBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvData.setHasFixedSize(true)
        binding.rvData.layoutManager = LinearLayoutManager(context)

        RClient.instances.getMovies().enqueue(object : Callback<SearchData>{
            override fun onResponse(call: Call<SearchData>, response: Response<SearchData>) {
                val responseCode = response.code()

                response.body()?.let { list.addAll(it.data) }
                val adapter = MovieAdapter(list)
                binding.rvData.adapter = adapter
            }

            override fun onFailure(call: Call<SearchData>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}