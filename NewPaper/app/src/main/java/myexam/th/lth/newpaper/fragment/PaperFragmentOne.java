package myexam.th.lth.newpaper.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import myexam.th.lth.newpaper.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PaperFragmentOne extends Fragment {

    private String TAG = "HomeNews";
    public PaperFragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_paper_one, container, false);
        return view;
    }
}
