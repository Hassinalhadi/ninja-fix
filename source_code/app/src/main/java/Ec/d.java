package Ec;

import B9.L;
import android.os.Bundle;
import androidx.compose.runtime.n0;
import com.google.android.material.button.MaterialButton;
import d.C1548o0;
import d.J;
import delivery.samurai.android.R;
import i.C1860i;
import i.InterfaceC1869r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import n.C2146v;
import n.N;
import n.e0;
import r3.C2492a;
import s0.AbstractC2557q;
import t0.AbstractC2901T;
import t0.C0;
import w.C3227e;
import y.C3344D;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
        this.teal = obj4;
        this.white = obj5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List emptyList;
        Z.c cVar;
        float rint;
        n.ax axVar;
        C3344D c3344d;
        boolean z2 = false;
        C0 c02 = null;
        int i4 = 2;
        Object obj2 = this.white;
        Object obj3 = this.teal;
        Object obj4 = this.silver;
        Object obj5 = this.purple;
        Object obj6 = this.red;
        switch (this.alpha) {
            case 0:
                InterfaceC1869r LazyColumn = (InterfaceC1869r) obj;
                Intrinsics.echo(LazyColumn, "$this$LazyColumn");
                com.google.android.material.datepicker.j.bravo(LazyColumn, null, t.delta, 3);
                List list = (List) obj5;
                ((C1860i) LazyColumn).quebec(list.size(), new Cb.l(i4, new D0.z(18), list), new Cb.m(1, list), new P.d(new k(list, (List) obj6, (Function1) obj4, (Xd.l) obj2, (Function1) obj3), 802480018, true));
                return Unit.INSTANCE;
            case 1:
                Y1.l entry = (Y1.l) obj;
                Intrinsics.echo(entry, "entry");
                ((kotlin.jvm.internal.q) obj5).alpha = true;
                ArrayList arrayList = (ArrayList) obj6;
                int indexOf = arrayList.indexOf(entry);
                if (indexOf != -1) {
                    kotlin.jvm.internal.s sVar = (kotlin.jvm.internal.s) obj4;
                    int i5 = indexOf + 1;
                    emptyList = arrayList.subList(sVar.alpha, i5);
                    sVar.alpha = i5;
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                ((androidx.navigation.internal.g) obj3).alpha(entry.purple, (Bundle) obj2, entry, emptyList);
                return Unit.INSTANCE;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                J j5 = (J) obj5;
                d.ay delta = J.delta(j5.echo);
                if (delta != null) {
                    j5.echo(delta);
                    Ref.ObjectRef objectRef = (Ref.ObjectRef) obj6;
                    d.ay alpha = ((d.ay) objectRef.alpha).alpha(delta);
                    objectRef.alpha = alpha;
                    C1548o0 c1548o0 = (C1548o0) obj3;
                    ((kotlin.jvm.internal.r) obj4).alpha = c1548o0.golf(c1548o0.echo(alpha.alpha));
                    ((kotlin.jvm.internal.q) obj2).alpha = !d.ax.alpha(r6 - floatValue);
                }
                if (delta != null) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 3:
                C2492a c2492a = (C2492a) obj;
                int i10 = c2492a.alpha;
                ga.u uVar = (ga.u) obj5;
                MaterialButton materialButton = (MaterialButton) obj6;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            uVar.kilo().bronze();
                            materialButton.setEnabled(false);
                        }
                    } else {
                        uVar.kilo().tango();
                        materialButton.setEnabled(true);
                        d3.k kilo = uVar.kilo();
                        String string = uVar.getString(R.string.update_success);
                        Intrinsics.delta(string, "getString(...)");
                        L9.d.pink(kilo, string);
                        L quebec = uVar.quebec();
                        String str = (String) obj4;
                        String str2 = "-";
                        if (str == null) {
                            str = "-";
                        }
                        quebec.f176r.setText(str);
                        L quebec2 = uVar.quebec();
                        String str3 = (String) obj3;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        quebec2.f175q.setText(str2);
                        uVar.romeo().alpha();
                        ((androidx.appcompat.app.g) obj2).dismiss();
                    }
                } else {
                    uVar.kilo().tango();
                    materialButton.setEnabled(true);
                    d3.k kilo2 = uVar.kilo();
                    String str4 = c2492a.bravo;
                    if (str4 == null) {
                        str4 = uVar.getString(R.string.error_something_went_wrong);
                        Intrinsics.delta(str4, "getString(...)");
                    }
                    L9.d.pink(kilo2, str4);
                }
                return Unit.INSTANCE;
            case 4:
                s0.an anVar = (s0.an) obj;
                anVar.charlie();
                float juliet = ((n0) ((w.k) obj5).charlie).juliet();
                if (juliet != 0.0f) {
                    int i11 = D0.am.charlie;
                    int originalToTransformed = ((I0.t) obj6).originalToTransformed((int) (((I0.aa) obj4).bravo >> 32));
                    e0 delta2 = ((n.ax) obj3).delta();
                    if (delta2 != null) {
                        cVar = delta2.alpha.charlie(originalToTransformed);
                    } else {
                        cVar = new Z.c(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    float floor = (float) Math.floor(anVar.lavender(N.alpha));
                    if (floor < 1.0f) {
                        floor = 1.0f;
                    }
                    float f5 = floor / 2;
                    float f10 = cVar.alpha + f5;
                    float intBitsToFloat = Float.intBitsToFloat((int) (anVar.alpha.purple.oscar() >> 32)) - f5;
                    if (f10 > intBitsToFloat) {
                        f10 = intBitsToFloat;
                    }
                    if (f10 >= f5) {
                        f5 = f10;
                    }
                    if (((int) floor) % 2 == 1) {
                        rint = ((float) Math.floor(f5)) + 0.5f;
                    } else {
                        rint = (float) Math.rint(f5);
                    }
                    ao.ad.india(anVar, (a0.au) obj2, (Float.floatToRawIntBits(rint) << 32) | (Float.floatToRawIntBits(cVar.bravo) & 4294967295L), (Float.floatToRawIntBits(cVar.delta) & 4294967295L) | (Float.floatToRawIntBits(rint) << 32), floor, juliet, 432);
                }
                return Unit.INSTANCE;
            default:
                w.u uVar2 = (w.u) obj;
                w.q qVar = ((C3227e) obj6).alpha;
                uVar2.hotel = (I0.aa) obj5;
                uVar2.india = (I0.l) obj4;
                uVar2.charlie = (Cb.ac) obj3;
                uVar2.delta = (C2146v) obj2;
                if (qVar != null) {
                    axVar = qVar.purple;
                } else {
                    axVar = null;
                }
                uVar2.echo = axVar;
                if (qVar != null) {
                    c3344d = qVar.red;
                } else {
                    c3344d = null;
                }
                uVar2.foxtrot = c3344d;
                if (qVar != null) {
                    c02 = (C0) AbstractC2557q.echo(qVar, AbstractC2901T.sierra);
                }
                uVar2.golf = c02;
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(List list, List list2, Function1 function1, Xd.l lVar, Function1 function12) {
        this.alpha = 0;
        this.purple = list;
        this.red = list2;
        this.silver = function1;
        this.white = lVar;
        this.teal = function12;
    }
}
