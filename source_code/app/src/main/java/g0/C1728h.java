package g0;

import a0.AbstractC0358l;
import a0.AbstractC0362p;
import a0.C0354h;
import a0.C0356j;
import android.graphics.Path;
import java.util.List;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1728h extends ad {
    public AbstractC0362p bravo;
    public float foxtrot;
    public AbstractC0362p golf;
    public float kilo;
    public float mike;
    public boolean papa;
    public c0.h quebec;
    public final C0354h romeo;
    public C0354h sierra;
    public final Object tango;
    public float charlie = 1.0f;
    public List delta = ah.alpha;
    public float echo = 1.0f;
    public int hotel = 0;
    public int india = 0;
    public float juliet = 4.0f;
    public float lima = 1.0f;
    public boolean november = true;
    public boolean oscar = true;

    public C1728h() {
        C0354h alpha = AbstractC0358l.alpha();
        this.romeo = alpha;
        this.sierra = alpha;
        this.tango = LazyKt.alpha(kotlin.i.purple, C1727g.purple);
    }

    @Override // g0.ad
    public final void alpha(c0.d dVar) {
        c0.h hVar;
        if (this.november) {
            ac.bravo(this.delta, this.romeo);
            echo();
        } else if (this.papa) {
            echo();
        }
        this.november = false;
        this.papa = false;
        AbstractC0362p abstractC0362p = this.bravo;
        if (abstractC0362p != null) {
            ao.ad.kilo(dVar, this.sierra, abstractC0362p, this.charlie, null, 56);
        }
        AbstractC0362p abstractC0362p2 = this.golf;
        if (abstractC0362p2 != null) {
            c0.h hVar2 = this.quebec;
            if (!this.oscar && hVar2 != null) {
                hVar = hVar2;
            } else {
                c0.h hVar3 = new c0.h(this.foxtrot, this.juliet, this.hotel, this.india, null, 16);
                this.quebec = hVar3;
                this.oscar = false;
                hVar = hVar3;
            }
            ao.ad.kilo(dVar, this.sierra, abstractC0362p2, this.echo, hVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    public final void echo() {
        int i4;
        Path path;
        float f5 = this.kilo;
        C0354h c0354h = this.romeo;
        if (f5 == 0.0f && this.lima == 1.0f) {
            this.sierra = c0354h;
            return;
        }
        if (Intrinsics.areEqual(this.sierra, c0354h)) {
            this.sierra = AbstractC0358l.alpha();
        } else {
            if (this.sierra.alpha.getFillType() == Path.FillType.EVEN_ODD) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            this.sierra.alpha.rewind();
            this.sierra.echo(i4);
        }
        ?? r02 = this.tango;
        C0356j c0356j = (C0356j) r02.getValue();
        if (c0354h != null) {
            c0356j.getClass();
            path = c0354h.alpha;
        } else {
            path = null;
        }
        c0356j.alpha.setPath(path, false);
        float length = ((C0356j) r02.getValue()).alpha.getLength();
        float f10 = this.kilo;
        float f11 = this.mike;
        float f12 = ((f10 + f11) % 1.0f) * length;
        float f13 = ((this.lima + f11) % 1.0f) * length;
        if (f12 > f13) {
            ((C0356j) r02.getValue()).alpha(f12, length, this.sierra);
            ((C0356j) r02.getValue()).alpha(0.0f, f13, this.sierra);
        } else {
            ((C0356j) r02.getValue()).alpha(f12, f13, this.sierra);
        }
    }

    public final String toString() {
        return this.romeo.toString();
    }
}
