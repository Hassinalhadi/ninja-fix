package zendesk.classic.messaging.ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import zendesk.classic.messaging.R;
import zendesk.commonui.UiUtils;

/* loaded from: classes.dex */
public class AttachmentsIndicator extends FrameLayout {
    private static final int COUNT_THRESHOLD = 9;
    private static final String COUNT_THRESHOLD_TEXT = String.valueOf(9) + "+";
    private int attachmentsCount;
    private View attachmentsIndicatorBottomBorder;
    private TextView attachmentsIndicatorCounter;
    private ImageView attachmentsIndicatorIcon;
    private int colorActive;
    private int colorInactive;

    public AttachmentsIndicator(Context context) {
        super(context);
        init(context);
    }

    public static String getContentDescriptionForAttachmentButton(Context context, int i4) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(R.string.zui_attachment_indicator_accessibility));
        sb2.append(". ");
        if (i4 == 0) {
            sb2.append(context.getString(R.string.zui_attachment_indicator_no_attachments_selected_accessibility));
        } else if (i4 == 1) {
            sb2.append(context.getString(R.string.zui_attachment_indicator_one_attachments_selected_accessibility));
        } else {
            sb2.append(context.getString(R.string.zui_attachment_indicator_n_attachments_selected_accessibility, Integer.valueOf(i4)));
        }
        return sb2.toString();
    }

    public void enableActiveState(boolean z2) {
        int i4;
        if (z2) {
            i4 = this.colorActive;
        } else {
            i4 = this.colorInactive;
        }
        UiUtils.setTint(i4, this.attachmentsIndicatorIcon.getDrawable(), this.attachmentsIndicatorIcon);
    }

    public int getAttachmentsCount() {
        return this.attachmentsCount;
    }

    public void init(Context context) {
        View.inflate(context, R.layout.zui_view_attachments_indicator, this);
        if (isInEditMode()) {
            return;
        }
        this.attachmentsIndicatorIcon = (ImageView) findViewById(R.id.attachments_indicator_icon);
        this.attachmentsIndicatorBottomBorder = findViewById(R.id.attachments_indicator_bottom_border);
        this.attachmentsIndicatorCounter = (TextView) findViewById(R.id.attachments_indicator_counter);
        this.colorActive = UiUtils.themeAttributeToColor(R.attr.colorPrimary, context, R.color.zui_color_primary);
        this.colorInactive = UiUtils.resolveColor(R.color.zui_attachment_indicator_color_inactive, context);
        ((GradientDrawable) ((LayerDrawable) this.attachmentsIndicatorCounter.getBackground()).findDrawableByLayerId(R.id.inner_circle)).setColor(this.colorActive);
        setContentDescription(getContentDescriptionForAttachmentButton(getContext(), this.attachmentsCount));
    }

    public void reset() {
        setCounterVisible(false);
        setAttachmentsCount(0);
        setBottomBorderVisible(false);
        enableActiveState(false);
    }

    public void setAttachmentsCount(int i4) {
        int i5;
        String valueOf;
        boolean z2;
        this.attachmentsCount = i4;
        if (i4 > 9) {
            i5 = R.dimen.zui_attachment_indicator_counter_width_double_digit;
        } else {
            i5 = R.dimen.zui_attachment_indicator_counter_width_single_digit;
        }
        ViewGroup.LayoutParams layoutParams = this.attachmentsIndicatorCounter.getLayoutParams();
        layoutParams.width = getResources().getDimensionPixelSize(i5);
        this.attachmentsIndicatorCounter.setLayoutParams(layoutParams);
        TextView textView = this.attachmentsIndicatorCounter;
        if (i4 > 9) {
            valueOf = COUNT_THRESHOLD_TEXT;
        } else {
            valueOf = String.valueOf(i4);
        }
        textView.setText(valueOf);
        if (i4 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        setCounterVisible(z2);
        setBottomBorderVisible(z2);
        enableActiveState(z2);
        setContentDescription(getContentDescriptionForAttachmentButton(getContext(), i4));
    }

    public void setBottomBorderVisible(boolean z2) {
        int i4;
        View view = this.attachmentsIndicatorBottomBorder;
        if (z2) {
            i4 = 0;
        } else {
            i4 = 4;
        }
        view.setVisibility(i4);
    }

    public void setCounterVisible(boolean z2) {
        int i4;
        TextView textView = this.attachmentsIndicatorCounter;
        if (z2) {
            i4 = 0;
        } else {
            i4 = 4;
        }
        textView.setVisibility(i4);
    }

    public AttachmentsIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public AttachmentsIndicator(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init(context);
    }

    public AttachmentsIndicator(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        init(context);
    }
}
