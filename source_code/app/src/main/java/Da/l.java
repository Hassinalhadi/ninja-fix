package Da;

import android.content.DialogInterface;
import delivery.samurai.android.ui.auth.signup.SignUpActivity;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements DialogInterface.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function0 purple;

    public /* synthetic */ l(Function0 function0, int i4) {
        this.alpha = i4;
        this.purple = function0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        Function0 function0 = this.purple;
        switch (this.alpha) {
            case 0:
                function0.invoke();
                return;
            case 1:
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 2:
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 3:
                int i5 = ProcessOrderActivityV2.f12378N0;
                function0.invoke();
                return;
            case 4:
                int i10 = SignUpActivity.f12184d0;
                function0.invoke();
                return;
            default:
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
        }
    }
}
