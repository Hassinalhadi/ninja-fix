package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro.raw_signal_providers.file_timestamps.FileTimestamps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "", "", "alpha", "()Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class V1 extends Lambda implements Function0<Map<String, Long[]>> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ W1 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V1(W1 w12) {
        super(0);
        this.alpha = w12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Map<String, Long[]> alpha() {
        Object settopp6481;
        Long[] lArr;
        W1 w12 = this.alpha;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i4 = W1.charlie;
            int i5 = ((i4 ^ 47) + ((i4 & 47) << 1)) % 128;
            List<P28427> list = w12.bravo;
            W1.charlie = (((i5 | 101) << 1) - (i5 ^ 101)) % 128;
            int i10 = red;
            purple = ((i10 ^ 23) + ((i10 & 23) << 1)) % 128;
            for (P28427 p28427 : list) {
                int i11 = purple;
                red = (((i11 | 17) << 1) - (i11 ^ 17)) % 128;
                String valueOf = String.valueOf(p28427.alpha());
                bh bhVar = w12.alpha;
                String vD14832N6715 = p28427.vD14832N6715();
                if (F0.alpha()) {
                    FileTimestamps component5 = bhVar.component5(vD14832N6715);
                    if (component5 != null) {
                        lArr = new Long[]{Long.valueOf(((Long) FileTimestamps.bravo(new Object[]{component5}, C1224j2.alpha(), C1224j2.alpha(), 1844385793, C1224j2.alpha(), C1224j2.alpha(), -1844385793)).longValue()), Long.valueOf(((Long) FileTimestamps.bravo(new Object[]{component5}, C1224j2.alpha(), C1224j2.alpha(), -1003895096, C1224j2.alpha(), C1224j2.alpha(), 1003895097)).longValue()), Long.valueOf(component5.alpha())};
                    } else {
                        lArr = null;
                    }
                    linkedHashMap.put(valueOf, lArr);
                } else {
                    throw new bd(null, null, 3, null);
                }
            }
            settopp6481 = new component8(linkedHashMap);
        } catch (Throwable th) {
            settopp6481 = new setTopP6481(th);
        }
        if (settopp6481 instanceof component8) {
            int i12 = red;
            V v4 = ((component8) settopp6481).component9;
            purple = (i12 + 63) % 128;
            return (Map) v4;
        }
        if (settopp6481 instanceof setTopP6481) {
            int i13 = purple;
            int i14 = (i13 ^ 55) + ((i13 & 55) << 1);
            red = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            throw ((Throwable) ((setTopP6481) settopp6481).vD14832N6715);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Map<String, Long[]> invoke() {
        purple = (red + 57) % 128;
        Map<String, Long[]> alpha = alpha();
        red = (purple + 111) % 128;
        return alpha;
    }
}
