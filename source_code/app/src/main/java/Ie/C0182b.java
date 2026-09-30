package Ie;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: Ie.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0182b extends Oe.j implements Oe.w {

    /* renamed from: a, reason: collision with root package name */
    public int f1517a;

    /* renamed from: b, reason: collision with root package name */
    public int f1518b;

    /* renamed from: c, reason: collision with root package name */
    public g f1519c;

    /* renamed from: d, reason: collision with root package name */
    public List f1520d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1521f;
    public int purple;
    public EnumC0183c red;
    public long silver;
    public float teal;
    public double white;
    public int yellow;

    /* JADX WARN: Type inference failed for: r0v0, types: [Ie.b, Oe.j] */
    public static C0182b kilo() {
        ?? jVar = new Oe.j();
        jVar.red = EnumC0183c.BYTE;
        jVar.f1519c = g.yellow;
        jVar.f1520d = Collections.EMPTY_LIST;
        return jVar;
    }

    public final Object clone() {
        C0182b kilo = kilo();
        kilo.lima(juliet());
        return kilo;
    }

    @Override // Oe.j
    public final Oe.v golf() {
        C0184d juliet = juliet();
        if (juliet.alpha()) {
            return juliet;
        }
        throw new UninitializedMessageException(juliet);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
    @Override // Oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Oe.j hotel(Oe.f fVar, Oe.h hVar) {
        C0184d c0184d = null;
        try {
            try {
                C0184d.f1530j.getClass();
                lima(new C0184d(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                C0184d c0184d2 = (C0184d) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    c0184d = c0184d2;
                    if (c0184d != null) {
                        lima(c0184d);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0184d != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        lima((C0184d) oVar);
        return this;
    }

    public final C0184d juliet() {
        C0184d c0184d = new C0184d(this);
        int i4 = this.purple;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        c0184d.red = this.red;
        if ((i4 & 2) == 2) {
            i5 |= 2;
        }
        c0184d.silver = this.silver;
        if ((i4 & 4) == 4) {
            i5 |= 4;
        }
        c0184d.teal = this.teal;
        if ((i4 & 8) == 8) {
            i5 |= 8;
        }
        c0184d.white = this.white;
        if ((i4 & 16) == 16) {
            i5 |= 16;
        }
        c0184d.yellow = this.yellow;
        if ((i4 & 32) == 32) {
            i5 |= 32;
        }
        c0184d.f1531a = this.f1517a;
        if ((i4 & 64) == 64) {
            i5 |= 64;
        }
        c0184d.f1532b = this.f1518b;
        if ((i4 & 128) == 128) {
            i5 |= 128;
        }
        c0184d.f1533c = this.f1519c;
        if ((i4 & Barcode.FORMAT_QR_CODE) == 256) {
            this.f1520d = Collections.unmodifiableList(this.f1520d);
            this.purple &= -257;
        }
        c0184d.f1534d = this.f1520d;
        if ((i4 & 512) == 512) {
            i5 |= Barcode.FORMAT_QR_CODE;
        }
        c0184d.e = this.e;
        if ((i4 & Barcode.FORMAT_UPC_E) == 1024) {
            i5 |= 512;
        }
        c0184d.f1535f = this.f1521f;
        c0184d.purple = i5;
        return c0184d;
    }

    public final void lima(C0184d c0184d) {
        g gVar;
        if (c0184d == C0184d.f1529i) {
            return;
        }
        if ((c0184d.purple & 1) == 1) {
            EnumC0183c enumC0183c = c0184d.red;
            enumC0183c.getClass();
            this.purple = 1 | this.purple;
            this.red = enumC0183c;
        }
        int i4 = c0184d.purple;
        if ((i4 & 2) == 2) {
            long j5 = c0184d.silver;
            this.purple |= 2;
            this.silver = j5;
        }
        if ((i4 & 4) == 4) {
            float f5 = c0184d.teal;
            this.purple = 4 | this.purple;
            this.teal = f5;
        }
        if ((i4 & 8) == 8) {
            double d4 = c0184d.white;
            this.purple |= 8;
            this.white = d4;
        }
        if ((i4 & 16) == 16) {
            int i5 = c0184d.yellow;
            this.purple = 16 | this.purple;
            this.yellow = i5;
        }
        if ((i4 & 32) == 32) {
            int i10 = c0184d.f1531a;
            this.purple = 32 | this.purple;
            this.f1517a = i10;
        }
        if ((i4 & 64) == 64) {
            int i11 = c0184d.f1532b;
            this.purple = 64 | this.purple;
            this.f1518b = i11;
        }
        if ((i4 & 128) == 128) {
            g gVar2 = c0184d.f1533c;
            if ((this.purple & 128) == 128 && (gVar = this.f1519c) != g.yellow) {
                f fVar = new f(0);
                fVar.silver = Collections.EMPTY_LIST;
                fVar.oscar(gVar);
                fVar.oscar(gVar2);
                this.f1519c = fVar.kilo();
            } else {
                this.f1519c = gVar2;
            }
            this.purple |= 128;
        }
        if (!c0184d.f1534d.isEmpty()) {
            if (this.f1520d.isEmpty()) {
                this.f1520d = c0184d.f1534d;
                this.purple &= -257;
            } else {
                if ((this.purple & Barcode.FORMAT_QR_CODE) != 256) {
                    this.f1520d = new ArrayList(this.f1520d);
                    this.purple |= Barcode.FORMAT_QR_CODE;
                }
                this.f1520d.addAll(c0184d.f1534d);
            }
        }
        int i12 = c0184d.purple;
        if ((i12 & Barcode.FORMAT_QR_CODE) == 256) {
            int i13 = c0184d.e;
            this.purple |= 512;
            this.e = i13;
        }
        if ((i12 & 512) == 512) {
            int i14 = c0184d.f1535f;
            this.purple |= Barcode.FORMAT_UPC_E;
            this.f1521f = i14;
        }
        this.alpha = this.alpha.bravo(c0184d.alpha);
    }
}
