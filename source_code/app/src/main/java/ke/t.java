package ke;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import s6.AbstractC2653f6;

/* loaded from: classes2.dex */
public abstract class t implements InterfaceC2037e {
    public final Member alpha;
    public final Type bravo;
    public final Class charlie;
    public final List delta;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(Member member, Type type, Class cls, Type[] typeArr) {
        List b2;
        this.alpha = member;
        this.bravo = type;
        this.charlie = cls;
        if (cls != null) {
            T3.b bVar = new T3.b(2);
            bVar.alpha(cls);
            bVar.bravo(typeArr);
            ArrayList arrayList = bVar.alpha;
            b2 = CollectionsKt.listOf(arrayList.toArray(new Type[arrayList.size()]));
        }
        b2 = ArraysKt.b(typeArr);
        this.delta = b2;
    }

    @Override // ke.InterfaceC2037e
    public final List alpha() {
        return this.delta;
    }

    @Override // ke.InterfaceC2037e
    public final Member bravo() {
        return this.alpha;
    }

    public void charlie(Object[] objArr) {
        AbstractC2653f6.alpha(this, objArr);
    }

    public final void delta(Object obj) {
        if (obj != null && this.alpha.getDeclaringClass().isInstance(obj)) {
        } else {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // ke.InterfaceC2037e
    public final Type getReturnType() {
        return this.bravo;
    }
}
