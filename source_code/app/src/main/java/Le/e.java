package Le;

import Ie.C0181a;
import Oe.o;
import Oe.w;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class e extends o implements w {

    /* renamed from: c, reason: collision with root package name */
    public static final e f1839c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0181a f1840d = new C0181a(26);

    /* renamed from: a, reason: collision with root package name */
    public byte f1841a;
    public final Oe.e alpha;

    /* renamed from: b, reason: collision with root package name */
    public int f1842b;
    public int purple;
    public b red;
    public c silver;
    public c teal;
    public c white;
    public c yellow;

    static {
        e eVar = new e();
        f1839c = eVar;
        eVar.red = b.yellow;
        c cVar = c.yellow;
        eVar.silver = cVar;
        eVar.teal = cVar;
        eVar.white = cVar;
        eVar.yellow = cVar;
    }

    public e() {
        this.f1841a = (byte) -1;
        this.f1842b = -1;
        this.alpha = Oe.e.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        if (this.f1841a == 1) {
            return true;
        }
        this.f1841a = (byte) 1;
        return true;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        d kilo = d.kilo();
        kilo.lima(this);
        return kilo;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        int i5 = this.f1842b;
        if (i5 != -1) {
            return i5;
        }
        if ((this.purple & 1) == 1) {
            i4 = F0.e.echo(1, this.red);
        } else {
            i4 = 0;
        }
        if ((this.purple & 2) == 2) {
            i4 += F0.e.echo(2, this.silver);
        }
        if ((this.purple & 4) == 4) {
            i4 += F0.e.echo(3, this.teal);
        }
        if ((this.purple & 8) == 8) {
            i4 += F0.e.echo(4, this.white);
        }
        if ((this.purple & 16) == 16) {
            i4 += F0.e.echo(5, this.yellow);
        }
        int size = this.alpha.size() + i4;
        this.f1842b = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        if ((this.purple & 1) == 1) {
            eVar.zulu(1, this.red);
        }
        if ((this.purple & 2) == 2) {
            eVar.zulu(2, this.silver);
        }
        if ((this.purple & 4) == 4) {
            eVar.zulu(3, this.teal);
        }
        if ((this.purple & 8) == 8) {
            eVar.zulu(4, this.white);
        }
        if ((this.purple & 16) == 16) {
            eVar.zulu(5, this.yellow);
        }
        eVar.beige(this.alpha);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return d.kilo();
    }

    public e(d dVar) {
        this.f1841a = (byte) -1;
        this.f1842b = -1;
        this.alpha = dVar.alpha;
    }

    public e(Oe.f fVar, Oe.h hVar) {
        this.f1841a = (byte) -1;
        this.f1842b = -1;
        this.red = b.yellow;
        c cVar = c.yellow;
        this.silver = cVar;
        this.teal = cVar;
        this.white = cVar;
        this.yellow = cVar;
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        boolean z2 = false;
        while (!z2) {
            try {
                try {
                    int mike = fVar.mike();
                    if (mike != 0) {
                        a aVar = null;
                        if (mike == 10) {
                            if ((this.purple & 1) == 1) {
                                b bVar = this.red;
                                bVar.getClass();
                                aVar = new a(0);
                                aVar.lima(bVar);
                            }
                            b bVar2 = (b) fVar.foxtrot(b.f1837a, hVar);
                            this.red = bVar2;
                            if (aVar != null) {
                                aVar.lima(bVar2);
                                this.red = aVar.juliet();
                            }
                            this.purple |= 1;
                        } else if (mike == 18) {
                            if ((this.purple & 2) == 2) {
                                c cVar2 = this.silver;
                                cVar2.getClass();
                                aVar = c.india(cVar2);
                            }
                            c cVar3 = (c) fVar.foxtrot(c.f1838a, hVar);
                            this.silver = cVar3;
                            if (aVar != null) {
                                aVar.mike(cVar3);
                                this.silver = aVar.kilo();
                            }
                            this.purple |= 2;
                        } else if (mike == 26) {
                            if ((this.purple & 4) == 4) {
                                c cVar4 = this.teal;
                                cVar4.getClass();
                                aVar = c.india(cVar4);
                            }
                            c cVar5 = (c) fVar.foxtrot(c.f1838a, hVar);
                            this.teal = cVar5;
                            if (aVar != null) {
                                aVar.mike(cVar5);
                                this.teal = aVar.kilo();
                            }
                            this.purple |= 4;
                        } else if (mike == 34) {
                            if ((this.purple & 8) == 8) {
                                c cVar6 = this.white;
                                cVar6.getClass();
                                aVar = c.india(cVar6);
                            }
                            c cVar7 = (c) fVar.foxtrot(c.f1838a, hVar);
                            this.white = cVar7;
                            if (aVar != null) {
                                aVar.mike(cVar7);
                                this.white = aVar.kilo();
                            }
                            this.purple |= 8;
                        } else if (mike != 42) {
                            if (!fVar.papa(mike, romeo)) {
                            }
                        } else {
                            if ((this.purple & 16) == 16) {
                                c cVar8 = this.yellow;
                                cVar8.getClass();
                                aVar = c.india(cVar8);
                            }
                            c cVar9 = (c) fVar.foxtrot(c.f1838a, hVar);
                            this.yellow = cVar9;
                            if (aVar != null) {
                                aVar.mike(cVar9);
                                this.yellow = aVar.kilo();
                            }
                            this.purple |= 16;
                        }
                    }
                    z2 = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e4) {
                    throw new InvalidProtocolBufferException(e4.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                try {
                    romeo.juliet();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    throw th2;
                }
                throw th;
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
