package a2;

import Y1.ag;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import delivery.samurai.android.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t6.X2;

/* renamed from: a2.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0391p implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Context purple;

    public /* synthetic */ C0391p(Context context, int i4) {
        this.alpha = i4;
        this.purple = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = this.purple;
        switch (this.alpha) {
            case 0:
                ag alpha = X2.alpha(context);
                alpha.foxtrot((Bundle) obj);
                return alpha;
            default:
                String msg = (String) obj;
                Intrinsics.echo(msg, "msg");
                Toast.makeText(context, context.getString(R.string.camera_initialization_error, msg), 1).show();
                return Unit.INSTANCE;
        }
    }
}
