package Ie;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class al extends Oe.o implements Oe.w {
    public static final al teal;
    public static final C0181a white = new C0181a(15);
    public final Oe.e alpha;
    public Oe.s purple;
    public byte red;
    public int silver;

    static {
        al alVar = new al();
        teal = alVar;
        alVar.purple = Oe.r.purple;
    }

    public al() {
        this.red = (byte) -1;
        this.silver = -1;
        this.alpha = Oe.e.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        if (this.red == 1) {
            return true;
        }
        this.red = (byte) 1;
        return true;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        m mVar = new m(3);
        mVar.silver = Oe.r.purple;
        mVar.papa(this);
        return mVar;
    }

    @Override // Oe.v
    public final int delta() {
        int i4 = this.silver;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < this.purple.size(); i10++) {
            Oe.e j5 = this.purple.j(i10);
            i5 += j5.size() + F0.e.golf(j5.size());
        }
        int size = this.alpha.size() + this.purple.size() + i5;
        this.silver = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        for (int i4 = 0; i4 < this.purple.size(); i4++) {
            Oe.e j5 = this.purple.j(i4);
            eVar.cyan(1, 2);
            eVar.coral(j5.size());
            eVar.beige(j5);
        }
        eVar.beige(this.alpha);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        m mVar = new m(3);
        mVar.silver = Oe.r.purple;
        return mVar;
    }

    public al(m mVar) {
        this.red = (byte) -1;
        this.silver = -1;
        this.alpha = mVar.alpha;
    }

    public al(Oe.f fVar) {
        this.red = (byte) -1;
        this.silver = -1;
        this.purple = Oe.r.purple;
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        boolean z2 = false;
        boolean z10 = false;
        while (!z2) {
            try {
                try {
                    int mike = fVar.mike();
                    if (mike != 0) {
                        if (mike != 10) {
                            if (!fVar.papa(mike, romeo)) {
                            }
                        } else {
                            Oe.u delta = fVar.delta();
                            if (!z10) {
                                this.purple = new Oe.r();
                                z10 = true;
                            }
                            this.purple.beige(delta);
                        }
                    }
                    z2 = true;
                } catch (Throwable th) {
                    if (z10) {
                        this.purple = this.purple.echo();
                    }
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
        if (z10) {
            this.purple = this.purple.echo();
        }
        try {
            romeo.juliet();
        } catch (IOException unused2) {
        } finally {
            this.alpha = dVar.foxtrot();
        }
    }
}
