package myexam.th.lth.newpaper.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import myexam.th.lth.newpaper.R;
import myexam.th.lth.newpaper.adapter.fragmentAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class PaperFragmentThree extends Fragment {


    private ViewPager vp;
    private TabLayout scrollTab;
    public PaperFragmentThree() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate( R.layout.fragment_paper_three, container, false );
        vp = (ViewPager)view.findViewById(R.id.vp);
        fragmentAdapter adapter = new fragmentAdapter(getFragmentManager(),getContext());
        vp.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout)view.findViewById(R.id.scrollTab);
        tabLayout.setupWithViewPager(vp);

        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        return view;
    }

}
