package t0;

import a0.AbstractC0358l;
import a0.C0354h;
import android.R;
import android.graphics.Rect;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t1.C2951c;
import t1.C2952d;

/* loaded from: classes3.dex */
public abstract class W {
    public static final Class[] alpha = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005c, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final View alpha(int i4, View view, ViewGroup viewGroup) {
        int nextFocusForwardId;
        View golf;
        if (i4 != 1) {
            if (i4 == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
                Y.m mVar = new Y.m(nextFocusForwardId, 2);
                View view2 = null;
                while (true) {
                    golf = golf(view, mVar, view2);
                    if (golf != null || view == viewGroup) {
                        break;
                    }
                    Object parent = view.getParent();
                    if (parent == null || !(parent instanceof View)) {
                        break;
                    }
                    View view3 = view;
                    view = (View) parent;
                    view2 = view3;
                }
                return golf;
            }
        } else if (view.getId() != -1) {
            as asVar = new as(3, viewGroup, view);
            View view4 = null;
            while (true) {
                View golf2 = golf(view, asVar, view4);
                if (golf2 != null || view == viewGroup) {
                    break;
                }
                Object parent2 = view.getParent();
                if (parent2 == null || !(parent2 instanceof View)) {
                    break;
                }
                View view5 = (View) parent2;
                view4 = view;
                view = view5;
            }
            return null;
        }
        return null;
    }

    public static final qa.j bravo(AbstractC2902a abstractC2902a, androidx.lifecycle.ac acVar) {
        if (acVar.bravo().compareTo(androidx.lifecycle.ab.alpha) > 0) {
            Nb.f fVar = new Nb.f(4, abstractC2902a);
            acVar.alpha(fVar);
            return new qa.j(8, acVar, fVar);
        }
        throw new IllegalStateException(("Cannot configure " + abstractC2902a + " to disposeComposition at Lifecycle ON_DESTROY: " + acVar + "is already destroyed").toString());
    }

    public static final void charlie(View view, ArrayList arrayList, boolean z2) {
        boolean z10;
        boolean z11;
        boolean z12;
        bv.al alVar;
        int i4;
        int i5;
        E0.k kVar;
        if (view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z2 || view.isFocusableInTouchMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (view instanceof ViewGroup) {
            int size = arrayList.size();
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getDescendantFocusability() == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                arrayList.add(view);
            }
            if (viewGroup.getDescendantFocusability() != 393216) {
                int childCount = viewGroup.getChildCount();
                View[] viewArr = new View[childCount];
                for (int i10 = 0; i10 < childCount; i10++) {
                    viewArr[i10] = viewGroup.getChildAt(i10);
                }
                bv.ah ahVar = Z.alpha;
                if (viewGroup.getLayoutDirection() == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (childCount < 2) {
                    i4 = 0;
                } else {
                    bv.ah ahVar2 = Z.alpha;
                    int i11 = childCount - ahVar2.bravo;
                    for (int i12 = 0; i12 < i11; i12++) {
                        ahVar2.golf(new Rect());
                    }
                    int i13 = 0;
                    while (true) {
                        alVar = Z.delta;
                        if (i13 >= childCount) {
                            break;
                        }
                        View view2 = viewArr[i13];
                        int i14 = Z.bravo;
                        Z.bravo = i14 + 1;
                        Rect rect = (Rect) ahVar2.bravo(i14);
                        view2.getDrawingRect(rect);
                        viewGroup.offsetDescendantRectToMyCoords(view2, rect);
                        alVar.mike(view2, rect);
                        i13++;
                    }
                    i4 = 0;
                    ArraysKt.pink(viewArr, Z.echo);
                    Object golf = alVar.golf(viewArr[0]);
                    Intrinsics.checkNotNull(golf);
                    int i15 = ((Rect) golf).bottom;
                    if (z12) {
                        i5 = -1;
                    } else {
                        i5 = 1;
                    }
                    Z.charlie = i5;
                    int i16 = 0;
                    int i17 = 0;
                    while (true) {
                        kVar = Z.foxtrot;
                        if (i16 >= childCount) {
                            break;
                        }
                        Object golf2 = alVar.golf(viewArr[i16]);
                        Intrinsics.checkNotNull(golf2);
                        Rect rect2 = (Rect) golf2;
                        if (rect2.top >= i15) {
                            if (i16 - i17 > 1) {
                                ArraysKt.plum(viewArr, kVar, i17, i16);
                            }
                            i15 = rect2.bottom;
                            i17 = i16;
                        } else {
                            i15 = Math.max(i15, rect2.bottom);
                        }
                        i16++;
                    }
                    if (childCount - i17 > 1) {
                        ArraysKt.plum(viewArr, kVar, i17, childCount);
                    }
                    Z.bravo = 0;
                    alVar.alpha();
                }
                for (int i18 = i4; i18 < childCount; i18++) {
                    charlie(viewArr[i18], arrayList, z2);
                }
            }
            if (z10 && !z11 && size == arrayList.size()) {
                arrayList.add(view);
                return;
            }
            return;
        }
        if (z10) {
            arrayList.add(view);
        }
    }

    public static final void delta(C2952d c2952d, A0.s sVar) {
        A0.h hVar = (A0.h) A0.v.delta(sVar.delta, A0.x.xray);
        if (ae.alpha(sVar)) {
            if (hVar == null || hVar.alpha != 8) {
                A0.ac acVar = A0.j.xray;
                A0.k kVar = sVar.delta;
                A0.a aVar = (A0.a) A0.v.delta(kVar, acVar);
                if (aVar != null) {
                    c2952d.bravo(new C2951c(R.id.accessibilityActionPageUp, aVar.alpha));
                }
                A0.a aVar2 = (A0.a) A0.v.delta(kVar, A0.j.zulu);
                if (aVar2 != null) {
                    c2952d.bravo(new C2951c(R.id.accessibilityActionPageDown, aVar2.alpha));
                }
                A0.a aVar3 = (A0.a) A0.v.delta(kVar, A0.j.yankee);
                if (aVar3 != null) {
                    c2952d.bravo(new C2951c(R.id.accessibilityActionPageLeft, aVar3.alpha));
                }
                A0.a aVar4 = (A0.a) A0.v.delta(kVar, A0.j.amber);
                if (aVar4 != null) {
                    c2952d.bravo(new C2951c(R.id.accessibilityActionPageRight, aVar4.alpha));
                }
            }
        }
    }

    public static final boolean echo(Object obj) {
        if (obj instanceof S.p) {
            S.p pVar = (S.p) obj;
            if (pVar.foxtrot() == androidx.compose.runtime.as.red || pVar.foxtrot() == androidx.compose.runtime.as.white || pVar.foxtrot() == androidx.compose.runtime.as.silver) {
                Object value = pVar.getValue();
                if (value != null) {
                    return echo(value);
                }
                return true;
            }
        } else {
            if ((obj instanceof kotlin.e) && (obj instanceof Serializable)) {
                return false;
            }
            Class[] clsArr = alpha;
            for (int i4 = 0; i4 < 7; i4++) {
                if (clsArr[i4].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int foxtrot(float f5) {
        double floor;
        if (f5 >= 0.0f) {
            floor = Math.ceil(f5);
        } else {
            floor = Math.floor(f5);
        }
        return ((int) floor) * (-1);
    }

    public static final View golf(View view, Function1 function1, View view2) {
        View golf;
        if (((Boolean) function1.invoke(view)).booleanValue()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt != view2 && (golf = golf(childAt, function1, view2)) != null) {
                    return golf;
                }
            }
            return null;
        }
        return null;
    }

    public static boolean hotel() {
        Object obj;
        Method method;
        try {
            if (C2946x.f13850A0 == null) {
                C2946x.f13850A0 = Class.forName("android.os.SystemProperties");
            }
            Boolean bool = null;
            if (C2946x.f13851B0 == null) {
                Class cls = C2946x.f13850A0;
                if (cls != null) {
                    method = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                } else {
                    method = null;
                }
                C2946x.f13851B0 = method;
            }
            Method method2 = C2946x.f13851B0;
            if (method2 != null) {
                obj = method2.invoke(null, "debug.layout", Boolean.FALSE);
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                bool = (Boolean) obj;
            }
            return Intrinsics.areEqual(bool, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final D0.ak india(A0.k kVar) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        A0.a aVar = (A0.a) A0.v.delta(kVar, A0.j.alpha);
        if (aVar != null && (function1 = (Function1) aVar.bravo) != null && ((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return (D0.ak) arrayList.get(0);
        }
        return null;
    }

    public static final boolean juliet(float[] fArr, float[] fArr2) {
        boolean z2;
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f5 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[9];
        float f19 = fArr[10];
        float f20 = fArr[11];
        float f21 = fArr[12];
        float f22 = fArr[13];
        float f23 = fArr[14];
        float f24 = fArr[15];
        float f25 = (f5 * f14) - (f10 * f13);
        float f26 = (f5 * f15) - (f11 * f13);
        float f27 = (f5 * f16) - (f12 * f13);
        float f28 = (f10 * f15) - (f11 * f14);
        float f29 = (f10 * f16) - (f12 * f14);
        float f30 = (f11 * f16) - (f12 * f15);
        float f31 = (f17 * f22) - (f18 * f21);
        float f32 = (f17 * f23) - (f19 * f21);
        float f33 = (f17 * f24) - (f20 * f21);
        float f34 = (f18 * f23) - (f19 * f22);
        float f35 = (f18 * f24) - (f20 * f22);
        float f36 = (f19 * f24) - (f20 * f23);
        float f37 = (f30 * f31) + (((f28 * f33) + ((f27 * f34) + ((f25 * f36) - (f26 * f35)))) - (f29 * f32));
        if (f37 != 0.0f) {
            float f38 = 1.0f / f37;
            fArr2[0] = ((f16 * f34) + ((f14 * f36) - (f15 * f35))) * f38;
            fArr2[1] = (((f11 * f35) + ((-f10) * f36)) - (f12 * f34)) * f38;
            fArr2[2] = ((f24 * f28) + ((f22 * f30) - (f23 * f29))) * f38;
            fArr2[3] = (((f19 * f29) + ((-f18) * f30)) - (f20 * f28)) * f38;
            float f39 = -f13;
            fArr2[4] = (((f15 * f33) + (f39 * f36)) - (f16 * f32)) * f38;
            fArr2[5] = ((f12 * f32) + ((f36 * f5) - (f11 * f33))) * f38;
            float f40 = -f21;
            fArr2[6] = (((f23 * f27) + (f40 * f30)) - (f24 * f26)) * f38;
            fArr2[7] = ((f20 * f26) + ((f30 * f17) - (f19 * f27))) * f38;
            fArr2[8] = ((f16 * f31) + ((f13 * f35) - (f14 * f33))) * f38;
            fArr2[9] = (((f33 * f10) + ((-f5) * f35)) - (f12 * f31)) * f38;
            fArr2[10] = ((f24 * f25) + ((f21 * f29) - (f22 * f27))) * f38;
            fArr2[11] = (((f27 * f18) + ((-f17) * f29)) - (f20 * f25)) * f38;
            fArr2[12] = (((f14 * f32) + (f39 * f34)) - (f15 * f31)) * f38;
            fArr2[13] = ((f11 * f31) + ((f5 * f34) - (f10 * f32))) * f38;
            fArr2[14] = (((f22 * f26) + (f40 * f28)) - (f23 * f25)) * f38;
            fArr2[15] = ((f19 * f25) + ((f17 * f28) - (f18 * f26))) * f38;
        }
        if (f37 == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        return !z2;
    }

    public static final boolean kilo(float f5, float f10, C0354h c0354h) {
        Z.c cVar = new Z.c(f5 - 0.005f, f10 - 0.005f, f5 + 0.005f, f10 + 0.005f);
        C0354h alpha2 = AbstractC0358l.alpha();
        Q0.c.india(alpha2, cVar);
        C0354h alpha3 = AbstractC0358l.alpha();
        alpha3.charlie(c0354h, alpha2, 1);
        boolean isEmpty = alpha3.alpha.isEmpty();
        alpha3.delta();
        alpha2.delta();
        return !isEmpty;
    }

    public static final boolean lima(float f5, float f10, float f11, float f12, long j5) {
        float f13 = f5 - f11;
        float f14 = f10 - f12;
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        if (((f14 * f14) / (intBitsToFloat2 * intBitsToFloat2)) + ((f13 * f13) / (intBitsToFloat * intBitsToFloat)) <= 1.0f) {
            return true;
        }
        return false;
    }

    public static final T0.j mike(C2885C c2885c, int i4) {
        Object obj;
        Iterator<T> it = c2885c.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((s0.al) ((Map.Entry) obj).getKey()).purple == i4) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (T0.j) entry.getValue();
    }

    public static final String november(Object obj) {
        String simpleName;
        if (obj.getClass().isAnonymousClass()) {
            simpleName = obj.getClass().getName();
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        return simpleName + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String oscar(int i4) {
        if (i4 == 0) {
            return "android.widget.Button";
        }
        if (i4 == 1) {
            return "android.widget.CheckBox";
        }
        if (i4 == 3) {
            return "android.widget.RadioButton";
        }
        if (i4 == 5) {
            return "android.widget.ImageView";
        }
        if (i4 == 6) {
            return "android.widget.Spinner";
        }
        if (i4 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
