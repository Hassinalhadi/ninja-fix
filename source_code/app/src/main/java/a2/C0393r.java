package a2;

import Cb.af;
import Y1.ag;
import a0.C0354h;
import a0.ah;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.av;
import androidx.compose.foundation.layout.b0;
import androidx.compose.foundation.lazy.layout.ar;
import androidx.compose.runtime.C0590w;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.S;
import androidx.compose.runtime.Y;
import androidx.compose.runtime.aw;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.n0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.t0;
import androidx.lifecycle.az;
import ao.ad;
import bv.am;
import bz.U;
import bz.X;
import bz.a0;
import bz.aj;
import com.app.base.BaseViewModel;
import com.app.network.network.models.UserInfo;
import com.checkout.address.ui.view.AddressButtonViewKt;
import com.checkout.components.interfaces.data.PrimitiveSharedFlowRepository;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.interfaces.usecase.SuspendUseCase;
import com.checkout.components.rememberme.AbstractC0979s0;
import com.checkout.components.rememberme.R0;
import com.checkout.components.rememberme.W1;
import com.checkout.components.rememberme.Y0;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.rememberme.model.WalletListItem;
import com.checkout.components.rememberme.savecard.SaveCardViewStateRepository;
import com.checkout.components.ui.country.CountryPickerBottomSheetScreenKt;
import com.checkout.components.ui.country.CountryPickerViewModel;
import com.checkout.components.ui.model.CountryPickerType;
import d.C1527e;
import d.C1539k;
import d.C1542l0;
import d.C1548o0;
import d.C1554s;
import d.ak;
import d.ap;
import f.C1674k;
import f.InterfaceC1672i;
import f.InterfaceC1673j;
import j.C1919b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2366B;
import q0.AbstractC2367C;
import r3.C2492a;
import s0.an;
import s1.al;
import s1.au;
import s6.AbstractC2689j6;
import td.C3117a;
import vf.ao;
import yf.N;

/* renamed from: a2.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0393r implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ C0393r(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit CountryPickerBottomSheetScreen$lambda$8$lambda$3$lambda$2;
        float f5;
        long j5;
        long alpha;
        String msg = null;
        switch (this.alpha) {
            case 0:
                return new af(6, (D0) this.purple, (C0383h) this.red);
            case 1:
                return R0.a((DiComponent) this.purple, (ag) this.red, (Country) obj);
            case 2:
                return W1.a((WalletListItem) this.purple, (CardMetadata) this.red, (Map) obj);
            case 3:
                return Y0.a((SuspendUseCase) this.purple, (SaveCardViewStateRepository) this.red, (T1.c) obj);
            case 4:
                return AbstractC0979s0.a((DiComponent) this.purple, (PrimitiveSharedFlowRepository) this.red, (T1.c) obj);
            case 5:
                AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
                I i4 = (I) this.purple;
                boolean z2 = i4.red;
                AbstractC2367C abstractC2367C = (AbstractC2367C) this.red;
                if (z2) {
                    float f10 = i4.alpha;
                    abstractC2366B.getClass();
                    AbstractC2366B.juliet(abstractC2366B, abstractC2367C, Q0.c.bravo(abstractC2366B, f10), Q0.c.bravo(abstractC2366B, i4.purple));
                } else {
                    float f11 = i4.alpha;
                    abstractC2366B.getClass();
                    AbstractC2366B.hotel(abstractC2366B, abstractC2367C, Q0.c.bravo(abstractC2366B, f11), Q0.c.bravo(abstractC2366B, i4.purple));
                }
                return Unit.INSTANCE;
            case 6:
                AbstractC2366B abstractC2366B2 = (AbstractC2366B) obj;
                K k6 = (K) this.purple;
                boolean z10 = k6.teal;
                AbstractC2367C abstractC2367C2 = (AbstractC2367C) this.red;
                if (z10) {
                    float f12 = k6.alpha;
                    abstractC2366B2.getClass();
                    AbstractC2366B.juliet(abstractC2366B2, abstractC2367C2, Q0.c.bravo(abstractC2366B2, f12), Q0.c.bravo(abstractC2366B2, k6.purple));
                } else {
                    float f13 = k6.alpha;
                    abstractC2366B2.getClass();
                    AbstractC2366B.hotel(abstractC2366B2, abstractC2367C2, Q0.c.bravo(abstractC2366B2, f13), Q0.c.bravo(abstractC2366B2, k6.purple));
                }
                return Unit.INSTANCE;
            case 7:
                b0 b0Var = (b0) this.purple;
                int i5 = b0Var.uniform;
                View view = (View) this.red;
                if (i5 == 0) {
                    WeakHashMap weakHashMap = au.alpha;
                    av avVar = b0Var.victor;
                    al.lima(view, avVar);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(avVar);
                    au.papa(view, avVar);
                }
                b0Var.uniform++;
                return new af(7, b0Var, view);
            case 8:
                ar arVar = (ar) this.purple;
                am amVar = arVar.red;
                Object obj2 = this.red;
                amVar.india(obj2);
                return new af(8, arVar, obj2);
            case 9:
                return new ar((R.g) this.purple, (Map) obj, (R.e) this.red);
            case 10:
                ((C0590w) this.purple).amber(obj);
                am amVar2 = (am) this.red;
                if (amVar2 != null) {
                    amVar2.alpha(obj);
                }
                return Unit.INSTANCE;
            case 11:
                Y y10 = (Y) this.purple;
                Throwable th = (Throwable) this.red;
                Throwable th2 = (Throwable) obj;
                synchronized (y10.bravo) {
                    if (th != null) {
                        if (th2 != null) {
                            try {
                                if (th2 instanceof CancellationException) {
                                    th2 = null;
                                }
                                if (th2 != null) {
                                    AbstractC2689j6.charlie(th, th2);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } else {
                        th = null;
                    }
                    y10.delta = th;
                    N n5 = y10.tango;
                    S s3 = S.alpha;
                    n5.getClass();
                    n5.juliet(null, s3);
                }
                return Unit.INSTANCE;
            case 12:
                an anVar = (an) obj;
                anVar.charlie();
                ad.kilo(anVar, (C0354h) this.purple, (a0.au) this.red, 0.0f, null, 60);
                return Unit.INSTANCE;
            case 13:
                an anVar2 = (an) obj;
                anVar2.charlie();
                ad.kilo(anVar2, ((ah) this.purple).echo, (a0.au) this.red, 0.0f, null, 60);
                return Unit.INSTANCE;
            case 14:
                ((C1674k) ((InterfaceC1673j) this.purple)).bravo((InterfaceC1672i) this.red);
                return Unit.INSTANCE;
            case 15:
                aj ajVar = (aj) this.purple;
                J.e eVar = ajVar.alpha;
                bz.ag agVar = (bz.ag) this.red;
                eVar.bravo(agVar);
                ((t0) ajVar.bravo).setValue(Boolean.TRUE);
                return new af(9, ajVar, agVar);
            case 16:
                vf.ad.zulu((vf.ab) this.purple, null, vf.ac.silver, new bz.Y((a0) this.red, null), 1);
                return new Object();
            case 17:
                a0 a0Var = (a0) this.purple;
                SnapshotStateList snapshotStateList = a0Var.india;
                X x4 = (X) this.red;
                snapshotStateList.add(x4);
                return new af(12, a0Var, x4);
            case 18:
                a0 a0Var2 = (a0) this.purple;
                SnapshotStateList snapshotStateList2 = a0Var2.juliet;
                a0 a0Var3 = (a0) this.red;
                snapshotStateList2.add(a0Var3);
                return new af(10, a0Var2, a0Var3);
            case 19:
                return new af(11, (a0) this.purple, (U) this.red);
            case 20:
                CountryPickerBottomSheetScreen$lambda$8$lambda$3$lambda$2 = CountryPickerBottomSheetScreenKt.CountryPickerBottomSheetScreen$lambda$8$lambda$3$lambda$2((CountryPickerViewModel) this.purple, (CountryPickerType) this.red, (String) obj);
                return CountryPickerBottomSheetScreen$lambda$8$lambda$3$lambda$2;
            case 21:
                ((androidx.compose.foundation.lazy.layout.i) this.purple).alpha.lima((C1527e) this.red);
                return Unit.INSTANCE;
            case 22:
                long j6 = ((C1554s) obj).alpha;
                ap apVar = (ap) this.red;
                if (apVar.f11990j) {
                    f5 = -1.0f;
                } else {
                    f5 = 1.0f;
                }
                long hotel = Z.b.hotel(f5, j6);
                d.K k10 = apVar.f11986f;
                ak akVar = d.al.alpha;
                if (k10 == d.K.alpha) {
                    j5 = hotel & 4294967295L;
                } else {
                    j5 = hotel >> 32;
                }
                float intBitsToFloat = Float.intBitsToFloat((int) j5);
                androidx.compose.material3.internal.r rVar = (androidx.compose.material3.internal.r) this.purple;
                switch (rVar.alpha) {
                    case 0:
                        androidx.compose.material3.internal.t tVar = (androidx.compose.material3.internal.t) rVar.bravo;
                        androidx.compose.material3.internal.q qVar = (androidx.compose.material3.internal.q) tVar.november;
                        float foxtrot = tVar.foxtrot(intBitsToFloat);
                        androidx.compose.material3.internal.t tVar2 = qVar.alpha;
                        ((n0) ((aw) tVar2.lima)).kilo(foxtrot);
                        ((n0) ((aw) tVar2.mike)).kilo(0.0f);
                        break;
                    default:
                        ((C1539k) rVar.bravo).alpha.invoke(Float.valueOf(intBitsToFloat));
                        break;
                }
                return Unit.INSTANCE;
            case 23:
                long j7 = ((C1554s) obj).alpha;
                if (((C1548o0) this.red).delta == d.K.purple) {
                    alpha = Z.b.alpha(0.0f, 1, j7);
                } else {
                    alpha = Z.b.alpha(0.0f, 2, j7);
                }
                ((C1542l0) this.purple).alpha(1, alpha);
                return Unit.INSTANCE;
            case 24:
                ((Long) obj).longValue();
                d.R0 r02 = (d.R0) this.purple;
                float f14 = r02.echo;
                r02.echo = 0.0f;
                ((Function1) this.red).invoke(Float.valueOf(f14));
                return Unit.INSTANCE;
            case 25:
                Throwable th4 = (Throwable) obj;
                BaseViewModel black = ((d3.k) this.red).black();
                if (black != null) {
                    Intrinsics.checkNotNull(th4);
                    msg = black.onHandleError(th4);
                }
                Intrinsics.checkNotNull(msg);
                Intrinsics.echo(msg, "msg");
                ((az) this.purple).postValue(new C2492a(0, msg));
                return Unit.INSTANCE;
            case 26:
                C3117a echo = vf.ad.echo();
                Cf.e eVar2 = ao.alpha;
                vf.ad.zulu(echo, Af.n.alpha, null, new d3.i((d3.k) this.purple, (UserInfo) obj, (Jb.S) this.red, null), 2);
                return Unit.INSTANCE;
            case 27:
                return AddressButtonViewKt.bravo((ax) this.purple, (ComponentName.Address) this.red, (ActivityResult) obj);
            case 28:
                j.q foxtrot2 = ((Be.e) this.purple).foxtrot(((Integer) obj).intValue());
                List list = foxtrot2.bravo;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i10 = foxtrot2.alpha;
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    int i13 = (int) ((C1919b) list.get(i12)).alpha;
                    arrayList.add(new Pair(Integer.valueOf(i10), new Q0.a(((G3.g) this.red).alpha(i11, i13))));
                    i10++;
                    i11 += i13;
                }
                return arrayList;
            default:
                int intValue = ((Integer) obj).intValue();
                G3.g gVar = (G3.g) this.purple;
                Be.e eVar3 = (Be.e) gVar.echo;
                int i14 = eVar3.alpha;
                int zulu = eVar3.zulu(intValue);
                long alpha2 = gVar.alpha(0, zulu);
                j.j jVar = (j.j) this.red;
                return jVar.X(intValue, 0, zulu, jVar.silver, alpha2);
        }
    }
}
