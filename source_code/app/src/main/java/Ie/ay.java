package Ie;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class ay extends Oe.l {
    public static final ay e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0181a f1511f = new C0181a(21);

    /* renamed from: a, reason: collision with root package name */
    public aq f1512a;

    /* renamed from: b, reason: collision with root package name */
    public int f1513b;

    /* renamed from: c, reason: collision with root package name */
    public byte f1514c;

    /* renamed from: d, reason: collision with root package name */
    public int f1515d;
    public final Oe.e purple;
    public int red;
    public int silver;
    public int teal;
    public aq white;
    public int yellow;

    static {
        ay ayVar = new ay();
        e = ayVar;
        ayVar.silver = 0;
        ayVar.teal = 0;
        aq aqVar = aq.f1472m;
        ayVar.white = aqVar;
        ayVar.yellow = 0;
        ayVar.f1512a = aqVar;
        ayVar.f1513b = 0;
    }

    public ay(ax axVar) {
        super(axVar);
        this.f1514c = (byte) -1;
        this.f1515d = -1;
        this.purple = axVar.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        byte b2 = this.f1514c;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i4 = this.red;
        if ((i4 & 2) == 2) {
            if ((i4 & 4) == 4 && !this.white.alpha()) {
                this.f1514c = (byte) 0;
                return false;
            }
            if ((this.red & 16) == 16 && !this.f1512a.alpha()) {
                this.f1514c = (byte) 0;
                return false;
            }
            if (!india()) {
                this.f1514c = (byte) 0;
                return false;
            }
            this.f1514c = (byte) 1;
            return true;
        }
        this.f1514c = (byte) 0;
        return false;
    }

    @Override // Oe.w
    public final Oe.v bravo() {
        return e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Oe.k, Oe.j, Ie.ax] */
    @Override // Oe.v
    public final Oe.j charlie() {
        ?? kVar = new Oe.k();
        aq aqVar = aq.f1472m;
        kVar.yellow = aqVar;
        kVar.f1509b = aqVar;
        kVar.lima(this);
        return kVar;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        int i5 = this.f1515d;
        if (i5 != -1) {
            return i5;
        }
        if ((this.red & 1) == 1) {
            i4 = F0.e.charlie(1, this.silver);
        } else {
            i4 = 0;
        }
        if ((this.red & 2) == 2) {
            i4 += F0.e.charlie(2, this.teal);
        }
        if ((this.red & 4) == 4) {
            i4 += F0.e.echo(3, this.white);
        }
        if ((this.red & 16) == 16) {
            i4 += F0.e.echo(4, this.f1512a);
        }
        if ((this.red & 8) == 8) {
            i4 += F0.e.charlie(5, this.yellow);
        }
        if ((this.red & 32) == 32) {
            i4 += F0.e.charlie(6, this.f1513b);
        }
        int size = this.purple.size() + juliet() + i4;
        this.f1515d = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        w.o oVar = new w.o(this);
        if ((this.red & 1) == 1) {
            eVar.xray(1, this.silver);
        }
        if ((this.red & 2) == 2) {
            eVar.xray(2, this.teal);
        }
        if ((this.red & 4) == 4) {
            eVar.zulu(3, this.white);
        }
        if ((this.red & 16) == 16) {
            eVar.zulu(4, this.f1512a);
        }
        if ((this.red & 8) == 8) {
            eVar.xray(5, this.yellow);
        }
        if ((this.red & 32) == 32) {
            eVar.xray(6, this.f1513b);
        }
        oVar.beige(200, eVar);
        eVar.beige(this.purple);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Oe.k, Oe.j, Ie.ax] */
    @Override // Oe.v
    public final Oe.j foxtrot() {
        ?? kVar = new Oe.k();
        aq aqVar = aq.f1472m;
        kVar.yellow = aqVar;
        kVar.f1509b = aqVar;
        return kVar;
    }

    public ay() {
        this.f1514c = (byte) -1;
        this.f1515d = -1;
        this.purple = Oe.e.alpha;
    }

    public ay(Oe.f fVar, Oe.h hVar) {
        this.f1514c = (byte) -1;
        this.f1515d = -1;
        boolean z2 = false;
        this.silver = 0;
        this.teal = 0;
        aq aqVar = aq.f1472m;
        this.white = aqVar;
        this.yellow = 0;
        this.f1512a = aqVar;
        this.f1513b = 0;
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        while (!z2) {
            try {
                try {
                    int mike = fVar.mike();
                    if (mike != 0) {
                        if (mike == 8) {
                            this.red |= 1;
                            this.silver = fVar.juliet();
                        } else if (mike != 16) {
                            ap apVar = null;
                            if (mike == 26) {
                                if ((this.red & 4) == 4) {
                                    aq aqVar2 = this.white;
                                    aqVar2.getClass();
                                    apVar = aq.romeo(aqVar2);
                                }
                                aq aqVar3 = (aq) fVar.foxtrot(aq.f1473n, hVar);
                                this.white = aqVar3;
                                if (apVar != null) {
                                    apVar.mike(aqVar3);
                                    this.white = apVar.kilo();
                                }
                                this.red |= 4;
                            } else if (mike == 34) {
                                if ((this.red & 16) == 16) {
                                    aq aqVar4 = this.f1512a;
                                    aqVar4.getClass();
                                    apVar = aq.romeo(aqVar4);
                                }
                                aq aqVar5 = (aq) fVar.foxtrot(aq.f1473n, hVar);
                                this.f1512a = aqVar5;
                                if (apVar != null) {
                                    apVar.mike(aqVar5);
                                    this.f1512a = apVar.kilo();
                                }
                                this.red |= 16;
                            } else if (mike == 40) {
                                this.red |= 8;
                                this.yellow = fVar.juliet();
                            } else if (mike != 48) {
                                if (!november(fVar, romeo, hVar, mike)) {
                                }
                            } else {
                                this.red |= 32;
                                this.f1513b = fVar.juliet();
                            }
                        } else {
                            this.red |= 2;
                            this.teal = fVar.juliet();
                        }
                    }
                    z2 = true;
                } catch (Throwable th) {
                    try {
                        romeo.juliet();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.purple = dVar.foxtrot();
                        throw th2;
                    }
                    this.purple = dVar.foxtrot();
                    mike();
                    throw th;
                }
            } catch (InvalidProtocolBufferException e4) {
                throw e4.setUnfinishedMessage(this);
            } catch (IOException e5) {
                throw new InvalidProtocolBufferException(e5.getMessage()).setUnfinishedMessage(this);
            }
        }
        try {
            romeo.juliet();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.purple = dVar.foxtrot();
            throw th3;
        }
        this.purple = dVar.foxtrot();
        mike();
    }
}
