package Gc;

import Cb.ad;
import com.app.network.network.models.CreateTicketApiResponse;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.support.ZenDeskChatActivity;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ZenDeskChatActivity purple;

    public /* synthetic */ t(ZenDeskChatActivity zenDeskChatActivity, int i4) {
        this.alpha = i4;
        this.purple = zenDeskChatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer num;
        ZenDeskChatActivity zenDeskChatActivity = this.purple;
        switch (this.alpha) {
            case 0:
                zenDeskChatActivity.f12506O.bravo((List) obj);
                return Unit.INSTANCE;
            case 1:
                String path = (String) obj;
                int i4 = ZenDeskChatActivity.f12498T;
                Intrinsics.echo(path, "path");
                File file = new File(zenDeskChatActivity.getCacheDir(), com.google.android.material.datepicker.j.kilo("samurai_", System.currentTimeMillis(), ".jpg"));
                file.createNewFile();
                L9.d.crimson(zenDeskChatActivity, path, new ad(7, file, zenDeskChatActivity), 720);
                return Unit.INSTANCE;
            default:
                C2492a c2492a = (C2492a) obj;
                int i5 = ZenDeskChatActivity.f12498T;
                int i10 = c2492a.alpha;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            zenDeskChatActivity.bronze();
                        }
                    } else {
                        zenDeskChatActivity.tango();
                        zenDeskChatActivity.gold();
                        CreateTicketApiResponse createTicketApiResponse = (CreateTicketApiResponse) c2492a.charlie;
                        if (createTicketApiResponse != null) {
                            num = createTicketApiResponse.getId();
                        } else {
                            num = null;
                        }
                        zenDeskChatActivity.f12503L = String.valueOf(num);
                        zenDeskChatActivity.setResult(-1);
                        zenDeskChatActivity.finish();
                        L9.d.peach(R.string.notified_message, zenDeskChatActivity);
                    }
                } else {
                    zenDeskChatActivity.tango();
                    String str = c2492a.bravo;
                    if (str != null) {
                        L9.d.pink(zenDeskChatActivity, str);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
