package A0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class i {
    public final Function0 alpha;
    public final Function0 bravo;

    public i(Function0 function0, Function0 function02) {
        this.alpha = function0;
        this.bravo = function02;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.alpha.invoke()).floatValue() + ", maxValue=" + ((Number) this.bravo.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}
