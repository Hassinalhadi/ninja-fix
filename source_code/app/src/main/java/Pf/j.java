package Pf;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import androidx.appcompat.app.ak;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0455g;
import androidx.appcompat.widget.C0469n;
import av.C;
import com.google.android.gms.internal.measurement.C1320g1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class j implements Q7.k, ao.w, C {
    public final /* synthetic */ int alpha;
    public boolean purple;
    public final Object red;

    public /* synthetic */ j(int i4, Object obj) {
        this.alpha = i4;
        this.red = obj;
        this.purple = true;
    }

    @Override // Q7.k
    public void alpha(Q7.j jVar, int i4) {
        boolean z2 = this.purple;
        StringBuilder sb2 = (StringBuilder) this.red;
        if (z2) {
            this.purple = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i4);
    }

    @Override // ao.w
    public void bravo(ao.l lVar, boolean z2) {
        C0469n c0469n;
        if (this.purple) {
            return;
        }
        this.purple = true;
        ak akVar = (ak) this.red;
        ActionMenuView actionMenuView = akVar.alpha.alpha.alpha;
        if (actionMenuView != null && (c0469n = actionMenuView.teal) != null) {
            c0469n.golf();
            C0455g c0455g = c0469n.f2913n;
            if (c0455g != null && c0455g.bravo()) {
                c0455g.india.dismiss();
            }
        }
        akVar.bravo.onPanelClosed(108, lVar);
        this.purple = false;
    }

    @Override // av.C
    public void charlie(TotalCaptureResult totalCaptureResult) {
    }

    @Override // av.C
    public void delta(androidx.camera.core.r rVar) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        rVar.echo(key, Float.valueOf(1.0f));
        if (this.purple && Build.VERSION.SDK_INT >= 34) {
            key2 = CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
            rVar.echo(key2, 1);
        }
    }

    @Override // ao.w
    public boolean echo(ao.l lVar) {
        ((ak) this.red).bravo.onMenuOpened(108, lVar);
        return true;
    }

    public boolean foxtrot() {
        return this.purple;
    }

    public boolean golf(CharSequence charSequence, int i4) {
        if (charSequence != null && i4 >= 0 && charSequence.length() - i4 >= 0) {
            if (((q1.f) this.red) == null) {
                return foxtrot();
            }
            char c3 = 2;
            for (int i5 = 0; i5 < i4 && c3 == 2; i5++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i5));
                j jVar = q1.g.alpha;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                c3 = 2;
                                break;
                        }
                    }
                    c3 = 0;
                }
                c3 = 1;
            }
            if (c3 == 0) {
                return true;
            }
            if (c3 == 1) {
                return false;
            }
            return foxtrot();
        }
        throw new IllegalArgumentException();
    }

    public void hotel() {
        this.purple = false;
    }

    public void india(byte b2) {
        ((Fe.c) this.red).quebec(String.valueOf(b2));
    }

    @Override // av.C
    public float juliet() {
        return ((Float) ((Range) this.red).getUpper()).floatValue();
    }

    public void kilo(char c3) {
        Fe.c cVar = (Fe.c) this.red;
        cVar.golf(cVar.purple, 1);
        char[] cArr = (char[]) cVar.red;
        int i4 = cVar.purple;
        cVar.purple = i4 + 1;
        cArr[i4] = c3;
    }

    public void lima(int i4) {
        ((Fe.c) this.red).quebec(String.valueOf(i4));
    }

    public void mike(long j5) {
        ((Fe.c) this.red).quebec(String.valueOf(j5));
    }

    public void november(String v4) {
        Intrinsics.echo(v4, "v");
        ((Fe.c) this.red).quebec(v4);
    }

    public void oscar(short s3) {
        ((Fe.c) this.red).quebec(String.valueOf(s3));
    }

    @Override // av.C
    public float papa() {
        return ((Float) ((Range) this.red).getLower()).floatValue();
    }

    public void quebec(String value) {
        int i4;
        Intrinsics.echo(value, "value");
        Fe.c cVar = (Fe.c) this.red;
        cVar.golf(cVar.purple, value.length() + 2);
        char[] cArr = (char[]) cVar.red;
        int i5 = cVar.purple;
        int i10 = i5 + 1;
        cArr[i5] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i10);
        int i11 = length + i10;
        int i12 = i10;
        while (i12 < i11) {
            char c3 = cArr[i12];
            byte[] bArr = af.bravo;
            if (c3 < bArr.length && bArr[c3] != 0) {
                int length2 = value.length();
                for (int i13 = i12 - i10; i13 < length2; i13++) {
                    cVar.golf(i12, 2);
                    char charAt = value.charAt(i13);
                    byte[] bArr2 = af.bravo;
                    if (charAt < bArr2.length) {
                        byte b2 = bArr2[charAt];
                        if (b2 == 0) {
                            i4 = i12 + 1;
                            ((char[]) cVar.red)[i12] = charAt;
                        } else {
                            if (b2 == 1) {
                                String str = af.alpha[charAt];
                                Intrinsics.checkNotNull(str);
                                cVar.golf(i12, str.length());
                                str.getChars(0, str.length(), (char[]) cVar.red, i12);
                                int length3 = str.length() + i12;
                                cVar.purple = length3;
                                i12 = length3;
                            } else {
                                char[] cArr2 = (char[]) cVar.red;
                                cArr2[i12] = '\\';
                                cArr2[i12 + 1] = (char) b2;
                                i12 += 2;
                                cVar.purple = i12;
                            }
                        }
                    } else {
                        i4 = i12 + 1;
                        ((char[]) cVar.red)[i12] = charAt;
                    }
                    i12 = i4;
                }
                cVar.golf(i12, 1);
                ((char[]) cVar.red)[i12] = '\"';
                cVar.purple = i12 + 1;
                return;
            }
            i12++;
        }
        cArr[i11] = '\"';
        cVar.purple = i11 + 1;
    }

    public synchronized void romeo(com.bumptech.glide.load.engine.w wVar, boolean z2) {
        try {
            if (!this.purple && !z2) {
                this.purple = true;
                wVar.bravo();
                this.purple = false;
            }
            ((Handler) this.red).obtainMessage(1, wVar).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void sierra(boolean z2) {
        if (z2 != this.purple) {
            this.purple = z2;
            if (!z2) {
                synchronized (((ai.a) this.red).alpha) {
                }
            }
        }
    }

    public void tango() {
    }

    public String toString() {
        switch (this.alpha) {
            case 8:
                if (this.purple) {
                    return "FALL_THROUGH";
                }
                return String.valueOf(this.red);
            default:
                return super.toString();
        }
    }

    public void uniform() {
    }

    public C1320g1 victor(long j5, String str) {
        Long valueOf = Long.valueOf(j5);
        Object obj = C1320g1.golf;
        return new C1320g1(this, str, valueOf, 0);
    }

    public C1320g1 whiskey(String str, String str2) {
        Object obj = C1320g1.golf;
        return new C1320g1(this, str, str2, 3);
    }

    @Override // av.C
    public void xray() {
    }

    public C1320g1 yankee(String str, boolean z2) {
        Boolean valueOf = Boolean.valueOf(z2);
        Object obj = C1320g1.golf;
        return new C1320g1(this, str, valueOf, 1);
    }

    public j(Uri uri, boolean z2, boolean z10) {
        this.alpha = 6;
        this.red = uri;
        this.purple = z2;
    }

    public /* synthetic */ j(Object obj, int i4, boolean z2) {
        this.alpha = i4;
        this.red = obj;
    }

    public /* synthetic */ j(Object obj, boolean z2, int i4) {
        this.alpha = i4;
        this.red = obj;
        this.purple = z2;
    }

    public j() {
        this.alpha = 5;
        this.red = new Handler(Looper.getMainLooper(), new com.bumptech.glide.load.engine.z(0));
    }

    public j(androidx.camera.camera2.internal.compat.j jVar) {
        CameraCharacteristics.Key key;
        CameraCharacteristics.Key key2;
        this.alpha = 3;
        boolean z2 = false;
        this.purple = false;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.red = (Range) jVar.alpha(key);
        if (Build.VERSION.SDK_INT >= 34) {
            O7.l lVar = jVar.bravo;
            key2 = CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
            int[] iArr = (int[]) ((CameraCharacteristics) lVar.purple).get(key2);
            if (iArr != null) {
                int length = iArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    if (iArr[i4] == 1) {
                        z2 = true;
                        break;
                    }
                    i4++;
                }
            }
        }
        this.purple = z2;
    }

    public j(av.h hVar, bd.h hVar2) {
        this.alpha = 4;
        this.purple = false;
        this.red = new ai.a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(q1.f fVar, boolean z2) {
        this((Object) fVar, 9, false);
        this.alpha = 9;
        this.purple = z2;
    }
}
