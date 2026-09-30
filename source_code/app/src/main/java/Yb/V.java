package Yb;

import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.agreement.Agreement;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import g1.AbstractC1735d;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class V extends CountDownTimer {
    public final /* synthetic */ int alpha = 2;
    public final /* synthetic */ Object bravo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(W w4) {
        super(5000L, 500L);
        this.bravo = w4;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        String string;
        switch (this.alpha) {
            case 0:
                int i4 = Build.VERSION.SDK_INT;
                W w4 = (W) this.bravo;
                if (i4 >= 24) {
                    ((CircularProgressIndicator) w4.bronze().red).setProgress(100, true);
                } else {
                    ((CircularProgressIndicator) w4.bronze().red).setProgress(100);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new A2.q(21, w4), 500L);
                return;
            case 1:
                ((androidx.compose.runtime.t0) ((ProcessOrderActivityV2) this.bravo).f12422m0).setValue("00:00:00");
                return;
            default:
                Agreement agreement = (Agreement) this.bravo;
                MaterialButton materialButton = agreement.f12125L;
                if (materialButton != null) {
                    materialButton.setBackgroundTintList(AbstractC1735d.charlie(R.color.colorPrimary, agreement));
                    agreement.getClass();
                    MaterialButton materialButton2 = agreement.f12125L;
                    if (materialButton2 != null) {
                        int i5 = agreement.f12128O;
                        ArrayList arrayList = agreement.f12127N;
                        if (arrayList != null) {
                            if (i5 == arrayList.size() - 1) {
                                string = agreement.getString(R.string.i_agree);
                            } else {
                                string = agreement.getString(R.string.next);
                            }
                            materialButton2.setText(string);
                            MaterialButton materialButton3 = agreement.f12125L;
                            if (materialButton3 != null) {
                                materialButton3.setEnabled(true);
                                return;
                            } else {
                                Intrinsics.lima("buttonNext");
                                throw null;
                            }
                        }
                        Intrinsics.lima("agreements");
                        throw null;
                    }
                    Intrinsics.lima("buttonNext");
                    throw null;
                }
                Intrinsics.lima("buttonNext");
                throw null;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j5) {
        String string;
        Object obj = this.bravo;
        switch (this.alpha) {
            case 0:
                int i4 = (int) ((((float) (5000 - j5)) / 5000.0f) * 100);
                W w4 = (W) obj;
                if (Build.VERSION.SDK_INT >= 24) {
                    ((CircularProgressIndicator) w4.bronze().red).setProgress(i4, true);
                    return;
                } else {
                    ((CircularProgressIndicator) w4.bronze().red).setProgress(i4);
                    return;
                }
            case 1:
                androidx.compose.runtime.ax axVar = ((ProcessOrderActivityV2) obj).f12422m0;
                int i5 = (int) (j5 / 1000);
                if (i5 < 0) {
                    i5 = 0;
                }
                ((androidx.compose.runtime.t0) axVar).setValue(String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5 / 3600), Integer.valueOf((i5 % 3600) / 60), Integer.valueOf(i5 % 60)}, 3)));
                return;
            default:
                Agreement agreement = (Agreement) obj;
                MaterialButton materialButton = agreement.f12125L;
                if (materialButton != null) {
                    materialButton.setBackgroundTintList(AbstractC1735d.charlie(R.color.zui_color_disabled, agreement));
                    long j6 = j5 / 1000;
                    MaterialButton materialButton2 = agreement.f12125L;
                    if (materialButton2 != null) {
                        int i10 = agreement.f12128O;
                        ArrayList arrayList = agreement.f12127N;
                        if (arrayList != null) {
                            if (i10 == arrayList.size() - 1) {
                                string = agreement.getString(R.string.i_agree_with_timer, Long.valueOf(j6));
                            } else {
                                string = agreement.getString(R.string.next_with_timer, Long.valueOf(j6));
                            }
                            materialButton2.setText(string);
                            MaterialButton materialButton3 = agreement.f12125L;
                            if (materialButton3 != null) {
                                materialButton3.setEnabled(false);
                                return;
                            } else {
                                Intrinsics.lima("buttonNext");
                                throw null;
                            }
                        }
                        Intrinsics.lima("agreements");
                        throw null;
                    }
                    Intrinsics.lima("buttonNext");
                    throw null;
                }
                Intrinsics.lima("buttonNext");
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(long j5, Agreement agreement) {
        super(j5, 1000L);
        this.bravo = agreement;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(ProcessOrderActivityV2 processOrderActivityV2, long j5) {
        super(j5, 1000L);
        this.bravo = processOrderActivityV2;
    }
}
