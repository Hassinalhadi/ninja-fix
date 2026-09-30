package Nc;

import Cb.ad;
import android.content.Context;
import androidx.lifecycle.az;
import delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsFragment;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ TicketDetailsFragment purple;

    public /* synthetic */ c(TicketDetailsFragment ticketDetailsFragment, int i4) {
        this.alpha = i4;
        this.purple = ticketDetailsFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                List list = (List) obj;
                Intrinsics.checkNotNull(list);
                TicketDetailsFragment ticketDetailsFragment = this.purple;
                ticketDetailsFragment.f12514j = list;
                ticketDetailsFragment.f12513i.bravo(list);
                ticketDetailsFragment.tango();
                return Unit.INSTANCE;
            case 1:
                int intValue = ((Integer) obj).intValue();
                az azVar = this.purple.romeo().foxtrot;
                List list2 = (List) azVar.getValue();
                if (list2 != null) {
                    list2.remove(intValue);
                } else {
                    list2 = null;
                }
                azVar.postValue(list2);
                return Unit.INSTANCE;
            default:
                String path = (String) obj;
                Intrinsics.echo(path, "path");
                TicketDetailsFragment ticketDetailsFragment2 = this.purple;
                File file = new File(ticketDetailsFragment2.requireContext().getCacheDir(), com.google.android.material.datepicker.j.kilo("samurai_", System.currentTimeMillis(), ".jpg"));
                file.createNewFile();
                Context requireContext = ticketDetailsFragment2.requireContext();
                Intrinsics.delta(requireContext, "requireContext(...)");
                L9.d.crimson(requireContext, path, new ad(16, file, ticketDetailsFragment2), 720);
                return Unit.INSTANCE;
        }
    }
}
