package Ie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public final class f extends Oe.j implements Oe.w {
    public final /* synthetic */ int purple;
    public int red;
    public Object silver;
    public int teal;

    public /* synthetic */ f(int i4) {
        this.purple = i4;
    }

    public static f mike() {
        f fVar = new f(1);
        fVar.silver = Collections.EMPTY_LIST;
        fVar.teal = -1;
        return fVar;
    }

    public final Object clone() {
        switch (this.purple) {
            case 0:
                f fVar = new f(0);
                fVar.silver = Collections.EMPTY_LIST;
                fVar.oscar(kilo());
                return fVar;
            case 1:
                f mike = mike();
                mike.papa(lima());
                return mike;
            default:
                f fVar2 = new f(2);
                fVar2.silver = C0184d.f1529i;
                fVar2.november(juliet());
                return fVar2;
        }
    }

    @Override // Oe.j
    public final Oe.v golf() {
        switch (this.purple) {
            case 0:
                g kilo = kilo();
                if (kilo.alpha()) {
                    return kilo;
                }
                throw new UninitializedMessageException(kilo);
            case 1:
                aw lima = lima();
                if (lima.alpha()) {
                    return lima;
                }
                throw new UninitializedMessageException(lima);
            default:
                C0185e juliet = juliet();
                if (juliet.alpha()) {
                    return juliet;
                }
                throw new UninitializedMessageException(juliet);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0062  */
    @Override // Oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Oe.j hotel(Oe.f fVar, Oe.h hVar) {
        switch (this.purple) {
            case 0:
                g gVar = null;
                try {
                    try {
                        oscar((g) g.f1539a.alpha(fVar, hVar));
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        g gVar2 = (g) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            gVar = gVar2;
                            if (gVar != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (gVar != null) {
                        oscar(gVar);
                    }
                    throw th;
                }
            case 1:
                aw awVar = null;
                try {
                    try {
                        aw.f1507a.getClass();
                        papa(new aw(fVar, hVar));
                        return this;
                    } catch (InvalidProtocolBufferException e4) {
                        aw awVar2 = (aw) e4.getUnfinishedMessage();
                        try {
                            throw e4;
                        } catch (Throwable th3) {
                            th = th3;
                            awVar = awVar2;
                            if (awVar != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (awVar != null) {
                        papa(awVar);
                    }
                    throw th;
                }
            default:
                C0185e c0185e = null;
                try {
                    try {
                        C0185e.f1538a.getClass();
                        november(new C0185e(fVar, hVar));
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        C0185e c0185e2 = (C0185e) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th5) {
                            th = th5;
                            c0185e = c0185e2;
                            if (c0185e != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (c0185e != null) {
                        november(c0185e);
                    }
                    throw th;
                }
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        switch (this.purple) {
            case 0:
                oscar((g) oVar);
                return this;
            case 1:
                papa((aw) oVar);
                return this;
            default:
                november((C0185e) oVar);
                return this;
        }
    }

    public C0185e juliet() {
        C0185e c0185e = new C0185e(this);
        int i4 = this.red;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        c0185e.red = this.teal;
        if ((i4 & 2) == 2) {
            i5 |= 2;
        }
        c0185e.silver = (C0184d) this.silver;
        c0185e.purple = i5;
        return c0185e;
    }

    public g kilo() {
        g gVar = new g(this);
        int i4 = this.red;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        gVar.red = this.teal;
        if ((i4 & 2) == 2) {
            this.silver = Collections.unmodifiableList((List) this.silver);
            this.red &= -3;
        }
        gVar.silver = (List) this.silver;
        gVar.purple = i5;
        return gVar;
    }

    public aw lima() {
        aw awVar = new aw(this);
        int i4 = this.red;
        int i5 = 1;
        if ((i4 & 1) == 1) {
            this.silver = Collections.unmodifiableList((List) this.silver);
            this.red &= -2;
        }
        awVar.red = (List) this.silver;
        if ((i4 & 2) != 2) {
            i5 = 0;
        }
        awVar.silver = this.teal;
        awVar.purple = i5;
        return awVar;
    }

    public void november(C0185e c0185e) {
        C0184d c0184d;
        if (c0185e == C0185e.yellow) {
            return;
        }
        int i4 = c0185e.purple;
        if ((i4 & 1) == 1) {
            int i5 = c0185e.red;
            this.red = 1 | this.red;
            this.teal = i5;
        }
        if ((i4 & 2) == 2) {
            C0184d c0184d2 = c0185e.silver;
            if ((this.red & 2) == 2 && (c0184d = (C0184d) this.silver) != C0184d.f1529i) {
                C0182b kilo = C0182b.kilo();
                kilo.lima(c0184d);
                kilo.lima(c0184d2);
                this.silver = kilo.juliet();
            } else {
                this.silver = c0184d2;
            }
            this.red |= 2;
        }
        this.alpha = this.alpha.bravo(c0185e.alpha);
    }

    public void oscar(g gVar) {
        if (gVar == g.yellow) {
            return;
        }
        if ((gVar.purple & 1) == 1) {
            int i4 = gVar.red;
            this.red = 1 | this.red;
            this.teal = i4;
        }
        if (!gVar.silver.isEmpty()) {
            if (((List) this.silver).isEmpty()) {
                this.silver = gVar.silver;
                this.red &= -3;
            } else {
                if ((this.red & 2) != 2) {
                    this.silver = new ArrayList((List) this.silver);
                    this.red |= 2;
                }
                ((List) this.silver).addAll(gVar.silver);
            }
        }
        this.alpha = this.alpha.bravo(gVar.alpha);
    }

    public void papa(aw awVar) {
        if (awVar == aw.yellow) {
            return;
        }
        if (!awVar.red.isEmpty()) {
            if (((List) this.silver).isEmpty()) {
                this.silver = awVar.red;
                this.red &= -2;
            } else {
                if ((this.red & 1) != 1) {
                    this.silver = new ArrayList((List) this.silver);
                    this.red |= 1;
                }
                ((List) this.silver).addAll(awVar.red);
            }
        }
        if ((awVar.purple & 1) == 1) {
            int i4 = awVar.silver;
            this.red |= 2;
            this.teal = i4;
        }
        this.alpha = this.alpha.bravo(awVar.alpha);
    }
}
