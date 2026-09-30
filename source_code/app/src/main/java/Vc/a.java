package Vc;

import D0.ak;
import D0.an;
import a0.ao;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;
import androidx.compose.runtime.ax;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2636d7;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ a(long j5, Object obj, Object obj2, int i4) {
        this.alpha = i4;
        this.purple = j5;
        this.red = obj;
        this.silver = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        Spanned fromHtml;
        switch (this.alpha) {
            case 0:
                ak result = (ak) obj;
                Intrinsics.echo(result, "result");
                float f5 = (int) (result.charlie >> 32);
                D0.o oVar = result.bravo;
                if (f5 < oVar.delta) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ax axVar = (ax) this.silver;
                if (!z2 && !oVar.charlie && ((int) (r3 & 4294967295L)) >= oVar.echo) {
                    axVar.setValue(Boolean.TRUE);
                } else {
                    ax axVar2 = (ax) this.red;
                    long delta = AbstractC2636d7.delta(Q0.p.charlie(((an) axVar2.getValue()).alpha.bravo) - 1.0f, 4294967296L);
                    long j5 = this.purple;
                    AbstractC2636d7.alpha(delta, j5);
                    if (Float.compare(Q0.p.charlie(delta), Q0.p.charlie(j5)) >= 0) {
                        axVar2.setValue(an.alpha((an) axVar2.getValue(), 0L, delta, null, null, 0L, 0, 0L, null, null, 16777213));
                    } else {
                        axVar.setValue(Boolean.TRUE);
                    }
                }
                return Unit.INSTANCE;
            default:
                TextView view = (TextView) obj;
                Intrinsics.echo(view, "view");
                view.setTextColor(ao.beige(this.purple));
                view.setTextSize(2, Q0.p.charlie(((an) this.red).alpha.bravo));
                int i4 = Build.VERSION.SDK_INT;
                String str = (String) this.silver;
                if (i4 >= 24) {
                    fromHtml = Html.fromHtml(str, 0);
                } else {
                    fromHtml = Html.fromHtml(str);
                }
                view.setText(fromHtml);
                return Unit.INSTANCE;
        }
    }
}
