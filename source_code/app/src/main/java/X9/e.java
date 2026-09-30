package X9;

import Cb.ac;
import Cb.af;
import F.C0130l1;
import Y1.ad;
import Y1.ag;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import androidx.compose.foundation.lazy.layout.ah;
import androidx.compose.foundation.lazy.layout.ai;
import androidx.compose.foundation.lazy.layout.au;
import androidx.compose.foundation.lazy.layout.aw;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import androidx.lifecycle.C0654y;
import bz.C0778c;
import bz.C0786k;
import bz.C0788m;
import bz.P;
import bz.Q;
import bz.aj;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.TaskStatus;
import com.app.network.network.models.UserInfo;
import com.checkout.components.rememberme.R0;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.ui.country.CountryPickerViewModel;
import d.C1538j0;
import d.C1542l0;
import d.C1543m;
import d.J;
import d.K;
import d3.C1586b;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import f1.AbstractC1683c;
import g1.AbstractC1735d;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import q0.C2379O;
import q0.InterfaceC2377M;
import vf.ab;
import z3.C3462a;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
        this.teal = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j5;
        int i4;
        long j6;
        Activity activity;
        Object obj2 = null;
        int i5 = 0;
        final int i10 = 1;
        Object obj3 = this.purple;
        Object obj4 = this.red;
        Object obj5 = this.teal;
        Object obj6 = this.silver;
        switch (this.alpha) {
            case 0:
                C3462a.alpha("FakeGpsEnforcement", 12, "fake_gps: NOT_READY success", null);
                K7.b.alpha().bravo("security: fake_gps NOT_READY success");
                d3.k kVar = (d3.k) obj4;
                ((g) obj3).alpha(kVar, (UserInfo) obj6);
                g.bravo(kVar, (C1586b) obj5);
                return Unit.INSTANCE;
            case 1:
                String pin = (String) obj;
                int i11 = ProcessOrderActivityV2.f12378N0;
                Intrinsics.echo(pin, "pin");
                File file = (File) obj5;
                ProcessOrderActivityV2 processOrderActivityV2 = (ProcessOrderActivityV2) obj3;
                processOrderActivityV2.getClass();
                Integer id2 = ((OrderTask) obj4).getId();
                if (id2 != null) {
                    ProcessOrderActivityV2.peach(processOrderActivityV2, id2.intValue(), (TaskStatus) obj6, pin, null, file, 84);
                }
                return Unit.INSTANCE;
            case 2:
                return R0.a((DiComponent) obj3, (ag) obj4, (ax) obj6, (CountryPickerViewModel) obj5, (ad) obj);
            case 3:
                ai aiVar = (ai) obj3;
                aiVar.charlie = new C3.d((androidx.compose.foundation.lazy.layout.u) obj4, (C2379O) obj6, (aw) obj5);
                return new C0130l1(7, aiVar);
            case 4:
                Y1.l it = (Y1.l) obj;
                Intrinsics.echo(it, "it");
                ((kotlin.jvm.internal.q) obj3).alpha = true;
                ((androidx.navigation.internal.g) obj4).alpha((Y1.aa) obj6, (Bundle) obj5, it, CollectionsKt.emptyList());
                return Unit.INSTANCE;
            case 5:
                C0786k c0786k = (C0786k) obj;
                C0778c c0778c = (C0778c) obj3;
                P.hotel(c0786k, c0778c.charlie);
                t0 t0Var = (t0) c0786k.echo;
                Object alpha = C0778c.alpha(c0778c, t0Var.getValue());
                Function1 function1 = (Function1) obj6;
                if (!Intrinsics.areEqual(alpha, t0Var.getValue())) {
                    ((t0) c0778c.charlie.purple).setValue(alpha);
                    ((t0) ((C0788m) obj4).purple).setValue(alpha);
                    if (function1 != null) {
                        function1.invoke(c0778c);
                    }
                    ((t0) c0786k.india).setValue(Boolean.FALSE);
                    c0786k.delta.invoke();
                    ((kotlin.jvm.internal.q) obj5).alpha = true;
                } else if (function1 != null) {
                    function1.invoke(c0778c);
                }
                return Unit.INSTANCE;
            case 6:
                long longValue = ((Long) obj).longValue();
                D0 d02 = (D0) ((ax) obj3).getValue();
                if (d02 != null) {
                    j5 = ((Number) d02.getValue()).longValue();
                } else {
                    j5 = longValue;
                }
                aj ajVar = (aj) obj4;
                long j7 = ajVar.charlie;
                J.e eVar = ajVar.alpha;
                kotlin.jvm.internal.r rVar = (kotlin.jvm.internal.r) obj6;
                ab abVar = (ab) obj5;
                if (j7 == Long.MIN_VALUE || rVar.alpha != P.golf(abVar.charlie())) {
                    ajVar.charlie = longValue;
                    Object[] objArr = eVar.alpha;
                    int i12 = eVar.red;
                    for (int i13 = 0; i13 < i12; i13++) {
                        ((bz.ag) objArr[i13]).yellow = true;
                    }
                    rVar.alpha = P.golf(abVar.charlie());
                }
                float f5 = rVar.alpha;
                if (f5 == 0.0f) {
                    Object[] objArr2 = eVar.alpha;
                    int i14 = eVar.red;
                    while (i5 < i14) {
                        bz.ag agVar = (bz.ag) objArr2[i5];
                        ((t0) agVar.silver).setValue(agVar.teal.charlie);
                        agVar.yellow = true;
                        i5++;
                    }
                } else {
                    long j10 = ((float) (j5 - ajVar.charlie)) / f5;
                    Object[] objArr3 = eVar.alpha;
                    int i15 = eVar.red;
                    boolean z2 = true;
                    for (int i16 = 0; i16 < i15; i16++) {
                        bz.ag agVar2 = (bz.ag) objArr3[i16];
                        if (!agVar2.white) {
                            ((t0) agVar2.f3456b.bravo).setValue(Boolean.FALSE);
                            if (agVar2.yellow) {
                                agVar2.yellow = false;
                                agVar2.f3455a = j10;
                            }
                            long j11 = j10 - agVar2.f3455a;
                            ((t0) agVar2.silver).setValue(agVar2.teal.foxtrot(j11));
                            Q q4 = agVar2.teal;
                            q4.getClass();
                            agVar2.white = ao.ad.charlie(q4, j11);
                        }
                        if (!agVar2.white) {
                            z2 = false;
                        }
                    }
                    ((t0) ajVar.delta).setValue(Boolean.valueOf(!z2));
                }
                return Unit.INSTANCE;
            case 7:
                C0786k c0786k2 = (C0786k) obj;
                kotlin.jvm.internal.r rVar2 = (kotlin.jvm.internal.r) obj3;
                float floatValue = ((Number) ((t0) c0786k2.echo).getValue()).floatValue() - rVar2.alpha;
                float alpha2 = ((C1538j0) obj4).alpha(floatValue);
                rVar2.alpha = ((Number) ((t0) c0786k2.echo).getValue()).floatValue();
                ((kotlin.jvm.internal.r) obj6).alpha = ((Number) c0786k2.alpha.bravo.invoke(c0786k2.foxtrot)).floatValue();
                if (Math.abs(floatValue - alpha2) > 0.5f) {
                    ((t0) c0786k2.india).setValue(Boolean.FALSE);
                    c0786k2.delta.invoke();
                }
                ((C1543m) obj5).getClass();
                return Unit.INSTANCE;
            case 8:
                C0786k c0786k3 = (C0786k) obj;
                kotlin.jvm.internal.r rVar3 = (kotlin.jvm.internal.r) obj3;
                float floatValue2 = ((Number) ((t0) c0786k3.echo).getValue()).floatValue() - rVar3.alpha;
                boolean alpha3 = d.ax.alpha(floatValue2);
                Function0 function0 = c0786k3.delta;
                ax axVar = c0786k3.india;
                if (!alpha3) {
                    if (!d.ax.alpha(floatValue2 - ((J) obj4).charlie((C1542l0) obj6, floatValue2))) {
                        ((t0) axVar).setValue(Boolean.FALSE);
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                    rVar3.alpha += floatValue2;
                }
                if (((Boolean) ((Ec.d) obj5).invoke(Float.valueOf(rVar3.alpha))).booleanValue()) {
                    ((t0) axVar).setValue(Boolean.FALSE);
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 9:
                Nd.h hVar = (Nd.h) obj5;
                try {
                    ((kotlin.jvm.internal.s) obj3).alpha = ((Tf.m) obj4).read((ByteBuffer) obj);
                    return Unit.INSTANCE;
                } finally {
                }
            case 10:
                au auVar = (au) ((ah) obj);
                InterfaceC2377M interfaceC2377M = auVar.echo;
                if (interfaceC2377M != null) {
                    i4 = interfaceC2377M.alpha();
                } else {
                    i4 = 0;
                }
                int i17 = 0;
                while (i5 < i4) {
                    long j12 = 0;
                    if (((j.l) obj5).quebec == K.alpha) {
                        InterfaceC2377M interfaceC2377M2 = auVar.echo;
                        if (interfaceC2377M2 != null) {
                            j12 = interfaceC2377M2.bravo(i5);
                        }
                        j6 = 4294967295L & j12;
                    } else {
                        InterfaceC2377M interfaceC2377M3 = auVar.echo;
                        if (interfaceC2377M3 != null) {
                            j12 = interfaceC2377M3.bravo(i5);
                        }
                        j6 = j12 >> 32;
                    }
                    i17 += (int) j6;
                    i5++;
                }
                ArrayList arrayList = (ArrayList) obj3;
                if (arrayList != null) {
                    arrayList.add(Integer.valueOf(i17));
                }
                kotlin.jvm.internal.s sVar = (kotlin.jvm.internal.s) obj4;
                if (sVar.alpha != ((List) obj6).size()) {
                    sVar.alpha++;
                }
                return Unit.INSTANCE;
            case 11:
                n.ax axVar2 = (n.ax) obj3;
                if (axVar2.bravo()) {
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    ac acVar = new ac(axVar2.delta, axVar2.victor, objectRef, 23);
                    I0.ab abVar2 = (I0.ab) obj4;
                    I0.v vVar = abVar2.alpha;
                    vVar.hotel((I0.aa) obj6, (I0.l) obj5, acVar, axVar2.whiskey);
                    I0.ag agVar3 = new I0.ag(abVar2, vVar);
                    abVar2.bravo.set(agVar3);
                    objectRef.alpha = agVar3;
                    axVar2.echo = agVar3;
                }
                return new Object();
            case 12:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ((ax) obj6).setValue(bool);
                if (!booleanValue && (activity = (Activity) obj3) != null) {
                    if (!AbstractC1683c.foxtrot(activity, "android.permission.CAMERA")) {
                        ((ax) obj5).setValue(Boolean.TRUE);
                    } else {
                        Toast.makeText((Context) obj4, R.string.camera_permission_denied_try_again, 1).show();
                    }
                }
                return Unit.INSTANCE;
            default:
                androidx.compose.runtime.ag DisposableEffect = (androidx.compose.runtime.ag) obj;
                Intrinsics.echo(DisposableEffect, "$this$DisposableEffect");
                final ax axVar3 = (ax) obj6;
                final ax axVar4 = (ax) obj5;
                final Context context = (Context) obj4;
                androidx.lifecycle.aj ajVar2 = new androidx.lifecycle.aj() { // from class: s1.l
                    @Override // androidx.lifecycle.aj
                    public final void onStateChanged(androidx.lifecycle.al alVar, androidx.lifecycle.aa aaVar) {
                        boolean z10;
                        switch (i10) {
                            case 0:
                                C2581n c2581n = (C2581n) context;
                                c2581n.getClass();
                                C0654y c0654y = androidx.lifecycle.aa.Companion;
                                androidx.lifecycle.ab abVar3 = (androidx.lifecycle.ab) axVar3;
                                c0654y.getClass();
                                androidx.lifecycle.aa charlie = C0654y.charlie(abVar3);
                                InterfaceC2582o interfaceC2582o = (InterfaceC2582o) axVar4;
                                Runnable runnable = c2581n.alpha;
                                CopyOnWriteArrayList copyOnWriteArrayList = c2581n.bravo;
                                if (aaVar == charlie) {
                                    copyOnWriteArrayList.add(interfaceC2582o);
                                    runnable.run();
                                    return;
                                } else if (aaVar == androidx.lifecycle.aa.ON_DESTROY) {
                                    c2581n.bravo(interfaceC2582o);
                                    return;
                                } else {
                                    if (aaVar == C0654y.alpha(abVar3)) {
                                        copyOnWriteArrayList.remove(interfaceC2582o);
                                        runnable.run();
                                        return;
                                    }
                                    return;
                                }
                            default:
                                if (aaVar == androidx.lifecycle.aa.ON_RESUME) {
                                    if (AbstractC1735d.alpha((Context) context, "android.permission.CAMERA") == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    androidx.compose.runtime.ax axVar5 = (androidx.compose.runtime.ax) axVar3;
                                    if (z10 != ((Boolean) axVar5.getValue()).booleanValue()) {
                                        axVar5.setValue(Boolean.valueOf(z10));
                                    }
                                    androidx.compose.runtime.ax axVar6 = (androidx.compose.runtime.ax) axVar4;
                                    if (((Boolean) axVar6.getValue()).booleanValue()) {
                                        axVar6.setValue(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                androidx.lifecycle.ac acVar2 = (androidx.lifecycle.ac) obj3;
                acVar2.alpha(ajVar2);
                return new af(17, acVar2, ajVar2);
        }
    }

    public /* synthetic */ e(ArrayList arrayList, kotlin.jvm.internal.s sVar, List list, int i4, j.l lVar) {
        this.alpha = 10;
        this.purple = arrayList;
        this.red = sVar;
        this.silver = list;
        this.teal = lVar;
    }
}
