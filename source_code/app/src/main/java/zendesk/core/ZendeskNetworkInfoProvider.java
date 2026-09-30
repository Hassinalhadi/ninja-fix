package zendesk.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import com.zendesk.logger.Logger;
import com.zendesk.util.CollectionUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class ZendeskNetworkInfoProvider implements NetworkInfoProvider, NetworkAware {
    private static final String LOG_TAG = "ZendeskNetworkInfoProvider";
    private final ConnectivityManager connectivityManager;
    private ConnectivityManager.NetworkCallback networkCallback;
    private final Map<Integer, WeakReference<NetworkAware>> listeners = new HashMap();
    private final Map<Integer, WeakReference<RetryAction>> retryActions = new HashMap();
    private CurrentState currentState = null;

    /* loaded from: classes.dex */
    public enum CurrentState {
        CONNECTED,
        DISCONNECTED
    }

    public ZendeskNetworkInfoProvider(ConnectivityManager connectivityManager) {
        this.connectivityManager = connectivityManager;
    }

    private static boolean isConnectedOrConnecting(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            return true;
        }
        return false;
    }

    private void registerForNetworkCallbacks() {
        Logger.d(LOG_TAG, "Adding Lollipop network callbacks...", new Object[0]);
        final Handler handler = new Handler(Looper.getMainLooper());
        this.networkCallback = new ConnectivityManager.NetworkCallback() { // from class: zendesk.core.ZendeskNetworkInfoProvider.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                handler.post(new Runnable() { // from class: zendesk.core.ZendeskNetworkInfoProvider.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ZendeskNetworkInfoProvider.this.onNetworkAvailable();
                    }
                });
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                handler.post(new Runnable() { // from class: zendesk.core.ZendeskNetworkInfoProvider.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ZendeskNetworkInfoProvider.this.onNetworkUnavailable();
                    }
                });
            }
        };
        this.connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), this.networkCallback);
    }

    private void unregisterForNetworkCallbacks() {
        ConnectivityManager.NetworkCallback networkCallback = this.networkCallback;
        if (networkCallback != null) {
            this.connectivityManager.unregisterNetworkCallback(networkCallback);
            this.networkCallback = null;
        }
    }

    @Override // zendesk.core.NetworkInfoProvider
    public void addNetworkAwareListener(Integer num, NetworkAware networkAware) {
        if (num != null && networkAware != null) {
            this.listeners.put(num, new WeakReference<>(networkAware));
        }
    }

    @Override // zendesk.core.NetworkInfoProvider
    public void addRetryAction(Integer num, RetryAction retryAction) {
        if (num != null && retryAction != null) {
            this.retryActions.put(num, new WeakReference<>(retryAction));
        }
    }

    @Override // zendesk.core.NetworkInfoProvider
    public void clearNetworkAwareListeners() {
        this.listeners.clear();
    }

    @Override // zendesk.core.NetworkInfoProvider
    public void clearRetryActions() {
        this.retryActions.clear();
    }

    @Override // zendesk.core.NetworkInfoProvider
    public boolean isNetworkAvailable() {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    @Override // zendesk.core.NetworkAware
    public void onNetworkAvailable() {
        CurrentState currentState = CurrentState.CONNECTED;
        if (currentState != this.currentState && isConnectedOrConnecting(this.connectivityManager)) {
            this.currentState = currentState;
            Map copyOf = CollectionUtils.copyOf(this.listeners);
            Map copyOf2 = CollectionUtils.copyOf(this.retryActions);
            for (WeakReference weakReference : copyOf.values()) {
                if (weakReference.get() != null) {
                    ((NetworkAware) weakReference.get()).onNetworkAvailable();
                }
            }
            for (WeakReference weakReference2 : copyOf2.values()) {
                if (weakReference2.get() != null) {
                    ((RetryAction) weakReference2.get()).onRetry();
                }
            }
            this.retryActions.clear();
        }
    }

    @Override // zendesk.core.NetworkAware
    public void onNetworkUnavailable() {
        CurrentState currentState = CurrentState.DISCONNECTED;
        if (currentState != this.currentState && !isConnectedOrConnecting(this.connectivityManager)) {
            this.currentState = currentState;
            for (WeakReference weakReference : CollectionUtils.copyOf(this.listeners).values()) {
                if (weakReference.get() != null) {
                    ((NetworkAware) weakReference.get()).onNetworkUnavailable();
                }
            }
        }
    }

    @Override // zendesk.core.NetworkInfoProvider
    public void register() {
        registerForNetworkCallbacks();
    }

    @Override // zendesk.core.NetworkInfoProvider
    public void removeNetworkAwareListener(Integer num) {
        this.listeners.remove(num);
    }

    @Override // zendesk.core.NetworkInfoProvider
    public void removeRetryAction(Integer num) {
        this.retryActions.remove(num);
    }

    @Override // zendesk.core.NetworkInfoProvider
    public void unregister() {
        unregisterForNetworkCallbacks();
    }
}
