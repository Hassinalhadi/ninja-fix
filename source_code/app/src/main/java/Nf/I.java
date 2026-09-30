package Nf;

import ge.InterfaceC1772d;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import t6.AbstractC3062u;

/* loaded from: classes2.dex */
public final class I extends r {
    public final InterfaceC1772d bravo;
    public final C0245c charlie;

    public I(InterfaceC1772d interfaceC1772d, KSerializer kSerializer) {
        super(kSerializer);
        this.bravo = interfaceC1772d;
        SerialDescriptor elementDesc = kSerializer.getDescriptor();
        Intrinsics.echo(elementDesc, "elementDesc");
        this.charlie = new C0245c(elementDesc, 0);
    }

    @Override // Nf.AbstractC0243a
    public final Object alpha() {
        return new ArrayList();
    }

    @Override // Nf.AbstractC0243a
    public final int bravo(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.echo(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // Nf.AbstractC0243a
    public final Iterator charlie(Object obj) {
        Object[] objArr = (Object[]) obj;
        Intrinsics.echo(objArr, "<this>");
        return kotlin.jvm.internal.x.golf(objArr);
    }

    @Override // Nf.AbstractC0243a
    public final int delta(Object obj) {
        Object[] objArr = (Object[]) obj;
        Intrinsics.echo(objArr, "<this>");
        return objArr.length;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.charlie;
    }

    @Override // Nf.AbstractC0243a
    public final Object golf(Object obj) {
        Intrinsics.echo(null, "<this>");
        ArraysKt.sierra(null);
        throw null;
    }

    @Override // Nf.AbstractC0243a
    public final Object hotel(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.echo(arrayList, "<this>");
        InterfaceC1772d eClass = this.bravo;
        Intrinsics.echo(eClass, "eClass");
        Object newInstance = Array.newInstance((Class<?>) AbstractC3062u.bravo(eClass), arrayList.size());
        Intrinsics.charlie(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) newInstance);
        Intrinsics.delta(array, "toArray(...)");
        return array;
    }

    @Override // Nf.r
    public final void india(int i4, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.echo(arrayList, "<this>");
        arrayList.add(i4, obj2);
    }
}
