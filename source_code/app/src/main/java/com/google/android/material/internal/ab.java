package com.google.android.material.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import bx.C0769g;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j1.C1929c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import k8.C2019a;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.json.JSONException;
import org.json.JSONObject;
import p6.C2280a;
import p7.C2285b;
import s1.InterfaceC2587u;
import s1.X;
import s1.a0;
import t6.l4;
import ye.ae;

/* loaded from: classes2.dex */
public final class ab implements InterfaceC2587u, T5.m, G6.e, vg.f, ae {
    public final /* synthetic */ int alpha;
    public Object purple;
    public Object red;

    @Override // T5.m
    public void accept(Object obj, Object obj2) {
        G6.h hVar = (G6.h) obj2;
        switch (this.alpha) {
            case 6:
                T5.n nVar = new T5.n(hVar);
                p6.ab abVar = (p6.ab) ((p6.y) obj).tango();
                Parcel ivory = abVar.ivory();
                p6.e.bravo(ivory, (PendingIntent) this.purple);
                p6.e.bravo(ivory, (SleepSegmentRequest) this.red);
                ivory.writeStrongBinder(nVar);
                abVar.lavender(ivory, 79);
                return;
            default:
                ((p6.q) obj).bronze((C3.d) this.purple, (LocationRequest) this.red, hVar);
                return;
        }
    }

    @Override // vg.f
    public Object adapt(vg.d dVar) {
        Executor executor = (Executor) this.red;
        if (executor == null) {
            return dVar;
        }
        return new vg.n(executor, dVar);
    }

    public File alpha() {
        if (((File) this.purple) == null) {
            synchronized (this) {
                try {
                    if (((File) this.purple) == null) {
                        B7.g gVar = (B7.g) this.red;
                        gVar.alpha();
                        this.purple = new File(gVar.alpha.getFilesDir(), "PersistedInstallation." + ((B7.g) this.red).delta() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.purple;
    }

    public void bravo(C2019a c2019a) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c2019a.alpha);
            jSONObject.put("Status", av.q.mike(c2019a.bravo));
            jSONObject.put("AuthToken", c2019a.charlie);
            jSONObject.put("RefreshToken", c2019a.delta);
            jSONObject.put("TokenCreationEpochInSecs", c2019a.foxtrot);
            jSONObject.put("ExpiresInSecs", c2019a.echo);
            jSONObject.put("FisError", c2019a.golf);
            B7.g gVar = (B7.g) this.red;
            gVar.alpha();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.alpha.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(alpha())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public C2019a charlie() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        try {
            FileInputStream fileInputStream = new FileInputStream(alpha());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, Http2.INITIAL_MAX_FRAME_SIZE);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i4 = av.q.papa(5)[optInt];
        if (i4 != 0) {
            if (i4 == 0) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new C2019a(optString, i4, optString2, optString3, optLong2, optLong, optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    @Override // s1.InterfaceC2587u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a0 gold(View view, a0 a0Var) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        int i4;
        H3.e eVar = (H3.e) this.red;
        int i5 = eVar.alpha;
        Pf.j jVar = (Pf.j) this.purple;
        X x4 = a0Var.alpha;
        C1929c golf = x4.golf(519);
        C1929c golf2 = x4.golf(32);
        int i10 = golf.bravo;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) jVar.red;
        bottomSheetBehavior.f7890p = i10;
        if (view.getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z13 = bottomSheetBehavior.f7882h;
        if (z13) {
            int alpha = a0Var.alpha();
            bottomSheetBehavior.f7889o = alpha;
            paddingBottom = alpha + eVar.charlie;
        }
        int i11 = eVar.bravo;
        boolean z14 = bottomSheetBehavior.f7883i;
        int i12 = golf.alpha;
        if (z14) {
            if (z2) {
                i4 = i11;
            } else {
                i4 = i5;
            }
            paddingLeft = i4 + i12;
        }
        boolean z15 = bottomSheetBehavior.f7884j;
        int i13 = golf.charlie;
        if (z15) {
            if (!z2) {
                i5 = i11;
            }
            paddingRight = i5 + i13;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (bottomSheetBehavior.f7886l && marginLayoutParams.leftMargin != i12) {
            marginLayoutParams.leftMargin = i12;
            z10 = true;
        } else {
            z10 = false;
        }
        if (bottomSheetBehavior.f7887m && marginLayoutParams.rightMargin != i13) {
            marginLayoutParams.rightMargin = i13;
            z10 = true;
        }
        if (bottomSheetBehavior.f7888n) {
            int i14 = marginLayoutParams.topMargin;
            int i15 = golf.bravo;
            if (i14 != i15) {
                marginLayoutParams.topMargin = i15;
                z11 = true;
                if (z11) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z12 = jVar.purple;
                if (z12) {
                    bottomSheetBehavior.f7880f = golf2.delta;
                }
                if (z13 && !z12) {
                    return a0Var;
                }
                bottomSheetBehavior.zulu();
                return a0Var;
            }
        }
        z11 = z10;
        if (z11) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z12 = jVar.purple;
        if (z12) {
        }
        if (z13) {
        }
        bottomSheetBehavior.zulu();
        return a0Var;
    }

    @Override // G6.e
    public void onComplete(Task task) {
        C2285b c2285b = (C2285b) this.purple;
        G6.h hVar = (G6.h) this.red;
        synchronized (c2285b.foxtrot) {
            c2285b.echo.remove(hVar);
        }
    }

    @Override // vg.f
    public Type responseType() {
        return (Type) this.purple;
    }

    public /* synthetic */ ab(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    public /* synthetic */ ab(C2280a c2280a, PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest) {
        this.alpha = 6;
        this.purple = pendingIntent;
        this.red = sleepSegmentRequest;
    }

    public ab(com.bumptech.glide.load.engine.h hVar) {
        this.alpha = 11;
        this.red = new Object();
        this.purple = hVar;
        l4.bravo();
    }

    public ab(Context context, String str) {
        this.alpha = 13;
        this.red = str;
        this.purple = context.getApplicationContext().getSharedPreferences("UserInfo_secure", 0).edit();
    }

    public ab(eg.a _koin) {
        this.alpha = 5;
        Intrinsics.echo(_koin, "_koin");
        this.purple = _koin;
        this.red = new ArrayList();
    }

    public ab(B7.g gVar) {
        this.alpha = 3;
        this.red = gVar;
    }

    public ab(Map map) {
        this.alpha = 14;
        this.purple = map;
        this.red = new ff.l("Java nullability annotation states").delta(new C0769g(27, this));
    }

    public ab(String[] tables, xf.e eVar) {
        this.alpha = 4;
        this.red = eVar;
        this.alpha = 4;
        Intrinsics.echo(tables, "tables");
        this.purple = tables;
    }

    public ab(ArrayList arrayList, ArrayList arrayList2) {
        this.alpha = 2;
        int size = arrayList.size();
        this.purple = new int[size];
        this.red = new float[size];
        for (int i4 = 0; i4 < size; i4++) {
            ((int[]) this.purple)[i4] = ((Integer) arrayList.get(i4)).intValue();
            ((float[]) this.red)[i4] = ((Float) arrayList2.get(i4)).floatValue();
        }
    }

    public ab(int i4, int i5) {
        this.alpha = 2;
        this.purple = new int[]{i4, i5};
        this.red = new float[]{0.0f, 1.0f};
    }

    public ab(int i4, int i5, int i10) {
        this.alpha = 2;
        this.purple = new int[]{i4, i5, i10};
        this.red = new float[]{0.0f, 0.5f, 1.0f};
    }
}
