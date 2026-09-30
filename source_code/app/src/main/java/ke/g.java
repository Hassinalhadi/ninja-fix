package ke;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2653f6;

/* loaded from: classes2.dex */
public final class g extends t {
    public final /* synthetic */ int echo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Member member, Type type, Class cls, Type[] typeArr, int i4) {
        super(member, type, cls, typeArr);
        this.echo = i4;
    }

    @Override // ke.InterfaceC2037e
    public final Object call(Object[] args) {
        switch (this.echo) {
            case 0:
                Intrinsics.echo(args, "args");
                AbstractC2653f6.alpha(this, args);
                Constructor constructor = (Constructor) this.alpha;
                T3.b bVar = new T3.b(2);
                bVar.bravo(args);
                bVar.alpha(null);
                ArrayList arrayList = bVar.alpha;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                Intrinsics.echo(args, "args");
                AbstractC2653f6.alpha(this, args);
                return ((Constructor) this.alpha).newInstance(Arrays.copyOf(args, args.length));
        }
    }
}
