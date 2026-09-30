package Ie;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class t extends Oe.l {

    /* renamed from: a, reason: collision with root package name */
    public static final C0181a f1592a = new C0181a(7);
    public static final t yellow;
    public final Oe.e purple;
    public int red;
    public int silver;
    public byte teal;
    public int white;

    static {
        t tVar = new t();
        yellow = tVar;
        tVar.silver = 0;
    }

    public t(s sVar) {
        super(sVar);
        this.teal = (byte) -1;
        this.white = -1;
        this.purple = sVar.alpha;
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
        if (!india()) {
            this.teal = (byte) 0;
            return false;
        }
        this.teal = (byte) 1;
        return true;
    }

    @Override // Oe.w
    public final Oe.v bravo() {
        return yellow;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ie.s, Oe.k, Oe.j] */
    @Override // Oe.v
    public final Oe.j charlie() {
        ?? kVar = new Oe.k();
        kVar.kilo(this);
        return kVar;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        int i5 = this.white;
        if (i5 != -1) {
            return i5;
        }
        if ((this.red & 1) == 1) {
            i4 = F0.e.charlie(1, this.silver);
        } else {
            i4 = 0;
        }
        int size = this.purple.size() + juliet() + i4;
        this.white = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        w.o oVar = new w.o(this);
        if ((this.red & 1) == 1) {
            eVar.xray(1, this.silver);
        }
        oVar.beige(200, eVar);
        eVar.beige(this.purple);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return new Oe.k();
    }

    public t() {
        this.teal = (byte) -1;
        this.white = -1;
        this.purple = Oe.e.alpha;
    }

    public t(Oe.f fVar, Oe.h hVar) {
        this.teal = (byte) -1;
        this.white = -1;
        boolean z2 = false;
        this.silver = 0;
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        while (!z2) {
            try {
                try {
                    try {
                        int mike = fVar.mike();
                        if (mike != 0) {
                            if (mike != 8) {
                                if (!november(fVar, romeo, hVar, mike)) {
                                }
                            } else {
                                this.red |= 1;
                                this.silver = fVar.juliet();
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
                    this.purple = dVar.foxtrot();
                    throw th2;
                }
                this.purple = dVar.foxtrot();
                mike();
                throw th;
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
