package af;

import ae.aj;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.aa;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;
import t6.B2;

/* renamed from: af.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0436g {
    public static final aa alpha = new aa(C0431b.silver);

    public static aj alpha(InterfaceC0581m interfaceC0581m) {
        aj ajVar;
        C0585q c0585q = (C0585q) interfaceC0581m;
        aj ajVar2 = (aj) c0585q.kilo(alpha);
        Object obj = null;
        if (ajVar2 == null) {
            c0585q.purple(544166745);
            View view = (View) c0585q.kilo(AndroidCompositionLocals_androidKt.foxtrot);
            Intrinsics.echo(view, "<this>");
            while (true) {
                if (view != null) {
                    Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                    if (tag instanceof aj) {
                        ajVar = (aj) tag;
                    } else {
                        ajVar = null;
                    }
                    if (ajVar != null) {
                        ajVar2 = ajVar;
                        break;
                    }
                    Object charlie = B2.charlie(view);
                    if (charlie instanceof View) {
                        view = (View) charlie;
                    } else {
                        view = null;
                    }
                } else {
                    ajVar2 = null;
                    break;
                }
            }
            c0585q.quebec(false);
        } else {
            c0585q.purple(544164296);
            c0585q.quebec(false);
        }
        if (ajVar2 == null) {
            c0585q.purple(544168748);
            Context context = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof aj) {
                    obj = context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            aj ajVar3 = (aj) obj;
            c0585q.quebec(false);
            return ajVar3;
        }
        c0585q.purple(544164377);
        c0585q.quebec(false);
        return ajVar2;
    }
}
