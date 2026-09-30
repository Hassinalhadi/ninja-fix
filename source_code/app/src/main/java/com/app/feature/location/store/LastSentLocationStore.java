package com.app.feature.location.store;

import android.location.Location;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0005H&¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/app/feature/location/store/LastSentLocationStore;", "", "save", "", "location", "Landroid/location/Location;", "get", "saveStreamSent", "getStreamSent", "feature-location_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LastSentLocationStore {
    @Nullable
    Location get();

    @Nullable
    Location getStreamSent();

    void save(@NotNull Location location);

    void saveStreamSent(@NotNull Location location);
}
