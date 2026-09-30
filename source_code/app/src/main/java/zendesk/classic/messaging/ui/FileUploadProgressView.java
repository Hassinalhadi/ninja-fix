package zendesk.classic.messaging.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import zendesk.classic.messaging.R;
import zendesk.commonui.UiUtils;

/* loaded from: classes.dex */
public class FileUploadProgressView extends ProgressBar {
    public FileUploadProgressView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setIndeterminate(true);
        getIndeterminateDrawable().setColorFilter(UiUtils.themeAttributeToColor(R.attr.colorPrimary, getContext(), R.color.zui_color_primary), PorterDuff.Mode.SRC_IN);
    }

    public FileUploadProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public FileUploadProgressView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }
}
