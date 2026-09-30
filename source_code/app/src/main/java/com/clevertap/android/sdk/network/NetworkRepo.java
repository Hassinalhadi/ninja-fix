package com.clevertap.android.sdk.network;

import android.content.Context;
import b.c0;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.StorageHelper;
import com.clevertap.android.sdk.utils.Clock;
import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0015\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bJ\u0006\u0010\u0019\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\bJ\u0006\u0010\u001c\u001a\u00020\u0017J\u0006\u0010\u001d\u001a\u00020\bJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\bJ\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u001fJ\u0010\u0010#\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010%J\b\u0010&\u001a\u0004\u0018\u00010%J\b\u0010'\u001a\u0004\u0018\u00010%J\u000e\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020%J\u0016\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006."}, d2 = {"Lcom/clevertap/android/sdk/network/NetworkRepo;", "", "context", "Landroid/content/Context;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "generateRandomDelay", "Lkotlin/Function0;", "", "clock", "Lcom/clevertap/android/sdk/utils/Clock;", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lkotlin/jvm/functions/Function0;Lcom/clevertap/android/sdk/utils/Clock;)V", "getContext", "()Landroid/content/Context;", "getConfig", "()Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "getGenerateRandomDelay", "()Lkotlin/jvm/functions/Function0;", "getClock", "()Lcom/clevertap/android/sdk/utils/Clock;", "getFirstRequestTs", "setFirstRequestTs", "", "firstRequestTs", "clearFirstRequestTs", "setLastRequestTs", "lastRequestTs", "clearLastRequestTs", "getLastRequestTs", "isMuted", "", "getMuted", "setMuted", "mute", "setDomain", "domainName", "", "getDomain", "getSpikyDomain", "setSpikyDomain", "spikyDomainName", "getMinDelayFrequency", "currentDelay", "networkRetryCount", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkRepo {

    @NotNull
    public static final String KEY_DOMAIN_NAME = "comms_dmn";

    @NotNull
    public static final String KEY_FIRST_TS = "comms_first_ts";

    @NotNull
    public static final String KEY_LAST_TS = "comms_last_ts";
    public static final int MAX_DELAY_FREQUENCY = 600000;
    public static final int PUSH_DELAY_MS = 1000;

    @NotNull
    public static final String SPIKY_KEY_DOMAIN_NAME = "comms_dmn_spiky";

    @NotNull
    private final Clock clock;

    @NotNull
    private final CleverTapInstanceConfig config;

    @NotNull
    private final Context context;

    @NotNull
    private final Function0<Integer> generateRandomDelay;

    public NetworkRepo(@NotNull Context context, @NotNull CleverTapInstanceConfig config, @NotNull Function0<Integer> generateRandomDelay, @NotNull Clock clock) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(config, "config");
        Intrinsics.echo(generateRandomDelay, "generateRandomDelay");
        Intrinsics.echo(clock, "clock");
        this.context = context;
        this.config = config;
        this.generateRandomDelay = generateRandomDelay;
        this.clock = clock;
    }

    public static final int _init_$lambda$0() {
        return (new SecureRandom().nextInt(10) + 1) * 1000;
    }

    public static /* synthetic */ int alpha() {
        return _init_$lambda$0();
    }

    public final void clearFirstRequestTs() {
        StorageHelper.putInt(this.context, StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), KEY_FIRST_TS), 0);
    }

    public final void clearLastRequestTs() {
        StorageHelper.putInt(this.context, StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), KEY_LAST_TS), 0);
    }

    @NotNull
    public final Clock getClock() {
        return this.clock;
    }

    @NotNull
    public final CleverTapInstanceConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final String getDomain() {
        return StorageHelper.getStringFromPrefs(this.context, this.config, KEY_DOMAIN_NAME, null);
    }

    public final int getFirstRequestTs() {
        return StorageHelper.getIntFromPrefs(this.context, this.config, KEY_FIRST_TS, 0);
    }

    @NotNull
    public final Function0<Integer> getGenerateRandomDelay() {
        return this.generateRandomDelay;
    }

    public final int getLastRequestTs() {
        return StorageHelper.getIntFromPrefs(this.context, this.config, KEY_LAST_TS, 0);
    }

    public final int getMinDelayFrequency(int currentDelay, int networkRetryCount) {
        this.config.getLogger().debug(this.config.getAccountId(), "Network retry #" + networkRetryCount);
        if (networkRetryCount < 10) {
            this.config.getLogger().debug(this.config.getAccountId(), "Failure count is " + networkRetryCount + ". Setting delay frequency to 1s");
            return 1000;
        }
        if (this.config.getAccountRegion() == null) {
            this.config.getLogger().debug(this.config.getAccountId(), "Setting delay frequency to 1s");
            return 1000;
        }
        int intValue = this.generateRandomDelay.invoke().intValue() + currentDelay;
        if (intValue >= 600000) {
            return 1000;
        }
        this.config.getLogger().debug(this.config.getAccountId(), "Setting delay frequency to " + currentDelay);
        return intValue;
    }

    public final int getMuted() {
        return StorageHelper.getIntFromPrefs(this.context, this.config, Constants.KEY_MUTED, 0);
    }

    @Nullable
    public final String getSpikyDomain() {
        return StorageHelper.getStringFromPrefs(this.context, this.config, SPIKY_KEY_DOMAIN_NAME, null);
    }

    public final boolean isMuted() {
        if (this.clock.currentTimeSecondsInt() - getMuted() < 86400) {
            return true;
        }
        return false;
    }

    public final void setDomain(@Nullable String domainName) {
        StorageHelper.putString(this.context, StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), KEY_DOMAIN_NAME), domainName);
    }

    public final void setFirstRequestTs(int firstRequestTs) {
        StorageHelper.putInt(this.context, StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), KEY_FIRST_TS), firstRequestTs);
    }

    public final void setLastRequestTs(int lastRequestTs) {
        StorageHelper.putInt(this.context, StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), KEY_LAST_TS), lastRequestTs);
    }

    public final void setMuted(boolean mute) {
        if (mute) {
            StorageHelper.putInt(this.context, StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), Constants.KEY_MUTED), this.clock.currentTimeSecondsInt());
        } else {
            StorageHelper.putInt(this.context, StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), Constants.KEY_MUTED), 0);
        }
    }

    public final void setSpikyDomain(@NotNull String spikyDomainName) {
        Intrinsics.echo(spikyDomainName, "spikyDomainName");
        StorageHelper.putString(this.context, StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), SPIKY_KEY_DOMAIN_NAME), spikyDomainName);
    }

    public /* synthetic */ NetworkRepo(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, Function0 function0, Clock clock, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, cleverTapInstanceConfig, (i4 & 4) != 0 ? new c0(23) : function0, (i4 & 8) != 0 ? Clock.SYSTEM : clock);
    }
}
