package com.app.feature.location.api;

import android.location.Location;
import androidx.fragment.app.an;
import com.google.android.gms.tasks.Task;
import k3.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.InterfaceC3439i;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\nJ#\u0010\u0011\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H&¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lcom/app/feature/location/api/LocationFeature;", "", "Landroidx/fragment/app/an;", "activity", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/location/h;", "startMonitoring", "(Landroidx/fragment/app/an;)Lcom/google/android/gms/tasks/Task;", "", "stopMonitoring", "()V", "updateBaseActivity", "(Landroidx/fragment/app/an;)V", "retryPendingSettingsResolution", "Lkotlin/Function1;", "Lk3/f;", "callback", "requestSendCurrentLocationIfNeeded", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/location/Location;", "getLastSentLocation", "()Landroid/location/Location;", "getLastStreamSentLocation", "Lyf/i;", "Lcom/app/feature/location/api/LocationState;", "stateFlow", "()Lyf/i;", "feature-location_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LocationFeature {
    @Nullable
    Location getLastSentLocation();

    @Nullable
    Location getLastStreamSentLocation();

    void requestSendCurrentLocationIfNeeded(@NotNull Function1<? super f, Unit> callback);

    void retryPendingSettingsResolution();

    @Nullable
    Task startMonitoring(@Nullable an activity);

    @NotNull
    InterfaceC3439i stateFlow();

    void stopMonitoring();

    void updateBaseActivity(@Nullable an activity);
}
