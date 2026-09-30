package Le;

import Ie.C0181a;
import Oe.o;
import Oe.w;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class b extends o implements w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0181a f1837a = new C0181a(24);
    public static final b yellow;
    public final Oe.e alpha;
    public int purple;
    public int red;
    public int silver;
    public byte teal;
    public int white;

    static {
        b bVar = new b();
        yellow = bVar;
        bVar.red = 0;
        bVar.silver = 0;
    }

    public b() {
        this.teal = (byte) -1;
        this.white = -1;
        this.alpha = Oe.e.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        if (this.teal == 1) {
            return true;
        }
        this.teal = (byte) 1;
        return true;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        a aVar = new a(0);
        aVar.lima(this);
        return aVar;
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
            i4 += F0.e.charlie(2, this.silver);
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
            eVar.xray(2, this.silver);
        }
        eVar.beige(this.alpha);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return new a(0);
    }

    public b(a aVar) {
        this.teal = (byte) -1;
        this.white = -1;
        this.alpha = aVar.alpha;
    }

    public b(Oe.f fVar) {
        this.teal = (byte) -1;
        this.white = -1;
        boolean z2 = false;
        this.red = 0;
        this.silver = 0;
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
                        } else if (mike != 16) {
                            if (!fVar.papa(mike, romeo)) {
                            }
                        } else {
                            this.purple |= 2;
                            this.silver = fVar.juliet();
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
