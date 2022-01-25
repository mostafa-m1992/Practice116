package com.shia.practice116;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class BottomViewFragment extends Fragment {

    TabLayout tabLayout3;
    ViewPager2 viewPager3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bottom_view, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tabLayout3 = view.findViewById(R.id.tabLayout3);
        viewPager3 = view.findViewById(R.id.viewPager3);

        ViewPagerAdapter2 adapter2 = new ViewPagerAdapter2(getActivity());
        adapter2.addFragment(new ViewFragment1());
        adapter2.addFragment(new ViewFragment2());
        adapter2.addFragment(new ViewFragment3());

        viewPager3.setAdapter(adapter2);
        viewPager3.setOrientation(viewPager3.ORIENTATION_HORIZONTAL);
        viewPager3.setCurrentItem(0);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout3, viewPager3, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        FragmentTransaction transaction1 = getFragmentManager().beginTransaction();
                        transaction1.replace(R.id.frameViewPager2, new ViewFragment1());
                        transaction1.commit();
                        break;
                    case 1:
                        FragmentTransaction transaction2 = getFragmentManager().beginTransaction();
                        transaction2.replace(R.id.frameViewPager2, new ViewFragment2());
                        transaction2.commit();
                        break;
                    case 2:
                        FragmentTransaction transaction3 = getFragmentManager().beginTransaction();
                        transaction3.replace(R.id.frameViewPager2, new ViewFragment3());
                        transaction3.commit();
                        break;
                }
            }
        });
        tabLayoutMediator.attach();

        tabLayout3.getTabAt(0).setIcon(R.drawable.ic_baseline_card);
        tabLayout3.getTabAt(1).setIcon(R.drawable.ic_baseline_card);
        tabLayout3.getTabAt(2).setIcon(R.drawable.ic_baseline_card);

        tabLayout3.getTabAt(0).setText("a");
        tabLayout3.getTabAt(1).setText("b");
        tabLayout3.getTabAt(2).setText("c");
    }
}
