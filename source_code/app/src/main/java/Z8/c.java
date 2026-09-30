package Z8;

import android.os.Message;
import android.view.View;
import androidx.appcompat.app.f;
import ao.n;
import com.google.android.material.datepicker.r;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.i;
import com.google.android.material.internal.q;
import delivery.samurai.android.R;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class c implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ c(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        Message message4;
        switch (this.alpha) {
            case 0:
                ((Function0) this.purple).invoke();
                return;
            case 1:
                f fVar = (f) this.purple;
                if (view == fVar.india && (message4 = fVar.kilo) != null) {
                    message = Message.obtain(message4);
                } else if (view == fVar.lima && (message3 = fVar.november) != null) {
                    message = Message.obtain(message3);
                } else if (view == fVar.oscar && (message2 = fVar.quebec) != null) {
                    message = Message.obtain(message2);
                } else {
                    message = null;
                }
                if (message != null) {
                    message.sendToTarget();
                }
                fVar.blue.obtainMessage(1, fVar.bravo).sendToTarget();
                return;
            case 2:
                r rVar = (r) this.purple;
                int i4 = rVar.yellow;
                if (i4 == 2) {
                    rVar.lima(1);
                    rVar.f7989c.announceForAccessibility(rVar.getString(R.string.mtrl_picker_toggled_to_day_selection));
                    return;
                } else {
                    if (i4 == 1) {
                        rVar.lima(2);
                        rVar.f7988b.announceForAccessibility(rVar.getString(R.string.mtrl_picker_toggled_to_year_selection));
                        return;
                    }
                    return;
                }
            default:
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
                q qVar = (q) this.purple;
                i iVar = qVar.teal;
                boolean z2 = true;
                if (iVar != null) {
                    iVar.charlie = true;
                }
                n itemData = navigationMenuItemView.getItemData();
                boolean quebec = qVar.red.quebec(itemData, qVar, 0);
                if (itemData != null && itemData.isCheckable() && quebec) {
                    qVar.teal.bravo(itemData);
                } else {
                    z2 = false;
                }
                i iVar2 = qVar.teal;
                if (iVar2 != null) {
                    iVar2.charlie = false;
                }
                if (z2) {
                    qVar.india();
                    return;
                }
                return;
        }
    }
}
