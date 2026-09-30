package kotlin.jvm.internal;

import ge.InterfaceC1771c;
import ge.InterfaceC1772d;
import ge.InterfaceC1779k;
import ge.InterfaceC1780l;

/* loaded from: classes2.dex */
public final class l extends m implements InterfaceC1780l {
    public l(InterfaceC1772d interfaceC1772d, String str, String str2) {
        super(c.NO_RECEIVER, ((d) interfaceC1772d).golf(), str, str2, !av.q.kilo(interfaceC1772d) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC1771c computeReflected() {
        return u.alpha.foxtrot(this);
    }

    @Override // ge.InterfaceC1780l
    public final void echo(Object obj, Object obj2) {
        ((je.r) charlie()).call(obj, obj2);
    }

    @Override // ge.u
    public final Object get(Object obj) {
        return ((je.r) bravo()).call(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // ge.v
    public final ge.t bravo() {
        return ((InterfaceC1780l) getReflected()).bravo();
    }

    @Override // ge.InterfaceC1781m
    public final InterfaceC1779k charlie() {
        return ((InterfaceC1780l) getReflected()).charlie();
    }

    public l(Class cls, String str, String str2, int i4) {
        super(c.NO_RECEIVER, cls, str, str2, i4);
    }
}
