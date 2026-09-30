package io.getunleash.android.metrics;

import com.clevertap.android.sdk.db.Column;
import io.getunleash.android.data.Variant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH&J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lio/getunleash/android/metrics/UnleashMetricsBucket;", "", Column.COUNT, "", "featureName", "", "enabled", "increment", "", "countVariant", "Lio/getunleash/android/data/Variant;", "variant", "isEmpty", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface UnleashMetricsBucket {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    boolean count(@NotNull String featureName, boolean enabled, int increment);

    @NotNull
    Variant countVariant(@NotNull String featureName, @NotNull Variant variant, int increment);

    boolean isEmpty();
}
