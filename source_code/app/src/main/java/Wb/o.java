package Wb;

import androidx.activity.result.ActivityResult;
import delivery.samurai.android.ui.orders.note.ui.AllAddressNoteActivity;
import delivery.samurai.android.ui.orders.note.vm.AllAddressNoteViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements v2.j, ah.a {
    public final /* synthetic */ AllAddressNoteActivity alpha;

    @Override // ah.a
    public void charlie(Object obj) {
        ActivityResult result = (ActivityResult) obj;
        int i4 = AllAddressNoteActivity.f12362R;
        Intrinsics.echo(result, "result");
        if (result.alpha == -1) {
            AllAddressNoteActivity allAddressNoteActivity = this.alpha;
            ((AllAddressNoteViewModel) allAddressNoteActivity.f12364I.getValue()).alpha(allAddressNoteActivity.f12367L);
        }
    }

    @Override // v2.j
    public void onRefresh() {
        int i4 = AllAddressNoteActivity.f12362R;
        AllAddressNoteActivity allAddressNoteActivity = this.alpha;
        ((AllAddressNoteViewModel) allAddressNoteActivity.f12364I.getValue()).alpha(allAddressNoteActivity.f12367L);
    }
}
