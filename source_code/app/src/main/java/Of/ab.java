package Of;

import Nf.P;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s6.AbstractC2716m6;

/* loaded from: classes2.dex */
public final class ab implements SerialDescriptor {
    public static final ab bravo = new ab();
    public static final String charlie = "kotlinx.serialization.json.JsonObject";
    public final /* synthetic */ Nf.ad alpha;

    public ab() {
        P p4 = P.alpha;
        q qVar = q.alpha;
        SerialDescriptor keyDesc = p4.getDescriptor();
        SerialDescriptor valueDesc = qVar.getDescriptor();
        Intrinsics.echo(keyDesc, "keyDesc");
        Intrinsics.echo(valueDesc, "valueDesc");
        this.alpha = new Nf.ad("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.alpha.getClass();
        return CollectionsKt.emptyList();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        this.alpha.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC2716m6 november() {
        this.alpha.getClass();
        return Lf.l.delta;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String oscar() {
        return charlie;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean papa() {
        this.alpha.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int quebec(String name) {
        Intrinsics.echo(name, "name");
        return this.alpha.quebec(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int romeo() {
        this.alpha.getClass();
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String sierra(int i4) {
        this.alpha.getClass();
        return String.valueOf(i4);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List tango(int i4) {
        return this.alpha.tango(i4);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor uniform(int i4) {
        return this.alpha.uniform(i4);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean victor(int i4) {
        this.alpha.victor(i4);
        return false;
    }
}
