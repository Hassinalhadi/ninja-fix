package B9;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.widget.TextView;
import com.app.network.network.models.points.PointsTransactionResponse;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class V0 extends U0 {

    /* renamed from: q, reason: collision with root package name */
    public static final SparseIntArray f254q;

    /* renamed from: p, reason: collision with root package name */
    public long f255p;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f254q = sparseIntArray;
        sparseIntArray.put(R.id.ll_date, 8);
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        Date date;
        String str2;
        String str3;
        String str4;
        String str5;
        String string;
        Float f5;
        Date date2;
        V0 v0 = this;
        synchronized (this) {
            j5 = v0.f255p;
            v0.f255p = 0L;
        }
        PointsTransactionResponse pointsTransactionResponse = v0.f250n;
        long j6 = j5 & 6;
        String str6 = null;
        if (j6 != 0) {
            if (pointsTransactionResponse != null) {
                date = pointsTransactionResponse.getExpiresAt();
                date2 = pointsTransactionResponse.getCreatedAt();
                str3 = pointsTransactionResponse.getTransactionTypeTitle();
                str4 = pointsTransactionResponse.getLocalizedNote();
                f5 = pointsTransactionResponse.getAmount();
            } else {
                f5 = null;
                date = null;
                date2 = null;
                str3 = null;
                str4 = null;
            }
            Intrinsics.echo(date2, "<this>");
            str5 = new SimpleDateFormat("dd", Locale.getDefault()).format(date2);
            Intrinsics.delta(str5, "format(...)");
            str2 = new SimpleDateFormat("MM/yyyy", Locale.getDefault()).format(date2);
            Intrinsics.delta(str2, "format(...)");
            if (f5 != null) {
                str6 = f5.toString();
                str = f5.toString();
            } else {
                str = null;
            }
            StringBuilder tango = Q0.c.tango(androidx.appcompat.widget.P0.crimson(str6, " "));
            tango.append(v0.f243g.getResources().getString(R.string.points));
            str6 = tango.toString();
        } else {
            str = null;
            date = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        }
        if (j6 != 0) {
            J2.f.bravo(v0.f243g, str6);
            J2.f.bravo(v0.f244h, str3);
            J2.f.bravo(v0.f245i, str4);
            TextView textView = v0.f246j;
            Intrinsics.echo(textView, "<this>");
            if (date == null) {
                textView.setVisibility(8);
                textView.setText("");
            } else {
                long time = date.getTime() - System.currentTimeMillis();
                long abs = Math.abs(time);
                long j7 = abs / 1000;
                if (j7 < 1) {
                    j7 = 1;
                }
                long j10 = 60;
                long j11 = j7 / j10;
                if (j11 < 1) {
                    j11 = 1;
                }
                long j12 = j11 / j10;
                if (j12 < 1) {
                    j12 = 1;
                }
                long j13 = j12 / 24;
                if (j13 < 1) {
                    j13 = 1;
                }
                Resources resources = textView.getContext().getResources();
                if (time >= 0) {
                    if (abs < 60000) {
                        string = resources.getString(R.string.exp_in_seconds, Long.valueOf(j7));
                    } else if (abs < 3600000) {
                        string = resources.getString(R.string.exp_in_minutes, Long.valueOf(j11));
                    } else if (abs < Constants.ONE_DAY_IN_MILLIS) {
                        string = resources.getString(R.string.exp_in_hours, Long.valueOf(j12));
                    } else if (j13 == 1) {
                        string = resources.getString(R.string.exp_tomorrow);
                    } else {
                        string = resources.getString(R.string.exp_in_days, Long.valueOf(j13));
                    }
                } else if (abs < 60000) {
                    string = resources.getString(R.string.exp_seconds_ago, Long.valueOf(j7));
                } else if (abs < 3600000) {
                    string = resources.getString(R.string.exp_minutes_ago, Long.valueOf(j11));
                } else if (abs < Constants.ONE_DAY_IN_MILLIS) {
                    string = resources.getString(R.string.exp_hours_ago, Long.valueOf(j12));
                } else if (j13 == 1) {
                    string = resources.getString(R.string.exp_yesterday);
                } else {
                    string = resources.getString(R.string.exp_days_ago, Long.valueOf(j13));
                }
                Intrinsics.checkNotNull(string);
                textView.setText(string);
                textView.setVisibility(0);
                v0 = this;
            }
            J2.f.bravo(v0.f247k, str);
            J2.f.bravo(v0.f248l, str2);
            J2.f.bravo(v0.f249m, str5);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f255p != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z1.g
    public final void lima() {
        synchronized (this) {
            this.f255p = 4L;
        }
        oscar();
    }
}
