package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m implements Lazy, Serializable {
    public Function0 alpha;
    public volatile Object purple;
    public final Object red;

    public m(Function0 initializer) {
        Intrinsics.echo(initializer, "initializer");
        this.alpha = initializer;
        this.purple = r.alpha;
        this.red = this;
    }

    @Override // kotlin.Lazy
    public final boolean alpha() {
        if (this.purple != r.alpha) {
            return true;
        }
        return false;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object obj;
        Object obj2 = this.purple;
        r rVar = r.alpha;
        if (obj2 != rVar) {
            return obj2;
        }
        synchronized (this.red) {
            obj = this.purple;
            if (obj == rVar) {
                Function0 function0 = this.alpha;
                Intrinsics.checkNotNull(function0);
                obj = function0.invoke();
                this.purple = obj;
                this.alpha = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (alpha()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
