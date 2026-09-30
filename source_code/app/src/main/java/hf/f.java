package hf;

import Xe.n;
import gf.C1791f;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.al;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.y;

/* loaded from: classes2.dex */
public final class f extends ae {

    /* renamed from: a, reason: collision with root package name */
    public final String f12721a;
    public final ap purple;
    public final e red;
    public final h silver;
    public final List teal;
    public final boolean white;
    public final String[] yellow;

    public f(ap apVar, e eVar, h kind, List arguments, boolean z2, String... formatParams) {
        Intrinsics.echo(kind, "kind");
        Intrinsics.echo(arguments, "arguments");
        Intrinsics.echo(formatParams, "formatParams");
        this.purple = apVar;
        this.red = eVar;
        this.silver = kind;
        this.teal = arguments;
        this.white = z2;
        this.yellow = formatParams;
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f12721a = String.format(kind.alpha, Arrays.copyOf(copyOf, copyOf.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final List cyan() {
        return this.teal;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: d */
    public final ae pink(boolean z2) {
        String[] strArr = this.yellow;
        return new f(this.purple, this.red, this.silver, this.teal, z2, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: f */
    public final ae white(al newAttributes) {
        Intrinsics.echo(newAttributes, "newAttributes");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final al gold() {
        al.purple.getClass();
        return al.red;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final ap green() {
        return this.purple;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final boolean indigo() {
        return this.white;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    /* renamed from: ivory */
    public final y purple(C1791f kotlinTypeRefiner) {
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final n olive() {
        return this.red;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.B
    public final B purple(C1791f kotlinTypeRefiner) {
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae, kotlin.reflect.jvm.internal.impl.types.B
    public final B white(al newAttributes) {
        Intrinsics.echo(newAttributes, "newAttributes");
        return this;
    }
}
