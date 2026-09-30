package androidx.appcompat.widget;

import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.core.impl.C0505c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.C0585q;
import androidx.recyclerview.widget.RecyclerView;
import com.google.maps.android.BuildConfig;
import ge.InterfaceC1772d;
import h.AbstractC1797a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3062u;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class P0 {
    public static boolean alpha(androidx.camera.core.impl.H h4, C0505c c0505c) {
        return h4.getConfig().echo(c0505c);
    }

    public static Object amber(int i4, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i4);
    }

    public static String azure(int i4, int i5, String str, String str2, String str3) {
        return str + i4 + str2 + i5 + str3;
    }

    public static String beige(Uri uri, String str) {
        return str + uri;
    }

    public static String black(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.exceptionLabel());
        return sb2.toString();
    }

    public static String blue(Class cls, String str) {
        return str + cls;
    }

    public static androidx.lifecycle.Y bravo(androidx.lifecycle.a0 a0Var, InterfaceC1772d modelClass, T1.c extras) {
        Intrinsics.echo(modelClass, "modelClass");
        Intrinsics.echo(extras, "extras");
        return a0Var.create(AbstractC3062u.bravo(modelClass), extras);
    }

    public static String bronze(Object obj, String str) {
        return str + obj;
    }

    public static androidx.lifecycle.Y charlie(androidx.lifecycle.a0 a0Var, Class modelClass, T1.c extras) {
        Intrinsics.echo(modelClass, "modelClass");
        Intrinsics.echo(extras, "extras");
        return a0Var.create(modelClass);
    }

    public static String coral(String str, androidx.fragment.app.ai aiVar, String str2) {
        return str + aiVar + str2;
    }

    public static String crimson(String str, String str2) {
        return str + str2;
    }

    public static String cyan(StringBuilder sb2, int i4, String str) {
        sb2.append(i4);
        sb2.append(str);
        return sb2.toString();
    }

    public static void delta(Class modelClass) {
        Intrinsics.echo(modelClass, "modelClass");
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public static void echo(androidx.camera.core.impl.H h4, A2.ao aoVar) {
        h4.getConfig().charlie(aoVar);
    }

    public static String emerald(StringBuilder sb2, Object obj, String str) {
        sb2.append(obj);
        sb2.append(str);
        return sb2.toString();
    }

    public static androidx.camera.core.impl.b0 foxtrot(androidx.camera.core.impl.Z z2) {
        return (androidx.camera.core.impl.b0) z2.quebec(androidx.camera.core.impl.Z.beige);
    }

    public static String fuchsia(StringBuilder sb2, String str, char c3) {
        sb2.append(str);
        sb2.append(c3);
        return sb2.toString();
    }

    public static String gold(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static androidx.camera.core.t golf(androidx.camera.core.impl.Z z2) {
        androidx.camera.core.t tVar = (androidx.camera.core.t) z2.plum(androidx.camera.core.impl.an.juliet, androidx.camera.core.t.charlie);
        tVar.getClass();
        return tVar;
    }

    public static String gray(StringBuilder sb2, boolean z2, char c3) {
        sb2.append(z2);
        sb2.append(c3);
        return sb2.toString();
    }

    public static StringBuilder green(String str, String str2, String str3, String str4, int i4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(i4);
        sb2.append(str4);
        return sb2;
    }

    public static androidx.camera.core.impl.ae hotel(androidx.camera.core.impl.H h4, C0505c c0505c) {
        return h4.getConfig().pink(c0505c);
    }

    public static int india(androidx.camera.core.impl.Z z2) {
        return ((Integer) z2.plum(androidx.camera.core.impl.Z.black, 0)).intValue();
    }

    public static void indigo(int i4, P.d dVar, C0585q c0585q, boolean z2) {
        dVar.invoke(c0585q, Integer.valueOf(i4));
        c0585q.quebec(z2);
    }

    public static int ivory(int i4, int i5, int i10, int i11) {
        return ((i4 * i5) / i10) + i11;
    }

    public static androidx.camera.core.impl.B jade(androidx.camera.core.impl.af afVar, androidx.camera.core.impl.af afVar2) {
        androidx.camera.core.impl.aw bravo;
        if (afVar == null && afVar2 == null) {
            return androidx.camera.core.impl.B.red;
        }
        if (afVar2 != null) {
            bravo = androidx.camera.core.impl.aw.delta(afVar2);
        } else {
            bravo = androidx.camera.core.impl.aw.bravo();
        }
        if (afVar != null) {
            Iterator it = afVar.romeo().iterator();
            while (it.hasNext()) {
                lavender(bravo, afVar2, afVar, (C0505c) it.next());
            }
        }
        return androidx.camera.core.impl.B.alpha(bravo);
    }

    public static Set juliet(androidx.camera.core.impl.H h4, C0505c c0505c) {
        return h4.getConfig().beige(c0505c);
    }

    public static int kilo(androidx.camera.core.impl.Z z2) {
        return ((Integer) z2.plum(androidx.camera.core.impl.Z.yankee, 0)).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [J2.l, java.lang.Object] */
    public static void lavender(androidx.camera.core.impl.aw awVar, androidx.camera.core.impl.af afVar, androidx.camera.core.impl.af afVar2, C0505c c0505c) {
        if (Objects.equals(c0505c, androidx.camera.core.impl.ap.sierra)) {
            bm.b bVar = (bm.b) afVar2.plum(c0505c, null);
            bm.b bVar2 = (bm.b) afVar.plum(c0505c, null);
            androidx.camera.core.impl.ae pink = afVar2.pink(c0505c);
            if (bVar == null) {
                bVar = bVar2;
            } else if (bVar2 != null) {
                ?? obj = new Object();
                obj.alpha = bVar2.alpha;
                obj.purple = bVar2.bravo;
                bm.a aVar = bVar.alpha;
                if (aVar != null) {
                    obj.alpha = aVar;
                }
                bm.c cVar = bVar.bravo;
                if (cVar != null) {
                    obj.purple = cVar;
                }
                bVar = new bm.b((bm.a) obj.alpha, (bm.c) obj.purple, null);
            }
            awVar.foxtrot(c0505c, pink, bVar);
            return;
        }
        awVar.foxtrot(c0505c, afVar2.pink(c0505c), afVar2.quebec(c0505c));
    }

    public static int lima(androidx.camera.core.impl.Z z2) {
        return ((Integer) z2.plum(androidx.camera.core.impl.Z.blue, 0)).intValue();
    }

    public static /* synthetic */ String lime(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? BuildConfig.TRAVIS : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String magenta(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? BuildConfig.TRAVIS : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static T.s maroon(float f5) {
        if (f5 <= 0.0d) {
            AbstractC1797a.alpha("invalid weight; must be greater than zero");
        }
        if (f5 > Float.MAX_VALUE) {
            f5 = Float.MAX_VALUE;
        }
        return new LayoutWeightElement(f5, true);
    }

    public static boolean mike(androidx.camera.core.impl.Z z2) {
        return ((Boolean) z2.plum(androidx.camera.core.impl.Z.azure, Boolean.FALSE)).booleanValue();
    }

    public static T.s navy(T.s sVar) {
        if (1.0f <= 0.0d) {
            AbstractC1797a.alpha("invalid weight; must be greater than zero");
        }
        return sVar.then(new LayoutWeightElement(1.0f, true));
    }

    public static boolean november(androidx.camera.core.impl.Z z2) {
        return ((Boolean) z2.plum(androidx.camera.core.impl.Z.amber, Boolean.FALSE)).booleanValue();
    }

    public static Set oscar(androidx.camera.core.impl.H h4) {
        return h4.getConfig().romeo();
    }

    public static void papa(androidx.lifecycle.al owner) {
        Intrinsics.echo(owner, "owner");
    }

    public static void quebec(androidx.lifecycle.al owner) {
        Intrinsics.echo(owner, "owner");
    }

    public static void romeo(androidx.lifecycle.al owner) {
        Intrinsics.echo(owner, "owner");
    }

    public static void sierra(androidx.lifecycle.al owner) {
        Intrinsics.echo(owner, "owner");
    }

    public static void tango(androidx.lifecycle.al owner) {
        Intrinsics.echo(owner, "owner");
    }

    public static void uniform(androidx.lifecycle.al owner) {
        Intrinsics.echo(owner, "owner");
    }

    public static Object victor(androidx.camera.core.impl.H h4, C0505c c0505c) {
        return h4.getConfig().quebec(c0505c);
    }

    public static Object whiskey(androidx.camera.core.impl.H h4, C0505c c0505c, Object obj) {
        return h4.getConfig().plum(c0505c, obj);
    }

    public static Object xray(androidx.camera.core.impl.H h4, C0505c c0505c, androidx.camera.core.impl.ae aeVar) {
        return h4.getConfig().juliet(c0505c, aeVar);
    }

    public static final void yankee(int i4, View view, ViewGroup container) {
        Intrinsics.echo(view, "view");
        Intrinsics.echo(container, "container");
        if (androidx.fragment.app.L.gray(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int mike = av.q.mike(i4);
        ViewGroup viewGroup = null;
        if (mike != 0) {
            if (mike != 1) {
                if (mike != 2) {
                    if (mike == 3) {
                        if (androidx.fragment.app.L.gray(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (androidx.fragment.app.L.gray(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
                return;
            }
            if (androidx.fragment.app.L.gray(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup == null) {
                if (androidx.fragment.app.L.gray(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        ViewParent parent2 = view.getParent();
        if (parent2 instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent2;
        }
        if (viewGroup != null) {
            if (androidx.fragment.app.L.gray(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
            }
            viewGroup.removeView(view);
        }
    }

    public static int zulu(int i4, int i5, int i10, int i11) {
        return ((i4 / i5) * i10) + i11;
    }
}
