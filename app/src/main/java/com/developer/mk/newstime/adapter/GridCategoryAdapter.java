//package com.developer.mk.newstime.adapter;
//
//import android.content.Context;
//import android.graphics.Color;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.TextView;
//
//import com.bumptech.glide.Glide;
//import com.developer.mk.newstime.R;
//import com.developer.mk.newstime.model.HomepageModel;
//
//import java.util.List;
//
//import de.hdodenhof.circleimageview.CircleImageView;
//
//public class GridCategoryAdapter extends BaseAdapter {
//    LayoutInflater layoutInflater;
//    Context context;
//    List<HomepageModel.CategoryBotton> categoryBottons;
//
//    // Constructor
//    public GridCategoryAdapter(Context context, List<HomepageModel.CategoryBotton> categoryBottons) {
//        this.context = context;
//        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
//
//        this.categoryBottons = categoryBottons;
//
//
//    }
//
//    @Override
//    public int getCount() {
//        return categoryBottons.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return categoryBottons.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ViewHOldery hOldery = null;
//
//        if (convertView == null)
//        {
//            convertView  = layoutInflater.inflate(R.layout.item_category_layout,null);
//            hOldery = new ViewHOldery();
//            hOldery.circleImageView = convertView.findViewById(R.id.category_image);
//            hOldery.textView = convertView.findViewById(R.id.text_category);
//            convertView.setTag(hOldery);
//        }else{
//            hOldery = (ViewHOldery) convertView.getTag();
//        }
//
//        // We missed to pass the data to text and imageview
//        // we will use our friend: "GLIDE"
//        hOldery.textView.setText(categoryBottons.get(position).getName());
//        Glide.with(context)
//                .load(categoryBottons.get(position).getImage()).into(hOldery.circleImageView);
//
//
//        if (categoryBottons.get(position).getColor() != null) {
//            hOldery.circleImageView.setCircleBackgroundColor(Color.parseColor(categoryBottons.get(position).getColor()));
//            hOldery.circleImageView.setBorderColor(Color.parseColor(categoryBottons.get(position).getColor()));
//        }
//
//        return convertView;
//    }
//
//
//
//
//
//
//
//
//    //Let's create a viewholder
//    static class ViewHOldery{
//        CircleImageView circleImageView;
//        TextView textView;
//    }
//
//    // We will create a real Category class that fetches data from net
//
//
//}
//
//
//// Very Good!
//// Keep Coding....