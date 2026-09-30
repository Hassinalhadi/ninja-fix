package p1;

import E0.k;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import bv.w;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.google.android.material.internal.s;
import com.zendesk.service.HttpConstants;
import g.C1718a;
import i1.AbstractC1881b;
import j.q;
import j1.AbstractC1933g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import t6.P2;

/* loaded from: classes3.dex */
public abstract class c {
    public static final w alpha = new w(2);
    public static final k bravo = new k(10);

    public static q alpha(Context context, List list) {
        String str;
        Typeface charlie;
        Trace.beginSection(P2.foxtrot("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < list.size(); i4++) {
                d dVar = (d) list.get(i4);
                if (Build.VERSION.SDK_INT >= 31 && (charlie = AbstractC1933g.charlie((str = dVar.echo))) != null && AbstractC1933g.delta(charlie) != null) {
                    arrayList.add(new h[]{new h(str, dVar.foxtrot)});
                } else {
                    ProviderInfo bravo2 = bravo(context.getPackageManager(), dVar, context.getResources());
                    if (bravo2 == null) {
                        return new q();
                    }
                    arrayList.add(charlie(context, dVar, bravo2.authority));
                }
            }
            return new q(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [p1.b, java.lang.Object] */
    public static ProviderInfo bravo(PackageManager packageManager, d dVar, Resources resources) {
        Trace.beginSection(P2.foxtrot("FontProvider.getProvider"));
        try {
            List list = dVar.delta;
            String str = dVar.alpha;
            String str2 = dVar.bravo;
            if (list == null) {
                list = AbstractC1881b.lima(resources, 0);
            }
            ?? obj = new Object();
            obj.alpha = str;
            obj.bravo = str2;
            obj.charlie = list;
            w wVar = alpha;
            ProviderInfo providerInfo = (ProviderInfo) wVar.charlie(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider != null) {
                if (resolveContentProvider.packageName.equals(str2)) {
                    Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        arrayList.add(signature.toByteArray());
                    }
                    k kVar = bravo;
                    Collections.sort(arrayList, kVar);
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i4));
                        Collections.sort(arrayList2, kVar);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i5), (byte[]) arrayList2.get(i5))) {
                                    break;
                                }
                            }
                            wVar.delta(obj, resolveContentProvider);
                            return resolveContentProvider;
                        }
                    }
                    Trace.endSection();
                    return null;
                }
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        } finally {
            Trace.endSection();
        }
    }

    public static h[] charlie(Context context, d dVar, String str) {
        InterfaceC2266a sVar;
        int i4;
        int i5;
        Uri withAppendedId;
        int i10;
        boolean z2;
        Trace.beginSection(P2.foxtrot("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme(Constants.KEY_CONTENT).authority(str).build();
            Uri build2 = new Uri.Builder().scheme(Constants.KEY_CONTENT).authority(str).appendPath(CTVariableUtils.FILE).build();
            if (Build.VERSION.SDK_INT < 24) {
                sVar = new C1718a(context, build);
            } else {
                sVar = new s(context, build);
            }
            Cursor cursor = null;
            try {
                String[] strArr = {Column.ID, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(P2.foxtrot("ContentQueryWrapper.query"));
                try {
                    cursor = sVar.papa(build, strArr, new String[]{dVar.charlie});
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex(Column.ID);
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            if (columnIndex != -1) {
                                i4 = cursor.getInt(columnIndex);
                            } else {
                                i4 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i5 = cursor.getInt(columnIndex4);
                            } else {
                                i5 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                            }
                            Uri uri = withAppendedId;
                            if (columnIndex5 != -1) {
                                i10 = cursor.getInt(columnIndex5);
                            } else {
                                i10 = HttpConstants.HTTP_BAD_REQUEST;
                            }
                            if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            arrayList2.add(new h(uri, i5, i10, z2, i4));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    sVar.close();
                    return (h[]) arrayList.toArray(new h[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                sVar.close();
                throw th;
            }
        } finally {
        }
    }
}
