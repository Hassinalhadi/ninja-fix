package L9;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import androidx.fragment.app.ai;
import com.google.firebase.messaging.o;
import g3.C1746g;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ g(o oVar, Function0 function0) {
        this.red = oVar;
        this.purple = function0;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Function0 function0 = this.purple;
        Object obj = this.red;
        switch (this.alpha) {
            case 0:
                if (function0 != null) {
                    function0.invoke();
                }
                LinkedHashMap linkedHashMap = i.alpha;
                ai fragment = (ai) obj;
                Intrinsics.echo(fragment, "fragment");
                i.alpha.remove(fragment);
                return;
            default:
                o oVar = (o) obj;
                O7.l lVar = (O7.l) oVar.delta;
                ObjectAnimator objectAnimator = (ObjectAnimator) lVar.purple;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                lVar.purple = null;
                Function0 function02 = ((C1746g) oVar.bravo).india;
                if (function02 != null) {
                    function02.invoke();
                }
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g(Function0 function0, ai aiVar) {
        this.purple = function0;
        this.red = aiVar;
    }
}
