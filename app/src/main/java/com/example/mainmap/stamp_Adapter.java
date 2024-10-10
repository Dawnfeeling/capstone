package com.example.mainmap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class stamp_Adapter extends FragmentStateAdapter {

    private int mPageCount = 8;

    public stamp_Adapter(AppCompatActivity activity){
        super(activity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0:
                stamp_gyenggi stamp_gyenggi = new stamp_gyenggi();
                return stamp_gyenggi;
            case 1:
                stamp_gangwon stamp_gangwon = new stamp_gangwon();
                return stamp_gangwon;
            case 2:
                stamp_gyeongbuk stamp_gyeongbuk = new stamp_gyeongbuk();
                return stamp_gyeongbuk;
            case 3:
                stamp_gyeongnam stamp_gyeongnam = new stamp_gyeongnam();
                return stamp_gyeongnam;
            case 4:
                stamp_jeonbuk stamp_jeonbuk = new stamp_jeonbuk();
                return stamp_jeonbuk;
            case 5:
                stamp_jeonnam stamp_jeonnam = new stamp_jeonnam();
                return stamp_jeonnam;
            case 6:
                stamp_chungbuk stamp_chungbuk = new stamp_chungbuk();
                return stamp_chungbuk;
            case 7:
                stamp_chungnam stamp_chungnam = new stamp_chungnam();
                return stamp_chungnam;
            default:
                return null;
        }
    }

    @Override
    public long getItemId(int position){
        return super.getItemId(position);
    }

    @Override
    public int getItemCount() {
        return mPageCount;
    }

}
