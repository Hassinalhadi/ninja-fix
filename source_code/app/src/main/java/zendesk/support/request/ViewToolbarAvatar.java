package zendesk.support.request;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.squareup.picasso.Picasso;
import com.zendesk.util.CollectionUtils;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r1.C2483b;
import zendesk.support.R;
import zendesk.support.UiUtils;
import zendesk.support.ZendeskAvatarView;

/* loaded from: classes.dex */
class ViewToolbarAvatar extends FrameLayout {
    private static final int[] IMAGE_VIEW_IDS = {R.id.zs_request_toolbar_avatar_1, R.id.zs_request_toolbar_avatar_2, R.id.zs_request_toolbar_avatar_3, R.id.zs_request_toolbar_avatar_4, R.id.zs_request_toolbar_avatar_5};
    static final int MAX_IMAGES = 5;
    private final List<ZendeskAvatarView> avatarViews;
    private int imageRadius;
    private int strokeColor;
    private int strokeWidth;
    private List<C2483b> userInfo;

    public ViewToolbarAvatar(Context context) {
        this(context, null);
    }

    private void bindData(Picasso picasso) {
        for (int i4 = 0; i4 < this.avatarViews.size(); i4++) {
            ZendeskAvatarView zendeskAvatarView = this.avatarViews.get(i4);
            if (i4 < this.userInfo.size()) {
                C2483b c2483b = this.userInfo.get(i4);
                boolean hasLength = StringUtils.hasLength((String) c2483b.alpha);
                Object obj = c2483b.bravo;
                if (hasLength) {
                    zendeskAvatarView.showUserWithAvatarImage(picasso, (String) c2483b.alpha, (String) obj, this.imageRadius);
                } else {
                    zendeskAvatarView.showUserWithName((String) obj);
                }
                zendeskAvatarView.setVisibility(0);
            } else {
                zendeskAvatarView.setVisibility(8);
            }
        }
    }

    private ZendeskAvatarView createAndAddView(int i4) {
        ZendeskAvatarView zendeskAvatarView = new ZendeskAvatarView(getContext());
        zendeskAvatarView.setId(IMAGE_VIEW_IDS[i4]);
        zendeskAvatarView.setStroke(this.strokeColor, this.strokeWidth);
        int i5 = this.imageRadius * 2;
        int i10 = (i5 / 3) * i4 * 2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i5);
        layoutParams.gravity = 8388613;
        layoutParams.setMarginEnd(i10);
        addView(zendeskAvatarView, layoutParams);
        return zendeskAvatarView;
    }

    public void setImageUrls(Picasso picasso, List<C2483b> list) {
        if (list.size() > 5) {
            this.userInfo = list.subList(0, 5);
        } else {
            this.userInfo = CollectionUtils.copyOf(list);
        }
        Collections.reverse(this.userInfo);
        bindData(picasso);
    }

    public ViewToolbarAvatar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewToolbarAvatar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.avatarViews = new ArrayList(5);
        this.userInfo = new ArrayList(5);
        this.imageRadius = context.getResources().getDimensionPixelOffset(R.dimen.zs_request_toolbar_avatar_radius);
        this.strokeWidth = context.getResources().getDimensionPixelOffset(R.dimen.zs_request_toolbar_avatar_stroke_width);
        this.strokeColor = UiUtils.themeAttributeToColor(R.attr.colorPrimary, getContext(), R.color.zs_request_fallback_color_primary);
        for (int i5 = 0; i5 < 5; i5++) {
            ZendeskAvatarView createAndAddView = createAndAddView(i5);
            createAndAddView.setVisibility(8);
            this.avatarViews.add(createAndAddView);
        }
    }
}
