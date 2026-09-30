package com.SecurityGuardBrige.ArchersSmoothLoginers;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public class SmooothApplicationMougraph {
    private static final int DELAY_TIME = 5000;
    private static final int MAX_FAILED_LOGIN_ATTEMPTS = 3;
    private static AlertDialog alertDialog;
    private static boolean doubleBackToExitPressedOnce;
    private static int failedLoginCount;

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.SmooothApplicationMougraph$1, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements View.OnClickListener {
        final ImageView val$btnHidePass;
        final ImageView val$btnShowPass;
        final EditText val$etPassword;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(26, AnonymousClass1.class);
            Hidden0.special_clinit_26_00(AnonymousClass1.class);
        }

        AnonymousClass1(EditText editText, ImageView imageView, ImageView imageView2) {
            this.val$etPassword = editText;
            this.val$btnShowPass = imageView;
            this.val$btnHidePass = imageView2;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.SmooothApplicationMougraph$2, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass2 implements View.OnClickListener {
        final ImageView val$btnHidePass;
        final ImageView val$btnShowPass;
        final EditText val$etPassword;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(27, AnonymousClass2.class);
            Hidden0.special_clinit_27_00(AnonymousClass2.class);
        }

        AnonymousClass2(EditText editText, ImageView imageView, ImageView imageView2) {
            this.val$etPassword = editText;
            this.val$btnHidePass = imageView;
            this.val$btnShowPass = imageView2;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.SmooothApplicationMougraph$3, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass3 implements View.OnClickListener {
        final Activity val$activity;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(28, AnonymousClass3.class);
            Hidden0.special_clinit_28_00(AnonymousClass3.class);
        }

        AnonymousClass3(Activity activity) {
            this.val$activity = activity;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.SmooothApplicationMougraph$4, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass4 implements View.OnClickListener {
        final Activity val$activity;
        final EditText val$etPassword;
        final EditText val$etUsername;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(29, AnonymousClass4.class);
            Hidden0.special_clinit_29_00(AnonymousClass4.class);
        }

        AnonymousClass4(EditText editText, EditText editText2, Activity activity) {
            this.val$etUsername = editText;
            this.val$etPassword = editText2;
            this.val$activity = activity;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.SmooothApplicationMougraph$5, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass5 implements DialogInterface.OnKeyListener {
        final Activity val$activity;

        /* compiled from: Dex2C */
        /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.SmooothApplicationMougraph$5$1, reason: invalid class name */
        /* loaded from: classes.dex */
        class AnonymousClass1 implements Runnable {
            final AnonymousClass5 this$0;

            static {
                AlwaysMougraohSmootihbngmode.registerNativesForClass(30, AnonymousClass1.class);
                Hidden0.special_clinit_30_00(AnonymousClass1.class);
            }

            AnonymousClass1(AnonymousClass5 anonymousClass5) {
                this.this$0 = anonymousClass5;
            }

            @Override // java.lang.Runnable
            public native void run();
        }

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(31, AnonymousClass5.class);
            Hidden0.special_clinit_31_00(AnonymousClass5.class);
        }

        AnonymousClass5(Activity activity) {
            this.val$activity = activity;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public native boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.SmooothApplicationMougraph$6, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass6 implements View.OnClickListener {
        final Activity val$activity;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(32, AnonymousClass6.class);
            Hidden0.special_clinit_32_00(AnonymousClass6.class);
        }

        AnonymousClass6(Activity activity) {
            this.val$activity = activity;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.SmooothApplicationMougraph$7, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass7 implements View.OnClickListener {
        final Activity val$activity;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(33, AnonymousClass7.class);
            Hidden0.special_clinit_33_00(AnonymousClass7.class);
        }

        AnonymousClass7(Activity activity) {
            this.val$activity = activity;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* compiled from: Dex2C */
    /* loaded from: classes.dex */
    private static class CheckLoginStatusTask extends AsyncTask<Void, Void, String> {
        private final Activity activity;
        private final String expiredDate;
        private final String password;
        private final String username;

        /* compiled from: Dex2C */
        /* renamed from: com.SecurityGuardBrige.ArchersSmoothLoginers.SmooothApplicationMougraph$CheckLoginStatusTask$1, reason: invalid class name */
        /* loaded from: classes.dex */
        class AnonymousClass1 implements Runnable {
            final CheckLoginStatusTask this$0;

            static {
                AlwaysMougraohSmootihbngmode.registerNativesForClass(34, AnonymousClass1.class);
                Hidden0.special_clinit_34_00(AnonymousClass1.class);
            }

            AnonymousClass1(CheckLoginStatusTask checkLoginStatusTask) {
                this.this$0 = checkLoginStatusTask;
            }

            @Override // java.lang.Runnable
            public native void run();
        }

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(35, CheckLoginStatusTask.class);
            Hidden0.special_clinit_35_00(CheckLoginStatusTask.class);
        }

        public CheckLoginStatusTask(Activity activity, String str, String str2, String str3) {
            this.activity = activity;
            this.username = str;
            this.password = str2;
            this.expiredDate = str3;
        }

        static native /* synthetic */ Activity access$200(CheckLoginStatusTask checkLoginStatusTask);

        @Override // android.os.AsyncTask
        protected native /* bridge */ /* synthetic */ String doInBackground(Void[] voidArr);

        /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
        protected native String doInBackground2(Void... voidArr);

        @Override // android.os.AsyncTask
        protected native /* bridge */ /* synthetic */ void onPostExecute(String str);

        /* renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        protected native void onPostExecute2(String str);
    }

    /* compiled from: Dex2C */
    /* loaded from: classes.dex */
    private static class LoginTask extends AsyncTask<Void, Void, String> {
        private final Activity activity;
        private final String password;
        private final String username;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(36, LoginTask.class);
            Hidden0.special_clinit_36_00(LoginTask.class);
        }

        public LoginTask(Activity activity, String str, String str2) {
            this.activity = activity;
            this.username = str;
            this.password = str2;
        }

        @Override // android.os.AsyncTask
        protected native /* bridge */ /* synthetic */ String doInBackground(Void[] voidArr);

        /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
        protected native String doInBackground2(Void... voidArr);

        @Override // android.os.AsyncTask
        protected native /* bridge */ /* synthetic */ void onPostExecute(String str);

        /* renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        protected native void onPostExecute2(String str);
    }

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(37, SmooothApplicationMougraph.class);
        Hidden0.special_clinit_37_00(SmooothApplicationMougraph.class);
    }

    static native /* synthetic */ int access$000();

    static native /* synthetic */ int access$002(int i4);

    static native /* synthetic */ int access$008();

    static native /* synthetic */ boolean access$100();

    static native /* synthetic */ boolean access$102(boolean z2);

    static native /* synthetic */ AlertDialog access$300();

    public static native void dismissLoginForTrial();

    public static native void reactContent(Activity activity);
}
