package Ie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class l extends Oe.l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f1586b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0181a f1587c = new C0181a(4);

    /* renamed from: a, reason: collision with root package name */
    public int f1588a;
    public final Oe.e purple;
    public int red;
    public int silver;
    public List teal;
    public List white;
    public byte yellow;

    static {
        l lVar = new l();
        f1586b = lVar;
        lVar.silver = 6;
        List list = Collections.EMPTY_LIST;
        lVar.teal = list;
        lVar.white = list;
    }

    public l(k kVar) {
        super(kVar);
        this.yellow = (byte) -1;
        this.f1588a = -1;
        this.purple = kVar.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        byte b2 = this.yellow;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i4 = 0; i4 < this.teal.size(); i4++) {
            if (!((ay) this.teal.get(i4)).alpha()) {
                this.yellow = (byte) 0;
                return false;
            }
        }
        if (!india()) {
            this.yellow = (byte) 0;
            return false;
        }
        this.yellow = (byte) 1;
        return true;
    }

    @Override // Oe.w
    public final Oe.v bravo() {
        return f1586b;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        k lima = k.lima();
        lima.mike(this);
        return lima;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        int i5 = this.f1588a;
        if (i5 != -1) {
            return i5;
        }
        if ((this.red & 1) == 1) {
            i4 = F0.e.charlie(1, this.silver);
        } else {
            i4 = 0;
        }
        for (int i10 = 0; i10 < this.teal.size(); i10++) {
            i4 += F0.e.echo(2, (Oe.v) this.teal.get(i10));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.white.size(); i12++) {
            i11 += F0.e.delta(((Integer) this.white.get(i12)).intValue());
        }
        int size = this.purple.size() + juliet() + (this.white.size() * 2) + i4 + i11;
        this.f1588a = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        w.o oVar = new w.o(this);
        if ((this.red & 1) == 1) {
            eVar.xray(1, this.silver);
        }
        for (int i4 = 0; i4 < this.teal.size(); i4++) {
            eVar.zulu(2, (Oe.v) this.teal.get(i4));
        }
        for (int i5 = 0; i5 < this.white.size(); i5++) {
            eVar.xray(31, ((Integer) this.white.get(i5)).intValue());
        }
        oVar.beige(19000, eVar);
        eVar.beige(this.purple);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return k.lima();
    }

    public l() {
        this.yellow = (byte) -1;
        this.f1588a = -1;
        this.purple = Oe.e.alpha;
    }

    public l(Oe.f fVar, Oe.h hVar) {
        this.yellow = (byte) -1;
        this.f1588a = -1;
        this.silver = 6;
        List list = Collections.EMPTY_LIST;
        this.teal = list;
        this.white = list;
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        boolean z2 = false;
        int i4 = 0;
        while (!z2) {
            try {
                try {
                    int mike = fVar.mike();
                    if (mike != 0) {
                        if (mike == 8) {
                            this.red |= 1;
                            this.silver = fVar.juliet();
                        } else if (mike == 18) {
                            if ((i4 & 2) != 2) {
                                this.teal = new ArrayList();
                                i4 |= 2;
                            }
                            this.teal.add(fVar.foxtrot(ay.f1511f, hVar));
                        } else if (mike == 248) {
                            if ((i4 & 4) != 4) {
                                this.white = new ArrayList();
                                i4 |= 4;
                            }
                            this.white.add(Integer.valueOf(fVar.juliet()));
                        } else if (mike != 250) {
                            if (!november(fVar, romeo, hVar, mike)) {
                            }
                        } else {
                            int charlie = fVar.charlie(fVar.juliet());
                            if ((i4 & 4) != 4 && fVar.alpha() > 0) {
                                this.white = new ArrayList();
                                i4 |= 4;
                            }
                            while (fVar.alpha() > 0) {
                                this.white.add(Integer.valueOf(fVar.juliet()));
                            }
                            fVar.bravo(charlie);
                        }
                    }
                    z2 = true;
                } catch (Throwable th) {
                    if ((i4 & 2) == 2) {
                        this.teal = Collections.unmodifiableList(this.teal);
                    }
                    if ((i4 & 4) == 4) {
                        this.white = Collections.unmodifiableList(this.white);
                    }
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
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e4) {
                throw new InvalidProtocolBufferException(e4.getMessage()).setUnfinishedMessage(this);
            }
        }
        if ((i4 & 2) == 2) {
            this.teal = Collections.unmodifiableList(this.teal);
        }
        if ((i4 & 4) == 4) {
            this.white = Collections.unmodifiableList(this.white);
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
