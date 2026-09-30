package Da;

import delivery.samurai.android.ui.auth.signup.step3documents.ShareDocumentsFragment;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.AbstractC3428A;
import yf.L;

/* loaded from: classes2.dex */
public final class g extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ShareDocumentsFragment purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ShareDocumentsFragment shareDocumentsFragment, Nd.c cVar) {
        super(2, cVar);
        this.purple = shareDocumentsFragment;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new g(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            ShareDocumentsFragment shareDocumentsFragment = this.purple;
            L uploadedDocument = shareDocumentsFragment.sierra().getUploadedDocument();
            f fVar = new f(shareDocumentsFragment, null);
            this.alpha = 1;
            if (AbstractC3428A.kilo(uploadedDocument, fVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
