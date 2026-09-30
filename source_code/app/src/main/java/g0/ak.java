package g0;

import a0.AbstractC0362p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ak extends ai {

    /* renamed from: a, reason: collision with root package name */
    public final float f12636a;
    public final String alpha;

    /* renamed from: b, reason: collision with root package name */
    public final int f12637b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12638c;

    /* renamed from: d, reason: collision with root package name */
    public final float f12639d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f12640f;

    /* renamed from: g, reason: collision with root package name */
    public final float f12641g;
    public final List purple;
    public final int red;
    public final AbstractC0362p silver;
    public final float teal;
    public final AbstractC0362p white;
    public final float yellow;

    public ak(float f5, float f10, float f11, float f12, float f13, float f14, float f15, int i4, int i5, int i10, AbstractC0362p abstractC0362p, AbstractC0362p abstractC0362p2, String str, List list) {
        this.alpha = str;
        this.purple = list;
        this.red = i4;
        this.silver = abstractC0362p;
        this.teal = f5;
        this.white = abstractC0362p2;
        this.yellow = f10;
        this.f12636a = f11;
        this.f12637b = i5;
        this.f12638c = i10;
        this.f12639d = f12;
        this.e = f13;
        this.f12640f = f14;
        this.f12641g = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ak.class == obj.getClass()) {
            ak akVar = (ak) obj;
            if (Intrinsics.areEqual(this.alpha, akVar.alpha) && Intrinsics.areEqual(this.silver, akVar.silver) && this.teal == akVar.teal && Intrinsics.areEqual(this.white, akVar.white) && this.yellow == akVar.yellow && this.f12636a == akVar.f12636a && this.f12637b == akVar.f12637b && this.f12638c == akVar.f12638c && this.f12639d == akVar.f12639d && this.e == akVar.e && this.f12640f == akVar.f12640f && this.f12641g == akVar.f12641g && this.red == akVar.red && Intrinsics.areEqual(this.purple, akVar.purple)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int golf = com.google.android.material.datepicker.j.golf(this.alpha.hashCode() * 31, 31, this.purple);
        int i5 = 0;
        AbstractC0362p abstractC0362p = this.silver;
        if (abstractC0362p != null) {
            i4 = abstractC0362p.hashCode();
        } else {
            i4 = 0;
        }
        int sierra = ao.ad.sierra(this.teal, (golf + i4) * 31, 31);
        AbstractC0362p abstractC0362p2 = this.white;
        if (abstractC0362p2 != null) {
            i5 = abstractC0362p2.hashCode();
        }
        return ao.ad.sierra(this.f12641g, ao.ad.sierra(this.f12640f, ao.ad.sierra(this.e, ao.ad.sierra(this.f12639d, (((ao.ad.sierra(this.f12636a, ao.ad.sierra(this.yellow, (sierra + i5) * 31, 31), 31) + this.f12637b) * 31) + this.f12638c) * 31, 31), 31), 31), 31) + this.red;
    }
}
