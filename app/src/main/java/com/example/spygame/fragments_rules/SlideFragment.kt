package com.example.spygame.fragments_rules

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.spygame.R
import com.example.spygame.databinding.FragmentSlideBinding
import com.google.android.material.tabs.TabLayoutMediator

class SlideFragment : Fragment() {

    private var _binding: FragmentSlideBinding? = null
    private val binding get() = _binding!!
    private val fragList = listOf(
        Rules1Fragment.newInstance(),
        Rules2Fragment.newInstance(),
        Rules3Fragment.newInstance()
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSlideBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = VpAdapter(this, fragList)
        with(binding) {
            vpRules.adapter = adapter
            TabLayoutMediator(tbLayout, vpRules) { tab, pos ->
            }.attach()
        }
    }
}