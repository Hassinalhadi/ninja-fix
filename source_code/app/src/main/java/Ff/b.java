package Ff;

import G6.e;
import G6.q;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import vf.C3207k;
import vg.aq;
import vg.d;
import vg.g;
import vg.t;

/* loaded from: classes2.dex */
public final class b implements e, OnFailureListener, g {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C3207k purple;

    public /* synthetic */ b(C3207k c3207k, int i4) {
        this.alpha = i4;
        this.purple = c3207k;
    }

    @Override // G6.e
    public void onComplete(Task task) {
        Exception golf = task.golf();
        if (golf == null) {
            if (((q) task).delta) {
                this.purple.delta(null);
                return;
            }
            C3207k c3207k = this.purple;
            Result.Companion companion = Result.INSTANCE;
            c3207k.resumeWith(Result.m206constructorimpl(task.hotel()));
            return;
        }
        C3207k c3207k2 = this.purple;
        Result.Companion companion2 = Result.INSTANCE;
        c3207k2.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(golf)));
    }

    @Override // vg.g
    public void onFailure(d call, Throwable t5) {
        C3207k c3207k = this.purple;
        int i4 = this.alpha;
        Intrinsics.echo(call, "call");
        Intrinsics.echo(t5, "t");
        switch (i4) {
            case 2:
                Result.Companion companion = Result.INSTANCE;
                c3207k.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(t5)));
                return;
            default:
                Result.Companion companion2 = Result.INSTANCE;
                c3207k.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(t5)));
                return;
        }
    }

    @Override // vg.g
    public void onResponse(d call, aq aqVar) {
        C3207k c3207k = this.purple;
        int i4 = this.alpha;
        Intrinsics.echo(call, "call");
        switch (i4) {
            case 2:
                if (aqVar.alpha.getIsSuccessful()) {
                    Object obj = aqVar.bravo;
                    if (obj == null) {
                        Object tag = call.request().tag((Class<? extends Object>) t.class);
                        Intrinsics.checkNotNull(tag);
                        t tVar = (t) tag;
                        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException("Response from " + tVar.alpha.getName() + '.' + tVar.charlie.getName() + " was null but response body type was declared as non-null");
                        Result.Companion companion = Result.INSTANCE;
                        c3207k.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(kotlinNullPointerException)));
                        return;
                    }
                    c3207k.resumeWith(Result.m206constructorimpl(obj));
                    return;
                }
                Result.Companion companion2 = Result.INSTANCE;
                c3207k.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(new HttpException(aqVar))));
                return;
            default:
                c3207k.resumeWith(Result.m206constructorimpl(aqVar));
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        Intrinsics.echo(it, "it");
        Result.Companion companion = Result.INSTANCE;
        this.purple.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(it)));
    }
}
