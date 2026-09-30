package com.SecurityGuardBrige.ArchersSmoothLoginers;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.InputStream;
import np.dcc.Dex2C;
import org.json.JSONArray;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public final class UserBroadcastReceiver {
    private static final int BLACK = 0;
    private static final int DARK_RED = 0;
    private static final int DEEP_BLACK = 0;
    private static final long DIALOG_TIMEOUT_MS = 300000;
    private static final String ENDPOINT = "https://archerssmoothmograph.io/SmileMorden/server/broadcast_latest.php";
    private static final long FIRST_CHECK_DELAY_MS = 10000;
    private static final String INSTALL_TAG = "dex_user_broadcast_receiver_v1";
    private static final String LAST_ID_KEY = "broadcast_last_user_id";
    private static final long POLL_INTERVAL_MS = 360000000;
    private static final int RED = 0;
    private static final String TELEGRAM_URL = "https://t.me/TALABATHSARCHERPANDA";
    private static final int WHITE = 0;
    private static AlertDialog activeDialog;
    private static boolean requestRunning;

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.UserBroadcastReceiver$1, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements Runnable {
        final Activity val$activity;
        final Handler val$handler;
        final Runnable[] val$poller;

        /* compiled from: Dex2C */
        /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.UserBroadcastReceiver$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        class AsyncTaskC00011 extends AsyncTask<Void, Void, BroadcastPayload> {
            final AnonymousClass1 this$0;

            static {
                AlwaysMougraohSmootihbngmode.registerNativesForClass(40, AsyncTaskC00011.class);
                Hidden0.special_clinit_40_00(AsyncTaskC00011.class);
            }

            AsyncTaskC00011(AnonymousClass1 anonymousClass1) {
                this.this$0 = anonymousClass1;
            }

            /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
            protected native BroadcastPayload doInBackground2(Void... voidArr);

            @Override // android.os.AsyncTask
            protected native /* bridge */ /* synthetic */ BroadcastPayload doInBackground(Void[] voidArr);

            /* renamed from: onPostExecute, reason: avoid collision after fix types in other method */
            protected native void onPostExecute2(BroadcastPayload broadcastPayload);

            @Override // android.os.AsyncTask
            protected native /* bridge */ /* synthetic */ void onPostExecute(BroadcastPayload broadcastPayload);
        }

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(42, AnonymousClass1.class);
            Hidden0.special_clinit_42_00(AnonymousClass1.class);
        }

        AnonymousClass1(Activity activity, Handler handler, Runnable[] runnableArr) {
            this.val$activity = activity;
            this.val$handler = handler;
            this.val$poller = runnableArr;
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.UserBroadcastReceiver$10, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass10 implements View.OnClickListener {
        final AlertDialog val$dialog;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(41, AnonymousClass10.class);
            Hidden0.special_clinit_41_00(AnonymousClass10.class);
        }

        AnonymousClass10(AlertDialog alertDialog) {
            this.val$dialog = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.UserBroadcastReceiver$2, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass2 implements Runnable {
        final AlertDialog val$dialog;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(43, AnonymousClass2.class);
            Hidden0.special_clinit_43_00(AnonymousClass2.class);
        }

        AnonymousClass2(AlertDialog alertDialog) {
            this.val$dialog = alertDialog;
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.UserBroadcastReceiver$3, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass3 implements DialogInterface.OnDismissListener {
        final AlertDialog val$dialog;
        final Runnable val$timeout;
        final Handler val$timeoutHandler;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(44, AnonymousClass3.class);
            Hidden0.special_clinit_44_00(AnonymousClass3.class);
        }

        AnonymousClass3(Handler handler, Runnable runnable, AlertDialog alertDialog) {
            this.val$timeoutHandler = handler;
            this.val$timeout = runnable;
            this.val$dialog = alertDialog;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public native void onDismiss(DialogInterface dialogInterface);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.UserBroadcastReceiver$4, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass4 implements View.OnClickListener {
        final Activity val$activity;
        final AlertDialog val$dialog;
        final BroadcastPayload val$payload;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(45, AnonymousClass4.class);
            Hidden0.special_clinit_45_00(AnonymousClass4.class);
        }

        AnonymousClass4(AlertDialog alertDialog, Activity activity, BroadcastPayload broadcastPayload) {
            this.val$dialog = alertDialog;
            this.val$activity = activity;
            this.val$payload = broadcastPayload;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.UserBroadcastReceiver$5, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass5 implements View.OnClickListener {
        final Activity val$activity;
        final AlertDialog val$dialog;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(46, AnonymousClass5.class);
            Hidden0.special_clinit_46_00(AnonymousClass5.class);
        }

        AnonymousClass5(Activity activity, AlertDialog alertDialog) {
            this.val$activity = activity;
            this.val$dialog = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.UserBroadcastReceiver$6, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass6 implements View.OnClickListener {
        final AlertDialog val$dialog;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(47, AnonymousClass6.class);
            Hidden0.special_clinit_47_00(AnonymousClass6.class);
        }

        AnonymousClass6(AlertDialog alertDialog) {
            this.val$dialog = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.UserBroadcastReceiver$7, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass7 implements Runnable {
        final AlertDialog val$dialog;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(48, AnonymousClass7.class);
            Hidden0.special_clinit_48_00(AnonymousClass7.class);
        }

        AnonymousClass7(AlertDialog alertDialog) {
            this.val$dialog = alertDialog;
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.UserBroadcastReceiver$8, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass8 implements DialogInterface.OnDismissListener {
        final AlertDialog val$dialog;
        final Runnable val$timeout;
        final Handler val$timeoutHandler;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(49, AnonymousClass8.class);
            Hidden0.special_clinit_49_00(AnonymousClass8.class);
        }

        AnonymousClass8(Handler handler, Runnable runnable, AlertDialog alertDialog) {
            this.val$timeoutHandler = handler;
            this.val$timeout = runnable;
            this.val$dialog = alertDialog;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public native void onDismiss(DialogInterface dialogInterface);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.UserBroadcastReceiver$9, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass9 implements View.OnClickListener {
        final Activity val$activity;
        final AppLink val$appLink;
        final AlertDialog val$dialog;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(50, AnonymousClass9.class);
            Hidden0.special_clinit_50_00(AnonymousClass9.class);
        }

        AnonymousClass9(Activity activity, AppLink appLink, AlertDialog alertDialog) {
            this.val$activity = activity;
            this.val$appLink = appLink;
            this.val$dialog = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* loaded from: classes.dex */
    private static final class AppLink {
        final String name;
        final String url;

        @Dex2C
        AppLink(String str, String str2) {
            this.name = str;
            this.url = str2;
        }
    }

    /* loaded from: classes.dex */
    private static final class BroadcastPayload {
        final AppLink[] appLinks;

        /* renamed from: id, reason: collision with root package name */
        final long f3493id;
        final String message;
        final String priority;

        @Dex2C
        BroadcastPayload(long j5, String str, String str2, AppLink[] appLinkArr) {
            this.f3493id = j5;
            this.message = str;
            this.priority = str2;
            this.appLinks = appLinkArr == null ? new AppLink[0] : appLinkArr;
        }
    }

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(51, UserBroadcastReceiver.class);
        Hidden0.special_clinit_51_00(UserBroadcastReceiver.class);
    }

    private UserBroadcastReceiver() {
    }

    static native /* synthetic */ boolean access$000();

    static native /* synthetic */ boolean access$002(boolean z2);

    static native /* synthetic */ AlertDialog access$100();

    static native /* synthetic */ AlertDialog access$102(AlertDialog alertDialog);

    static native /* synthetic */ BroadcastPayload access$200(Context context);

    static native /* synthetic */ boolean access$300(Activity activity);

    static native /* synthetic */ void access$400(Activity activity, BroadcastPayload broadcastPayload);

    static native /* synthetic */ void access$500(Activity activity, AppLink[] appLinkArr);

    static native /* synthetic */ void access$600(Activity activity);

    static native /* synthetic */ void access$700(Activity activity, String str);

    private static native TextView actionBox(Activity activity, String str, boolean z2);

    private static native void addBox(LinearLayout linearLayout, View view, int i4, int i5, int i10, int i11);

    private static native GradientDrawable boxBackground(Context context, int i4, int i5, int i10, int i11);

    private static native int dp(Context context, int i4);

    private static native BroadcastPayload fetchLatest(Context context);

    private static native String form(String str, String str2);

    public static native void install(Activity activity);

    private static native boolean isActivityUsable(Activity activity);

    private static native boolean isMediaFireUrl(String str);

    private static native void openMediaFire(Activity activity, String str);

    private static native void openTelegram(Activity activity);

    private static native AppLink[] parseAppLinks(JSONArray jSONArray);

    private static native String readAll(InputStream inputStream);

    private static native String safe(String str);

    private static native void showBroadcast(Activity activity, BroadcastPayload broadcastPayload);

    private static native void showUpdateAppChoices(Activity activity, AppLink[] appLinkArr);

    private static native TextView textBox(Activity activity, String str, boolean z2, float f5, int i4, int i5, int i10);
}
