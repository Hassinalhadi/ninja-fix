package Ie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class w extends Oe.o implements Oe.w {
    public static final w e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0181a f1595f = new C0181a(8);

    /* renamed from: a, reason: collision with root package name */
    public List f1596a;
    public final Oe.e alpha;

    /* renamed from: b, reason: collision with root package name */
    public List f1597b;

    /* renamed from: c, reason: collision with root package name */
    public byte f1598c;

    /* renamed from: d, reason: collision with root package name */
    public int f1599d;
    public int purple;
    public int red;
    public int silver;
    public v teal;
    public aq white;
    public int yellow;

    static {
        w wVar = new w();
        e = wVar;
        wVar.red = 0;
        wVar.silver = 0;
        wVar.teal = v.TRUE;
        wVar.white = aq.f1472m;
        wVar.yellow = 0;
        List list = Collections.EMPTY_LIST;
        wVar.f1596a = list;
        wVar.f1597b = list;
    }

    public w() {
        this.f1598c = (byte) -1;
        this.f1599d = -1;
        this.alpha = Oe.e.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        byte b2 = this.f1598c;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.purple & 8) == 8 && !this.white.alpha()) {
            this.f1598c = (byte) 0;
            return false;
        }
        for (int i4 = 0; i4 < this.f1596a.size(); i4++) {
            if (!((w) this.f1596a.get(i4)).alpha()) {
                this.f1598c = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.f1597b.size(); i5++) {
            if (!((w) this.f1597b.get(i5)).alpha()) {
                this.f1598c = (byte) 0;
                return false;
            }
        }
        this.f1598c = (byte) 1;
        return true;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        u kilo = u.kilo();
        kilo.lima(this);
        return kilo;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        int i5 = this.f1599d;
        if (i5 != -1) {
            return i5;
        }
        if ((this.purple & 1) == 1) {
            i4 = F0.e.charlie(1, this.red);
        } else {
            i4 = 0;
        }
        if ((this.purple & 2) == 2) {
            i4 += F0.e.charlie(2, this.silver);
        }
        if ((this.purple & 4) == 4) {
            i4 += F0.e.bravo(3, this.teal.alpha);
        }
        if ((this.purple & 8) == 8) {
            i4 += F0.e.echo(4, this.white);
        }
        if ((this.purple & 16) == 16) {
            i4 += F0.e.charlie(5, this.yellow);
        }
        for (int i10 = 0; i10 < this.f1596a.size(); i10++) {
            i4 += F0.e.echo(6, (Oe.v) this.f1596a.get(i10));
        }
        for (int i11 = 0; i11 < this.f1597b.size(); i11++) {
            i4 += F0.e.echo(7, (Oe.v) this.f1597b.get(i11));
        }
        int size = this.alpha.size() + i4;
        this.f1599d = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        if ((this.purple & 1) == 1) {
            eVar.xray(1, this.red);
        }
        if ((this.purple & 2) == 2) {
            eVar.xray(2, this.silver);
        }
        if ((this.purple & 4) == 4) {
            eVar.whiskey(3, this.teal.alpha);
        }
        if ((this.purple & 8) == 8) {
            eVar.zulu(4, this.white);
        }
        if ((this.purple & 16) == 16) {
            eVar.xray(5, this.yellow);
        }
        for (int i4 = 0; i4 < this.f1596a.size(); i4++) {
            eVar.zulu(6, (Oe.v) this.f1596a.get(i4));
        }
        for (int i5 = 0; i5 < this.f1597b.size(); i5++) {
            eVar.zulu(7, (Oe.v) this.f1597b.get(i5));
        }
        eVar.beige(this.alpha);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return u.kilo();
    }

    public w(u uVar) {
        this.f1598c = (byte) -1;
        this.f1599d = -1;
        this.alpha = uVar.alpha;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public w(Oe.f fVar, Oe.h hVar) {
        v vVar;
        this.f1598c = (byte) -1;
        this.f1599d = -1;
        boolean z2 = false;
        this.red = 0;
        this.silver = 0;
        v vVar2 = v.TRUE;
        this.teal = vVar2;
        this.white = aq.f1472m;
        this.yellow = 0;
        List list = Collections.EMPTY_LIST;
        this.f1596a = list;
        this.f1597b = list;
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        char c3 = 0;
        while (!z2) {
            try {
                try {
                    int mike = fVar.mike();
                    if (mike != 0) {
                        if (mike == 8) {
                            this.purple |= 1;
                            this.red = fVar.juliet();
                        } else if (mike != 16) {
                            ap apVar = null;
                            v vVar3 = null;
                            if (mike == 24) {
                                int juliet = fVar.juliet();
                                if (juliet != 0) {
                                    if (juliet == 1) {
                                        vVar3 = v.FALSE;
                                    } else if (juliet == 2) {
                                        vVar3 = v.NULL;
                                    }
                                    vVar = vVar3;
                                } else {
                                    vVar = vVar2;
                                }
                                if (vVar == null) {
                                    romeo.coral(mike);
                                    romeo.coral(juliet);
                                } else {
                                    this.purple |= 4;
                                    this.teal = vVar;
                                }
                            } else if (mike == 34) {
                                if ((this.purple & 8) == 8) {
                                    aq aqVar = this.white;
                                    aqVar.getClass();
                                    apVar = aq.romeo(aqVar);
                                }
                                ap apVar2 = apVar;
                                aq aqVar2 = (aq) fVar.foxtrot(aq.f1473n, hVar);
                                this.white = aqVar2;
                                if (apVar2 != null) {
                                    apVar2.mike(aqVar2);
                                    this.white = apVar2.kilo();
                                }
                                this.purple |= 8;
                            } else if (mike != 40) {
                                C0181a c0181a = f1595f;
                                if (mike == 50) {
                                    int i4 = (c3 == true ? 1 : 0) & 32;
                                    c3 = c3;
                                    if (i4 != 32) {
                                        this.f1596a = new ArrayList();
                                        c3 = (c3 == true ? 1 : 0) | ' ';
                                    }
                                    this.f1596a.add(fVar.foxtrot(c0181a, hVar));
                                } else if (mike != 58) {
                                    if (!fVar.papa(mike, romeo)) {
                                    }
                                } else {
                                    int i5 = (c3 == true ? 1 : 0) & 64;
                                    c3 = c3;
                                    if (i5 != 64) {
                                        this.f1597b = new ArrayList();
                                        c3 = (c3 == true ? 1 : 0) | '@';
                                    }
                                    this.f1597b.add(fVar.foxtrot(c0181a, hVar));
                                }
                            } else {
                                this.purple |= 16;
                                this.yellow = fVar.juliet();
                            }
                        } else {
                            this.purple |= 2;
                            this.silver = fVar.juliet();
                        }
                    }
                    z2 = true;
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(this);
                } catch (IOException e5) {
                    throw new InvalidProtocolBufferException(e5.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (((c3 == true ? 1 : 0) & 32) == 32) {
                    this.f1596a = Collections.unmodifiableList(this.f1596a);
                }
                if (((c3 == true ? 1 : 0) & 64) == 64) {
                    this.f1597b = Collections.unmodifiableList(this.f1597b);
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
        if (((c3 == true ? 1 : 0) & 32) == 32) {
            this.f1596a = Collections.unmodifiableList(this.f1596a);
        }
        if (((c3 == true ? 1 : 0) & 64) == 64) {
            this.f1597b = Collections.unmodifiableList(this.f1597b);
        }
        try {
            romeo.juliet();
        } catch (IOException unused2) {
        } finally {
            this.alpha = dVar.foxtrot();
        }
    }
}
