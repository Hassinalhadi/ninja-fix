package Gc;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.C0606a;
import androidx.fragment.app.L;
import com.app.network.network.models.Root;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.support.AddSupportTicketActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import t0.A0;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AddSupportTicketActivity purple;

    public /* synthetic */ a(AddSupportTicketActivity addSupportTicketActivity, int i4) {
        this.alpha = i4;
        this.purple = addSupportTicketActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AddSupportTicketActivity addSupportTicketActivity = this.purple;
        switch (this.alpha) {
            case 0:
                C2492a c2492a = (C2492a) obj;
                int i4 = AddSupportTicketActivity.f12493K;
                int i5 = c2492a.alpha;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            addSupportTicketActivity.bronze();
                        }
                    } else {
                        addSupportTicketActivity.tango();
                        List list = (List) c2492a.charlie;
                        if (list == null) {
                            list = CollectionsKt.emptyList();
                        }
                        w.o oVar = addSupportTicketActivity.f12496J;
                        if (oVar != null) {
                            A0 a02 = A0.alpha;
                            ComposeView composeView = (ComposeView) oVar.purple;
                            composeView.setViewCompositionStrategy(a02);
                            composeView.setContent(new P.d(new Cb.a(3, list, addSupportTicketActivity), -530853776, true));
                        } else {
                            Intrinsics.lima("binding");
                            throw null;
                        }
                    }
                } else {
                    addSupportTicketActivity.tango();
                    String str = c2492a.bravo;
                    if (str != null) {
                        L9.d.pink(addSupportTicketActivity, str);
                    }
                }
                return Unit.INSTANCE;
            default:
                Root root = (Root) obj;
                int i10 = AddSupportTicketActivity.f12493K;
                Intrinsics.echo(root, "root");
                L supportFragmentManager = addSupportTicketActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                C0606a c0606a = new C0606a(supportFragmentManager);
                int intExtra = addSupportTicketActivity.getIntent().getIntExtra("ORDER_ID", -1);
                Nc.n nVar = new Nc.n();
                Bundle bundle = new Bundle();
                bundle.putString("root", new com.google.gson.l().india(root));
                bundle.putInt("order_id", intExtra);
                nVar.setArguments(bundle);
                c0606a.delta(R.id.container, nVar, null, 1);
                c0606a.charlie(null);
                c0606a.india();
                return Unit.INSTANCE;
        }
    }
}
