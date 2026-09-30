package com.checkout.components.interfaces.model;

import Qd.a;
import androidx.annotation.Keep;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/checkout/components/interfaces/model/GooglePayResponseStatus;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "SUCCESS", "ERROR", "CANCELLED", "TIMEOUT", "Companion", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglePayResponseStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GooglePayResponseStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int code;
    public static final GooglePayResponseStatus SUCCESS = new GooglePayResponseStatus("SUCCESS", 0, 0);
    public static final GooglePayResponseStatus ERROR = new GooglePayResponseStatus("ERROR", 1, 13);
    public static final GooglePayResponseStatus CANCELLED = new GooglePayResponseStatus("CANCELLED", 2, 16);
    public static final GooglePayResponseStatus TIMEOUT = new GooglePayResponseStatus("TIMEOUT", 3, 15);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/interfaces/model/GooglePayResponseStatus$Companion;", "", "", "code", "Lcom/checkout/components/interfaces/model/GooglePayResponseStatus;", "fromCode", "(I)Lcom/checkout/components/interfaces/model/GooglePayResponseStatus;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @Nullable
        public final GooglePayResponseStatus fromCode(int code) {
            Object obj;
            Iterator<E> it = GooglePayResponseStatus.getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((GooglePayResponseStatus) obj).getCode() == code) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (GooglePayResponseStatus) obj;
        }
    }

    private static final /* synthetic */ GooglePayResponseStatus[] $values() {
        return new GooglePayResponseStatus[]{SUCCESS, ERROR, CANCELLED, TIMEOUT};
    }

    static {
        GooglePayResponseStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
        INSTANCE = new Companion(null);
    }

    private GooglePayResponseStatus(String str, int i4, int i5) {
        this.code = i5;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static GooglePayResponseStatus valueOf(String str) {
        return (GooglePayResponseStatus) Enum.valueOf(GooglePayResponseStatus.class, str);
    }

    public static GooglePayResponseStatus[] values() {
        return (GooglePayResponseStatus[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
