package com.clevertap.android.sdk.inapp.fragment;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.C0606a;
import androidx.fragment.app.L;
import androidx.fragment.app.ai;
import androidx.fragment.app.an;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.DidClickForHardPermissionListener;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.InAppActionType;
import com.clevertap.android.sdk.inapp.InAppListener;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.utils.UriHelper;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 W2\u00020\u0001:\u0002WXB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H$¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0010H$¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J)\u0010\"\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u000b¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b*\u0010)J\u000f\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020+¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u0002012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\u00102\u0006\u00105\u001a\u000201¢\u0006\u0004\b6\u00107J\r\u00109\u001a\u000208¢\u0006\u0004\b9\u0010:R\"\u0010\u001d\u001a\u00020\u001c8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u001d\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u001f\u001a\u00020\u001e8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u001f\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010E\u001a\u0002018\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u00107R$\u0010K\u001a\u0004\u0018\u00010J8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001e\u0010R\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006Y"}, d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment;", "Landroidx/fragment/app/ai;", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "button", "Landroid/os/Bundle;", "didClick", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;)Landroid/os/Bundle;", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", Constants.KEY_ACTION, "", "callToAction", "additionalData", "notifyActionTriggered", "(Lcom/clevertap/android/sdk/inapp/CTInAppAction;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", "", "cleanup", "generateListener", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppNotification", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "setArguments", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)V", "triggerAction", "(Lcom/clevertap/android/sdk/inapp/CTInAppAction;Ljava/lang/String;Landroid/os/Bundle;)V", Constants.KEY_URL, "openActionUrl", "(Ljava/lang/String;)V", Column.DATA, "didDismiss", "(Landroid/os/Bundle;)V", "didShow", "Lcom/clevertap/android/sdk/inapp/InAppListener;", "getListener", "()Lcom/clevertap/android/sdk/inapp/InAppListener;", "listener", "setListener", "(Lcom/clevertap/android/sdk/inapp/InAppListener;)V", "", "raw", "getScaledPixels", "(I)I", "index", "handleButtonClickAtIndex", "(I)V", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "()Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "getInAppNotification", "()Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "setInAppNotification", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "getConfig", "()Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "setConfig", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)V", "currentOrientation", "I", "getCurrentOrientation", "()I", "setCurrentOrientation", "Lcom/clevertap/android/sdk/customviews/CloseImageView;", "closeImageView", "Lcom/clevertap/android/sdk/customviews/CloseImageView;", "getCloseImageView", "()Lcom/clevertap/android/sdk/customviews/CloseImageView;", "setCloseImageView", "(Lcom/clevertap/android/sdk/customviews/CloseImageView;)V", "Ljava/lang/ref/WeakReference;", "listenerWeakReference", "Ljava/lang/ref/WeakReference;", "Lcom/clevertap/android/sdk/DidClickForHardPermissionListener;", "didClickForHardPermissionListener", "Lcom/clevertap/android/sdk/DidClickForHardPermissionListener;", "Companion", "CTInAppNativeButtonClickListener", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CTInAppBaseFragment extends ai {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private CloseImageView closeImageView;
    protected CleverTapInstanceConfig config;
    private int currentOrientation;

    @Nullable
    private DidClickForHardPermissionListener didClickForHardPermissionListener;
    protected CTInAppNotification inAppNotification;

    @Nullable
    private WeakReference<InAppListener> listenerWeakReference;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0084\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment$CTInAppNativeButtonClickListener;", "Landroid/view/View$OnClickListener;", "<init>", "(Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment;)V", "onClick", "", "view", "Landroid/view/View;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class CTInAppNativeButtonClickListener implements View.OnClickListener {
        public CTInAppNativeButtonClickListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View view) {
            Integer num;
            Intrinsics.echo(view, "view");
            Object tag = view.getTag();
            if (tag instanceof Integer) {
                num = (Integer) tag;
            } else {
                num = null;
            }
            if (num != null) {
                CTInAppBaseFragment.this.handleButtonClickAtIndex(num.intValue());
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment$Companion;", "", "<init>", "()V", "showOnActivity", "", "inAppFragment", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment;", "activity", "Landroid/app/Activity;", "inAppNotification", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "logTag", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean showOnActivity(@NotNull CTInAppBaseFragment inAppFragment, @NotNull Activity activity, @NotNull CTInAppNotification inAppNotification, @NotNull CleverTapInstanceConfig config, @NotNull String logTag) {
            Intrinsics.echo(inAppFragment, "inAppFragment");
            Intrinsics.echo(activity, "activity");
            Intrinsics.echo(inAppNotification, "inAppNotification");
            Intrinsics.echo(config, "config");
            Intrinsics.echo(logTag, "logTag");
            try {
                L supportFragmentManager = ((an) activity).getSupportFragmentManager();
                supportFragmentManager.getClass();
                C0606a c0606a = new C0606a(supportFragmentManager);
                inAppFragment.setArguments(inAppNotification, config);
                c0606a.bravo = R.animator.fade_in;
                c0606a.charlie = R.animator.fade_out;
                c0606a.delta = 0;
                c0606a.echo = 0;
                c0606a.delta(R.id.content, inAppFragment, inAppNotification.getType(), 1);
                Logger.v(logTag, "calling InAppFragment " + inAppNotification.getCampaignId());
                if (!c0606a.golf) {
                    c0606a.hotel = false;
                    c0606a.romeo.amber(c0606a, false);
                    return true;
                }
                throw new IllegalStateException("This transaction is already being added to the back stack");
            } catch (ClassCastException e) {
                Logger.v(logTag, "Fragment not able to render, please ensure your Activity is an instance of AppCompatActivity", e);
                return false;
            } catch (Throwable th) {
                Logger.v(logTag, "Fragment not able to render", th);
                return false;
            }
        }

        private Companion() {
        }
    }

    private final Bundle didClick(CTInAppNotificationButton button) {
        CTInAppAction cTInAppAction = button.action;
        if (cTInAppAction == null) {
            cTInAppAction = CTInAppAction.INSTANCE.createCloseAction();
        }
        return notifyActionTriggered(cTInAppAction, button.getText(), null);
    }

    private final Bundle notifyActionTriggered(CTInAppAction action, String callToAction, Bundle additionalData) {
        InAppListener listener = getListener();
        if (listener != null) {
            return listener.inAppNotificationActionTriggered(getInAppNotification(), action, callToAction, additionalData, getActivity());
        }
        return null;
    }

    public abstract void cleanup();

    public final void didDismiss(@Nullable Bundle data) {
        cleanup();
        InAppListener listener = getListener();
        if (listener != null) {
            listener.inAppNotificationDidDismiss(getInAppNotification(), data);
        }
    }

    public final void didShow(@Nullable Bundle data) {
        InAppListener listener = getListener();
        if (listener != null) {
            listener.inAppNotificationDidShow(getInAppNotification(), data);
        }
    }

    public abstract void generateListener();

    @Nullable
    public final CloseImageView getCloseImageView() {
        return this.closeImageView;
    }

    @NotNull
    public final CleverTapInstanceConfig getConfig() {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.config;
        if (cleverTapInstanceConfig != null) {
            return cleverTapInstanceConfig;
        }
        Intrinsics.lima(Constants.KEY_CONFIG);
        throw null;
    }

    public final int getCurrentOrientation() {
        return this.currentOrientation;
    }

    @NotNull
    public final CTInAppNotification getInAppNotification() {
        CTInAppNotification cTInAppNotification = this.inAppNotification;
        if (cTInAppNotification != null) {
            return cTInAppNotification;
        }
        Intrinsics.lima("inAppNotification");
        throw null;
    }

    @Nullable
    public final InAppListener getListener() {
        InAppListener inAppListener;
        WeakReference<InAppListener> weakReference = this.listenerWeakReference;
        if (weakReference != null) {
            inAppListener = weakReference.get();
        } else {
            inAppListener = null;
        }
        if (inAppListener == null) {
            getConfig().getLogger().verbose(getConfig().getAccountId(), "InAppListener is null for notification: " + getInAppNotification().getJsonDescription());
        }
        return inAppListener;
    }

    public final int getScaledPixels(int raw) {
        return (int) TypedValue.applyDimension(1, raw, getResources().getDisplayMetrics());
    }

    public final void handleButtonClickAtIndex(int index) {
        DidClickForHardPermissionListener didClickForHardPermissionListener;
        DidClickForHardPermissionListener didClickForHardPermissionListener2;
        try {
            CTInAppNotificationButton cTInAppNotificationButton = getInAppNotification().getButtons().get(index);
            Bundle didClick = didClick(cTInAppNotificationButton);
            if (getInAppNotification().getIsLocalInApp() && (didClickForHardPermissionListener2 = this.didClickForHardPermissionListener) != null) {
                if (index != 0) {
                    if (index == 1 && didClickForHardPermissionListener2 != null) {
                        didClickForHardPermissionListener2.didCancelPermissionRequest();
                    }
                } else {
                    if (didClickForHardPermissionListener2 != null) {
                        didClickForHardPermissionListener2.didClickForHardPermissionWithFallbackSettings(getInAppNotification().getFallBackToNotificationSettings());
                        return;
                    }
                    return;
                }
            }
            CTInAppAction cTInAppAction = cTInAppNotificationButton.action;
            if (cTInAppAction != null && InAppActionType.REQUEST_FOR_PERMISSIONS == cTInAppAction.getType() && (didClickForHardPermissionListener = this.didClickForHardPermissionListener) != null) {
                if (didClickForHardPermissionListener != null) {
                    didClickForHardPermissionListener.didClickForHardPermissionWithFallbackSettings(cTInAppAction.getShouldFallbackToSettings());
                    return;
                }
                return;
            }
            didDismiss(didClick);
        } catch (Throwable th) {
            getConfig().getLogger().debug("Error handling notification button click", th);
            didDismiss(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.ai
    public void onAttach(@NotNull Context context) {
        Intrinsics.echo(context, "context");
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Parcelable parcelable = arguments.getParcelable(Constants.INAPP_KEY);
            Intrinsics.checkNotNull(parcelable);
            setInAppNotification((CTInAppNotification) parcelable);
            Parcelable parcelable2 = arguments.getParcelable(Constants.KEY_CONFIG);
            Intrinsics.checkNotNull(parcelable2);
            setConfig((CleverTapInstanceConfig) parcelable2);
            this.currentOrientation = getResources().getConfiguration().orientation;
            generateListener();
            if (context instanceof DidClickForHardPermissionListener) {
                this.didClickForHardPermissionListener = (DidClickForHardPermissionListener) context;
            }
        }
    }

    @Override // androidx.fragment.app.ai
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, savedInstanceState);
        didShow(null);
    }

    public final void openActionUrl(@NotNull String url) {
        Intrinsics.echo(url, "url");
        triggerAction(CTInAppAction.INSTANCE.createOpenUrlAction(url), null, null);
    }

    @NotNull
    public final FileResourceProvider resourceProvider() {
        FileResourceProvider.Companion companion = FileResourceProvider.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        return companion.getInstance(requireContext, getConfig().getLogger());
    }

    public final void setArguments(@NotNull CTInAppNotification inAppNotification, @NotNull CleverTapInstanceConfig config) {
        Intrinsics.echo(inAppNotification, "inAppNotification");
        Intrinsics.echo(config, "config");
        Bundle bundle = new Bundle();
        bundle.putParcelable(Constants.INAPP_KEY, inAppNotification);
        bundle.putParcelable(Constants.KEY_CONFIG, config);
        setArguments(bundle);
    }

    public final void setCloseImageView(@Nullable CloseImageView closeImageView) {
        this.closeImageView = closeImageView;
    }

    public final void setConfig(@NotNull CleverTapInstanceConfig cleverTapInstanceConfig) {
        Intrinsics.echo(cleverTapInstanceConfig, "<set-?>");
        this.config = cleverTapInstanceConfig;
    }

    public final void setCurrentOrientation(int i4) {
        this.currentOrientation = i4;
    }

    public final void setInAppNotification(@NotNull CTInAppNotification cTInAppNotification) {
        Intrinsics.echo(cTInAppNotification, "<set-?>");
        this.inAppNotification = cTInAppNotification;
    }

    public final void setListener(@NotNull InAppListener listener) {
        Intrinsics.echo(listener, "listener");
        this.listenerWeakReference = new WeakReference<>(listener);
    }

    public final void triggerAction(@NotNull CTInAppAction action, @Nullable String callToAction, @Nullable Bundle additionalData) {
        Intrinsics.echo(action, "action");
        if (action.getType() == InAppActionType.OPEN_URL) {
            Bundle allKeyValuePairs = UriHelper.getAllKeyValuePairs(action.getActionUrl(), false);
            String string = allKeyValuePairs.getString(Constants.KEY_C2A);
            allKeyValuePairs.remove(Constants.KEY_C2A);
            if (additionalData != null) {
                allKeyValuePairs.putAll(additionalData);
            }
            if (string != null) {
                List maroon = StringsKt.maroon(string, new String[]{Constants.URL_PARAM_DL_SEPARATOR}, 6);
                if (maroon.size() == 2) {
                    try {
                        string = URLDecoder.decode((String) maroon.get(0), "UTF-8");
                    } catch (Exception e) {
                        getConfig().getLogger().debug("Error parsing c2a param", e);
                    }
                    action = CTInAppAction.INSTANCE.createOpenUrlAction((String) maroon.get(1));
                }
            }
            additionalData = allKeyValuePairs;
            if (callToAction == null) {
                callToAction = string;
            }
        }
        if (callToAction == null) {
            callToAction = "";
        }
        didDismiss(notifyActionTriggered(action, callToAction, additionalData));
    }
}
