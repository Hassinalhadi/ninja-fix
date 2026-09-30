package b;

import f.C1667d;
import f.C1668e;
import f.C1670g;
import f.C1671h;
import f.C1675l;
import f.C1676m;
import f.C1677n;
import f.InterfaceC1672i;
import kotlin.Unit;
import s0.AbstractC2557q;
import y.C3344D;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class aj implements InterfaceC3440j {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ aj(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
        this.teal = obj4;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        boolean z2;
        boolean z10;
        boolean z11;
        switch (this.alpha) {
            case 0:
                InterfaceC1672i interfaceC1672i = (InterfaceC1672i) obj;
                boolean z12 = interfaceC1672i instanceof C1676m;
                kotlin.jvm.internal.s sVar = (kotlin.jvm.internal.s) this.silver;
                kotlin.jvm.internal.s sVar2 = (kotlin.jvm.internal.s) this.red;
                kotlin.jvm.internal.s sVar3 = (kotlin.jvm.internal.s) this.purple;
                boolean z13 = true;
                if (z12) {
                    sVar3.alpha++;
                } else if (interfaceC1672i instanceof C1677n) {
                    sVar3.alpha--;
                } else if (interfaceC1672i instanceof C1675l) {
                    sVar3.alpha--;
                } else if (interfaceC1672i instanceof C1670g) {
                    sVar2.alpha++;
                } else if (interfaceC1672i instanceof C1671h) {
                    sVar2.alpha--;
                } else if (interfaceC1672i instanceof C1667d) {
                    sVar.alpha++;
                } else if (interfaceC1672i instanceof C1668e) {
                    sVar.alpha--;
                }
                boolean z14 = false;
                if (sVar3.alpha > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (sVar2.alpha > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (sVar.alpha > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                al alVar = (al) this.teal;
                if (alVar.purple != z2) {
                    alVar.purple = z2;
                    z14 = true;
                }
                if (alVar.red != z10) {
                    alVar.red = z10;
                    z14 = true;
                }
                if (alVar.silver != z11) {
                    alVar.silver = z11;
                } else {
                    z13 = z14;
                }
                if (z13) {
                    AbstractC2557q.india(alVar);
                }
                return Unit.INSTANCE;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                n.ax axVar = (n.ax) this.purple;
                if (booleanValue && axVar.bravo()) {
                    C3344D c3344d = (C3344D) this.silver;
                    n.at.whiskey((I0.ab) this.red, axVar, c3344d.oscar(), (I0.l) this.teal, c3344d.bravo);
                } else {
                    n.at.papa(axVar);
                }
                return Unit.INSTANCE;
        }
    }
}
