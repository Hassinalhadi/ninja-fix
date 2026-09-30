package gf;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.al;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.as;

/* renamed from: gf.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1793h extends ae implements p000if.b {
    public final int purple;
    public final C1794i red;
    public final B silver;
    public final al teal;
    public final boolean white;
    public final boolean yellow;

    public C1793h(int i4, C1794i constructor, B b2, al attributes, boolean z2, boolean z10) {
        com.google.android.material.datepicker.j.papa(i4, "captureStatus");
        Intrinsics.echo(constructor, "constructor");
        Intrinsics.echo(attributes, "attributes");
        this.purple = i4;
        this.red = constructor;
        this.silver = b2;
        this.teal = attributes;
        this.white = z2;
        this.yellow = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final List cyan() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: d */
    public final ae pink(boolean z2) {
        return new C1793h(this.purple, this.red, this.silver, this.teal, z2, 32);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: f */
    public final ae white(al newAttributes) {
        Intrinsics.echo(newAttributes, "newAttributes");
        return new C1793h(this.purple, this.red, this.silver, newAttributes, this.white, this.yellow);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final al gold() {
        return this.teal;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final ap green() {
        return this.red;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final boolean indigo() {
        return this.white;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.B
    /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C1793h purple(C1791f kotlinTypeRefiner) {
        Xa.f fVar;
        B b2;
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        C1794i c1794i = this.red;
        c1794i.getClass();
        as delta = c1794i.alpha.delta(kotlinTypeRefiner);
        if (c1794i.bravo != null) {
            fVar = new Xa.f(14, c1794i, kotlinTypeRefiner);
        } else {
            fVar = null;
        }
        C1794i c1794i2 = c1794i.charlie;
        if (c1794i2 == null) {
            c1794i2 = c1794i;
        }
        C1794i c1794i3 = new C1794i(delta, fVar, c1794i2, c1794i.delta);
        B b4 = this.silver;
        if (b4 != null) {
            b2 = b4;
        } else {
            b2 = null;
        }
        return new C1793h(this.purple, c1794i3, b2, this.teal, this.white, 32);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final Xe.n olive() {
        return hf.i.alpha(1, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae, kotlin.reflect.jvm.internal.impl.types.B
    public final B pink(boolean z2) {
        return new C1793h(this.purple, this.red, this.silver, this.teal, z2, 32);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1793h(int i4, C1794i c1794i, B b2, al alVar, boolean z2, int i5) {
        this(i4, c1794i, b2, alVar, (i5 & 16) != 0 ? false : z2, false);
        if ((i5 & 8) != 0) {
            al.purple.getClass();
            alVar = al.red;
        }
    }
}
