package Yb;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class an implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Map red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ boolean teal;
    public final /* synthetic */ Function0 white;

    public /* synthetic */ an(boolean z2, Map map, int i4, boolean z10, Function0 function0, int i5) {
        this.alpha = i5;
        this.purple = z2;
        this.red = map;
        this.silver = i4;
        this.teal = z10;
        this.white = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function0 function0;
        Function0 function02;
        switch (this.alpha) {
            case 0:
                if (this.purple) {
                    int i4 = this.silver;
                    Integer valueOf = Integer.valueOf(i4);
                    Boolean valueOf2 = Boolean.valueOf(!this.teal);
                    Map map = this.red;
                    map.put(valueOf, valueOf2);
                    if (Intrinsics.areEqual(map.get(Integer.valueOf(i4)), Boolean.TRUE) && (function0 = this.white) != null) {
                        function0.invoke();
                    }
                }
                return Unit.INSTANCE;
            default:
                if (this.purple) {
                    int i5 = this.silver;
                    Integer valueOf3 = Integer.valueOf(i5);
                    Boolean valueOf4 = Boolean.valueOf(!this.teal);
                    Map map2 = this.red;
                    map2.put(valueOf3, valueOf4);
                    if (Intrinsics.areEqual(map2.get(Integer.valueOf(i5)), Boolean.TRUE) && (function02 = this.white) != null) {
                        function02.invoke();
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
