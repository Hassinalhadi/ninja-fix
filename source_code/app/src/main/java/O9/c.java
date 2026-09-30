package O9;

import com.google.android.gms.tasks.OnFailureListener;
import com.incognia.Callback;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import vf.C3207k;
import vf.W;
import vg.aq;
import vg.g;

/* loaded from: classes2.dex */
public final class c implements Callback, OnFailureListener, g {
    public final /* synthetic */ C3207k alpha;

    public /* synthetic */ c(C3207k c3207k) {
        this.alpha = c3207k;
    }

    @Override // com.incognia.Callback
    public void onCompleted(Object obj) {
        String str = (String) obj;
        C3207k c3207k = this.alpha;
        c3207k.getClass();
        if (C3207k.yellow.get(c3207k) instanceof W) {
            c3207k.resumeWith(Result.m206constructorimpl(str));
        }
    }

    @Override // vg.g
    public void onFailure(vg.d call, Throwable t5) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(t5, "t");
        Result.Companion companion = Result.INSTANCE;
        this.alpha.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(t5)));
    }

    @Override // vg.g
    public void onResponse(vg.d call, aq aqVar) {
        Intrinsics.echo(call, "call");
        boolean isSuccessful = aqVar.alpha.getIsSuccessful();
        C3207k c3207k = this.alpha;
        if (isSuccessful) {
            Result.Companion companion = Result.INSTANCE;
            c3207k.resumeWith(Result.m206constructorimpl(aqVar.bravo));
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            c3207k.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(new HttpException(aqVar))));
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        Intrinsics.echo(it, "it");
        Result.Companion companion = Result.INSTANCE;
        this.alpha.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(it)));
    }
}
