package Ie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class g extends Oe.o implements Oe.w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0181a f1539a = new C0181a(0);
    public static final g yellow;
    public final Oe.e alpha;
    public int purple;
    public int red;
    public List silver;
    public byte teal;
    public int white;

    static {
        g gVar = new g();
        yellow = gVar;
        gVar.red = 0;
        gVar.silver = Collections.EMPTY_LIST;
    }

    public g() {
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
        if ((this.purple & 1) == 1) {
            for (int i4 = 0; i4 < this.silver.size(); i4++) {
                if (!((C0185e) this.silver.get(i4)).alpha()) {
                    this.teal = (byte) 0;
                    return false;
                }
            }
            this.teal = (byte) 1;
            return true;
        }
        this.teal = (byte) 0;
        return false;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        f fVar = new f(0);
        fVar.silver = Collections.EMPTY_LIST;
        fVar.oscar(this);
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
        for (int i10 = 0; i10 < this.silver.size(); i10++) {
            i4 += F0.e.echo(2, (Oe.v) this.silver.get(i10));
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
        for (int i4 = 0; i4 < this.silver.size(); i4++) {
            eVar.zulu(2, (Oe.v) this.silver.get(i4));
        }
        eVar.beige(this.alpha);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        f fVar = new f(0);
        fVar.silver = Collections.EMPTY_LIST;
        return fVar;
    }

    public g(f fVar) {
        this.teal = (byte) -1;
        this.white = -1;
        this.alpha = fVar.alpha;
    }

    public g(Oe.f fVar, Oe.h hVar) {
        this.teal = (byte) -1;
        this.white = -1;
        boolean z2 = false;
        this.red = 0;
        this.silver = Collections.EMPTY_LIST;
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        char c3 = 0;
        while (!z2) {
            try {
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
                                if ((c3 & 2) != 2) {
                                    this.silver = new ArrayList();
                                    c3 = 2;
                                }
                                this.silver.add(fVar.foxtrot(C0185e.f1538a, hVar));
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
                if ((c3 & 2) == 2) {
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
        if ((c3 & 2) == 2) {
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
