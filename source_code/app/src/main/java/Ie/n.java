package Ie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class n extends Oe.o implements Oe.w {
    public static final n teal;
    public static final C0181a white = new C0181a(5);
    public final Oe.e alpha;
    public List purple;
    public byte red;
    public int silver;

    static {
        n nVar = new n();
        teal = nVar;
        nVar.purple = Collections.EMPTY_LIST;
    }

    public n() {
        this.red = (byte) -1;
        this.silver = -1;
        this.alpha = Oe.e.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        byte b2 = this.red;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i4 = 0; i4 < this.purple.size(); i4++) {
            if (!((r) this.purple.get(i4)).alpha()) {
                this.red = (byte) 0;
                return false;
            }
        }
        this.red = (byte) 1;
        return true;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        m mVar = new m(0);
        mVar.silver = Collections.EMPTY_LIST;
        mVar.november(this);
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
            i5 += F0.e.echo(1, (Oe.v) this.purple.get(i10));
        }
        int size = this.alpha.size() + i5;
        this.silver = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        for (int i4 = 0; i4 < this.purple.size(); i4++) {
            eVar.zulu(1, (Oe.v) this.purple.get(i4));
        }
        eVar.beige(this.alpha);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        m mVar = new m(0);
        mVar.silver = Collections.EMPTY_LIST;
        return mVar;
    }

    public n(m mVar) {
        this.red = (byte) -1;
        this.silver = -1;
        this.alpha = mVar.alpha;
    }

    public n(Oe.f fVar, Oe.h hVar) {
        this.red = (byte) -1;
        this.silver = -1;
        this.purple = Collections.EMPTY_LIST;
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
                            if (!z10) {
                                this.purple = new ArrayList();
                                z10 = true;
                            }
                            this.purple.add(fVar.foxtrot(r.f1590c, hVar));
                        }
                    }
                    z2 = true;
                } catch (Throwable th) {
                    if (z10) {
                        this.purple = Collections.unmodifiableList(this.purple);
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
            this.purple = Collections.unmodifiableList(this.purple);
        }
        try {
            romeo.juliet();
        } catch (IOException unused2) {
        } finally {
            this.alpha = dVar.foxtrot();
        }
    }
}
