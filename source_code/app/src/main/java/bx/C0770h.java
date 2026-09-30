package bx;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: bx.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0770h extends Lambda implements Xd.m {
    public final /* synthetic */ SnapshotStateList alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ s red;
    public final /* synthetic */ P.d silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0770h(SnapshotStateList snapshotStateList, Object obj, s sVar, P.d dVar) {
        super(3);
        this.alpha = snapshotStateList;
        this.purple = obj;
        this.red = sVar;
        this.silver = dVar;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        boolean india;
        int i4;
        aa aaVar = (aa) obj;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if ((intValue & 8) == 0) {
                india = ((C0585q) interfaceC0581m).golf(aaVar);
            } else {
                india = ((C0585q) interfaceC0581m).india(aaVar);
            }
            if (india) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            intValue |= i4;
        }
        if ((intValue & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(intValue & 1, z2)) {
            SnapshotStateList snapshotStateList = this.alpha;
            boolean golf = c0585q.golf(snapshotStateList);
            Object obj4 = this.purple;
            boolean india2 = golf | c0585q.india(obj4);
            s sVar = this.red;
            boolean india3 = india2 | c0585q.india(sVar);
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (india3 || jade == asVar) {
                jade = new C1.av(snapshotStateList, obj4, sVar, 8);
                c0585q.f(jade);
            }
            C0564b.delta(aaVar, (Function1) jade, c0585q);
            bv.al alVar = sVar.delta;
            Intrinsics.charlie(aaVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            alVar.mike(obj4, ((ab) aaVar).alpha);
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new Object();
                c0585q.f(jade2);
            }
            this.silver.invoke((n) jade2, obj4, c0585q, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
