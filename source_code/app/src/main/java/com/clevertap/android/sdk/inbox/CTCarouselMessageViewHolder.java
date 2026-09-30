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
class CTCarouselMessageViewHolder extends CTInboxBaseMessageViewHolder {
    private TextView carouselTimestamp;
    private final RelativeLayout clickLayout;
    private final CTCarouselViewPager imageViewPager;
    private final TextView message;
    private final LinearLayout sliderDots;
    private final TextView timestamp;
    private final TextView title;

    /* loaded from: classes3.dex */
    public class CarouselPageChangeListener implements h {
        private final Context context;
        private final ImageView[] dots;
        private final CTInboxMessage inboxMessage;
        private final CTCarouselMessageViewHolder viewHolder;

        public CarouselPageChangeListener(Context context, CTCarouselMessageViewHolder cTCarouselMessageViewHolder, ImageView[] imageViewArr, CTInboxMessage cTInboxMessage) {
            this.context = context;
            this.viewHolder = cTCarouselMessageViewHolder;
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
            this.viewHolder.title.setText(this.inboxMessage.getInboxMessageContents().get(i4).getTitle());
            this.viewHolder.title.setTextColor(Color.parseColor(this.inboxMessage.getInboxMessageContents().get(i4).getTitleColor()));
            this.viewHolder.message.setText(this.inboxMessage.getInboxMessageContents().get(i4).getMessage());
            this.viewHolder.message.setTextColor(Color.parseColor(this.inboxMessage.getInboxMessageContents().get(i4).getMessageColor()));
        }
    }

    public CTCarouselMessageViewHolder(View view) {
        super(view);
        this.imageViewPager = (CTCarouselViewPager) view.findViewById(R.id.image_carousel_viewpager);
        this.sliderDots = (LinearLayout) view.findViewById(R.id.sliderDots);
        this.title = (TextView) view.findViewById(R.id.messageTitle);
        this.message = (TextView) view.findViewById(R.id.messageText);
        this.timestamp = (TextView) view.findViewById(R.id.timestamp);
        this.clickLayout = (RelativeLayout) view.findViewById(R.id.body_linear_layout);
    }

    @Override // com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder
    public void configureWithMessage(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int i4) {
        super.configureWithMessage(cTInboxMessage, cTInboxListViewFragment, i4);
        CTInboxListViewFragment parent = getParent();
        Context applicationContext = cTInboxListViewFragment.getActivity().getApplicationContext();
        CTInboxMessageContent cTInboxMessageContent = cTInboxMessage.getInboxMessageContents().get(0);
        this.title.setVisibility(0);
        this.message.setVisibility(0);
        this.title.setText(cTInboxMessageContent.getTitle());
        this.title.setTextColor(Color.parseColor(cTInboxMessageContent.getTitleColor()));
        this.message.setText(cTInboxMessageContent.getMessage());
        this.message.setTextColor(Color.parseColor(cTInboxMessageContent.getMessageColor()));
        if (cTInboxMessage.isRead()) {
            this.readDot.setVisibility(8);
        } else {
            this.readDot.setVisibility(0);
        }
        this.timestamp.setVisibility(0);
        this.timestamp.setText(calculateDisplayTimestamp(cTInboxMessage.getDate()));
        this.timestamp.setTextColor(Color.parseColor(cTInboxMessageContent.getTitleColor()));
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
