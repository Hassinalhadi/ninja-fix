package Ie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class ac extends Oe.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ac f1425d;
    public static final C0181a e = new C0181a(10);

    /* renamed from: a, reason: collision with root package name */
    public D f1426a;

    /* renamed from: b, reason: collision with root package name */
    public byte f1427b;

    /* renamed from: c, reason: collision with root package name */
    public int f1428c;
    public final Oe.e purple;
    public int red;
    public List silver;
    public List teal;
    public List white;
    public aw yellow;

    static {
        ac acVar = new ac();
        f1425d = acVar;
        List list = Collections.EMPTY_LIST;
        acVar.silver = list;
        acVar.teal = list;
        acVar.white = list;
        acVar.yellow = aw.yellow;
        acVar.f1426a = D.teal;
    }

    public ac(ab abVar) {
        super(abVar);
        this.f1427b = (byte) -1;
        this.f1428c = -1;
        this.purple = abVar.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        byte b2 = this.f1427b;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i4 = 0; i4 < this.silver.size(); i4++) {
            if (!((y) this.silver.get(i4)).alpha()) {
                this.f1427b = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.teal.size(); i5++) {
            if (!((ag) this.teal.get(i5)).alpha()) {
                this.f1427b = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.white.size(); i10++) {
            if (!((as) this.white.get(i10)).alpha()) {
                this.f1427b = (byte) 0;
                return false;
            }
        }
        if ((this.red & 1) == 1 && !this.yellow.alpha()) {
            this.f1427b = (byte) 0;
            return false;
        }
        if (!india()) {
            this.f1427b = (byte) 0;
            return false;
        }
        this.f1427b = (byte) 1;
        return true;
    }

    @Override // Oe.w
    public final Oe.v bravo() {
        return f1425d;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        ab lima = ab.lima();
        lima.mike(this);
        return lima;
    }

    @Override // Oe.v
    public final int delta() {
        int i4 = this.f1428c;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < this.silver.size(); i10++) {
            i5 += F0.e.echo(3, (Oe.v) this.silver.get(i10));
        }
        for (int i11 = 0; i11 < this.teal.size(); i11++) {
            i5 += F0.e.echo(4, (Oe.v) this.teal.get(i11));
        }
        for (int i12 = 0; i12 < this.white.size(); i12++) {
            i5 += F0.e.echo(5, (Oe.v) this.white.get(i12));
        }
        if ((this.red & 1) == 1) {
            i5 += F0.e.echo(30, this.yellow);
        }
        if ((this.red & 2) == 2) {
            i5 += F0.e.echo(32, this.f1426a);
        }
        int size = this.purple.size() + juliet() + i5;
        this.f1428c = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        w.o oVar = new w.o(this);
        for (int i4 = 0; i4 < this.silver.size(); i4++) {
            eVar.zulu(3, (Oe.v) this.silver.get(i4));
        }
        for (int i5 = 0; i5 < this.teal.size(); i5++) {
            eVar.zulu(4, (Oe.v) this.teal.get(i5));
        }
        for (int i10 = 0; i10 < this.white.size(); i10++) {
            eVar.zulu(5, (Oe.v) this.white.get(i10));
        }
        if ((this.red & 1) == 1) {
            eVar.zulu(30, this.yellow);
        }
        if ((this.red & 2) == 2) {
            eVar.zulu(32, this.f1426a);
        }
        oVar.beige(200, eVar);
        eVar.beige(this.purple);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return ab.lima();
    }

    public ac() {
        this.f1427b = (byte) -1;
        this.f1428c = -1;
        this.purple = Oe.e.alpha;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public ac(Oe.f fVar, Oe.h hVar) {
        this.f1427b = (byte) -1;
        this.f1428c = -1;
        List list = Collections.EMPTY_LIST;
        this.silver = list;
        this.teal = list;
        this.white = list;
        this.yellow = aw.yellow;
        this.f1426a = D.teal;
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        boolean z2 = false;
        char c3 = 0;
        while (!z2) {
            try {
                try {
                    int mike = fVar.mike();
                    if (mike != 0) {
                        if (mike == 26) {
                            int i4 = (c3 == true ? 1 : 0) & 1;
                            c3 = c3;
                            if (i4 != 1) {
                                this.silver = new ArrayList();
                                c3 = (c3 == true ? 1 : 0) | 1;
                            }
                            this.silver.add(fVar.foxtrot(y.f1611o, hVar));
                        } else if (mike == 34) {
                            int i5 = (c3 == true ? 1 : 0) & 2;
                            c3 = c3;
                            if (i5 != 2) {
                                this.teal = new ArrayList();
                                c3 = (c3 == true ? 1 : 0) | 2;
                            }
                            this.teal.add(fVar.foxtrot(ag.f1445o, hVar));
                        } else if (mike != 42) {
                            m mVar = null;
                            f fVar2 = null;
                            if (mike == 242) {
                                if ((this.red & 1) == 1) {
                                    aw awVar = this.yellow;
                                    awVar.getClass();
                                    fVar2 = aw.india(awVar);
                                }
                                aw awVar2 = (aw) fVar.foxtrot(aw.f1507a, hVar);
                                this.yellow = awVar2;
                                if (fVar2 != null) {
                                    fVar2.papa(awVar2);
                                    this.yellow = fVar2.lima();
                                }
                                this.red |= 1;
                            } else if (mike != 258) {
                                if (!november(fVar, romeo, hVar, mike)) {
                                }
                            } else {
                                if ((this.red & 2) == 2) {
                                    D d4 = this.f1426a;
                                    d4.getClass();
                                    mVar = new m(2);
                                    mVar.silver = Collections.EMPTY_LIST;
                                    mVar.quebec(d4);
                                }
                                D d9 = (D) fVar.foxtrot(D.white, hVar);
                                this.f1426a = d9;
                                if (mVar != null) {
                                    mVar.quebec(d9);
                                    this.f1426a = mVar.mike();
                                }
                                this.red |= 2;
                            }
                        } else {
                            int i10 = (c3 == true ? 1 : 0) & 4;
                            c3 = c3;
                            if (i10 != 4) {
                                this.white = new ArrayList();
                                c3 = (c3 == true ? 1 : 0) | 4;
                            }
                            this.white.add(fVar.foxtrot(as.f1491i, hVar));
                        }
                    }
                    z2 = true;
                } catch (Throwable th) {
                    if (((c3 == true ? 1 : 0) & 1) == 1) {
                        this.silver = Collections.unmodifiableList(this.silver);
                    }
                    if (((c3 == true ? 1 : 0) & 2) == 2) {
                        this.teal = Collections.unmodifiableList(this.teal);
                    }
                    if (((c3 == true ? 1 : 0) & 4) == 4) {
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
            } catch (InvalidProtocolBufferException e4) {
                throw e4.setUnfinishedMessage(this);
            } catch (IOException e5) {
                throw new InvalidProtocolBufferException(e5.getMessage()).setUnfinishedMessage(this);
            }
        }
        if (((c3 == true ? 1 : 0) & 1) == 1) {
            this.silver = Collections.unmodifiableList(this.silver);
        }
        if (((c3 == true ? 1 : 0) & 2) == 2) {
            this.teal = Collections.unmodifiableList(this.teal);
        }
        if (((c3 == true ? 1 : 0) & 4) == 4) {
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
