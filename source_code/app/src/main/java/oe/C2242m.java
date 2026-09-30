package oe;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import of.AbstractC2262q;
import pe.InterfaceC2330f;
import s6.AbstractC2643e5;

/* renamed from: oe.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2242m extends AbstractC2262q {
    public final /* synthetic */ String bravo;
    public final /* synthetic */ Ref.ObjectRef charlie;

    public C2242m(String str, Ref.ObjectRef objectRef) {
        this.bravo = str;
        this.charlie = objectRef;
    }

    @Override // of.AbstractC2262q
    public final boolean charlie(Object obj) {
        InterfaceC2330f javaClassDescriptor = (InterfaceC2330f) obj;
        Intrinsics.echo(javaClassDescriptor, "javaClassDescriptor");
        String foxtrot = AbstractC2643e5.foxtrot(javaClassDescriptor, this.bravo);
        boolean contains = C2245p.bravo.contains(foxtrot);
        Ref.ObjectRef objectRef = this.charlie;
        if (contains) {
            objectRef.alpha = EnumC2239j.alpha;
        } else if (C2245p.charlie.contains(foxtrot)) {
            objectRef.alpha = EnumC2239j.purple;
        } else if (C2245p.alpha.contains(foxtrot)) {
            objectRef.alpha = EnumC2239j.silver;
        }
        if (objectRef.alpha == null) {
            return true;
        }
        return false;
    }

    @Override // of.AbstractC2262q
    public final Object india() {
        EnumC2239j enumC2239j = (EnumC2239j) this.charlie.alpha;
        if (enumC2239j == null) {
            return EnumC2239j.red;
        }
        return enumC2239j;
    }
}
