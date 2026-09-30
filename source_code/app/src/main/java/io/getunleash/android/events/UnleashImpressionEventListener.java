package io.getunleash.android.events;

import com.clevertap.android.sdk.leanplum.Constants;
import io.getunleash.android.data.ImpressionEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/getunleash/android/events/UnleashImpressionEventListener;", "Lio/getunleash/android/events/UnleashListener;", "onImpression", "", Constants.CHARGED_EVENT_PARAM, "Lio/getunleash/android/data/ImpressionEvent;", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface UnleashImpressionEventListener extends UnleashListener {
    void onImpression(@NotNull ImpressionEvent event);
}
