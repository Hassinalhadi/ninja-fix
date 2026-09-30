package Hc;

import Aa.m;
import Qb.x;
import android.view.View;
import androidx.fragment.app.L;
import com.app.network.network.models.Country;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.Receipt;
import com.app.network.network.models.TaskStatus;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import s1.C2576i;
import x9.InterfaceC3312f;
import za.C3495d;
import zendesk.support.Request;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ c(int i4, int i5, Object obj, Object obj2) {
        this.alpha = i5;
        this.red = obj;
        this.silver = obj2;
        this.purple = i4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.alpha) {
            case 0:
                InterfaceC3312f interfaceC3312f = ((Ca.c) this.red).bravo;
                if (interfaceC3312f != null) {
                    Intrinsics.checkNotNull(view);
                    interfaceC3312f.black(view, this.purple, (Request) this.silver);
                    return;
                }
                return;
            case 1:
                OrderTask orderTask = new OrderTask();
                orderTask.setTaskStatus(TaskStatus.COMPLETED);
                Receipt receipt = new Receipt();
                receipt.setUrl((String) ((g) this.silver).alpha.get(this.purple));
                orderTask.setReceipt(receipt);
                x xVar = new x();
                xVar.f1951u = orderTask;
                xVar.f14101q = true;
                xVar.romeo((L) this.red, "");
                return;
            case 2:
                m mVar = (m) ((k9.d) this.red).delta;
                if (mVar != null) {
                    Intrinsics.checkNotNull(view);
                    mVar.black(view, this.purple, (Country) this.silver);
                    return;
                }
                return;
            default:
                C3495d c3495d = (C3495d) this.red;
                ArrayList arrayList = c3495d.bravo;
                Iterator it = arrayList.iterator();
                int i4 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (!Intrinsics.areEqual(((Country) it.next()).getId(), c3495d.alpha)) {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                    }
                }
                Country country = (Country) this.silver;
                c3495d.alpha = country.getId();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Country country2 = (Country) it2.next();
                    country2.setSelected(Intrinsics.areEqual(country2.getId(), c3495d.alpha));
                }
                c3495d.notifyItemChanged(i4);
                int i5 = this.purple;
                c3495d.notifyItemChanged(i5);
                C2576i c2576i = c3495d.charlie;
                if (c2576i != null) {
                    Intrinsics.checkNotNull(view);
                    c2576i.black(view, i5, country);
                    return;
                }
                return;
        }
    }
}
