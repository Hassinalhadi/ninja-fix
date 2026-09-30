package Dc;

import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class q implements InterfaceC3440j {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ComposeView purple;

    public /* synthetic */ q(ComposeView composeView, int i4) {
        this.alpha = i4;
        this.purple = composeView;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        switch (this.alpha) {
            case 0:
                Toast.makeText(this.purple.getContext(), (String) obj, 0).show();
                return Unit.INSTANCE;
            case 1:
                Toast.makeText(this.purple.getContext(), (String) obj, 0).show();
                return Unit.INSTANCE;
            default:
                Toast.makeText(this.purple.getContext(), (String) obj, 0).show();
                return Unit.INSTANCE;
        }
    }
}
