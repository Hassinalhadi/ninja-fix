package g0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ag extends ai implements Iterable, Yd.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f12632a;
    public final String alpha;

    /* renamed from: b, reason: collision with root package name */
    public final List f12633b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f12634c;
    public final float purple;
    public final float red;
    public final float silver;
    public final float teal;
    public final float white;
    public final float yellow;

    public ag(String str, float f5, float f10, float f11, float f12, float f13, float f14, float f15, List list, ArrayList arrayList) {
        this.alpha = str;
        this.purple = f5;
        this.red = f10;
        this.silver = f11;
        this.teal = f12;
        this.white = f13;
        this.yellow = f14;
        this.f12632a = f15;
        this.f12633b = list;
        this.f12634c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof ag)) {
                ag agVar = (ag) obj;
                if (Intrinsics.areEqual(this.alpha, agVar.alpha) && this.purple == agVar.purple && this.red == agVar.red && this.silver == agVar.silver && this.teal == agVar.teal && this.white == agVar.white && this.yellow == agVar.yellow && this.f12632a == agVar.f12632a && Intrinsics.areEqual(this.f12633b, agVar.f12633b) && Intrinsics.areEqual(this.f12634c, agVar.f12634c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f12634c.hashCode() + com.google.android.material.datepicker.j.golf(ao.ad.sierra(this.f12632a, ao.ad.sierra(this.yellow, ao.ad.sierra(this.white, ao.ad.sierra(this.teal, ao.ad.sierra(this.silver, ao.ad.sierra(this.red, ao.ad.sierra(this.purple, this.alpha.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.f12633b);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new M.h(this);
    }
}
