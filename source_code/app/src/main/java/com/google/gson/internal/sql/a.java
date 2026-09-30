package com.google.gson.internal.sql;

import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes2.dex */
public final class a extends com.google.gson.internal.bind.b {
    public final /* synthetic */ int charlie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i4, Class cls) {
        super(cls);
        this.charlie = i4;
    }

    @Override // com.google.gson.internal.bind.b
    public final Date bravo(Date date) {
        switch (this.charlie) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
