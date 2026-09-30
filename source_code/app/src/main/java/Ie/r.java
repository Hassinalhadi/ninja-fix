package Ie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class r extends Oe.o implements Oe.w {

    /* renamed from: b, reason: collision with root package name */
    public static final r f1589b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0181a f1590c = new C0181a(6);

    /* renamed from: a, reason: collision with root package name */
    public int f1591a;
    public final Oe.e alpha;
    public int purple;
    public p red;
    public List silver;
    public w teal;
    public q white;
    public byte yellow;

    static {
        r rVar = new r();
        f1589b = rVar;
        rVar.red = p.RETURNS_CONSTANT;
        rVar.silver = Collections.EMPTY_LIST;
        rVar.teal = w.e;
        rVar.white = q.AT_MOST_ONCE;
    }

    public r() {
        this.yellow = (byte) -1;
        this.f1591a = -1;
        this.alpha = Oe.e.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        byte b2 = this.yellow;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i4 = 0; i4 < this.silver.size(); i4++) {
            if (!((w) this.silver.get(i4)).alpha()) {
                this.yellow = (byte) 0;
                return false;
            }
        }
        if ((this.purple & 2) == 2 && !this.teal.alpha()) {
            this.yellow = (byte) 0;
            return false;
        }
        this.yellow = (byte) 1;
        return true;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        o kilo = o.kilo();
        kilo.lima(this);
        return kilo;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        int i5 = this.f1591a;
        if (i5 != -1) {
            return i5;
        }
        if ((this.purple & 1) == 1) {
            i4 = F0.e.bravo(1, this.red.alpha);
        } else {
            i4 = 0;
        }
        for (int i10 = 0; i10 < this.silver.size(); i10++) {
            i4 += F0.e.echo(2, (Oe.v) this.silver.get(i10));
        }
        if ((this.purple & 2) == 2) {
            i4 += F0.e.echo(3, this.teal);
        }
        if ((this.purple & 4) == 4) {
            i4 += F0.e.bravo(4, this.white.alpha);
        }
        int size = this.alpha.size() + i4;
        this.f1591a = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        if ((this.purple & 1) == 1) {
            eVar.whiskey(1, this.red.alpha);
        }
        for (int i4 = 0; i4 < this.silver.size(); i4++) {
            eVar.zulu(2, (Oe.v) this.silver.get(i4));
        }
        if ((this.purple & 2) == 2) {
            eVar.zulu(3, this.teal);
        }
        if ((this.purple & 4) == 4) {
            eVar.whiskey(4, this.white.alpha);
        }
        eVar.beige(this.alpha);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return o.kilo();
    }

    public r(o oVar) {
        this.yellow = (byte) -1;
        this.f1591a = -1;
        this.alpha = oVar.alpha;
    }

    public r(Oe.f fVar, Oe.h hVar) {
        this.yellow = (byte) -1;
        this.f1591a = -1;
        p pVar = p.RETURNS_CONSTANT;
        this.red = pVar;
        this.silver = Collections.EMPTY_LIST;
        this.teal = w.e;
        q qVar = q.AT_MOST_ONCE;
        this.white = qVar;
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        boolean z2 = false;
        char c3 = 0;
        while (!z2) {
            try {
                try {
                    int mike = fVar.mike();
                    if (mike != 0) {
                        q qVar2 = null;
                        p pVar2 = null;
                        u uVar = null;
                        if (mike == 8) {
                            int juliet = fVar.juliet();
                            if (juliet == 0) {
                                pVar2 = pVar;
                            } else if (juliet == 1) {
                                pVar2 = p.CALLS;
                            } else if (juliet == 2) {
                                pVar2 = p.RETURNS_NOT_NULL;
                            }
                            if (pVar2 == null) {
                                romeo.coral(mike);
                                romeo.coral(juliet);
                            } else {
                                this.purple |= 1;
                                this.red = pVar2;
                            }
                        } else if (mike == 18) {
                            int i4 = (c3 == true ? 1 : 0) & 2;
                            c3 = c3;
                            if (i4 != 2) {
                                this.silver = new ArrayList();
                                c3 = 2;
                            }
                            this.silver.add(fVar.foxtrot(w.f1595f, hVar));
                        } else if (mike == 26) {
                            if ((this.purple & 2) == 2) {
                                w wVar = this.teal;
                                wVar.getClass();
                                uVar = u.kilo();
                                uVar.lima(wVar);
                            }
                            w wVar2 = (w) fVar.foxtrot(w.f1595f, hVar);
                            this.teal = wVar2;
                            if (uVar != null) {
                                uVar.lima(wVar2);
                                this.teal = uVar.juliet();
                            }
                            this.purple |= 2;
                        } else if (mike != 32) {
                            if (!fVar.papa(mike, romeo)) {
                            }
                        } else {
                            int juliet2 = fVar.juliet();
                            if (juliet2 == 0) {
                                qVar2 = qVar;
                            } else if (juliet2 == 1) {
                                qVar2 = q.EXACTLY_ONCE;
                            } else if (juliet2 == 2) {
                                qVar2 = q.AT_LEAST_ONCE;
                            }
                            if (qVar2 == null) {
                                romeo.coral(mike);
                                romeo.coral(juliet2);
                            } else {
                                this.purple |= 4;
                                this.white = qVar2;
                            }
                        }
                    }
                    z2 = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e4) {
                    throw new InvalidProtocolBufferException(e4.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (((c3 == true ? 1 : 0) & 2) == 2) {
                    this.silver = Collections.unmodifiableList(this.silver);
                }
                try {
                    romeo.juliet();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    throw th2;
                }
                throw th;
            }
        }
        if (((c3 == true ? 1 : 0) & 2) == 2) {
            this.silver = Collections.unmodifiableList(this.silver);
        }
        try {
            romeo.juliet();
        } catch (IOException unused2) {
        } finally {
            this.alpha = dVar.foxtrot();
        }
    }
}
