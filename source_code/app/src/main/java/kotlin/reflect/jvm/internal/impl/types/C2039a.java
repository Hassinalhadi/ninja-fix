package kotlin.reflect.jvm.internal.impl.types;

import gf.C1791f;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2039a extends p {
    public final ae purple;
    public final ae red;

    public C2039a(ae delegate, ae abbreviation) {
        Intrinsics.echo(delegate, "delegate");
        Intrinsics.echo(abbreviation, "abbreviation");
        this.purple = delegate;
        this.red = abbreviation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae, kotlin.reflect.jvm.internal.impl.types.B
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final C2039a pink(boolean z2) {
        return new C2039a(this.purple.pink(z2), this.red.pink(z2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p, kotlin.reflect.jvm.internal.impl.types.B
    /* renamed from: E, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C2039a purple(C1791f kotlinTypeRefiner) {
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        ae type = this.purple;
        Intrinsics.echo(type, "type");
        ae type2 = this.red;
        Intrinsics.echo(type2, "type");
        return new C2039a(type, type2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: f */
    public final ae white(al newAttributes) {
        Intrinsics.echo(newAttributes, "newAttributes");
        return new C2039a(this.purple.white(newAttributes), this.red);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    public final ae m() {
        return this.purple;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    public final p u(ae aeVar) {
        return new C2039a(aeVar, this.red);
    }
}
