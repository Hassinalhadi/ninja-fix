package Ie;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class az extends Oe.j implements Oe.w {

    /* renamed from: a, reason: collision with root package name */
    public B f1516a;
    public int purple;
    public int red;
    public int silver;
    public A teal;
    public int white;
    public int yellow;

    /* JADX WARN: Type inference failed for: r0v0, types: [Oe.j, Ie.az] */
    public static az kilo() {
        ?? jVar = new Oe.j();
        jVar.teal = A.ERROR;
        jVar.f1516a = B.LANGUAGE_VERSION;
        return jVar;
    }

    public final Object clone() {
        az kilo = kilo();
        kilo.lima(juliet());
        return kilo;
    }

    @Override // Oe.j
    public final Oe.v golf() {
        C juliet = juliet();
        juliet.alpha();
        return juliet;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
    @Override // Oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Oe.j hotel(Oe.f fVar, Oe.h hVar) {
        C c3 = null;
        try {
            try {
                C.e.getClass();
                lima(new C(fVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                C c4 = (C) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    c3 = c4;
                    if (c3 != null) {
                        lima(c3);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c3 != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        lima((C) oVar);
        return this;
    }

    public final C juliet() {
        C c3 = new C(this);
        int i4 = this.purple;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        c3.red = this.red;
        if ((i4 & 2) == 2) {
            i5 |= 2;
        }
        c3.silver = this.silver;
        if ((i4 & 4) == 4) {
            i5 |= 4;
        }
        c3.teal = this.teal;
        if ((i4 & 8) == 8) {
            i5 |= 8;
        }
        c3.white = this.white;
        if ((i4 & 16) == 16) {
            i5 |= 16;
        }
        c3.yellow = this.yellow;
        if ((i4 & 32) == 32) {
            i5 |= 32;
        }
        c3.f1420a = this.f1516a;
        c3.purple = i5;
        return c3;
    }

    public final void lima(C c3) {
        if (c3 == C.f1419d) {
            return;
        }
        int i4 = c3.purple;
        if ((i4 & 1) == 1) {
            int i5 = c3.red;
            this.purple = 1 | this.purple;
            this.red = i5;
        }
        if ((i4 & 2) == 2) {
            int i10 = c3.silver;
            this.purple = 2 | this.purple;
            this.silver = i10;
        }
        if ((i4 & 4) == 4) {
            A a6 = c3.teal;
            a6.getClass();
            this.purple = 4 | this.purple;
            this.teal = a6;
        }
        int i11 = c3.purple;
        if ((i11 & 8) == 8) {
            int i12 = c3.white;
            this.purple = 8 | this.purple;
            this.white = i12;
        }
        if ((i11 & 16) == 16) {
            int i13 = c3.yellow;
            this.purple = 16 | this.purple;
            this.yellow = i13;
        }
        if ((i11 & 32) == 32) {
            B b2 = c3.f1420a;
            b2.getClass();
            this.purple = 32 | this.purple;
            this.f1516a = b2;
        }
        this.alpha = this.alpha.bravo(c3.alpha);
    }
}
