package com.clevertap.android.sdk.inapp;

import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.inapp.store.preference.ImpressionStore;
import com.clevertap.android.sdk.inapp.store.preference.StoreRegistry;
import com.clevertap.android.sdk.utils.Clock;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\u0011\u001a\u00020\u00122\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fJ\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\u0010J\u0016\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0010J\u0016\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0010J\u0016\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0010J\u0016\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0010J\u0016\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0010J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\fH\u0002J\u001d\u0010!\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u000eH\u0000¢\u0006\u0002\b#J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0%2\u0006\u0010\u0014\u001a\u00020\fJ\u0006\u0010&\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/clevertap/android/sdk/inapp/ImpressionManager;", "", "storeRegistry", "Lcom/clevertap/android/sdk/inapp/store/preference/StoreRegistry;", "clock", "Lcom/clevertap/android/sdk/utils/Clock;", "locale", "Ljava/util/Locale;", "<init>", "(Lcom/clevertap/android/sdk/inapp/store/preference/StoreRegistry;Lcom/clevertap/android/sdk/utils/Clock;Ljava/util/Locale;)V", "sessionImpressions", "", "", "", "", "sessionImpressionsTotal", "", "setSessionImpressions", "", "recordImpression", Column.CAMPAIGN, "perSession", "perSessionTotal", "perSecond", "seconds", "perMinute", "minutes", "perHour", "hours", "perDay", "days", "perWeek", "weeks", "getImpressionCount", "timestampStart", "getImpressionCount$clevertap_core_release", "getImpressions", "", "clearSessionData", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImpressionManager {

    @NotNull
    private final Clock clock;

    @NotNull
    private final Locale locale;

    @NotNull
    private Map<String, List<Long>> sessionImpressions;
    private int sessionImpressionsTotal;

    @NotNull
    private final StoreRegistry storeRegistry;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImpressionManager(@NotNull StoreRegistry storeRegistry) {
        this(storeRegistry, null, null, 6, null);
        Intrinsics.echo(storeRegistry, "storeRegistry");
    }

    private final int getImpressionCount(String campaignId) {
        List<Long> read;
        ImpressionStore impressionStore = this.storeRegistry.getImpressionStore();
        if (impressionStore != null && (read = impressionStore.read(campaignId)) != null) {
            return read.size();
        }
        return 0;
    }

    public final void clearSessionData() {
        this.sessionImpressions.clear();
        this.sessionImpressionsTotal = 0;
    }

    public final int getImpressionCount$clevertap_core_release(@NotNull String campaignId, long timestampStart) {
        Intrinsics.echo(campaignId, "campaignId");
        List<Long> impressions = getImpressions(campaignId);
        int size = impressions.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            if (impressions.get(i5).longValue() < timestampStart) {
                i4 = i5 + 1;
            } else {
                size = i5 - 1;
            }
        }
        return impressions.size() - i4;
    }

    @NotNull
    public final List<Long> getImpressions(@NotNull String campaignId) {
        List<Long> read;
        Intrinsics.echo(campaignId, "campaignId");
        ImpressionStore impressionStore = this.storeRegistry.getImpressionStore();
        if (impressionStore != null && (read = impressionStore.read(campaignId)) != null) {
            return read;
        }
        return CollectionsKt.emptyList();
    }

    public final int perDay(@NotNull String campaignId, int days) {
        Intrinsics.echo(campaignId, "campaignId");
        Calendar calendar = Calendar.getInstance(this.locale);
        calendar.setTime(new Date());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(6, -days);
        return getImpressionCount$clevertap_core_release(campaignId, TimeUnit.MILLISECONDS.toSeconds(calendar.getTime().getTime()));
    }

    public final int perHour(@NotNull String campaignId, int hours) {
        Intrinsics.echo(campaignId, "campaignId");
        return getImpressionCount$clevertap_core_release(campaignId, this.clock.currentTimeSeconds() - TimeUnit.HOURS.toSeconds(hours));
    }

    public final int perMinute(@NotNull String campaignId, int minutes) {
        Intrinsics.echo(campaignId, "campaignId");
        return getImpressionCount$clevertap_core_release(campaignId, this.clock.currentTimeSeconds() - TimeUnit.MINUTES.toSeconds(minutes));
    }

    public final int perSecond(@NotNull String campaignId, int seconds) {
        Intrinsics.echo(campaignId, "campaignId");
        return getImpressionCount$clevertap_core_release(campaignId, this.clock.currentTimeSeconds() - seconds);
    }

    public final int perSession(@NotNull String campaignId) {
        Intrinsics.echo(campaignId, "campaignId");
        List<Long> list = this.sessionImpressions.get(campaignId);
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: perSessionTotal, reason: from getter */
    public final int getSessionImpressionsTotal() {
        return this.sessionImpressionsTotal;
    }

    public final int perWeek(@NotNull String campaignId, int weeks) {
        Intrinsics.echo(campaignId, "campaignId");
        Calendar calendar = Calendar.getInstance(this.locale);
        calendar.setTime(new Date());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(6, -(((calendar.get(7) - calendar.getFirstDayOfWeek()) + 7) % 7));
        if (weeks > 1) {
            calendar.add(3, -weeks);
        }
        return getImpressionCount$clevertap_core_release(campaignId, TimeUnit.MILLISECONDS.toSeconds(calendar.getTimeInMillis()));
    }

    public final void recordImpression(@NotNull String campaignId) {
        Intrinsics.echo(campaignId, "campaignId");
        this.sessionImpressionsTotal++;
        long currentTimeSeconds = this.clock.currentTimeSeconds();
        Map<String, List<Long>> map = this.sessionImpressions;
        List<Long> list = map.get(campaignId);
        if (list == null) {
            list = new ArrayList<>();
            map.put(campaignId, list);
        }
        list.add(Long.valueOf(currentTimeSeconds));
        ImpressionStore impressionStore = this.storeRegistry.getImpressionStore();
        if (impressionStore != null) {
            impressionStore.write(campaignId, currentTimeSeconds);
        }
    }

    public final void setSessionImpressions(@NotNull Map<String, List<Long>> sessionImpressions) {
        Intrinsics.echo(sessionImpressions, "sessionImpressions");
        this.sessionImpressions.clear();
        this.sessionImpressions.putAll(sessionImpressions);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImpressionManager(@NotNull StoreRegistry storeRegistry, @NotNull Clock clock) {
        this(storeRegistry, clock, null, 4, null);
        Intrinsics.echo(storeRegistry, "storeRegistry");
        Intrinsics.echo(clock, "clock");
    }

    public ImpressionManager(@NotNull StoreRegistry storeRegistry, @NotNull Clock clock, @NotNull Locale locale) {
        Intrinsics.echo(storeRegistry, "storeRegistry");
        Intrinsics.echo(clock, "clock");
        Intrinsics.echo(locale, "locale");
        this.storeRegistry = storeRegistry;
        this.clock = clock;
        this.locale = locale;
        this.sessionImpressions = new LinkedHashMap();
    }

    public /* synthetic */ ImpressionManager(StoreRegistry storeRegistry, Clock clock, Locale locale, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(storeRegistry, (i4 & 2) != 0 ? Clock.SYSTEM : clock, (i4 & 4) != 0 ? Locale.getDefault() : locale);
    }
}
