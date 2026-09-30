package Ie;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class C extends Oe.o implements Oe.w {

    /* renamed from: d, reason: collision with root package name */
    public static final C f1419d;
    public static final C0181a e = new C0181a(22);

    /* renamed from: a, reason: collision with root package name */
    public B f1420a;
    public final Oe.e alpha;

    /* renamed from: b, reason: collision with root package name */
    public byte f1421b;

    /* renamed from: c, reason: collision with root package name */
    public int f1422c;
    public int purple;
    public int red;
    public int silver;
    public A teal;
    public int white;
    public int yellow;

    static {
        C c3 = new C();
        f1419d = c3;
        c3.red = 0;
        c3.silver = 0;
        c3.teal = A.ERROR;
        c3.white = 0;
        c3.yellow = 0;
        c3.f1420a = B.LANGUAGE_VERSION;
    }

    public C() {
        this.f1421b = (byte) -1;
        this.f1422c = -1;
        this.alpha = Oe.e.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        if (this.f1421b == 1) {
            return true;
        }
        this.f1421b = (byte) 1;
        return true;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        az kilo = az.kilo();
        kilo.lima(this);
        return kilo;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        int i5 = this.f1422c;
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
            i4 += F0.e.charlie(4, this.white);
        }
        if ((this.purple & 16) == 16) {
            i4 += F0.e.charlie(5, this.yellow);
        }
        if ((this.purple & 32) == 32) {
            i4 += F0.e.bravo(6, this.f1420a.alpha);
        }
        int size = this.alpha.size() + i4;
        this.f1422c = size;
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
            eVar.xray(4, this.white);
        }
        if ((this.purple & 16) == 16) {
            eVar.xray(5, this.yellow);
        }
        if ((this.purple & 32) == 32) {
            eVar.whiskey(6, this.f1420a.alpha);
        }
        eVar.beige(this.alpha);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return az.kilo();
    }

    public C(az azVar) {
        this.f1421b = (byte) -1;
        this.f1422c = -1;
        this.alpha = azVar.alpha;
    }

    public C(Oe.f fVar) {
        this.f1421b = (byte) -1;
        this.f1422c = -1;
        boolean z2 = false;
        this.red = 0;
        this.silver = 0;
        A a6 = A.ERROR;
        this.teal = a6;
        this.white = 0;
        this.yellow = 0;
        B b2 = B.LANGUAGE_VERSION;
        this.f1420a = b2;
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        while (!z2) {
            try {
                try {
                    try {
                        int mike = fVar.mike();
                        if (mike != 0) {
                            if (mike == 8) {
                                this.purple |= 1;
                                this.red = fVar.juliet();
                            } else if (mike != 16) {
                                B b4 = null;
                                A a8 = null;
                                if (mike == 24) {
                                    int juliet = fVar.juliet();
                                    if (juliet == 0) {
                                        a8 = A.WARNING;
                                    } else if (juliet == 1) {
                                        a8 = a6;
                                    } else if (juliet == 2) {
                                        a8 = A.HIDDEN;
                                    }
                                    if (a8 == null) {
                                        romeo.coral(mike);
                                        romeo.coral(juliet);
                                    } else {
                                        this.purple |= 4;
                                        this.teal = a8;
                                    }
                                } else if (mike == 32) {
                                    this.purple |= 8;
                                    this.white = fVar.juliet();
                                } else if (mike == 40) {
                                    this.purple |= 16;
                                    this.yellow = fVar.juliet();
                                } else if (mike != 48) {
                                    if (!fVar.papa(mike, romeo)) {
                                    }
                                } else {
                                    int juliet2 = fVar.juliet();
                                    if (juliet2 == 0) {
                                        b4 = b2;
                                    } else if (juliet2 == 1) {
                                        b4 = B.COMPILER_VERSION;
                                    } else if (juliet2 == 2) {
                                        b4 = B.API_VERSION;
                                    }
                                    if (b4 == null) {
                                        romeo.coral(mike);
                                        romeo.coral(juliet2);
                                    } else {
                                        this.purple |= 32;
                                        this.f1420a = b4;
                                    }
                                }
                            } else {
                                this.purple |= 2;
                                this.silver = fVar.juliet();
                            }
                        }
                        z2 = true;
                    } catch (InvalidProtocolBufferException e4) {
                        throw e4.setUnfinishedMessage(this);
                    }
                } catch (IOException e5) {
                    throw new InvalidProtocolBufferException(e5.getMessage()).setUnfinishedMessage(this);
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
