package Re;

import Xe.n;
import gf.C1791f;
import hf.i;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.al;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.y;

/* loaded from: classes2.dex */
public final class a extends ae implements p000if.b {
    public final as purple;
    public final c red;
    public final boolean silver;
    public final al teal;

    public a(as typeProjection, c cVar, boolean z2, al attributes) {
        Intrinsics.echo(typeProjection, "typeProjection");
        Intrinsics.echo(attributes, "attributes");
        this.purple = typeProjection;
        this.red = cVar;
        this.silver = z2;
        this.teal = attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final List cyan() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: d */
    public final ae pink(boolean z2) {
        if (z2 == this.silver) {
            return this;
        }
        return new a(this.purple, this.red, z2, this.teal);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: f */
    public final ae white(al newAttributes) {
        Intrinsics.echo(newAttributes, "newAttributes");
        return new a(this.purple, this.red, this.silver, newAttributes);
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
        return this.silver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final y ivory(C1791f kotlinTypeRefiner) {
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a(this.purple.delta(kotlinTypeRefiner), this.red, this.silver, this.teal);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final n olive() {
        return i.alpha(1, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae, kotlin.reflect.jvm.internal.impl.types.B
    public final B pink(boolean z2) {
        if (z2 == this.silver) {
            return this;
        }
        return new a(this.purple, this.red, z2, this.teal);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.B
    public final B purple(C1791f kotlinTypeRefiner) {
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a(this.purple.delta(kotlinTypeRefiner), this.red, this.silver, this.teal);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Captured(");
        sb2.append(this.purple);
        sb2.append(')');
        if (this.silver) {
            str = "?";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
