package zendesk.classic.messaging.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import zendesk.classic.messaging.R;
import zendesk.commonui.UiUtils;

/* loaded from: classes.dex */
public class ResponseOptionSelectedView extends AppCompatTextView {
    private static final String LOG_TAG = "ResponseOptionSelectedV";

    public ResponseOptionSelectedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        setTextColor(getContext().getColor(R.color.zui_color_white_100));
        setBackgroundDrawable(getContext().getDrawable(R.drawable.zui_background_response_option_selected));
        getBackground().mutate().setColorFilter(new PorterDuffColorFilter(UiUtils.themeAttributeToColor(R.attr.colorPrimary, getContext(), R.color.zui_color_primary), PorterDuff.Mode.SRC_ATOP));
    }

    public ResponseOptionSelectedView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }

    public ResponseOptionSelectedView(Context context) {
        super(context, null);
        init();
    }
}
