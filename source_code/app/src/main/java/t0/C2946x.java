package t0;

import B9.C0058p;
import T.r;
import a0.C0347ag;
import a0.C0348b;
import a0.C0351e;
import a0.C0365s;
import a0.InterfaceC0341aa;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.runtime.C0564b;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.InterfaceC0640j;
import androidx.recyclerview.widget.RecyclerView;
import bx.C0769g;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import i0.C1879b;
import i0.InterfaceC1878a;
import j0.C1926a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import m0.C2095a;
import o0.C2186a;
import o2.InterfaceC2196f;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.AbstractC2264a;
import q0.AbstractC2366B;
import q0.AbstractC2369E;
import q0.AbstractC2375K;
import q0.C2368D;
import q0.C2370F;
import q0.RunnableC2400s;
import qe.C2474j;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.C2540A;
import s0.C2546f;
import s0.C2561v;
import s0.C2563x;
import s0.EnumC2564y;
import s1.C2576i;
import s6.AbstractC2609a7;
import s6.AbstractC2618b7;
import s6.AbstractC2706l5;
import s6.AbstractC2728o0;
import s6.W6;
import s6.X6;
import t0.C2893K;
import t0.C2915g0;
import t0.C2946x;
import t6.AbstractC2993g;
import t6.O2;
import t6.Q3;
import td.C3117a;
import w.C3226d;
import z0.C3455d;
import z0.C3460i;
import z0.ScrollCaptureCallbackC3457f;

/* renamed from: t0.x */
/* loaded from: classes3.dex */
public final class C2946x extends ViewGroup implements s0.W, s0.d0, m0.g, InterfaceC0640j, s0.T {

    /* renamed from: A0 */
    public static Class f13850A0;

    /* renamed from: B0 */
    public static Method f13851B0;

    /* renamed from: C0 */
    public static Method f13852C0;

    /* renamed from: D0 */
    public static final bv.ah f13853D0 = new bv.ah();

    /* renamed from: E0 */
    public static K5.a f13854E0;

    /* renamed from: F0 */
    public static Method f13855F0;
    public final C2918i A;
    public final C2916h B;
    public final s0.Y C;

    /* renamed from: D */
    public boolean f13856D;

    /* renamed from: E */
    public C2885C f13857E;

    /* renamed from: F */
    public Q0.a f13858F;

    /* renamed from: G */
    public boolean f13859G;

    /* renamed from: H */
    public final C2540A f13860H;

    /* renamed from: I */
    public long f13861I;

    /* renamed from: J */
    public final int[] f13862J;

    /* renamed from: K */
    public final float[] f13863K;

    /* renamed from: L */
    public final float[] f13864L;

    /* renamed from: M */
    public final float[] f13865M;

    /* renamed from: N */
    public long f13866N;

    /* renamed from: O */
    public boolean f13867O;

    /* renamed from: P */
    public long f13868P;
    public final androidx.compose.runtime.ax Q;

    /* renamed from: R */
    public final androidx.compose.runtime.ad f13869R;

    /* renamed from: S */
    public Function1 f13870S;

    /* renamed from: T */
    public final ViewTreeObserverOnGlobalLayoutListenerC2920j f13871T;

    /* renamed from: U */
    public final ViewTreeObserverOnScrollChangedListenerC2922k f13872U;

    /* renamed from: V */
    public final ViewTreeObserverOnTouchModeChangeListenerC2924l f13873V;

    /* renamed from: W */
    public final I0.ad f13874W;

    /* renamed from: a */
    public Nd.h f13875a;

    /* renamed from: a0 */
    public final I0.ab f13876a0;
    public long alpha;

    /* renamed from: b */
    public final W.a f13877b;

    /* renamed from: b0 */
    public final AtomicReference f13878b0;

    /* renamed from: c */
    public final C2917h0 f13879c;

    /* renamed from: c0 */
    public final U f13880c0;

    /* renamed from: d */
    public final C0365s f13881d;

    /* renamed from: d0 */
    public final C2889G f13882d0;
    public final C2884B e;

    /* renamed from: e0 */
    public final androidx.compose.runtime.ax f13883e0;

    /* renamed from: f */
    public final RunnableC2400s f13884f;

    /* renamed from: f0 */
    public int f13885f0;

    /* renamed from: g */
    public final s0.al f13886g;

    /* renamed from: g0 */
    public final androidx.compose.runtime.ax f13887g0;

    /* renamed from: h */
    public final bv.aa f13888h;

    /* renamed from: h0 */
    public final C1879b f13889h0;

    /* renamed from: i */
    public final B0.b f13890i;

    /* renamed from: i0 */
    public final j0.c f13891i0;

    /* renamed from: j */
    public final C2946x f13892j;

    /* renamed from: j0 */
    public final r0.d f13893j0;

    /* renamed from: k */
    public final A0.u f13894k;

    /* renamed from: k0 */
    public final av f13895k0;

    /* renamed from: l */
    public final ad f13896l;

    /* renamed from: l0 */
    public MotionEvent f13897l0;

    /* renamed from: m */
    public V.d f13898m;

    /* renamed from: m0 */
    public long f13899m0;

    /* renamed from: n */
    public final C2914g f13900n;

    /* renamed from: n0 */
    public final gd.a f13901n0;

    /* renamed from: o */
    public final C0351e f13902o;

    /* renamed from: o0 */
    public final bv.ah f13903o0;

    /* renamed from: p */
    public final U.k f13904p;

    /* renamed from: p0 */
    public float f13905p0;
    public final boolean purple;

    /* renamed from: q */
    public final ArrayList f13906q;

    /* renamed from: q0 */
    public float f13907q0;

    /* renamed from: r */
    public ArrayList f13908r;

    /* renamed from: r0 */
    public final RunnableC2944v f13909r0;
    public final s0.an red;

    /* renamed from: s */
    public boolean f13910s;

    /* renamed from: s0 */
    public final ga.as f13911s0;
    public final androidx.compose.runtime.ax silver;

    /* renamed from: t */
    public boolean f13912t;

    /* renamed from: t0 */
    public boolean f13913t0;
    public final View teal;

    /* renamed from: u */
    public final m0.h f13914u;

    /* renamed from: u0 */
    public final C2940t f13915u0;

    /* renamed from: v */
    public final E.s f13916v;
    public final InterfaceC2894L v0;

    /* renamed from: w */
    public Function1 f13917w;

    /* renamed from: w0 */
    public boolean f13918w0;
    public final boolean white;

    /* renamed from: x */
    public final J2.n f13919x;

    /* renamed from: x0 */
    public final C2576i f13920x0;

    /* renamed from: y */
    public final U.c f13921y;

    /* renamed from: y0 */
    public View f13922y0;
    public final Y.n yellow;

    /* renamed from: z */
    public boolean f13923z;

    /* renamed from: z0 */
    public final C2942u f13924z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, E.s] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, J2.n] */
    /* JADX WARN: Type inference failed for: r0v6, types: [t0.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, s1.i] */
    /* JADX WARN: Type inference failed for: r1v25, types: [t0.k] */
    /* JADX WARN: Type inference failed for: r1v26, types: [t0.l] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, t0.av] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T.r, A0.d] */
    public C2946x(Context context, Nd.h hVar) {
        super(context);
        boolean z2;
        J2.n nVar;
        U.c cVar;
        int i4;
        Q0.n nVar2;
        InterfaceC2894L c2895m;
        C2576i c2576i;
        AutofillId autofillId;
        C2946x c2946x = this;
        c2946x.alpha = 9205357640488583168L;
        c2946x.purple = true;
        c2946x.red = new s0.an();
        Q0.f alpha = W6.alpha(context);
        androidx.compose.runtime.as asVar = androidx.compose.runtime.as.silver;
        c2946x.silver = C0564b.yankee(alpha, asVar);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 35) {
            z2 = true;
        } else {
            z2 = false;
        }
        c2946x.white = z2;
        ?? rVar = new T.r();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(rVar);
        s0.F f5 = new s0.F() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            /* JADX WARN: Type inference failed for: r0v0, types: [T.r, t0.K] */
            @Override // s0.F
            public final r create() {
                ?? rVar2 = new r();
                rVar2.alpha = C2946x.this;
                return rVar2;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return C2946x.this.hashCode();
            }

            @Override // s0.F
            public final void inspectableProperties(C2915g0 c2915g0) {
                c2915g0.alpha = "BringIntoViewOnScreen";
            }

            @Override // s0.F
            public final void update(r rVar2) {
                ((C2893K) rVar2).alpha = C2946x.this;
            }
        };
        c2946x.yellow = new Y.n(c2946x, c2946x);
        c2946x.f13875a = hVar;
        c2946x.f13877b = new W.a();
        c2946x.f13879c = new C2917h0();
        T.s alpha2 = androidx.compose.ui.input.key.a.alpha(new C2928n(c2946x, 1));
        T.s alpha3 = androidx.compose.ui.input.rotary.a.alpha(C2932p.silver);
        c2946x.f13881d = new C0365s();
        c2946x.e = new C2884B(ViewConfiguration.get(context));
        RunnableC2400s runnableC2400s = new RunnableC2400s();
        c2946x.f13884f = runnableC2400s;
        s0.al alVar = new s0.al(3);
        alVar.silver(C2370F.bravo);
        alVar.plum(c2946x.getDensity());
        alVar.white(c2946x.getViewConfiguration());
        alVar.teal(Q0.c.charlie((s0.F) androidx.compose.ui.layout.b.bravo(runnableC2400s), emptySemanticsElement).then(alpha3).then(alpha2).then(((Y.n) c2946x.getFocusOwner()).echo).then(c2946x.m367getDragAndDropManager().charlie).then(f5));
        c2946x.f13886g = alVar;
        bv.aa aaVar = bv.o.alpha;
        c2946x.f13888h = new bv.aa();
        c2946x.m368getLayoutNodes();
        c2946x.f13890i = new B0.b();
        c2946x.f13892j = c2946x;
        c2946x.f13894k = new A0.u(c2946x.getRoot(), rVar, c2946x.m368getLayoutNodes());
        ad adVar = new ad(c2946x);
        c2946x.f13896l = adVar;
        boolean z10 = z2;
        c2946x.f13898m = new V.d(c2946x, new P7.c(0, c2946x, an.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 16));
        ?? obj = new Object();
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        c2946x.f13900n = obj;
        c2946x.f13902o = new C0351e(c2946x);
        c2946x.f13904p = new U.k();
        c2946x.f13906q = new ArrayList();
        c2946x.f13914u = new m0.h();
        s0.al root = c2946x.getRoot();
        ?? obj2 = new Object();
        obj2.bravo = root;
        obj2.charlie = new m0.c((C2563x) root.f13305x.echo);
        obj2.delta = new com.google.android.material.internal.s(18);
        obj2.echo = new C2561v();
        c2946x.f13916v = obj2;
        c2946x.f13917w = C2932p.purple;
        if (echo()) {
            U.k autofillTree = c2946x.getAutofillTree();
            ?? obj3 = new Object();
            obj3.alpha = c2946x;
            obj3.purple = autofillTree;
            AutofillManager foxtrot = C3.a.foxtrot(c2946x.getContext().getSystemService(C3.a.hotel()));
            if (foxtrot != null) {
                obj3.red = foxtrot;
                c2946x.setImportantForAutofill(1);
                ai.a bravo = O2.bravo(c2946x);
                if (bravo != null) {
                    autofillId = vg.al.hotel(bravo.alpha);
                } else {
                    autofillId = null;
                }
                if (autofillId != null) {
                    obj3.silver = autofillId;
                    nVar = obj3;
                } else {
                    throw Q0.c.xray("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Autofill service could not be located.");
            }
        } else {
            nVar = null;
        }
        c2946x.f13919x = nVar;
        if (echo()) {
            AutofillManager foxtrot2 = C3.a.foxtrot(context.getSystemService(C3.a.hotel()));
            if (foxtrot2 != null) {
                c2946x = this;
                cVar = new U.c(new O7.j(8, foxtrot2), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
            } else {
                throw Q0.c.xray("Autofill service could not be located.");
            }
        } else {
            cVar = null;
        }
        c2946x.f13921y = cVar;
        c2946x.A = new C2918i(context);
        c2946x.B = new C2916h(c2946x.getClipboardManager());
        c2946x.C = new s0.Y(new C2928n(c2946x, 2));
        c2946x.f13860H = new C2540A(c2946x.getRoot());
        long j5 = LottieConstants.IterateForever;
        c2946x.f13861I = (j5 & 4294967295L) | (j5 << 32);
        c2946x.f13862J = new int[]{0, 0};
        float[] alpha4 = C0347ag.alpha();
        c2946x.f13863K = alpha4;
        c2946x.f13864L = C0347ag.alpha();
        c2946x.f13865M = C0347ag.alpha();
        c2946x.f13866N = -1L;
        c2946x.f13868P = 9187343241974906880L;
        c2946x.Q = C0564b.zulu(null);
        c2946x.f13869R = C0564b.quebec(new C2940t(c2946x, 2));
        c2946x.f13871T = new ViewTreeObserverOnGlobalLayoutListenerC2920j(0, c2946x);
        c2946x.f13872U = new ViewTreeObserver.OnScrollChangedListener() { // from class: t0.k
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C2946x.this.crimson();
            }
        };
        c2946x.f13873V = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: t0.l
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z11) {
                int i10;
                j0.c cVar2 = C2946x.this.f13891i0;
                if (z11) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                ((androidx.compose.runtime.t0) cVar2.alpha).setValue(new C1926a(i10));
            }
        };
        I0.ad adVar2 = new I0.ad(c2946x.getView(), c2946x);
        c2946x.f13874W = adVar2;
        an.alpha.getClass();
        c2946x.f13876a0 = new I0.ab(adVar2);
        c2946x.f13878b0 = new AtomicReference(null);
        c2946x.f13880c0 = new U(c2946x.getTextInputService());
        c2946x.f13882d0 = new C2889G(5);
        c2946x.f13883e0 = C0564b.yankee(AbstractC2706l5.bravo(context), asVar);
        Configuration configuration = context.getResources().getConfiguration();
        if (i5 >= 31) {
            i4 = g3.z.charlie(configuration);
        } else {
            i4 = 0;
        }
        c2946x.f13885f0 = i4;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        if (layoutDirection != 0) {
            if (layoutDirection != 1) {
                nVar2 = null;
            } else {
                nVar2 = Q0.n.purple;
            }
        } else {
            nVar2 = Q0.n.alpha;
        }
        c2946x.f13887g0 = C0564b.zulu(nVar2 == null ? Q0.n.alpha : nVar2);
        c2946x.f13889h0 = new C1879b(0, c2946x);
        c2946x.f13891i0 = new j0.c(c2946x.isInTouchMode() ? 1 : 2, new C2928n(c2946x, 0));
        c2946x.f13893j0 = new r0.d(c2946x);
        ?? obj4 = new Object();
        new com.google.android.play.core.integrity.c(new C2474j(8, obj4));
        EnumC2943u0[] enumC2943u0Arr = EnumC2943u0.alpha;
        c2946x.f13895k0 = obj4;
        c2946x.f13901n0 = new gd.a(9);
        c2946x.f13903o0 = new bv.ah();
        c2946x.f13909r0 = new RunnableC2944v(0, c2946x);
        c2946x.f13911s0 = new ga.as(10, c2946x);
        c2946x.f13915u0 = new C2940t(c2946x, 1);
        if (i5 < 29) {
            c2895m = new com.google.android.play.core.integrity.k(alpha4);
        } else {
            c2895m = new C2895M();
        }
        c2946x.v0 = c2895m;
        c2946x.addOnAttachStateChangeListener(c2946x.f13898m);
        c2946x.setWillNotDraw(false);
        c2946x.setFocusable(true);
        if (i5 >= 26) {
            am.alpha.alpha(c2946x, 1, false);
        }
        c2946x.setFocusableInTouchMode(true);
        c2946x.setClipChildren(false);
        s1.au.november(c2946x, adVar);
        c2946x.setOnDragListener(c2946x.m367getDragAndDropManager());
        c2946x.getRoot().delta(c2946x);
        if (i5 >= 29) {
            ag.alpha.alpha(c2946x);
        }
        if (z10) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            c2946x.teal = view;
            c2946x.addView(view, -1);
        }
        if (i5 >= 31) {
            ?? obj5 = new Object();
            obj5.alpha = C0564b.zulu(Boolean.FALSE);
            c2576i = obj5;
        } else {
            c2576i = null;
        }
        c2946x.f13920x0 = c2576i;
        c2946x.f13924z0 = new C2942u(c2946x);
    }

    public static final void alpha(C2946x c2946x, int i4, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int delta;
        ad adVar = c2946x.f13896l;
        if (Intrinsics.areEqual(str, adVar.coral)) {
            int delta2 = adVar.blue.delta(i4);
            if (delta2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, delta2);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(str, adVar.crimson) && (delta = adVar.bronze.delta(i4)) != -1) {
            accessibilityNodeInfo.getExtras().putInt(str, delta);
        }
    }

    public static boolean echo() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static void foxtrot(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if (childAt instanceof C2946x) {
                ((C2946x) childAt).uniform();
            } else if (childAt instanceof ViewGroup) {
                foxtrot((ViewGroup) childAt);
            }
        }
    }

    @kotlin.c
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @kotlin.c
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public final C2926m get_viewTreeOwners() {
        return (C2926m) ((androidx.compose.runtime.t0) this.Q).getValue();
    }

    public static long golf(int i4) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    long j5 = size;
                    return (j5 << 32) | j5;
                }
                throw new IllegalStateException();
            }
            return (0 << 32) | LottieConstants.IterateForever;
        }
        return (0 << 32) | size;
    }

    public static View hotel(int i4, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (Intrinsics.areEqual(declaredMethod.invoke(view, null), Integer.valueOf(i4))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View hotel = hotel(i4, viewGroup.getChildAt(i5));
                    if (hotel != null) {
                        return hotel;
                    }
                }
            }
        }
        return null;
    }

    public static void kilo(s0.al alVar) {
        alVar.black();
        J.e zulu = alVar.zulu();
        Object[] objArr = zulu.alpha;
        int i4 = zulu.red;
        for (int i5 = 0; i5 < i4; i5++) {
            kilo((s0.al) objArr[i5]);
        }
    }

    public static boolean mike(MotionEvent motionEvent) {
        boolean z2;
        if ((Float.floatToRawIntBits(motionEvent.getX()) & LottieConstants.IterateForever) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getY()) & LottieConstants.IterateForever) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawX()) & LottieConstants.IterateForever) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY()) & LottieConstants.IterateForever) < 2139095040) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 1; i4 < pointerCount; i4++) {
                if ((Float.floatToRawIntBits(motionEvent.getX(i4)) & LottieConstants.IterateForever) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getY(i4)) & LottieConstants.IterateForever) < 2139095040 && (Build.VERSION.SDK_INT < 29 || C2921j0.alpha.alpha(motionEvent, i4))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    break;
                }
            }
        }
        return z2;
    }

    private void setDensity(Q0.d dVar) {
        ((androidx.compose.runtime.t0) this.silver).setValue(dVar);
    }

    private void setFontFamilyResolver(H0.j jVar) {
        ((androidx.compose.runtime.t0) this.f13883e0).setValue(jVar);
    }

    private void setLayoutDirection(Q0.n nVar) {
        ((androidx.compose.runtime.t0) this.f13887g0).setValue(nVar);
    }

    private final void set_viewTreeOwners(C2926m c2926m) {
        ((androidx.compose.runtime.t0) this.Q).setValue(c2926m);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    public final void amber(MotionEvent motionEvent) {
        this.f13866N = AnimationUtils.currentAnimationTimeMillis();
        InterfaceC2894L interfaceC2894L = this.v0;
        float[] fArr = this.f13864L;
        interfaceC2894L.charlie(this, fArr);
        W.juliet(fArr, this.f13865M);
        float x4 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long bravo = C0347ag.bravo((Float.floatToRawIntBits(x4) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (bravo >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (bravo & 4294967295L));
        this.f13868P = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        boolean isText;
        boolean isDate;
        boolean isList;
        boolean isToggle;
        CharSequence textValue;
        boolean isText2;
        boolean isDate2;
        boolean isList2;
        boolean isToggle2;
        A0.k xray;
        A0.a aVar;
        Function1 function1;
        CharSequence textValue2;
        if (echo()) {
            U.c cVar = this.f13921y;
            if (cVar != null) {
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    AutofillValue golf = C3.a.golf(sparseArray.get(keyAt));
                    isText2 = golf.isText();
                    if (!isText2) {
                        isDate2 = golf.isDate();
                        if (!isDate2) {
                            isList2 = golf.isList();
                            if (!isList2) {
                                isToggle2 = golf.isToggle();
                                if (isToggle2) {
                                    Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                                }
                            } else {
                                Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                            }
                        } else {
                            Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                        }
                    } else {
                        A0.m mVar = (A0.m) cVar.bravo.charlie.bravo(keyAt);
                        if (mVar != null && (xray = ((s0.al) mVar).xray()) != null && (aVar = (A0.a) A0.v.delta(xray, A0.j.golf)) != null && (function1 = (Function1) aVar.bravo) != null) {
                            textValue2 = golf.getTextValue();
                        }
                    }
                }
            }
            J2.n nVar = this.f13919x;
            if (nVar != null) {
                U.k kVar = (U.k) nVar.purple;
                if (!kVar.alpha.isEmpty()) {
                    int size2 = sparseArray.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        int keyAt2 = sparseArray.keyAt(i5);
                        AutofillValue golf2 = C3.a.golf(sparseArray.get(keyAt2));
                        isText = golf2.isText();
                        if (isText) {
                            textValue = golf2.getTextValue();
                            textValue.toString();
                            if (kVar.alpha.get(Integer.valueOf(keyAt2)) != null) {
                                throw new ClassCastException();
                            }
                        } else {
                            isDate = golf2.isDate();
                            if (!isDate) {
                                isList = golf2.isList();
                                if (!isList) {
                                    isToggle = golf2.isToggle();
                                    if (isToggle) {
                                        throw new Error("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                                    }
                                } else {
                                    throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for list");
                                }
                            } else {
                                throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for date");
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean azure() {
        if (!isFocused() && !hasFocus()) {
            return super.requestFocus(130, null);
        }
        return true;
    }

    public final void beige(s0.al alVar) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (alVar != null) {
                while (alVar != null && alVar.sierra() == s0.ai.alpha) {
                    if (!this.f13859G) {
                        s0.al victor = alVar.victor();
                        if (victor == null) {
                            break;
                        }
                        long j5 = ((C2563x) victor.f13305x.echo).silver;
                        if (Q0.a.foxtrot(j5) && Q0.a.echo(j5)) {
                            break;
                        }
                    }
                    alVar = alVar.victor();
                }
                if (alVar == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() != 0 && getHeight() != 0) {
                invalidate();
            } else {
                requestLayout();
            }
        }
    }

    public final long black(long j5) {
        zulu();
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - Float.intBitsToFloat((int) (this.f13868P >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - Float.intBitsToFloat((int) (this.f13868P & 4294967295L));
        return C0347ag.bravo((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), this.f13865M);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int blue(MotionEvent motionEvent) {
        Object obj;
        m0.t tVar;
        int charlie;
        int actionMasked;
        if (this.f13918w0) {
            this.f13918w0 = false;
            int metaState = motionEvent.getMetaState();
            this.f13879c.getClass();
            ((androidx.compose.runtime.t0) F0.alpha).setValue(new m0.y(metaState));
        }
        m0.h hVar = this.f13914u;
        com.google.android.play.core.integrity.c alpha = hVar.alpha(motionEvent, this);
        E.s sVar = this.f13916v;
        if (alpha != null) {
            ArrayList arrayList = (ArrayList) alpha.purple;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i4 = size - 1;
                    obj = arrayList.get(size);
                    if (((m0.t) obj).echo) {
                        break;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
                tVar = (m0.t) obj;
                if (tVar != null) {
                    this.alpha = tVar.delta;
                }
                charlie = sVar.charlie(alpha, this, november(motionEvent));
                alpha.red = null;
                actionMasked = motionEvent.getActionMasked();
                if ((actionMasked == 0 && actionMasked != 5) || (charlie & 1) != 0) {
                    return charlie;
                }
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                hVar.charlie.delete(pointerId);
                hVar.bravo.delete(pointerId);
                return charlie;
            }
            obj = null;
            tVar = (m0.t) obj;
            if (tVar != null) {
            }
            charlie = sVar.charlie(alpha, this, november(motionEvent));
            alpha.red = null;
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
            }
            int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
            hVar.charlie.delete(pointerId2);
            hVar.bravo.delete(pointerId2);
            return charlie;
        }
        if (!sVar.alpha) {
            ((bv.u) ((com.google.android.material.internal.s) sVar.delta).purple).bravo();
            ((m0.c) sVar.charlie).charlie();
        }
        return 0;
    }

    public final void bronze(MotionEvent motionEvent, int i4, long j5, boolean z2) {
        int i5;
        long downTime;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int i11 = 1;
        int i12 = -1;
        int i13 = 0;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i12 = motionEvent.getActionIndex();
            }
        } else if (i4 != 9 && i4 != 10) {
            i12 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i12 >= 0) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        int i14 = pointerCount - i5;
        if (i14 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            pointerPropertiesArr[i15] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i14];
        for (int i16 = 0; i16 < i14; i16++) {
            pointerCoordsArr[i16] = new MotionEvent.PointerCoords();
        }
        int i17 = 0;
        while (i17 < i14) {
            if (i12 >= 0 && i17 >= i12) {
                i10 = i11;
            } else {
                i10 = 0;
            }
            int i18 = i10 + i17;
            motionEvent.getPointerProperties(i18, pointerPropertiesArr[i17]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i17];
            motionEvent.getPointerCoords(i18, pointerCoords);
            float f5 = pointerCoords.x;
            float f10 = pointerCoords.y;
            long quebec = quebec((Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (quebec >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (quebec & 4294967295L));
            i17++;
            i12 = i12;
            i11 = 1;
        }
        if (!z2) {
            i13 = motionEvent.getButtonState();
        }
        int i19 = i13;
        if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
            downTime = j5;
        } else {
            downTime = motionEvent.getDownTime();
        }
        MotionEvent obtain = MotionEvent.obtain(downTime, j5, i4, i14, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), i19, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        com.google.android.play.core.integrity.c alpha = this.f13914u.alpha(obtain, this);
        Intrinsics.checkNotNull(alpha);
        this.f13916v.charlie(alpha, this, true);
        obtain.recycle();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i4) {
        return this.f13896l.mike(false, i4, this.alpha);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i4) {
        return this.f13896l.mike(true, i4, this.alpha);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void coral(C3226d c3226d, Pd.c cVar) {
        C2945w c2945w;
        int i4;
        if (cVar instanceof C2945w) {
            c2945w = (C2945w) cVar;
            int i5 = c2945w.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2945w.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c2945w.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = c2945w.red;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    AtomicReference atomicReference = this.f13878b0;
                    C2928n c2928n = new C2928n(this, 3);
                    c2945w.red = 1;
                    if (vf.ad.mike(new T.v(c2928n, atomicReference, c3226d, null), c2945w) == aVar) {
                        return;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }
        c2945w = new C2945w(this, cVar);
        Object obj2 = c2945w.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = c2945w.red;
        if (i4 == 0) {
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void crimson() {
        boolean z2;
        View view;
        long j5;
        long charlie;
        float[] fArr;
        B0.c cVar;
        boolean z10;
        long j6;
        boolean z11;
        int[] iArr = this.f13862J;
        getLocationOnScreen(iArr);
        long j7 = this.f13861I;
        int i4 = (int) (j7 >> 32);
        int i5 = (int) (j7 & 4294967295L);
        int i10 = iArr[0];
        if (i4 != i10 || i5 != iArr[1] || this.f13866N < 0) {
            this.f13861I = (i10 << 32) | (iArr[1] & 4294967295L);
            if (i4 != Integer.MAX_VALUE && i5 != Integer.MAX_VALUE) {
                getRoot().f13306y.papa.e();
                z2 = true;
                zulu();
                view = this.f13922y0;
                if (view == null) {
                    view = getRootView();
                    this.f13922y0 = view;
                }
                B0.b rectManager = getRectManager();
                j5 = this.f13861I;
                charlie = AbstractC2609a7.charlie(this.f13868P);
                int width = view.getWidth();
                int height = view.getHeight();
                rectManager.getClass();
                fArr = this.f13864L;
                if ((AbstractC2728o0.alpha(fArr) & 2) != 0) {
                    fArr = null;
                }
                cVar = rectManager.bravo;
                if (Q0.k.alpha(charlie, cVar.charlie)) {
                    cVar.charlie = charlie;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!Q0.k.alpha(j5, cVar.delta)) {
                    cVar.delta = j5;
                    z10 = true;
                }
                if (fArr != null) {
                    z10 = true;
                }
                j6 = (4294967295L & height) | (width << 32);
                if (j6 != cVar.echo) {
                    cVar.echo = j6;
                    z10 = true;
                }
                if (z10 && !rectManager.echo) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                rectManager.echo = z11;
                this.f13860H.alpha(z2);
                getRectManager().alpha();
            }
        }
        z2 = false;
        zulu();
        view = this.f13922y0;
        if (view == null) {
        }
        B0.b rectManager2 = getRectManager();
        j5 = this.f13861I;
        charlie = AbstractC2609a7.charlie(this.f13868P);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        rectManager2.getClass();
        fArr = this.f13864L;
        if ((AbstractC2728o0.alpha(fArr) & 2) != 0) {
        }
        cVar = rectManager2.bravo;
        if (Q0.k.alpha(charlie, cVar.charlie)) {
        }
        if (!Q0.k.alpha(j5, cVar.delta)) {
        }
        if (fArr != null) {
        }
        j6 = (4294967295L & height2) | (width2 << 32);
        if (j6 != cVar.echo) {
        }
        if (z10) {
        }
        z11 = true;
        rectManager2.echo = z11;
        this.f13860H.alpha(z2);
        getRectManager().alpha();
    }

    public final void cyan(float f5) {
        if (this.white) {
            if (f5 > 0.0f) {
                if (Float.isNaN(this.f13905p0) || f5 > this.f13905p0) {
                    this.f13905p0 = f5;
                    return;
                }
                return;
            }
            if (f5 < 0.0f) {
                if (Float.isNaN(this.f13907q0) || f5 < this.f13907q0) {
                    this.f13907q0 = f5;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            kilo(getRoot());
        }
        romeo(true);
        S.n.kilo().mike();
        this.f13910s = true;
        C0365s c0365s = this.f13881d;
        C0348b c0348b = c0365s.alpha;
        Canvas canvas2 = c0348b.alpha;
        c0348b.alpha = canvas;
        getRoot().india(c0348b, null);
        c0365s.alpha.alpha = canvas2;
        ArrayList arrayList = this.f13906q;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((C2907c0) ((s0.U) arrayList.get(i4))).golf();
            }
        }
        int i5 = D0.alpha;
        arrayList.clear();
        this.f13910s = false;
        ArrayList arrayList2 = this.f13908r;
        if (arrayList2 != null) {
            Intrinsics.checkNotNull(arrayList2);
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (this.white) {
            AbstractC2887E.alpha(this, this.f13905p0);
            View view = this.teal;
            if (view != null) {
                AbstractC2887E.alpha(view, this.f13907q0);
                if (!Float.isNaN(this.f13907q0)) {
                    view.invalidate();
                    drawChild(canvas, view, getDrawingTime());
                }
                this.f13905p0 = Float.NaN;
                this.f13907q0 = Float.NaN;
            } else {
                Intrinsics.lima("frameRateCategoryView");
                throw null;
            }
        }
        getRectManager().alpha();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C0058p c0058p;
        C2186a c2186a;
        int size;
        C0058p c0058p2;
        T.r rVar;
        C0058p c0058p3;
        if (this.f13913t0) {
            ga.as asVar = this.f13911s0;
            removeCallbacks(asVar);
            if (motionEvent.getActionMasked() == 8) {
                this.f13913t0 = false;
            } else {
                asVar.run();
            }
        }
        if (!mike(motionEvent) && isAttachedToWindow()) {
            if (motionEvent.getActionMasked() == 8) {
                if (motionEvent.isFromSource(4194304)) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    motionEvent.getAxisValue(26);
                    Context context = getContext();
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 26) {
                        Method method = s1.av.alpha;
                        d.S0.foxtrot(viewConfiguration);
                    } else {
                        s1.av.alpha(viewConfiguration, context);
                    }
                    Context context2 = getContext();
                    if (i4 >= 26) {
                        d.S0.echo(viewConfiguration);
                    } else {
                        s1.av.alpha(viewConfiguration, context2);
                    }
                    motionEvent.getEventTime();
                    motionEvent.getDeviceId();
                    Y.k focusOwner = getFocusOwner();
                    C2934q c2934q = new C2934q(this, motionEvent, 1);
                    Y.n nVar = (Y.n) focusOwner;
                    if (nVar.delta.echo) {
                        System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                        return false;
                    }
                    Y.aa charlie = Y.g.charlie(nVar.charlie);
                    if (charlie != null) {
                        if (!charlie.getNode().isAttached()) {
                            AbstractC2264a.bravo("visitAncestors called on an unattached node");
                        }
                        T.r node = charlie.getNode();
                        s0.al golf = AbstractC2555o.golf(charlie);
                        loop0: while (true) {
                            if (golf != null) {
                                if ((((T.r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                    while (node != null) {
                                        if ((node.getKindSet$ui_release() & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                            rVar = node;
                                            J.e eVar = null;
                                            while (rVar != null) {
                                                if (rVar instanceof C2186a) {
                                                    break loop0;
                                                }
                                                if ((rVar.getKindSet$ui_release() & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (rVar instanceof AbstractC2556p)) {
                                                    int i5 = 0;
                                                    for (T.r rVar2 = ((AbstractC2556p) rVar).purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                                                        if ((rVar2.getKindSet$ui_release() & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                                            i5++;
                                                            if (i5 == 1) {
                                                                rVar = rVar2;
                                                            } else {
                                                                if (eVar == null) {
                                                                    eVar = new J.e(new T.r[16]);
                                                                }
                                                                if (rVar != null) {
                                                                    eVar.bravo(rVar);
                                                                    rVar = null;
                                                                }
                                                                eVar.bravo(rVar2);
                                                            }
                                                        }
                                                    }
                                                    if (i5 == 1) {
                                                    }
                                                }
                                                rVar = AbstractC2555o.bravo(eVar);
                                            }
                                        }
                                        node = node.getParent$ui_release();
                                    }
                                }
                                golf = golf.victor();
                                if (golf != null && (c0058p3 = golf.f13305x) != null) {
                                    node = (s0.g0) c0058p3.golf;
                                } else {
                                    node = null;
                                }
                            } else {
                                rVar = null;
                                break;
                            }
                        }
                        c2186a = (C2186a) rVar;
                    } else {
                        c2186a = null;
                    }
                    if (c2186a != null) {
                        C2186a c2186a2 = c2186a;
                        if (!c2186a2.getNode().isAttached()) {
                            AbstractC2264a.bravo("visitAncestors called on an unattached node");
                        }
                        T.r parent$ui_release = c2186a2.getNode().getParent$ui_release();
                        s0.al golf2 = AbstractC2555o.golf(c2186a);
                        ArrayList arrayList = null;
                        while (golf2 != null) {
                            if ((((T.r) golf2.f13305x.delta).getAggregateChildKindSet$ui_release() & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                while (parent$ui_release != null) {
                                    if ((parent$ui_release.getKindSet$ui_release() & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                        T.r rVar3 = parent$ui_release;
                                        J.e eVar2 = null;
                                        while (rVar3 != null) {
                                            if (rVar3 instanceof C2186a) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(rVar3);
                                            } else if ((rVar3.getKindSet$ui_release() & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (rVar3 instanceof AbstractC2556p)) {
                                                int i10 = 0;
                                                for (T.r rVar4 = ((AbstractC2556p) rVar3).purple; rVar4 != null; rVar4 = rVar4.getChild$ui_release()) {
                                                    if ((rVar4.getKindSet$ui_release() & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                                        i10++;
                                                        if (i10 == 1) {
                                                            rVar3 = rVar4;
                                                        } else {
                                                            if (eVar2 == null) {
                                                                eVar2 = new J.e(new T.r[16]);
                                                            }
                                                            if (rVar3 != null) {
                                                                eVar2.bravo(rVar3);
                                                                rVar3 = null;
                                                            }
                                                            eVar2.bravo(rVar4);
                                                        }
                                                    }
                                                }
                                                if (i10 == 1) {
                                                }
                                            }
                                            rVar3 = AbstractC2555o.bravo(eVar2);
                                        }
                                    }
                                    parent$ui_release = parent$ui_release.getParent$ui_release();
                                }
                            }
                            golf2 = golf2.victor();
                            if (golf2 != null && (c0058p2 = golf2.f13305x) != null) {
                                parent$ui_release = (s0.g0) c0058p2.golf;
                            } else {
                                parent$ui_release = null;
                            }
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i11 = size - 1;
                                ((C2186a) arrayList.get(size)).getClass();
                                if (i11 < 0) {
                                    break;
                                }
                                size = i11;
                            }
                        }
                        T.r node2 = c2186a2.getNode();
                        J.e eVar3 = null;
                        while (node2 != null) {
                            if (node2 instanceof C2186a) {
                            } else if ((node2.getKindSet$ui_release() & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (node2 instanceof AbstractC2556p)) {
                                int i12 = 0;
                                for (T.r rVar5 = ((AbstractC2556p) node2).purple; rVar5 != null; rVar5 = rVar5.getChild$ui_release()) {
                                    if ((rVar5.getKindSet$ui_release() & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            node2 = rVar5;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new J.e(new T.r[16]);
                                            }
                                            if (node2 != null) {
                                                eVar3.bravo(node2);
                                                node2 = null;
                                            }
                                            eVar3.bravo(rVar5);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            node2 = AbstractC2555o.bravo(eVar3);
                        }
                        if (!((Boolean) c2934q.invoke()).booleanValue()) {
                            T.r node3 = c2186a2.getNode();
                            J.e eVar4 = null;
                            while (node3 != null) {
                                if (node3 instanceof C2186a) {
                                } else if ((node3.getKindSet$ui_release() & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (node3 instanceof AbstractC2556p)) {
                                    int i13 = 0;
                                    for (T.r rVar6 = ((AbstractC2556p) node3).purple; rVar6 != null; rVar6 = rVar6.getChild$ui_release()) {
                                        if ((rVar6.getKindSet$ui_release() & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                node3 = rVar6;
                                            } else {
                                                if (eVar4 == null) {
                                                    eVar4 = new J.e(new T.r[16]);
                                                }
                                                if (node3 != null) {
                                                    eVar4.bravo(node3);
                                                    node3 = null;
                                                }
                                                eVar4.bravo(rVar6);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                node3 = AbstractC2555o.bravo(eVar4);
                            }
                            if (arrayList != null) {
                                int size2 = arrayList.size();
                                for (int i14 = 0; i14 < size2; i14++) {
                                    C2932p c2932p = ((C2186a) arrayList.get(i14)).alpha;
                                }
                            }
                        }
                        return true;
                    }
                    return false;
                }
                if ((juliet(motionEvent) & 1) != 0) {
                    return true;
                }
                return false;
            }
            if (!motionEvent.isFromSource(2)) {
                float x4 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Float.floatToRawIntBits(x4);
                Float.floatToRawIntBits(y10);
                motionEvent.getEventTime();
                motionEvent.getActionMasked();
                Y.k focusOwner2 = getFocusOwner();
                new C2934q(this, motionEvent, 0);
                Y.n nVar2 = (Y.n) focusOwner2;
                if (nVar2.delta.echo) {
                    System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
                } else {
                    Y.aa charlie2 = Y.g.charlie(nVar2.charlie);
                    if (charlie2 != null) {
                        if (!charlie2.getNode().isAttached()) {
                            AbstractC2264a.bravo("visitAncestors called on an unattached node");
                        }
                        T.r node4 = charlie2.getNode();
                        s0.al golf3 = AbstractC2555o.golf(charlie2);
                        while (golf3 != null) {
                            if ((((T.r) golf3.f13305x.delta).getAggregateChildKindSet$ui_release() & 2097152) != 0) {
                                while (node4 != null) {
                                    if ((node4.getKindSet$ui_release() & 2097152) != 0) {
                                        T.r rVar7 = node4;
                                        J.e eVar5 = null;
                                        while (rVar7 != null) {
                                            if ((rVar7.getKindSet$ui_release() & 2097152) != 0 && (rVar7 instanceof AbstractC2556p)) {
                                                int i15 = 0;
                                                for (T.r rVar8 = ((AbstractC2556p) rVar7).purple; rVar8 != null; rVar8 = rVar8.getChild$ui_release()) {
                                                    if ((rVar8.getKindSet$ui_release() & 2097152) != 0) {
                                                        i15++;
                                                        if (i15 == 1) {
                                                            rVar7 = rVar8;
                                                        } else {
                                                            if (eVar5 == null) {
                                                                eVar5 = new J.e(new T.r[16]);
                                                            }
                                                            if (rVar7 != null) {
                                                                eVar5.bravo(rVar7);
                                                                rVar7 = null;
                                                            }
                                                            eVar5.bravo(rVar8);
                                                        }
                                                    }
                                                }
                                                if (i15 == 1) {
                                                }
                                            }
                                            rVar7 = AbstractC2555o.bravo(eVar5);
                                        }
                                    }
                                    node4 = node4.getParent$ui_release();
                                }
                            }
                            golf3 = golf3.victor();
                            if (golf3 != null && (c0058p = golf3.f13305x) != null) {
                                node4 = (s0.g0) c0058p.golf;
                            } else {
                                node4 = null;
                            }
                        }
                    }
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0164, code lost:
    
        if (oscar(r24) == false) goto L153;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z10;
        int i4;
        boolean z11 = this.f13913t0;
        ga.as asVar = this.f13911s0;
        if (z11) {
            removeCallbacks(asVar);
            asVar.run();
        }
        if (!mike(motionEvent) && isAttachedToWindow()) {
            ad adVar = this.f13896l;
            AccessibilityManager accessibilityManager = adVar.golf;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int action = motionEvent.getAction();
                C2946x c2946x = adVar.delta;
                if (action != 7 && action != 9) {
                    if (action == 10) {
                        int i5 = adVar.echo;
                        if (i5 != Integer.MIN_VALUE) {
                            if (i5 != Integer.MIN_VALUE) {
                                adVar.echo = RecyclerView.UNDEFINED_DURATION;
                                ad.bronze(adVar, RecyclerView.UNDEFINED_DURATION, 128, null, 12);
                                ad.bronze(adVar, i5, Barcode.FORMAT_QR_CODE, null, 12);
                            }
                        } else {
                            c2946x.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                        }
                    }
                } else {
                    float x4 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    c2946x.romeo(true);
                    C2561v c2561v = new C2561v();
                    s0.al root = c2946x.getRoot();
                    long floatToRawIntBits = (Float.floatToRawIntBits(x4) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L);
                    s0.af afVar = s0.al.f13273J;
                    C0058p c0058p = root.f13305x;
                    s0.L l10 = (s0.L) c0058p.foxtrot;
                    C2546f c2546f = s0.L.f13244D;
                    ((s0.L) c0058p.foxtrot).F(s0.L.f13250J, l10.x(floatToRawIntBits), c2561v, 1, true);
                    for (int ivory = CollectionsKt.ivory(c2561v); -1 < ivory; ivory--) {
                        Object bravo = c2561v.alpha.bravo(ivory);
                        Intrinsics.charlie(bravo, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                        s0.al golf = AbstractC2555o.golf((T.r) bravo);
                        if (c2946x.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(golf) != null) {
                            break;
                        }
                        if (golf.f13305x.foxtrot(8)) {
                            int azure = adVar.azure(golf.purple);
                            A0.s alpha = A0.v.alpha(golf, false);
                            if (A0.v.foxtrot(alpha)) {
                                if (!alpha.kilo().alpha.charlie(A0.x.zulu)) {
                                    i4 = azure;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i4 = RecyclerView.UNDEFINED_DURATION;
                    c2946x.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    int i10 = adVar.echo;
                    if (i10 != i4) {
                        adVar.echo = i4;
                        ad.bronze(adVar, i4, 128, null, 12);
                        ad.bronze(adVar, i10, Barcode.FORMAT_QR_CODE, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked != 10 || !november(motionEvent)) {
                    z10 = 1;
                    if ((juliet(motionEvent) & z10) != 0) {
                        return z10;
                    }
                } else if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                    MotionEvent motionEvent2 = this.f13897l0;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.f13897l0 = MotionEvent.obtainNoHistory(motionEvent);
                    this.f13913t0 = true;
                    postDelayed(asVar, 8L);
                    return false;
                }
            } else {
                z10 = 1;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isFocused()) {
            int metaState = keyEvent.getMetaState();
            this.f13879c.getClass();
            ((androidx.compose.runtime.t0) F0.alpha).setValue(new m0.y(metaState));
            if (!((Y.n) getFocusOwner()).delta(keyEvent, Y.j.alpha) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }
        return ((Y.n) getFocusOwner()).delta(keyEvent, new qa.j(4, this, keyEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C0058p c0058p;
        if (isFocused()) {
            Y.n nVar = (Y.n) getFocusOwner();
            if (nVar.delta.echo) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                Y.aa charlie = Y.g.charlie(nVar.charlie);
                if (charlie != null) {
                    if (!charlie.getNode().isAttached()) {
                        AbstractC2264a.bravo("visitAncestors called on an unattached node");
                    }
                    T.r node = charlie.getNode();
                    s0.al golf = AbstractC2555o.golf(charlie);
                    while (golf != null) {
                        if ((((T.r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & 131072) != 0) {
                            while (node != null) {
                                if ((node.getKindSet$ui_release() & 131072) != 0) {
                                    T.r rVar = node;
                                    J.e eVar = null;
                                    while (rVar != null) {
                                        if ((rVar.getKindSet$ui_release() & 131072) != 0 && (rVar instanceof AbstractC2556p)) {
                                            int i4 = 0;
                                            for (T.r rVar2 = ((AbstractC2556p) rVar).purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                                                if ((rVar2.getKindSet$ui_release() & 131072) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        rVar = rVar2;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new J.e(new T.r[16]);
                                                        }
                                                        if (rVar != null) {
                                                            eVar.bravo(rVar);
                                                            rVar = null;
                                                        }
                                                        eVar.bravo(rVar2);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        rVar = AbstractC2555o.bravo(eVar);
                                    }
                                }
                                node = node.getParent$ui_release();
                            }
                        }
                        golf = golf.victor();
                        if (golf != null && (c0058p = golf.f13305x) != null) {
                            node = (s0.g0) c0058p.golf;
                        } else {
                            node = null;
                        }
                    }
                }
            }
        }
        if (!super.dispatchKeyEventPreIme(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            af.alpha.alpha(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f13913t0) {
            ga.as asVar = this.f13911s0;
            removeCallbacks(asVar);
            MotionEvent motionEvent2 = this.f13897l0;
            Intrinsics.checkNotNull(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f13913t0 = false;
            } else {
                asVar.run();
            }
        }
        if (!mike(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || oscar(motionEvent))) {
            int juliet = juliet(motionEvent);
            if ((juliet & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((juliet & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final View findViewByAccessibilityIdTraversal(int i4) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i4));
                if (invoke instanceof View) {
                    return (View) invoke;
                }
                return null;
            }
            return hotel(i4, this);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i4) {
        Z.c bravo;
        int i5;
        if (view != null && !this.f13860H.charlie) {
            Object obj = Y.foxtrot.get();
            Intrinsics.checkNotNull(obj);
            View bravo2 = ((Y) obj).bravo(i4, view, this);
            if (view == this) {
                Y.aa charlie = Y.g.charlie(((Y.n) getFocusOwner()).charlie);
                if (charlie != null) {
                    bravo = Y.g.delta(charlie);
                } else {
                    bravo = null;
                }
                if (bravo == null) {
                    bravo = Y.g.bravo(view, this);
                }
            } else {
                bravo = Y.g.bravo(view, this);
            }
            Y.d oscar = Y.g.oscar(i4);
            if (oscar != null) {
                i5 = oscar.alpha;
            } else {
                i5 = 6;
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            if (((Y.n) getFocusOwner()).echo(i5, bravo, new C2936r(objectRef)) != null) {
                Object obj2 = objectRef.alpha;
                if (obj2 == null) {
                    if (bravo2 == null) {
                    }
                } else {
                    if (bravo2 != null) {
                        if (i5 == 1 || i5 == 2) {
                            return super.focusSearch(view, i4);
                        }
                        if (Y.ae.golf(Y.g.delta((Y.aa) obj2), Y.g.bravo(bravo2, this), bravo, i5)) {
                        }
                    }
                    return this;
                }
                return bravo2;
            }
            return view;
        }
        return super.focusSearch(view, i4);
    }

    @NotNull
    public final C2885C getAndroidViewsHandler$ui_release() {
        if (this.f13857E == null) {
            C2885C c2885c = new C2885C(getContext());
            this.f13857E = c2885c;
            addView(c2885c, -1);
            requestLayout();
        }
        C2885C c2885c2 = this.f13857E;
        Intrinsics.checkNotNull(c2885c2);
        return c2885c2;
    }

    @Nullable
    public U.f getAutofill() {
        return this.f13919x;
    }

    @Nullable
    public U.j getAutofillManager() {
        return this.f13921y;
    }

    @NotNull
    public U.k getAutofillTree() {
        return this.f13904p;
    }

    @NotNull
    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.f13917w;
    }

    @NotNull
    public final V.d getContentCaptureManager$ui_release() {
        return this.f13898m;
    }

    @NotNull
    public Nd.h getCoroutineContext() {
        return this.f13875a;
    }

    @NotNull
    public Q0.d getDensity() {
        return (Q0.d) ((androidx.compose.runtime.t0) this.silver).getValue();
    }

    @Nullable
    public Z.c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            Y.aa charlie = Y.g.charlie(((Y.n) getFocusOwner()).charlie);
            if (charlie == null) {
                return null;
            }
            return Y.g.delta(charlie);
        }
        View findFocus = findFocus();
        if (findFocus == null) {
            return null;
        }
        return Y.g.bravo(findFocus, this);
    }

    @NotNull
    public Y.k getFocusOwner() {
        return this.yellow;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        Z.c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.alpha);
            rect.top = Math.round(embeddedViewFocusRect.bravo);
            rect.right = Math.round(embeddedViewFocusRect.charlie);
            rect.bottom = Math.round(embeddedViewFocusRect.delta);
            return;
        }
        if (!Intrinsics.areEqual(((Y.n) getFocusOwner()).echo(6, null, C2932p.red), Boolean.TRUE)) {
            rect.set(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
        } else {
            super.getFocusedRect(rect);
        }
    }

    @NotNull
    public H0.j getFontFamilyResolver() {
        return (H0.j) ((androidx.compose.runtime.t0) this.f13883e0).getValue();
    }

    @NotNull
    public H0.h getFontLoader() {
        return this.f13882d0;
    }

    @NotNull
    public InterfaceC0341aa getGraphicsContext() {
        return this.f13902o;
    }

    @NotNull
    public InterfaceC1878a getHapticFeedBack() {
        return this.f13889h0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f13860H.bravo.kilo();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @NotNull
    public j0.b getInputModeManager() {
        return this.f13891i0;
    }

    @NotNull
    public final RunnableC2400s getInsetsListener() {
        return this.f13884f;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f13866N;
    }

    @Override // android.view.View, android.view.ViewParent
    @NotNull
    public Q0.n getLayoutDirection() {
        return (Q0.n) ((androidx.compose.runtime.t0) this.f13887g0).getValue();
    }

    public long getMeasureIteration() {
        C2540A c2540a = this.f13860H;
        if (!c2540a.charlie) {
            AbstractC2264a.alpha("measureIteration should be only used during the measure/layout pass");
        }
        return c2540a.golf;
    }

    @NotNull
    public r0.d getModifierLocalManager() {
        return this.f13893j0;
    }

    @NotNull
    public AbstractC2366B getPlacementScope() {
        C2368D c2368d = AbstractC2369E.alpha;
        return new q0.am(1, this);
    }

    @NotNull
    public m0.p getPointerIconService() {
        return this.f13924z0;
    }

    @NotNull
    public B0.b getRectManager() {
        return this.f13890i;
    }

    @NotNull
    public s0.al getRoot() {
        return this.f13886g;
    }

    @NotNull
    public s0.d0 getRootForTest() {
        return this.f13892j;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        C2576i c2576i;
        if (Build.VERSION.SDK_INT < 31 || (c2576i = this.f13920x0) == null) {
            return false;
        }
        return ((Boolean) ((androidx.compose.runtime.t0) ((androidx.compose.runtime.ax) c2576i.alpha)).getValue()).booleanValue();
    }

    @NotNull
    public A0.u getSemanticsOwner() {
        return this.f13894k;
    }

    @NotNull
    public s0.an getSharedDrawScope() {
        return this.red;
    }

    public boolean getShowLayoutBounds() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C2886D.alpha.alpha(this);
        }
        return this.f13856D;
    }

    @NotNull
    public s0.Y getSnapshotObserver() {
        return this.C;
    }

    @NotNull
    public InterfaceC2937r0 getSoftwareKeyboardController() {
        return this.f13880c0;
    }

    @NotNull
    public I0.ab getTextInputService() {
        return this.f13876a0;
    }

    @NotNull
    public InterfaceC2941t0 getTextToolbar() {
        return this.f13895k0;
    }

    @Nullable
    public final s0.c0 getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    @NotNull
    public View getView() {
        return this;
    }

    @NotNull
    public C0 getViewConfiguration() {
        return this.e;
    }

    @Nullable
    public final C2926m getViewTreeOwners() {
        return (C2926m) this.f13869R.getValue();
    }

    @NotNull
    public E0 getWindowInfo() {
        return this.f13879c;
    }

    @Nullable
    public final U.c get_autofillManager$ui_release() {
        return this.f13921y;
    }

    public final void india(s0.al alVar, boolean z2) {
        this.f13860H.foxtrot(alVar, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b7, B:27:0x00bf, B:28:0x00c2, B:30:0x00c6, B:32:0x00cc, B:34:0x00d0, B:35:0x00d6, B:38:0x00de, B:41:0x00e6, B:42:0x00f2, B:44:0x00f8, B:46:0x00fe, B:48:0x0104, B:49:0x010a, B:51:0x010e, B:52:0x0112, B:57:0x0125, B:59:0x0129, B:60:0x0130, B:66:0x0141, B:67:0x014b, B:69:0x0153, B:70:0x0156, B:76:0x015d), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b7, B:27:0x00bf, B:28:0x00c2, B:30:0x00c6, B:32:0x00cc, B:34:0x00d0, B:35:0x00d6, B:38:0x00de, B:41:0x00e6, B:42:0x00f2, B:44:0x00f8, B:46:0x00fe, B:48:0x0104, B:49:0x010a, B:51:0x010e, B:52:0x0112, B:57:0x0125, B:59:0x0129, B:60:0x0130, B:66:0x0141, B:67:0x014b, B:69:0x0153, B:70:0x0156, B:76:0x015d), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b7, B:27:0x00bf, B:28:0x00c2, B:30:0x00c6, B:32:0x00cc, B:34:0x00d0, B:35:0x00d6, B:38:0x00de, B:41:0x00e6, B:42:0x00f2, B:44:0x00f8, B:46:0x00fe, B:48:0x0104, B:49:0x010a, B:51:0x010e, B:52:0x0112, B:57:0x0125, B:59:0x0129, B:60:0x0130, B:66:0x0141, B:67:0x014b, B:69:0x0153, B:70:0x0156, B:76:0x015d), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b7, B:27:0x00bf, B:28:0x00c2, B:30:0x00c6, B:32:0x00cc, B:34:0x00d0, B:35:0x00d6, B:38:0x00de, B:41:0x00e6, B:42:0x00f2, B:44:0x00f8, B:46:0x00fe, B:48:0x0104, B:49:0x010a, B:51:0x010e, B:52:0x0112, B:57:0x0125, B:59:0x0129, B:60:0x0130, B:66:0x0141, B:67:0x014b, B:69:0x0153, B:70:0x0156, B:76:0x015d), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b7, B:27:0x00bf, B:28:0x00c2, B:30:0x00c6, B:32:0x00cc, B:34:0x00d0, B:35:0x00d6, B:38:0x00de, B:41:0x00e6, B:42:0x00f2, B:44:0x00f8, B:46:0x00fe, B:48:0x0104, B:49:0x010a, B:51:0x010e, B:52:0x0112, B:57:0x0125, B:59:0x0129, B:60:0x0130, B:66:0x0141, B:67:0x014b, B:69:0x0153, B:70:0x0156, B:76:0x015d), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0141 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b7, B:27:0x00bf, B:28:0x00c2, B:30:0x00c6, B:32:0x00cc, B:34:0x00d0, B:35:0x00d6, B:38:0x00de, B:41:0x00e6, B:42:0x00f2, B:44:0x00f8, B:46:0x00fe, B:48:0x0104, B:49:0x010a, B:51:0x010e, B:52:0x0112, B:57:0x0125, B:59:0x0129, B:60:0x0130, B:66:0x0141, B:67:0x014b, B:69:0x0153, B:70:0x0156, B:76:0x015d), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b7, B:27:0x00bf, B:28:0x00c2, B:30:0x00c6, B:32:0x00cc, B:34:0x00d0, B:35:0x00d6, B:38:0x00de, B:41:0x00e6, B:42:0x00f2, B:44:0x00f8, B:46:0x00fe, B:48:0x0104, B:49:0x010a, B:51:0x010e, B:52:0x0112, B:57:0x0125, B:59:0x0129, B:60:0x0130, B:66:0x0141, B:67:0x014b, B:69:0x0153, B:70:0x0156, B:76:0x015d), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0156 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b7, B:27:0x00bf, B:28:0x00c2, B:30:0x00c6, B:32:0x00cc, B:34:0x00d0, B:35:0x00d6, B:38:0x00de, B:41:0x00e6, B:42:0x00f2, B:44:0x00f8, B:46:0x00fe, B:48:0x0104, B:49:0x010a, B:51:0x010e, B:52:0x0112, B:57:0x0125, B:59:0x0129, B:60:0x0130, B:66:0x0141, B:67:0x014b, B:69:0x0153, B:70:0x0156, B:76:0x015d), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x004e A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:91:0x0034, B:93:0x003e, B:98:0x004e, B:101:0x007e, B:103:0x0082, B:13:0x0094, B:21:0x00a7, B:23:0x00ad, B:104:0x0056, B:110:0x0062, B:113:0x006a), top: B:90:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int juliet(MotionEvent motionEvent) {
        boolean z2;
        boolean z10;
        int actionMasked;
        MotionEvent motionEvent2;
        boolean z11;
        C2946x c2946x;
        MotionEvent motionEvent3;
        MotionEvent motionEvent4;
        int i4;
        int action;
        MotionEvent motionEvent5;
        float f5;
        MotionEvent motionEvent6;
        float x4;
        boolean z12;
        MotionEvent motionEvent7;
        long j5;
        boolean z13;
        m0.c cVar;
        removeCallbacks(this.f13909r0);
        try {
            amber(motionEvent);
            this.f13867O = true;
            romeo(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent8 = this.f13897l0;
                if (motionEvent8 != null && motionEvent8.getToolType(0) == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                E.s sVar = this.f13916v;
                if (motionEvent8 != null) {
                    try {
                        if (motionEvent8.getSource() == motionEvent.getSource() && motionEvent8.getToolType(0) == motionEvent.getToolType(0)) {
                            z10 = false;
                            if (z10) {
                                if (motionEvent8.getButtonState() != 0 || (actionMasked = motionEvent8.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent8;
                                    if (!sVar.alpha) {
                                        ((bv.u) ((com.google.android.material.internal.s) sVar.delta).purple).bravo();
                                        ((m0.c) sVar.charlie).charlie();
                                    }
                                } else if (motionEvent8.getActionMasked() != 10 && z2) {
                                    bronze(motionEvent8, 10, motionEvent8.getEventTime(), true);
                                    motionEvent2 = motionEvent8;
                                }
                                if (motionEvent.getToolType(0) != 3) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z2 && z11 && actionMasked2 != 3 && actionMasked2 != 9 && november(motionEvent)) {
                                    c2946x = this;
                                    c2946x.bronze(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    c2946x = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = c2946x.f13897l0;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    motionEvent4 = c2946x.f13897l0;
                                    if (motionEvent4 == null) {
                                        i4 = motionEvent4.getPointerId(0);
                                    } else {
                                        i4 = -1;
                                    }
                                    action = motionEvent.getAction();
                                    m0.h hVar = c2946x.f13914u;
                                    if (action != 9 && motionEvent.getHistorySize() == 0) {
                                        if (i4 >= 0) {
                                            hVar.charlie.delete(i4);
                                            hVar.bravo.delete(i4);
                                        }
                                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                        motionEvent5 = c2946x.f13897l0;
                                        float f10 = Float.NaN;
                                        if (motionEvent5 == null) {
                                            f5 = motionEvent5.getX();
                                        } else {
                                            f5 = Float.NaN;
                                        }
                                        motionEvent6 = c2946x.f13897l0;
                                        if (motionEvent6 != null) {
                                            f10 = motionEvent6.getY();
                                        }
                                        x4 = motionEvent.getX();
                                        float y10 = motionEvent.getY();
                                        if (f5 != x4 && f10 == y10) {
                                            z12 = false;
                                        } else {
                                            z12 = true;
                                        }
                                        motionEvent7 = c2946x.f13897l0;
                                        if (motionEvent7 == null) {
                                            j5 = motionEvent7.getEventTime();
                                        } else {
                                            j5 = -1;
                                        }
                                        if (j5 == motionEvent.getEventTime()) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (!z12 || z13) {
                                            if (i4 >= 0) {
                                                hVar.charlie.delete(i4);
                                                hVar.bravo.delete(i4);
                                            }
                                            cVar = (m0.c) sVar.charlie;
                                            if (!cVar.delta) {
                                                cVar.delta = true;
                                            } else {
                                                cVar.golf.alpha.india();
                                            }
                                        }
                                    }
                                }
                                c2946x.f13897l0 = MotionEvent.obtainNoHistory(motionEvent);
                                int blue = blue(motionEvent);
                                Trace.endSection();
                                c2946x.f13867O = false;
                                return blue;
                            }
                        }
                        z10 = true;
                        if (z10) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                motionEvent2 = motionEvent8;
                if (motionEvent.getToolType(0) != 3) {
                }
                if (z2) {
                }
                c2946x = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = c2946x.f13897l0;
                if (motionEvent3 != null) {
                    motionEvent4 = c2946x.f13897l0;
                    if (motionEvent4 == null) {
                    }
                    action = motionEvent.getAction();
                    m0.h hVar2 = c2946x.f13914u;
                    if (action != 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        motionEvent5 = c2946x.f13897l0;
                        float f102 = Float.NaN;
                        if (motionEvent5 == null) {
                        }
                        motionEvent6 = c2946x.f13897l0;
                        if (motionEvent6 != null) {
                        }
                        x4 = motionEvent.getX();
                        float y102 = motionEvent.getY();
                        if (f5 != x4) {
                        }
                        z12 = true;
                        motionEvent7 = c2946x.f13897l0;
                        if (motionEvent7 == null) {
                        }
                        if (j5 == motionEvent.getEventTime()) {
                        }
                        if (!z12) {
                        }
                        if (i4 >= 0) {
                        }
                        cVar = (m0.c) sVar.charlie;
                        if (!cVar.delta) {
                        }
                    }
                }
                c2946x.f13897l0 = MotionEvent.obtainNoHistory(motionEvent);
                int blue2 = blue(motionEvent);
                Trace.endSection();
                c2946x.f13867O = false;
                return blue2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.f13867O = false;
            throw th3;
        }
    }

    public final void lima(s0.al alVar) {
        this.f13860H.papa(alVar, false);
        J.e zulu = alVar.zulu();
        Object[] objArr = zulu.alpha;
        int i4 = zulu.red;
        for (int i5 = 0; i5 < i4; i5++) {
            lima((s0.al) objArr[i5]);
        }
    }

    public final boolean november(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (0.0f <= x4 && x4 <= getWidth() && 0.0f <= y10 && y10 <= getHeight()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.ac lifecycle;
        androidx.lifecycle.al alVar;
        J2.n nVar;
        Method method;
        int i4 = 1;
        super.onAttachedToWindow();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 30) {
            setShowLayoutBounds(W.hotel());
        }
        this.f13884f.onViewAttachedToWindow(this);
        androidx.lifecycle.ac acVar = null;
        if (i5 > 28) {
            if (f13854E0 == null) {
                K5.a aVar = new K5.a(6);
                f13854E0 = aVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (f13850A0 == null) {
                        f13850A0 = Class.forName("android.os.SystemProperties");
                    }
                    if (f13852C0 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = f13850A0;
                        if (cls != null) {
                            method = cls.getDeclaredMethod("addChangeCallback", Runnable.class);
                        } else {
                            method = null;
                        }
                        f13852C0 = method;
                    }
                    Method method2 = f13852C0;
                    if (method2 != null) {
                        method2.invoke(null, aVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            bv.ah ahVar = f13853D0;
            synchronized (ahVar) {
                ahVar.golf(this);
            }
        }
        ((androidx.compose.runtime.t0) this.f13879c.alpha).setValue(Boolean.valueOf(hasWindowFocus()));
        C2917h0 c2917h0 = this.f13879c;
        new C2940t(this, 0);
        c2917h0.getClass();
        this.f13879c.getClass();
        lima(getRoot());
        kilo(getRoot());
        getSnapshotObserver().alpha.echo();
        if (echo() && (nVar = this.f13919x) != null) {
            U.i iVar = U.i.alpha;
            iVar.getClass();
            ((AutofillManager) nVar.red).registerCallback(iVar);
        }
        androidx.lifecycle.al delta = androidx.lifecycle.T.delta(this);
        InterfaceC2196f alpha = AbstractC2609a7.alpha(this);
        C2926m viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (delta != null && alpha != null && (delta != (alVar = viewTreeOwners.alpha) || alpha != alVar))) {
            if (delta != null) {
                if (alpha != null) {
                    if (viewTreeOwners != null && (lifecycle = viewTreeOwners.alpha.getLifecycle()) != null) {
                        lifecycle.charlie(this);
                    }
                    delta.getLifecycle().alpha(this);
                    C2926m c2926m = new C2926m(delta, alpha);
                    set_viewTreeOwners(c2926m);
                    Function1 function1 = this.f13870S;
                    if (function1 != null) {
                        function1.invoke(c2926m);
                    }
                    this.f13870S = null;
                } else {
                    throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                }
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
        }
        j0.c cVar = this.f13891i0;
        if (!isInTouchMode()) {
            i4 = 2;
        }
        ((androidx.compose.runtime.t0) cVar.alpha).setValue(new C1926a(i4));
        C2926m viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null) {
            acVar = viewTreeOwners2.alpha.getLifecycle();
        }
        if (acVar != null) {
            acVar.alpha(this);
            acVar.alpha(this.f13898m);
            getViewTreeObserver().addOnGlobalLayoutListener(this.f13871T);
            getViewTreeObserver().addOnScrollChangedListener(this.f13872U);
            getViewTreeObserver().addOnTouchModeChangeListener(this.f13873V);
            if (Build.VERSION.SDK_INT >= 31) {
                ak.alpha.bravo(this);
            }
            U.c cVar2 = this.f13921y;
            if (cVar2 != null) {
                ((Y.n) getFocusOwner()).golf.golf(cVar2);
                getSemanticsOwner().delta.golf(cVar2);
                return;
            }
            return;
        }
        throw Q0.c.xray("No lifecycle owner exists");
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        Object obj;
        T.u uVar = (T.u) this.f13878b0.get();
        Object obj2 = null;
        if (uVar != null) {
            obj = uVar.bravo;
        } else {
            obj = null;
        }
        au auVar = (au) obj;
        if (auVar == null) {
            return this.f13874W.delta;
        }
        T.u uVar2 = (T.u) auVar.silver.get();
        if (uVar2 != null) {
            obj2 = uVar2.bravo;
        }
        if (((C2909d0) obj2) != null && (!r1.echo)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i4;
        super.onConfigurationChanged(configuration);
        setDensity(W6.alpha(getContext()));
        this.f13879c.getClass();
        int i5 = Build.VERSION.SDK_INT;
        int i10 = 0;
        if (i5 >= 31) {
            i4 = g3.z.charlie(configuration);
        } else {
            i4 = 0;
        }
        if (i4 != this.f13885f0) {
            if (i5 >= 31) {
                i10 = g3.z.charlie(configuration);
            }
            this.f13885f0 = i10;
            setFontFamilyResolver(AbstractC2706l5.bravo(getContext()));
        }
        this.f13917w.invoke(configuration);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final /* synthetic */ void onCreate(androidx.lifecycle.al alVar) {
        androidx.appcompat.widget.P0.papa(alVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        Object obj;
        Object obj2;
        I0.o oVar;
        int i4;
        int i5;
        int i10;
        T.u uVar = (T.u) this.f13878b0.get();
        if (uVar != null) {
            obj = uVar.bravo;
        } else {
            obj = null;
        }
        au auVar = (au) obj;
        if (auVar == null) {
            I0.ad adVar = this.f13874W;
            if (adVar.delta) {
                I0.l lVar = adVar.hotel;
                I0.aa aaVar = adVar.golf;
                int i11 = lVar.echo;
                boolean z2 = lVar.alpha;
                if (i11 == 1) {
                    if (!z2) {
                        i4 = 0;
                        editorInfo.imeOptions = i4;
                        i5 = lVar.delta;
                        if (i5 == 1) {
                            editorInfo.inputType = 1;
                        } else if (i5 == 2) {
                            editorInfo.inputType = 1;
                            editorInfo.imeOptions = Integer.MIN_VALUE | i4;
                        } else if (i5 == 3) {
                            editorInfo.inputType = 2;
                        } else if (i5 == 4) {
                            editorInfo.inputType = 3;
                        } else if (i5 == 5) {
                            editorInfo.inputType = 17;
                        } else if (i5 == 6) {
                            editorInfo.inputType = 33;
                        } else if (i5 == 7) {
                            editorInfo.inputType = 129;
                        } else if (i5 == 8) {
                            editorInfo.inputType = 18;
                        } else if (i5 == 9) {
                            editorInfo.inputType = 8194;
                        } else {
                            throw new IllegalStateException("Invalid Keyboard Type");
                        }
                        if (!z2) {
                            int i12 = editorInfo.inputType;
                            if ((i12 & 1) == 1) {
                                editorInfo.inputType = i12 | 131072;
                                if (i11 == 1) {
                                    editorInfo.imeOptions |= 1073741824;
                                }
                            }
                        }
                        i10 = editorInfo.inputType;
                        if ((i10 & 1) == 1) {
                            int i13 = lVar.bravo;
                            if (i13 == 1) {
                                editorInfo.inputType = i10 | 4096;
                            } else if (i13 == 2) {
                                editorInfo.inputType = i10 | 8192;
                            } else if (i13 == 3) {
                                editorInfo.inputType = i10 | Http2.INITIAL_MAX_FRAME_SIZE;
                            }
                            if (lVar.charlie) {
                                editorInfo.inputType |= 32768;
                            }
                        }
                        long j5 = aaVar.bravo;
                        int i14 = D0.am.charlie;
                        editorInfo.initialSelStart = (int) (j5 >> 32);
                        editorInfo.initialSelEnd = (int) (j5 & 4294967295L);
                        u1.c.alpha(editorInfo, aaVar.alpha.purple);
                        editorInfo.imeOptions |= 33554432;
                        if (K1.k.delta()) {
                            K1.k.alpha().india(editorInfo);
                        }
                        I0.w wVar = new I0.w(adVar.golf, new Aa.m(18, adVar), adVar.hotel.charlie);
                        adVar.india.add(new WeakReference(wVar));
                        return wVar;
                    }
                    i4 = 6;
                    editorInfo.imeOptions = i4;
                    i5 = lVar.delta;
                    if (i5 == 1) {
                    }
                    if (!z2) {
                    }
                    i10 = editorInfo.inputType;
                    if ((i10 & 1) == 1) {
                    }
                    long j52 = aaVar.bravo;
                    int i142 = D0.am.charlie;
                    editorInfo.initialSelStart = (int) (j52 >> 32);
                    editorInfo.initialSelEnd = (int) (j52 & 4294967295L);
                    u1.c.alpha(editorInfo, aaVar.alpha.purple);
                    editorInfo.imeOptions |= 33554432;
                    if (K1.k.delta()) {
                    }
                    I0.w wVar2 = new I0.w(adVar.golf, new Aa.m(18, adVar), adVar.hotel.charlie);
                    adVar.india.add(new WeakReference(wVar2));
                    return wVar2;
                }
                if (i11 == 0) {
                    i4 = 1;
                } else if (i11 == 2) {
                    i4 = 2;
                } else if (i11 == 6) {
                    i4 = 5;
                } else if (i11 == 5) {
                    i4 = 7;
                } else if (i11 == 3) {
                    i4 = 3;
                } else if (i11 == 4) {
                    i4 = 4;
                } else {
                    if (i11 != 7) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                    i4 = 6;
                }
                editorInfo.imeOptions = i4;
                i5 = lVar.delta;
                if (i5 == 1) {
                }
                if (!z2) {
                }
                i10 = editorInfo.inputType;
                if ((i10 & 1) == 1) {
                }
                long j522 = aaVar.bravo;
                int i1422 = D0.am.charlie;
                editorInfo.initialSelStart = (int) (j522 >> 32);
                editorInfo.initialSelEnd = (int) (j522 & 4294967295L);
                u1.c.alpha(editorInfo, aaVar.alpha.purple);
                editorInfo.imeOptions |= 33554432;
                if (K1.k.delta()) {
                }
                I0.w wVar22 = new I0.w(adVar.golf, new Aa.m(18, adVar), adVar.hotel.charlie);
                adVar.india.add(new WeakReference(wVar22));
                return wVar22;
            }
        } else {
            T.u uVar2 = (T.u) auVar.silver.get();
            if (uVar2 != null) {
                obj2 = uVar2.bravo;
            } else {
                obj2 = null;
            }
            C2909d0 c2909d0 = (C2909d0) obj2;
            if (c2909d0 != null) {
                synchronized (c2909d0.charlie) {
                    if (c2909d0.echo) {
                        return null;
                    }
                    w.v alpha = c2909d0.alpha.alpha(editorInfo);
                    C0769g c0769g = new C0769g(23, c2909d0);
                    int i15 = Build.VERSION.SDK_INT;
                    if (i15 >= 34) {
                        oVar = new I0.o(alpha, c0769g);
                    } else if (i15 >= 25) {
                        oVar = new I0.o(alpha, c0769g);
                    } else if (i15 >= 24) {
                        oVar = new I0.o(alpha, c0769g);
                    } else {
                        oVar = new I0.o(alpha, c0769g);
                    }
                    c2909d0.delta.bravo(new WeakReference(oVar));
                    return oVar;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        A0.s sVar;
        AutofillId autofillId;
        String alpha;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        V.d dVar = this.f13898m;
        dVar.getClass();
        for (long j5 : jArr) {
            A0.t tVar = (A0.t) dVar.delta().bravo((int) j5);
            if (tVar != null && (sVar = tVar.alpha) != null) {
                E0.f.papa();
                autofillId = dVar.alpha.getAutofillId();
                ViewTranslationRequest.Builder juliet = E0.f.juliet(autofillId, sVar.golf);
                List list = (List) A0.v.delta(sVar.delta, A0.x.amber);
                if (list != null && (alpha = S0.a.alpha(list, "\n", null, 62)) != null) {
                    forText = TranslationRequestValue.forText(new D0.g(alpha));
                    juliet.setValue("android:text", forText);
                    build = juliet.build();
                    consumer.accept(build);
                }
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final void onDestroy(androidx.lifecycle.al alVar) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        J2.n nVar;
        super.onDetachedFromWindow();
        this.f13884f.onViewDetachedFromWindow(this);
        androidx.lifecycle.ac acVar = null;
        if (this.white) {
            View view = this.teal;
            if (view != null) {
                removeView(view);
            } else {
                Intrinsics.lima("frameRateCategoryView");
                throw null;
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 28) {
            bv.ah ahVar = f13853D0;
            synchronized (ahVar) {
                ahVar.juliet(this);
            }
        }
        S.x xVar = getSnapshotObserver().alpha;
        B2.s sVar = xVar.hotel;
        if (sVar != null) {
            sVar.charlie();
        }
        xVar.alpha();
        this.f13879c.getClass();
        C2926m viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            acVar = viewTreeOwners.alpha.getLifecycle();
        }
        if (acVar != null) {
            acVar.charlie(this.f13898m);
            acVar.charlie(this);
            if (echo() && (nVar = this.f13919x) != null) {
                U.i iVar = U.i.alpha;
                iVar.getClass();
                ((AutofillManager) nVar.red).unregisterCallback(iVar);
            }
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f13871T);
            getViewTreeObserver().removeOnScrollChangedListener(this.f13872U);
            getViewTreeObserver().removeOnTouchModeChangeListener(this.f13873V);
            if (i4 >= 31) {
                ak.alpha.alpha(this);
            }
            U.c cVar = this.f13921y;
            if (cVar != null) {
                getSemanticsOwner().delta.juliet(cVar);
                ((Y.n) getFocusOwner()).golf.juliet(cVar);
                return;
            }
            return;
        }
        throw Q0.c.xray("No lifecycle owner exists");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z2, int i4, Rect rect) {
        super.onFocusChanged(z2, i4, rect);
        if (!z2 && !hasFocus()) {
            Y.ab.alpha(((Y.n) getFocusOwner()).charlie, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        this.f13866N = 0L;
        this.f13860H.juliet(this.f13915u0);
        this.f13858F = null;
        crimson();
        if (this.f13857E != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i10 - i4, i11 - i5);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        C2540A c2540a = this.f13860H;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                lima(getRoot());
            }
            long golf = golf(i4);
            long golf2 = golf(i5);
            long alpha = X6.alpha((int) (golf >>> 32), (int) (golf & 4294967295L), (int) (golf2 >>> 32), (int) (4294967295L & golf2));
            Q0.a aVar = this.f13858F;
            if (aVar == null) {
                this.f13858F = new Q0.a(alpha);
                this.f13859G = false;
            } else if (!Q0.a.bravo(aVar.alpha, alpha)) {
                this.f13859G = true;
            }
            c2540a.quebec(alpha);
            c2540a.lima();
            setMeasuredDimension(getRoot().f13306y.papa.alpha, getRoot().f13306y.papa.purple);
            if (this.f13857E != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f13306y.papa.alpha, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f13306y.papa.purple, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final void onPause(androidx.lifecycle.al alVar) {
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i4) {
        if (echo() && viewStructure != null) {
            U.c cVar = this.f13921y;
            if (cVar != null) {
                s0.al alVar = cVar.bravo.alpha;
                AutofillId autofillId = cVar.golf;
                String str = cVar.echo;
                B0.b bVar = cVar.delta;
                U.p.alpha(viewStructure, alVar, autofillId, str, bVar);
                Object[] objArr = bv.as.alpha;
                bv.ah ahVar = new bv.ah(2);
                ahVar.golf(alVar);
                ahVar.golf(viewStructure);
                while (ahVar.echo()) {
                    Object kilo = ahVar.kilo(ahVar.bravo - 1);
                    Intrinsics.charlie(kilo, "null cannot be cast to non-null type android.view.ViewStructure");
                    ViewStructure viewStructure2 = (ViewStructure) kilo;
                    Object kilo2 = ahVar.kilo(ahVar.bravo - 1);
                    Intrinsics.charlie(kilo2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
                    J.b bVar2 = (J.b) ((s0.al) ((A0.m) kilo2)).oscar();
                    int i5 = ((J.e) bVar2.purple).red;
                    for (int i10 = 0; i10 < i5; i10++) {
                        A0.m mVar = (A0.m) bVar2.get(i10);
                        s0.al alVar2 = (s0.al) mVar;
                        if (!alVar2.f13282I && alVar2.cyan() && alVar2.emerald()) {
                            A0.k xray = alVar2.xray();
                            if (xray != null) {
                                A0.ac acVar = A0.j.golf;
                                bv.al alVar3 = xray.alpha;
                                if (alVar3.bravo(acVar) || alVar3.bravo(A0.x.quebec) || alVar3.bravo(A0.x.romeo)) {
                                    ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    U.p.alpha(newChild, mVar, cVar.golf, str, bVar);
                                    ahVar.golf(mVar);
                                    ahVar.golf(newChild);
                                }
                            }
                            ahVar.golf(mVar);
                            ahVar.golf(viewStructure2);
                        }
                    }
                }
            }
            J2.n nVar = this.f13919x;
            if (nVar != null) {
                U.k kVar = (U.k) nVar.purple;
                if (!kVar.alpha.isEmpty()) {
                    LinkedHashMap linkedHashMap = kVar.alpha;
                    int addChildCount = viewStructure.addChildCount(linkedHashMap.size());
                    Iterator it = linkedHashMap.entrySet().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        int intValue = ((Number) entry.getKey()).intValue();
                        if (entry.getValue() == null) {
                            ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                            newChild2.setAutofillId((AutofillId) nVar.silver, intValue);
                            newChild2.setId(intValue, ((C2946x) nVar.alpha).getContext().getPackageName(), null, null);
                            newChild2.setAutofillType(1);
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i4) {
        m0.o oVar;
        int toolType = motionEvent.getToolType(i4);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && ((toolType == 2 || toolType == 4) && (oVar = ((C2942u) getPointerIconService()).alpha) != null)) {
            Context context = getContext();
            if (oVar instanceof C2095a) {
                return PointerIcon.getSystemIcon(context, ((C2095a) oVar).bravo);
            }
            return PointerIcon.getSystemIcon(context, 1000);
        }
        return super.onResolvePointerIcon(motionEvent, i4);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final void onResume(androidx.lifecycle.al alVar) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(W.hotel());
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        Q0.n nVar;
        if (this.purple) {
            if (i4 != 0) {
                if (i4 != 1) {
                    nVar = null;
                } else {
                    nVar = Q0.n.purple;
                }
            } else {
                nVar = Q0.n.alpha;
            }
            if (nVar == null) {
                nVar = Q0.n.alpha;
            }
            setLayoutDirection(nVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C2576i c2576i;
        Object obj;
        if (Build.VERSION.SDK_INT >= 31 && (c2576i = this.f13920x0) != null) {
            A0.u semanticsOwner = getSemanticsOwner();
            Nd.h coroutineContext = getCoroutineContext();
            J.e eVar = new J.e(new C3460i[16]);
            Q3.bravo(semanticsOwner.alpha(), 0, new hd.av(1, eVar, J.e.class, "add", "add(Ljava/lang/Object;)Z", 8, 1));
            ArraysKt.plum(eVar.alpha, new A0.ae(1, new Function1[]{C3455d.red, C3455d.silver}), 0, eVar.red);
            int i4 = eVar.red;
            if (i4 == 0) {
                obj = null;
            } else {
                obj = eVar.alpha[i4 - 1];
            }
            C3460i c3460i = (C3460i) obj;
            if (c3460i != null) {
                C3117a charlie = vf.ad.charlie(coroutineContext);
                A0.s sVar = c3460i.alpha;
                Q0.l lVar = c3460i.charlie;
                ScrollCaptureCallbackC3457f scrollCaptureCallbackC3457f = new ScrollCaptureCallbackC3457f(sVar, lVar, charlie, c2576i, this);
                s0.L l10 = c3460i.delta;
                Z.c sierra = AbstractC2375K.hotel(l10).sierra(l10, true);
                long charlie2 = lVar.charlie();
                ScrollCaptureTarget delta = aj.delta(this, a0.ao.yankee(AbstractC2618b7.bravo(sierra)), new Point((int) (charlie2 >> 32), (int) (charlie2 & 4294967295L)), scrollCaptureCallbackC3457f);
                delta.setScrollBounds(a0.ao.yankee(lVar));
                consumer.accept(delta);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final /* synthetic */ void onStart(androidx.lifecycle.al alVar) {
        androidx.appcompat.widget.P0.tango(alVar);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final void onStop(androidx.lifecycle.al alVar) {
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        V.d dVar = this.f13898m;
        dVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            AbstractC2993g.alpha(dVar, longSparseArray);
        } else {
            dVar.alpha.post(new A8.g(17, dVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        boolean hotel;
        ((androidx.compose.runtime.t0) this.f13879c.alpha).setValue(Boolean.valueOf(z2));
        this.f13918w0 = true;
        super.onWindowFocusChanged(z2);
        if (z2 && Build.VERSION.SDK_INT < 30 && getShowLayoutBounds() != (hotel = W.hotel())) {
            setShowLayoutBounds(hotel);
            kilo(getRoot());
        }
    }

    public final boolean oscar(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.f13897l0) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount() || motionEvent.getRawX() != motionEvent2.getRawX() || motionEvent.getRawY() != motionEvent2.getRawY()) {
            return true;
        }
        return false;
    }

    public final void papa(float[] fArr) {
        zulu();
        C0347ag.echo(fArr, this.f13864L);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.f13868P >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.f13868P & 4294967295L));
        C2932p c2932p = an.alpha;
        float[] fArr2 = this.f13863K;
        C0347ag.delta(fArr2);
        C0347ag.foxtrot(fArr2, intBitsToFloat, intBitsToFloat2);
        an.bravo(fArr, fArr2);
    }

    public final long quebec(long j5) {
        zulu();
        long bravo = C0347ag.bravo(j5, this.f13864L);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.f13868P >> 32)) + Float.intBitsToFloat((int) (bravo >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.f13868P & 4294967295L)) + Float.intBitsToFloat((int) (bravo & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i4, Rect rect) {
        int i5;
        Z.c cVar;
        if (isFocused()) {
            return true;
        }
        if (((Y.n) getFocusOwner()).charlie.d().alpha()) {
            return super.requestFocus(i4, rect);
        }
        Y.d oscar = Y.g.oscar(i4);
        if (oscar != null) {
            i5 = oscar.alpha;
        } else {
            i5 = 7;
        }
        Y.k focusOwner = getFocusOwner();
        if (rect != null) {
            cVar = a0.ao.blue(rect);
        } else {
            cVar = null;
        }
        return Intrinsics.areEqual(((Y.n) focusOwner).echo(i5, cVar, new Y.m(i5, 1)), Boolean.TRUE);
    }

    public final void romeo(boolean z2) {
        C2940t c2940t;
        C2540A c2540a = this.f13860H;
        if (!c2540a.bravo.kilo() && ((J.e) c2540a.echo.purple).red == 0) {
            return;
        }
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z2) {
            try {
                c2940t = this.f13915u0;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            c2940t = null;
        }
        if (c2540a.juliet(c2940t)) {
            requestLayout();
        }
        c2540a.alpha(false);
        if (this.f13912t) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.f13912t = false;
        }
        Trace.endSection();
    }

    public void setAccessibilityEventBatchIntervalMillis(long j5) {
        this.f13896l.hotel = j5;
    }

    public final void setConfigurationChangeObserver(@NotNull Function1<? super Configuration, Unit> function1) {
        this.f13917w = function1;
    }

    public final void setContentCaptureManager$ui_release(@NotNull V.d dVar) {
        this.f13898m = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [T.r] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [T.r] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [J.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [J.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public void setCoroutineContext(@NotNull Nd.h hVar) {
        this.f13875a = hVar;
        T.r rVar = (T.r) getRoot().f13305x.delta;
        if (rVar instanceof m0.ah) {
            ((m0.ah) rVar).d();
        }
        if (!rVar.getNode().isAttached()) {
            AbstractC2264a.bravo("visitSubtreeIf called on an unattached node");
        }
        J.e eVar = new J.e(new T.r[16]);
        T.r child$ui_release = rVar.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            AbstractC2555o.alpha(eVar, rVar.getNode());
        } else {
            eVar.bravo(child$ui_release);
        }
        while (true) {
            int i4 = eVar.red;
            if (i4 != 0) {
                T.r rVar2 = (T.r) eVar.mike(i4 - 1);
                if ((rVar2.getAggregateChildKindSet$ui_release() & 16) != 0) {
                    for (T.r rVar3 = rVar2; rVar3 != null; rVar3 = rVar3.getChild$ui_release()) {
                        if ((rVar3.getKindSet$ui_release() & 16) != 0) {
                            AbstractC2556p abstractC2556p = rVar3;
                            ?? r5 = 0;
                            while (abstractC2556p != 0) {
                                if (abstractC2556p instanceof s0.b0) {
                                    s0.b0 b0Var = (s0.b0) abstractC2556p;
                                    if (b0Var instanceof m0.ah) {
                                        ((m0.ah) b0Var).d();
                                    }
                                } else if ((abstractC2556p.getKindSet$ui_release() & 16) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                                    T.r rVar4 = abstractC2556p.purple;
                                    int i5 = 0;
                                    abstractC2556p = abstractC2556p;
                                    r5 = r5;
                                    while (rVar4 != null) {
                                        if ((rVar4.getKindSet$ui_release() & 16) != 0) {
                                            i5++;
                                            r5 = r5;
                                            if (i5 == 1) {
                                                abstractC2556p = rVar4;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new J.e(new T.r[16]);
                                                }
                                                if (abstractC2556p != 0) {
                                                    r5.bravo(abstractC2556p);
                                                    abstractC2556p = 0;
                                                }
                                                r5.bravo(rVar4);
                                            }
                                        }
                                        rVar4 = rVar4.getChild$ui_release();
                                        abstractC2556p = abstractC2556p;
                                        r5 = r5;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                abstractC2556p = AbstractC2555o.bravo(r5);
                            }
                        }
                    }
                }
                AbstractC2555o.alpha(eVar, rVar2);
            } else {
                return;
            }
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j5) {
        this.f13866N = j5;
    }

    public final void setOnViewTreeOwnersAvailable(@NotNull Function1<? super C2926m, Unit> function1) {
        C2926m viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            function1.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.f13870S = function1;
        }
    }

    public void setShowLayoutBounds(boolean z2) {
        this.f13856D = z2;
    }

    public void setUncaughtExceptionHandler(@Nullable s0.c0 c0Var) {
        this.f13860H.getClass();
    }

    public final void setUncaughtExceptionHandler$ui_release(@Nullable s0.c0 c0Var) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void sierra(s0.al alVar, long j5) {
        C2540A c2540a = this.f13860H;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            c2540a.kilo(alVar, j5);
            if (!c2540a.bravo.kilo()) {
                c2540a.alpha(false);
                if (this.f13912t) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f13912t = false;
                }
            }
            getRectManager().alpha();
        } finally {
            Trace.endSection();
        }
    }

    public final void tango(s0.U u4, boolean z2) {
        ArrayList arrayList = this.f13906q;
        if (!z2) {
            if (!this.f13910s) {
                arrayList.remove(u4);
                ArrayList arrayList2 = this.f13908r;
                if (arrayList2 != null) {
                    arrayList2.remove(u4);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.f13910s) {
            arrayList.add(u4);
            return;
        }
        ArrayList arrayList3 = this.f13908r;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f13908r = arrayList3;
        }
        arrayList3.add(u4);
    }

    public final void uniform() {
        U.c cVar;
        if (this.f13923z) {
            S.x xVar = getSnapshotObserver().alpha;
            C2546f c2546f = C2546f.f13342i;
            synchronized (xVar.golf) {
                try {
                    J.e eVar = xVar.foxtrot;
                    int i4 = eVar.red;
                    int i5 = 0;
                    for (int i10 = 0; i10 < i4; i10++) {
                        S.w wVar = (S.w) eVar.alpha[i10];
                        wVar.echo(c2546f);
                        if (!wVar.foxtrot.juliet()) {
                            i5++;
                        } else if (i5 > 0) {
                            Object[] objArr = eVar.alpha;
                            objArr[i10 - i5] = objArr[i10];
                        }
                    }
                    int i11 = i4 - i5;
                    Arrays.fill(eVar.alpha, i11, i4, (Object) null);
                    eVar.red = i11;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f13923z = false;
        }
        C2885C c2885c = this.f13857E;
        if (c2885c != null) {
            foxtrot(c2885c);
        }
        if (echo() && (cVar = this.f13921y) != null) {
            bv.ab abVar = cVar.hotel;
            if (abVar.delta == 0 && cVar.india) {
                ((AutofillManager) cVar.alpha.purple).commit();
                cVar.india = false;
            }
            if (abVar.delta != 0) {
                cVar.india = true;
            }
        }
        while (this.f13903o0.echo() && this.f13903o0.bravo(0) != null) {
            int i12 = this.f13903o0.bravo;
            for (int i13 = 0; i13 < i12; i13++) {
                Function0 function0 = (Function0) this.f13903o0.bravo(i13);
                bv.ah ahVar = this.f13903o0;
                if (i13 >= 0 && i13 < ahVar.bravo) {
                    Object[] objArr2 = ahVar.alpha;
                    Object obj = objArr2[i13];
                    objArr2[i13] = null;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    ahVar.foxtrot(i13);
                    throw null;
                }
            }
            this.f13903o0.lima(0, i12);
        }
    }

    public final void victor(s0.al alVar) {
        ad adVar = this.f13896l;
        adVar.amber = true;
        if (adVar.victor()) {
            adVar.xray(alVar);
        }
        V.d dVar = this.f13898m;
        dVar.yellow = true;
        if (dVar.echo()) {
            dVar.f2161a.mike(Unit.INSTANCE);
        }
    }

    public final void whiskey(s0.al alVar, boolean z2, boolean z10, boolean z11) {
        s0.al victor;
        s0.al victor2;
        C2540A c2540a = this.f13860H;
        if (z2) {
            c2540a.getClass();
            if (alVar.yellow == null) {
                AbstractC2264a.bravo("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            }
            s0.ap apVar = alVar.f13306y;
            int ordinal = apVar.delta.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                        if (ordinal == 4) {
                            if (!apVar.echo || z10) {
                                apVar.echo = true;
                                apVar.papa.f13228n = true;
                                if (!alVar.f13282I) {
                                    boolean areEqual = Intrinsics.areEqual(alVar.fuchsia(), Boolean.TRUE);
                                    com.bumptech.glide.load.engine.h hVar = c2540a.bravo;
                                    if ((!areEqual && !C2540A.hotel(alVar)) || ((victor = alVar.victor()) != null && victor.f13306y.echo)) {
                                        if ((alVar.emerald() || C2540A.india(alVar)) && ((victor2 = alVar.victor()) == null || !victor2.romeo())) {
                                            hVar.delta(alVar, EnumC2564y.red);
                                        }
                                    } else {
                                        hVar.delta(alVar, EnumC2564y.alpha);
                                    }
                                    if (!c2540a.delta && z11) {
                                        beige(alVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
            }
            c2540a.hotel.bravo(new s0.az(alVar, true, z10));
            return;
        }
        if (c2540a.papa(alVar, z10) && z11) {
            beige(alVar);
        }
    }

    public final void xray(s0.al alVar, boolean z2, boolean z10) {
        boolean z11;
        C2540A c2540a = this.f13860H;
        if (z2) {
            c2540a.getClass();
            int ordinal = alVar.f13306y.delta.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            s0.ap apVar = alVar.f13306y;
            if ((!apVar.echo && !apVar.foxtrot) || z10) {
                apVar.foxtrot = true;
                apVar.golf = true;
                s0.C c3 = apVar.papa;
                c3.f13229o = true;
                c3.f13230p = true;
                if (!alVar.f13282I) {
                    s0.al victor = alVar.victor();
                    boolean areEqual = Intrinsics.areEqual(alVar.fuchsia(), Boolean.TRUE);
                    com.bumptech.glide.load.engine.h hVar = c2540a.bravo;
                    if (areEqual && ((victor == null || !victor.f13306y.echo) && (victor == null || !victor.f13306y.foxtrot))) {
                        hVar.delta(alVar, EnumC2564y.purple);
                    } else if (alVar.emerald() && ((victor == null || !victor.quebec()) && (victor == null || !victor.romeo()))) {
                        hVar.delta(alVar, EnumC2564y.silver);
                    }
                    if (!c2540a.delta) {
                        beige(null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        c2540a.getClass();
        int ordinal2 = alVar.f13306y.delta.ordinal();
        if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 2 && ordinal2 != 3) {
            if (ordinal2 == 4) {
                s0.al victor2 = alVar.victor();
                if (victor2 != null && !victor2.emerald()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                s0.ap apVar2 = alVar.f13306y;
                if (!z10) {
                    if (!alVar.romeo()) {
                        if (alVar.quebec() && alVar.emerald() == z11 && alVar.emerald() == apVar2.papa.f13227m) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                s0.C c4 = apVar2.papa;
                c4.f13229o = true;
                c4.f13230p = true;
                if (!alVar.f13282I && c4.f13227m && z11) {
                    if ((victor2 == null || !victor2.quebec()) && (victor2 == null || !victor2.romeo())) {
                        c2540a.bravo.delta(alVar, EnumC2564y.silver);
                    }
                    if (!c2540a.delta) {
                        beige(null);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void yankee() {
        ad adVar = this.f13896l;
        adVar.amber = true;
        if (adVar.victor() && !adVar.gold) {
            adVar.gold = true;
            adVar.lima.post(adVar.green);
        }
        V.d dVar = this.f13898m;
        dVar.yellow = true;
        if (dVar.echo() && !dVar.f2166g) {
            dVar.f2166g = true;
            dVar.f2162b.post(dVar.f2167h);
        }
    }

    public final void zulu() {
        if (!this.f13867O) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.f13866N) {
                this.f13866N = currentAnimationTimeMillis;
                InterfaceC2894L interfaceC2894L = this.v0;
                float[] fArr = this.f13864L;
                interfaceC2894L.charlie(this, fArr);
                W.juliet(fArr, this.f13865M);
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                int[] iArr = this.f13862J;
                view.getLocationOnScreen(iArr);
                float f5 = iArr[0];
                float f10 = iArr[1];
                view.getLocationInWindow(iArr);
                float f11 = iArr[0];
                float f12 = f10 - iArr[1];
                this.f13868P = (Float.floatToRawIntBits(f5 - f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4) {
        Intrinsics.checkNotNull(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i4, layoutParams, true);
    }

    @NotNull
    public C2914g getAccessibilityManager() {
        return this.f13900n;
    }

    @NotNull
    public C2916h getClipboard() {
        return this.B;
    }

    @NotNull
    public C2918i getClipboardManager() {
        return this.A;
    }

    @NotNull
    /* renamed from: getDragAndDropManager */
    public W.a m367getDragAndDropManager() {
        return this.f13877b;
    }

    @NotNull
    /* renamed from: getLayoutNodes */
    public bv.aa m368getLayoutNodes() {
        return this.f13888h;
    }

    @Nullable
    public C2946x getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, int i5) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i4;
        generateDefaultLayoutParams.height = i5;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i4, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
