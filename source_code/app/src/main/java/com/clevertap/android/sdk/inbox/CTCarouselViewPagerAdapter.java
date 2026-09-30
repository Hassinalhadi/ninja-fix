package com.clevertap.android.sdk.inbox;

import U3.g;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.R;
import com.clevertap.android.sdk.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class CTCarouselViewPagerAdapter extends androidx.viewpager.widget.a {
    private final ArrayList<CTInboxImageData> carouselImagesData;
    private final Context context;
    private final CTInboxMessage inboxMessage;
    private LayoutInflater layoutInflater;
    private final LinearLayout.LayoutParams layoutParams;
    private final WeakReference<CTInboxListViewFragment> parentWeakReference;
    private final int row;
    private View view;

    public CTCarouselViewPagerAdapter(Context context, CTInboxListViewFragment cTInboxListViewFragment, CTInboxMessage cTInboxMessage, LinearLayout.LayoutParams layoutParams, int i4) {
        this.context = context;
        this.parentWeakReference = new WeakReference<>(cTInboxListViewFragment);
        this.carouselImagesData = cTInboxMessage.getCarouselImagesData();
        this.layoutParams = layoutParams;
        this.inboxMessage = cTInboxMessage;
        this.row = i4;
    }

    public void addImageAndSetClick(ImageView imageView, View view, final int i4, ViewGroup viewGroup) {
        imageView.setVisibility(0);
        String contentDescription = this.carouselImagesData.get(i4).getContentDescription();
        if (contentDescription.isEmpty()) {
            contentDescription = this.context.getString(R.string.ct_inbox_image_content_description) + (i4 + 1);
        }
        imageView.setContentDescription(contentDescription);
        try {
            com.bumptech.glide.b.echo(imageView.getContext()).quebec(this.carouselImagesData.get(i4).getUrl()).alpha(((g) new U3.a().lima(Utils.getThumbnailImage(this.context, Constants.IMAGE_PLACEHOLDER))).foxtrot(Utils.getThumbnailImage(this.context, Constants.IMAGE_PLACEHOLDER))).azure(imageView);
        } catch (NoSuchMethodError unused) {
            Logger.d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
            com.bumptech.glide.b.echo(imageView.getContext()).quebec(this.carouselImagesData.get(i4).getUrl()).azure(imageView);
        }
        viewGroup.addView(view, this.layoutParams);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.clevertap.android.sdk.inbox.CTCarouselViewPagerAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                CTInboxListViewFragment parent = CTCarouselViewPagerAdapter.this.getParent();
                if (parent != null) {
                    parent.handleViewPagerClick(CTCarouselViewPagerAdapter.this.row, i4);
                }
            }
        });
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.carouselImagesData.size();
    }

    public CTInboxListViewFragment getParent() {
        return this.parentWeakReference.get();
    }

    @Override // androidx.viewpager.widget.a
    public Object instantiateItem(ViewGroup viewGroup, int i4) {
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService("layout_inflater");
        this.layoutInflater = layoutInflater;
        this.view = layoutInflater.inflate(R.layout.inbox_carousel_image_layout, viewGroup, false);
        try {
            if (this.inboxMessage.getOrientation().equalsIgnoreCase("l")) {
                addImageAndSetClick((ImageView) this.view.findViewById(R.id.imageView), this.view, i4, viewGroup);
            } else if (this.inboxMessage.getOrientation().equalsIgnoreCase("p")) {
                addImageAndSetClick((ImageView) this.view.findViewById(R.id.squareImageView), this.view, i4, viewGroup);
            }
        } catch (NoClassDefFoundError unused) {
            Logger.d("CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info");
        }
        return this.view;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
