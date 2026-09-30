package io.getunleash.android;

import io.getunleash.android.data.UnleashContext;
import io.getunleash.android.data.Variant;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ Variant alpha(Unleash unleash, String str, Variant variant, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                variant = UnleashKt.getDisabledVariant();
            }
            return unleash.getVariant(str, variant);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVariant");
    }

    public static /* synthetic */ void bravo(Unleash unleash, UnleashContext unleashContext, long j5, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                j5 = 5000;
            }
            unleash.setContextWithTimeout(unleashContext, j5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setContextWithTimeout");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void charlie(Unleash unleash, List list, File file, List list2, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                list = CollectionsKt.emptyList();
            }
            if ((i4 & 2) != 0) {
                file = null;
            }
            if ((i4 & 4) != 0) {
                list2 = CollectionsKt.emptyList();
            }
            unleash.start(list, file, list2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
    }
}
