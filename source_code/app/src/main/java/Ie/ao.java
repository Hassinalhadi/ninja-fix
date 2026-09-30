package Ie;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class ao extends Oe.o implements Oe.w {

    /* renamed from: a, reason: collision with root package name */
    public static final ao f1460a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0181a f1461b = new C0181a(17);
    public final Oe.e alpha;
    public int purple;
    public an red;
    public aq silver;
    public int teal;
    public byte white;
    public int yellow;

    static {
        ao aoVar = new ao();
        f1460a = aoVar;
        aoVar.red = an.INV;
        aoVar.silver = aq.f1472m;
        aoVar.teal = 0;
    }

    public ao() {
        this.white = (byte) -1;
        this.yellow = -1;
        this.alpha = Oe.e.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        byte b2 = this.white;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.purple & 2) == 2 && !this.silver.alpha()) {
            this.white = (byte) 0;
            return false;
        }
        this.white = (byte) 1;
        return true;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        am kilo = am.kilo();
        kilo.lima(this);
        return kilo;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        int i5 = this.yellow;
        if (i5 != -1) {
            return i5;
        }
        if ((this.purple & 1) == 1) {
            i4 = F0.e.bravo(1, this.red.alpha);
        } else {
            i4 = 0;
        }
        if ((this.purple & 2) == 2) {
            i4 += F0.e.echo(2, this.silver);
        }
        if ((this.purple & 4) == 4) {
            i4 += F0.e.charlie(3, this.teal);
        }
        int size = this.alpha.size() + i4;
        this.yellow = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        if ((this.purple & 1) == 1) {
            eVar.whiskey(1, this.red.alpha);
        }
        if ((this.purple & 2) == 2) {
            eVar.zulu(2, this.silver);
        }
        if ((this.purple & 4) == 4) {
            eVar.xray(3, this.teal);
        }
        eVar.beige(this.alpha);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return am.kilo();
    }

    public ao(am amVar) {
        this.white = (byte) -1;
        this.yellow = -1;
        this.alpha = amVar.alpha;
    }

    public ao(Oe.f fVar, Oe.h hVar) {
        this.white = (byte) -1;
        this.yellow = -1;
        an anVar = an.INV;
        this.red = anVar;
        this.silver = aq.f1472m;
        boolean z2 = false;
        this.teal = 0;
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        while (!z2) {
            try {
                try {
                    try {
                        int mike = fVar.mike();
                        if (mike != 0) {
                            ap apVar = null;
                            an anVar2 = null;
                            if (mike == 8) {
                                int juliet = fVar.juliet();
                                if (juliet == 0) {
                                    anVar2 = an.IN;
                                } else if (juliet == 1) {
                                    anVar2 = an.OUT;
                                } else if (juliet == 2) {
                                    anVar2 = anVar;
                                } else if (juliet == 3) {
                                    anVar2 = an.STAR;
                                }
                                if (anVar2 == null) {
                                    romeo.coral(mike);
                                    romeo.coral(juliet);
                                } else {
                                    this.purple |= 1;
                                    this.red = anVar2;
                                }
                            } else if (mike == 18) {
                                if ((this.purple & 2) == 2) {
                                    aq aqVar = this.silver;
                                    aqVar.getClass();
                                    apVar = aq.romeo(aqVar);
                                }
                                aq aqVar2 = (aq) fVar.foxtrot(aq.f1473n, hVar);
                                this.silver = aqVar2;
                                if (apVar != null) {
                                    apVar.mike(aqVar2);
                                    this.silver = apVar.kilo();
                                }
                                this.purple |= 2;
                            } else if (mike != 24) {
                                if (!fVar.papa(mike, romeo)) {
                                }
                            } else {
                                this.purple |= 4;
                                this.teal = fVar.juliet();
                            }
                        }
                        z2 = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    }
                } catch (IOException e4) {
                    throw new InvalidProtocolBufferException(e4.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                try {
                    romeo.juliet();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    throw th2;
                }
                throw th;
            }
        }
        try {
            romeo.juliet();
        } catch (IOException unused2) {
        } finally {
            this.alpha = dVar.foxtrot();
        }
    }
}
