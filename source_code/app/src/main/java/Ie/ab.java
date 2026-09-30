package Ie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public final class ab extends Oe.k {

    /* renamed from: a, reason: collision with root package name */
    public aw f1423a;

    /* renamed from: b, reason: collision with root package name */
    public D f1424b;
    public int silver;
    public List teal;
    public List white;
    public List yellow;

    /* JADX WARN: Type inference failed for: r0v0, types: [Ie.ab, Oe.k] */
    public static ab lima() {
        ?? kVar = new Oe.k();
        List list = Collections.EMPTY_LIST;
        kVar.teal = list;
        kVar.white = list;
        kVar.yellow = list;
        kVar.f1423a = aw.yellow;
        kVar.f1424b = D.teal;
        return kVar;
    }

    public final Object clone() {
        ab lima = lima();
        lima.mike(kilo());
        return lima;
    }

    @Override // Oe.j
    public final Oe.v golf() {
        ac kilo = kilo();
        if (kilo.alpha()) {
            return kilo;
        }
        throw new UninitializedMessageException(kilo);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
    @Override // Oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Oe.j hotel(Oe.f fVar, Oe.h hVar) {
        ac acVar = null;
        try {
            try {
                ac.e.getClass();
                mike(new ac(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ac acVar2 = (ac) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    acVar = acVar2;
                    if (acVar != null) {
                        mike(acVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (acVar != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        mike((ac) oVar);
        return this;
    }

    public final ac kilo() {
        ac acVar = new ac(this);
        int i4 = this.silver;
        int i5 = 1;
        if ((i4 & 1) == 1) {
            this.teal = Collections.unmodifiableList(this.teal);
            this.silver &= -2;
        }
        acVar.silver = this.teal;
        if ((this.silver & 2) == 2) {
            this.white = Collections.unmodifiableList(this.white);
            this.silver &= -3;
        }
        acVar.teal = this.white;
        if ((this.silver & 4) == 4) {
            this.yellow = Collections.unmodifiableList(this.yellow);
            this.silver &= -5;
        }
        acVar.white = this.yellow;
        if ((i4 & 8) != 8) {
            i5 = 0;
        }
        acVar.yellow = this.f1423a;
        if ((i4 & 16) == 16) {
            i5 |= 2;
        }
        acVar.f1426a = this.f1424b;
        acVar.red = i5;
        return acVar;
    }

    public final void mike(ac acVar) {
        D d4;
        aw awVar;
        if (acVar == ac.f1425d) {
            return;
        }
        if (!acVar.silver.isEmpty()) {
            if (this.teal.isEmpty()) {
                this.teal = acVar.silver;
                this.silver &= -2;
            } else {
                if ((this.silver & 1) != 1) {
                    this.teal = new ArrayList(this.teal);
                    this.silver |= 1;
                }
                this.teal.addAll(acVar.silver);
            }
        }
        if (!acVar.teal.isEmpty()) {
            if (this.white.isEmpty()) {
                this.white = acVar.teal;
                this.silver &= -3;
            } else {
                if ((this.silver & 2) != 2) {
                    this.white = new ArrayList(this.white);
                    this.silver |= 2;
                }
                this.white.addAll(acVar.teal);
            }
        }
        if (!acVar.white.isEmpty()) {
            if (this.yellow.isEmpty()) {
                this.yellow = acVar.white;
                this.silver &= -5;
            } else {
                if ((this.silver & 4) != 4) {
                    this.yellow = new ArrayList(this.yellow);
                    this.silver |= 4;
                }
                this.yellow.addAll(acVar.white);
            }
        }
        if ((acVar.red & 1) == 1) {
            aw awVar2 = acVar.yellow;
            if ((this.silver & 8) == 8 && (awVar = this.f1423a) != aw.yellow) {
                f india = aw.india(awVar);
                india.papa(awVar2);
                this.f1423a = india.lima();
            } else {
                this.f1423a = awVar2;
            }
            this.silver |= 8;
        }
        if ((acVar.red & 2) == 2) {
            D d9 = acVar.f1426a;
            if ((this.silver & 16) == 16 && (d4 = this.f1424b) != D.teal) {
                m mVar = new m(2);
                mVar.silver = Collections.EMPTY_LIST;
                mVar.quebec(d4);
                mVar.quebec(d9);
                this.f1424b = mVar.mike();
            } else {
                this.f1424b = d9;
            }
            this.silver |= 16;
        }
        juliet(acVar);
        this.alpha = this.alpha.bravo(acVar.purple);
    }
}
