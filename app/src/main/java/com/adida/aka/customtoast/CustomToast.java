package com.adida.aka.customtoast;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by Aka on 7/1/2017.
 */

public class CustomToast extends Toast {
    private Context mContext;
    private ImageView mIvIcon;
    private TextView mTvContent;

    public final int ICON_LIST[] = {
            R.drawable.heart1_red,
            R.drawable.heart_normal,
            R.drawable.home_normal,
            R.drawable.heart_red,
            R.drawable.ic_star_black_24dp,
            R.drawable.ic_star_border_black_24dp

    };

    public final String NAME_LIST[] = {
        "Red Heart",
        "Normal Heart",
        "Normal Home",
        "Red Heart new",
        "Black Start",
        "Black Start new"
    };

    public CustomToast(Context context) {
        super(context);
        this.mContext = context;
        initView();
    }

    private void initView() {
        setDuration(Toast.LENGTH_LONG);
        setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
        View view = View.inflate(mContext, R.layout.item_toast, null);
        mIvIcon = (ImageView) view.findViewById(R.id.iv_icon);
        mTvContent = (TextView) view.findViewById(R.id.tv_content);
        setView(view);
    }

    @Override
    public void show() {
        Random random = new Random();
        int result =  random.nextInt(NAME_LIST.length -1);
        mIvIcon.setImageResource(ICON_LIST[result]);
        mTvContent.setText(NAME_LIST[result]);
        super.show();
    }
}
