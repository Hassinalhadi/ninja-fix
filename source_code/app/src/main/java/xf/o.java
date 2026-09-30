package xf;

import kotlin.Unit;
import s2.InterfaceC2596d;
import vf.j0;

/* loaded from: classes2.dex */
public final class o extends e {

    /* renamed from: d, reason: collision with root package name */
    public final EnumC3340a f14135d;

    public o(int i4, EnumC3340a enumC3340a) {
        super(i4);
        this.f14135d = enumC3340a;
        if (enumC3340a != EnumC3340a.alpha) {
            if (i4 >= 1) {
            } else {
                throw new IllegalArgumentException(av.q.delta(i4, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.u.alpha.bravo(e.class).kilo() + " instead").toString());
        }
    }

    @Override // xf.e, xf.u
    public final Object bravo(Nd.c cVar, Object obj) {
        Object fuchsia = fuchsia(obj, true);
        if (!(fuchsia instanceof j)) {
            return Unit.INSTANCE;
        }
        boolean z2 = ((k) fuchsia) instanceof j;
        throw sierra();
    }

    public final Object fuchsia(Object obj, boolean z2) {
        m mVar;
        o oVar;
        Object obj2;
        j0 j0Var;
        if (this.f14135d == EnumC3340a.red) {
            Object mike = super.mike(obj);
            if ((mike instanceof k) && !(mike instanceof j)) {
                return Unit.INSTANCE;
            }
            return mike;
        }
        InterfaceC2596d interfaceC2596d = g.delta;
        m mVar2 = (m) e.white.get(this);
        while (true) {
            long andIncrement = e.purple.getAndIncrement(this);
            long j5 = andIncrement & 1152921504606846975L;
            boolean victor = victor(andIncrement, false);
            int i4 = g.bravo;
            long j6 = i4;
            long j7 = j5 / j6;
            int i5 = (int) (j5 % j6);
            if (mVar2.charlie != j7) {
                m charlie = e.charlie(this, j7, mVar2);
                if (charlie == null) {
                    if (victor) {
                        return new j(sierra());
                    }
                } else {
                    mVar = charlie;
                    obj2 = obj;
                    oVar = this;
                }
            } else {
                mVar = mVar2;
                oVar = this;
                obj2 = obj;
            }
            int echo = e.echo(oVar, mVar, i5, obj2, j5, interfaceC2596d, victor);
            mVar2 = mVar;
            if (echo != 0) {
                if (echo != 1) {
                    if (echo != 2) {
                        if (echo != 3) {
                            if (echo != 4) {
                                if (echo == 5) {
                                    mVar2.bravo();
                                }
                                obj = obj2;
                            } else {
                                if (j5 < e.red.get(this)) {
                                    mVar2.bravo();
                                }
                                return new j(sierra());
                            }
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    } else {
                        if (victor) {
                            mVar2.india();
                            return new j(sierra());
                        }
                        if (interfaceC2596d instanceof j0) {
                            j0Var = (j0) interfaceC2596d;
                        } else {
                            j0Var = null;
                        }
                        if (j0Var != null) {
                            j0Var.alpha(mVar2, i5 + i4);
                        }
                        lima((mVar2.charlie * j6) + i5);
                        return Unit.INSTANCE;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            } else {
                mVar2.bravo();
                return Unit.INSTANCE;
            }
        }
    }

    @Override // xf.e, xf.u
    public final Object mike(Object obj) {
        return fuchsia(obj, false);
    }

    @Override // xf.e
    public final boolean yankee() {
        if (this.f14135d == EnumC3340a.purple) {
            return true;
        }
        return false;
    }
}
