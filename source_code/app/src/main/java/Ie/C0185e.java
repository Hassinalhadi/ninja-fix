package Ie;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: Ie.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0185e extends Oe.o implements Oe.w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0181a f1538a = new C0181a(1);
    public static final C0185e yellow;
    public final Oe.e alpha;
    public int purple;
    public int red;
    public C0184d silver;
    public byte teal;
    public int white;

    static {
        C0185e c0185e = new C0185e();
        yellow = c0185e;
        c0185e.red = 0;
        c0185e.silver = C0184d.f1529i;
    }

    public C0185e() {
        this.teal = (byte) -1;
        this.white = -1;
        this.alpha = Oe.e.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        byte b2 = this.teal;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i4 = this.purple;
        if ((i4 & 1) == 1) {
            if ((i4 & 2) == 2) {
                if (!this.silver.alpha()) {
                    this.teal = (byte) 0;
                    return false;
                }
                this.teal = (byte) 1;
                return true;
            }
            this.teal = (byte) 0;
            return false;
        }
        this.teal = (byte) 0;
        return false;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        f fVar = new f(2);
        fVar.silver = C0184d.f1529i;
        fVar.november(this);
        return fVar;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        int i5 = this.white;
        if (i5 != -1) {
            return i5;
        }
        if ((this.purple & 1) == 1) {
            i4 = F0.e.charlie(1, this.red);
        } else {
            i4 = 0;
        }
        if ((this.purple & 2) == 2) {
            i4 += F0.e.echo(2, this.silver);
        }
        int size = this.alpha.size() + i4;
        this.white = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        if ((this.purple & 1) == 1) {
            eVar.xray(1, this.red);
        }
        if ((this.purple & 2) == 2) {
            eVar.zulu(2, this.silver);
        }
        eVar.beige(this.alpha);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        f fVar = new f(2);
        fVar.silver = C0184d.f1529i;
        return fVar;
    }

    public C0185e(f fVar) {
        this.teal = (byte) -1;
        this.white = -1;
        this.alpha = fVar.alpha;
    }

    public C0185e(Oe.f fVar, Oe.h hVar) {
        C0182b c0182b;
        this.teal = (byte) -1;
        this.white = -1;
        boolean z2 = false;
        this.red = 0;
        this.silver = C0184d.f1529i;
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        while (!z2) {
            try {
                try {
                    int mike = fVar.mike();
                    if (mike != 0) {
                        if (mike == 8) {
                            this.purple |= 1;
                            this.red = fVar.juliet();
                        } else if (mike != 18) {
                            if (!fVar.papa(mike, romeo)) {
                            }
                        } else {
                            if ((this.purple & 2) == 2) {
                                C0184d c0184d = this.silver;
                                c0184d.getClass();
                                c0182b = C0182b.kilo();
                                c0182b.lima(c0184d);
                            } else {
                                c0182b = null;
                            }
                            C0184d c0184d2 = (C0184d) fVar.foxtrot(C0184d.f1530j, hVar);
                            this.silver = c0184d2;
                            if (c0182b != null) {
                                c0182b.lima(c0184d2);
                                this.silver = c0182b.juliet();
                            }
                            this.purple |= 2;
                        }
                    }
                    z2 = true;
                } catch (Throwable th) {
                    try {
                        romeo.juliet();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e4) {
                throw new InvalidProtocolBufferException(e4.getMessage()).setUnfinishedMessage(this);
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
