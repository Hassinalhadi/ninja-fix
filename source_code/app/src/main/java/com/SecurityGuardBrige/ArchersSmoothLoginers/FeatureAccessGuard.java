package com.SecurityGuardBrige.ArchersSmoothLoginers;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public final class FeatureAccessGuard {
    private static final byte[] EXPECTED_CERT_SHA256 = null;
    private static final String EXPECTED_PACKAGE = "delivery.samurai.android";
    public static final int FEATURE_ARCHERS = 81;
    public static final int FEATURE_PANEL = 167;
    private static final long INTEGRITY_CACHE_MS = 15000;
    private static final long MAX_FEATURE_ADMISSION_AGE_MS = 10000;
    private static final long MAX_PENDING_AGE_MS = 600000;
    private static final long MAX_VALIDATION_AGE_MS = 300000;
    private static final Object MONITOR = null;
    private static final byte[] PROCESS_NONCE = null;
    private static final Charset UTF8 = null;
    private static final long WATCHDOG_INTERVAL_MS = 2000;
    private static volatile Dialog activeDialog;
    private static volatile long admittedAt;
    private static volatile int admittedFeature;
    private static volatile boolean authorized;
    private static volatile WeakReference<Activity> authorizedActivity;
    private static volatile long lastIntegrityCheck;
    private static volatile boolean lastIntegrityResult;
    private static volatile long loginDialogConfirmedAt;
    private static volatile WeakReference<Activity> pendingActivity;
    private static volatile WeakReference<Dialog> pendingLoginDialog;
    private static volatile long pendingNonce;
    private static volatile long pendingStartedAt;
    private static volatile boolean pendingVerification;
    private static volatile byte[] serverReceipt;
    private static volatile byte[] sessionProof;
    private static volatile long validatedAt;
    private static Handler watchdogHandler;
    private static Runnable watchdogRunnable;

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.FeatureAccessGuard$1, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements Runnable {
        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(23, AnonymousClass1.class);
            Hidden0.special_clinit_23_00(AnonymousClass1.class);
        }

        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(24, FeatureAccessGuard.class);
        Hidden0.special_clinit_24_00(FeatureAccessGuard.class);
    }

    private FeatureAccessGuard() {
    }

    static native /* synthetic */ Object access$000();

    static native /* synthetic */ WeakReference access$100();

    static native /* synthetic */ boolean access$200(Activity activity);

    static native /* synthetic */ void access$300();

    static native /* synthetic */ Handler access$400();

    static native /* synthetic */ Runnable access$500();

    public static native boolean activateTrial(Activity activity);

    public static native boolean authorizeFeature(Activity activity, int i4);

    public static native void beginVerification(Activity activity);

    private static native byte[] calculateProof(Context context, byte[] bArr);

    private static native void clearPendingLocked();

    static native void completeCallback();

    static native void confirmLoginDialog(Activity activity);

    private static native boolean constantStringEquals(String str, String str2);

    private static native byte[] createProcessNonce();

    private static native long createRandomLong();

    private static native byte[] createServerReceipt(String str, long j5);

    public static native void deny(Activity activity);

    private static native void dismissQuietly(Dialog dialog);

    static native void grant(Activity activity, String str);

    private static native boolean hasExpectedSigningCertificate(Context context);

    private static native boolean hasRealSessionProofLocked(Context context);

    private static native byte[] hexToBytes(String str);

    public static native boolean isAuthorized(Activity activity);

    private static native boolean isBlank(String str);

    private static native boolean isExpectedLoginDialog(Dialog dialog);

    private static native boolean isExpired(String str);

    public static native boolean isFeatureSessionAuthorized(Context context);

    private static native boolean isLoginModuleIntact();

    private static native boolean isManualLoginDialogConfirmed(Activity activity);

    public static native boolean isOwnerKillSwitchActive();

    private static native boolean isTrustedFeatureCaller(int i4);

    private static native boolean isTrustedLoginPageCaller();

    private static native boolean isUsableActivity(Activity activity);

    public static native void lock();

    private static native void lockAuthorizationLocked();

    private static native void lockLocked();

    public static native void markLoginDialog(Activity activity, Dialog dialog);

    public static native void registerDialog(Dialog dialog, int i4);

    static native void revokeForResult();

    private static native void startWatchdogLocked();

    private static native int trustedGrantCallerKind();

    private static native boolean validateLocked(Activity activity);

    private static native boolean verifyRuntimeIntegrityLocked(Context context, boolean z2);

    private static native boolean verifySuccessfulServerResponse(String str, SharedPreferences sharedPreferences, boolean z2);
}
