package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.n2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1240n2 extends Lambda implements Function0<String> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ C1244o2 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240n2(C1244o2 c1244o2) {
        super(0);
        this.alpha = c1244o2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        if (r0.getColumnCount() < 2) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String alpha() {
        String str;
        int i4;
        int i5;
        Cursor query;
        int i10 = purple;
        red = ((i10 & 45) + (i10 | 45)) % 128;
        C1244o2.charlie = (C1244o2.bravo + 29) % 128;
        C1244o2 c1244o2 = this.alpha;
        c1244o2.getClass();
        C1244o2.charlie = (C1244o2.bravo + 23) % 128;
        Uri parse = Uri.parse(AbstractC1239n1.alpha);
        String[] strArr = {"android_id"};
        try {
            ContentResolver contentResolver = c1244o2.alpha;
            Intrinsics.checkNotNull(contentResolver);
            query = contentResolver.query(parse, null, null, strArr, null);
        } catch (Exception unused) {
        }
        if (query == null) {
            int i11 = C1244o2.bravo;
            int i12 = (i11 & 53) + (i11 | 53);
            C1244o2.charlie = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } else {
            if (query.moveToFirst()) {
                int i13 = C1244o2.charlie + 77;
                C1244o2.bravo = i13 % 128;
                if (i13 % 2 != 0) {
                    if (query.getColumnCount() < 4) {
                    }
                    try {
                        str = Long.toHexString(Long.parseLong(query.getString(1)));
                        query.close();
                        int i14 = C1244o2.bravo;
                        C1244o2.charlie = (((i14 | 103) << 1) - (i14 ^ 103)) % 128;
                    } catch (NumberFormatException unused2) {
                        query.close();
                        str = null;
                        i4 = C1244o2.bravo + 21;
                        C1244o2.charlie = i4 % 128;
                        if (i4 % 2 == 0) {
                        }
                        int i15 = C1244o2.charlie;
                        i5 = (i15 & 87) + (i15 | 87);
                        C1244o2.bravo = i5 % 128;
                        if (i5 % 2 == 0) {
                        }
                    }
                    i4 = C1244o2.bravo + 21;
                    C1244o2.charlie = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i16 = 90 / 0;
                    }
                }
                int i152 = C1244o2.charlie;
                i5 = (i152 & 87) + (i152 | 87);
                C1244o2.bravo = i5 % 128;
                if (i5 % 2 == 0) {
                    purple = (red + 7) % 128;
                    return str;
                }
                throw null;
            }
            query.close();
            int i17 = C1244o2.bravo;
            C1244o2.charlie = ((i17 & 61) + (i17 | 61)) % 128;
        }
        str = null;
        int i1522 = C1244o2.charlie;
        i5 = (i1522 & 87) + (i1522 | 87);
        C1244o2.bravo = i5 % 128;
        if (i5 % 2 == 0) {
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        int i4 = red;
        purple = (((i4 | 21) << 1) - (i4 ^ 21)) % 128;
        String alpha = alpha();
        int i5 = purple + 71;
        red = i5 % 128;
        if (i5 % 2 != 0) {
            return alpha;
        }
        throw null;
    }
}
