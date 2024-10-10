package com.example.mainmap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;

public class review_Adapter extends BaseAdapter   {


    Filter listFilter ;
    private ArrayList<listviewitem_review> listViewItemList = new ArrayList<listviewitem_review>() ;
    private ArrayList<listviewitem_review> filteredItemList;
    public review_Adapter(ArrayList<listviewitem_review> itemList) {
        if (itemList == null) {
            listViewItemList = new ArrayList<listviewitem_review>() ;
        } else {
            listViewItemList = itemList ;
        }
        //filteredItemList = listViewItemList ;
    }

    FirebaseUser u = FirebaseAuth.getInstance().getCurrentUser();
    String name = u.getDisplayName();
    String email = u.getEmail();
    String uid = u.getUid();


    @Override
    public int getCount() {
        return listViewItemList.size();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final Context context = viewGroup.getContext();
        final int pos=i;

        // "listview_item" Layout을 inflate하여 convertView 참조 획득.
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listview_review, viewGroup, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        TextView TextView = (TextView) view.findViewById(R.id.ReviewUesr) ;
        TextView TextView2 = (TextView) view.findViewById(R.id.review_content) ;
        RatingBar ratingBar=view.findViewById(R.id.review_ratingBar);
        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        listviewitem_review listViewItem = listViewItemList.get(i);
        // 아이템 내 각 위젯에 데이터 반영

        TextView.setText(listViewItem.getEmail());// 유저 이메일
        TextView2.setText(listViewItem.getReviewContent());
        ratingBar.setRating(listViewItem.getRatingValue());
        return view;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public Object getItem(int i) {
        return listViewItemList.get(i);
    }

    public void addItem(String N,String R ,float r,String email) {
        listviewitem_review item = new listviewitem_review();
        item.setDrinkName(N);
        item.setReviewContent(R);
        item.setRatingValue(r);
        item.setEmail(email);
        listViewItemList.add(item);
    }



}

