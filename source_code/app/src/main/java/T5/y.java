package T5;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final class y implements G6.e {
    public final e alpha;
    public final int purple;
    public final b red;
    public final long silver;
    public final long teal;

    public y(e eVar, int i4, b bVar, long j5, long j6) {
        this.alpha = eVar;
        this.purple = i4;
        this.red = bVar;
        this.silver = j5;
        this.teal = j6;
    }

    public static ConnectionTelemetryConfiguration alpha(r rVar, V5.e eVar, int i4) {
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration;
        zzk zzkVar = eVar.victor;
        if (zzkVar == null) {
            connectionTelemetryConfiguration = null;
        } else {
            connectionTelemetryConfiguration = zzkVar.silver;
        }
        if (connectionTelemetryConfiguration != null && connectionTelemetryConfiguration.purple) {
            int[] iArr = connectionTelemetryConfiguration.silver;
            int i5 = 0;
            if (iArr == null) {
                int[] iArr2 = connectionTelemetryConfiguration.white;
                if (iArr2 != null) {
                    while (i5 < iArr2.length) {
                        if (iArr2[i5] == i4) {
                            return null;
                        }
                        i5++;
                    }
                }
            } else {
                while (i5 < iArr.length) {
                    if (iArr[i5] != i4) {
                        i5++;
                    }
                }
            }
            if (rVar.romeo < connectionTelemetryConfiguration.teal) {
                return connectionTelemetryConfiguration;
            }
        }
        return null;
    }

    @Override // G6.e
    public final void onComplete(Task task) {
        boolean z2;
        int i4;
        int i5;
        int i10;
        int i11;
        long j5;
        long j6;
        if (this.alpha.bravo()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) V5.l.echo().alpha;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.purple) {
                r rVar = (r) this.alpha.juliet.get(this.red);
                if (rVar != null) {
                    Object obj = rVar.hotel;
                    if (obj instanceof V5.e) {
                        V5.e eVar = (V5.e) obj;
                        boolean z10 = true;
                        int i12 = 0;
                        if (this.silver > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int i13 = eVar.quebec;
                        int i14 = 100;
                        if (rootTelemetryConfiguration != null) {
                            z2 &= rootTelemetryConfiguration.red;
                            int i15 = rootTelemetryConfiguration.silver;
                            int i16 = rootTelemetryConfiguration.teal;
                            i4 = rootTelemetryConfiguration.alpha;
                            if (eVar.victor != null && !eVar.charlie()) {
                                ConnectionTelemetryConfiguration alpha = alpha(rVar, eVar, this.purple);
                                if (alpha != null) {
                                    if (!alpha.red || this.silver <= 0) {
                                        z10 = false;
                                    }
                                    i16 = alpha.teal;
                                    z2 = z10;
                                } else {
                                    return;
                                }
                            }
                            i10 = i15;
                            i5 = i16;
                        } else {
                            i4 = 0;
                            i5 = 100;
                            i10 = 5000;
                        }
                        e eVar2 = this.alpha;
                        int i17 = -1;
                        if (task.juliet()) {
                            i11 = 0;
                        } else {
                            if (!((G6.q) task).delta) {
                                Exception golf = task.golf();
                                if (golf instanceof ApiException) {
                                    Status status = ((ApiException) golf).getStatus();
                                    i14 = status.alpha;
                                    ConnectionResult connectionResult = status.silver;
                                    if (connectionResult != null) {
                                        i12 = connectionResult.purple;
                                        i11 = i14;
                                    }
                                } else {
                                    i11 = 101;
                                    i12 = -1;
                                }
                            }
                            i11 = i14;
                            i12 = -1;
                        }
                        if (z2) {
                            long j7 = this.silver;
                            long j10 = this.teal;
                            long currentTimeMillis = System.currentTimeMillis();
                            i17 = (int) (SystemClock.elapsedRealtime() - j10);
                            j6 = currentTimeMillis;
                            j5 = j7;
                        } else {
                            j5 = 0;
                            j6 = 0;
                        }
                        int i18 = i17;
                        eVar2.getClass();
                        z zVar = new z(new MethodInvocation(this.purple, i11, i12, j5, j6, null, null, i13, i18), i4, i10, i5);
                        com.google.android.gms.internal.measurement.ai aiVar = eVar2.november;
                        aiVar.sendMessage(aiVar.obtainMessage(18, zVar));
                    }
                }
            }
        }
    }
}
