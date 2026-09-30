package Ie;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class as extends Oe.l {

    /* renamed from: h, reason: collision with root package name */
    public static final as f1490h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0181a f1491i = new C0181a(18);

    /* renamed from: a, reason: collision with root package name */
    public int f1492a;

    /* renamed from: b, reason: collision with root package name */
    public aq f1493b;

    /* renamed from: c, reason: collision with root package name */
    public int f1494c;

    /* renamed from: d, reason: collision with root package name */
    public List f1495d;
    public List e;

    /* renamed from: f, reason: collision with root package name */
    public byte f1496f;

    /* renamed from: g, reason: collision with root package name */
    public int f1497g;
    public final Oe.e purple;
    public int red;
    public int silver;
    public int teal;
    public List white;
    public aq yellow;

    static {
        as asVar = new as();
        f1490h = asVar;
        asVar.silver = 6;
        asVar.teal = 0;
        List list = Collections.EMPTY_LIST;
        asVar.white = list;
        aq aqVar = aq.f1472m;
        asVar.yellow = aqVar;
        asVar.f1492a = 0;
        asVar.f1493b = aqVar;
        asVar.f1494c = 0;
        asVar.f1495d = list;
        asVar.e = list;
    }

    public as(ar arVar) {
        super(arVar);
        this.f1496f = (byte) -1;
        this.f1497g = -1;
        this.purple = arVar.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        byte b2 = this.f1496f;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.red & 2) == 2) {
            for (int i4 = 0; i4 < this.white.size(); i4++) {
                if (!((av) this.white.get(i4)).alpha()) {
                    this.f1496f = (byte) 0;
                    return false;
                }
            }
            if ((this.red & 4) == 4 && !this.yellow.alpha()) {
                this.f1496f = (byte) 0;
                return false;
            }
            if ((this.red & 16) == 16 && !this.f1493b.alpha()) {
                this.f1496f = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < this.f1495d.size(); i5++) {
                if (!((g) this.f1495d.get(i5)).alpha()) {
                    this.f1496f = (byte) 0;
                    return false;
                }
            }
            if (!india()) {
                this.f1496f = (byte) 0;
                return false;
            }
            this.f1496f = (byte) 1;
            return true;
        }
        this.f1496f = (byte) 0;
        return false;
    }

    @Override // Oe.w
    public final Oe.v bravo() {
        return f1490h;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        ar lima = ar.lima();
        lima.mike(this);
        return lima;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        int i5 = this.f1497g;
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
        for (int i10 = 0; i10 < this.white.size(); i10++) {
            i4 += F0.e.echo(3, (Oe.v) this.white.get(i10));
        }
        if ((this.red & 4) == 4) {
            i4 += F0.e.echo(4, this.yellow);
        }
        if ((this.red & 8) == 8) {
            i4 += F0.e.charlie(5, this.f1492a);
        }
        if ((this.red & 16) == 16) {
            i4 += F0.e.echo(6, this.f1493b);
        }
        if ((this.red & 32) == 32) {
            i4 += F0.e.charlie(7, this.f1494c);
        }
        for (int i11 = 0; i11 < this.f1495d.size(); i11++) {
            i4 += F0.e.echo(8, (Oe.v) this.f1495d.get(i11));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.e.size(); i13++) {
            i12 += F0.e.delta(((Integer) this.e.get(i13)).intValue());
        }
        int size = this.purple.size() + juliet() + (this.e.size() * 2) + i4 + i12;
        this.f1497g = size;
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
        for (int i4 = 0; i4 < this.white.size(); i4++) {
            eVar.zulu(3, (Oe.v) this.white.get(i4));
        }
        if ((this.red & 4) == 4) {
            eVar.zulu(4, this.yellow);
        }
        if ((this.red & 8) == 8) {
            eVar.xray(5, this.f1492a);
        }
        if ((this.red & 16) == 16) {
            eVar.zulu(6, this.f1493b);
        }
        if ((this.red & 32) == 32) {
            eVar.xray(7, this.f1494c);
        }
        for (int i5 = 0; i5 < this.f1495d.size(); i5++) {
            eVar.zulu(8, (Oe.v) this.f1495d.get(i5));
        }
        for (int i10 = 0; i10 < this.e.size(); i10++) {
            eVar.xray(31, ((Integer) this.e.get(i10)).intValue());
        }
        oVar.beige(200, eVar);
        eVar.beige(this.purple);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return ar.lima();
    }

    public as() {
        this.f1496f = (byte) -1;
        this.f1497g = -1;
        this.purple = Oe.e.alpha;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0037. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public as(Oe.f fVar, Oe.h hVar) {
        this.f1496f = (byte) -1;
        this.f1497g = -1;
        this.silver = 6;
        boolean z2 = false;
        this.teal = 0;
        List list = Collections.EMPTY_LIST;
        this.white = list;
        aq aqVar = aq.f1472m;
        this.yellow = aqVar;
        this.f1492a = 0;
        this.f1493b = aqVar;
        this.f1494c = 0;
        this.f1495d = list;
        this.e = list;
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        int i4 = 0;
        while (true) {
            ?? r5 = 128;
            if (!z2) {
                try {
                    try {
                        int mike = fVar.mike();
                        ap apVar = null;
                        switch (mike) {
                            case 0:
                                z2 = true;
                            case 8:
                                this.red |= 1;
                                this.silver = fVar.juliet();
                            case 16:
                                this.red |= 2;
                                this.teal = fVar.juliet();
                            case 26:
                                if ((i4 & 4) != 4) {
                                    this.white = new ArrayList();
                                    i4 |= 4;
                                }
                                this.white.add(fVar.foxtrot(av.f1502g, hVar));
                            case 34:
                                if ((this.red & 4) == 4) {
                                    aq aqVar2 = this.yellow;
                                    aqVar2.getClass();
                                    apVar = aq.romeo(aqVar2);
                                }
                                aq aqVar3 = (aq) fVar.foxtrot(aq.f1473n, hVar);
                                this.yellow = aqVar3;
                                if (apVar != null) {
                                    apVar.mike(aqVar3);
                                    this.yellow = apVar.kilo();
                                }
                                this.red |= 4;
                            case 40:
                                this.red |= 8;
                                this.f1492a = fVar.juliet();
                            case 50:
                                if ((this.red & 16) == 16) {
                                    aq aqVar4 = this.f1493b;
                                    aqVar4.getClass();
                                    apVar = aq.romeo(aqVar4);
                                }
                                aq aqVar5 = (aq) fVar.foxtrot(aq.f1473n, hVar);
                                this.f1493b = aqVar5;
                                if (apVar != null) {
                                    apVar.mike(aqVar5);
                                    this.f1493b = apVar.kilo();
                                }
                                this.red |= 16;
                            case 56:
                                this.red |= 32;
                                this.f1494c = fVar.juliet();
                            case 66:
                                if ((i4 & 128) != 128) {
                                    this.f1495d = new ArrayList();
                                    i4 |= 128;
                                }
                                this.f1495d.add(fVar.foxtrot(g.f1539a, hVar));
                            case 248:
                                if ((i4 & Barcode.FORMAT_QR_CODE) != 256) {
                                    this.e = new ArrayList();
                                    i4 |= Barcode.FORMAT_QR_CODE;
                                }
                                this.e.add(Integer.valueOf(fVar.juliet()));
                            case 250:
                                int charlie = fVar.charlie(fVar.juliet());
                                if ((i4 & Barcode.FORMAT_QR_CODE) != 256 && fVar.alpha() > 0) {
                                    this.e = new ArrayList();
                                    i4 |= Barcode.FORMAT_QR_CODE;
                                }
                                while (fVar.alpha() > 0) {
                                    this.e.add(Integer.valueOf(fVar.juliet()));
                                }
                                fVar.bravo(charlie);
                                break;
                            default:
                                r5 = november(fVar, romeo, hVar, mike);
                                if (r5 == 0) {
                                    z2 = true;
                                }
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e4) {
                        throw new InvalidProtocolBufferException(e4.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i4 & 4) == 4) {
                        this.white = Collections.unmodifiableList(this.white);
                    }
                    if ((i4 & 128) == r5) {
                        this.f1495d = Collections.unmodifiableList(this.f1495d);
                    }
                    if ((i4 & Barcode.FORMAT_QR_CODE) == 256) {
                        this.e = Collections.unmodifiableList(this.e);
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
            } else {
                if ((i4 & 4) == 4) {
                    this.white = Collections.unmodifiableList(this.white);
                }
                if ((i4 & 128) == 128) {
                    this.f1495d = Collections.unmodifiableList(this.f1495d);
                }
                if ((i4 & Barcode.FORMAT_QR_CODE) == 256) {
                    this.e = Collections.unmodifiableList(this.e);
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
                return;
            }
        }
    }
}
