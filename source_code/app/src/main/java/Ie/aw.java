package Ie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class aw extends Oe.o implements Oe.w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0181a f1507a = new C0181a(20);
    public static final aw yellow;
    public final Oe.e alpha;
    public int purple;
    public List red;
    public int silver;
    public byte teal;
    public int white;

    static {
        aw awVar = new aw();
        yellow = awVar;
        awVar.red = Collections.EMPTY_LIST;
        awVar.silver = -1;
    }

    public aw() {
        this.teal = (byte) -1;
        this.white = -1;
        this.alpha = Oe.e.alpha;
    }

    public static f india(aw awVar) {
        f mike = f.mike();
        mike.papa(awVar);
        return mike;
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
        for (int i4 = 0; i4 < this.red.size(); i4++) {
            if (!((aq) this.red.get(i4)).alpha()) {
                this.teal = (byte) 0;
                return false;
            }
        }
        this.teal = (byte) 1;
        return true;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        return india(this);
    }

    @Override // Oe.v
    public final int delta() {
        int i4 = this.white;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < this.red.size(); i10++) {
            i5 += F0.e.echo(1, (Oe.v) this.red.get(i10));
        }
        if ((this.purple & 1) == 1) {
            i5 += F0.e.charlie(2, this.silver);
        }
        int size = this.alpha.size() + i5;
        this.white = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        for (int i4 = 0; i4 < this.red.size(); i4++) {
            eVar.zulu(1, (Oe.v) this.red.get(i4));
        }
        if ((this.purple & 1) == 1) {
            eVar.xray(2, this.silver);
        }
        eVar.beige(this.alpha);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return f.mike();
    }

    public final f juliet() {
        return india(this);
    }

    public aw(f fVar) {
        this.teal = (byte) -1;
        this.white = -1;
        this.alpha = fVar.alpha;
    }

    public aw(Oe.f fVar, Oe.h hVar) {
        this.teal = (byte) -1;
        this.white = -1;
        this.red = Collections.EMPTY_LIST;
        this.silver = -1;
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        boolean z2 = false;
        boolean z10 = false;
        while (!z2) {
            try {
                try {
                    int mike = fVar.mike();
                    if (mike != 0) {
                        if (mike == 10) {
                            if (!z10) {
                                this.red = new ArrayList();
                                z10 = true;
                            }
                            this.red.add(fVar.foxtrot(aq.f1473n, hVar));
                        } else if (mike != 16) {
                            if (!fVar.papa(mike, romeo)) {
                            }
                        } else {
                            this.purple |= 1;
                            this.silver = fVar.juliet();
                        }
                    }
                    z2 = true;
                } catch (Throwable th) {
                    if (z10) {
                        this.red = Collections.unmodifiableList(this.red);
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
            this.red = Collections.unmodifiableList(this.red);
        }
        try {
            romeo.juliet();
        } catch (IOException unused2) {
        } finally {
            this.alpha = dVar.foxtrot();
        }
    }
}
