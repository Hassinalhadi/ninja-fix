package Kb;

import Yb.C0311j;
import Yb.C0336w;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.Attachment;
import com.app.network.network.models.OrderAsset;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.ReferralResponse;
import com.app.network.network.models.SignUpResponse;
import com.app.network.network.models.captian.Assets;
import com.app.network.network.models.tickets.CommentAttachment;
import com.app.network.network.models.trophies.Trophy;
import com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder;
import com.google.android.gms.internal.measurement.C1298c;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signin.presentation.NafathVerificationActivity;
import delivery.samurai.android.ui.auth.signup.SignUpActivity;
import delivery.samurai.android.ui.referralProgram.ReferYourFriendFragment;
import ga.ar;
import i7.C1901g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qa.C2432a;
import sb.C2844c;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ k(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.red;
        Object obj2 = this.purple;
        switch (this.alpha) {
            case 0:
                l lVar = (l) obj2;
                int adapterPosition = lVar.getAdapterPosition();
                if (adapterPosition != -1) {
                    a aVar = (a) lVar.bravo.getItem(adapterPosition);
                    Intrinsics.checkNotNull(aVar);
                    ((m) obj).alpha.invoke(aVar);
                    return;
                }
                return;
            case 1:
                Context context = ((ConstraintLayout) ((Oc.b) obj2).alpha.purple).getContext();
                Intrinsics.delta(context, "getContext(...)");
                ArrayList azure = CollectionsKt.azure(((CommentAttachment) obj).getFileUrl());
                C3.d dVar = new C3.d(context, new C1298c(azure, new A8.a(25)));
                if (!azure.isEmpty()) {
                    dVar.alpha = true;
                    ((androidx.appcompat.app.g) dVar.red).show();
                    return;
                } else {
                    Log.w(context.getString(R.string.library_name), "Images list cannot be empty! Viewer ignored.");
                    return;
                }
            case 2:
                Context context2 = ((Ub.e) obj2).alpha.red.getContext();
                Intrinsics.delta(context2, "getContext(...)");
                ArrayList azure2 = CollectionsKt.azure(((Attachment) obj).getFileUrl());
                C3.d dVar2 = new C3.d(context2, new C1298c(azure2, new S7.a(3)));
                if (!azure2.isEmpty()) {
                    dVar2.alpha = true;
                    ((androidx.appcompat.app.g) dVar2.red).show();
                    return;
                } else {
                    Log.w(context2.getString(R.string.library_name), "Images list cannot be empty! Viewer ignored.");
                    return;
                }
            case 3:
                Context context3 = ((ConstraintLayout) ((Ub.g) obj2).alpha.alpha).getContext();
                Intrinsics.delta(context3, "getContext(...)");
                ArrayList azure3 = CollectionsKt.azure((String) obj);
                C3.d dVar3 = new C3.d(context3, new C1298c(azure3, new S7.a(4)));
                if (!azure3.isEmpty()) {
                    dVar3.alpha = true;
                    ((androidx.appcompat.app.g) dVar3.red).show();
                    return;
                } else {
                    Log.w(context3.getString(R.string.library_name), "Images list cannot be empty! Viewer ignored.");
                    return;
                }
            case 4:
                ((Ac.g) obj2).invoke();
                ((androidx.appcompat.app.g) obj).dismiss();
                return;
            case 5:
                Context context4 = ((C0311j) obj2).alpha.getContext();
                List juliet = ab.juliet(((OrderAsset) obj).getImageUrl());
                C3.d dVar4 = new C3.d(context4, new C1298c(juliet, new S7.a(7)));
                if (!juliet.isEmpty()) {
                    dVar4.alpha = true;
                    ((androidx.appcompat.app.g) dVar4.red).show();
                    return;
                } else {
                    Log.w(context4.getString(R.string.library_name), "Images list cannot be empty! Viewer ignored.");
                    return;
                }
            case 6:
                Function1 function1 = ((C0336w) obj2).f2441w;
                if (function1 != null) {
                    function1.invoke((OrderTask) obj);
                    return;
                }
                return;
            case 7:
                CTInboxBaseMessageViewHolder.charlie((CTInboxBaseMessageViewHolder) obj2, (Function0) obj, view);
                return;
            case 8:
                ((ar) ((Hc.b) obj2).delta).invoke((Trophy) obj);
                return;
            case 9:
                C1901g c1901g = (C1901g) obj2;
                c1901g.getClass();
                ((View.OnClickListener) obj).onClick(view);
                c1901g.alpha(1);
                return;
            case 10:
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", ((ReferralResponse) obj).getShareMessage());
                intent.setType("text/plain");
                ((ReferYourFriendFragment) obj2).startActivity(Intent.createChooser(intent, null));
                return;
            case 11:
                Context context5 = ((C2432a) obj2).alpha.getContext();
                ArrayList azure4 = CollectionsKt.azure(((Assets) obj).getImageUrl());
                C3.d dVar5 = new C3.d(context5, new C1298c(azure4, new com.google.firebase.messaging.l(16)));
                if (!azure4.isEmpty()) {
                    dVar5.alpha = true;
                    ((androidx.appcompat.app.g) dVar5.red).show();
                    return;
                } else {
                    Log.w(context5.getString(R.string.library_name), "Images list cannot be empty! Viewer ignored.");
                    return;
                }
            case 12:
                int i4 = NafathVerificationActivity.f12165N;
                ((AlertDialog) obj2).dismiss();
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            default:
                int i5 = SignUpActivity.f12184d0;
                SignUpActivity signUpActivity = (SignUpActivity) obj2;
                String string = signUpActivity.getString(R.string.what_went_wrong);
                Intrinsics.delta(string, "getString(...)");
                String reason = ((SignUpResponse) obj).getReason();
                if (reason == null) {
                    reason = "";
                }
                String string2 = signUpActivity.getString(R.string.ok);
                Intrinsics.delta(string2, "getString(...)");
                L9.d.olive(signUpActivity, string, reason, string2, new C2844c(10), null, null, 112);
                return;
        }
    }
}
