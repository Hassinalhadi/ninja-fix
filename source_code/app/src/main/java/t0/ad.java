package t0;

import a0.C0354h;
import ae.AbstractC0422a;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import bx.C0769g;
import com.airbnb.lottie.compose.LottieConstants;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.R;
import g.C1718a;
import id.C1915c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s1.C2569b;
import s6.AbstractC2627c7;
import t1.C2952d;
import t6.AbstractC3017k3;

/* loaded from: classes3.dex */
public final class ad extends C2569b {
    public static final bv.z jade;
    public boolean amber;
    public aa azure;
    public bv.aa beige;
    public final bv.ab black;
    public final bv.y blue;
    public final bv.y bronze;
    public final String coral;
    public final String crimson;
    public final C1915c cyan;
    public final C2946x delta;
    public int echo = RecyclerView.UNDEFINED_DURATION;
    public final bv.aa emerald;
    public final ac foxtrot;
    public C2935q0 fuchsia;
    public boolean gold;
    public final AccessibilityManager golf;
    public final bv.y gray;
    public final ga.as green;
    public long hotel;
    public final AccessibilityManagerAccessibilityStateChangeListenerC2947y india;
    public final ArrayList indigo;
    public final ac ivory;
    public final com.google.android.material.textfield.h juliet;
    public List kilo;
    public final Handler lima;
    public final C2948z mike;
    public int november;
    public int oscar;
    public C2952d papa;
    public C2952d quebec;
    public boolean romeo;
    public final bv.aa sierra;
    public final bv.aa tango;
    public final bv.ax uniform;
    public final bv.ax victor;
    public int whiskey;
    public Integer xray;
    public final bv.f yankee;
    public final xf.e zulu;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        bv.z zVar = bv.m.alpha;
        bv.z zVar2 = new bv.z(32);
        int i4 = zVar2.bravo;
        if (i4 >= 0) {
            int i5 = i4 + 32;
            zVar2.delta(i5);
            int[] iArr2 = zVar2.alpha;
            int i10 = zVar2.bravo;
            if (i4 != i10) {
                ArraysKt.zulu(i5, i4, iArr2, iArr2, i10);
            }
            ArraysKt.black(i4, 0, iArr, iArr2, 12);
            zVar2.bravo += 32;
            jade = zVar2;
            return;
        }
        bw.a.delta("");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [t0.y] */
    public ad(C2946x c2946x) {
        this.delta = c2946x;
        int i4 = 0;
        this.foxtrot = new ac(this, i4);
        Object systemService = c2946x.getContext().getSystemService("accessibility");
        Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.golf = accessibilityManager;
        this.hotel = 100L;
        this.india = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: t0.y
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z2) {
                List<AccessibilityServiceInfo> emptyList;
                ad adVar = ad.this;
                if (z2) {
                    emptyList = adVar.golf.getEnabledAccessibilityServiceList(-1);
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                adVar.kilo = emptyList;
            }
        };
        this.juliet = new com.google.android.material.textfield.h(1, this);
        this.kilo = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.lima = new Handler(Looper.getMainLooper());
        this.mike = new C2948z(this, i4);
        this.november = RecyclerView.UNDEFINED_DURATION;
        this.oscar = RecyclerView.UNDEFINED_DURATION;
        this.sierra = new bv.aa();
        this.tango = new bv.aa();
        this.uniform = new bv.ax(0);
        this.victor = new bv.ax(0);
        this.whiskey = -1;
        this.yankee = new bv.f(0);
        this.zulu = AbstractC3017k3.bravo(1, 6, null);
        this.amber = true;
        bv.aa aaVar = bv.o.alpha;
        Intrinsics.charlie(aaVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.beige = aaVar;
        this.black = new bv.ab();
        this.blue = new bv.y();
        this.bronze = new bv.y();
        this.coral = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.crimson = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.cyan = new C1915c(14);
        this.emerald = new bv.aa();
        A0.s alpha = c2946x.getSemanticsOwner().alpha();
        Intrinsics.charlie(aaVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.fuchsia = new C2935q0(alpha, aaVar);
        int i5 = bv.j.alpha;
        this.gray = new bv.y();
        c2946x.addOnAttachStateChangeListener(new B8.b(7, this));
        this.green = new ga.as(12, this);
        this.indigo = new ArrayList();
        this.ivory = new ac(this, 1);
    }

    public static final boolean amber(A0.i iVar) {
        Function0 function0 = iVar.alpha;
        if (((Number) function0.invoke()).floatValue() < ((Number) iVar.bravo.invoke()).floatValue()) {
            return true;
        }
        ((Number) function0.invoke()).floatValue();
        return false;
    }

    public static /* synthetic */ void bronze(ad adVar, int i4, int i5, Integer num, int i10) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        adVar.blue(i4, i5, num, null);
    }

    public static Rect gray(a0.ao aoVar) {
        if (!(aoVar instanceof a0.ai) && !(aoVar instanceof a0.aj)) {
            return null;
        }
        Z.c oscar = aoVar.oscar();
        return new Rect((int) oscar.alpha, (int) oscar.bravo, (int) oscar.charlie, (int) oscar.delta);
    }

    public static float[] green(a0.ao aoVar) {
        if (aoVar instanceof a0.aj) {
            a0.aj ajVar = (a0.aj) aoVar;
            float intBitsToFloat = Float.intBitsToFloat((int) (ajVar.echo.echo >> 32));
            Z.d dVar = ajVar.echo;
            return new float[]{intBitsToFloat, Float.intBitsToFloat((int) (dVar.echo & 4294967295L)), Float.intBitsToFloat((int) (dVar.foxtrot >> 32)), Float.intBitsToFloat((int) (dVar.foxtrot & 4294967295L)), Float.intBitsToFloat((int) (dVar.golf >> 32)), Float.intBitsToFloat((int) (dVar.golf & 4294967295L)), Float.intBitsToFloat((int) (dVar.hotel >> 32)), Float.intBitsToFloat((int) (4294967295L & dVar.hotel))};
        }
        return null;
    }

    public static Region indigo(a0.ao aoVar) {
        if (aoVar instanceof a0.ah) {
            a0.ah ahVar = (a0.ah) aoVar;
            Z.c alpha = ahVar.echo.alpha();
            Region region = new Region(new Rect((int) alpha.alpha, (int) alpha.bravo, (int) alpha.charlie, (int) alpha.delta));
            Region region2 = new Region();
            C0354h c0354h = ahVar.echo;
            if (av.q.kilo(c0354h)) {
                region2.setPath(c0354h.alpha, region);
                return region2;
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence ivory(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i4 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i4 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i4);
                Intrinsics.charlie(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String uniform(A0.s sVar) {
        D0.g gVar;
        if (sVar != null) {
            A0.ac acVar = A0.x.alpha;
            A0.k kVar = sVar.delta;
            bv.al alVar = kVar.alpha;
            if (alVar.charlie(acVar)) {
                return S0.a.alpha((List) kVar.bravo(acVar), Constants.SEPARATOR_COMMA, null, 62);
            }
            A0.ac acVar2 = A0.x.blue;
            if (alVar.charlie(acVar2)) {
                D0.g gVar2 = (D0.g) A0.v.delta(kVar, acVar2);
                if (gVar2 != null) {
                    return gVar2.purple;
                }
            } else {
                List list = (List) A0.v.delta(kVar, A0.x.amber);
                if (list != null && (gVar = (D0.g) CollectionsKt.green(list)) != null) {
                    return gVar.purple;
                }
            }
        }
        return null;
    }

    public static final boolean yankee(A0.i iVar, float f5) {
        Function0 function0 = iVar.alpha;
        if (f5 >= 0.0f || ((Number) function0.invoke()).floatValue() <= 0.0f) {
            if (f5 > 0.0f && ((Number) function0.invoke()).floatValue() < ((Number) iVar.bravo.invoke()).floatValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean zulu(A0.i iVar) {
        Function0 function0 = iVar.alpha;
        if (((Number) function0.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) function0.invoke()).floatValue();
        ((Number) iVar.bravo.invoke()).floatValue();
        return false;
    }

    public final int azure(int i4) {
        if (i4 == this.delta.getSemanticsOwner().alpha().golf) {
            return -1;
        }
        return i4;
    }

    public final void beige(A0.s sVar, C2935q0 c2935q0) {
        int[] iArr = bv.p.alpha;
        bv.ab abVar = new bv.ab();
        List juliet = A0.s.juliet(4, sVar);
        int size = juliet.size();
        int i4 = 0;
        while (true) {
            s0.al alVar = sVar.charlie;
            if (i4 < size) {
                A0.s sVar2 = (A0.s) juliet.get(i4);
                if (tango().alpha(sVar2.golf)) {
                    bv.ab abVar2 = c2935q0.bravo;
                    int i5 = sVar2.golf;
                    if (!abVar2.bravo(i5)) {
                        xray(alVar);
                        return;
                    }
                    abVar.alpha(i5);
                }
                i4++;
            } else {
                bv.ab abVar3 = c2935q0.bravo;
                int[] iArr2 = abVar3.bravo;
                long[] jArr = abVar3.alpha;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j5 = jArr[i10];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j5) < 128 && !abVar.bravo(iArr2[(i10 << 3) + i12])) {
                                    xray(alVar);
                                    return;
                                }
                                j5 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                List juliet2 = A0.s.juliet(4, sVar);
                int size2 = juliet2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    A0.s sVar3 = (A0.s) juliet2.get(i13);
                    C2935q0 c2935q02 = (C2935q0) this.emerald.bravo(sVar3.golf);
                    if (c2935q02 != null && tango().alpha(sVar3.golf)) {
                        beige(sVar3, c2935q02);
                    }
                }
                return;
            }
        }
    }

    public final boolean black(AccessibilityEvent accessibilityEvent) {
        if (!victor()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.romeo = true;
        }
        try {
            return ((Boolean) this.foxtrot.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.romeo = false;
        }
    }

    public final boolean blue(int i4, int i5, Integer num, List list) {
        if (i4 != Integer.MIN_VALUE && victor()) {
            AccessibilityEvent oscar = oscar(i4, i5);
            if (num != null) {
                oscar.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                oscar.setContentDescription(S0.a.alpha(list, Constants.SEPARATOR_COMMA, null, 62));
            }
            return black(oscar);
        }
        return false;
    }

    @Override // s1.C2569b
    public final C1718a bravo(View view) {
        return this.mike;
    }

    public final void coral(int i4, int i5, String str) {
        AccessibilityEvent oscar = oscar(azure(i4), 32);
        oscar.setContentChangeTypes(i5);
        if (str != null) {
            oscar.getText().add(str);
        }
        black(oscar);
    }

    public final void crimson(int i4) {
        aa aaVar = this.azure;
        if (aaVar != null) {
            A0.s sVar = aaVar.alpha;
            if (i4 != sVar.golf) {
                return;
            }
            if (SystemClock.uptimeMillis() - aaVar.foxtrot <= 1000) {
                AccessibilityEvent oscar = oscar(azure(sVar.golf), 131072);
                oscar.setFromIndex(aaVar.delta);
                oscar.setToIndex(aaVar.echo);
                oscar.setAction(aaVar.bravo);
                oscar.setMovementGranularity(aaVar.charlie);
                oscar.getText().add(uniform(sVar));
                black(oscar);
            }
        }
        this.azure = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x04e6, code lost:
    
        if (r1 != null) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x04eb, code lost:
    
        if (r1 == null) goto L505;
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void cyan(bv.n nVar) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i4;
        int i5;
        int i10;
        int i11;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i12;
        int i13;
        int i14;
        char c3;
        int i15;
        A0.s sVar;
        int i16;
        int i17;
        int i18;
        bv.al alVar;
        int i19;
        ArrayList arrayList3;
        int i20;
        int i21;
        int i22;
        bv.al alVar2;
        int i23;
        int i24;
        int i25;
        int i26;
        C2933p0 c2933p0;
        int i27;
        boolean areEqual;
        C2933p0 c2933p02;
        int i28;
        boolean z2;
        String str;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        AccessibilityEvent quebec;
        int i37;
        int i38;
        Object obj;
        String str2;
        String str3;
        ad adVar = this;
        bv.n nVar2 = nVar;
        ArrayList arrayList4 = adVar.indigo;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = nVar2.bravo;
        long[] jArr3 = nVar2.alpha;
        int i39 = 2;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i40 = 0;
            while (true) {
                long j5 = jArr3[i40];
                char c4 = 7;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i41 = 8;
                    int i42 = 8 - ((~(i40 - length)) >>> 31);
                    long j6 = j5;
                    int i43 = 0;
                    while (i43 < i42) {
                        if ((j6 & 255) < 128) {
                            int i44 = iArr3[(i40 << 3) + i43];
                            C2935q0 c2935q0 = (C2935q0) adVar.emerald.bravo(i44);
                            if (c2935q0 != null) {
                                i12 = i39;
                                A0.t tVar = (A0.t) nVar2.bravo(i44);
                                c3 = c4;
                                if (tVar != null) {
                                    sVar = tVar.alpha;
                                } else {
                                    sVar = null;
                                }
                                if (sVar != null) {
                                    int i45 = 0;
                                    A0.k kVar = sVar.delta;
                                    bv.al alVar3 = kVar.alpha;
                                    int i46 = i41;
                                    Object[] objArr = alVar3.bravo;
                                    Object[] objArr2 = alVar3.charlie;
                                    long[] jArr4 = alVar3.alpha;
                                    i11 = i43;
                                    int length2 = jArr4.length - 2;
                                    A0.k kVar2 = c2935q0.alpha;
                                    if (length2 >= 0) {
                                        int i47 = i42;
                                        int i48 = 0;
                                        i17 = 0;
                                        while (true) {
                                            long j7 = jArr4[i48];
                                            iArr2 = iArr3;
                                            jArr2 = jArr3;
                                            if ((((~j7) << c3) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i49 = 8 - ((~(i48 - length2)) >>> 31);
                                                long j10 = j7;
                                                int i50 = i45;
                                                while (i50 < i49) {
                                                    if ((j10 & 255) < 128) {
                                                        int i51 = (i48 << 3) + i50;
                                                        Object obj2 = objArr[i51];
                                                        Object obj3 = objArr2[i51];
                                                        A0.ac acVar = (A0.ac) obj2;
                                                        int i52 = length2;
                                                        A0.ac acVar2 = A0.x.tango;
                                                        if (!Intrinsics.areEqual(acVar, acVar2)) {
                                                            i20 = i50;
                                                            if (!Intrinsics.areEqual(acVar, A0.x.uniform)) {
                                                                i21 = length;
                                                                i27 = i45;
                                                                if (i27 != 0 && Intrinsics.areEqual(obj3, A0.v.delta(kVar2, acVar))) {
                                                                    i26 = i44;
                                                                    arrayList3 = arrayList5;
                                                                    i22 = i40;
                                                                    alVar2 = alVar3;
                                                                    i23 = i46;
                                                                } else {
                                                                    A0.ac acVar3 = A0.x.delta;
                                                                    areEqual = Intrinsics.areEqual(acVar, acVar3);
                                                                    arrayList3 = arrayList5;
                                                                    bv.al alVar4 = kVar2.alpha;
                                                                    if (!areEqual) {
                                                                        Intrinsics.charlie(obj3, "null cannot be cast to non-null type kotlin.String");
                                                                        String str4 = (String) obj3;
                                                                        if (alVar4.charlie(acVar3)) {
                                                                            adVar.coral(i44, i46, str4);
                                                                        }
                                                                        i26 = i44;
                                                                        i22 = i40;
                                                                        alVar2 = alVar3;
                                                                        i24 = i47;
                                                                        i25 = i52;
                                                                        i23 = 8;
                                                                        j10 >>= i23;
                                                                        i46 = i23;
                                                                        i44 = i26;
                                                                        i47 = i24;
                                                                        length = i21;
                                                                        i40 = i22;
                                                                        alVar3 = alVar2;
                                                                        i45 = 0;
                                                                        i50 = i20 + 1;
                                                                        length2 = i25;
                                                                        arrayList5 = arrayList3;
                                                                    } else {
                                                                        if (Intrinsics.areEqual(acVar, A0.x.bravo) || Intrinsics.areEqual(acVar, A0.x.cyan)) {
                                                                            i26 = i44;
                                                                            i22 = i40;
                                                                            alVar2 = alVar3;
                                                                            i24 = i47;
                                                                            i25 = i52;
                                                                            i23 = 8;
                                                                            bronze(adVar, adVar.azure(i26), 2048, 64, 8);
                                                                            bronze(adVar, adVar.azure(i26), 2048, 0, 8);
                                                                        } else if (Intrinsics.areEqual(acVar, A0.x.charlie)) {
                                                                            i23 = 8;
                                                                            bronze(adVar, adVar.azure(i44), 2048, 64, 8);
                                                                            bronze(adVar, adVar.azure(i44), 2048, Integer.valueOf(i45), 8);
                                                                            i26 = i44;
                                                                            i22 = i40;
                                                                            alVar2 = alVar3;
                                                                        } else {
                                                                            A0.ac acVar4 = A0.x.crimson;
                                                                            boolean areEqual2 = Intrinsics.areEqual(acVar, acVar4);
                                                                            s0.al alVar5 = sVar.charlie;
                                                                            i22 = i40;
                                                                            if (areEqual2) {
                                                                                A0.h hVar = (A0.h) A0.v.delta(kVar, A0.x.xray);
                                                                                if (hVar == null || hVar.alpha != 4) {
                                                                                    i37 = i45;
                                                                                } else {
                                                                                    i37 = 1;
                                                                                }
                                                                                if (i37 != 0) {
                                                                                    if (Intrinsics.areEqual(A0.v.delta(kVar, acVar4), Boolean.TRUE)) {
                                                                                        AccessibilityEvent oscar = adVar.oscar(adVar.azure(i44), 4);
                                                                                        A0.s sVar2 = new A0.s(sVar.alpha, true, alVar5, kVar);
                                                                                        List list = (List) A0.v.delta(sVar2.kilo(), A0.x.alpha);
                                                                                        obj = null;
                                                                                        if (list != null) {
                                                                                            str2 = S0.a.alpha(list, Constants.SEPARATOR_COMMA, null, 62);
                                                                                        } else {
                                                                                            str2 = null;
                                                                                        }
                                                                                        List list2 = (List) A0.v.delta(sVar2.kilo(), A0.x.amber);
                                                                                        if (list2 != null) {
                                                                                            str3 = S0.a.alpha(list2, Constants.SEPARATOR_COMMA, null, 62);
                                                                                        } else {
                                                                                            str3 = null;
                                                                                        }
                                                                                        if (str2 != null) {
                                                                                            oscar.setContentDescription(str2);
                                                                                        }
                                                                                        if (str3 != null) {
                                                                                            oscar.getText().add(str3);
                                                                                        }
                                                                                        adVar.black(oscar);
                                                                                        i38 = 8;
                                                                                    } else {
                                                                                        obj = null;
                                                                                        i38 = 8;
                                                                                        bronze(adVar, adVar.azure(i44), 2048, Integer.valueOf(i45), 8);
                                                                                    }
                                                                                } else {
                                                                                    i38 = 8;
                                                                                    obj = null;
                                                                                    bronze(adVar, adVar.azure(i44), 2048, 64, 8);
                                                                                    bronze(adVar, adVar.azure(i44), 2048, Integer.valueOf(i45), 8);
                                                                                }
                                                                                i23 = i38;
                                                                                alVar2 = alVar3;
                                                                                i24 = i47;
                                                                                i25 = i52;
                                                                            } else {
                                                                                if (Intrinsics.areEqual(acVar, A0.x.alpha)) {
                                                                                    int azure = adVar.azure(i44);
                                                                                    Intrinsics.charlie(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                                    adVar.blue(azure, 2048, 4, (List) obj3);
                                                                                    i26 = i44;
                                                                                    alVar2 = alVar3;
                                                                                    i24 = i47;
                                                                                    i25 = i52;
                                                                                } else {
                                                                                    A0.ac acVar5 = A0.x.blue;
                                                                                    String str5 = "";
                                                                                    if (Intrinsics.areEqual(acVar, acVar5)) {
                                                                                        if (alVar3.charlie(A0.j.juliet)) {
                                                                                            D0.g gVar = (D0.g) A0.v.delta(kVar2, acVar5);
                                                                                            if (gVar == null) {
                                                                                                gVar = "";
                                                                                            }
                                                                                            CharSequence charSequence = (D0.g) A0.v.delta(kVar, acVar5);
                                                                                            if (charSequence == null) {
                                                                                                charSequence = "";
                                                                                            }
                                                                                            A0.k kVar3 = kVar2;
                                                                                            CharSequence ivory = ivory(charSequence);
                                                                                            int length3 = gVar.length();
                                                                                            int length4 = charSequence.length();
                                                                                            if (length3 > length4) {
                                                                                                i29 = length4;
                                                                                            } else {
                                                                                                i29 = length3;
                                                                                            }
                                                                                            int i53 = i45;
                                                                                            while (true) {
                                                                                                i30 = length3;
                                                                                                if (i53 < i29) {
                                                                                                    i31 = length4;
                                                                                                    if (gVar.charAt(i53) != charSequence.charAt(i53)) {
                                                                                                        break;
                                                                                                    }
                                                                                                    i53++;
                                                                                                    length3 = i30;
                                                                                                    length4 = i31;
                                                                                                } else {
                                                                                                    i31 = length4;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            int i54 = i45;
                                                                                            while (true) {
                                                                                                if (i54 < i29 - i53) {
                                                                                                    i32 = i54;
                                                                                                    if (gVar.charAt((i30 - 1) - i54) != charSequence.charAt((i31 - 1) - i32)) {
                                                                                                        break;
                                                                                                    } else {
                                                                                                        i54 = i32 + 1;
                                                                                                    }
                                                                                                } else {
                                                                                                    i32 = i54;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            int i55 = (i30 - i32) - i53;
                                                                                            int i56 = (i31 - i32) - i53;
                                                                                            A0.ac acVar6 = A0.x.emerald;
                                                                                            boolean charlie = alVar4.charlie(acVar6);
                                                                                            boolean charlie2 = alVar3.charlie(acVar6);
                                                                                            boolean charlie3 = alVar4.charlie(A0.x.blue);
                                                                                            if (charlie3 && !charlie && charlie2) {
                                                                                                i33 = 1;
                                                                                            } else {
                                                                                                i33 = i45;
                                                                                            }
                                                                                            if (charlie3 && charlie && !charlie2) {
                                                                                                i34 = 1;
                                                                                            } else {
                                                                                                i34 = i45;
                                                                                            }
                                                                                            if (i33 != 0 || i34 != 0) {
                                                                                                i35 = i33;
                                                                                                i26 = i44;
                                                                                                i36 = 8;
                                                                                                quebec = adVar.quebec(adVar.azure(i44), Integer.valueOf(i45), Integer.valueOf(i45), Integer.valueOf(i31), ivory);
                                                                                            } else {
                                                                                                i35 = i33;
                                                                                                quebec = adVar.oscar(adVar.azure(i44), 16);
                                                                                                quebec.setFromIndex(i53);
                                                                                                quebec.setRemovedCount(i55);
                                                                                                quebec.setAddedCount(i56);
                                                                                                quebec.setBeforeText(gVar);
                                                                                                quebec.getText().add(ivory);
                                                                                                i26 = i44;
                                                                                                i36 = 8;
                                                                                            }
                                                                                            quebec.setClassName("android.widget.EditText");
                                                                                            adVar.black(quebec);
                                                                                            if (i35 != 0 || i34 != 0) {
                                                                                                long j11 = ((D0.am) kVar.bravo(A0.x.bronze)).alpha;
                                                                                                quebec.setFromIndex((int) (j11 >> 32));
                                                                                                quebec.setToIndex((int) (j11 & 4294967295L));
                                                                                                adVar.black(quebec);
                                                                                            }
                                                                                            i23 = i36;
                                                                                            alVar2 = alVar3;
                                                                                            i24 = i47;
                                                                                            i25 = i52;
                                                                                            kVar2 = kVar3;
                                                                                        } else {
                                                                                            i26 = i44;
                                                                                            bronze(adVar, adVar.azure(i26), 2048, Integer.valueOf(i12), 8);
                                                                                            i23 = 8;
                                                                                            alVar2 = alVar3;
                                                                                            i24 = i47;
                                                                                            i25 = i52;
                                                                                        }
                                                                                    } else {
                                                                                        i24 = i47;
                                                                                        A0.ac acVar7 = A0.x.bronze;
                                                                                        boolean areEqual3 = Intrinsics.areEqual(acVar, acVar7);
                                                                                        alVar2 = alVar3;
                                                                                        int i57 = sVar.golf;
                                                                                        if (areEqual3) {
                                                                                            D0.g gVar2 = (D0.g) A0.v.delta(kVar, acVar5);
                                                                                            if (gVar2 != null && (str = gVar2.purple) != null) {
                                                                                                str5 = str;
                                                                                            }
                                                                                            D0.am amVar = (D0.am) kVar.bravo(acVar7);
                                                                                            int azure2 = adVar.azure(i44);
                                                                                            long j12 = amVar.alpha;
                                                                                            i26 = i44;
                                                                                            i25 = i52;
                                                                                            adVar = this;
                                                                                            adVar.black(adVar.quebec(azure2, Integer.valueOf((int) (j12 >> 32)), Integer.valueOf((int) (j12 & 4294967295L)), Integer.valueOf(str5.length()), ivory(str5)));
                                                                                            adVar.crimson(i57);
                                                                                            kVar2 = kVar2;
                                                                                        } else {
                                                                                            i26 = i44;
                                                                                            i25 = i52;
                                                                                            if (!Intrinsics.areEqual(acVar, acVar2) && !Intrinsics.areEqual(acVar, A0.x.uniform)) {
                                                                                                if (Intrinsics.areEqual(acVar, A0.x.kilo)) {
                                                                                                    Intrinsics.charlie(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                                                                                                    if (((Boolean) obj3).booleanValue()) {
                                                                                                        i23 = 8;
                                                                                                        adVar.black(adVar.oscar(adVar.azure(i57), 8));
                                                                                                    } else {
                                                                                                        i23 = 8;
                                                                                                    }
                                                                                                    bronze(adVar, adVar.azure(i57), 2048, Integer.valueOf(i45), i23);
                                                                                                } else {
                                                                                                    A0.ac acVar8 = A0.j.whiskey;
                                                                                                    if (Intrinsics.areEqual(acVar, acVar8)) {
                                                                                                        List list3 = (List) kVar.bravo(acVar8);
                                                                                                        List list4 = (List) A0.v.delta(kVar2, acVar8);
                                                                                                        if (list4 != null) {
                                                                                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                                            if (list3.size() <= 0) {
                                                                                                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                                                if (list4.size() <= 0) {
                                                                                                                    if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                                                                                                        i28 = i45;
                                                                                                                    } else {
                                                                                                                        i28 = 1;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    list4.get(i45).getClass();
                                                                                                                    throw new ClassCastException();
                                                                                                                }
                                                                                                            } else {
                                                                                                                list3.get(i45).getClass();
                                                                                                                throw new ClassCastException();
                                                                                                            }
                                                                                                        } else if (!list3.isEmpty()) {
                                                                                                            i17 = 1;
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (obj3 instanceof A0.a) {
                                                                                                            A0.a aVar = (A0.a) obj3;
                                                                                                            Object delta = A0.v.delta(kVar2, acVar);
                                                                                                            if (aVar != delta) {
                                                                                                                if (delta instanceof A0.a) {
                                                                                                                    A0.a aVar2 = (A0.a) delta;
                                                                                                                    if (Intrinsics.areEqual(aVar.alpha, aVar2.alpha)) {
                                                                                                                        kotlin.e eVar = aVar2.bravo;
                                                                                                                        kotlin.e eVar2 = aVar.bravo;
                                                                                                                        if (eVar2 == null) {
                                                                                                                        }
                                                                                                                        if (eVar2 != null) {
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                z2 = false;
                                                                                                                if (z2) {
                                                                                                                    i28 = 0;
                                                                                                                }
                                                                                                            }
                                                                                                            z2 = true;
                                                                                                            if (z2) {
                                                                                                            }
                                                                                                        }
                                                                                                        i28 = 1;
                                                                                                    }
                                                                                                    i17 = i28;
                                                                                                }
                                                                                            } else {
                                                                                                adVar.xray(alVar5);
                                                                                                int size = arrayList4.size();
                                                                                                int i58 = 0;
                                                                                                while (true) {
                                                                                                    if (i58 < size) {
                                                                                                        if (((C2933p0) arrayList4.get(i58)).alpha == i26) {
                                                                                                            c2933p02 = (C2933p0) arrayList4.get(i58);
                                                                                                            break;
                                                                                                        }
                                                                                                        i58++;
                                                                                                    } else {
                                                                                                        c2933p02 = null;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                Intrinsics.checkNotNull(c2933p02);
                                                                                                c2933p02.teal = (A0.i) A0.v.delta(kVar, acVar2);
                                                                                                c2933p02.white = (A0.i) A0.v.delta(kVar, A0.x.uniform);
                                                                                                if (c2933p02.purple.contains(c2933p02)) {
                                                                                                    adVar.delta.getSnapshotObserver().alpha(c2933p02, adVar.ivory, new qa.j(5, c2933p02, adVar));
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                i23 = 8;
                                                                            }
                                                                        }
                                                                        j10 >>= i23;
                                                                        i46 = i23;
                                                                        i44 = i26;
                                                                        i47 = i24;
                                                                        length = i21;
                                                                        i40 = i22;
                                                                        alVar3 = alVar2;
                                                                        i45 = 0;
                                                                        i50 = i20 + 1;
                                                                        length2 = i25;
                                                                        arrayList5 = arrayList3;
                                                                    }
                                                                }
                                                                i24 = i47;
                                                                i25 = i52;
                                                                j10 >>= i23;
                                                                i46 = i23;
                                                                i44 = i26;
                                                                i47 = i24;
                                                                length = i21;
                                                                i40 = i22;
                                                                alVar3 = alVar2;
                                                                i45 = 0;
                                                                i50 = i20 + 1;
                                                                length2 = i25;
                                                                arrayList5 = arrayList3;
                                                            }
                                                        } else {
                                                            i20 = i50;
                                                        }
                                                        int size2 = arrayList5.size();
                                                        i21 = length;
                                                        int i59 = i45;
                                                        while (true) {
                                                            if (i59 < size2) {
                                                                int i60 = size2;
                                                                if (((C2933p0) arrayList5.get(i59)).alpha == i44) {
                                                                    c2933p0 = (C2933p0) arrayList5.get(i59);
                                                                    break;
                                                                } else {
                                                                    i59++;
                                                                    size2 = i60;
                                                                }
                                                            } else {
                                                                c2933p0 = null;
                                                                break;
                                                            }
                                                        }
                                                        if (c2933p0 != null) {
                                                            i27 = i45;
                                                        } else {
                                                            c2933p0 = new C2933p0(i44, arrayList4);
                                                            i27 = 1;
                                                        }
                                                        arrayList4.add(c2933p0);
                                                        if (i27 != 0) {
                                                        }
                                                        A0.ac acVar32 = A0.x.delta;
                                                        areEqual = Intrinsics.areEqual(acVar, acVar32);
                                                        arrayList3 = arrayList5;
                                                        bv.al alVar42 = kVar2.alpha;
                                                        if (!areEqual) {
                                                        }
                                                    } else {
                                                        arrayList3 = arrayList5;
                                                        i20 = i50;
                                                        i21 = length;
                                                        i22 = i40;
                                                        alVar2 = alVar3;
                                                        i23 = i46;
                                                        i24 = i47;
                                                        i25 = length2;
                                                    }
                                                    i26 = i44;
                                                    j10 >>= i23;
                                                    i46 = i23;
                                                    i44 = i26;
                                                    i47 = i24;
                                                    length = i21;
                                                    i40 = i22;
                                                    alVar3 = alVar2;
                                                    i45 = 0;
                                                    i50 = i20 + 1;
                                                    length2 = i25;
                                                    arrayList5 = arrayList3;
                                                }
                                                i16 = i44;
                                                arrayList2 = arrayList5;
                                                i13 = length;
                                                i14 = i40;
                                                alVar = alVar3;
                                                i15 = i47;
                                                i19 = length2;
                                                if (i49 != i46) {
                                                    break;
                                                }
                                            } else {
                                                i16 = i44;
                                                arrayList2 = arrayList5;
                                                i13 = length;
                                                i14 = i40;
                                                alVar = alVar3;
                                                i15 = i47;
                                                i19 = length2;
                                            }
                                            if (i48 == i19) {
                                                break;
                                            }
                                            i48++;
                                            length2 = i19;
                                            i44 = i16;
                                            i47 = i15;
                                            iArr3 = iArr2;
                                            jArr3 = jArr2;
                                            length = i13;
                                            arrayList5 = arrayList2;
                                            i40 = i14;
                                            alVar3 = alVar;
                                            i45 = 0;
                                            i46 = 8;
                                        }
                                    } else {
                                        arrayList2 = arrayList5;
                                        iArr2 = iArr3;
                                        jArr2 = jArr3;
                                        i13 = length;
                                        i14 = i40;
                                        i16 = i44;
                                        i15 = i42;
                                        i17 = 0;
                                    }
                                    if (i17 == 0) {
                                        Iterator it = kVar2.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (!sVar.kilo().alpha.charlie((A0.ac) ((Map.Entry) it.next()).getKey())) {
                                                    i18 = 1;
                                                    break;
                                                }
                                            } else {
                                                i18 = 0;
                                                break;
                                            }
                                        }
                                        i17 = i18;
                                    }
                                    if (i17 != 0) {
                                        i41 = 8;
                                        bronze(adVar, adVar.azure(i16), 2048, 0, 8);
                                    } else {
                                        i41 = 8;
                                    }
                                    j6 >>= i41;
                                    i43 = i11 + 1;
                                    nVar2 = nVar;
                                    i42 = i15;
                                    c4 = c3;
                                    i39 = i12;
                                    iArr3 = iArr2;
                                    jArr3 = jArr2;
                                    length = i13;
                                    arrayList5 = arrayList2;
                                    i40 = i14;
                                } else {
                                    throw Q0.c.xray("no value for specified key");
                                }
                            }
                        }
                        i11 = i43;
                        arrayList2 = arrayList5;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i12 = i39;
                        i13 = length;
                        i14 = i40;
                        c3 = c4;
                        i15 = i42;
                        j6 >>= i41;
                        i43 = i11 + 1;
                        nVar2 = nVar;
                        i42 = i15;
                        c4 = c3;
                        i39 = i12;
                        iArr3 = iArr2;
                        jArr3 = jArr2;
                        length = i13;
                        arrayList5 = arrayList2;
                        i40 = i14;
                    }
                    arrayList = arrayList5;
                    iArr = iArr3;
                    jArr = jArr3;
                    i4 = i39;
                    int i61 = length;
                    int i62 = i40;
                    if (i42 == i41) {
                        i5 = i61;
                        i10 = i62;
                    } else {
                        return;
                    }
                } else {
                    arrayList = arrayList5;
                    iArr = iArr3;
                    jArr = jArr3;
                    i4 = i39;
                    i5 = length;
                    i10 = i40;
                }
                if (i10 != i5) {
                    i40 = i10 + 1;
                    nVar2 = nVar;
                    length = i5;
                    i39 = i4;
                    iArr3 = iArr;
                    jArr3 = jArr;
                    arrayList5 = arrayList;
                } else {
                    return;
                }
            }
        }
    }

    public final void emerald(s0.al alVar, bv.ab abVar) {
        A0.k xray;
        s0.al charlie;
        if (alVar.cyan() && !this.delta.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(alVar)) {
            if (!alVar.f13305x.foxtrot(8)) {
                alVar = ae.charlie(alVar, C2932p.white);
            }
            if (alVar != null && (xray = alVar.xray()) != null) {
                if (!xray.red && (charlie = ae.charlie(alVar, C2932p.teal)) != null) {
                    alVar = charlie;
                }
                int i4 = alVar.purple;
                if (abVar.alpha(i4)) {
                    bronze(this, azure(i4), 2048, 1, 8);
                }
            }
        }
    }

    public final void fuchsia(s0.al alVar) {
        if (alVar.cyan() && !this.delta.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(alVar)) {
            int i4 = alVar.purple;
            A0.i iVar = (A0.i) this.sierra.bravo(i4);
            A0.i iVar2 = (A0.i) this.tango.bravo(i4);
            if (iVar == null && iVar2 == null) {
                return;
            }
            AccessibilityEvent oscar = oscar(i4, 4096);
            if (iVar != null) {
                oscar.setScrollX((int) ((Number) iVar.alpha.invoke()).floatValue());
                oscar.setMaxScrollX((int) ((Number) iVar.bravo.invoke()).floatValue());
            }
            if (iVar2 != null) {
                oscar.setScrollY((int) ((Number) iVar2.alpha.invoke()).floatValue());
                oscar.setMaxScrollY((int) ((Number) iVar2.bravo.invoke()).floatValue());
            }
            black(oscar);
        }
    }

    public final boolean gold(A0.s sVar, int i4, int i5, boolean z2) {
        String uniform;
        Integer num;
        Integer num2;
        A0.k kVar = sVar.delta;
        A0.ac acVar = A0.j.india;
        boolean z10 = false;
        if (kVar.alpha.charlie(acVar) && ae.alpha(sVar)) {
            Xd.m mVar = (Xd.m) ((A0.a) sVar.delta.bravo(acVar)).bravo;
            if (mVar != null) {
                return ((Boolean) mVar.invoke(Integer.valueOf(i4), Integer.valueOf(i5), Boolean.valueOf(z2))).booleanValue();
            }
        } else if ((i4 != i5 || i5 != this.whiskey) && (uniform = uniform(sVar)) != null) {
            if (i4 < 0 || i4 != i5 || i5 > uniform.length()) {
                i4 = -1;
            }
            this.whiskey = i4;
            if (uniform.length() > 0) {
                z10 = true;
            }
            int i10 = sVar.golf;
            int azure = azure(i10);
            Integer num3 = null;
            if (z10) {
                num = Integer.valueOf(this.whiskey);
            } else {
                num = null;
            }
            if (z10) {
                num2 = Integer.valueOf(this.whiskey);
            } else {
                num2 = null;
            }
            if (z10) {
                num3 = Integer.valueOf(uniform.length());
            }
            black(quebec(azure, num, num2, num3, uniform));
            crimson(i10);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x013d, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0147, code lost:
    
        if (((r7 & ((~r7) << 6)) & r22) == 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0149, code lost:
    
        r25 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void jade() {
        char c3;
        long j5;
        long j6;
        long j7;
        long[] jArr;
        long[] jArr2;
        long j10;
        int i4;
        int i5;
        int i10;
        char c4;
        long j11;
        A0.s sVar;
        String str;
        bv.ab abVar = new bv.ab();
        bv.ab abVar2 = this.black;
        int[] iArr = abVar2.bravo;
        long[] jArr3 = abVar2.alpha;
        int length = jArr3.length - 2;
        bv.aa aaVar = this.emerald;
        char c10 = 7;
        long j12 = -9187201950435737472L;
        int i11 = 8;
        if (length >= 0) {
            int i12 = 0;
            j6 = 128;
            while (true) {
                long j13 = jArr3[i12];
                j7 = 255;
                if ((((~j13) << c10) & j13 & j12) != j12) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j13 & 255) < 128) {
                            c4 = c10;
                            int i15 = iArr[(i12 << 3) + i14];
                            j11 = j12;
                            A0.t tVar = (A0.t) tango().bravo(i15);
                            if (tVar != null) {
                                sVar = tVar.alpha;
                            } else {
                                sVar = null;
                            }
                            if (sVar != null) {
                                if (sVar.delta.alpha.charlie(A0.x.delta)) {
                                }
                            }
                            abVar.alpha(i15);
                            C2935q0 c2935q0 = (C2935q0) aaVar.bravo(i15);
                            if (c2935q0 != null) {
                                str = (String) A0.v.delta(c2935q0.alpha, A0.x.delta);
                            } else {
                                str = null;
                            }
                            coral(i15, 32, str);
                        } else {
                            c4 = c10;
                            j11 = j12;
                        }
                        j13 >>= 8;
                        i14++;
                        c10 = c4;
                        j12 = j11;
                    }
                    c3 = c10;
                    j5 = j12;
                    if (i13 != 8) {
                        break;
                    }
                } else {
                    c3 = c10;
                    j5 = j12;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                c10 = c3;
                j12 = j5;
            }
        } else {
            c3 = 7;
            j5 = -9187201950435737472L;
            j6 = 128;
            j7 = 255;
        }
        int[] iArr2 = abVar.bravo;
        long[] jArr4 = abVar.alpha;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i16 = 0;
            while (true) {
                long j14 = jArr4[i16];
                if ((((~j14) << c3) & j14 & j5) != j5) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j14 & j7) < j6) {
                            int i19 = iArr2[(i16 << 3) + i18];
                            int i20 = (-862048943) * i19;
                            int i21 = i20 ^ (i20 << 16);
                            int i22 = i21 & 127;
                            int i23 = abVar2.charlie;
                            int i24 = (i21 >>> 7) & i23;
                            i4 = i11;
                            int i25 = 0;
                            while (true) {
                                long[] jArr5 = abVar2.alpha;
                                int i26 = i24 >> 3;
                                jArr2 = jArr4;
                                int i27 = (i24 & 7) << 3;
                                j10 = j14;
                                long j15 = (jArr5[i26] >>> i27) | ((jArr5[i26 + 1] << (64 - i27)) & ((-i27) >> 63));
                                int i28 = i23;
                                long j16 = (i22 * 72340172838076673L) ^ j15;
                                long j17 = (j16 - 72340172838076673L) & (~j16) & j5;
                                while (true) {
                                    if (j17 == 0) {
                                        break;
                                    }
                                    i10 = (i24 + (Long.numberOfTrailingZeros(j17) >> 3)) & i28;
                                    int i29 = i28;
                                    if (abVar2.bravo[i10] == i19) {
                                        break;
                                    }
                                    j17 &= j17 - 1;
                                    i28 = i29;
                                }
                                i25 += 8;
                                i24 = (i24 + i25) & i5;
                                jArr4 = jArr2;
                                i23 = i5;
                                j14 = j10;
                            }
                            int i30 = i10;
                            if (i30 >= 0) {
                                abVar2.foxtrot(i30);
                            }
                        } else {
                            jArr2 = jArr4;
                            j10 = j14;
                            i4 = i11;
                        }
                        j14 = j10 >> i4;
                        i18++;
                        i11 = i4;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i17 != i11) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i16 == length2) {
                    break;
                }
                i16++;
                jArr4 = jArr;
                i11 = 8;
            }
        }
        aaVar.charlie();
        bv.n tango = tango();
        int[] iArr3 = tango.bravo;
        Object[] objArr = tango.charlie;
        long[] jArr6 = tango.alpha;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i31 = 0;
            while (true) {
                long j18 = jArr6[i31];
                if ((((~j18) << c3) & j18 & j5) != j5) {
                    int i32 = 8 - ((~(i31 - length3)) >>> 31);
                    for (int i33 = 0; i33 < i32; i33++) {
                        if ((j18 & j7) < j6) {
                            int i34 = (i31 << 3) + i33;
                            int i35 = iArr3[i34];
                            A0.t tVar2 = (A0.t) objArr[i34];
                            A0.k kVar = tVar2.alpha.delta;
                            A0.ac acVar = A0.x.delta;
                            boolean charlie = kVar.alpha.charlie(acVar);
                            A0.s sVar2 = tVar2.alpha;
                            if (charlie && abVar2.alpha(i35)) {
                                coral(i35, 16, (String) sVar2.delta.bravo(acVar));
                            }
                            aaVar.hotel(i35, new C2935q0(sVar2, tango()));
                        }
                        j18 >>= 8;
                    }
                    if (i32 != 8) {
                        break;
                    }
                }
                if (i31 == length3) {
                    break;
                } else {
                    i31++;
                }
            }
        }
        this.fuchsia = new C2935q0(this.delta.getSemanticsOwner().alpha(), tango());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void juliet(int i4, C2952d c2952d, String str, Bundle bundle) {
        A0.s sVar;
        a0.as asVar;
        Region indigo;
        float[] green;
        Rect gray;
        int i5;
        Z.c cVar;
        AccessibilityNodeInfo accessibilityNodeInfo;
        int i10;
        RectF rectF;
        A0.t tVar = (A0.t) tango().bravo(i4);
        if (tVar != null && (sVar = tVar.alpha) != null) {
            String uniform = uniform(sVar);
            boolean areEqual = Intrinsics.areEqual(str, this.coral);
            AccessibilityNodeInfo accessibilityNodeInfo2 = c2952d.alpha;
            if (areEqual) {
                int delta = this.blue.delta(i4);
                if (delta != -1) {
                    accessibilityNodeInfo2.getExtras().putInt(str, delta);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(str, this.crimson)) {
                int delta2 = this.bronze.delta(i4);
                if (delta2 != -1) {
                    accessibilityNodeInfo2.getExtras().putInt(str, delta2);
                    return;
                }
                return;
            }
            A0.ac acVar = A0.j.alpha;
            A0.k kVar = sVar.delta;
            bv.al alVar = kVar.alpha;
            s0.L l10 = null;
            if (alVar.charlie(acVar) && bundle != null && Intrinsics.areEqual(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i12 > 0 && i11 >= 0) {
                    if (uniform != null) {
                        i5 = uniform.length();
                    } else {
                        i5 = LottieConstants.IterateForever;
                    }
                    if (i11 < i5) {
                        D0.ak india = W.india(kVar);
                        if (india != null) {
                            ArrayList arrayList = new ArrayList();
                            int i13 = 0;
                            while (i13 < i12) {
                                int i14 = i11 + i13;
                                if (i14 >= india.alpha.alpha.purple.length()) {
                                    arrayList.add(l10);
                                    accessibilityNodeInfo = accessibilityNodeInfo2;
                                    i10 = i13;
                                } else {
                                    Z.c bravo = india.bravo(i14);
                                    s0.L delta3 = sVar.delta();
                                    long j5 = 0;
                                    if (delta3 != null) {
                                        if (!delta3.india()) {
                                            delta3 = l10;
                                        }
                                        if (delta3 != null) {
                                            j5 = delta3.gray(0L);
                                        }
                                    }
                                    Z.c hotel = bravo.hotel(j5);
                                    Z.c golf = sVar.golf();
                                    if (hotel.foxtrot(golf)) {
                                        cVar = hotel.delta(golf);
                                    } else {
                                        cVar = l10;
                                    }
                                    if (cVar != 0) {
                                        C2946x c2946x = this.delta;
                                        long quebec = c2946x.quebec((Float.floatToRawIntBits(cVar.alpha) << 32) | (Float.floatToRawIntBits(cVar.bravo) & 4294967295L));
                                        accessibilityNodeInfo = accessibilityNodeInfo2;
                                        i10 = i13;
                                        long quebec2 = c2946x.quebec((Float.floatToRawIntBits(cVar.delta) & 4294967295L) | (Float.floatToRawIntBits(cVar.charlie) << 32));
                                        int i15 = (int) (quebec >> 32);
                                        int i16 = (int) (quebec2 >> 32);
                                        int i17 = (int) (quebec & 4294967295L);
                                        int i18 = (int) (quebec2 & 4294967295L);
                                        rectF = new RectF(Math.min(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), Math.min(Float.intBitsToFloat(i17), Float.intBitsToFloat(i18)), Math.max(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), Math.max(Float.intBitsToFloat(i17), Float.intBitsToFloat(i18)));
                                    } else {
                                        accessibilityNodeInfo = accessibilityNodeInfo2;
                                        i10 = i13;
                                        rectF = null;
                                    }
                                    arrayList.add(rectF);
                                }
                                i13 = i10 + 1;
                                accessibilityNodeInfo2 = accessibilityNodeInfo;
                                l10 = null;
                            }
                            accessibilityNodeInfo2.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                            return;
                        }
                        return;
                    }
                }
                Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                return;
            }
            A0.ac acVar2 = A0.x.yankee;
            if (alVar.charlie(acVar2) && bundle != null && Intrinsics.areEqual(str, "androidx.compose.ui.semantics.testTag")) {
                String str2 = (String) A0.v.delta(kVar, acVar2);
                if (str2 != null) {
                    accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo2.getExtras().putInt(str, sVar.golf);
                return;
            }
            if (Intrinsics.areEqual(str, "androidx.compose.ui.semantics.shapeType")) {
                a0.as asVar2 = (a0.as) A0.v.delta(kVar, A0.x.indigo);
                if (asVar2 != null) {
                    a0.ao papa = papa(asVar2, sVar);
                    if (papa instanceof a0.ai) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", gray(papa));
                        return;
                    } else if (papa instanceof a0.aj) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", gray(papa));
                        accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", green(papa));
                        return;
                    } else {
                        if (papa instanceof a0.ah) {
                            accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                            accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", indigo(papa));
                            return;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return;
            }
            if (Intrinsics.areEqual(str, "androidx.compose.ui.semantics.shapeRect")) {
                a0.as asVar3 = (a0.as) A0.v.delta(kVar, A0.x.indigo);
                if (asVar3 != null && (gray = gray(papa(asVar3, sVar))) != null) {
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", gray);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(str, "androidx.compose.ui.semantics.shapeCorners")) {
                a0.as asVar4 = (a0.as) A0.v.delta(kVar, A0.x.indigo);
                if (asVar4 != null && (green = green(papa(asVar4, sVar))) != null) {
                    accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", green);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(str, "androidx.compose.ui.semantics.shapeRegion") && (asVar = (a0.as) A0.v.delta(kVar, A0.x.indigo)) != null && (indigo = indigo(papa(asVar, sVar))) != null) {
                accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", indigo);
            }
        }
    }

    public final Rect kilo(A0.t tVar) {
        Q0.l lVar = tVar.bravo;
        float f5 = lVar.alpha;
        float f10 = lVar.bravo;
        long floatToRawIntBits = (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
        C2946x c2946x = this.delta;
        long quebec = c2946x.quebec(floatToRawIntBits);
        float f11 = lVar.charlie;
        float f12 = lVar.delta;
        long quebec2 = c2946x.quebec((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
        int i4 = (int) (quebec >> 32);
        int i5 = (int) (quebec2 >> 32);
        int i10 = (int) (quebec & 4294967295L);
        int i11 = (int) (quebec2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5))), (int) Math.floor(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f2, code lost:
    
        if (vf.ad.november(r6, r2) == r3) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005d, B:21:0x006f, B:23:0x0077, B:25:0x0080, B:27:0x0086, B:29:0x0095, B:31:0x009d, B:53:0x0047, B:55:0x004e), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f2 -> B:14:0x00f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object lima(Pd.c cVar) {
        ab abVar;
        int i4;
        bv.f fVar;
        bv.f fVar2;
        bv.ab abVar2;
        xf.b bVar;
        bv.ab abVar3;
        xf.b bVar2;
        int i5;
        long j5;
        Object charlie;
        try {
            if (cVar instanceof ab) {
                abVar = (ab) cVar;
                int i10 = abVar.teal;
                if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    abVar.teal = i10 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = abVar.red;
                    Od.a aVar = Od.a.alpha;
                    i4 = abVar.teal;
                    fVar = this.yankee;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                bVar2 = abVar.purple;
                                abVar3 = abVar.alpha;
                                ResultKt.alpha(obj);
                                char c3 = 2;
                                fVar2 = fVar;
                                abVar2 = abVar3;
                                fVar = fVar2;
                                bVar = bVar2;
                                abVar.alpha = abVar2;
                                abVar.purple = bVar;
                                abVar.teal = 1;
                                charlie = bVar.charlie(abVar);
                                if (charlie == aVar) {
                                    xf.b bVar3 = bVar;
                                    abVar3 = abVar2;
                                    obj = charlie;
                                    bVar2 = bVar3;
                                    if (!((Boolean) obj).booleanValue()) {
                                        bVar2.delta();
                                        if (victor()) {
                                            int i11 = fVar.red;
                                            for (int i12 = 0; i12 < i11; i12++) {
                                                s0.al alVar = (s0.al) fVar.purple[i12];
                                                emerald(alVar, abVar3);
                                                fuchsia(alVar);
                                            }
                                            abVar3.delta = 0;
                                            long[] jArr = abVar3.alpha;
                                            if (jArr != bv.au.alpha) {
                                                try {
                                                    ArraysKt.cyan(jArr, -9187201950435737472L);
                                                    long[] jArr2 = abVar3.alpha;
                                                    i5 = abVar3.charlie;
                                                    int i13 = i5 >> 3;
                                                    jArr2[i13] = ((~j5) & jArr2[i13]) | j5;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    fVar2.clear();
                                                    throw th;
                                                }
                                                j5 = 255 << ((i5 & 7) << 3);
                                                fVar2 = fVar;
                                            } else {
                                                fVar2 = fVar;
                                            }
                                            abVar3.echo = bv.au.alpha(abVar3.charlie) - abVar3.delta;
                                            if (!this.gold) {
                                                this.gold = true;
                                                this.lima.post(this.green);
                                            }
                                        } else {
                                            fVar2 = fVar;
                                        }
                                        fVar2.clear();
                                        this.sierra.charlie();
                                        this.tango.charlie();
                                        long j6 = this.hotel;
                                        abVar.alpha = abVar3;
                                        abVar.purple = bVar2;
                                        c3 = 2;
                                        abVar.teal = 2;
                                    } else {
                                        fVar.clear();
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    return aVar;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            bVar2 = abVar.purple;
                            abVar3 = abVar.alpha;
                            ResultKt.alpha(obj);
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        ResultKt.alpha(obj);
                        abVar2 = new bv.ab();
                        xf.e eVar = this.zulu;
                        eVar.getClass();
                        bVar = new xf.b(eVar);
                        abVar.alpha = abVar2;
                        abVar.purple = bVar;
                        abVar.teal = 1;
                        charlie = bVar.charlie(abVar);
                        if (charlie == aVar) {
                        }
                    }
                }
            }
            if (i4 == 0) {
            }
        } catch (Throwable th2) {
            th = th2;
            fVar2 = fVar;
        }
        abVar = new ab(this, cVar);
        Object obj2 = abVar.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = abVar.teal;
        fVar = this.yankee;
    }

    public final boolean mike(boolean z2, int i4, long j5) {
        A0.ac acVar;
        int i5;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        A0.i iVar;
        if (!Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        bv.n tango = tango();
        if (Z.b.bravo(j5, 9205357640488583168L) || (((9223372034707292159L & j5) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z2) {
            acVar = A0.x.uniform;
        } else if (!z2) {
            acVar = A0.x.tango;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Object[] objArr = tango.charlie;
        long[] jArr = tango.alpha;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i10 = 0;
        boolean z14 = false;
        while (true) {
            long j6 = jArr[i10];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j6) < 128) {
                        A0.t tVar = (A0.t) objArr[(i10 << 3) + i13];
                        Q0.l lVar = tVar.bravo;
                        float f5 = lVar.alpha;
                        i5 = i11;
                        float f10 = lVar.bravo;
                        float f11 = lVar.charlie;
                        float f12 = lVar.delta;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
                        if (intBitsToFloat >= f5) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (intBitsToFloat < f11) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean z15 = z10 & z11;
                        if (intBitsToFloat2 >= f10) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z16 = z15 & z12;
                        if (intBitsToFloat2 < f12) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((z13 & z16) && (iVar = (A0.i) A0.v.delta(tVar.alpha.delta, acVar)) != null) {
                            Function0 function0 = iVar.alpha;
                            if (i4 < 0) {
                                if (((Number) function0.invoke()).floatValue() <= 0.0f) {
                                }
                                z14 = true;
                            } else {
                                if (((Number) function0.invoke()).floatValue() >= ((Number) iVar.bravo.invoke()).floatValue()) {
                                }
                                z14 = true;
                            }
                        }
                    } else {
                        i5 = i11;
                    }
                    j6 >>= i5;
                    i13++;
                    i11 = i5;
                }
                if (i12 != i11) {
                    return z14;
                }
            }
            if (i10 != length) {
                i10++;
            } else {
                return z14;
            }
        }
    }

    public final void november() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (victor()) {
                beige(this.delta.getSemanticsOwner().alpha(), this.fuchsia);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                cyan(tango());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    jade();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent oscar(int i4, int i5) {
        A0.t tVar;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i5);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        C2946x c2946x = this.delta;
        obtain.setPackageName(c2946x.getContext().getPackageName());
        obtain.setSource(c2946x, i4);
        if (victor() && (tVar = (A0.t) tango().bravo(i4)) != null) {
            A0.s sVar = tVar.alpha;
            obtain.setPassword(sVar.delta.alpha.charlie(A0.x.emerald));
            boolean areEqual = Intrinsics.areEqual(A0.v.delta(sVar.delta, A0.x.november), Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0422a.mike(obtain, areEqual);
            }
        }
        return obtain;
    }

    public final a0.ao papa(a0.as asVar, A0.s sVar) {
        long j5;
        s0.L delta = sVar.delta();
        if (delta != null) {
            j5 = delta.red;
        } else {
            j5 = 0;
        }
        return asVar.alpha(AbstractC2627c7.bravo(j5), sVar.charlie.f13299r, this.delta.getDensity());
    }

    public final AccessibilityEvent quebec(int i4, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent oscar = oscar(i4, 8192);
        if (num != null) {
            oscar.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            oscar.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            oscar.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            oscar.getText().add(charSequence);
        }
        return oscar;
    }

    public final int romeo(A0.s sVar) {
        A0.k kVar = sVar.delta;
        A0.ac acVar = A0.x.alpha;
        if (!kVar.alpha.charlie(A0.x.alpha)) {
            A0.ac acVar2 = A0.x.bronze;
            A0.k kVar2 = sVar.delta;
            if (kVar2.alpha.charlie(acVar2)) {
                return (int) (4294967295L & ((D0.am) kVar2.bravo(acVar2)).alpha);
            }
        }
        return this.whiskey;
    }

    public final int sierra(A0.s sVar) {
        A0.k kVar = sVar.delta;
        A0.ac acVar = A0.x.alpha;
        if (!kVar.alpha.charlie(A0.x.alpha)) {
            A0.ac acVar2 = A0.x.bronze;
            A0.k kVar2 = sVar.delta;
            if (kVar2.alpha.charlie(acVar2)) {
                return (int) (((D0.am) kVar2.bravo(acVar2)).alpha >> 32);
            }
        }
        return this.whiskey;
    }

    public final bv.n tango() {
        A0.s sVar;
        if (this.amber) {
            this.amber = false;
            C2946x c2946x = this.delta;
            this.beige = A0.v.bravo(c2946x.getSemanticsOwner());
            if (victor()) {
                bv.aa aaVar = this.beige;
                Resources resources = c2946x.getContext().getResources();
                bv.y yVar = this.blue;
                yVar.alpha();
                bv.y yVar2 = this.bronze;
                yVar2.alpha();
                A0.t tVar = (A0.t) aaVar.bravo(-1);
                if (tVar != null) {
                    sVar = tVar.alpha;
                } else {
                    sVar = null;
                }
                Intrinsics.checkNotNull(sVar);
                ArrayList bravo = A0.ag.bravo(sVar, new C0769g(18, aaVar), new C0769g(19, resources), kotlin.collections.ab.juliet(sVar));
                int ivory = CollectionsKt.ivory(bravo);
                int i4 = 1;
                if (1 <= ivory) {
                    while (true) {
                        int i5 = ((A0.s) bravo.get(i4 - 1)).golf;
                        int i10 = ((A0.s) bravo.get(i4)).golf;
                        yVar.foxtrot(i5, i10);
                        yVar2.foxtrot(i10, i5);
                        if (i4 == ivory) {
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        return this.beige;
    }

    public final boolean victor() {
        if (this.golf.isEnabled() && !this.kilo.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean whiskey() {
        if (!Intrinsics.areEqual(null, Boolean.TRUE)) {
            if (Intrinsics.areEqual(null, Boolean.FALSE)) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                return AbstractC0422a.kilo(this.golf);
            }
            return true;
        }
        return true;
    }

    public final void xray(s0.al alVar) {
        if (this.yankee.add(alVar)) {
            this.zulu.mike(Unit.INSTANCE);
        }
    }
}
