package ge;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ae implements TypeVariable, Type {
    public final x alpha;

    public ae(x typeParameter) {
        Intrinsics.echo(typeParameter, "typeParameter");
        this.alpha = typeParameter;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof TypeVariable) && Intrinsics.areEqual(this.alpha.getName(), ((TypeVariable) obj).getName())) {
            getGenericDeclaration();
            throw null;
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        int collectionSizeOrDefault;
        List upperBounds = this.alpha.getUpperBounds();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(upperBounds, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(ah.bravo((w) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError(av.q.echo("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.alpha));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.alpha.getName();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return this.alpha.getName();
    }

    public final int hashCode() {
        this.alpha.getName().getClass();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return this.alpha.getName();
    }
}
