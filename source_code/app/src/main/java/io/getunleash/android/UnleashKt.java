package io.getunleash.android;

import io.getunleash.android.data.Variant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"disabledVariant", "Lio/getunleash/android/data/Variant;", "getDisabledVariant", "()Lio/getunleash/android/data/Variant;", "unleashandroidsdk_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UnleashKt {

    @NotNull
    private static final Variant disabledVariant = new Variant("disabled", false, false, null, 14, null);

    @NotNull
    public static final Variant getDisabledVariant() {
        return disabledVariant;
    }
}
