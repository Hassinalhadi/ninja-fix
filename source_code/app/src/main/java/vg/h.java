package vg;

import retrofit2.HttpException;

/* loaded from: classes2.dex */
public final class h implements g {
    public final /* synthetic */ int alpha;
    public final j purple;

    public /* synthetic */ h(j jVar, int i4) {
        this.alpha = i4;
        this.purple = jVar;
    }

    @Override // vg.g
    public final void onFailure(d dVar, Throwable th) {
        switch (this.alpha) {
            case 0:
                this.purple.completeExceptionally(th);
                return;
            default:
                this.purple.completeExceptionally(th);
                return;
        }
    }

    @Override // vg.g
    public final void onResponse(d dVar, aq aqVar) {
        switch (this.alpha) {
            case 0:
                boolean isSuccessful = aqVar.alpha.getIsSuccessful();
                j jVar = this.purple;
                if (isSuccessful) {
                    jVar.complete(aqVar.bravo);
                    return;
                } else {
                    jVar.completeExceptionally(new HttpException(aqVar));
                    return;
                }
            default:
                this.purple.complete(aqVar);
                return;
        }
    }
}
