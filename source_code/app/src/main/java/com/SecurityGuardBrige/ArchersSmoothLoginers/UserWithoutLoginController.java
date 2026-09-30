package com.SecurityGuardBrige.ArchersSmoothLoginers;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.app.Activity;
import android.os.AsyncTask;
import android.os.Handler;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import np.dcc.Dex2C;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public final class UserWithoutLoginController {
    private static final long DEFAULT_POLL_MS = 360000000;
    private static final String ENDPOINT = "https://archerssmoothmograph.io/SmileMorden/server/user_trial_status.php";
    private static final Object LOCK = null;
    private static final Handler MAIN = null;
    private static final long MAX_POLL_MS = 360000000;
    private static final long MIN_POLL_MS = 60000;
    private static final Runnable POLLER = null;
    private static WeakReference<Activity> activityRef;
    private static long effectiveUntilElapsed;
    private static boolean forceLoginPageOnce;
    private static boolean installed;
    private static boolean normalPassOnce;
    private static long pollDelayMs;
    private static boolean requestRunning;
    private static boolean stateKnown;
    private static boolean trialEffective;
    private static boolean trialWasGranted;

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.UserWithoutLoginController$1, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements Runnable {
        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(52, AnonymousClass1.class);
            Hidden0.special_clinit_52_00(AnonymousClass1.class);
        }

        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.UserWithoutLoginController$2, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass2 extends AsyncTask<Void, Void, TrialStatus> {
        final Activity val$activity;
        final boolean val$initialGate;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(53, AnonymousClass2.class);
            Hidden0.special_clinit_53_00(AnonymousClass2.class);
        }

        AnonymousClass2(Activity activity, boolean z2) {
            this.val$activity = activity;
            this.val$initialGate = z2;
        }

        /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
        protected native TrialStatus doInBackground2(Void... voidArr);

        @Override // android.os.AsyncTask
        protected native /* bridge */ /* synthetic */ TrialStatus doInBackground(Void[] voidArr);

        @Override // android.os.AsyncTask
        protected native void onCancelled();

        /* renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        protected native void onPostExecute2(TrialStatus trialStatus);

        @Override // android.os.AsyncTask
        protected native /* bridge */ /* synthetic */ void onPostExecute(TrialStatus trialStatus);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.UserWithoutLoginController$3, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass3 implements Runnable {
        final Activity val$activity;
        final boolean val$forceVisiblePage;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(54, AnonymousClass3.class);
            Hidden0.special_clinit_54_00(AnonymousClass3.class);
        }

        AnonymousClass3(Activity activity, boolean z2) {
            this.val$activity = activity;
            this.val$forceVisiblePage = z2;
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    /* loaded from: classes.dex */
    private static final class TrialStatus {
        final boolean effective;
        final long pollAfterMs;
        final long secondsRemaining;

        @Dex2C
        TrialStatus(boolean z2, long j5, long j6) {
            this.effective = z2;
            this.secondsRemaining = j5;
            this.pollAfterMs = j6;
        }
    }

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(55, UserWithoutLoginController.class);
        Hidden0.special_clinit_55_00(UserWithoutLoginController.class);
    }

    private UserWithoutLoginController() {
    }

    static native /* synthetic */ WeakReference access$000();

    static native /* synthetic */ WeakReference access$002(WeakReference weakReference);

    static native /* synthetic */ boolean access$100(Activity activity);

    static native /* synthetic */ long access$1000();

    static native /* synthetic */ long access$1002(long j5);

    static native /* synthetic */ long access$1102(long j5);

    static native /* synthetic */ void access$1200(Activity activity);

    static native /* synthetic */ void access$1300(Activity activity, boolean z2);

    static native /* synthetic */ long access$1400();

    static native /* synthetic */ Handler access$1500();

    static native /* synthetic */ TrialStatus access$1600(Activity activity);

    static native /* synthetic */ void access$1700(Activity activity, TrialStatus trialStatus, boolean z2);

    static native /* synthetic */ void access$1800(Activity activity, boolean z2);

    static native /* synthetic */ boolean access$1900(Activity activity);

    static native /* synthetic */ Object access$200();

    static native /* synthetic */ boolean access$302(boolean z2);

    static native /* synthetic */ boolean access$402(boolean z2);

    static native /* synthetic */ boolean access$502(boolean z2);

    static native /* synthetic */ boolean access$600();

    static native /* synthetic */ boolean access$602(boolean z2);

    static native /* synthetic */ boolean access$702(boolean z2);

    static native /* synthetic */ boolean access$802(boolean z2);

    static native /* synthetic */ boolean access$902(boolean z2);

    private static native void applyStatus(Activity activity, TrialStatus trialStatus, boolean z2);

    private static native long clampPoll(long j5);

    public static native boolean consumeForceLoginPage();

    private static native long currentPollDelay();

    private static native TrialStatus fetchStatus(Activity activity);

    private static native String form(String str, String str2);

    private static native void install(Activity activity);

    public static native boolean intercept(Activity activity);

    private static native boolean isCurrentActivity(Activity activity);

    public static native boolean isTrialAuthorized(Activity activity);

    private static native boolean isUsable(Activity activity);

    private static native String readAll(InputStream inputStream);

    private static native void requestStatus(Activity activity, boolean z2);

    private static native void resumeLegacyLogin(Activity activity, boolean z2);

    private static native void revokeAndShowLegacyLogin(Activity activity);

    private static native String safe(String str);
}
