package Ie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class av extends Oe.l {

    /* renamed from: f, reason: collision with root package name */
    public static final av f1501f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0181a f1502g = new C0181a(19);

    /* renamed from: a, reason: collision with root package name */
    public List f1503a;

    /* renamed from: b, reason: collision with root package name */
    public List f1504b;

    /* renamed from: c, reason: collision with root package name */
    public int f1505c;

    /* renamed from: d, reason: collision with root package name */
    public byte f1506d;
    public int e;
    public final Oe.e purple;
    public int red;
    public int silver;
    public int teal;
    public boolean white;
    public au yellow;

    static {
        av avVar = new av();
        f1501f = avVar;
        avVar.silver = 0;
        avVar.teal = 0;
        avVar.white = false;
        avVar.yellow = au.INV;
        List list = Collections.EMPTY_LIST;
        avVar.f1503a = list;
        avVar.f1504b = list;
    }

    public av(at atVar) {
        super(atVar);
        this.f1505c = -1;
        this.f1506d = (byte) -1;
        this.e = -1;
        this.purple = atVar.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        byte b2 = this.f1506d;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i4 = this.red;
        if ((i4 & 1) == 1) {
            if ((i4 & 2) == 2) {
                for (int i5 = 0; i5 < this.f1503a.size(); i5++) {
                    if (!((aq) this.f1503a.get(i5)).alpha()) {
                        this.f1506d = (byte) 0;
                        return false;
                    }
                }
                if (!india()) {
                    this.f1506d = (byte) 0;
                    return false;
                }
                this.f1506d = (byte) 1;
                return true;
            }
            this.f1506d = (byte) 0;
            return false;
        }
        this.f1506d = (byte) 0;
        return false;
    }

    @Override // Oe.w
    public final Oe.v bravo() {
        return f1501f;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        at lima = at.lima();
        lima.mike(this);
        return lima;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        int i5 = this.e;
        if (i5 != -1) {
            return i5;
        }
        if ((this.red & 1) == 1) {
            i4 = F0.e.charlie(1, this.silver);
        } else {
            i4 = 0;
        }
        if ((this.red & 2) == 2) {
            i4 += F0.e.charlie(2, this.teal);
        }
        if ((this.red & 4) == 4) {
            i4 += F0.e.india(3) + 1;
        }
        if ((this.red & 8) == 8) {
            i4 += F0.e.bravo(4, this.yellow.alpha);
        }
        for (int i10 = 0; i10 < this.f1503a.size(); i10++) {
            i4 += F0.e.echo(5, (Oe.v) this.f1503a.get(i10));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f1504b.size(); i12++) {
            i11 += F0.e.delta(((Integer) this.f1504b.get(i12)).intValue());
        }
        int i13 = i4 + i11;
        if (!this.f1504b.isEmpty()) {
            i13 = i13 + 1 + F0.e.delta(i11);
        }
        this.f1505c = i11;
        int size = this.purple.size() + juliet() + i13;
        this.e = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        w.o oVar = new w.o(this);
        if ((this.red & 1) == 1) {
            eVar.xray(1, this.silver);
        }
        if ((this.red & 2) == 2) {
            eVar.xray(2, this.teal);
        }
        if ((this.red & 4) == 4) {
            boolean z2 = this.white;
            eVar.cyan(3, 0);
            eVar.azure(z2 ? 1 : 0);
        }
        if ((this.red & 8) == 8) {
            eVar.whiskey(4, this.yellow.alpha);
        }
        for (int i4 = 0; i4 < this.f1503a.size(); i4++) {
            eVar.zulu(5, (Oe.v) this.f1503a.get(i4));
        }
        if (this.f1504b.size() > 0) {
            eVar.coral(50);
            eVar.coral(this.f1505c);
        }
        for (int i5 = 0; i5 < this.f1504b.size(); i5++) {
            eVar.yankee(((Integer) this.f1504b.get(i5)).intValue());
        }
        oVar.beige(1000, eVar);
        eVar.beige(this.purple);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return at.lima();
    }

    public av() {
        this.f1505c = -1;
        this.f1506d = (byte) -1;
        this.e = -1;
        this.purple = Oe.e.alpha;
    }

    public av(Oe.f fVar, Oe.h hVar) {
        au auVar;
        this.f1505c = -1;
        this.f1506d = (byte) -1;
        this.e = -1;
        this.silver = 0;
        this.teal = 0;
        this.white = false;
        au auVar2 = au.INV;
        this.yellow = auVar2;
        List list = Collections.EMPTY_LIST;
        this.f1503a = list;
        this.f1504b = list;
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
                        } else if (mike == 16) {
                            this.red |= 2;
                            this.teal = fVar.juliet();
                        } else if (mike == 24) {
                            this.red |= 4;
                            this.white = fVar.kilo() != 0;
                        } else if (mike == 32) {
                            int juliet = fVar.juliet();
                            if (juliet == 0) {
                                auVar = au.IN;
                            } else if (juliet != 1) {
                                auVar = juliet != 2 ? null : auVar2;
                            } else {
                                auVar = au.OUT;
                            }
                            if (auVar == null) {
                                romeo.coral(mike);
                                romeo.coral(juliet);
                            } else {
                                this.red |= 8;
                                this.yellow = auVar;
                            }
                        } else if (mike == 42) {
                            if ((i4 & 16) != 16) {
                                this.f1503a = new ArrayList();
                                i4 |= 16;
                            }
                            this.f1503a.add(fVar.foxtrot(aq.f1473n, hVar));
                        } else if (mike == 48) {
                            if ((i4 & 32) != 32) {
                                this.f1504b = new ArrayList();
                                i4 |= 32;
                            }
                            this.f1504b.add(Integer.valueOf(fVar.juliet()));
                        } else if (mike != 50) {
                            if (!november(fVar, romeo, hVar, mike)) {
                            }
                        } else {
                            int charlie = fVar.charlie(fVar.juliet());
                            if ((i4 & 32) != 32 && fVar.alpha() > 0) {
                                this.f1504b = new ArrayList();
                                i4 |= 32;
                            }
                            while (fVar.alpha() > 0) {
                                this.f1504b.add(Integer.valueOf(fVar.juliet()));
                            }
                            fVar.bravo(charlie);
                        }
                    }
                    z2 = true;
                } catch (Throwable th) {
                    if ((i4 & 16) == 16) {
                        this.f1503a = Collections.unmodifiableList(this.f1503a);
                    }
                    if ((i4 & 32) == 32) {
                        this.f1504b = Collections.unmodifiableList(this.f1504b);
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
        if ((i4 & 16) == 16) {
            this.f1503a = Collections.unmodifiableList(this.f1503a);
        }
        if ((i4 & 32) == 32) {
            this.f1504b = Collections.unmodifiableList(this.f1504b);
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
