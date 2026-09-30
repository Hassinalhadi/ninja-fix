package kotlin.reflect.jvm.internal.impl.types;

import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import qe.InterfaceC2466b;

/* loaded from: classes2.dex */
public abstract class ae extends B implements p000if.d, p000if.e {
    @Override // kotlin.reflect.jvm.internal.impl.types.B
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public abstract ae pink(boolean z2);

    @Override // kotlin.reflect.jvm.internal.impl.types.B
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public abstract ae white(al alVar);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {Constants.AES_PREFIX, Pe.o.charlie.xray((InterfaceC2466b) it.next(), null), "] "};
            for (int i4 = 0; i4 < 3; i4++) {
                sb2.append(strArr[i4]);
            }
        }
        sb2.append(green());
        if (!cyan().isEmpty()) {
            CollectionsKt.magenta(cyan(), sb2, ", ", "<", ">", null, 112);
        }
        if (indigo()) {
            sb2.append("?");
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
