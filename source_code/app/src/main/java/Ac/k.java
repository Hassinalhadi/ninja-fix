package Ac;

import F.AbstractC0141o0;
import F.AbstractC0149q0;
import F.G2;
import Gc.x;
import H0.v;
import Jb.C0201i;
import Jb.g0;
import S.ad;
import Yb.C0303f;
import Yb.C0304f0;
import Yb.C0307h;
import Yb.C0312j0;
import Yb.C0321o;
import Yb.C0329s0;
import a0.ao;
import a2.C0389n;
import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0565b0;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0578j;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.S;
import androidx.compose.runtime.Y;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import bv.am;
import bv.av;
import com.app.network.network.models.ActionType;
import com.app.network.network.models.Root;
import com.app.network.network.models.Shift;
import com.app.network.network.models.StartingPoint;
import com.app.network.network.models.SuspensionHistoryItem;
import com.checkout.components.core.ui.FlowComponent;
import com.checkout.components.rememberme.AbstractC0993x;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.envelopV2.EnvelopsListingActivityV2;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import delivery.samurai.android.ui.orders.note.ui.AllAddressNoteActivity;
import delivery.samurai.android.ui.orders.note.vm.AllAddressNoteViewModel;
import delivery.samurai.android.ui.support.ZenDeskChatActivity;
import f0.AbstractC1680b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import q0.C2391j;
import qb.C2442i;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.A7;
import s6.AbstractC2636d7;
import s6.AbstractC2717m7;
import s6.AbstractC2806w7;
import s6.N6;
import s6.S6;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.U2;
import t6.W3;
import vf.C3207k;
import vf.InterfaceC3206j;
import xb.AbstractC3318b;
import zendesk.support.ProviderStore;
import zendesk.support.Support;
import zendesk.support.UploadProvider;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ k(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    private final Object alpha(Object obj, Object obj2) {
        InterfaceC3206j interfaceC3206j;
        Y y10 = (Y) this.purple;
        Set set = (Set) obj;
        synchronized (y10.bravo) {
            try {
                if (((S) y10.tango.getValue()).compareTo(S.teal) >= 0) {
                    am amVar = y10.golf;
                    if (set instanceof J.h) {
                        am amVar2 = ((J.h) set).alpha;
                        Object[] objArr = amVar2.bravo;
                        long[] jArr = amVar2.alpha;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j5 = jArr[i4];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    for (int i10 = 0; i10 < i5; i10++) {
                                        if ((255 & j5) < 128) {
                                            Object obj3 = objArr[(i4 << 3) + i10];
                                            if (!(obj3 instanceof ad) || ((ad) obj3).charlie(1)) {
                                                amVar.alpha(obj3);
                                            }
                                        }
                                        j5 >>= 8;
                                    }
                                    if (i5 != 8) {
                                        break;
                                    }
                                }
                                if (i4 == length) {
                                    break;
                                }
                                i4++;
                            }
                        }
                    } else {
                        for (Object obj4 : set) {
                            if (!(obj4 instanceof ad) || ((ad) obj4).charlie(1)) {
                                amVar.alpha(obj4);
                            }
                        }
                    }
                    interfaceC3206j = y10.azure();
                } else {
                    interfaceC3206j = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC3206j != null) {
            Result.Companion companion = Result.INSTANCE;
            ((C3207k) interfaceC3206j).resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x027b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, "لقد قمت بالفعل بالتصويت على ملاحظة هذا العنوان") == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x096e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2.jade(), java.lang.Integer.valueOf(r8)) == false) goto L393;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.util.Set[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.util.Collection] */
    @Override // Xd.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        float f5;
        String str;
        String str2;
        boolean z2;
        char c3;
        char c4;
        int i4;
        boolean z10;
        UploadProvider uploadProvider;
        boolean z11;
        boolean z12;
        boolean z13;
        R.g gVar;
        ArrayList arrayList;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        List emptyList;
        int[] iArr;
        String[] strArr;
        int[] intArray;
        char c10 = 7;
        T.p pVar = T.p.alpha;
        int i5 = 14;
        int i10 = 4;
        String str3 = null;
        List<ActionType> list = null;
        as asVar = C0580l.alpha;
        final int i11 = 2;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        int i12 = 0;
        boolean z21 = false;
        boolean z22 = false;
        Object obj3 = this.purple;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z18 = true;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z18)) {
                    String name = ((StartingPoint) obj3).getName();
                    Intrinsics.checkNotNull(name);
                    G2.bravo(name, null, q.alpha, AbstractC2636d7.charlie(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 3456, 0, 131058);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z22 = true;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z22)) {
                    float f10 = 12;
                    T.s sierra = AbstractC0538d.sierra(V.charlie(pVar, 1.0f), f10);
                    T.j jVar = T.d.f2061d;
                    androidx.compose.foundation.layout.S alpha = Q.alpha(AbstractC0542h.alpha, jVar, c0585q2, 48);
                    long j5 = c0585q2.magenta;
                    int i13 = (int) (j5 ^ (j5 >>> 32));
                    I mike = c0585q2.mike();
                    T.s charlie = T.a.charlie(sierra, c0585q2);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q2.white();
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j);
                    } else {
                        c0585q2.i();
                    }
                    C2549i c2549i = C2551k.foxtrot;
                    C0564b.blue(c2549i, c0585q2, alpha);
                    C2549i c2549i2 = C2551k.echo;
                    C0564b.blue(c2549i2, c0585q2, mike);
                    C2549i c2549i3 = C2551k.golf;
                    if (!c0585q2.lime) {
                        f5 = 1.0f;
                        break;
                    } else {
                        f5 = 1.0f;
                    }
                    ao.ad.blue(i13, c0585q2, i13, c2549i3);
                    C2549i c2549i4 = C2551k.delta;
                    C0564b.blue(c2549i4, c0585q2, charlie);
                    T.s maroon = P0.maroon(f5);
                    T.i iVar = T.d.f2063g;
                    float f11 = 4;
                    C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(f11), iVar, c0585q2, 54);
                    long j6 = c0585q2.magenta;
                    int i14 = (int) (j6 ^ (j6 >>> 32));
                    I mike2 = c0585q2.mike();
                    T.s charlie2 = T.a.charlie(maroon, c0585q2);
                    c0585q2.white();
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(c2549i, c0585q2, alpha2);
                    C0564b.blue(c2549i2, c0585q2, mike2);
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i14))) {
                        ao.ad.blue(i14, c0585q2, i14, c2549i3);
                    }
                    C0564b.blue(c2549i4, c0585q2, charlie2);
                    androidx.compose.foundation.layout.S alpha3 = Q.alpha(AbstractC0542h.golf(f11), jVar, c0585q2, 54);
                    long j7 = c0585q2.magenta;
                    int i15 = (int) (j7 ^ (j7 >>> 32));
                    I mike3 = c0585q2.mike();
                    T.s charlie3 = T.a.charlie(pVar, c0585q2);
                    c0585q2.white();
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(c2549i, c0585q2, alpha3);
                    C0564b.blue(c2549i2, c0585q2, mike3);
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i15))) {
                        ao.ad.blue(i15, c0585q2, i15, c2549i3);
                    }
                    C0564b.blue(c2549i4, c0585q2, charlie3);
                    AbstractC1680b charlie4 = AbstractC3076w3.charlie(R.drawable.kronometre, c0585q2, 6);
                    T.s kilo = V.kilo(pVar, f10);
                    long j10 = q.bravo;
                    AbstractC0141o0.alpha(charlie4, null, kilo, j10, c0585q2, 3504, 0);
                    G2.bravo(AbstractC3086y3.bravo(c0585q2, R.string.start), null, j10, AbstractC2636d7.charlie(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q2, 3456, 0, 131058);
                    c0585q2.quebec(true);
                    Shift shift = (Shift) obj3;
                    String str4 = shift.get12HourFormatStartAt();
                    if (str4 == null) {
                        str = "-";
                    } else {
                        str = str4;
                    }
                    long charlie5 = AbstractC2636d7.charlie(14);
                    v vVar = v.f1409c;
                    long j11 = q.alpha;
                    G2.bravo(str, null, j11, charlie5, vVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q2, 200064, 0, 131026);
                    c0585q2.quebec(true);
                    AbstractC3318b.hotel(54, q.delta, V.oscar(pVar, 1), c0585q2);
                    T.s maroon2 = P0.maroon(f5);
                    C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.golf(f11), iVar, c0585q2, 54);
                    long j12 = c0585q2.magenta;
                    int i16 = (int) (j12 ^ (j12 >>> 32));
                    I mike4 = c0585q2.mike();
                    T.s charlie6 = T.a.charlie(maroon2, c0585q2);
                    c0585q2.white();
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(c2549i, c0585q2, alpha4);
                    C0564b.blue(c2549i2, c0585q2, mike4);
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i16))) {
                        ao.ad.blue(i16, c0585q2, i16, c2549i3);
                    }
                    C0564b.blue(c2549i4, c0585q2, charlie6);
                    androidx.compose.foundation.layout.S alpha5 = Q.alpha(AbstractC0542h.golf(f11), jVar, c0585q2, 54);
                    long j13 = c0585q2.magenta;
                    int i17 = (int) (j13 ^ (j13 >>> 32));
                    I mike5 = c0585q2.mike();
                    T.s charlie7 = T.a.charlie(pVar, c0585q2);
                    c0585q2.white();
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(c2549i, c0585q2, alpha5);
                    C0564b.blue(c2549i2, c0585q2, mike5);
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i17))) {
                        ao.ad.blue(i17, c0585q2, i17, c2549i3);
                    }
                    C0564b.blue(c2549i4, c0585q2, charlie7);
                    AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.kronometre, c0585q2, 6), null, V.kilo(pVar, f10), j10, c0585q2, 3504, 0);
                    G2.bravo(AbstractC3086y3.bravo(c0585q2, R.string.finish), null, j10, AbstractC2636d7.charlie(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q2, 3456, 0, 131058);
                    c0585q2.quebec(true);
                    String str5 = shift.get12HourFormatFinishAt();
                    if (str5 == null) {
                        str2 = "-";
                    } else {
                        str2 = str5;
                    }
                    G2.bravo(str2, null, j11, AbstractC2636d7.charlie(14), vVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q2, 200064, 0, 131026);
                    c0585q2.quebec(true);
                    c0585q2.quebec(true);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 2:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z21 = true;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z21)) {
                    G2.bravo(AbstractC3086y3.bravo(c0585q3, ((Cb.b) obj3).alpha), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q3, 0, 0, 131070);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 3:
                Z.c bronze = ao.bronze((RectF) obj);
                Z.c bronze2 = ao.bronze((RectF) obj2);
                switch (((A8.a) obj3).alpha) {
                    case 5:
                        z2 = bronze.foxtrot(bronze2);
                        break;
                    default:
                        long alpha6 = bronze.alpha();
                        float intBitsToFloat = Float.intBitsToFloat((int) (alpha6 >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (alpha6 & 4294967295L));
                        if (intBitsToFloat >= bronze2.alpha) {
                            c3 = 1;
                        } else {
                            c3 = 0;
                        }
                        if (intBitsToFloat < bronze2.charlie) {
                            c4 = 1;
                        } else {
                            c4 = 0;
                        }
                        int i18 = c3 & c4;
                        if (intBitsToFloat2 >= bronze2.bravo) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        int i19 = i18 & i4;
                        if (intBitsToFloat2 < bronze2.delta) {
                            i12 = 1;
                        }
                        z2 = i19 & i12;
                        break;
                }
                return Boolean.valueOf(z2);
            case 4:
                return FlowComponent.alpha((FlowComponent) obj3, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 5:
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i20 = EnvelopsListingActivityV2.Q;
                if ((intValue4 & 3) != 2) {
                    z20 = true;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z20)) {
                    Object jade = c0585q4.jade();
                    Object obj4 = jade;
                    if (jade == asVar) {
                        ax zulu = C0564b.zulu(Gb.m.alpha);
                        c0585q4.f(zulu);
                        obj4 = zulu;
                    }
                    ax axVar = (ax) obj4;
                    Gb.m mVar = (Gb.m) axVar.getValue();
                    EnvelopsListingActivityV2 envelopsListingActivityV2 = (EnvelopsListingActivityV2) obj3;
                    boolean booleanValue = ((Boolean) ((t0) envelopsListingActivityV2.f12262J).getValue()).booleanValue();
                    boolean india = c0585q4.india(envelopsListingActivityV2);
                    Object jade2 = c0585q4.jade();
                    Object obj5 = jade2;
                    if (india || jade2 == asVar) {
                        Cb.ad adVar = new Cb.ad(i10, envelopsListingActivityV2, axVar);
                        c0585q4.f(adVar);
                        obj5 = adVar;
                    }
                    Gb.a.bravo(mVar, booleanValue, (Function1) obj5, AbstractC0538d.tango(pVar, 16, 12), c0585q4, 3072);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            case 6:
                InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q5 = (C0585q) interfaceC0581m5;
                if (c0585q5.magenta(intValue5 & 1, z10)) {
                    final Gc.g gVar2 = (Gc.g) obj3;
                    boolean z23 = gVar2.f1376s;
                    boolean z24 = gVar2.f1377t;
                    boolean india2 = c0585q5.india(gVar2);
                    Object jade3 = c0585q5.jade();
                    Object obj6 = jade3;
                    if (india2 || jade3 == asVar) {
                        final int i21 = z18 ? 1 : 0;
                        Function0 function0 = new Function0() { // from class: Gc.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String str6;
                                switch (i21) {
                                    case 0:
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            str6 = "android.permission.READ_MEDIA_IMAGES";
                                        } else {
                                            str6 = "android.permission.READ_EXTERNAL_STORAGE";
                                        }
                                        gVar2.f1380w.alpha(str6);
                                        return Unit.INSTANCE;
                                    case 1:
                                        gVar2.f1379v.alpha("android.permission.CAMERA");
                                        return Unit.INSTANCE;
                                    default:
                                        gVar2.juliet();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q5.f(function0);
                        obj6 = function0;
                    }
                    Function0 function02 = (Function0) obj6;
                    boolean india3 = c0585q5.india(gVar2);
                    Object jade4 = c0585q5.jade();
                    Object obj7 = jade4;
                    if (india3 || jade4 == asVar) {
                        final int i22 = 1;
                        Function0 function03 = new Function0() { // from class: Gc.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String str6;
                                switch (i22) {
                                    case 0:
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            str6 = "android.permission.READ_MEDIA_IMAGES";
                                        } else {
                                            str6 = "android.permission.READ_EXTERNAL_STORAGE";
                                        }
                                        gVar2.f1380w.alpha(str6);
                                        return Unit.INSTANCE;
                                    case 1:
                                        gVar2.f1379v.alpha("android.permission.CAMERA");
                                        return Unit.INSTANCE;
                                    default:
                                        gVar2.juliet();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q5.f(function03);
                        obj7 = function03;
                    }
                    Function0 function04 = (Function0) obj7;
                    boolean india4 = c0585q5.india(gVar2);
                    Object jade5 = c0585q5.jade();
                    Object obj8 = jade5;
                    if (india4 || jade5 == asVar) {
                        Function0 function05 = new Function0() { // from class: Gc.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String str6;
                                switch (i11) {
                                    case 0:
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            str6 = "android.permission.READ_MEDIA_IMAGES";
                                        } else {
                                            str6 = "android.permission.READ_EXTERNAL_STORAGE";
                                        }
                                        gVar2.f1380w.alpha(str6);
                                        return Unit.INSTANCE;
                                    case 1:
                                        gVar2.f1379v.alpha("android.permission.CAMERA");
                                        return Unit.INSTANCE;
                                    default:
                                        gVar2.juliet();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q5.f(function05);
                        obj8 = function05;
                    }
                    N6.bravo(z23, z24, function02, function04, (Function0) obj8, c0585q5, 0);
                } else {
                    c0585q5.ochre();
                }
                return Unit.INSTANCE;
            case 7:
                int intValue6 = ((Integer) obj).intValue();
                Function0 onSuccess = (Function0) obj2;
                int i23 = ZenDeskChatActivity.f12498T;
                Intrinsics.echo(onSuccess, "onSuccess");
                ZenDeskChatActivity zenDeskChatActivity = (ZenDeskChatActivity) obj3;
                List list2 = (List) zenDeskChatActivity.f12501J.getValue();
                if (list2 != null) {
                    str3 = (String) list2.get(intValue6);
                }
                Intrinsics.checkNotNull(str3);
                File file = new File(str3);
                ProviderStore provider = Support.INSTANCE.provider();
                if (provider != null && (uploadProvider = provider.uploadProvider()) != null) {
                    uploadProvider.uploadAttachment(file.getName(), file, "image/jpg", new x(zenDeskChatActivity, onSuccess));
                }
                return Unit.INSTANCE;
            case 8:
                InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q6 = (C0585q) interfaceC0581m6;
                if (c0585q6.magenta(intValue7 & 1, z11)) {
                    float f12 = 16;
                    float f13 = 8;
                    T.s victor = AbstractC0538d.victor(V.charlie, f12, f13, f12, f13);
                    T.i iVar2 = T.d.f2063g;
                    C0537c c0537c = AbstractC0542h.alpha;
                    C0554u alpha7 = AbstractC0553t.alpha(AbstractC0542h.india(4, T.d.f2061d), iVar2, c0585q6, 54);
                    long j14 = c0585q6.magenta;
                    int i24 = (int) (j14 ^ (j14 >>> 32));
                    I mike6 = c0585q6.mike();
                    T.s charlie8 = T.a.charlie(victor, c0585q6);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j2 = C2551k.bravo;
                    c0585q6.white();
                    if (c0585q6.lime) {
                        c0585q6.lima(c2550j2);
                    } else {
                        c0585q6.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q6, alpha7);
                    C0564b.blue(C2551k.echo, c0585q6, mike6);
                    C2549i c2549i5 = C2551k.golf;
                    if (c0585q6.lime || !Intrinsics.areEqual(c0585q6.jade(), Integer.valueOf(i24))) {
                        ao.ad.blue(i24, c0585q6, i24, c2549i5);
                    }
                    C0564b.blue(C2551k.delta, c0585q6, charlie8);
                    g0 g0Var = (g0) obj3;
                    W3.alpha(AbstractC3076w3.charlie(g0Var.bravo, c0585q6, 0), null, AbstractC0538d.sierra(V.kilo(pVar, 24), 1), null, C2391j.echo, 0.0f, null, c0585q6, 25008, 104);
                    G2.bravo(g0Var.alpha, null, Jb.ad.alpha, AbstractC2636d7.charlie(14), new v(HttpConstants.HTTP_BLOCKED), Db.g.alpha, 0L, new O0.k(3), 0L, 2, false, 1, 0, null, null, c0585q6, 200064, 3120, 120210);
                    c0585q6.quebec(true);
                } else {
                    c0585q6.ochre();
                }
                return Unit.INSTANCE;
            case 9:
                InterfaceC0581m interfaceC0581m7 = (InterfaceC0581m) obj;
                int intValue8 = ((Integer) obj2).intValue();
                int i25 = HomeActivityV2.f12269k0;
                if ((intValue8 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C0585q c0585q7 = (C0585q) interfaceC0581m7;
                if (c0585q7.magenta(intValue8 & 1, z12)) {
                    HomeActivityV2 homeActivityV2 = (HomeActivityV2) obj3;
                    AbstractC0149q0.alpha(null, null, null, P.e.echo(-1147626251, new Cb.a(7, homeActivityV2, AbstractC2717m7.bravo(((HomeViewModelV2) homeActivityV2.f12280S.getValue()).hotel, c0585q7, 0)), c0585q7), c0585q7, 3072, 7);
                } else {
                    c0585q7.ochre();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                Jc.o.golf((SuspensionHistoryItem) obj3, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 11:
                InterfaceC0581m interfaceC0581m8 = (InterfaceC0581m) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z19 = true;
                }
                C0585q c0585q8 = (C0585q) interfaceC0581m8;
                if (c0585q8.magenta(intValue9 & 1, z19)) {
                    C2442i c2442i = new C2442i(AbstractC3086y3.bravo(c0585q8, R.string.book_shift_title), AbstractC3086y3.bravo(c0585q8, R.string.book_shift_empty_message), AbstractC3086y3.bravo(c0585q8, R.string.book_shift_cta));
                    Context context = (Context) obj3;
                    boolean india5 = c0585q8.india(context);
                    Object jade6 = c0585q8.jade();
                    Object obj9 = jade6;
                    if (india5 || jade6 == asVar) {
                        C0201i c0201i = new C0201i(context, 1);
                        c0585q8.f(c0201i);
                        obj9 = c0201i;
                    }
                    AbstractC2806w7.bravo(c2442i, (Function0) obj9, V.charlie(pVar, 1.0f), false, c0585q8, 384, 24);
                } else {
                    c0585q8.ochre();
                }
                return Unit.INSTANCE;
            case 12:
                InterfaceC0581m interfaceC0581m9 = (InterfaceC0581m) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C0585q c0585q9 = (C0585q) interfaceC0581m9;
                if (c0585q9.magenta(intValue10 & 1, z13)) {
                    Nc.n nVar = (Nc.n) obj3;
                    Root root = (Root) nVar.red.getValue();
                    if (root != null) {
                        list = root.getTypes();
                    }
                    if (list == null) {
                        list = CollectionsKt.emptyList();
                    }
                    boolean india6 = c0585q9.india(nVar);
                    Object jade7 = c0585q9.jade();
                    Object obj10 = jade7;
                    if (india6 || jade7 == asVar) {
                        Aa.l lVar = new Aa.l(i5, nVar);
                        c0585q9.f(lVar);
                        obj10 = lVar;
                    }
                    S6.bravo(list, (Function1) obj10, c0585q9, 0);
                } else {
                    c0585q9.ochre();
                }
                return Unit.INSTANCE;
            case 13:
                R.b bVar = (R.b) obj;
                List list3 = (List) ((Xd.l) obj3).invoke(bVar, obj2);
                int size = list3.size();
                for (int i26 = 0; i26 < size; i26++) {
                    Object obj11 = list3.get(i26);
                    if (obj11 != null && (gVar = bVar.purple) != null && !gVar.bravo(obj11)) {
                        throw new IllegalArgumentException(("item at index " + i26 + " can't be saved: " + obj11).toString());
                    }
                }
                if (list3.isEmpty()) {
                    return null;
                }
                return new ArrayList(list3);
            case 14:
                Set set = (Set) obj;
                while (true) {
                    S.x xVar = (S.x) obj3;
                    AtomicReference atomicReference = xVar.bravo;
                    Object obj12 = atomicReference.get();
                    if (obj12 == null) {
                        arrayList = set;
                    } else if (obj12 instanceof Set) {
                        arrayList = CollectionsKt.listOf(new Set[]{obj12, set});
                    } else if (obj12 instanceof List) {
                        arrayList = CollectionsKt.a((Collection) obj12, ab.juliet(set));
                    } else {
                        androidx.compose.runtime.r.delta("Unexpected notification");
                        throw new KotlinNothingValueException();
                    }
                    while (!atomicReference.compareAndSet(obj12, arrayList)) {
                        if (atomicReference.get() != obj12) {
                            break;
                        }
                    }
                    if (xVar.charlie()) {
                        xVar.alpha.invoke(new B2.q(20, xVar));
                    }
                    return Unit.INSTANCE;
                    break;
                }
            case 15:
                double doubleValue = ((Double) obj).doubleValue();
                double doubleValue2 = ((Double) obj2).doubleValue();
                int i27 = AllAddressNoteActivity.f12362R;
                L9.d.bronze((AllAddressNoteActivity) obj3, Float.valueOf((float) doubleValue), Float.valueOf((float) doubleValue2));
                return Unit.INSTANCE;
            case 16:
                InterfaceC0581m interfaceC0581m10 = (InterfaceC0581m) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                C0585q c0585q10 = (C0585q) interfaceC0581m10;
                if (c0585q10.magenta(intValue11 & 1, z14)) {
                    final C0307h c0307h = (C0307h) obj3;
                    ax axVar2 = c0307h.f2419w;
                    if (((File) ((t0) axVar2).getValue()) == null) {
                        c0585q10.purple(468351877);
                        Unit unit = Unit.INSTANCE;
                        boolean india7 = c0585q10.india(c0307h);
                        Object jade8 = c0585q10.jade();
                        Object obj13 = jade8;
                        if (india7 || jade8 == asVar) {
                            C0303f c0303f = new C0303f(c0307h, null);
                            c0585q10.f(c0303f);
                            obj13 = c0303f;
                        }
                        C0564b.foxtrot((Xd.l) obj13, c0585q10, unit);
                        c0585q10.quebec(false);
                    } else {
                        c0585q10.purple(468678958);
                        File file2 = (File) ((t0) axVar2).getValue();
                        Intrinsics.checkNotNull(file2);
                        boolean india8 = c0585q10.india(c0307h);
                        Object jade9 = c0585q10.jade();
                        Object obj14 = jade9;
                        if (india8 || jade9 == asVar) {
                            final int i28 = z18 ? 1 : 0;
                            Function0 function06 = new Function0() { // from class: Yb.b
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i28) {
                                        case 0:
                                            c0307h.juliet();
                                            return Unit.INSTANCE;
                                        case 1:
                                            C0307h c0307h2 = c0307h;
                                            File file3 = c0307h2.f2422z;
                                            if (file3 != null) {
                                                if (!file3.exists()) {
                                                    String string = c0307h2.getString(R.string.image_load_failed);
                                                    Intrinsics.delta(string, "getString(...)");
                                                    c0307h2.black(string);
                                                    return Unit.INSTANCE;
                                                }
                                                c0307h2.C = true;
                                                Function1 function1 = c0307h2.f2418v;
                                                if (function1 != null) {
                                                    String absolutePath = file3.getAbsolutePath();
                                                    Intrinsics.delta(absolutePath, "getAbsolutePath(...)");
                                                    function1.invoke(absolutePath);
                                                }
                                                c0307h2.juliet();
                                            } else {
                                                String string2 = c0307h2.getString(R.string.attach_proof_msg);
                                                Intrinsics.delta(string2, "getString(...)");
                                                c0307h2.black(string2);
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            C0307h c0307h3 = c0307h;
                                            c0307h3.f2420x = false;
                                            c0307h3.f2416H.alpha(new String[]{"android.permission.CAMERA"});
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            c0585q10.f(function06);
                            obj14 = function06;
                        }
                        Function0 function07 = (Function0) obj14;
                        boolean india9 = c0585q10.india(c0307h);
                        Object jade10 = c0585q10.jade();
                        Object obj15 = jade10;
                        if (india9 || jade10 == asVar) {
                            final int i29 = 1;
                            Function0 function08 = new Function0() { // from class: Yb.b
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i29) {
                                        case 0:
                                            c0307h.juliet();
                                            return Unit.INSTANCE;
                                        case 1:
                                            C0307h c0307h2 = c0307h;
                                            File file3 = c0307h2.f2422z;
                                            if (file3 != null) {
                                                if (!file3.exists()) {
                                                    String string = c0307h2.getString(R.string.image_load_failed);
                                                    Intrinsics.delta(string, "getString(...)");
                                                    c0307h2.black(string);
                                                    return Unit.INSTANCE;
                                                }
                                                c0307h2.C = true;
                                                Function1 function1 = c0307h2.f2418v;
                                                if (function1 != null) {
                                                    String absolutePath = file3.getAbsolutePath();
                                                    Intrinsics.delta(absolutePath, "getAbsolutePath(...)");
                                                    function1.invoke(absolutePath);
                                                }
                                                c0307h2.juliet();
                                            } else {
                                                String string2 = c0307h2.getString(R.string.attach_proof_msg);
                                                Intrinsics.delta(string2, "getString(...)");
                                                c0307h2.black(string2);
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            C0307h c0307h3 = c0307h;
                                            c0307h3.f2420x = false;
                                            c0307h3.f2416H.alpha(new String[]{"android.permission.CAMERA"});
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            c0585q10.f(function08);
                            obj15 = function08;
                        }
                        Function0 function09 = (Function0) obj15;
                        boolean india10 = c0585q10.india(c0307h);
                        Object jade11 = c0585q10.jade();
                        Object obj16 = jade11;
                        if (india10 || jade11 == asVar) {
                            Function0 function010 = new Function0() { // from class: Yb.b
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            c0307h.juliet();
                                            return Unit.INSTANCE;
                                        case 1:
                                            C0307h c0307h2 = c0307h;
                                            File file3 = c0307h2.f2422z;
                                            if (file3 != null) {
                                                if (!file3.exists()) {
                                                    String string = c0307h2.getString(R.string.image_load_failed);
                                                    Intrinsics.delta(string, "getString(...)");
                                                    c0307h2.black(string);
                                                    return Unit.INSTANCE;
                                                }
                                                c0307h2.C = true;
                                                Function1 function1 = c0307h2.f2418v;
                                                if (function1 != null) {
                                                    String absolutePath = file3.getAbsolutePath();
                                                    Intrinsics.delta(absolutePath, "getAbsolutePath(...)");
                                                    function1.invoke(absolutePath);
                                                }
                                                c0307h2.juliet();
                                            } else {
                                                String string2 = c0307h2.getString(R.string.attach_proof_msg);
                                                Intrinsics.delta(string2, "getString(...)");
                                                c0307h2.black(string2);
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            C0307h c0307h3 = c0307h;
                                            c0307h3.f2420x = false;
                                            c0307h3.f2416H.alpha(new String[]{"android.permission.CAMERA"});
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            c0585q10.f(function010);
                            obj16 = function010;
                        }
                        Wb.t.alpha(file2, function07, function09, (Function0) obj16, null, c0585q10, 0, 16);
                        c0585q10.quebec(false);
                    }
                } else {
                    c0585q10.ochre();
                }
                return Unit.INSTANCE;
            case 17:
                final int i30 = 1;
                InterfaceC0581m interfaceC0581m11 = (InterfaceC0581m) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                C0585q c0585q11 = (C0585q) interfaceC0581m11;
                if (c0585q11.magenta(intValue12 & 1, z15)) {
                    final C0321o c0321o = (C0321o) obj3;
                    boolean booleanValue2 = ((Boolean) ((t0) c0321o.f2432s).getValue()).booleanValue();
                    boolean india11 = c0585q11.india(c0321o);
                    Object jade12 = c0585q11.jade();
                    Object obj17 = jade12;
                    if (india11 || jade12 == asVar) {
                        final int i31 = z18 ? 1 : 0;
                        Function0 function011 = new Function0() { // from class: Yb.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Bundle arguments;
                                switch (i31) {
                                    case 0:
                                        C0321o c0321o2 = c0321o;
                                        androidx.compose.runtime.t0 t0Var = (androidx.compose.runtime.t0) c0321o2.f2432s;
                                        if (!((Boolean) t0Var.getValue()).booleanValue() && (arguments = c0321o2.getArguments()) != null) {
                                            int i32 = arguments.getInt("orderId");
                                            t0Var.setValue(Boolean.TRUE);
                                            ((AllAddressNoteViewModel) c0321o2.f2431r.getValue()).bravo(String.valueOf(i32)).observe(c0321o2.getViewLifecycleOwner(), new Aa.f(21, new Ya.c(1, c0321o2)));
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        c0321o.kilo();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q11.f(function011);
                        obj17 = function011;
                    }
                    Function0 function012 = (Function0) obj17;
                    boolean india12 = c0585q11.india(c0321o);
                    Object jade13 = c0585q11.jade();
                    Object obj18 = jade13;
                    if (india12 || jade13 == asVar) {
                        Function0 function013 = new Function0() { // from class: Yb.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Bundle arguments;
                                switch (i30) {
                                    case 0:
                                        C0321o c0321o2 = c0321o;
                                        androidx.compose.runtime.t0 t0Var = (androidx.compose.runtime.t0) c0321o2.f2432s;
                                        if (!((Boolean) t0Var.getValue()).booleanValue() && (arguments = c0321o2.getArguments()) != null) {
                                            int i32 = arguments.getInt("orderId");
                                            t0Var.setValue(Boolean.TRUE);
                                            ((AllAddressNoteViewModel) c0321o2.f2431r.getValue()).bravo(String.valueOf(i32)).observe(c0321o2.getViewLifecycleOwner(), new Aa.f(21, new Ya.c(1, c0321o2)));
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        c0321o.kilo();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q11.f(function013);
                        obj18 = function013;
                    }
                    Zb.d.alpha(function012, (Function0) obj18, null, booleanValue2, c0585q11, 0);
                } else {
                    c0585q11.ochre();
                }
                return Unit.INSTANCE;
            case 18:
                InterfaceC0581m interfaceC0581m12 = (InterfaceC0581m) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if ((intValue13 & 3) != 2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                C0585q c0585q12 = (C0585q) interfaceC0581m12;
                if (c0585q12.magenta(intValue13 & 1, z16)) {
                    C0304f0 c0304f0 = (C0304f0) obj3;
                    int i32 = c0304f0.f2409t;
                    boolean india13 = c0585q12.india(c0304f0);
                    Object jade14 = c0585q12.jade();
                    Object obj19 = jade14;
                    if (india13 || jade14 == asVar) {
                        Ya.c cVar = new Ya.c(i11, c0304f0);
                        c0585q12.f(cVar);
                        obj19 = cVar;
                    }
                    A7.delta(i32, (Function1) obj19, null, c0585q12, 0);
                } else {
                    c0585q12.ochre();
                }
                return Unit.INSTANCE;
            case 19:
                String str6 = (String) obj2;
                if (((Integer) obj).intValue() == 0) {
                    if (str6 == null) {
                        str6 = "";
                    }
                    String message = StringsKt.b(str6).toString();
                    if (message != null && !StringsKt.gray(message)) {
                        Intrinsics.checkNotNull(message);
                        String obj20 = StringsKt.b(message).toString();
                        if (!Intrinsics.areEqual(obj20, "You cannot vote for your own address note")) {
                            if (!Intrinsics.areEqual(obj20, "You have already voted for this address note")) {
                                if (!Intrinsics.areEqual(obj20, "لا يمكنك التصويت على ملاحظة عنوانك الخاصة")) {
                                    break;
                                }
                            }
                        }
                    }
                    C0329s0 c0329s0 = (C0329s0) obj3;
                    c0329s0.getClass();
                    Intrinsics.echo(message, "message");
                    L9.d.pink(c0329s0.alpha, message);
                }
                return Unit.INSTANCE;
            case 20:
                InterfaceC0581m interfaceC0581m13 = (InterfaceC0581m) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if ((intValue14 & 3) != 2) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                C0585q c0585q13 = (C0585q) interfaceC0581m13;
                if (c0585q13.magenta(intValue14 & 1, z17)) {
                    Zb.b bVar2 = (Zb.b) obj3;
                    Bundle arguments = bVar2.getArguments();
                    if (arguments == null || (intArray = arguments.getIntArray("ARG_ORDER_IDS")) == null || (emptyList = ArraysKt.yellow(intArray)) == null) {
                        emptyList = CollectionsKt.emptyList();
                    }
                    List list4 = emptyList;
                    Bundle arguments2 = bVar2.getArguments();
                    if (arguments2 == null || (iArr = arguments2.getIntArray("ARG_DISPLAY_KEYS")) == null) {
                        iArr = new int[0];
                    }
                    Bundle arguments3 = bVar2.getArguments();
                    if (arguments3 == null || (strArr = arguments3.getStringArray("ARG_DISPLAY_VALS")) == null) {
                        strArr = new String[0];
                    }
                    Map yankee = y.yankee(ArraysKt.h(iArr, ArraysKt.b(strArr)));
                    boolean india14 = c0585q13.india(bVar2);
                    Object jade15 = c0585q13.jade();
                    Object obj21 = jade15;
                    if (india14 || jade15 == asVar) {
                        Ya.c cVar2 = new Ya.c(5, bVar2);
                        c0585q13.f(cVar2);
                        obj21 = cVar2;
                    }
                    Function1 function1 = (Function1) obj21;
                    boolean india15 = c0585q13.india(bVar2);
                    Object jade16 = c0585q13.jade();
                    Object obj22 = jade16;
                    if (india15 || jade16 == asVar) {
                        C0312j0 c0312j0 = new C0312j0(i11, bVar2);
                        c0585q13.f(c0312j0);
                        obj22 = c0312j0;
                    }
                    Zb.d.charlie(list4, yankee, function1, (Function0) obj22, null, c0585q13, 0);
                } else {
                    c0585q13.ochre();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                U2.alpha((C0389n) obj3, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 22:
                return com.checkout.components.rememberme.I.a((TextLabelViewItem) obj3, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 23:
                return AbstractC0993x.a((DiComponent) obj3, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 24:
                return Integer.valueOf(((T.i) obj3).alpha(0, ((Integer) obj).intValue(), (Q0.n) obj2));
            case 25:
                return new Q0.k((((T.e) obj3).alpha(0, (int) (((Q0.m) obj).alpha >> 32), (Q0.n) obj2) << 32) | (0 & 4294967295L));
            case 26:
                return new Q0.k(((T.f) obj3).alpha(0L, ((Q0.m) obj).alpha, (Q0.n) obj2));
            case 27:
                ((Integer) obj).getClass();
                B9.r rVar = (B9.r) obj3;
                if (obj2 instanceof InterfaceC0578j) {
                    InterfaceC0578j interfaceC0578j = (InterfaceC0578j) obj2;
                    am amVar = (am) rVar.hotel;
                    if (amVar == null) {
                        am amVar2 = av.alpha;
                        amVar = new am();
                        rVar.hotel = amVar;
                    }
                    amVar.kilo(interfaceC0578j);
                    ((J.e) rVar.foxtrot).bravo(interfaceC0578j);
                }
                if (obj2 instanceof C0565b0) {
                    rVar.echo((C0565b0) obj2);
                }
                if (obj2 instanceof androidx.compose.runtime.Q) {
                    ((androidx.compose.runtime.Q) obj2).delta();
                }
                return Unit.INSTANCE;
            case 28:
                return alpha(obj, obj2);
            default:
                Set set2 = (Set) obj;
                if (set2 instanceof J.h) {
                    am amVar3 = ((J.h) set2).alpha;
                    Object[] objArr = amVar3.bravo;
                    long[] jArr = amVar3.alpha;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i33 = 0;
                        while (true) {
                            long j15 = jArr[i33];
                            if ((((~j15) << c10) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i34 = 8 - ((~(i33 - length)) >>> 31);
                                for (int i35 = 0; i35 < i34; i35++) {
                                    if ((j15 & 255) < 128) {
                                        Object obj23 = objArr[(i33 << 3) + i35];
                                        if ((obj23 instanceof ad) && !((ad) obj23).charlie(4)) {
                                        }
                                    }
                                    j15 >>= 8;
                                }
                                if (i34 != 8) {
                                }
                            }
                            if (i33 != length) {
                                i33++;
                                c10 = 7;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                Set set3 = set2;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    for (Object obj24 : set3) {
                        if ((obj24 instanceof ad) && !((ad) obj24).charlie(4)) {
                        }
                        ((xf.e) obj3).mike(set2);
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ k(Object obj, int i4, int i5) {
        this.alpha = i5;
        this.purple = obj;
    }
}
