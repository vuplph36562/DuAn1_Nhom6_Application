package canhptph44323.fpoly.alo.duan1_nhom6_application.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

import canhptph44323.fpoly.alo.duan1_nhom6_application.R;


public class TrangChu_Fragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_trang_chu_, container, false);
        ArrayList<SlideModel> imageList = new ArrayList<>(); // Create image list

// imageList.add(new SlideModel("String Url" or R.drawable);
// imageList.add(new SlideModel("String Url" or R.drawable, "title"); You can add title

        imageList.add(new SlideModel(R.drawable.bunhaisan, "Nước dùng là loại nước cốt ninh các loại hải sản như tôm, cua, ghẹ,...", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.buasang1, "Đặc sản nổi tiếng từ 3 miền.",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.buasang2, "Bánh mì áp chảo thơm ngon , giòn đến miếng cuối cùng.",ScaleTypes.CENTER_CROP));

        ImageSlider imageSlider = view.findViewById(R.id.image_slider);
        imageSlider.setImageList(imageList);
        return view;

    }
}