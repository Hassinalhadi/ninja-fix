package Le;

import Ie.C0181a;
import Oe.o;
import Oe.u;
import Oe.w;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class i extends o implements w {

    /* renamed from: f, reason: collision with root package name */
    public static final i f1844f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0181a f1845g = new C0181a(28);

    /* renamed from: a, reason: collision with root package name */
    public int f1846a;
    public final Oe.e alpha;

    /* renamed from: b, reason: collision with root package name */
    public List f1847b;

    /* renamed from: c, reason: collision with root package name */
    public int f1848c;

    /* renamed from: d, reason: collision with root package name */
    public byte f1849d;
    public int e;
    public int purple;
    public int red;
    public int silver;
    public Object teal;
    public h white;
    public List yellow;

    static {
        i iVar = new i();
        f1844f = iVar;
        iVar.red = 1;
        iVar.silver = 0;
        iVar.teal = "";
        iVar.white = h.NONE;
        List list = Collections.EMPTY_LIST;
        iVar.yellow = list;
        iVar.f1847b = list;
    }

    public i() {
        this.f1846a = -1;
        this.f1848c = -1;
        this.f1849d = (byte) -1;
        this.e = -1;
        this.alpha = Oe.e.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        if (this.f1849d == 1) {
            return true;
        }
        this.f1849d = (byte) 1;
        return true;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        g kilo = g.kilo();
        kilo.lima(this);
        return kilo;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        Oe.e eVar;
        int i5 = this.e;
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
        if ((this.purple & 8) == 8) {
            i4 += F0.e.bravo(3, this.white.alpha);
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.yellow.size(); i11++) {
            i10 += F0.e.delta(((Integer) this.yellow.get(i11)).intValue());
        }
        int i12 = i4 + i10;
        if (!this.yellow.isEmpty()) {
            i12 = i12 + 1 + F0.e.delta(i10);
        }
        this.f1846a = i10;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f1847b.size(); i14++) {
            i13 += F0.e.delta(((Integer) this.f1847b.get(i14)).intValue());
        }
        int i15 = i12 + i13;
        if (!this.f1847b.isEmpty()) {
            i15 = i15 + 1 + F0.e.delta(i13);
        }
        this.f1848c = i13;
        if ((this.purple & 4) == 4) {
            Object obj = this.teal;
            if (obj instanceof String) {
                try {
                    eVar = new u(((String) obj).getBytes("UTF-8"));
                    this.teal = eVar;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported?", e);
                }
            } else {
                eVar = (Oe.e) obj;
            }
            i15 += eVar.size() + F0.e.golf(eVar.size()) + F0.e.india(6);
        }
        int size = this.alpha.size() + i15;
        this.e = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        Oe.e eVar2;
        delta();
        if ((this.purple & 1) == 1) {
            eVar.xray(1, this.red);
        }
        if ((this.purple & 2) == 2) {
            eVar.xray(2, this.silver);
        }
        if ((this.purple & 8) == 8) {
            eVar.whiskey(3, this.white.alpha);
        }
        if (this.yellow.size() > 0) {
            eVar.coral(34);
            eVar.coral(this.f1846a);
        }
        for (int i4 = 0; i4 < this.yellow.size(); i4++) {
            eVar.yankee(((Integer) this.yellow.get(i4)).intValue());
        }
        if (this.f1847b.size() > 0) {
            eVar.coral(42);
            eVar.coral(this.f1848c);
        }
        for (int i5 = 0; i5 < this.f1847b.size(); i5++) {
            eVar.yankee(((Integer) this.f1847b.get(i5)).intValue());
        }
        if ((this.purple & 4) == 4) {
            Object obj = this.teal;
            if (obj instanceof String) {
                try {
                    eVar2 = new u(((String) obj).getBytes("UTF-8"));
                    this.teal = eVar2;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported?", e);
                }
            } else {
                eVar2 = (Oe.e) obj;
            }
            eVar.cyan(6, 2);
            eVar.coral(eVar2.size());
            eVar.beige(eVar2);
        }
        eVar.beige(this.alpha);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return g.kilo();
    }

    public i(g gVar) {
        this.f1846a = -1;
        this.f1848c = -1;
        this.f1849d = (byte) -1;
        this.e = -1;
        this.alpha = gVar.alpha;
    }

    public i(Oe.f fVar) {
        h hVar;
        this.f1846a = -1;
        this.f1848c = -1;
        this.f1849d = (byte) -1;
        this.e = -1;
        this.red = 1;
        boolean z2 = false;
        this.silver = 0;
        this.teal = "";
        h hVar2 = h.NONE;
        this.white = hVar2;
        List list = Collections.EMPTY_LIST;
        this.yellow = list;
        this.f1847b = list;
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        int i4 = 0;
        while (!z2) {
            try {
                try {
                    try {
                        int mike = fVar.mike();
                        if (mike != 0) {
                            if (mike == 8) {
                                this.purple |= 1;
                                this.red = fVar.juliet();
                            } else if (mike == 16) {
                                this.purple |= 2;
                                this.silver = fVar.juliet();
                            } else if (mike == 24) {
                                int juliet = fVar.juliet();
                                if (juliet == 0) {
                                    hVar = hVar2;
                                } else if (juliet != 1) {
                                    hVar = juliet != 2 ? null : h.DESC_TO_CLASS_ID;
                                } else {
                                    hVar = h.INTERNAL_TO_CLASS_ID;
                                }
                                if (hVar == null) {
                                    romeo.coral(mike);
                                    romeo.coral(juliet);
                                } else {
                                    this.purple |= 8;
                                    this.white = hVar;
                                }
                            } else if (mike == 32) {
                                if ((i4 & 16) != 16) {
                                    this.yellow = new ArrayList();
                                    i4 |= 16;
                                }
                                this.yellow.add(Integer.valueOf(fVar.juliet()));
                            } else if (mike == 34) {
                                int charlie = fVar.charlie(fVar.juliet());
                                if ((i4 & 16) != 16 && fVar.alpha() > 0) {
                                    this.yellow = new ArrayList();
                                    i4 |= 16;
                                }
                                while (fVar.alpha() > 0) {
                                    this.yellow.add(Integer.valueOf(fVar.juliet()));
                                }
                                fVar.bravo(charlie);
                            } else if (mike == 40) {
                                if ((i4 & 32) != 32) {
                                    this.f1847b = new ArrayList();
                                    i4 |= 32;
                                }
                                this.f1847b.add(Integer.valueOf(fVar.juliet()));
                            } else if (mike == 42) {
                                int charlie2 = fVar.charlie(fVar.juliet());
                                if ((i4 & 32) != 32 && fVar.alpha() > 0) {
                                    this.f1847b = new ArrayList();
                                    i4 |= 32;
                                }
                                while (fVar.alpha() > 0) {
                                    this.f1847b.add(Integer.valueOf(fVar.juliet()));
                                }
                                fVar.bravo(charlie2);
                            } else if (mike != 50) {
                                if (!fVar.papa(mike, romeo)) {
                                }
                            } else {
                                u delta = fVar.delta();
                                this.purple |= 4;
                                this.teal = delta;
                            }
                        }
                        z2 = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    }
                } catch (IOException e4) {
                    throw new InvalidProtocolBufferException(e4.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if ((i4 & 16) == 16) {
                    this.yellow = Collections.unmodifiableList(this.yellow);
                }
                if ((i4 & 32) == 32) {
                    this.f1847b = Collections.unmodifiableList(this.f1847b);
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
        if ((i4 & 16) == 16) {
            this.yellow = Collections.unmodifiableList(this.yellow);
        }
        if ((i4 & 32) == 32) {
            this.f1847b = Collections.unmodifiableList(this.f1847b);
        }
        try {
            romeo.juliet();
        } catch (IOException unused2) {
        } finally {
            this.alpha = dVar.foxtrot();
        }
    }
}
