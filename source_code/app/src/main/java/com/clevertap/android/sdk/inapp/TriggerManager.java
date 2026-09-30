package com.clevertap.android.sdk.inapp;

import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.DeviceInfo;
import com.clevertap.android.sdk.StorageHelper;
import com.clevertap.android.sdk.db.Column;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0005J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J \u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0012H\u0002J\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019J\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00030\u00030\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/clevertap/android/sdk/inapp/TriggerManager;", "", "context", "Landroid/content/Context;", "accountId", "", "deviceInfo", "Lcom/clevertap/android/sdk/DeviceInfo;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/clevertap/android/sdk/DeviceInfo;)V", "contextRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getContextRef", "()Ljava/lang/ref/WeakReference;", "setContextRef", "(Ljava/lang/ref/WeakReference;)V", "getTriggers", "", Column.CAMPAIGN, "increment", "", "removeTriggers", "read", "prefs", "Landroid/content/SharedPreferences;", "storageKey", "write", "triggerCount", "sharedPrefs", "getTriggersKey", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TriggerManager {

    @NotNull
    public static final String PREF_PREFIX = "__triggers";

    @NotNull
    private final String accountId;

    @NotNull
    private WeakReference<Context> contextRef;

    @NotNull
    private final DeviceInfo deviceInfo;

    public TriggerManager(@NotNull Context context, @NotNull String accountId, @NotNull DeviceInfo deviceInfo) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(accountId, "accountId");
        Intrinsics.echo(deviceInfo, "deviceInfo");
        this.accountId = accountId;
        this.deviceInfo = deviceInfo;
        this.contextRef = new WeakReference<>(context);
    }

    private final int read(SharedPreferences prefs, String storageKey) {
        return prefs.getInt(storageKey, 0);
    }

    private final void write(SharedPreferences prefs, String storageKey, int triggerCount) {
        prefs.edit().putInt(storageKey, triggerCount).apply();
    }

    @NotNull
    public final WeakReference<Context> getContextRef() {
        return this.contextRef;
    }

    public final int getTriggers(@NotNull String campaignId) {
        Intrinsics.echo(campaignId, "campaignId");
        SharedPreferences sharedPrefs = sharedPrefs();
        if (sharedPrefs == null) {
            return 0;
        }
        return read(sharedPrefs, getTriggersKey(campaignId));
    }

    @NotNull
    public final String getTriggersKey(@NotNull String campaignId) {
        Intrinsics.echo(campaignId, "campaignId");
        return "__triggers_".concat(campaignId);
    }

    public final void increment(@NotNull String campaignId) {
        Intrinsics.echo(campaignId, "campaignId");
        SharedPreferences sharedPrefs = sharedPrefs();
        if (sharedPrefs == null) {
            return;
        }
        write(sharedPrefs, getTriggersKey(campaignId), getTriggers(campaignId) + 1);
    }

    public final void removeTriggers(@NotNull String campaignId) {
        Intrinsics.echo(campaignId, "campaignId");
        SharedPreferences sharedPrefs = sharedPrefs();
        if (sharedPrefs == null) {
            return;
        }
        sharedPrefs.edit().remove(getTriggersKey(campaignId)).apply();
    }

    public final void setContextRef(@NotNull WeakReference<Context> weakReference) {
        Intrinsics.echo(weakReference, "<set-?>");
        this.contextRef = weakReference;
    }

    @Nullable
    public final SharedPreferences sharedPrefs() {
        String str = "triggers_per_inapp:" + this.deviceInfo.getDeviceID() + ':' + this.accountId;
        Context context = this.contextRef.get();
        if (context == null) {
            return null;
        }
        return StorageHelper.getPreferences(context, str);
    }
}
