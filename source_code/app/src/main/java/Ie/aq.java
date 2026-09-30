package Ie;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class aq extends Oe.l {

    /* renamed from: m, reason: collision with root package name */
    public static final aq f1472m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0181a f1473n = new C0181a(16);

    /* renamed from: a, reason: collision with root package name */
    public int f1474a;

    /* renamed from: b, reason: collision with root package name */
    public int f1475b;

    /* renamed from: c, reason: collision with root package name */
    public int f1476c;

    /* renamed from: d, reason: collision with root package name */
    public int f1477d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public aq f1478f;

    /* renamed from: g, reason: collision with root package name */
    public int f1479g;

    /* renamed from: h, reason: collision with root package name */
    public aq f1480h;

    /* renamed from: i, reason: collision with root package name */
    public int f1481i;

    /* renamed from: j, reason: collision with root package name */
    public int f1482j;

    /* renamed from: k, reason: collision with root package name */
    public byte f1483k;

    /* renamed from: l, reason: collision with root package name */
    public int f1484l;
    public final Oe.e purple;
    public int red;
    public List silver;
    public boolean teal;
    public int white;
    public aq yellow;

    static {
        aq aqVar = new aq();
        f1472m = aqVar;
        aqVar.quebec();
    }

    public aq(ap apVar) {
        super(apVar);
        this.f1483k = (byte) -1;
        this.f1484l = -1;
        this.purple = apVar.alpha;
    }

    public static ap romeo(aq aqVar) {
        ap lima = ap.lima();
        lima.mike(aqVar);
        return lima;
    }

    @Override // Oe.w
    public final boolean alpha() {
        byte b2 = this.f1483k;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i4 = 0; i4 < this.silver.size(); i4++) {
            if (!((ao) this.silver.get(i4)).alpha()) {
                this.f1483k = (byte) 0;
                return false;
            }
        }
        if ((this.red & 4) == 4 && !this.yellow.alpha()) {
            this.f1483k = (byte) 0;
            return false;
        }
        if ((this.red & Barcode.FORMAT_QR_CODE) == 256 && !this.f1478f.alpha()) {
            this.f1483k = (byte) 0;
            return false;
        }
        if ((this.red & Barcode.FORMAT_UPC_E) == 1024 && !this.f1480h.alpha()) {
            this.f1483k = (byte) 0;
            return false;
        }
        if (!india()) {
            this.f1483k = (byte) 0;
            return false;
        }
        this.f1483k = (byte) 1;
        return true;
    }

    @Override // Oe.w
    public final Oe.v bravo() {
        return f1472m;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        int i5 = this.f1484l;
        if (i5 != -1) {
            return i5;
        }
        if ((this.red & 4096) == 4096) {
            i4 = F0.e.charlie(1, this.f1482j);
        } else {
            i4 = 0;
        }
        for (int i10 = 0; i10 < this.silver.size(); i10++) {
            i4 += F0.e.echo(2, (Oe.v) this.silver.get(i10));
        }
        if ((this.red & 1) == 1) {
            i4 += F0.e.india(3) + 1;
        }
        if ((this.red & 2) == 2) {
            i4 += F0.e.charlie(4, this.white);
        }
        if ((this.red & 4) == 4) {
            i4 += F0.e.echo(5, this.yellow);
        }
        if ((this.red & 16) == 16) {
            i4 += F0.e.charlie(6, this.f1475b);
        }
        if ((this.red & 32) == 32) {
            i4 += F0.e.charlie(7, this.f1476c);
        }
        if ((this.red & 8) == 8) {
            i4 += F0.e.charlie(8, this.f1474a);
        }
        if ((this.red & 64) == 64) {
            i4 += F0.e.charlie(9, this.f1477d);
        }
        if ((this.red & Barcode.FORMAT_QR_CODE) == 256) {
            i4 += F0.e.echo(10, this.f1478f);
        }
        if ((this.red & 512) == 512) {
            i4 += F0.e.charlie(11, this.f1479g);
        }
        if ((this.red & 128) == 128) {
            i4 += F0.e.charlie(12, this.e);
        }
        if ((this.red & Barcode.FORMAT_UPC_E) == 1024) {
            i4 += F0.e.echo(13, this.f1480h);
        }
        if ((this.red & 2048) == 2048) {
            i4 += F0.e.charlie(14, this.f1481i);
        }
        int size = this.purple.size() + juliet() + i4;
        this.f1484l = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        w.o oVar = new w.o(this);
        if ((this.red & 4096) == 4096) {
            eVar.xray(1, this.f1482j);
        }
        for (int i4 = 0; i4 < this.silver.size(); i4++) {
            eVar.zulu(2, (Oe.v) this.silver.get(i4));
        }
        if ((this.red & 1) == 1) {
            boolean z2 = this.teal;
            eVar.cyan(3, 0);
            eVar.azure(z2 ? 1 : 0);
        }
        if ((this.red & 2) == 2) {
            eVar.xray(4, this.white);
        }
        if ((this.red & 4) == 4) {
            eVar.zulu(5, this.yellow);
        }
        if ((this.red & 16) == 16) {
            eVar.xray(6, this.f1475b);
        }
        if ((this.red & 32) == 32) {
            eVar.xray(7, this.f1476c);
        }
        if ((this.red & 8) == 8) {
            eVar.xray(8, this.f1474a);
        }
        if ((this.red & 64) == 64) {
            eVar.xray(9, this.f1477d);
        }
        if ((this.red & Barcode.FORMAT_QR_CODE) == 256) {
            eVar.zulu(10, this.f1478f);
        }
        if ((this.red & 512) == 512) {
            eVar.xray(11, this.f1479g);
        }
        if ((this.red & 128) == 128) {
            eVar.xray(12, this.e);
        }
        if ((this.red & Barcode.FORMAT_UPC_E) == 1024) {
            eVar.zulu(13, this.f1480h);
        }
        if ((this.red & 2048) == 2048) {
            eVar.xray(14, this.f1481i);
        }
        oVar.beige(200, eVar);
        eVar.beige(this.purple);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return ap.lima();
    }

    public final boolean papa() {
        if ((this.red & 16) == 16) {
            return true;
        }
        return false;
    }

    public final void quebec() {
        this.silver = Collections.EMPTY_LIST;
        this.teal = false;
        this.white = 0;
        aq aqVar = f1472m;
        this.yellow = aqVar;
        this.f1474a = 0;
        this.f1475b = 0;
        this.f1476c = 0;
        this.f1477d = 0;
        this.e = 0;
        this.f1478f = aqVar;
        this.f1479g = 0;
        this.f1480h = aqVar;
        this.f1481i = 0;
        this.f1482j = 0;
    }

    @Override // Oe.v
    /* renamed from: sierra, reason: merged with bridge method [inline-methods] */
    public final ap charlie() {
        return romeo(this);
    }

    public aq() {
        this.f1483k = (byte) -1;
        this.f1484l = -1;
        this.purple = Oe.e.alpha;
    }

    public aq(Oe.f fVar, Oe.h hVar) {
        this.f1483k = (byte) -1;
        this.f1484l = -1;
        quebec();
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        boolean z2 = false;
        boolean z10 = false;
        while (!z2) {
            try {
                try {
                    int mike = fVar.mike();
                    C0181a c0181a = f1473n;
                    ap apVar = null;
                    switch (mike) {
                        case 0:
                            break;
                        case 8:
                            this.red |= 4096;
                            this.f1482j = fVar.juliet();
                            continue;
                        case 18:
                            if (!z10) {
                                this.silver = new ArrayList();
                                z10 = true;
                            }
                            this.silver.add(fVar.foxtrot(ao.f1461b, hVar));
                            continue;
                        case 24:
                            this.red |= 1;
                            this.teal = fVar.kilo() != 0;
                            continue;
                        case 32:
                            this.red |= 2;
                            this.white = fVar.juliet();
                            continue;
                        case 42:
                            if ((this.red & 4) == 4) {
                                aq aqVar = this.yellow;
                                aqVar.getClass();
                                apVar = romeo(aqVar);
                            }
                            aq aqVar2 = (aq) fVar.foxtrot(c0181a, hVar);
                            this.yellow = aqVar2;
                            if (apVar != null) {
                                apVar.mike(aqVar2);
                                this.yellow = apVar.kilo();
                            }
                            this.red |= 4;
                            continue;
                        case 48:
                            this.red |= 16;
                            this.f1475b = fVar.juliet();
                            continue;
                        case 56:
                            this.red |= 32;
                            this.f1476c = fVar.juliet();
                            continue;
                        case 64:
                            this.red |= 8;
                            this.f1474a = fVar.juliet();
                            continue;
                        case 72:
                            this.red |= 64;
                            this.f1477d = fVar.juliet();
                            continue;
                        case 82:
                            if ((this.red & Barcode.FORMAT_QR_CODE) == 256) {
                                aq aqVar3 = this.f1478f;
                                aqVar3.getClass();
                                apVar = romeo(aqVar3);
                            }
                            aq aqVar4 = (aq) fVar.foxtrot(c0181a, hVar);
                            this.f1478f = aqVar4;
                            if (apVar != null) {
                                apVar.mike(aqVar4);
                                this.f1478f = apVar.kilo();
                            }
                            this.red |= Barcode.FORMAT_QR_CODE;
                            continue;
                        case 88:
                            this.red |= 512;
                            this.f1479g = fVar.juliet();
                            continue;
                        case 96:
                            this.red |= 128;
                            this.e = fVar.juliet();
                            continue;
                        case 106:
                            if ((this.red & Barcode.FORMAT_UPC_E) == 1024) {
                                aq aqVar5 = this.f1480h;
                                aqVar5.getClass();
                                apVar = romeo(aqVar5);
                            }
                            aq aqVar6 = (aq) fVar.foxtrot(c0181a, hVar);
                            this.f1480h = aqVar6;
                            if (apVar != null) {
                                apVar.mike(aqVar6);
                                this.f1480h = apVar.kilo();
                            }
                            this.red |= Barcode.FORMAT_UPC_E;
                            continue;
                        case 112:
                            this.red |= 2048;
                            this.f1481i = fVar.juliet();
                            continue;
                        default:
                            if (!november(fVar, romeo, hVar, mike)) {
                                break;
                            } else {
                                break;
                            }
                    }
                    z2 = true;
                } catch (Throwable th) {
                    if (z10) {
                        this.silver = Collections.unmodifiableList(this.silver);
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
        if (z10) {
            this.silver = Collections.unmodifiableList(this.silver);
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
