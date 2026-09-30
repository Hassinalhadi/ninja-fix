package Le;

import Ie.C0181a;
import Oe.o;
import Oe.v;
import Oe.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class j extends o implements w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0181a f1850a = new C0181a(27);
    public static final j yellow;
    public final Oe.e alpha;
    public List purple;
    public List red;
    public int silver;
    public byte teal;
    public int white;

    static {
        j jVar = new j();
        yellow = jVar;
        List list = Collections.EMPTY_LIST;
        jVar.purple = list;
        jVar.red = list;
    }

    public j() {
        this.silver = -1;
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

    /* JADX WARN: Type inference failed for: r0v0, types: [Le.f, Oe.j] */
    @Override // Oe.v
    public final Oe.j charlie() {
        ?? jVar = new Oe.j();
        List list = Collections.EMPTY_LIST;
        jVar.red = list;
        jVar.silver = list;
        jVar.kilo(this);
        return jVar;
    }

    @Override // Oe.v
    public final int delta() {
        int i4 = this.white;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < this.purple.size(); i10++) {
            i5 += F0.e.echo(1, (v) this.purple.get(i10));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.red.size(); i12++) {
            i11 += F0.e.delta(((Integer) this.red.get(i12)).intValue());
        }
        int i13 = i5 + i11;
        if (!this.red.isEmpty()) {
            i13 = i13 + 1 + F0.e.delta(i11);
        }
        this.silver = i11;
        int size = this.alpha.size() + i13;
        this.white = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        for (int i4 = 0; i4 < this.purple.size(); i4++) {
            eVar.zulu(1, (v) this.purple.get(i4));
        }
        if (this.red.size() > 0) {
            eVar.coral(42);
            eVar.coral(this.silver);
        }
        for (int i5 = 0; i5 < this.red.size(); i5++) {
            eVar.yankee(((Integer) this.red.get(i5)).intValue());
        }
        eVar.beige(this.alpha);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Le.f, Oe.j] */
    @Override // Oe.v
    public final Oe.j foxtrot() {
        ?? jVar = new Oe.j();
        List list = Collections.EMPTY_LIST;
        jVar.red = list;
        jVar.silver = list;
        return jVar;
    }

    public j(f fVar) {
        this.silver = -1;
        this.teal = (byte) -1;
        this.white = -1;
        this.alpha = fVar.alpha;
    }

    public j(Oe.f fVar, Oe.h hVar) {
        this.silver = -1;
        this.teal = (byte) -1;
        this.white = -1;
        List list = Collections.EMPTY_LIST;
        this.purple = list;
        this.red = list;
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        boolean z2 = false;
        int i4 = 0;
        while (!z2) {
            try {
                try {
                    int mike = fVar.mike();
                    if (mike != 0) {
                        if (mike == 10) {
                            if ((i4 & 1) != 1) {
                                this.purple = new ArrayList();
                                i4 |= 1;
                            }
                            this.purple.add(fVar.foxtrot(i.f1845g, hVar));
                        } else if (mike == 40) {
                            if ((i4 & 2) != 2) {
                                this.red = new ArrayList();
                                i4 |= 2;
                            }
                            this.red.add(Integer.valueOf(fVar.juliet()));
                        } else if (mike != 42) {
                            if (!fVar.papa(mike, romeo)) {
                            }
                        } else {
                            int charlie = fVar.charlie(fVar.juliet());
                            if ((i4 & 2) != 2 && fVar.alpha() > 0) {
                                this.red = new ArrayList();
                                i4 |= 2;
                            }
                            while (fVar.alpha() > 0) {
                                this.red.add(Integer.valueOf(fVar.juliet()));
                            }
                            fVar.bravo(charlie);
                        }
                    }
                    z2 = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e4) {
                    throw new InvalidProtocolBufferException(e4.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if ((i4 & 1) == 1) {
                    this.purple = Collections.unmodifiableList(this.purple);
                }
                if ((i4 & 2) == 2) {
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
        }
        if ((i4 & 1) == 1) {
            this.purple = Collections.unmodifiableList(this.purple);
        }
        if ((i4 & 2) == 2) {
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
