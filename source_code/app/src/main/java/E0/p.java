package E0;

import android.text.Layout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class p {
    public static final Layout.Alignment alpha;
    public static final Layout.Alignment bravo;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (Intrinsics.areEqual(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (Intrinsics.areEqual(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        alpha = alignment;
        bravo = alignment2;
    }
}
