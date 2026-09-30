package bx;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0571e0;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import bz.f0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2367C;
import s0.C2549i;
import s0.C2551k;
import s0.InterfaceC2552l;

/* renamed from: bx.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0768f extends Lambda implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0768f(int i4, Object obj) {
        super(3);
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.alpha) {
            case 0:
                AbstractC2367C victor = ((q0.ao) obj2).victor(((Q0.a) obj3).alpha);
                return ((q0.ar) obj).papa(victor.alpha, victor.purple, kotlin.collections.t.alpha, new B2.ap(20, victor, (ae) this.purple));
            case 1:
                ((Number) obj3).intValue();
                C0585q c0585q = (C0585q) ((InterfaceC0581m) obj2);
                c0585q.purple(955869654);
                c0585q.quebec(false);
                return (f0) this.purple;
            default:
                InterfaceC0581m interfaceC0581m = ((C0571e0) obj).alpha;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                ((Number) obj3).intValue();
                long j5 = ((C0585q) interfaceC0581m2).magenta;
                int i4 = (int) (j5 ^ (j5 >>> 32));
                T.s charlie = T.a.charlie((T.s) this.purple, interfaceC0581m2);
                C0585q c0585q2 = (C0585q) interfaceC0581m;
                c0585q2.red(509942095);
                InterfaceC2552l.maroon.getClass();
                C0564b.blue(C2551k.delta, c0585q2, charlie);
                C2549i c2549i = C2551k.golf;
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i4))) {
                    ao.ad.blue(i4, c0585q2, i4, c2549i);
                }
                c0585q2.quebec(false);
                return Unit.INSTANCE;
        }
    }
}
