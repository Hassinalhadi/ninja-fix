package com.SecurityGuardBrige.ShiftArchersMougraph;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public class archersControlersPanelShift {
    private static final int COLOR_ACCENT = -1726464;
    private static final int COLOR_BG = -15918294;
    private static final int COLOR_BORDER = -1726464;
    private static final int COLOR_CARD = -14997448;
    private static final int COLOR_GREEN = -13710223;
    private static final int COLOR_INPUT_BG = -14273211;
    private static final int COLOR_RED = -1618884;
    private static final int COLOR_SEPARATOR = -14009782;
    private static final int COLOR_TAB_ACTIVE = -13710223;
    private static final int COLOR_TAB_INACTIVE = -14997448;
    private static final int COLOR_TEXT = -1;
    private static final int COLOR_TEXT_DIM = -5588020;
    private Activity activity;
    private AlertDialog dialog;
    private SharedPreferences prefs;
    private Button stateButton;
    private boolean stateOn;

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ShiftArchersMougraph.archersControlersPanelShift$1, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements View.OnClickListener {
        final archersControlersPanelShift this$0;
        final String[] val$opts;
        final Spinner val$spinner;
        final int[] val$vals;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(74, AnonymousClass1.class);
            Hidden0.special_clinit_74_00(AnonymousClass1.class);
        }

        AnonymousClass1(archersControlersPanelShift archerscontrolerspanelshift, Spinner spinner, int[] iArr, String[] strArr) {
            this.this$0 = archerscontrolerspanelshift;
            this.val$spinner = spinner;
            this.val$vals = iArr;
            this.val$opts = strArr;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ShiftArchersMougraph.archersControlersPanelShift$2, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass2 implements View.OnClickListener {
        final archersControlersPanelShift this$0;
        final int val$idx;
        final Button[] val$tabBtns;
        final String[] val$tabs;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(75, AnonymousClass2.class);
            Hidden0.special_clinit_75_00(AnonymousClass2.class);
        }

        AnonymousClass2(archersControlersPanelShift archerscontrolerspanelshift, String[] strArr, int i4, Button[] buttonArr) {
            this.this$0 = archerscontrolerspanelshift;
            this.val$tabs = strArr;
            this.val$idx = i4;
            this.val$tabBtns = buttonArr;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ShiftArchersMougraph.archersControlersPanelShift$3, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass3 implements View.OnClickListener {
        final archersControlersPanelShift this$0;
        final EditText val$input;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(76, AnonymousClass3.class);
            Hidden0.special_clinit_76_00(AnonymousClass3.class);
        }

        AnonymousClass3(archersControlersPanelShift archerscontrolerspanelshift, EditText editText) {
            this.this$0 = archerscontrolerspanelshift;
            this.val$input = editText;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ShiftArchersMougraph.archersControlersPanelShift$4, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass4 implements View.OnClickListener {
        final archersControlersPanelShift this$0;
        final TextView val$badge;
        final boolean[] val$isOn;
        final int val$slotNum;
        final String val$slotOnKey;
        final View val$toggle;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(77, AnonymousClass4.class);
            Hidden0.special_clinit_77_00(AnonymousClass4.class);
        }

        AnonymousClass4(archersControlersPanelShift archerscontrolerspanelshift, boolean[] zArr, String str, View view, TextView textView, int i4) {
            this.this$0 = archerscontrolerspanelshift;
            this.val$isOn = zArr;
            this.val$slotOnKey = str;
            this.val$toggle = view;
            this.val$badge = textView;
            this.val$slotNum = i4;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ShiftArchersMougraph.archersControlersPanelShift$5, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass5 implements View.OnClickListener {
        final archersControlersPanelShift this$0;
        final Button val$sap;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(78, AnonymousClass5.class);
            Hidden0.special_clinit_78_00(AnonymousClass5.class);
        }

        AnonymousClass5(archersControlersPanelShift archerscontrolerspanelshift, Button button) {
            this.this$0 = archerscontrolerspanelshift;
            this.val$sap = button;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ShiftArchersMougraph.archersControlersPanelShift$6, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass6 implements View.OnClickListener {
        final archersControlersPanelShift this$0;
        final Button val$eap;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(79, AnonymousClass6.class);
            Hidden0.special_clinit_79_00(AnonymousClass6.class);
        }

        AnonymousClass6(archersControlersPanelShift archerscontrolerspanelshift, Button button) {
            this.this$0 = archerscontrolerspanelshift;
            this.val$eap = button;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ShiftArchersMougraph.archersControlersPanelShift$7, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass7 implements View.OnClickListener {
        final archersControlersPanelShift this$0;
        final Button val$eap;
        final String val$eapKey;
        final EditText val$eh;
        final String val$ehKey;
        final EditText val$em;
        final String val$emKey;
        final Button val$sap;
        final String val$sapKey;
        final EditText val$sh;
        final String val$shKey;
        final int val$slotNum;
        final EditText val$sm;
        final String val$smKey;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(80, AnonymousClass7.class);
            Hidden0.special_clinit_80_00(AnonymousClass7.class);
        }

        AnonymousClass7(archersControlersPanelShift archerscontrolerspanelshift, String str, EditText editText, String str2, EditText editText2, String str3, Button button, String str4, EditText editText3, String str5, EditText editText4, String str6, Button button2, int i4) {
            this.this$0 = archerscontrolerspanelshift;
            this.val$shKey = str;
            this.val$sh = editText;
            this.val$smKey = str2;
            this.val$sm = editText2;
            this.val$sapKey = str3;
            this.val$sap = button;
            this.val$ehKey = str4;
            this.val$eh = editText3;
            this.val$emKey = str5;
            this.val$em = editText4;
            this.val$eapKey = str6;
            this.val$eap = button2;
            this.val$slotNum = i4;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ShiftArchersMougraph.archersControlersPanelShift$8, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass8 implements View.OnClickListener {
        final archersControlersPanelShift this$0;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(81, AnonymousClass8.class);
            Hidden0.special_clinit_81_00(AnonymousClass8.class);
        }

        AnonymousClass8(archersControlersPanelShift archerscontrolerspanelshift) {
            this.this$0 = archerscontrolerspanelshift;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ShiftArchersMougraph.archersControlersPanelShift$9, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass9 implements View.OnClickListener {
        final archersControlersPanelShift this$0;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(82, AnonymousClass9.class);
            Hidden0.special_clinit_82_00(AnonymousClass9.class);
        }

        AnonymousClass9(archersControlersPanelShift archerscontrolerspanelshift) {
            this.this$0 = archerscontrolerspanelshift;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(83, archersControlersPanelShift.class);
        Hidden0.special_clinit_83_00(archersControlersPanelShift.class);
    }

    public archersControlersPanelShift(Activity activity) {
        this.activity = activity;
        this.prefs = activity.getSharedPreferences("Archer_Snooth_panel_prefs", 0);
    }

    static native /* synthetic */ SharedPreferences access$000(archersControlersPanelShift archerscontrolerspanelshift);

    static native /* synthetic */ void access$100(archersControlersPanelShift archerscontrolerspanelshift, String str);

    static native /* synthetic */ GradientDrawable access$200(archersControlersPanelShift archerscontrolerspanelshift, int i4, int i5, int i10);

    static native /* synthetic */ GradientDrawable access$300(archersControlersPanelShift archerscontrolerspanelshift, int i4);

    static native /* synthetic */ boolean access$400(archersControlersPanelShift archerscontrolerspanelshift);

    static native /* synthetic */ boolean access$402(archersControlersPanelShift archerscontrolerspanelshift, boolean z2);

    static native /* synthetic */ Button access$500(archersControlersPanelShift archerscontrolerspanelshift);

    static native /* synthetic */ AlertDialog access$600(archersControlersPanelShift archerscontrolerspanelshift);

    static native /* synthetic */ Activity access$700(archersControlersPanelShift archerscontrolerspanelshift);

    private native void addAreaKeywordSection(LinearLayout linearLayout);

    private native void addAreaTabSection(LinearLayout linearLayout);

    private native void addRefreshSection(LinearLayout linearLayout);

    private native void addShiftCard(LinearLayout linearLayout, int i4, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    private native GradientDrawable circle(int i4);

    private native int dp(int i4);

    private native GradientDrawable roundRect(int i4, int i5, int i10);

    private native void showToast(String str);

    public native void show();
}
