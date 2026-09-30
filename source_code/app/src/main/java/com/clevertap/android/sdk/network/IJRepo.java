package com.clevertap.android.sdk.network;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.StorageHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0007J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/clevertap/android/sdk/network/IJRepo;", "", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "<init>", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)V", "setI", "", "context", "Landroid/content/Context;", "i", "", "setJ", "j", "getI", "getJ", "clearIJ", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IJRepo {

    @NotNull
    private final CleverTapInstanceConfig config;

    public IJRepo(@NotNull CleverTapInstanceConfig config) {
        Intrinsics.echo(config, "config");
        this.config = config;
    }

    public final void clearIJ(@NotNull Context context) {
        Intrinsics.echo(context, "context");
        SharedPreferences.Editor edit = StorageHelper.getPreferences(context, "IJ").edit();
        edit.clear();
        StorageHelper.persist(edit);
    }

    public final long getI(@NotNull Context context) {
        Intrinsics.echo(context, "context");
        return StorageHelper.getLongFromPrefs(context, this.config, "comms_i", 0, "IJ");
    }

    public final long getJ(@NotNull Context context) {
        Intrinsics.echo(context, "context");
        return StorageHelper.getLongFromPrefs(context, this.config, "comms_j", 0, "IJ");
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void setI(@NotNull Context context, long i4) {
        Intrinsics.echo(context, "context");
        SharedPreferences.Editor edit = StorageHelper.getPreferences(context, "IJ").edit();
        edit.putLong(StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), "comms_i"), i4);
        StorageHelper.persist(edit);
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void setJ(@NotNull Context context, long j5) {
        Intrinsics.echo(context, "context");
        SharedPreferences.Editor edit = StorageHelper.getPreferences(context, "IJ").edit();
        edit.putLong(StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), "comms_j"), j5);
        StorageHelper.persist(edit);
    }
}
