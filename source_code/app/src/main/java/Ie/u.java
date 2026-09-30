package Ie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public final class u extends Oe.j implements Oe.w {

    /* renamed from: a, reason: collision with root package name */
    public List f1593a;

    /* renamed from: b, reason: collision with root package name */
    public List f1594b;
    public int purple;
    public int red;
    public int silver;
    public v teal;
    public aq white;
    public int yellow;

    /* JADX WARN: Type inference failed for: r0v0, types: [Ie.u, Oe.j] */
    public static u kilo() {
        ?? jVar = new Oe.j();
        jVar.teal = v.TRUE;
        jVar.white = aq.f1472m;
        List list = Collections.EMPTY_LIST;
        jVar.f1593a = list;
        jVar.f1594b = list;
        return jVar;
    }

    public final Object clone() {
        u kilo = kilo();
        kilo.lima(juliet());
        return kilo;
    }

    @Override // Oe.j
    public final Oe.v golf() {
        w juliet = juliet();
        if (juliet.alpha()) {
            return juliet;
        }
        throw new UninitializedMessageException(juliet);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
    @Override // Oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Oe.j hotel(Oe.f fVar, Oe.h hVar) {
        w wVar = null;
        try {
            try {
                w.f1595f.getClass();
                lima(new w(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                w wVar2 = (w) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    wVar = wVar2;
                    if (wVar != null) {
                        lima(wVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (wVar != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        lima((w) oVar);
        return this;
    }

    public final w juliet() {
        w wVar = new w(this);
        int i4 = this.purple;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        wVar.red = this.red;
        if ((i4 & 2) == 2) {
            i5 |= 2;
        }
        wVar.silver = this.silver;
        if ((i4 & 4) == 4) {
            i5 |= 4;
        }
        wVar.teal = this.teal;
        if ((i4 & 8) == 8) {
            i5 |= 8;
        }
        wVar.white = this.white;
        if ((i4 & 16) == 16) {
            i5 |= 16;
        }
        wVar.yellow = this.yellow;
        if ((i4 & 32) == 32) {
            this.f1593a = Collections.unmodifiableList(this.f1593a);
            this.purple &= -33;
        }
        wVar.f1596a = this.f1593a;
        if ((this.purple & 64) == 64) {
            this.f1594b = Collections.unmodifiableList(this.f1594b);
            this.purple &= -65;
        }
        wVar.f1597b = this.f1594b;
        wVar.purple = i5;
        return wVar;
    }

    public final void lima(w wVar) {
        aq aqVar;
        if (wVar == w.e) {
            return;
        }
        int i4 = wVar.purple;
        if ((i4 & 1) == 1) {
            int i5 = wVar.red;
            this.purple = 1 | this.purple;
            this.red = i5;
        }
        if ((i4 & 2) == 2) {
            int i10 = wVar.silver;
            this.purple = 2 | this.purple;
            this.silver = i10;
        }
        if ((i4 & 4) == 4) {
            v vVar = wVar.teal;
            vVar.getClass();
            this.purple = 4 | this.purple;
            this.teal = vVar;
        }
        if ((wVar.purple & 8) == 8) {
            aq aqVar2 = wVar.white;
            if ((this.purple & 8) == 8 && (aqVar = this.white) != aq.f1472m) {
                ap romeo = aq.romeo(aqVar);
                romeo.mike(aqVar2);
                this.white = romeo.kilo();
            } else {
                this.white = aqVar2;
            }
            this.purple |= 8;
        }
        if ((wVar.purple & 16) == 16) {
            int i11 = wVar.yellow;
            this.purple = 16 | this.purple;
            this.yellow = i11;
        }
        if (!wVar.f1596a.isEmpty()) {
            if (this.f1593a.isEmpty()) {
                this.f1593a = wVar.f1596a;
                this.purple &= -33;
            } else {
                if ((this.purple & 32) != 32) {
                    this.f1593a = new ArrayList(this.f1593a);
                    this.purple |= 32;
                }
                this.f1593a.addAll(wVar.f1596a);
            }
        }
        if (!wVar.f1597b.isEmpty()) {
            if (this.f1594b.isEmpty()) {
                this.f1594b = wVar.f1597b;
                this.purple &= -65;
            } else {
                if ((this.purple & 64) != 64) {
                    this.f1594b = new ArrayList(this.f1594b);
                    this.purple |= 64;
                }
                this.f1594b.addAll(wVar.f1597b);
            }
        }
        this.alpha = this.alpha.bravo(wVar.alpha);
    }
}
