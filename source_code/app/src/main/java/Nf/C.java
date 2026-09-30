package Nf;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class C implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ C(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.serialization.descriptors.SerialDescriptor, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        switch (this.alpha) {
            case 0:
                int intValue = num.intValue();
                StringBuilder sb2 = new StringBuilder();
                ?? r12 = this.purple;
                sb2.append(r12.sierra(intValue));
                sb2.append(": ");
                sb2.append(r12.uniform(intValue).oscar());
                return sb2.toString();
            default:
                num.intValue();
                return this.purple;
        }
    }
}
