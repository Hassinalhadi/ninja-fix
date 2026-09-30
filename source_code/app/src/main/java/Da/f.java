package Da;

import B9.C;
import android.widget.ImageButton;
import android.widget.ImageView;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signup.step3documents.ShareDocumentsFragment;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s6.AbstractC2643e5;

/* loaded from: classes2.dex */
public final class f extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ ShareDocumentsFragment purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ShareDocumentsFragment shareDocumentsFragment, Nd.c cVar) {
        super(2, cVar);
        this.purple = shareDocumentsFragment;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        f fVar = new f(this.purple, cVar);
        fVar.alpha = obj;
        return fVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((a) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String obj2;
        String str2;
        String obj3;
        String str3;
        String obj4;
        String str4;
        String obj5;
        a aVar = (a) this.alpha;
        Od.a aVar2 = Od.a.alpha;
        ResultKt.alpha(obj);
        ShareDocumentsFragment shareDocumentsFragment = this.purple;
        shareDocumentsFragment.uniform(aVar);
        C romeo = shareDocumentsFragment.romeo();
        Pair pair = aVar.alpha;
        if (pair != null && (str4 = (String) pair.getSecond()) != null && (obj5 = StringsKt.b(str4).toString()) != null) {
            ImageView ivProfilePic = romeo.f93t;
            Intrinsics.delta(ivProfilePic, "ivProfilePic");
            AbstractC2643e5.bravo(ivProfilePic, obj5, R.dimen.spacing_12);
            ImageButton btnClearProfilePic = romeo.f82i;
            Intrinsics.delta(btnClearProfilePic, "btnClearProfilePic");
            btnClearProfilePic.setVisibility(0);
            Intrinsics.delta(ivProfilePic, "ivProfilePic");
            ivProfilePic.setVisibility(0);
        }
        Pair pair2 = aVar.bravo;
        if (pair2 != null && (str3 = (String) pair2.getSecond()) != null && (obj4 = StringsKt.b(str3).toString()) != null) {
            ImageView ivIqamaPic = romeo.f92s;
            Intrinsics.delta(ivIqamaPic, "ivIqamaPic");
            AbstractC2643e5.bravo(ivIqamaPic, obj4, R.dimen.spacing_12);
            ImageButton btnClearIqama = romeo.f81h;
            Intrinsics.delta(btnClearIqama, "btnClearIqama");
            btnClearIqama.setVisibility(0);
            Intrinsics.delta(ivIqamaPic, "ivIqamaPic");
            ivIqamaPic.setVisibility(0);
        }
        Pair pair3 = aVar.charlie;
        if (pair3 != null && (str2 = (String) pair3.getSecond()) != null && (obj3 = StringsKt.b(str2).toString()) != null) {
            ImageView ivDrivingLicense = romeo.f91r;
            Intrinsics.delta(ivDrivingLicense, "ivDrivingLicense");
            AbstractC2643e5.bravo(ivDrivingLicense, obj3, R.dimen.spacing_12);
            ImageButton btnClearDrivingLicense = romeo.f80g;
            Intrinsics.delta(btnClearDrivingLicense, "btnClearDrivingLicense");
            btnClearDrivingLicense.setVisibility(0);
            Intrinsics.delta(ivDrivingLicense, "ivDrivingLicense");
            ivDrivingLicense.setVisibility(0);
        }
        Pair pair4 = aVar.delta;
        if (pair4 != null && (str = (String) pair4.getSecond()) != null && (obj2 = StringsKt.b(str).toString()) != null) {
            ImageView ivCarLicense = romeo.f90q;
            Intrinsics.delta(ivCarLicense, "ivCarLicense");
            AbstractC2643e5.bravo(ivCarLicense, obj2, R.dimen.spacing_12);
            ImageButton btnClearCarLicense = romeo.f79f;
            Intrinsics.delta(btnClearCarLicense, "btnClearCarLicense");
            btnClearCarLicense.setVisibility(0);
            Intrinsics.delta(ivCarLicense, "ivCarLicense");
            ivCarLicense.setVisibility(0);
        }
        return Unit.INSTANCE;
    }
}
