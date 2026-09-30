package Of;

import Nf.C0245c;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s6.AbstractC2716m6;

/* loaded from: classes2.dex */
public final class g implements SerialDescriptor {
    public static final g bravo = new g();
    public static final String charlie = "kotlinx.serialization.json.JsonArray";
    public final /* synthetic */ C0245c alpha;

    public g() {
        SerialDescriptor elementDesc = q.alpha.getDescriptor();
        Intrinsics.echo(elementDesc, "elementDesc");
        this.alpha = new C0245c(elementDesc, 1);
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
        return Lf.l.charlie;
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
        return 1;
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
