package com.app.feature.location.store;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/app/feature/location/store/SharedPreferencesLastSentLocationStore;", "Lcom/app/feature/location/store/LastSentLocationStore;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "save", "", "location", "Landroid/location/Location;", "get", "saveStreamSent", "getStreamSent", "feature-location_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SharedPreferencesLastSentLocationStore implements LastSentLocationStore {

    @NotNull
    private final Context context;
    private final SharedPreferences prefs;

    public SharedPreferencesLastSentLocationStore(@NotNull Context context) {
        Intrinsics.echo(context, "context");
        this.context = context;
        this.prefs = context.getSharedPreferences("feature_location_last_sent", 0);
    }

    @Override // com.app.feature.location.store.LastSentLocationStore
    @Nullable
    public Location get() {
        float f5 = this.prefs.getFloat("last_latitude", 0.0f);
        float f10 = this.prefs.getFloat("last_longitude", 0.0f);
        long j5 = this.prefs.getLong("last_location_time", 0L);
        if (f5 == 0.0f && f10 == 0.0f && j5 == 0) {
            return null;
        }
        Location location = new Location("passive");
        location.setLatitude(f5);
        location.setLongitude(f10);
        location.setTime(j5);
        return location;
    }

    @Override // com.app.feature.location.store.LastSentLocationStore
    @Nullable
    public Location getStreamSent() {
        float f5 = this.prefs.getFloat("last_stream_sent_latitude", 0.0f);
        float f10 = this.prefs.getFloat("last_stream_sent_longitude", 0.0f);
        long j5 = this.prefs.getLong("last_stream_sent_time", 0L);
        if (f5 == 0.0f && f10 == 0.0f && j5 == 0) {
            return null;
        }
        Location location = new Location("passive");
        location.setLatitude(f5);
        location.setLongitude(f10);
        location.setTime(j5);
        return location;
    }

    @Override // com.app.feature.location.store.LastSentLocationStore
    public void save(@NotNull Location location) {
        Intrinsics.echo(location, "location");
        this.prefs.edit().putFloat("last_latitude", (float) location.getLatitude()).putFloat("last_longitude", (float) location.getLongitude()).putLong("last_location_time", location.getTime()).apply();
    }

    @Override // com.app.feature.location.store.LastSentLocationStore
    public void saveStreamSent(@NotNull Location location) {
        Intrinsics.echo(location, "location");
        this.prefs.edit().putFloat("last_stream_sent_latitude", (float) location.getLatitude()).putFloat("last_stream_sent_longitude", (float) location.getLongitude()).putLong("last_stream_sent_time", location.getTime()).apply();
    }
}
