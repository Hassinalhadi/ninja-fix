package Lb;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final /* synthetic */ class G implements Function0 {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ Function1 purple;
    public final /* synthetic */ String red;

    public /* synthetic */ G(String str, Function1 function1) {
        this.red = str;
        this.purple = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                String obj = StringsKt.b(this.red).toString();
                boolean gray = StringsKt.gray(obj);
                Function1 function1 = this.purple;
                if (gray) {
                    function1.invoke(obj);
                } else if (obj.length() < 12) {
                    function1.invoke(obj);
                } else {
                    function1.invoke(obj);
                }
                return Unit.INSTANCE;
            default:
                this.purple.invoke(this.red);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ G(Function1 function1, String str) {
        this.purple = function1;
        this.red = str;
    }
}
