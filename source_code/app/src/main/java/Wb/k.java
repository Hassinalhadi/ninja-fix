package Wb;

import B9.AbstractC0028a;
import android.os.CountDownTimer;
import delivery.samurai.android.ui.orders.note.ui.AddressNoteActivity;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k extends CountDownTimer {
    public final /* synthetic */ AddressNoteActivity alpha;
    public final /* synthetic */ String bravo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AddressNoteActivity addressNoteActivity, String str, long j5) {
        super(j5, 1000L);
        this.alpha = addressNoteActivity;
        this.bravo = str;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.alpha.finish();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j5) {
        long j6 = j5 / 1000;
        long j7 = 60;
        long j10 = j6 / j7;
        long j11 = j6 % j7;
        AbstractC0028a abstractC0028a = this.alpha.f12350J;
        if (abstractC0028a != null) {
            abstractC0028a.f308u.setText(this.bravo + " (" + String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j10), Long.valueOf(j11)}, 2)) + ")");
            return;
        }
        Intrinsics.lima("binding");
        throw null;
    }
}
