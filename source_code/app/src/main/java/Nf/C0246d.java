package Nf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: Nf.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0246d extends r {
    public final /* synthetic */ int bravo;
    public final al charlie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0246d(KSerializer eSerializer, int i4) {
        super(eSerializer);
        this.bravo = i4;
        switch (i4) {
            case 1:
                Intrinsics.echo(eSerializer, "eSerializer");
                super(eSerializer);
                SerialDescriptor elementDesc = eSerializer.getDescriptor();
                Intrinsics.echo(elementDesc, "elementDesc");
                this.charlie = new C0245c(elementDesc, 2);
                return;
            case 2:
                Intrinsics.echo(eSerializer, "eSerializer");
                super(eSerializer);
                SerialDescriptor elementDesc2 = eSerializer.getDescriptor();
                Intrinsics.echo(elementDesc2, "elementDesc");
                this.charlie = new C0245c(elementDesc2, 3);
                return;
            default:
                Intrinsics.echo(eSerializer, "element");
                SerialDescriptor elementDesc3 = eSerializer.getDescriptor();
                Intrinsics.echo(elementDesc3, "elementDesc");
                this.charlie = new C0245c(elementDesc3, 1);
                return;
        }
    }

    @Override // Nf.AbstractC0243a
    public final Object alpha() {
        switch (this.bravo) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // Nf.AbstractC0243a
    public final int bravo(Object obj) {
        switch (this.bravo) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                Intrinsics.echo(arrayList, "<this>");
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                Intrinsics.echo(hashSet, "<this>");
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                Intrinsics.echo(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override // Nf.AbstractC0243a
    public final Iterator charlie(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.echo(collection, "<this>");
        return collection.iterator();
    }

    @Override // Nf.AbstractC0243a
    public final int delta(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.echo(collection, "<this>");
        return collection.size();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.bravo) {
            case 0:
                return (C0245c) this.charlie;
            case 1:
                return (C0245c) this.charlie;
            default:
                return (C0245c) this.charlie;
        }
    }

    @Override // Nf.AbstractC0243a
    public final Object golf(Object obj) {
        switch (this.bravo) {
            case 0:
                Intrinsics.echo(null, "<this>");
                return new ArrayList((Collection) null);
            case 1:
                Intrinsics.echo(null, "<this>");
                return new HashSet((Collection) null);
            default:
                Intrinsics.echo(null, "<this>");
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // Nf.AbstractC0243a
    public final Object hotel(Object obj) {
        switch (this.bravo) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                Intrinsics.echo(arrayList, "<this>");
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                Intrinsics.echo(hashSet, "<this>");
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                Intrinsics.echo(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override // Nf.r
    public final void india(int i4, Object obj, Object obj2) {
        switch (this.bravo) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                Intrinsics.echo(arrayList, "<this>");
                arrayList.add(i4, obj2);
                return;
            case 1:
                HashSet hashSet = (HashSet) obj;
                Intrinsics.echo(hashSet, "<this>");
                hashSet.add(obj2);
                return;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                Intrinsics.echo(linkedHashSet, "<this>");
                linkedHashSet.add(obj2);
                return;
        }
    }
}
