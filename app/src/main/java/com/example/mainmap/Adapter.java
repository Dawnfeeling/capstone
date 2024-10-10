package com.example.mainmap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
public class Adapter extends BaseAdapter implements Filterable {
    private ArrayList<listviewitem> listViewItemList = new ArrayList<listviewitem>() ;
    // 필터링된 결과 데이터를 저장하기 위한 ArrayList. 최초에는 전체 리스트 보유.
    Filter listFilter ;
    private ArrayList<listviewitem> filteredItemList;
    public Adapter(ArrayList<listviewitem> itemList) {
        if (itemList == null) {
            listViewItemList = new ArrayList<listviewitem>() ;
        } else {
            listViewItemList = itemList ;
        }
        filteredItemList = listViewItemList ;
    }

    @Override
    public int getCount() {
        return filteredItemList.size();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final Context context = viewGroup.getContext();
        final int pos=i;

        // "listview_item" Layout을 inflate하여 convertView 참조 획득.
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listview, viewGroup, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        ImageView ImageView = (ImageView) view.findViewById(R.id.imageView) ;
        TextView TextView = (TextView) view.findViewById(R.id.NameText) ;
        TextView TextView2 = (TextView) view.findViewById(R.id.abvtxt1) ;
        TextView TextView3 = (TextView) view.findViewById(R.id.regiontxt1);
        TextView TextView4 = (TextView) view.findViewById(R.id.typetxt1);
        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        listviewitem listViewItem = filteredItemList.get(i);     // 아이템 내 각 위젯에 데이터 반영

        //ImageView.setImageDrawable(listViewItem.getIcon());
        Glide.with(context)
                .load(listViewItem.getIcon())
                .into(ImageView);
        TextView.setText(listViewItem.getTitle());
        TextView2.setText(Integer.toString(listViewItem.getDosu())+"% / 용량 : "+Integer.toString(listViewItem.getML())+"ml");
        TextView3.setText(listViewItem.getRegion());
        TextView4.setText(listViewItem.getType()+" / 별점 : "+Float.toString(listViewItem.getRating()));
        return view;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public Object getItem(int i) {
        return filteredItemList.get(i);
    }

    public void addItem(String title,String icon ,int dosu,String type,String region,int ml,float rating) {
        listviewitem item = new listviewitem();
        item.setTitle(title);
        item.setIcon(icon);
        item.setDosu(dosu);
        item.setML(ml);
        item.setRegion(region);
        item.setType(type);
        item.setRating(rating);
        listViewItemList.add(item);
    }

    @Override
    public Filter getFilter() {
        if (listFilter == null) {
            listFilter = new ListFilter() ;
        }
        return listFilter ;
    }

    private class ListFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            if (constraint == null || constraint.length() == 0) {
                results.values = listViewItemList ;
                results.count = listViewItemList.size() ;
            } else {
                ArrayList<listviewitem> itemList1 = new ArrayList<listviewitem>() ;

                for (listviewitem item : listViewItemList) {
                    if (item.getTitle().toUpperCase().contains(constraint.toString().toUpperCase()))
                    {
                        itemList1.add(item) ;
                    }
                }
                results.values = itemList1 ;
                results.count = itemList1.size() ;
            }
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            filteredItemList = (ArrayList<listviewitem>) results.values ;
            // notify
            if (results.count > 0) {
                notifyDataSetChanged() ;
            } else {
                notifyDataSetInvalidated() ;
            }
        }
    }
}
