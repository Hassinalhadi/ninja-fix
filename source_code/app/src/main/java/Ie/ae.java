package Ie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class ae extends Oe.l {

    /* renamed from: c, reason: collision with root package name */
    public static final ae f1430c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0181a f1431d = new C0181a(11);

    /* renamed from: a, reason: collision with root package name */
    public byte f1432a;

    /* renamed from: b, reason: collision with root package name */
    public int f1433b;
    public final Oe.e purple;
    public int red;
    public al silver;
    public ak teal;
    public ac white;
    public List yellow;

    static {
        ae aeVar = new ae();
        f1430c = aeVar;
        aeVar.silver = al.teal;
        aeVar.teal = ak.teal;
        aeVar.white = ac.f1425d;
        aeVar.yellow = Collections.EMPTY_LIST;
    }

    public ae(ad adVar) {
        super(adVar);
        this.f1432a = (byte) -1;
        this.f1433b = -1;
        this.purple = adVar.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        byte b2 = this.f1432a;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.red & 2) == 2 && !this.teal.alpha()) {
            this.f1432a = (byte) 0;
            return false;
        }
        if ((this.red & 4) == 4 && !this.white.alpha()) {
            this.f1432a = (byte) 0;
            return false;
        }
        for (int i4 = 0; i4 < this.yellow.size(); i4++) {
            if (!((j) this.yellow.get(i4)).alpha()) {
                this.f1432a = (byte) 0;
                return false;
            }
        }
        if (!india()) {
            this.f1432a = (byte) 0;
            return false;
        }
        this.f1432a = (byte) 1;
        return true;
    }

    @Override // Oe.w
    public final Oe.v bravo() {
        return f1430c;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        ad lima = ad.lima();
        lima.mike(this);
        return lima;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        int i5 = this.f1433b;
        if (i5 != -1) {
            return i5;
        }
        if ((this.red & 1) == 1) {
            i4 = F0.e.echo(1, this.silver);
        } else {
            i4 = 0;
        }
        if ((this.red & 2) == 2) {
            i4 += F0.e.echo(2, this.teal);
        }
        if ((this.red & 4) == 4) {
            i4 += F0.e.echo(3, this.white);
        }
        for (int i10 = 0; i10 < this.yellow.size(); i10++) {
            i4 += F0.e.echo(4, (Oe.v) this.yellow.get(i10));
        }
        int size = this.purple.size() + juliet() + i4;
        this.f1433b = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        w.o oVar = new w.o(this);
        if ((this.red & 1) == 1) {
            eVar.zulu(1, this.silver);
        }
        if ((this.red & 2) == 2) {
            eVar.zulu(2, this.teal);
        }
        if ((this.red & 4) == 4) {
            eVar.zulu(3, this.white);
        }
        for (int i4 = 0; i4 < this.yellow.size(); i4++) {
            eVar.zulu(4, (Oe.v) this.yellow.get(i4));
        }
        oVar.beige(200, eVar);
        eVar.beige(this.purple);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return ad.lima();
    }

    public ae() {
        this.f1432a = (byte) -1;
        this.f1433b = -1;
        this.purple = Oe.e.alpha;
    }

    public ae(Oe.f fVar, Oe.h hVar) {
        this.f1432a = (byte) -1;
        this.f1433b = -1;
        this.silver = al.teal;
        this.teal = ak.teal;
        this.white = ac.f1425d;
        this.yellow = Collections.EMPTY_LIST;
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        boolean z2 = false;
        char c3 = 0;
        while (!z2) {
            try {
                try {
                    int mike = fVar.mike();
                    if (mike != 0) {
                        ab abVar = null;
                        m mVar = null;
                        m mVar2 = null;
                        if (mike == 10) {
                            if ((this.red & 1) == 1) {
                                al alVar = this.silver;
                                alVar.getClass();
                                mVar = new m(3);
                                mVar.silver = Oe.r.purple;
                                mVar.papa(alVar);
                            }
                            al alVar2 = (al) fVar.foxtrot(al.white, hVar);
                            this.silver = alVar2;
                            if (mVar != null) {
                                mVar.papa(alVar2);
                                this.silver = mVar.lima();
                            }
                            this.red |= 1;
                        } else if (mike == 18) {
                            if ((this.red & 2) == 2) {
                                ak akVar = this.teal;
                                akVar.getClass();
                                mVar2 = new m(1);
                                mVar2.silver = Collections.EMPTY_LIST;
                                mVar2.oscar(akVar);
                            }
                            ak akVar2 = (ak) fVar.foxtrot(ak.white, hVar);
                            this.teal = akVar2;
                            if (mVar2 != null) {
                                mVar2.oscar(akVar2);
                                this.teal = mVar2.kilo();
                            }
                            this.red |= 2;
                        } else if (mike == 26) {
                            if ((this.red & 4) == 4) {
                                ac acVar = this.white;
                                acVar.getClass();
                                abVar = ab.lima();
                                abVar.mike(acVar);
                            }
                            ac acVar2 = (ac) fVar.foxtrot(ac.e, hVar);
                            this.white = acVar2;
                            if (abVar != null) {
                                abVar.mike(acVar2);
                                this.white = abVar.kilo();
                            }
                            this.red |= 4;
                        } else if (mike != 34) {
                            if (!november(fVar, romeo, hVar, mike)) {
                            }
                        } else {
                            int i4 = (c3 == true ? 1 : 0) & '\b';
                            c3 = c3;
                            if (i4 != 8) {
                                this.yellow = new ArrayList();
                                c3 = '\b';
                            }
                            this.yellow.add(fVar.foxtrot(j.f1560D, hVar));
                        }
                    }
                    z2 = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e4) {
                    throw new InvalidProtocolBufferException(e4.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (((c3 == true ? 1 : 0) & '\b') == 8) {
                    this.yellow = Collections.unmodifiableList(this.yellow);
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
        }
        if (((c3 == true ? 1 : 0) & '\b') == 8) {
            this.yellow = Collections.unmodifiableList(this.yellow);
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
