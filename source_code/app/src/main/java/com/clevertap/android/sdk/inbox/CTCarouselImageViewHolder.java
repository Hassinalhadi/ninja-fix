package com.clevertap.android.sdk.inbox;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.h;
import com.clevertap.android.sdk.R;
import i1.k;

/* loaded from: classes3.dex */
class CTCarouselImageViewHolder extends CTInboxBaseMessageViewHolder {
    private final TextView carouselTimestamp;
    private final RelativeLayout clickLayout;
    private final CTCarouselViewPager imageViewPager;
    private final LinearLayout sliderDots;

    /* loaded from: classes3.dex */
    public class CarouselPageChangeListener implements h {
        private final Context context;
        private final ImageView[] dots;
        private final CTInboxMessage inboxMessage;
        private final CTCarouselImageViewHolder viewHolder;

        public CarouselPageChangeListener(Context context, CTCarouselImageViewHolder cTCarouselImageViewHolder, ImageView[] imageViewArr, CTInboxMessage cTInboxMessage) {
            this.context = context;
            this.viewHolder = cTCarouselImageViewHolder;
            this.dots = imageViewArr;
            this.inboxMessage = cTInboxMessage;
            ImageView imageView = imageViewArr[0];
            Resources resources = context.getResources();
            int i4 = R.drawable.ct_selected_dot;
            ThreadLocal threadLocal = k.alpha;
            imageView.setImageDrawable(resources.getDrawable(i4, null));
        }

        @Override // androidx.viewpager.widget.h
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.h
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.h
        public void onPageSelected(int i4) {
            for (ImageView imageView : this.dots) {
                Resources resources = this.context.getResources();
                int i5 = R.drawable.ct_unselected_dot;
                ThreadLocal threadLocal = k.alpha;
                imageView.setImageDrawable(resources.getDrawable(i5, null));
            }
            ImageView imageView2 = this.dots[i4];
            Resources resources2 = this.context.getResources();
            int i10 = R.drawable.ct_selected_dot;
            ThreadLocal threadLocal2 = k.alpha;
            imageView2.setImageDrawable(resources2.getDrawable(i10, null));
        }
    }

    public CTCarouselImageViewHolder(View view) {
        super(view);
        this.imageViewPager = (CTCarouselViewPager) view.findViewById(R.id.image_carousel_viewpager);
        this.sliderDots = (LinearLayout) view.findViewById(R.id.sliderDots);
        this.carouselTimestamp = (TextView) view.findViewById(R.id.carousel_timestamp);
        this.clickLayout = (RelativeLayout) view.findViewById(R.id.body_linear_layout);
    }

    @Override // com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder
    public void configureWithMessage(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int i4) {
        super.configureWithMessage(cTInboxMessage, cTInboxListViewFragment, i4);
        CTInboxListViewFragment parent = getParent();
        Context applicationContext = cTInboxListViewFragment.getActivity().getApplicationContext();
        CTInboxMessageContent cTInboxMessageContent = cTInboxMessage.getInboxMessageContents().get(0);
        this.carouselTimestamp.setVisibility(0);
        if (cTInboxMessage.isRead()) {
            this.readDot.setVisibility(8);
        } else {
            this.readDot.setVisibility(0);
        }
        this.carouselTimestamp.setText(calculateDisplayTimestamp(cTInboxMessage.getDate()));
        this.carouselTimestamp.setTextColor(Color.parseColor(cTInboxMessageContent.getTitleColor()));
        this.clickLayout.setBackgroundColor(Color.parseColor(cTInboxMessage.getBgColor()));
        this.imageViewPager.setAdapter(new CTCarouselViewPagerAdapter(applicationContext, cTInboxListViewFragment, cTInboxMessage, (LinearLayout.LayoutParams) this.imageViewPager.getLayoutParams(), i4));
        int size = cTInboxMessage.getInboxMessageContents().size();
        if (this.sliderDots.getChildCount() > 0) {
            this.sliderDots.removeAllViews();
        }
        ImageView[] imageViewArr = new ImageView[size];
        setDots(imageViewArr, size, applicationContext, this.sliderDots);
        ImageView imageView = imageViewArr[0];
        Resources resources = applicationContext.getResources();
        int i5 = R.drawable.ct_selected_dot;
        ThreadLocal threadLocal = k.alpha;
        imageView.setImageDrawable(resources.getDrawable(i5, null));
        this.imageViewPager.addOnPageChangeListener(new CarouselPageChangeListener(cTInboxListViewFragment.getActivity().getApplicationContext(), this, imageViewArr, cTInboxMessage));
        this.clickLayout.setOnClickListener(new CTInboxButtonClickListener(i4, cTInboxMessage, (String) null, parent, (ViewPager) this.imageViewPager, true, -1));
        markItemAsRead(cTInboxMessage, i4);
    }
}
