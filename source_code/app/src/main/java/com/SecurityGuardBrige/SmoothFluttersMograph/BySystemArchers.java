package com.SecurityGuardBrige.SmoothFluttersMograph;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public class BySystemArchers {

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.SmoothFluttersMograph.BySystemArchers$100000000, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass100000000 implements CompoundButton.OnCheckedChangeListener {
        private final Switch val$autobidPrice;
        private final SharedPreferences val$sharedPreferences;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(99, AnonymousClass100000000.class);
            Hidden0.special_clinit_99_00(AnonymousClass100000000.class);
        }

        AnonymousClass100000000(Switch r12, SharedPreferences sharedPreferences) {
            this.val$autobidPrice = r12;
            this.val$sharedPreferences = sharedPreferences;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public native void onCheckedChanged(CompoundButton compoundButton, boolean z2);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.SmoothFluttersMograph.BySystemArchers$100000001, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass100000001 implements TextWatcher {
        private final EditText val$editMinPrice;
        private final SharedPreferences val$sharedPreferences;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(100, AnonymousClass100000001.class);
            Hidden0.special_clinit_100_00(AnonymousClass100000001.class);
        }

        AnonymousClass100000001(EditText editText, SharedPreferences sharedPreferences) {
            this.val$editMinPrice = editText;
            this.val$sharedPreferences = sharedPreferences;
        }

        @Override // android.text.TextWatcher
        public native void afterTextChanged(Editable editable);

        @Override // android.text.TextWatcher
        public native void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i10);

        @Override // android.text.TextWatcher
        public native void onTextChanged(CharSequence charSequence, int i4, int i5, int i10);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.SmoothFluttersMograph.BySystemArchers$100000002, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass100000002 implements TextWatcher {
        private final EditText val$editMaxPrice;
        private final SharedPreferences val$sharedPreferences;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(101, AnonymousClass100000002.class);
            Hidden0.special_clinit_101_00(AnonymousClass100000002.class);
        }

        AnonymousClass100000002(EditText editText, SharedPreferences sharedPreferences) {
            this.val$editMaxPrice = editText;
            this.val$sharedPreferences = sharedPreferences;
        }

        @Override // android.text.TextWatcher
        public native void afterTextChanged(Editable editable);

        @Override // android.text.TextWatcher
        public native void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i10);

        @Override // android.text.TextWatcher
        public native void onTextChanged(CharSequence charSequence, int i4, int i5, int i10);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.SmoothFluttersMograph.BySystemArchers$100000003, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass100000003 implements CompoundButton.OnCheckedChangeListener {
        private final Switch val$autobidDistance;
        private final SharedPreferences val$sharedPreferences;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(102, AnonymousClass100000003.class);
            Hidden0.special_clinit_102_00(AnonymousClass100000003.class);
        }

        AnonymousClass100000003(Switch r12, SharedPreferences sharedPreferences) {
            this.val$autobidDistance = r12;
            this.val$sharedPreferences = sharedPreferences;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public native void onCheckedChanged(CompoundButton compoundButton, boolean z2);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.SmoothFluttersMograph.BySystemArchers$100000004, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass100000004 implements TextWatcher {
        private final EditText val$editMinDistance;
        private final SharedPreferences val$sharedPreferences;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(103, AnonymousClass100000004.class);
            Hidden0.special_clinit_103_00(AnonymousClass100000004.class);
        }

        AnonymousClass100000004(EditText editText, SharedPreferences sharedPreferences) {
            this.val$editMinDistance = editText;
            this.val$sharedPreferences = sharedPreferences;
        }

        @Override // android.text.TextWatcher
        public native void afterTextChanged(Editable editable);

        @Override // android.text.TextWatcher
        public native void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i10);

        @Override // android.text.TextWatcher
        public native void onTextChanged(CharSequence charSequence, int i4, int i5, int i10);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.SmoothFluttersMograph.BySystemArchers$100000005, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass100000005 implements TextWatcher {
        private final EditText val$editMaxDistance;
        private final SharedPreferences val$sharedPreferences;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(104, AnonymousClass100000005.class);
            Hidden0.special_clinit_104_00(AnonymousClass100000005.class);
        }

        AnonymousClass100000005(EditText editText, SharedPreferences sharedPreferences) {
            this.val$editMaxDistance = editText;
            this.val$sharedPreferences = sharedPreferences;
        }

        @Override // android.text.TextWatcher
        public native void afterTextChanged(Editable editable);

        @Override // android.text.TextWatcher
        public native void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i10);

        @Override // android.text.TextWatcher
        public native void onTextChanged(CharSequence charSequence, int i4, int i5, int i10);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.SmoothFluttersMograph.BySystemArchers$100000006, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass100000006 implements CompoundButton.OnCheckedChangeListener {
        private final Switch val$autobidAllOrder;
        private final SharedPreferences val$sharedPreferences;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(105, AnonymousClass100000006.class);
            Hidden0.special_clinit_105_00(AnonymousClass100000006.class);
        }

        AnonymousClass100000006(Switch r12, SharedPreferences sharedPreferences) {
            this.val$autobidAllOrder = r12;
            this.val$sharedPreferences = sharedPreferences;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public native void onCheckedChanged(CompoundButton compoundButton, boolean z2);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.SmoothFluttersMograph.BySystemArchers$100000007, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass100000007 implements CompoundButton.OnCheckedChangeListener {
        private final Activity val$activity;
        private final SharedPreferences val$sharedPreferences;
        private final Switch val$showMapsOrders;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(106, AnonymousClass100000007.class);
            Hidden0.special_clinit_106_00(AnonymousClass100000007.class);
        }

        AnonymousClass100000007(Activity activity, Switch r22, SharedPreferences sharedPreferences) {
            this.val$activity = activity;
            this.val$showMapsOrders = r22;
            this.val$sharedPreferences = sharedPreferences;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public native void onCheckedChanged(CompoundButton compoundButton, boolean z2);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.SmoothFluttersMograph.BySystemArchers$100000008, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass100000008 implements View.OnClickListener {
        private final Activity val$activity;
        private final Dialog val$dialog;
        private final SharedPreferences val$sharedPreferences;
        private final Switch val$showMapsOrders;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(107, AnonymousClass100000008.class);
            Hidden0.special_clinit_107_00(AnonymousClass100000008.class);
        }

        AnonymousClass100000008(Activity activity, Dialog dialog, Switch r32, SharedPreferences sharedPreferences) {
            this.val$activity = activity;
            this.val$dialog = dialog;
            this.val$showMapsOrders = r32;
            this.val$sharedPreferences = sharedPreferences;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(108, BySystemArchers.class);
        Hidden0.special_clinit_108_00(BySystemArchers.class);
    }

    public static native void Archers_Autobids_SupersFlash();

    public static native void Archers_Autobids_SupersFlash(Activity activity);

    public static native void applyShowOrderAddressSetting(Activity activity, SharedPreferences sharedPreferences, boolean z2);

    public static native Application isContextCalled();

    private static native void refreshDeliveryUi(Activity activity);
}
