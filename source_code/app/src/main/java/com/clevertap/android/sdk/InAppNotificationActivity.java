package com.clevertap.android.sdk;

import ae.ac;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.C0606a;
import androidx.fragment.app.L;
import androidx.fragment.app.an;
import com.clevertap.android.sdk.PushPermissionHandler;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.CTInAppType;
import com.clevertap.android.sdk.inapp.InAppActionType;
import com.clevertap.android.sdk.inapp.InAppListener;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlCoverFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlHalfInterstitialFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlInterstitialFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeCoverFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeCoverImageFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialImageFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialImageFragment;
import com.google.mlkit.vision.barcode.common.Barcode;
import g.C1718a;
import java.lang.ref.WeakReference;
import java.util.List;
import s1.b0;
import s1.d0;
import t6.ab;

/* loaded from: classes3.dex */
public final class InAppNotificationActivity extends an implements InAppListener, DidClickForHardPermissionListener, PushPermissionHandler.PushPermissionResultCallback {
    private static final String INTENT_EXTRA_CT_CONFIG = "config";
    private static final String INTENT_EXTRA_DISPLAY_PUSH_PERMISSION_PROMPT = "displayPushPermissionPrompt";
    private static final String INTENT_EXTRA_PUSH_PERMISSION_FALLBACK_TO_SETTINGS = "shouldShowFallbackSettings";
    private static boolean isAlertVisible;
    private CleverTapInstanceConfig config;
    private CTInAppNotification inAppNotification;
    private boolean invokedCallbacks = false;
    private WeakReference<InAppListener> listenerWeakReference;
    private PushPermissionHandler pushPermissionHandler;

    /* renamed from: com.clevertap.android.sdk.InAppNotificationActivity$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$clevertap$android$sdk$inapp$CTInAppType;

        static {
            int[] iArr = new int[CTInAppType.values().length];
            $SwitchMap$com$clevertap$android$sdk$inapp$CTInAppType = iArr;
            try {
                iArr[CTInAppType.CTInAppTypeCoverHTML.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$clevertap$android$sdk$inapp$CTInAppType[CTInAppType.CTInAppTypeInterstitialHTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$clevertap$android$sdk$inapp$CTInAppType[CTInAppType.CTInAppTypeHalfInterstitialHTML.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$clevertap$android$sdk$inapp$CTInAppType[CTInAppType.CTInAppTypeCover.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$clevertap$android$sdk$inapp$CTInAppType[CTInAppType.CTInAppTypeInterstitial.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$clevertap$android$sdk$inapp$CTInAppType[CTInAppType.CTInAppTypeHalfInterstitial.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$clevertap$android$sdk$inapp$CTInAppType[CTInAppType.CTInAppTypeCoverImageOnly.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$clevertap$android$sdk$inapp$CTInAppType[CTInAppType.CTInAppTypeInterstitialImageOnly.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$clevertap$android$sdk$inapp$CTInAppType[CTInAppType.CTInAppTypeHalfInterstitialImageOnly.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$clevertap$android$sdk$inapp$CTInAppType[CTInAppType.CTInAppTypeAlert.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private CTInAppBaseFullFragment createContentFragment() {
        CTInAppType inAppType = this.inAppNotification.getInAppType();
        switch (AnonymousClass2.$SwitchMap$com$clevertap$android$sdk$inapp$CTInAppType[inAppType.ordinal()]) {
            case 1:
                return new CTInAppHtmlCoverFragment();
            case 2:
                return new CTInAppHtmlInterstitialFragment();
            case 3:
                return new CTInAppHtmlHalfInterstitialFragment();
            case 4:
                return new CTInAppNativeCoverFragment();
            case 5:
                return new CTInAppNativeInterstitialFragment();
            case 6:
                return new CTInAppNativeHalfInterstitialFragment();
            case 7:
                return new CTInAppNativeCoverImageFragment();
            case 8:
                return new CTInAppNativeInterstitialImageFragment();
            case 9:
                return new CTInAppNativeHalfInterstitialImageFragment();
            case 10:
                showAlertDialogForInApp();
                return null;
            default:
                this.config.getLogger().verbose("InAppNotificationActivity: Unhandled InApp Type: " + inAppType);
                return null;
        }
    }

    private Bundle didClick(CTInAppNotificationButton cTInAppNotificationButton) {
        InAppListener listener = getListener();
        if (listener != null) {
            return listener.inAppNotificationDidClick(this.inAppNotification, cTInAppNotificationButton, this);
        }
        return null;
    }

    private String getFragmentTag() {
        return this.config.getAccountId() + ":CT_INAPP_CONTENT_FRAGMENT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAlertDialogForInApp$0(CTInAppNotificationButton cTInAppNotificationButton, DialogInterface dialogInterface, int i4) {
        onAlertButtonClick(cTInAppNotificationButton, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAlertDialogForInApp$1(CTInAppNotificationButton cTInAppNotificationButton, DialogInterface dialogInterface, int i4) {
        onAlertButtonClick(cTInAppNotificationButton, false);
    }

    private /* synthetic */ void lambda$showAlertDialogForInApp$2(CTInAppNotificationButton cTInAppNotificationButton, DialogInterface dialogInterface, int i4) {
        onAlertButtonClickLegacy(cTInAppNotificationButton);
    }

    private /* synthetic */ void lambda$showAlertDialogForInApp$3(CTInAppNotificationButton cTInAppNotificationButton, DialogInterface dialogInterface, int i4) {
        onAlertButtonClickLegacy(cTInAppNotificationButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAlertDialogForInApp$4(CTInAppNotificationButton cTInAppNotificationButton, DialogInterface dialogInterface, int i4) {
        onAlertButtonClickLegacy(cTInAppNotificationButton);
    }

    public static void launchForInAppNotification(Context context, CTInAppNotification cTInAppNotification, CleverTapInstanceConfig cleverTapInstanceConfig) {
        Intent intent = new Intent(context, (Class<?>) InAppNotificationActivity.class);
        intent.putExtra(Constants.INAPP_KEY, cTInAppNotification);
        intent.putExtra("config", cleverTapInstanceConfig);
        context.startActivity(intent);
    }

    public static void launchForPushPermissionPrompt(Activity activity, CleverTapInstanceConfig cleverTapInstanceConfig, boolean z2) {
        if (!activity.getClass().equals(InAppNotificationActivity.class)) {
            Intent intent = new Intent(activity, (Class<?>) InAppNotificationActivity.class);
            intent.putExtra("config", cleverTapInstanceConfig);
            intent.putExtra(INTENT_EXTRA_DISPLAY_PUSH_PERMISSION_PROMPT, true);
            intent.putExtra(INTENT_EXTRA_PUSH_PERMISSION_FALLBACK_TO_SETTINGS, z2);
            activity.startActivity(intent);
        }
    }

    private void onAlertButtonClick(CTInAppNotificationButton cTInAppNotificationButton, boolean z2) {
        Bundle didClick = didClick(cTInAppNotificationButton);
        if (this.inAppNotification.getIsLocalInApp()) {
            if (z2) {
                showPushPermissionPrompt(this.inAppNotification.getFallBackToNotificationSettings());
                return;
            }
            didCancelPermissionRequest();
        }
        CTInAppAction cTInAppAction = cTInAppNotificationButton.action;
        if (cTInAppAction != null && InAppActionType.REQUEST_FOR_PERMISSIONS == cTInAppAction.getType()) {
            showPushPermissionPrompt(cTInAppAction.getShouldFallbackToSettings());
        } else {
            didDismiss(didClick);
        }
    }

    private void onAlertButtonClickLegacy(CTInAppNotificationButton cTInAppNotificationButton) {
        didDismiss(didClick(cTInAppNotificationButton));
    }

    private void showAlertDialogForInApp() {
        List<CTInAppNotificationButton> buttons = this.inAppNotification.getButtons();
        if (buttons.isEmpty()) {
            this.config.getLogger().debug("InAppNotificationActivity: Notification has no buttons, not showing Alert InApp");
            return;
        }
        final CTInAppNotificationButton cTInAppNotificationButton = buttons.get(0);
        final int i4 = 0;
        AlertDialog create = new AlertDialog.Builder(this, android.R.style.Theme.Material.Light.Dialog.Alert).setCancelable(false).setTitle(this.inAppNotification.getTitle()).setMessage(this.inAppNotification.getMessage()).setPositiveButton(cTInAppNotificationButton.getText(), new DialogInterface.OnClickListener(this) { // from class: com.clevertap.android.sdk.v
            public final /* synthetic */ InAppNotificationActivity purple;

            {
                this.purple = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                switch (i4) {
                    case 0:
                        this.purple.lambda$showAlertDialogForInApp$0(cTInAppNotificationButton, dialogInterface, i5);
                        return;
                    case 1:
                        this.purple.lambda$showAlertDialogForInApp$1(cTInAppNotificationButton, dialogInterface, i5);
                        return;
                    default:
                        this.purple.lambda$showAlertDialogForInApp$4(cTInAppNotificationButton, dialogInterface, i5);
                        return;
                }
            }
        }).create();
        if (this.inAppNotification.getButtons().size() == 2) {
            final CTInAppNotificationButton cTInAppNotificationButton2 = buttons.get(1);
            final int i5 = 1;
            create.setButton(-2, cTInAppNotificationButton2.getText(), new DialogInterface.OnClickListener(this) { // from class: com.clevertap.android.sdk.v
                public final /* synthetic */ InAppNotificationActivity purple;

                {
                    this.purple = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i52) {
                    switch (i5) {
                        case 0:
                            this.purple.lambda$showAlertDialogForInApp$0(cTInAppNotificationButton2, dialogInterface, i52);
                            return;
                        case 1:
                            this.purple.lambda$showAlertDialogForInApp$1(cTInAppNotificationButton2, dialogInterface, i52);
                            return;
                        default:
                            this.purple.lambda$showAlertDialogForInApp$4(cTInAppNotificationButton2, dialogInterface, i52);
                            return;
                    }
                }
            });
        }
        if (buttons.size() > 2) {
            final CTInAppNotificationButton cTInAppNotificationButton3 = buttons.get(2);
            final int i10 = 2;
            create.setButton(-3, cTInAppNotificationButton3.getText(), new DialogInterface.OnClickListener(this) { // from class: com.clevertap.android.sdk.v
                public final /* synthetic */ InAppNotificationActivity purple;

                {
                    this.purple = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i52) {
                    switch (i10) {
                        case 0:
                            this.purple.lambda$showAlertDialogForInApp$0(cTInAppNotificationButton3, dialogInterface, i52);
                            return;
                        case 1:
                            this.purple.lambda$showAlertDialogForInApp$1(cTInAppNotificationButton3, dialogInterface, i52);
                            return;
                        default:
                            this.purple.lambda$showAlertDialogForInApp$4(cTInAppNotificationButton3, dialogInterface, i52);
                            return;
                    }
                }
            });
        }
        create.show();
        isAlertVisible = true;
        didShow(null);
    }

    @Override // com.clevertap.android.sdk.DidClickForHardPermissionListener
    public void didCancelPermissionRequest() {
        this.pushPermissionHandler.notifyPushPermissionExternalListeners(this);
    }

    @Override // com.clevertap.android.sdk.DidClickForHardPermissionListener
    public void didClickForHardPermissionWithFallbackSettings(boolean z2) {
        showPushPermissionPrompt(z2);
    }

    public void didDismiss(Bundle bundle) {
        didDismiss(bundle, true);
    }

    public void didShow(Bundle bundle) {
        InAppListener listener = getListener();
        if (listener != null) {
            listener.inAppNotificationDidShow(this.inAppNotification, bundle);
        }
    }

    @Override // android.app.Activity
    @SuppressLint({"WrongConstant"})
    public void finish() {
        super.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, android.R.anim.fade_in, android.R.anim.fade_out);
        } else {
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    }

    public InAppListener getListener() {
        InAppListener inAppListener;
        try {
            inAppListener = this.listenerWeakReference.get();
        } catch (Throwable unused) {
            inAppListener = null;
        }
        if (inAppListener == null && this.inAppNotification != null) {
            this.config.getLogger().verbose(this.config.getAccountId(), "InAppActivityListener is null for notification: " + this.inAppNotification.getJsonDescription());
        }
        return inAppListener;
    }

    @Override // com.clevertap.android.sdk.inapp.InAppListener
    public Bundle inAppNotificationActionTriggered(CTInAppNotification cTInAppNotification, CTInAppAction cTInAppAction, String str, Bundle bundle, Context context) {
        InAppListener listener = getListener();
        if (listener != null) {
            return listener.inAppNotificationActionTriggered(cTInAppNotification, cTInAppAction, str, bundle, this);
        }
        return null;
    }

    @Override // com.clevertap.android.sdk.inapp.InAppListener
    public Bundle inAppNotificationDidClick(CTInAppNotification cTInAppNotification, CTInAppNotificationButton cTInAppNotificationButton, Context context) {
        InAppListener listener = getListener();
        if (listener != null) {
            return listener.inAppNotificationDidClick(cTInAppNotification, cTInAppNotificationButton, this);
        }
        return null;
    }

    @Override // com.clevertap.android.sdk.inapp.InAppListener
    public void inAppNotificationDidDismiss(CTInAppNotification cTInAppNotification, Bundle bundle) {
        didDismiss(bundle);
    }

    @Override // com.clevertap.android.sdk.inapp.InAppListener
    public void inAppNotificationDidShow(CTInAppNotification cTInAppNotification, Bundle bundle) {
        didShow(bundle);
    }

    @Override // androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        Window window;
        ab b0Var;
        super.onCreate(bundle);
        getOnBackPressedDispatcher().alpha(this, new ac(true) { // from class: com.clevertap.android.sdk.InAppNotificationActivity.1
            @Override // ae.ac
            public void handleOnBackPressed() {
                InAppNotificationActivity.this.finish();
                InAppNotificationActivity.this.didDismiss(null);
            }
        });
        int i4 = getResources().getConfiguration().orientation;
        if (i4 == 2 && (window = getWindow()) != null) {
            window.addFlags(Barcode.FORMAT_UPC_E);
            C1718a c1718a = new C1718a(window.getDecorView());
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 35) {
                b0Var = new d0(window, c1718a);
            } else if (i5 >= 30) {
                b0Var = new d0(window, c1718a);
            } else if (i5 >= 26) {
                b0Var = new b0(window, c1718a);
            } else {
                b0Var = new b0(window, c1718a);
            }
            b0Var.alpha(519);
        }
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) extras.getParcelable("config");
                this.config = cleverTapInstanceConfig;
                if (cleverTapInstanceConfig != null) {
                    CoreState coreState = CleverTapAPI.instanceWithConfig(this, cleverTapInstanceConfig).getCoreState();
                    this.pushPermissionHandler = new PushPermissionHandler(this.config, coreState.getCallbackManager().getPushPermissionResponseListenerList(), this);
                    if (extras.getBoolean(INTENT_EXTRA_DISPLAY_PUSH_PERMISSION_PROMPT, false)) {
                        showPushPermissionPrompt(extras.getBoolean(INTENT_EXTRA_PUSH_PERMISSION_FALLBACK_TO_SETTINGS, false));
                        return;
                    }
                    setListener(coreState.getInAppController());
                    CTInAppNotification cTInAppNotification = (CTInAppNotification) extras.getParcelable(Constants.INAPP_KEY);
                    this.inAppNotification = cTInAppNotification;
                    if (cTInAppNotification == null) {
                        finish();
                        return;
                    }
                    if (cTInAppNotification.getIsPortrait() && !this.inAppNotification.getIsLandscape()) {
                        if (i4 == 2) {
                            Logger.d("App in Landscape, dismissing portrait InApp Notification");
                            finish();
                            didDismiss(null);
                            return;
                        }
                        Logger.d("App in Portrait, displaying InApp Notification anyway");
                    }
                    if (!this.inAppNotification.getIsPortrait() && this.inAppNotification.getIsLandscape()) {
                        if (i4 == 1) {
                            Logger.d("App in Portrait, dismissing landscape InApp Notification");
                            finish();
                            didDismiss(null);
                            return;
                        }
                        Logger.d("App in Landscape, displaying InApp Notification anyway");
                    }
                    if (bundle == null) {
                        CTInAppBaseFullFragment createContentFragment = createContentFragment();
                        if (createContentFragment != null) {
                            createContentFragment.setArguments(this.inAppNotification, this.config);
                            L supportFragmentManager = getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            C0606a c0606a = new C0606a(supportFragmentManager);
                            c0606a.bravo = android.R.animator.fade_in;
                            c0606a.charlie = android.R.animator.fade_out;
                            c0606a.delta = 0;
                            c0606a.echo = 0;
                            c0606a.delta(android.R.id.content, createContentFragment, getFragmentTag(), 1);
                            if (!c0606a.golf) {
                                c0606a.hotel = false;
                                c0606a.romeo.amber(c0606a, false);
                                return;
                            }
                            throw new IllegalStateException("This transaction is already being added to the back stack");
                        }
                        return;
                    }
                    if (isAlertVisible) {
                        createContentFragment();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        } catch (Throwable th) {
            Logger.v("Cannot find a valid notification bundle to show!", th);
            finish();
        }
    }

    @Override // androidx.fragment.app.an, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!isChangingConfigurations()) {
            didDismiss(null, false);
        }
    }

    @Override // com.clevertap.android.sdk.PushPermissionHandler.PushPermissionResultCallback
    public void onPushPermissionResult(boolean z2) {
        Bundle bundle;
        CTInAppNotification cTInAppNotification = this.inAppNotification;
        if (cTInAppNotification != null && cTInAppNotification.getIsLocalInApp()) {
            bundle = new Bundle();
            bundle.putString(Constants.KEY_C2A, this.inAppNotification.getButtons().get(0).getText());
            bundle.putString(Constants.NOTIFICATION_ID_TAG, "");
        } else {
            bundle = null;
        }
        didDismiss(bundle);
    }

    @Override // androidx.fragment.app.an, ae.o, android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
        this.pushPermissionHandler.onRequestPermissionsResult(this, i4, iArr);
    }

    @Override // androidx.fragment.app.an, android.app.Activity
    public void onResume() {
        super.onResume();
        this.pushPermissionHandler.onActivityResume(this);
    }

    public void setListener(InAppListener inAppListener) {
        this.listenerWeakReference = new WeakReference<>(inAppListener);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i4) {
        super.setTheme(android.R.style.Theme.Translucent.NoTitleBar);
    }

    public void showPushPermissionPrompt(boolean z2) {
        this.pushPermissionHandler.requestPermission(this, z2);
    }

    public void didDismiss(Bundle bundle, boolean z2) {
        CTInAppNotification cTInAppNotification;
        if (isAlertVisible) {
            isAlertVisible = false;
        }
        if (!this.invokedCallbacks) {
            InAppListener listener = getListener();
            if (listener != null && (cTInAppNotification = this.inAppNotification) != null) {
                listener.inAppNotificationDidDismiss(cTInAppNotification, bundle);
            }
            this.invokedCallbacks = true;
        }
        if (z2) {
            finish();
        }
    }
}
