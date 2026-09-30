package com.checkout.components.ui.model.style.base;

import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.checkout.components.ui.utils.constants.DesignConstants;
import com.checkout.components.ui.utils.constants.ErrorConstants;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/checkout/components/ui/model/style/base/DefaultTextLabelStyle;", "", "<init>", "()V", RedirectCustomTabEventLogger.RESULT_ERROR, "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", Constants.KEY_COLOR, "", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultTextLabelStyle {
    public static final int $stable = 0;

    @NotNull
    public static final DefaultTextLabelStyle INSTANCE = new DefaultTextLabelStyle();

    private DefaultTextLabelStyle() {
    }

    public static /* synthetic */ TextLabelStyle error$default(DefaultTextLabelStyle defaultTextLabelStyle, long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j5 = ErrorConstants.INSTANCE.getColor();
        }
        return defaultTextLabelStyle.error(j5);
    }

    @NotNull
    public final TextLabelStyle error(long color) {
        return new TextLabelStyle(null, null, new TextStyle(12, DesignConstants.INSTANCE.getFontFamily(), null, null, color, null, 0, null, null, null, 1004, null), false, 11, null);
    }
}
