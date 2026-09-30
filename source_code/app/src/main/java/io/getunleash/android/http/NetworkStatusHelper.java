package io.getunleash.android.http;

import U0.x;
import Xd.l;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import av.q;
import com.clevertap.android.sdk.Constants;
import g4.C1752a;
import io.getunleash.android.util.UnleashLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u001c\u0018\u0000 22\u00020\u0001:\u00012B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012 \b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u001fJ\r\u0010 \u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R,\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R \u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lio/getunleash/android/http/NetworkStatusHelper;", "", "Landroid/content/Context;", "context", "Lkotlin/Function2;", "", "Lkotlin/Function0;", "", "scheduleRetry", "<init>", "(Landroid/content/Context;LXd/l;)V", "Lio/getunleash/android/http/NetworkListener;", "listener", "", "remainingAttempts", "epoch", "registerNetworkListener", "(Lio/getunleash/android/http/NetworkListener;II)V", "", "isNetworkAvailable", "()Z", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "isAirplaneModeOn", "Landroid/net/NetworkRequest;", "buildNetworkRequest", "()Landroid/net/NetworkRequest;", "io/getunleash/android/http/NetworkStatusHelper$buildCallback$1", "buildCallback", "(Lio/getunleash/android/http/NetworkListener;)Lio/getunleash/android/http/NetworkStatusHelper$buildCallback$1;", "(Lio/getunleash/android/http/NetworkListener;)V", Constants.KEY_HIDE_CLOSE, "()V", "isAvailable", "Landroid/content/Context;", "LXd/l;", "", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallbacks", "Ljava/util/List;", "getNetworkCallbacks$unleashandroidsdk_release", "()Ljava/util/List;", "", "Landroid/net/Network;", "availableNetworks", "Ljava/util/Set;", "Ljava/util/concurrent/atomic/AtomicInteger;", "registrationEpoch", "Ljava/util/concurrent/atomic/AtomicInteger;", "Companion", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkStatusHelper {
    public static final int MAX_REGISTRATION_ATTEMPTS = 5;
    private static final long REGISTRATION_RETRY_DELAY_MS = 200;

    @NotNull
    private static final String TAG = "NetworkState";

    @NotNull
    private final Set<Network> availableNetworks;

    @NotNull
    private final Context context;

    @NotNull
    private final List<ConnectivityManager.NetworkCallback> networkCallbacks;

    @NotNull
    private final AtomicInteger registrationEpoch;

    @NotNull
    private final l scheduleRetry;

    public NetworkStatusHelper(@NotNull Context context, @NotNull l scheduleRetry) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(scheduleRetry, "scheduleRetry");
        this.context = context;
        this.scheduleRetry = scheduleRetry;
        this.networkCallbacks = new ArrayList();
        this.availableNetworks = new LinkedHashSet();
        this.registrationEpoch = new AtomicInteger(0);
    }

    public static final Unit _init_$lambda$1(long j5, Function0 action) {
        Intrinsics.echo(action, "action");
        new Handler(Looper.getMainLooper()).postDelayed(new x(action, 3), j5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.getunleash.android.http.NetworkStatusHelper$buildCallback$1] */
    private final NetworkStatusHelper$buildCallback$1 buildCallback(final NetworkListener listener) {
        return new ConnectivityManager.NetworkCallback() { // from class: io.getunleash.android.http.NetworkStatusHelper$buildCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                Set set;
                Intrinsics.echo(network, "network");
                set = NetworkStatusHelper.this.availableNetworks;
                set.add(network);
                listener.onAvailable();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                Set set;
                Set set2;
                Intrinsics.echo(network, "network");
                set = NetworkStatusHelper.this.availableNetworks;
                set.remove(network);
                set2 = NetworkStatusHelper.this.availableNetworks;
                if (set2.isEmpty()) {
                    listener.onLost();
                }
            }
        };
    }

    private final NetworkRequest buildNetworkRequest() {
        NetworkRequest.Builder addCapability = new NetworkRequest.Builder().addCapability(12);
        addCapability.addCapability(16);
        NetworkRequest build = addCapability.build();
        Intrinsics.delta(build, "build(...)");
        return build;
    }

    private final ConnectivityManager getConnectivityManager() {
        Object systemService = this.context.getSystemService("connectivity");
        if (!(systemService instanceof ConnectivityManager)) {
            UnleashLogger.w$default(UnleashLogger.INSTANCE, TAG, "Failed to get ConnectivityManager assuming network is available", null, 4, null);
            return null;
        }
        return (ConnectivityManager) systemService;
    }

    private final boolean isAirplaneModeOn() {
        if (Settings.System.getInt(this.context.getContentResolver(), "airplane_mode_on", 0) == 0) {
            return false;
        }
        return true;
    }

    private final boolean isNetworkAvailable() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager == null) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
            return true;
        }
        return false;
    }

    public static final Unit registerNetworkListener$lambda$2(NetworkStatusHelper networkStatusHelper, NetworkListener networkListener, int i4, int i5) {
        networkStatusHelper.registerNetworkListener(networkListener, i4 - 1, i5);
        return Unit.INSTANCE;
    }

    public final void close() {
        int incrementAndGet = this.registrationEpoch.incrementAndGet();
        ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager == null) {
            this.networkCallbacks.clear();
            this.availableNetworks.clear();
            return;
        }
        List z2 = CollectionsKt.z(this.networkCallbacks);
        this.networkCallbacks.clear();
        this.availableNetworks.clear();
        Iterator it = z2.iterator();
        while (it.hasNext()) {
            try {
                connectivityManager.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) it.next());
            } catch (IllegalArgumentException e) {
                UnleashLogger.INSTANCE.w(TAG, "NetworkCallback already unregistered during close (epoch=" + incrementAndGet + ')', e);
            } catch (SecurityException e4) {
                UnleashLogger.INSTANCE.w(TAG, "SecurityException while unregistering NetworkCallback during close (epoch=" + incrementAndGet + ')', e4);
            }
        }
    }

    @NotNull
    public final List<ConnectivityManager.NetworkCallback> getNetworkCallbacks$unleashandroidsdk_release() {
        return this.networkCallbacks;
    }

    public final boolean isAvailable() {
        if (!isAirplaneModeOn() && isNetworkAvailable()) {
            return true;
        }
        return false;
    }

    public final void registerNetworkListener(@NotNull NetworkListener listener) {
        Intrinsics.echo(listener, "listener");
        registerNetworkListener(listener, 5, this.registrationEpoch.get());
    }

    private final void registerNetworkListener(final NetworkListener listener, final int remainingAttempts, final int epoch) {
        if (epoch != this.registrationEpoch.get()) {
            UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Skipping stale network registration attempt", null, 4, null);
            return;
        }
        int i4 = 6 - remainingAttempts;
        try {
            ConnectivityManager connectivityManager = getConnectivityManager();
            if (connectivityManager == null) {
                return;
            }
            NetworkRequest buildNetworkRequest = buildNetworkRequest();
            NetworkStatusHelper$buildCallback$1 buildCallback = buildCallback(listener);
            connectivityManager.registerNetworkCallback(buildNetworkRequest, buildCallback);
            if (epoch != this.registrationEpoch.get()) {
                UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Registration completed for stale attempt; unregistering callback", null, 4, null);
                connectivityManager.unregisterNetworkCallback(buildCallback);
            } else {
                this.networkCallbacks.add(buildCallback);
            }
        } catch (SecurityException e) {
            if (remainingAttempts > 1) {
                UnleashLogger.INSTANCE.w(TAG, q.delta(i4, "registerNetworkCallback failed on attempt ", "/5; retrying in 200 ms"), e);
                if (epoch == this.registrationEpoch.get()) {
                    this.scheduleRetry.invoke(200L, new Function0() { // from class: io.getunleash.android.http.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit registerNetworkListener$lambda$2;
                            registerNetworkListener$lambda$2 = NetworkStatusHelper.registerNetworkListener$lambda$2(NetworkStatusHelper.this, listener, remainingAttempts, epoch);
                            return registerNetworkListener$lambda$2;
                        }
                    });
                    return;
                }
                return;
            }
            UnleashLogger.INSTANCE.w(TAG, q.delta(i4, "registerNetworkCallback failed after ", " attempts; network updates disabled"), e);
        }
    }

    public /* synthetic */ NetworkStatusHelper(Context context, l lVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i4 & 2) != 0 ? new C1752a(12) : lVar);
    }
}
