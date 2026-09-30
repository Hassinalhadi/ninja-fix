package ke;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2653f6;

/* renamed from: ke.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2038f extends t implements InterfaceC2036d {
    public final /* synthetic */ int echo;
    public final Object foxtrot;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2038f(Constructor constructor, Object obj, int i4) {
        super(constructor, r6, null, (Type[]) r0);
        Object blue;
        this.echo = i4;
        switch (i4) {
            case 1:
                Intrinsics.echo(constructor, "constructor");
                Class declaringClass = constructor.getDeclaringClass();
                Intrinsics.delta(declaringClass, "constructor.declaringClass");
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                Intrinsics.delta(genericParameterTypes, "constructor.genericParameterTypes");
                super(constructor, declaringClass, null, genericParameterTypes);
                this.foxtrot = obj;
                return;
            default:
                Intrinsics.echo(constructor, "constructor");
                Class declaringClass2 = constructor.getDeclaringClass();
                Intrinsics.delta(declaringClass2, "constructor.declaringClass");
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                Intrinsics.delta(genericParameterTypes2, "constructor.genericParameterTypes");
                if (genericParameterTypes2.length <= 2) {
                    blue = new Type[0];
                } else {
                    blue = ArraysKt.blue(1, genericParameterTypes2, genericParameterTypes2.length - 1);
                }
                this.foxtrot = obj;
                return;
        }
    }

    @Override // ke.InterfaceC2037e
    public final Object call(Object[] args) {
        switch (this.echo) {
            case 0:
                Intrinsics.echo(args, "args");
                AbstractC2653f6.alpha(this, args);
                Constructor constructor = (Constructor) this.alpha;
                T3.b bVar = new T3.b(3);
                bVar.alpha(this.foxtrot);
                bVar.bravo(args);
                bVar.alpha(null);
                ArrayList arrayList = bVar.alpha;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                Intrinsics.echo(args, "args");
                AbstractC2653f6.alpha(this, args);
                Constructor constructor2 = (Constructor) this.alpha;
                T3.b bVar2 = new T3.b(2);
                bVar2.alpha(this.foxtrot);
                bVar2.bravo(args);
                ArrayList arrayList2 = bVar2.alpha;
                return constructor2.newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
