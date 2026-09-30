package androidx.compose.ui.platform;

import F.C0092c;
import F.C0164u0;
import F.y2;
import P.d;
import R.g;
import R.h;
import R.i;
import R1.e;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.N;
import androidx.compose.runtime.O;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.aa;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import bx.C0769g;
import cf.n;
import delivery.samurai.android.R;
import i0.C1879b;
import i0.InterfaceC1878a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o2.C2194d;
import o2.InterfaceC2196f;
import org.jetbrains.annotations.NotNull;
import p2.AbstractC2268a;
import t0.AbstractC2901T;
import t0.C2883A;
import t0.C2926m;
import t0.C2932p;
import t0.C2946x;
import t0.V;
import t0.ao;
import t0.ap;
import t0.aq;
import y0.c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/runtime/N;", "Landroidx/lifecycle/al;", "getLocalLifecycleOwner", "()Landroidx/compose/runtime/N;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "Landroid/content/res/Configuration;", "configuration", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final aa alpha = new aa(ao.purple);
    public static final E0 bravo = new N(ao.red);
    public static final aa charlie = new aa(C2932p.f13848d);
    public static final E0 delta = new N(ao.silver);
    public static final E0 echo = new N(ao.teal);
    public static final E0 foxtrot = new N(ao.white);

    public static final void alpha(C2946x c2946x, d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        ax axVar;
        char c3;
        boolean areAllPrimitivesSupported;
        String str;
        LinkedHashMap linkedHashMap;
        boolean z10;
        int i11 = 1;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-520299287);
        if (c0585q.india(c2946x)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i5 | i4;
        if (c0585q.india(dVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10;
        if ((i13 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i13 & 1, z2)) {
            Context context = c2946x.getContext();
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.zulu(new Configuration(context.getResources().getConfiguration()));
                c0585q.f(jade);
            }
            ax axVar2 = (ax) jade;
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new y2(axVar2, i11);
                c0585q.f(jade2);
            }
            c2946x.setConfigurationChangeObserver((Function1) jade2);
            Object jade3 = c0585q.jade();
            if (jade3 == asVar) {
                jade3 = new C2883A(context);
                c0585q.f(jade3);
            }
            C2883A c2883a = (C2883A) jade3;
            C2926m viewTreeOwners = c2946x.getViewTreeOwners();
            if (viewTreeOwners != null) {
                Object jade4 = c0585q.jade();
                InterfaceC2196f interfaceC2196f = viewTreeOwners.bravo;
                if (jade4 == asVar) {
                    Object parent = c2946x.getParent();
                    c3 = 0;
                    Intrinsics.charlie(parent, "null cannot be cast to non-null type android.view.View");
                    View view = (View) parent;
                    Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                    if (tag instanceof String) {
                        str = (String) tag;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = String.valueOf(view.getId());
                    }
                    String str2 = g.class.getSimpleName() + ':' + str;
                    C2194d savedStateRegistry = interfaceC2196f.getSavedStateRegistry();
                    Bundle alpha2 = savedStateRegistry.alpha(str2);
                    if (alpha2 != null) {
                        linkedHashMap = new LinkedHashMap();
                        for (String str3 : alpha2.keySet()) {
                            ArrayList parcelableArrayList = alpha2.getParcelableArrayList(str3);
                            Intrinsics.charlie(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                            linkedHashMap.put(str3, parcelableArrayList);
                            axVar2 = axVar2;
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    axVar = axVar2;
                    E0 e02 = i.alpha;
                    h hVar = new h(linkedHashMap, C2932p.e);
                    try {
                        savedStateRegistry.charlie(str2, new S1.a(4, hVar));
                        z10 = true;
                    } catch (IllegalArgumentException unused) {
                        z10 = false;
                    }
                    jade4 = new V(hVar, new n(z10, savedStateRegistry, str2));
                    c0585q.f(jade4);
                } else {
                    axVar = axVar2;
                    c3 = 0;
                }
                V v4 = (V) jade4;
                Unit unit = Unit.INSTANCE;
                boolean india = c0585q.india(v4);
                Object jade5 = c0585q.jade();
                if (india || jade5 == asVar) {
                    jade5 = new C0769g(20, v4);
                    c0585q.f(jade5);
                }
                C0564b.delta(unit, (Function1) jade5, c0585q);
                Object jade6 = c0585q.jade();
                if (jade6 == asVar) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        areAllPrimitivesSupported = ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
                        if (areAllPrimitivesSupported) {
                            jade6 = new C1879b(1, c2946x.getView());
                            c0585q.f(jade6);
                        }
                    }
                    jade6 = new Object();
                    c0585q.f(jade6);
                }
                InterfaceC1878a interfaceC1878a = (InterfaceC1878a) jade6;
                Configuration configuration = (Configuration) axVar.getValue();
                Object jade7 = c0585q.jade();
                if (jade7 == asVar) {
                    jade7 = new c();
                    c0585q.f(jade7);
                }
                c cVar = (c) jade7;
                Object jade8 = c0585q.jade();
                Object obj = jade8;
                if (jade8 == asVar) {
                    Configuration configuration2 = new Configuration();
                    if (configuration != null) {
                        configuration2.setTo(configuration);
                    }
                    c0585q.f(configuration2);
                    obj = configuration2;
                }
                Configuration configuration3 = (Configuration) obj;
                Object jade9 = c0585q.jade();
                if (jade9 == asVar) {
                    jade9 = new ap(configuration3, cVar);
                    c0585q.f(jade9);
                }
                ap apVar = (ap) jade9;
                boolean india2 = c0585q.india(context);
                Object jade10 = c0585q.jade();
                if (india2 || jade10 == asVar) {
                    jade10 = new B2.ap(27, context, apVar);
                    c0585q.f(jade10);
                }
                C0564b.delta(cVar, (Function1) jade10, c0585q);
                Object jade11 = c0585q.jade();
                if (jade11 == asVar) {
                    jade11 = new y0.d();
                    c0585q.f(jade11);
                }
                y0.d dVar2 = (y0.d) jade11;
                Object jade12 = c0585q.jade();
                if (jade12 == asVar) {
                    jade12 = new aq(dVar2);
                    c0585q.f(jade12);
                }
                aq aqVar = (aq) jade12;
                boolean india3 = c0585q.india(context);
                Object jade13 = c0585q.jade();
                if (india3 || jade13 == asVar) {
                    jade13 = new B2.ap(28, context, aqVar);
                    c0585q.f(jade13);
                }
                C0564b.delta(dVar2, (Function1) jade13, c0585q);
                aa aaVar = AbstractC2901T.victor;
                boolean booleanValue = ((Boolean) c0585q.kilo(aaVar)).booleanValue() | c2946x.getScrollCaptureInProgress$ui_release();
                O alpha3 = alpha.alpha((Configuration) axVar.getValue());
                O alpha4 = bravo.alpha(context);
                O alpha5 = e.alpha.alpha(viewTreeOwners.alpha);
                O alpha6 = AbstractC2268a.alpha.alpha(interfaceC2196f);
                O alpha7 = i.alpha.alpha(v4);
                O alpha8 = foxtrot.alpha(c2946x.getView());
                O alpha9 = delta.alpha(cVar);
                O alpha10 = echo.alpha(dVar2);
                O alpha11 = aaVar.alpha(Boolean.valueOf(booleanValue));
                O alpha12 = AbstractC2901T.lima.alpha(interfaceC1878a);
                O[] oArr = new O[10];
                oArr[c3] = alpha3;
                oArr[1] = alpha4;
                oArr[2] = alpha5;
                oArr[3] = alpha6;
                oArr[4] = alpha7;
                oArr[5] = alpha8;
                oArr[6] = alpha9;
                oArr[7] = alpha10;
                oArr[8] = alpha11;
                oArr[9] = alpha12;
                C0564b.bravo(oArr, P.e.echo(1059770793, new C0164u0((Object) c2946x, (Object) c2883a, dVar, 2), c0585q), c0585q, 56);
            } else {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0092c(c2946x, dVar, i4);
        }
    }

    public static final void bravo(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @NotNull
    public static final N getLocalLifecycleOwner() {
        return e.alpha;
    }
}
