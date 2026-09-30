package Le;

import Oe.o;
import Oe.v;
import Oe.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class g extends Oe.j implements w {

    /* renamed from: a, reason: collision with root package name */
    public List f1843a;
    public int purple;
    public int red;
    public int silver;
    public Object teal;
    public h white;
    public List yellow;

    /* JADX WARN: Type inference failed for: r0v0, types: [Le.g, Oe.j] */
    public static g kilo() {
        ?? jVar = new Oe.j();
        jVar.red = 1;
        jVar.teal = "";
        jVar.white = h.NONE;
        List list = Collections.EMPTY_LIST;
        jVar.yellow = list;
        jVar.f1843a = list;
        return jVar;
    }

    public final Object clone() {
        g kilo = kilo();
        kilo.lima(juliet());
        return kilo;
    }

    @Override // Oe.j
    public final v golf() {
        i juliet = juliet();
        juliet.alpha();
        return juliet;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
    @Override // Oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Oe.j hotel(Oe.f fVar, Oe.h hVar) {
        i iVar = null;
        try {
            try {
                i.f1845g.getClass();
                lima(new i(fVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                i iVar2 = (i) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    iVar = iVar2;
                    if (iVar != null) {
                        lima(iVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (iVar != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(o oVar) {
        lima((i) oVar);
        return this;
    }

    public final i juliet() {
        i iVar = new i(this);
        int i4 = this.purple;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        iVar.red = this.red;
        if ((i4 & 2) == 2) {
            i5 |= 2;
        }
        iVar.silver = this.silver;
        if ((i4 & 4) == 4) {
            i5 |= 4;
        }
        iVar.teal = this.teal;
        if ((i4 & 8) == 8) {
            i5 |= 8;
        }
        iVar.white = this.white;
        if ((i4 & 16) == 16) {
            this.yellow = Collections.unmodifiableList(this.yellow);
            this.purple &= -17;
        }
        iVar.yellow = this.yellow;
        if ((this.purple & 32) == 32) {
            this.f1843a = Collections.unmodifiableList(this.f1843a);
            this.purple &= -33;
        }
        iVar.f1847b = this.f1843a;
        iVar.purple = i5;
        return iVar;
    }

    public final void lima(i iVar) {
        if (iVar == i.f1844f) {
            return;
        }
        int i4 = iVar.purple;
        if ((i4 & 1) == 1) {
            int i5 = iVar.red;
            this.purple = 1 | this.purple;
            this.red = i5;
        }
        if ((i4 & 2) == 2) {
            int i10 = iVar.silver;
            this.purple = 2 | this.purple;
            this.silver = i10;
        }
        if ((i4 & 4) == 4) {
            this.purple |= 4;
            this.teal = iVar.teal;
        }
        if ((i4 & 8) == 8) {
            h hVar = iVar.white;
            hVar.getClass();
            this.purple = 8 | this.purple;
            this.white = hVar;
        }
        if (!iVar.yellow.isEmpty()) {
            if (this.yellow.isEmpty()) {
                this.yellow = iVar.yellow;
                this.purple &= -17;
            } else {
                if ((this.purple & 16) != 16) {
                    this.yellow = new ArrayList(this.yellow);
                    this.purple |= 16;
                }
                this.yellow.addAll(iVar.yellow);
            }
        }
        if (!iVar.f1847b.isEmpty()) {
            if (this.f1843a.isEmpty()) {
                this.f1843a = iVar.f1847b;
                this.purple &= -33;
            } else {
                if ((this.purple & 32) != 32) {
                    this.f1843a = new ArrayList(this.f1843a);
                    this.purple |= 32;
                }
                this.f1843a.addAll(iVar.f1847b);
            }
        }
        this.alpha = this.alpha.bravo(iVar.alpha);
    }
}
