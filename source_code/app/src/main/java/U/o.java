package U;

import D0.an;
import F.G2;
import H0.v;
import T.s;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.view.ViewStructure;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import i.InterfaceC1854c;
import java.util.List;
import kb.AbstractC2030f;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import m.AbstractC2094g;
import ob.AbstractC2210c;
import ob.C2209b;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s2.InterfaceC2596d;
import t6.R3;

/* loaded from: classes3.dex */
public final class o extends Lambda implements Xd.n {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i4, Object obj) {
        super(4);
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // Xd.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i4;
        int i5;
        int i10;
        Object obj5 = this.purple;
        switch (this.alpha) {
            case 0:
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                ViewStructure viewStructure = (ViewStructure) obj5;
                viewStructure.setDimens(intValue, intValue2, 0, 0, ((Number) obj3).intValue() - intValue, ((Number) obj4).intValue() - intValue2);
                return Unit.INSTANCE;
            case 1:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                Intrinsics.checkNotNull(sQLiteQuery);
                ((InterfaceC2596d) obj5).charlie(new androidx.sqlite.db.framework.h(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            default:
                InterfaceC1854c interfaceC1854c = (InterfaceC1854c) obj;
                int intValue3 = ((Number) obj2).intValue();
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (((C0585q) interfaceC0581m).golf(interfaceC1854c)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    i4 = i10 | intValue4;
                } else {
                    i4 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (((C0585q) interfaceC0581m).echo(intValue3)) {
                        i5 = 32;
                    } else {
                        i5 = 16;
                    }
                    i4 |= i5;
                }
                if ((i4 & 147) == 146) {
                    C0585q c0585q = (C0585q) interfaceC0581m;
                    if (c0585q.bronze()) {
                        c0585q.ochre();
                        return Unit.INSTANCE;
                    }
                }
                String str = (String) ((List) obj5).get(intValue3);
                C0585q c0585q2 = (C0585q) interfaceC0581m;
                c0585q2.purple(-1914070487);
                T.p pVar = T.p.alpha;
                float f5 = AbstractC2030f.delta;
                s alpha = V.alpha(pVar, f5, f5);
                float f10 = C2209b.alpha;
                long j5 = AbstractC2210c.charlie;
                float f11 = AbstractC2030f.echo;
                s sierra = AbstractC0538d.sierra(R3.charlie(androidx.compose.foundation.a.bravo(alpha, j5, AbstractC2094g.bravo(f11)), 1, AbstractC2210c.delta, AbstractC2094g.bravo(f11)), AbstractC2030f.foxtrot);
                ap delta = AbstractC0547m.delta(T.d.teal, false);
                int romeo = C0564b.romeo(c0585q2);
                I mike = c0585q2.mike();
                s charlie = T.a.charlie(sierra, c0585q2);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q2, delta);
                C0564b.blue(C2551k.echo, c0585q2, mike);
                C2549i c2549i = C2551k.golf;
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                    ad.blue(romeo, c0585q2, romeo, c2549i);
                }
                C0564b.blue(C2551k.delta, c0585q2, charlie);
                long j6 = AbstractC2030f.charlie;
                G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, new an(AbstractC2210c.golf, j6, new v(700), null, AbstractC2030f.alpha, 0L, 3, j6, 0, 16613336), c0585q2, 0, 3456, 53246);
                c0585q2.quebec(true);
                c0585q2.quebec(false);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(List list) {
        super(4);
        this.alpha = 2;
        float f5 = C2209b.alpha;
        this.purple = list;
    }
}
