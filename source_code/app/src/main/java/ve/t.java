package ve;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t extends y implements Ee.e {
    public final Constructor alpha;

    public t(Constructor member) {
        Intrinsics.echo(member, "member");
        this.alpha = member;
    }

    @Override // ve.y
    public final Member bravo() {
        return this.alpha;
    }

    @Override // Ee.e
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.alpha.getTypeParameters();
        Intrinsics.delta(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new ae(typeVariable));
        }
        return arrayList;
    }
}
