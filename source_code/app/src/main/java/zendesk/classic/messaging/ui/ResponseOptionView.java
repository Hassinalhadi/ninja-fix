package zendesk.classic.messaging.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.zendesk.logger.Logger;
import zendesk.classic.messaging.R;
import zendesk.commonui.UiUtils;

/* loaded from: classes.dex */
public class ResponseOptionView extends AppCompatTextView {
    private static final String LOG_TAG = "ResponseOptionView";

    public ResponseOptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        setBackgroundDrawable(getContext().getDrawable(R.drawable.zui_background_response_option));
        int themeAttributeToColor = UiUtils.themeAttributeToColor(R.attr.colorPrimary, getContext(), R.color.zui_color_primary);
        setTextColor(themeAttributeToColor);
        Drawable mutate = getBackground().mutate();
        if (mutate instanceof GradientDrawable) {
            ((GradientDrawable) mutate).setStroke((int) getResources().getDimension(R.dimen.zui_cell_response_option_stroke_width), themeAttributeToColor);
        } else {
            Logger.w(LOG_TAG, "Unable to set stroke on background as background is not of type GradientDrawable", new Object[0]);
        }
    }

    public ResponseOptionView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }

    public ResponseOptionView(Context context) {
        super(context, null);
        init();
    }
}
